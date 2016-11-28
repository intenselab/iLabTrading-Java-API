package com.intenselab.jlabframework.Network;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by jerald on 05.11.2016.
 */
public class BaseTcpClient {

    private Socket socket;
    public void Connect(String host, int port)
    {
        try
        {
            socket = new Socket(host,port);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
