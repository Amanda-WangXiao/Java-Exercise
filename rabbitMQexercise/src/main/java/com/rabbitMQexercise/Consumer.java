package com.rabbitMQexercise;

import com.rabbitMQexercise.utils.QueueDeclareYUtils;
import com.rabbitMQexercise.utils.RabbitMQUtils;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        Connection conn = RabbitMQUtils.getConnection();
        Channel channel = conn.createChannel();
        channel.queueDeclare(QueueDeclareYUtils.Hello_Queue,false,false,false,null);
        channel.basicConsume(QueueDeclareYUtils.Hello_Queue,false,new Receiver(channel));
    }
}

class Receiver extends DefaultConsumer{
    private Channel channel;

    public Receiver(Channel channel) {
        super(channel);
        this.channel = channel;
    }

    @Override
    public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
//        super.handleDelivery(consumerTag, envelope, properties, body);
        String msg_body = new String(body);
        System.out.println("Receive: "+msg_body);
        channel.basicAck(envelope.getDeliveryTag(),false);
    }
}