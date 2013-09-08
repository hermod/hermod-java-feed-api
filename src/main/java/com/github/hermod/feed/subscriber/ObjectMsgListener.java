package com.github.hermod.feed.subscriber;

import com.github.hermod.ser.Msg;

public interface ObjectMsgListener<T> {

    boolean onObjectMsg(final String subject, final T aObjectMsg);
    
}
