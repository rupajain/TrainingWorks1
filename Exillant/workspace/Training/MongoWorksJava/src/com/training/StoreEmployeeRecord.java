package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class StoreEmployeeRecord {
	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient("localhost", 27200);
		DB db = mongoClient.getDB("exdb");
		DBCollection dbc = db.getCollection("emps");
		
		//first way
		
		
//		DBObject object=new BasicDBObject();
//		object.put("empid", 101);
//		object.put("empname", "kavita");
//		object.put("emialid", "kavita@gmail.com");
//		object.put("empsal", 333443);
//		dbc.save(object);
		
		
		///second way
		
		
//		Map<String, Object> map=new HashMap<>();
//		map.put("empid", 302);
//		map.put("empname", "Rupa");
//		map.put("emailid", "rupa.j@gmail.com");
//		map.put("empsal", 34000);
//		dbc.save(new BasicDBObject(map));
//		
		
		
		//third way
		
//		String jsonString="{empid:400,empname:'Siddhartha',emailid:'s@gmail.com'}";
//		dbc.save((DBObject)JSON.parse(jsonString));
		
		
		
		//fourth way
		
		
		Employee  employee=new Employee();
		employee.setEmpemail("anuj@gmail.com");
		employee.setEmpId(55);
		employee.setEmpName("Anuj");
		employee.setEmpsal(24445);
		
		dbc.save(employee);
		//dbc.insert(employee);
		
		System.out.println("object saved..");
	}
}
