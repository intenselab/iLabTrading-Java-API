package com.intenselab.jlabframework.Messages.MarketData.Authorization;

/**
 * Created by jerald on 07.12.2016.
 */
public class HandshakeResponse {


        public HandshakeResponse()
        {

                PacketSerializer="JsonPacketSerializer";

        }
        /// <summary>
        ///     Represents version of framework wich is used on client side.
        /// </summary>
        public String FrameworkVersion;

        /// <summary>
        ///     Selected compressor.
        /// </summary>
        public String PacketCompressor;

        /// <summary>
        ///     Selected encryptor.
        /// </summary>
        public String PacketEncryptor;

        /// <summary>
        ///     Selected serializer.
        /// </summary>
        public String PacketSerializer;


}
