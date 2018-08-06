package com.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

public class StoreImage {
	public static void main(String[] args) throws FileNotFoundException {
		MongoClient mongoClient = new MongoClient("localhost", 27200);

		DB db = mongoClient.getDB("exdb");

		GridFS gfs = new GridFS(db, "myimage");

		String path = "/Users/rupa.j/Desktop/source";

		File folderpath = new File(path);

		
			for (File file : folderpath.listFiles()) {
				InputStream inputStream;

				inputStream = new FileInputStream(file);
				//inputStream = new FileInputStream("/Users/rupa.j/Desktop/source/https___www.techicy.com_wp-content_uploads_2015_01_indian-national-flag.jpg");

				GridFSInputFile picture = gfs.createFile(inputStream, file.getName());
				picture.setMetaData(new BasicDBObject("description", "Image ," + file.getName() + "store in Exilant"));
				picture.save();
			}
		

		mongoClient.close();
	}
}
