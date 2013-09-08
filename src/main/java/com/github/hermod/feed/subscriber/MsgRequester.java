package com.github.hermod.feed.subscriber;



/**
 * Requester.
 * 
 * @author anavarro - Nov 27, 2012
 * 
 */
@Deprecated
public interface MsgRequester
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
    //boolean requestCompute(final String subject, final MsgListener msgListener, final Msg param);

}
