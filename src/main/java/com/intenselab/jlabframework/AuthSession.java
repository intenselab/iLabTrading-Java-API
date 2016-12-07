package com.intenselab.jlabframework;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intenselab.jlabframework.Messages.MarketData.Authorization.HandshakeResponse;

import java.io.*;
import java.net.Socket;
import java.util.zip.CRC32;

/**
 * Created by jerald on 07.12.2016.
 */
public class AuthSession implements ILabSession {
    public void TryConnect(String userName, String password, String host, int port) throws IOException {


        Socket s= new Socket(host,port);
        PrintStream output;
        output = new PrintStream(s.getOutputStream());
        InputStream is = s.getInputStream();

        HandshakeResponse h = new HandshakeResponse();

        byte[] data = Serialize(h);
//        System.out.print(j);
        //output.write(data);
        DataInputStream dis = new DataInputStream(is);
        int x=dis.readInt();


//        dataInStream.readFully(byteBuffer, 0, 4);
  //      return (byteBuffer[3]) << 24 | (byteBuffer[2] & 0xff) << 16 |
    //            (byteBuffer[1] & 0xff) << 8 | (byteBuffer[0] & 0xff);


        int length= dis.readInt();
        long flags = dis.readLong();

        //lb1.trader.intenselab.eu:24010
        //devlab001 dlab001
    }

    private byte[] convertToBytes(Object object) throws IOException {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = new ObjectOutputStream(bos);
         out.writeObject(object);
         return bos.toByteArray();
    }

    private byte[] Serialize(HandshakeResponse h) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            byte[] j=mapper.writeValueAsString(h).getBytes();

            byte[] netPacket=PacketHeader.HeaderFromClass(HandshakeResponse.class.toString(),j);

            return netPacket;


          //  byte[] toSend = convertToBytes(response);




        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;


    }
}
