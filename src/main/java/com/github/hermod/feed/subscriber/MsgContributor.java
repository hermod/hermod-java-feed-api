package com.github.hermod.feed.subscriber;

import com.github.hermod.feed.Status;
import com.github.hermod.ser.Msg;

/**
 * Contributor.
 * 
 * @author anavarro - Nov 28, 2012
 * 
 */
// TODO check if necessary with Publisher (quasi same thing of publisher)
@Deprecated
public interface MsgContributor
{
    
    /**
     * requestAuthorizationToPublish.
     * 
     * @param subject
     * @return
     */
    // Really necessary, contribute 
    //boolean askContribution(final String subject);
    

    boolean contributeMsg(final String aSubject, final Msg aMsg);

    boolean contributeMsg(final String aSubject, final Msg aMsg, final boolean isPartialMsg);

    boolean contributeMsg(final String aSubject, final Msg aMsg, final boolean isPartialMsg, final Status status);
    
    
    /**
     * contributeMsg.
     * 
     * @param subject
     * @param writeIntMapMsg
     * @return
     */
    //boolean contributeMsg(final String subject, final Msg aMsg);
    

    /**
     * contributePartialMsg.
     * 
     * @param subject
     * @param writeIntMapMsg
     * @return
     */
    //boolean contributePartialMsg(final String subject, final Msg aMsg);
    
    
    /**
     * setStatus
     * 
     * @param subject
     * @param status
     * @return
     */
    //boolean setStatus(final String subject, final Status status);
   
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
    
    /**
     * logon.
     * 
     * @param login
     * @param loginPasswordSha1Hash
     * @return
     */
    boolean logon(String login, String loginPasswordSha1Hash);
    
}
