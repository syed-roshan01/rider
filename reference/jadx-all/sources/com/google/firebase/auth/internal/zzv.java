package com.google.firebase.auth.internal;

import com.google.firebase.auth.ActionCodeMultiFactorInfo;
import com.google.firebase.auth.MultiFactorInfo;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzv extends ActionCodeMultiFactorInfo {
    private final MultiFactorInfo zza;

    public zzv(String str, MultiFactorInfo multiFactorInfo) {
        a.u(str);
        this.email = str;
        if (multiFactorInfo == null) {
            throw new NullPointerException("null reference");
        }
        this.zza = multiFactorInfo;
    }

    @Override // com.google.firebase.auth.ActionCodeMultiFactorInfo
    public final MultiFactorInfo getMultiFactorInfo() {
        return this.zza;
    }
}
