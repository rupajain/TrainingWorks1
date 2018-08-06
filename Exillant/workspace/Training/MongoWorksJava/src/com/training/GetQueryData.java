package com.training;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.model.Projections;
import com.mongodb.util.JSON;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;

import java.util.HashMap;
import java.util.Map;

public class GetQueryData {
	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient("localhost", 27200);
		DB db = mongoClient.getDB("exdb");
		DBCollection dbc = db.getCollection("emps");
		DBObject queryCondition = new BasicDBObject("empid", "rupa.jain@gmail.com");
		DBObject sortCondition = new BasicDBObject("empname", -1);

		Map<String, Integer> map = new HashMap<>();
		map.put("empid", 1);
		map.put("empname", 1);
		map.put("_id", 0);

		DBObject projectionfield = new BasicDBObject(map);
		DBCursor dbCursor = dbc.find(queryCondition, projectionfield).sort(sortCondition).limit(2);

		while (dbCursor.hasNext()) {

			DBObject object = dbCursor.next();
			System.out.println(object);
			System.out.println(JSON.serialize(object));

			// System.out.println("emp id..." + object.get("empid"));
			// System.out.println("emp name..." + object.get("empname"));
		}
	}
}
