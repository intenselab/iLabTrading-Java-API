package com.intenselab.jlabframework.Messages.MarketData;

import org.msgpack.annotation.Message;

/**
 * Created by jerald on 05.11.2016.
 */

@Message
public class Print extends MarketData{


    public double Price;
    public int Shares;
    public String Exchange;

    @Override
    public String toString() {
        return "Print:{Symbol},{Time},{Price},{Shares},{Exchange}";
    }
}
