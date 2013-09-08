package com.github.hermod.feed.subscriber;

/**
 * ErrorListener.
 * 
 * @author anavarro - Dec 7, 2012
 * 
 */
public interface ErrorListener
{
    /**
     * onError.
     * 
     * @param subject
     * @param error
     * @return
     */
    boolean onError(final String subject, final String error);
    //boolean onError(final String error, final String... subjects);
}
