package com.google.gson.internal.bind;

import p7.a0;
import p7.b0;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$34 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f3970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f3971b;

    public TypeAdapters$34(Class cls, p7.k kVar) {
        this.f3970a = cls;
        this.f3971b = kVar;
    }

    @Override // p7.b0
    public final a0 a(p7.n nVar, u7.a aVar) {
        Class<?> cls = aVar.f15425a;
        if (this.f3970a.isAssignableFrom(cls)) {
            return new n(this, cls);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f3970a.getName() + ",adapter=" + this.f3971b + "]";
    }
}
