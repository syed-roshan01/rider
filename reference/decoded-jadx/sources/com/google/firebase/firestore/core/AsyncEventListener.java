package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import i3.n;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class AsyncEventListener<T> implements EventListener<T> {
    private final EventListener<T> eventListener;
    private final Executor executor;
    private volatile boolean muted = false;

    public AsyncEventListener(Executor executor, EventListener<T> eventListener) {
        this.executor = executor;
        this.eventListener = eventListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$0(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        if (this.muted) {
            return;
        }
        this.eventListener.onEvent(obj, firebaseFirestoreException);
    }

    public void mute() {
        this.muted = true;
    }

    @Override // com.google.firebase.firestore.EventListener
    public void onEvent(T t10, FirebaseFirestoreException firebaseFirestoreException) {
        this.executor.execute(new n(this, t10, firebaseFirestoreException, 1));
    }
}
