package dev.zhanpon.cameljms;

import org.apache.camel.language.xpath.XPath;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PartnerServiceBean {

    public Map toMap(@XPath("partner/@id") int id,
                     @XPath("partner/date/text()") String date,
                     @XPath("partner/code/text()") int statusCode,
                     @XPath("partner/time/text()") long responseTime) {

        Map map = new HashMap();
        map.put("id", id);
        map.put("date", date);
        map.put("code", statusCode);
        map.put("time", responseTime);
        return map;
    }
}
