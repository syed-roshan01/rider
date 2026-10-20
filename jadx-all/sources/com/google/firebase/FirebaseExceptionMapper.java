package com.google.firebase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseExceptionMapper implements r {
    @Override // com.google.android.gms.common.api.internal.r
    public final Exception getException(Status status) {
        int i10 = status.f3150b;
        int i11 = status.f3150b;
        String strL0 = status.f3151c;
        if (i10 == 8) {
            if (strL0 == null) {
                strL0 = e.l0(i11);
            }
            return new FirebaseException(strL0);
        }
        if (strL0 == null) {
            strL0 = e.l0(i11);
        }
        return new FirebaseApiNotAvailableException(strL0);
    }
}
