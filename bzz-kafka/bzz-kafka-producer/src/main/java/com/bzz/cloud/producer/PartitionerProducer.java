package com.bzz.cloud.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * @program: bzz-bigdata
 * @description: 自定义分区生产者
 * @author: 624003618@qq.com
 * @create: 2019-12-24 18:15
 */
public class PartitionerProducer {
    public static void main(String[] args) {
        //1,设置kafka生产者配置信息
        Properties prop = new Properties();
        //2,设置kafka集群
        prop.put("bootstrap.servers","192.168.132.150:9092");
        //3,Ack应答级别
        prop.put("acks","all");
        //4,重试次数
        prop.put("retries",1);

        //5,批次大小
        prop.put("batch.size",16384);
        //6,等待时间
        prop.put("linger.ms",1);

        //7,RecordAccumulator缓冲区大小
        prop.put("buffer.memory",33554432);

        //8,指定key和value序列化类型
        prop.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        prop.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        //9,添加自定义分区器
        prop.put("partitioner.class", "com.bzz.cloud.kafka.partitioner.MyPartitioner");


        //创建生产者
        KafkaProducer<String, String> producer = new KafkaProducer<>(prop);

        //发送数据
        for(int i=0;i<100;i++){
            producer.send(new ProducerRecord<String, String>("first",  "CCC","EEE_" + i),(recordMetadata,exception)->{
                System.out.println(recordMetadata.toString());
            });

        }

        //关闭资源
        producer.close();
    }
}
