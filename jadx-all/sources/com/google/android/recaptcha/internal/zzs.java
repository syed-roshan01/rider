package com.google.android.recaptcha.internal;

import c9.e;
import d7.t;
import q8.l;
import v8.a;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
final class zzs extends i implements e {
    public zzs(u8.e eVar) {
        super(2, eVar);
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new zzs(eVar);
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzs((u8.e) obj2).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f15963a;
        t.v0(obj);
        Thread.currentThread().setPriority(8);
        return l.f13235a;
    }
}
