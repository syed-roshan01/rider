package com.google.firebase.firestore.remote;

import e8.c2;
import e8.l1;

/* JADX INFO: loaded from: classes.dex */
interface IncomingStreamObserver<RespT> {
    void onClose(c2 c2Var);

    void onHeaders(l1 l1Var);

    void onNext(RespT respt);

    void onOpen();
}
