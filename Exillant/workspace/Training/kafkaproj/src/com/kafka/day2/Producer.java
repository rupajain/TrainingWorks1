package com.kafka.day2;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

public class Producer extends Thread {
	private KafkaProducer<Integer, String> producer;

	private String topic;
	private Boolean isAsync;
	private Boolean intruppt;
	private String name;

	public Producer(String topic, Boolean isAsync, String name) {
		this.topic = topic;
		this.isAsync = isAsync;
		intruppt = false;
		this.name = name;
		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers",
				KafkaProperties.KAFKA_SERVER_URL + ":" + KafkaProperties.KAFKA_SERVER_PORT);

		properties.setProperty("client.id", KafkaProperties.CLIENT_ID);

		properties.setProperty("key.serializer", IntegerSerializer.class.getName());
		properties.setProperty("value.serializer", StringSerializer.class.getName());
		producer = new KafkaProducer<>(properties);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		int messageno = 1;
		while (!intruppt) {
			String messageString = "message  " + this.name + "count:  " + messageno;
			if (isAsync) {// asynchronous
				// ProducerRecord<Integer, String> producerRecord = new ProducerRecord<Integer,
				// String>(messageString,
				// this.topic);

				ProducerRecord<Integer, String> producerRecord = new ProducerRecord<Integer, String>(this.topic,
						messageno, messageString);

				long startTime = System.currentTimeMillis();

				producer.send(producerRecord, new ProducerMessageCallable(startTime, messageno, messageString));
			} else {// sysnchronous
				try {
					ProducerRecord<Integer, String> producerRecord = new ProducerRecord<Integer, String>(this.topic,
							messageno, messageString);

					producer.send(producerRecord).get();
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				messageno++;
			}
			

		}
		producer.flush();
		producer.close();
	}

	public void setInterrupt(boolean interrupt) {
		this.intruppt = interrupt;
	}
}
