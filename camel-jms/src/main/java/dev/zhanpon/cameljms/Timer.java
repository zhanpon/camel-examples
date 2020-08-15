package dev.zhanpon.cameljms;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Timer {
    private final JmsTemplate jmsTemplate;

    public Timer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Scheduled(fixedRate = 1000)
    public void tick() {
        jmsTemplate.convertAndSend("timer", "hello");
    }
}
