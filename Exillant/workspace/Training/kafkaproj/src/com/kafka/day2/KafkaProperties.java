package com.kafka.day2;

public interface KafkaProperties {
String TOPIC1="sample-topic";
//String TOPIC2="sample-topic2";

String TOPIC2="sample1";

String KAFKA_SERVER_URL="localhost";
int KAFKA_SERVER_PORT=9092;
int KAFKA_PRODUCER_BUFFER_SIZE=100*1024;
int CONNETION_TIME_OUT=1000*10*10;
String CLIENT_ID="SimpleConsumerDemoClient";
//String KAFKA_PRODUCER_CLIENT_ID="simpleproduserclient";

}
