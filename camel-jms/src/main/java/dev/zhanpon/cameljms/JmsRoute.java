package dev.zhanpon.cameljms;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class JmsRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("jms:timer")
                .to("log:dev.zhanpon.cameljms.JmsRoute");
    }
}
