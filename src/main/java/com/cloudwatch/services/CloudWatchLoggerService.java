package com.cloudwatch.services;
import com.amazonaws.services.logs.AWSLogs;
import com.amazonaws.services.logs.model.*;

import java.util.Collections;

public class CloudWatchLoggerService {

    private final String logGroupName;
    private final String logStreamName;
    private final AWSLogs awsLogs;

    public CloudWatchLoggerService(String logGroupName, String logStreamName, AWSLogs awsLogs) {
        this.logGroupName = logGroupName;
        this.logStreamName = logStreamName;
        this.awsLogs = awsLogs;
    }

    public void log(String message) {
        long currentTimeMillis = System.currentTimeMillis();
        InputLogEvent logEvent = new InputLogEvent().withTimestamp(currentTimeMillis).withMessage(message);

        PutLogEventsRequest putLogEventsRequest = new PutLogEventsRequest()
                .withLogGroupName(logGroupName)
                .withLogStreamName(logStreamName)
                .withLogEvents(Collections.singletonList(logEvent));

        awsLogs.putLogEvents(putLogEventsRequest);
    }
}
