package com.intenselab.jlabframework;

import com.intenselab.jlabframework.Messages.MarketData.Authorization.HandshakeResponse;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.CRC32;

/**
 * Created by jerald on 07.12.2016.
 */
public class PacketHeader implements Serializable {

    public  static final int  HeaderSize=16;


    public static byte[] HeaderFromClass(String className, byte[] serializedMessage)
    {
        byte[] message = new byte[HeaderSize+serializedMessage.length];

        byte[] headerBytes = new byte[HeaderSize];




        CRC32 crc = new CRC32();
        crc.update(className.getBytes());

        PacketHeader header = new PacketHeader();
        header.MessageSize= serializedMessage.length;
        header.MessageType =(int)crc.getValue();

        System.arraycopy(headerBytes,0,message,0,headerBytes.length);
        System.arraycopy(serializedMessage,0,message,headerBytes.length,serializedMessage.length);

        ByteBuffer buf = ByteBuffer.wrap(message);

        buf.order(ByteOrder.BIG_ENDIAN); //???? is it ok?
        buf.position(0);
        buf.putInt(header.MessageType);
        buf.putInt(header.MessageSize);


        return  message;

    }

       /// <summary>
        ///     Represents CRC32 computed sum of message type's name.
        /// </summary>
        public int MessageType;

        /// <summary>
        ///     Size of the message in bytes.
        /// </summary>
        public int MessageSize;

        /// <summary>
        ///     NOT USED NOW.
        ///     Represents some additional information.
        /// </summary>
        long Flags;


}
