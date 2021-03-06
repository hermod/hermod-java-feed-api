package com.github.hermod.feed.subscriber;

import com.github.hermod.feed.Status;

/**
 * StatusListener.
 * 
 * @author anavarro - Dec 7, 2012
 * 
 */
public interface StatusListener // extends ErrorListener
{
    /**
     * onStatus.
     * 
     * @param subject
     * @param status
     * @return
     */
    boolean onStatus(final String subject, final Status status);
    //boolean onStatus(final Status status, final String... subject);
}
