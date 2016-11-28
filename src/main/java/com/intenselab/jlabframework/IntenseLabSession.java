package com.intenselab.jlabframework;

/**
 * Created by jerald on 05.11.2016.
 */
public class IntenseLabSession {


    private boolean IsAuthorized;

    public Boolean TryConnect(String userName, String password, String host, int port)
    {
        Disconnect();

        return true;

    }


    private void Disconnect() {
        IsAuthorized = false;
    }

}
