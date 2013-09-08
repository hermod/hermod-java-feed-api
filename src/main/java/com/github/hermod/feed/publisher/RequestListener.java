package com.github.hermod.feed.publisher;

import com.github.hermod.ser.Msg;

//TODO Beta
@Deprecated
public interface RequestListener {
    
    /**
     * onRequest.
     *
     * @param subject
     * @param paramMsg
     * @return
     */
    Msg onRequest(final String subject, Msg paramMsg);
    

}
