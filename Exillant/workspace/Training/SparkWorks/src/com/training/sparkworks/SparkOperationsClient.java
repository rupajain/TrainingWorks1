package com.training.sparkworks;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.hadoop.fs.shell.Count;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;

import com.training.commons.DataSource;
import com.training.commons.SparkConnection;
import com.training.commons.Utilities;

public class SparkOperationsClient {
	public static void main(String[] args) {
		Logger.getLogger("org").setLevel(Level.ERROR);

		Logger.getLogger("akka").setLevel(Level.ERROR);

		JavaSparkContext sparkContext = SparkConnection.getContext();
		// start loading the data
		// 1 load the connection and cache it

		JavaRDD<Integer> collData = DataSource.getCollData();

		System.out.println("total number of records..." + collData.count());

		// 2 load the file and cache it
		JavaRDD<String> autoDataContent = sparkContext.textFile("./data/auto-data.csv");

		// to know number of records

		System.out.println("number of records.." + autoDataContent.count());

		// printing 5 line sof data

		// autoDataContent.take(5).forEach(System.out::println);

		// loading dsata from file

		//Utilities.printStringRDD(autoDataContent, 10);

		// saving RDD's

		//autoDataContent.saveAsTextFile("./data/auto-data-modified.csv");
		
		//spark Transformation 
		//convertion from csv to tsv
		
		
		JavaRDD<String> tsvData=autoDataContent.map(str->str.replace(",", "\t"));
		//Utilities.printStringRDD(tsvData, 10);
		
		
		////filter example
		
		
		
		//to remove header
		
		String header=autoDataContent.first();
		
		JavaRDD<String> autoDataWithoutheader=autoDataContent.filter(s-> !s.equals(header));
//		
//		Utilities.printStringRDD(autoDataWithoutheader, 5);
		
		///only toyota data
		JavaRDD<String> toyotadata=autoDataContent.filter(str->str.contains("toyota"));
		//all toyota cars
		//Utilities.printStringRDD(toyotadata,(int) autoDataContent.count());
		//only 10 toyota cars
		//Utilities.printStringRDD(toyotadata,10);
		
		
		////printing all distinct records
		
		JavaRDD<String> distinctdata=autoDataContent.distinct();
		Utilities.printStringRDD(distinctdata,(int) autoDataContent.count());
		
		///finding numbers only
		//JavaRDD<String> numeraldata=autoDataContent.
		//Utilities.printStringRDD(numeraldata,(int) autoDataContent.count());
	
	//to count number of words in given RDD
		
		
		JavaRDD<String> words=toyotadata.flatMap(new FlatMapFunction<String, String>() {

			@Override
			public Iterator<String> call(String t) throws Exception {
				// TODO Auto-generated method stub
				return Arrays.asList(t.split(",")).iterator();
				
				
			}
			
		});
		
		System.out.println("ToyotaRDD word count.."+words.count());
		//after clensing the data
		
		JavaRDD<String> clenseRDD=autoDataContent.map(new ClenseRDDCars());
		Utilities.printStringRDD(clenseRDD, 5);
		
		
		//set operations
		
		JavaRDD<String> words1=sparkContext.parallelize( 
				Arrays.asList("hello","how","are","you","today")
				);
		JavaRDD<String> words2=sparkContext.parallelize( 
				Arrays.asList("hello","how","wre","yeasterday")
				);
		
		System.out.println("union poeration...");
		Utilities.printStringRDD(words1.union(words2), 9);
		
		System.out.println("intersection poeration...");
		Utilities.printStringRDD(words1.intersection(words2), 9);
				
		///subtraction operation
		Utilities.printStringRDD(words1.subtract(words2), 9);
		
		//find sum of numbers in given RDD
		//
		Integer collDataCount=collData.reduce((x,y)->x+y);
		System.out.println("sum of given integers.."+collDataCount);
		
		
		//
		
//		String header=autoDataContent.first();
//		JavaRDD<String> average=autoDataContent.filter(s-> !s.equals(header)).map(new AverageMilage());
//		Utilities.printStringRDD(average, (int) autoDataContent.count());
//		
//		JavaRDD<Integer> average=autoDataWithoutheader.mapToDouble((new AverageMilage()).;
//		autoDataWithoutheader.mapToDouble(new AverageMilage()).
		
	String tooMPg=	autoDataWithoutheader.reduce(new AverageMilage());
	System.out.println("Average MPG is..."+Integer.valueOf(tooMPg)/autoDataWithoutheader.count());
	}
	
}
