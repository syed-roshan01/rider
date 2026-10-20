package com.google.gson.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p7.a0;
import p7.b0;
import p7.n;
import q7.c;
import q7.d;
import r7.i;
import u7.a;

/* JADX INFO: loaded from: classes.dex */
public final class Excluder implements b0, Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Excluder f3945f = new Excluder();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f3946a = -1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3947b = 136;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3948c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3949d = Collections.emptyList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3950e = Collections.emptyList();

    public static boolean d(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // p7.b0
    public final a0 a(n nVar, a aVar) {
        boolean z10;
        boolean z11;
        boolean zB = b(aVar.f15425a);
        if (zB) {
            z10 = true;
        } else {
            c(true);
            z10 = false;
        }
        if (zB) {
            z11 = true;
        } else {
            c(false);
            z11 = false;
        }
        if (z10 || z11) {
            return new i(this, z11, z10, nVar, aVar);
        }
        return null;
    }

    public final boolean b(Class cls) {
        if (this.f3946a != -1.0d) {
            c cVar = (c) cls.getAnnotation(c.class);
            d dVar = (d) cls.getAnnotation(d.class);
            double d10 = this.f3946a;
            if ((cVar != null && d10 < cVar.value()) || (dVar != null && d10 >= dVar.value())) {
                return true;
            }
        }
        if (!this.f3948c && cls.isMemberClass() && (cls.getModifiers() & 8) == 0) {
            return true;
        }
        return d(cls);
    }

    public final void c(boolean z10) {
        Iterator it = (z10 ? this.f3949d : this.f3950e).iterator();
        if (it.hasNext()) {
            a7.a.w(it.next());
            throw null;
        }
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }
}
