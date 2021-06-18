package com.rabbitMQexercise;

import com.rabbitMQexercise.utils.QueueDeclareYUtils;
import com.rabbitMQexercise.utils.RabbitMQUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer {
    public static void main(String[] args) throws IOException, TimeoutException {
        Connection conn = RabbitMQUtils.getConnection();
        Channel channel = conn.createChannel();
        channel.queueDeclare(QueueDeclareYUtils.Hello_Queue,false,false,false,null);
        String msg = "hello world !";

        //第一个空字符串，可定义交换机
        channel.basicPublish("",QueueDeclareYUtils.Hello_Queue,null,msg.getBytes());
        channel.close();
        conn.close();
        System.out.println("---Finish---");
    }
}
