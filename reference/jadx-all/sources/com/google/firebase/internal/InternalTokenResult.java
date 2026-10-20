package com.google.firebase.internal;

import java.util.Arrays;
import l.t;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class InternalTokenResult {
    private String zza;

    public InternalTokenResult(String str) {
        this.zza = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof InternalTokenResult) {
            return e.g0(this.zza, ((InternalTokenResult) obj).zza);
        }
        return false;
    }

    public String getToken() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public String toString() {
        t tVar = new t(this);
        tVar.b(this.zza, "token");
        return tVar.toString();
    }
}
