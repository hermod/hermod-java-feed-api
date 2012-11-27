package com.github.hermod.feed.client;

import com.github.hermod.feed.Status;
import com.github.hermod.ser.intmap.WriteIntMapMsg;

/**
 * Contributor.
 * 
 * @author anavarro - Nov 28, 2012
 * 
 */
public interface Contributor
{
    
    /**
     * requestAuthorizationToPublish.
     * 
     * @param subject
     * @return
     */
    boolean requestAuthorizationToPublish(final String subject);
    
    
    /**
     * publishMsg 
     * 
     * @param subject
     * @param writeIntMapMsg
     * @return
     */
    boolean publishMsg(final String subject, final WriteIntMapMsg writeIntMapMsg);
    
    /**
     * publishPartialMsg
     * 
     * @param subject
     * @param writeIntMapMsg
     * @return
     */
    boolean publishPartialMsg(final String subject, final WriteIntMapMsg writeIntMapMsg);
    
    
    /**
     * setStatus
     * 
     * @param subject
     * @param status
     * @return
     */
    boolean setStatus(final String subject, final Status status);
   
    /**
     * start.
     *
     * @return
     */
    boolean start();
   
    /**
     * stop.
     *
     * @return
     */
    boolean stop();
    
}
