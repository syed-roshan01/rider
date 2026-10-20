package com.google.android.gms.internal.p000authapiphone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.h;

/* JADX INFO: loaded from: classes.dex */
final class zzr extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ d buildClient(Context context, Looper looper, h hVar, Object obj, e eVar, n nVar) {
        a7.a.w(obj);
        return new zzv(context, looper, hVar, eVar, nVar);
    }
}
