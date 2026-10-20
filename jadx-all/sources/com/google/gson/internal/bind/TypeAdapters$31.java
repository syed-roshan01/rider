package com.google.gson.internal.bind;

import p7.a0;
import p7.b0;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$31 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f3962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f3963b;

    public TypeAdapters$31(Class cls, a0 a0Var) {
        this.f3962a = cls;
        this.f3963b = a0Var;
    }

    @Override // p7.b0
    public final a0 a(p7.n nVar, u7.a aVar) {
        if (aVar.f15425a == this.f3962a) {
            return this.f3963b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f3962a.getName() + ",adapter=" + this.f3963b + "]";
    }
}
