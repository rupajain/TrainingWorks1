package com.kafka.day2;

public class Client {
	public static void main(String[] args) {
		Boolean isAsync = true;
		Producer producer = new Producer(KafkaProperties.TOPIC2, isAsync, "HELLLLLO");
		producer.start();
		System.out.println("started producer..");

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		producer.setInterrupt(true);
	}

}
