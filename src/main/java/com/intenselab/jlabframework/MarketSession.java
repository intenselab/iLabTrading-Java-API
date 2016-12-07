package com.intenselab.jlabframework;


import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketAddress;

interface ILabSession
{
    void  TryConnect(String userName, String password, String host, int port) throws IOException;
}

public class MarketSession implements ILabSession
{
    public void TryConnect(String userName, String password, String host, int port) throws IOException {





    }
}
