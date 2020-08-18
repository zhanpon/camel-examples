package dev.zhanpon.cameljms;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PartnerToDB extends RouteBuilder {
    private final PartnerServiceBean partner;

    public PartnerToDB(PartnerServiceBean partner) {
        this.partner = partner;
    }

    @Override
    public void configure() throws Exception {
        from("jms:partners")
                .bean(partner, "toMap")
                .log("${body}")
                .to("sql:INSERT INTO partner_metric (partner_id, time_occurred, status_code, perf_time) VALUES (:#id, :#date, :#code, :#time)");
    }
}
