package me.j360.kafka.storm.simpletrident;

import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * Package: me.j360.kafka.storm.trident
 * User: min_xu
 * Date: 16/7/29 上午10:47
 * 说明：
 */
public class MessageFormatter implements Formatter {
    public String format(ILoggingEvent event) {
        return event.getFormattedMessage();
    }
}