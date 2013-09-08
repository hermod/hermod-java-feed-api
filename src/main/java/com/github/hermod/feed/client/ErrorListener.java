package com.github.hermod.feed.client;

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
}
