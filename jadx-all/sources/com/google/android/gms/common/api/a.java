package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c {
    public abstract d buildClient(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, Object obj, com.google.android.gms.common.api.internal.e eVar, com.google.android.gms.common.api.internal.n nVar);

    @Deprecated
    public d buildClient(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, Object obj, j jVar, k kVar) {
        return buildClient(context, looper, hVar, obj, (com.google.android.gms.common.api.internal.e) jVar, (com.google.android.gms.common.api.internal.n) kVar);
    }
}
