package com.google.firebase.auth;

import com.google.firebase.FirebaseException;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAuthException extends FirebaseException {
    private final String zza;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        a.u(str);
        this.zza = str;
    }

    public String getErrorCode() {
        return this.zza;
    }
}
