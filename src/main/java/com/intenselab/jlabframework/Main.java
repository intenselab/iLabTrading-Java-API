package com.intenselab.jlabframework;

import org.msgpack.MessagePack;
import org.msgpack.template.Templates;
import org.msgpack.type.Value;
import org.msgpack.unpacker.Converter;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


      Test t = new Test();

        IntenseLabSession s= new IntenseLabSession();

        s.TryConnect("some","pwd","host",123);




/*
        try
        {



        MessagePack msgpack = new MessagePack();
// Serialize
        byte[] raw = msgpack.write(t);
            String str = new String(raw, StandardCharsets.US_ASCII);

            System.out.println(str);

        }catch (Exception e)
        {
            System.out.println("EXC");

        }
        */
    }
}
