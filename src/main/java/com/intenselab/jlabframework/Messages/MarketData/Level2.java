package com.intenselab.jlabframework.Messages.MarketData;

/**
 * Created by jerald on 05.11.2016.
 */
public class Level2 extends MarketData {


    public double Price;


    public String Mmid;
    public Level2Side Level2Side;

    /// <summary>
    ///     Gets or sets count of shares in current bid.
    /// </summary>
    public int Shares;
}
