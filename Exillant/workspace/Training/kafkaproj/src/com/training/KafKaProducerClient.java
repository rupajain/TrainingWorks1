package com.training;

import java.util.Properties;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

//kafka.apache.org/documentation/
public class KafKaProducerClient {
	public static void main(String args[]) {

		System.out.println("hi");
		Properties properties = new Properties();

		// identify the kafka server details

		properties.setProperty("bootstrap.servers", "localhost:9092");

		properties.setProperty("key.serializer", StringSerializer.class.getName());

		properties.setProperty("value.serializer", StringSerializer.class.getName());

		// for ack, retires etc etc
		// when producer sends we can ask for ack

		properties.setProperty("acks", "1");
		properties.setProperty("retries", "3");

		Producer<String, String> producer = new KafkaProducer<String, String>(properties);

		for (int i = 0; i < 10; i++)

		{
			ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>("topicA", "1",
					"Testing msg from java");

			producer.send(producerRecord);
		}
		producer.flush();

		// close the connection

		producer.close();

	}
}