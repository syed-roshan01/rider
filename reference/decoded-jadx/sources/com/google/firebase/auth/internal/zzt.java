package com.google.firebase.auth.internal;

import com.google.firebase.auth.ActionCodeEmailInfo;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzt extends ActionCodeEmailInfo {
    private final String zza;

    public zzt(String str, String str2) {
        a.u(str);
        this.email = str;
        a.u(str2);
        this.zza = str2;
    }

    @Override // com.google.firebase.auth.ActionCodeEmailInfo
    public final String getPreviousEmail() {
        return this.zza;
    }
}
