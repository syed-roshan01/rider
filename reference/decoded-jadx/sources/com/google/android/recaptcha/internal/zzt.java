package com.google.android.recaptcha.internal;

import d7.a;
import d7.t;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m9.d0;
import m9.m0;
import m9.y0;
import m9.y1;
import r9.e;
import r9.o;
import t9.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzt {
    public static final zzr zza = new zzr(null);
    private final d0 zzb;
    private final d0 zzc;
    private final d0 zzd;

    public zzt() {
        y1 y1VarK = t.k();
        d dVar = m0.f11969a;
        this.zzb = new e(y1VarK.O(o.f13724a));
        final AtomicInteger atomicInteger = new AtomicInteger();
        e eVarB = a.b(new y0(Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: m9.b2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f11906a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f11907b = "reCaptcha";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i10 = this.f11906a;
                String str = this.f11907b;
                if (i10 != 1) {
                    str = str + '-' + atomicInteger.incrementAndGet();
                }
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(true);
                return thread;
            }
        })));
        z6.a.Q(eVarB, null, 0, new zzs(null), 3);
        this.zzc = eVarB;
        this.zzd = a.b(m0.f11970b);
    }

    public final d0 zza() {
        return this.zzd;
    }

    public final d0 zzb() {
        return this.zzb;
    }

    public final d0 zzc() {
        return this.zzc;
    }
}
