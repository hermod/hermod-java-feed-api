package com.github.hermod.feed.subscriber;


public interface SubjectsListener { // extends errorListener?

    boolean onSubjects(final String... subjects);
}
