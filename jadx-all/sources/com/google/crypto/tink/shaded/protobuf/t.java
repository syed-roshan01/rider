package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile t f3618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f3619b = new t();

    public t() {
        Collections.emptyMap();
    }

    public static t a() {
        t tVar = f3618a;
        if (tVar == null) {
            synchronized (t.class) {
                try {
                    tVar = f3618a;
                    if (tVar == null) {
                        Class cls = s.f3615a;
                        t tVar2 = null;
                        if (cls != null) {
                            try {
                                tVar2 = (t) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                        }
                        if (tVar2 == null) {
                            tVar2 = f3619b;
                        }
                        f3618a = tVar2;
                        tVar = tVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return tVar;
    }
}
