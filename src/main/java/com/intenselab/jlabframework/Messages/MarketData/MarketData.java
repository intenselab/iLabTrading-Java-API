package com.intenselab.jlabframework.Messages.MarketData;

import org.msgpack.annotation.Message;

import java.util.Date;

/**
 * Created by jerald on 05.11.2016.
 */

@Message
public class MarketData {
    public MarketDataType Type;
    public String Symbol;
    public Date Time;

}
