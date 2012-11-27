package com.github.hermod.feed.client;


/**
 * Requester.
 * 
 * @author anavarro - Nov 27, 2012
 * 
 */
public interface Requester
{

    /**
     * getSnapshot.
     * 
     * @param subject
     * @param msgListener
     * @return
     */
    boolean getSnapshot(final String subject, final MsgListener msgListener);
    
    /**
     * requestCompute.
     * 
     * @param subject
     * @param param
     * @param msgListener
     * @return
     */
    //boolean requestCompute(final String subject, final WriteIntMapMsg param, final MsgListener msgListener);

}
