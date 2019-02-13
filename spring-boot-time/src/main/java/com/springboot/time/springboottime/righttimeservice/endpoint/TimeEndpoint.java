package com.springboot.time.springboottime.righttimeservice.endpoint;


import com.springboot.time.springboottime.righttimeservice.service.TimeService;
import net.user.time_service.FormattedTime;
import net.user.time_service.GetTimeRequest;
import net.user.time_service.GetTimeResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TimeEndpoint {

    private final Logger logger = LogManager.getLogger(TimeEndpoint.class);

    @Autowired
    private TimeService timeService;


    @PayloadRoot(namespace = "http://user.net/time-service",
                localPart ="getTimeRequest")
    @ResponsePayload
    public GetTimeResponse getTimeRequest(@RequestPayload GetTimeRequest request) {
        GetTimeResponse response = new GetTimeResponse();
        response.setTime(timeService.getTime());
        return response;
    }

    public String getTime() {
        String rightTime = timeService.getTime();
        logger.info(rightTime);
        return rightTime;

    }
}
