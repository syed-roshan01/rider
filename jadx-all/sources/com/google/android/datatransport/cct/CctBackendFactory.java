package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import j5.d;
import m5.b;
import m5.c;
import m5.h;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory {
    public h create(c cVar) {
        Context context = ((b) cVar).f11865a;
        b bVar = (b) cVar;
        return new d(context, bVar.f11866b, bVar.f11867c);
    }
}
