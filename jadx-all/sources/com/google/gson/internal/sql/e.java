package com.google.gson.internal.sql;

import p7.b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f4050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f4051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f4052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f4053d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f4050a = z10;
        if (z10) {
            f4051b = a.f4044b;
            f4052c = b.f4046b;
            f4053d = c.f4048b;
        } else {
            f4051b = null;
            f4052c = null;
            f4053d = null;
        }
    }
}
