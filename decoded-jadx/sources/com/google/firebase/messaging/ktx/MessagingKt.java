package com.google.firebase.messaging.ktx;

import c9.c;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import d7.a;

/* JADX INFO: loaded from: classes.dex */
public final class MessagingKt {
    public static final FirebaseMessaging getMessaging(Firebase firebase) {
        a.m(firebase, "<this>");
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        a.l(firebaseMessaging, "getInstance()");
        return firebaseMessaging;
    }

    public static final RemoteMessage remoteMessage(String str, c cVar) {
        a.m(str, "to");
        a.m(cVar, "init");
        RemoteMessage.Builder builder = new RemoteMessage.Builder(str);
        cVar.invoke(builder);
        RemoteMessage remoteMessageBuild = builder.build();
        a.l(remoteMessageBuild, "builder.build()");
        return remoteMessageBuild;
    }
}
