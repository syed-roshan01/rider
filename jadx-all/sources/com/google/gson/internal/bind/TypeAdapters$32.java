package com.google.gson.internal.bind;

import p7.a0;
import p7.b0;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$32 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f3964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f3965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f3966c;

    public TypeAdapters$32(Class cls, Class cls2, a0 a0Var) {
        this.f3964a = cls;
        this.f3965b = cls2;
        this.f3966c = a0Var;
    }

    @Override // p7.b0
    public final a0 a(p7.n nVar, u7.a aVar) {
        Class cls = aVar.f15425a;
        if (cls == this.f3964a || cls == this.f3965b) {
            return this.f3966c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f3965b.getName() + "+" + this.f3964a.getName() + ",adapter=" + this.f3966c + "]";
    }
}
