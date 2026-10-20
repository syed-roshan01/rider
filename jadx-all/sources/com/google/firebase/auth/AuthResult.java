package com.google.firebase.auth;

import a6.c;

/* JADX INFO: loaded from: classes.dex */
public interface AuthResult extends c {
    AdditionalUserInfo getAdditionalUserInfo();

    AuthCredential getCredential();

    FirebaseUser getUser();
}
