package com.training.sparkworks;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class Sample {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String appName = "sampleApp";
		// as of now we got 2 instances of spark or this can be got from remote
		// instances
		String sparkMaster = "local[2]";
		JavaSparkContext spcontext = null;

		SparkConf conf = new SparkConf().setAppName(appName).setMaster(sparkMaster);
		// creating spark context from configuration
		spcontext = new JavaSparkContext(conf);

		// read the file into RDD

		JavaRDD<String> tweetsRDD = spcontext.textFile("./data/movietweets.csv");
		tweetsRDD.take(5).forEach(System.out::println);
		// count number of tweets

		int count = (int) tweetsRDD.count();
		System.out.println("count.." + count);

		JavaRDD<String> upperrCaseRDD = tweetsRDD.map(temp -> temp.toUpperCase());

		upperrCaseRDD.take(10).forEach(System.out::println);

		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println("in loop ");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
