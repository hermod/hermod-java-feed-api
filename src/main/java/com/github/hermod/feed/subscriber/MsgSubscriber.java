package com.github.hermod.feed.subscriber;

/**
 * Subscriber.
 * 
 * @author anavarro - Nov 27, 2012
 * 
 */
public interface MsgSubscriber
{

    /**
     * subscribe.
     * 
     * @param subject
     * @param msgListener
     * @return
     */
    boolean subscribeMsg(final String subject, final MsgListener msgListener);
    
    //boolean subscribeMsg(final MsgListener msgListener, final String... subject);
    //boolean subscribeMsg(final MsgListener msgListener, final String subject, final int... keys);
    
    //boolean subscribeMsg(final String subject, final MsgListener msgListener, final int... keys);
    
    /**
     * unsubscribe.
     * 
     * @param subject
     * @param msgListener
     * @return
     */
    boolean unsubscribeMsg(final String subject, final MsgListener msgListener);

    //TODO to add
    //boolean requestAsyncMsg(final String subject, final MsgListener msgListener);
    //boolean requestAsyncMsg(final String subject, final MsgListener msgListener, final Msg paramMsg);
    
    //boolean subscribeSubjects(final SubjectsListener subjectsListener); // regexSubjects
    //boolean unsubscribeSubjects(final SubjectsListener subjectsListener);
    //boolean requestAsyncSubjects(final SubjectsListener subjectsListener); 
    
    
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
    boolean logOn(final String login, final String loginPasswordSha1Hash);

}
