package com.training.sparkworks;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;

import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;


import static org.apache.spark.sql.functions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.commons.SparkConnection;
import com.training.commons.Utilities;



public class SparkSQlDemo {
	public static void main(String[] args) {
//		Logger.getLogger("org").setLevel(Level.ERROR);
//
//		Logger.getLogger("akka").setLevel(Level.ERROR);

		JavaSparkContext sparkContext = SparkConnection.getContext();
		SparkSession spSession = SparkConnection.getSession();

		Dataset<Row> empDatafields = spSession.read().json("./data/CustomerData.json");
		empDatafields.show();
		empDatafields.printSchema();

		// data queries

		System.out.println("select demo");

		empDatafields.select(col("name"), col("salary")).show();

		System.out.println("select demo with condition");

		empDatafields.filter(col("gender").equalTo("male")).show();

		System.out.println("aggregate -groupby by gender");
		empDatafields.groupBy(col("gender")).count().show();

		empDatafields.distinct().show();
		// group by deptid , for each department find average salary , max age in each
		// department

		Dataset<Row> summarydata = empDatafields.groupBy(col("deptid")).agg(avg(empDatafields.col("salary")),
				max(empDatafields.col("age")));

		summarydata.show();
		// try with Bean classes

		Department dept1 = new Department(100, "development");
		Department dept2 = new Department(200, "Testing");

		List<Department> deptList = new ArrayList<Department>();
		deptList.add(dept1);
		deptList.add(dept2);

		Dataset<Row> deptDataFields = spSession.createDataFrame(deptList, Department.class);

		System.out.println("Department contents are..");
		deptDataFields.show();

		System.out.println("Join Employee with Dept");

		// Dataset< Row> empdeptJoin=empDatafields.join(deptDataFields);

		Dataset<Row> empdeptJoin = empDatafields.join(deptDataFields, col("deptid").equalTo(col("departmentId")));
		empdeptJoin.show();

		// join emp

		System.out.println("......join with aggregation ");
		empDatafields.filter(col("age").gt(30)).join(deptDataFields, col("deptid").equalTo(col("departmentId")))
				.groupBy(col("deptid")).agg(avg(empDatafields.col("salary")), max(empDatafields.col("age"))).show();

		// to load data from csv
		// Dataset<Row> autoData= spSession.read().csv("./data/auto-data.csv");//without
		// header
		Dataset<Row> autoData = spSession.read().option("header", true).csv("./data/auto-data.csv");
		autoData.show(5);

		// creating RDD with row objects
		Row row1 = RowFactory.create(1, "India", "Bengaluru");
		Row row2 = RowFactory.create(1, "USA", "Reston");
		Row row3 = RowFactory.create(3, "UK", "Steevenscreek");

		List<Row> rList = new ArrayList<>();

		rList.add(row1);
		rList.add(row2);
		rList.add(row3);

		JavaRDD<Row> rowRDD = sparkContext.parallelize(rList);

		StructType schema = DataTypes
				.createStructType(new StructField[] { DataTypes.createStructField("id", DataTypes.IntegerType, false),
						DataTypes.createStructField("country", DataTypes.StringType, false),
						DataTypes.createStructField("city", DataTypes.StringType, false) }

		);

		Dataset<Row> tempDataFields = spSession.createDataFrame(rowRDD, schema);
		tempDataFields.show();

		/// working with csv data, with sql statemnets
		// provided the data is kept in table like format
		// the persistent will be till the end of program
		// meaning temporary

		autoData.createOrReplaceTempView("autos");
		System.out.println("temp tabl;e contents:");
		
		System.out.println("showing all fields with hp greater than 200");
		spSession.sql("select * from autos where hp > 200").show();
/// to find make,maximum of RPM from autos group by make
		
		
		spSession.sql("select make,max(rpm) from autos group by make order by 2").show();
		
		
		//convert dataframe to javarRDD
		JavaRDD<Row> autoRDD=autoData.rdd().toJavaRDD();
		
		
		// 
		Map<String,String> jdbcConnectparams=new HashMap<String,String>();
		jdbcConnectparams.put("url", "jdbc:mysql://localhost:3306/Training");
		jdbcConnectparams.put("driver", "com.mysql.jdbc.Driver");
		jdbcConnectparams.put("dbtable", "employee");
		jdbcConnectparams.put("user", "root");
		jdbcConnectparams.put("password", "root@123");
		
		Dataset<Row> sqlDataFields=spSession.read().format("jdbc").options(jdbcConnectparams).load();
		sqlDataFields.show();
		
		
		
		Utilities.hold();
	}

}
