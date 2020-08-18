package dev.zhanpon.cameljms;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class PartnersPublisher implements ApplicationRunner {

    private final JmsTemplate jmsTemplate;

    public PartnersPublisher(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        jmsTemplate.convertAndSend("partners", "<?xml version=\"1.0\"?><partner id=\"123\"><date>201702250815</date><code>200</code><time>3921</time></partner>");
        Thread.sleep(10000);
        jmsTemplate.convertAndSend("partners", "<?xml version=\"1.0\"?><partner id=\"124\"><date>201702250815</date><code>200</code><time>3922</time></partner>");
        Thread.sleep(10000);
        jmsTemplate.convertAndSend("partners", "<?xml version=\"1.0\"?><partner id=\"125\"><date>201702250815</date><code>200</code><time>3924</time></partner>");
    }
}
