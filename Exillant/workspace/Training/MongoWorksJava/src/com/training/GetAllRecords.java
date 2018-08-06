package com.training;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetAllRecords {
	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient("localhost", 27200);
		DB db = mongoClient.getDB("exdb");
		DBCollection dbc = db.getCollection("emps");
		DBCursor dbCursor = dbc.find();
		while (dbCursor.hasNext()) {
			DBObject object = dbCursor.next();
			System.out.println("emp id..." + object.get("empid"));
			System.out.println("emp name..." + object.get("empName"));
		}
	}
}
