package dev.zhanpon.cameljms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.JmsTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.jms.ConnectionFactory;

@Configuration
public class TransactionConfig {

    @Bean
    public PlatformTransactionManager txManager(ConnectionFactory connectionFactory) {
        return new JmsTransactionManager(connectionFactory);
    }
}
