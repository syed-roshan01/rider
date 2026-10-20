package com.google.gson.internal.bind;

import d7.t;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import p7.a0;
import p7.b0;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.h f3951a;

    public CollectionTypeAdapterFactory(r7.h hVar) {
        this.f3951a = hVar;
    }

    @Override // p7.b0
    public final a0 a(p7.n nVar, u7.a aVar) {
        Type type = aVar.f15426b;
        Class cls = aVar.f15425a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        t.H(Collection.class.isAssignableFrom(cls));
        Type typeF = r7.d.f(type, cls, r7.d.d(type, cls, Collection.class), new HashMap());
        Type type2 = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments()[0] : Object.class;
        return new n(nVar, type2, nVar.c(new u7.a(type2)), this.f3951a.b(aVar));
    }
}
