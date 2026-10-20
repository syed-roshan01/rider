package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream.StreamCallback;
import e8.c2;

/* JADX INFO: loaded from: classes.dex */
public interface Stream<CallbackType extends StreamCallback> {

    public enum State {
        Initial,
        Starting,
        Open,
        Healthy,
        Error,
        Backoff
    }

    public interface StreamCallback {
        void onClose(c2 c2Var);

        void onOpen();
    }

    void inhibitBackoff();

    boolean isOpen();

    boolean isStarted();

    void start();

    void stop();
}
