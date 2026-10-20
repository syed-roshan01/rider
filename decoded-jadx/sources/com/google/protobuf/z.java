package com.google.protobuf;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile z f4280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f4281b = new z();

    public z() {
        Collections.emptyMap();
    }

    public static z a() {
        z zVar = f4280a;
        if (zVar == null) {
            synchronized (z.class) {
                try {
                    zVar = f4280a;
                    if (zVar == null) {
                        Class cls = y.f4275a;
                        z zVar2 = null;
                        if (cls != null) {
                            try {
                                zVar2 = (z) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                        }
                        if (zVar2 == null) {
                            zVar2 = f4281b;
                        }
                        f4280a = zVar2;
                        zVar = zVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zVar;
    }
}
