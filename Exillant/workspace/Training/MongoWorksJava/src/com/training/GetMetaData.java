package com.training;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class GetMetaData {
	public static void main(String[] args) {
		//localhost port 27200
		MongoClient mongoClient=new MongoClient("localhost", 27200);
		System.out.println("connection got to"+mongoClient);
		
		System.out.println("list of dbs from mongo");
	
	
	for(String dbname:mongoClient.getDatabaseNames())
	{
		System.out.println("\t"+ dbname);
		
		
		DB db=mongoClient.getDB(dbname);
		for(String collectionName:db.getCollectionNames())
		{
			System.out.println("\t\t"+collectionName);
			
		}
	}
	}

}
