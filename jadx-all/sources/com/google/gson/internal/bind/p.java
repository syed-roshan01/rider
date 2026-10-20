package com.google.gson.internal.bind;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p7.a0;
import p7.b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final b0 A;
    public static final b0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f4018a = new TypeAdapters$31(Class.class, new p7.k(11).a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f4019b = new TypeAdapters$31(BitSet.class, new p7.k(21).a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p7.k f4020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f4021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f4022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f4023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f4024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f4025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b0 f4026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b0 f4027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p7.k f4028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b0 f4029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p7.k f4030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p7.k f4031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p7.k f4032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b0 f4033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b0 f4034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b0 f4035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b0 f4036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b0 f4037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b0 f4038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b0 f4039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b0 f4040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b0 f4041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b0 f4042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p7.k f4043z;

    static {
        p7.k kVar = new p7.k(22);
        f4020c = new p7.k(23);
        f4021d = new TypeAdapters$32(Boolean.TYPE, Boolean.class, kVar);
        f4022e = new TypeAdapters$32(Byte.TYPE, Byte.class, new p7.k(24));
        f4023f = new TypeAdapters$32(Short.TYPE, Short.class, new p7.k(25));
        f4024g = new TypeAdapters$32(Integer.TYPE, Integer.class, new p7.k(26));
        f4025h = new TypeAdapters$31(AtomicInteger.class, new p7.k(27).a());
        f4026i = new TypeAdapters$31(AtomicBoolean.class, new p7.k(28).a());
        f4027j = new TypeAdapters$31(AtomicIntegerArray.class, new p7.k(1).a());
        f4028k = new p7.k(2);
        f4029l = new TypeAdapters$32(Character.TYPE, Character.class, new p7.k(5));
        p7.k kVar2 = new p7.k(6);
        f4030m = new p7.k(7);
        f4031n = new p7.k(8);
        f4032o = new p7.k(9);
        f4033p = new TypeAdapters$31(String.class, kVar2);
        f4034q = new TypeAdapters$31(StringBuilder.class, new p7.k(10));
        f4035r = new TypeAdapters$31(StringBuffer.class, new p7.k(12));
        f4036s = new TypeAdapters$31(URL.class, new p7.k(13));
        f4037t = new TypeAdapters$31(URI.class, new p7.k(14));
        f4038u = new TypeAdapters$34(InetAddress.class, new p7.k(15));
        f4039v = new TypeAdapters$31(UUID.class, new p7.k(16));
        f4040w = new TypeAdapters$31(Currency.class, new p7.k(17).a());
        final p7.k kVar3 = new p7.k(18);
        f4041x = new b0() { // from class: com.google.gson.internal.bind.TypeAdapters$33

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f3967a = Calendar.class;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Class f3968b = GregorianCalendar.class;

            @Override // p7.b0
            public final a0 a(p7.n nVar, u7.a aVar) {
                Class cls = aVar.f15425a;
                if (cls == this.f3967a || cls == this.f3968b) {
                    return kVar3;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + this.f3967a.getName() + "+" + this.f3968b.getName() + ",adapter=" + kVar3 + "]";
            }
        };
        f4042y = new TypeAdapters$31(Locale.class, new p7.k(19));
        p7.k kVar4 = new p7.k(20);
        f4043z = kVar4;
        A = new TypeAdapters$34(p7.p.class, kVar4);
        B = new b0() { // from class: com.google.gson.internal.bind.TypeAdapters$29
            @Override // p7.b0
            public final a0 a(p7.n nVar, u7.a aVar) {
                Class superclass = aVar.f15425a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new m(superclass);
            }
        };
    }

    public static b0 a(Class cls, Class cls2, a0 a0Var) {
        return new TypeAdapters$32(cls, cls2, a0Var);
    }

    public static b0 b(Class cls, a0 a0Var) {
        return new TypeAdapters$31(cls, a0Var);
    }
}
