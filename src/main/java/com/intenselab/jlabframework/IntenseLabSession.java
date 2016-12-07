package com.intenselab.jlabframework;

import com.intenselab.jlabframework.Messages.MarketData.MarketData;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerald on 05.11.2016.
 */


interface HelloListener {
    void someoneSaidHello();
}

public class IntenseLabSession {

    private List<HelloListener> listeners = new ArrayList<HelloListener>();
    private boolean IsAuthorized;

    public MarketSession Market;

    public Boolean TryConnect(String userName, String password, String host, int port)
    {
        Disconnect();
        return true;

    }
    private void Disconnect() {
        IsAuthorized = false;
    }

}
