package com.training;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;

public class GetImages {
	public static void main(String[] args) throws IOException {
		MongoClient mongoClient = new MongoClient("localhost", 27200);

		DB db = mongoClient.getDB("exdb");

		String path = "/Users/rupa.j/Desktop/destination/";
		GridFS gfs = new GridFS(db, "myimage");

		List<GridFSDBFile> list = gfs.find(new BasicDBObject());
		
		for (GridFSDBFile file : list) {
			System.out.println("restored"+path + file.getFilename());
			file.writeTo(path + file.getFilename());
		}
		System.out.println("restored"+path);
		mongoClient.close();
	}

}
