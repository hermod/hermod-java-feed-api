package com.github.hermod.feed.client;

/**
 * Subscriber.
 * 
 * @author anavarro - Nov 27, 2012
 * 
 */
public interface Subscriber
{

    /**
     * subscribe.
     * 
     * @param subject
     * @param msgListener
     * @return
     */
    boolean subscribe(final String subject, final MsgListener msgListener);

    /**
     * unsubscribe.
     * 
     * @param subject
     * @param msgListener
     * @return
     */
    boolean unsubscribe(final String subject, final MsgListener msgListener);

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
