package com.rabbitMQexercise.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMQUtils {
    private static ConnectionFactory cf = new ConnectionFactory();
    static {
        cf.setHost("127.0.0.1");
        cf.setPort(5672);
        cf.setUsername("guest");
        cf.setPassword("guest");
        cf.setVirtualHost("/test");
    }

    public static Connection getConnection() throws IOException, TimeoutException {
        return cf.newConnection();
    }
}
