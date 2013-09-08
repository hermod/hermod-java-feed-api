/**
 * 
 */
package com.github.hermod.feed.publisher;

import com.github.hermod.feed.Status;
import com.github.hermod.ser.Msg;



/**
 * Publisher.
 * 
 * @author anavarro - Nov 27, 2012
 * 
 */
//TODO should be in publisher package
public interface MsgPublisher 
{
    boolean publishMsg(final String aSubject, final Msg aMsg);

    boolean publishMsg(final String aSubject, final Msg aMsg, final boolean isPartialMsg);

    boolean publishMsg(final String aSubject, final Msg aMsg, final boolean isPartialMsg, final Status status);
    
    //boolean addRequestListener(final String aSubject, final RequestListener requestListener); 
    
	/**
	 * publishMsg 
	 * 
	 * @param subject
	 * @param writeIntMapMsg
	 * @return
	 */
	//boolean publishMsg(final String subject, final Msg writeIntMapMsg);
	
	/**
	 * publishPartialMsg
	 * 
	 * @param subject
	 * @param writeIntMapMsg
	 * @return
	 */
	//boolean publishPartialMsg(final String subject, final Msg writeIntMapMsg);
	


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
    
    boolean logon(String login, String loginPasswordSha1Hash);

	
	
}
