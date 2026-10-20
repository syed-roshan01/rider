package com.google.firebase.messaging;

import com.google.firebase.Firebase;

/* JADX INFO: loaded from: classes.dex */
public final class MessagingKt {
    public static final FirebaseMessaging getMessaging(Firebase firebase) {
        d7.a.m(firebase, "<this>");
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        d7.a.l(firebaseMessaging, "getInstance()");
        return firebaseMessaging;
    }

    public static final RemoteMessage remoteMessage(String str, c9.c cVar) {
        d7.a.m(str, "to");
        d7.a.m(cVar, "init");
        RemoteMessage.Builder builder = new RemoteMessage.Builder(str);
        cVar.invoke(builder);
        RemoteMessage remoteMessageBuild = builder.build();
        d7.a.l(remoteMessageBuild, "builder.build()");
        return remoteMessageBuild;
    }
}
