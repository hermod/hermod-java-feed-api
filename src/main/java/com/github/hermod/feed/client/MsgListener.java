package com.github.hermod.feed.client;

import com.github.hermod.feed.Status;
import com.github.hermod.ser.intmap.ReadIntMapMsg;

/**
 * MsgListener.
 * 
 * @author anavarro - Nov 27, 2012
 * 
 */
public interface MsgListener
{
    
    /**
     * onMsg.
     * 
     * @param subject
     * @param readIntMapMsg
     * @return
     */
    boolean onMsg(final String subject, final ReadIntMapMsg readIntMapMsg);
    

    /**
     * onError.
     * 
     * @param subject
     * @param error
     * @return
     */
    boolean onError(final String subject, final String error);
    
    /**
     * onStatus.
     * 
     * @param subject
     * @param status
     * @return
     */
    boolean onStatus(final String subject, final Status status);

    
}
