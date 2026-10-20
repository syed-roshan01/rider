package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p7.a0;
import p7.b0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f3972c = new b0() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter$1
        @Override // p7.b0
        public final a0 a(p7.n nVar, u7.a aVar) {
            Type type = aVar.f15426b;
            boolean z10 = type instanceof GenericArrayType;
            if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new a(nVar, nVar.c(new u7.a(genericComponentType)), r7.d.e(genericComponentType));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f3974b;

    public a(p7.n nVar, a0 a0Var, Class cls) {
        this.f3974b = new m(nVar, a0Var, cls);
        this.f3973a = cls;
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) {
        if (aVar.k0() == 9) {
            aVar.g0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.M()) {
            arrayList.add(this.f3974b.b(aVar));
        }
        aVar.g();
        int size = arrayList.size();
        Class cls = this.f3973a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.M();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f3974b.c(bVar, Array.get(obj, i10));
        }
        bVar.g();
    }
}
