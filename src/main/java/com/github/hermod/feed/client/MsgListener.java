package com.github.hermod.feed.client;

import com.github.hermod.ser.Msg;


/**
 * MsgListener.
 * 
 * @author anavarro - Nov 27, 2012
 * 
 */
public interface MsgListener extends StatusListener, ErrorListener
{
    //
    boolean onMsg(final String subject, final Msg aMsg, final boolean isPartialMsg, final int... keys);
}
