package com.google.gson.internal.bind;

import d7.t;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p7.a0;
import p7.b0;

/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.h f3953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3954b = false;

    public MapTypeAdapterFactory(r7.h hVar) {
        this.f3953a = hVar;
    }

    @Override // p7.b0
    public final a0 a(p7.n nVar, u7.a aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.f15426b;
        Class cls = aVar.f15425a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            t.H(Map.class.isAssignableFrom(cls));
            Type typeF = r7.d.f(type, cls, r7.d.d(type, cls, Map.class), new HashMap());
            actualTypeArguments = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new e(this, nVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? p.f4020c : nVar.c(new u7.a(type2)), actualTypeArguments[1], nVar.c(new u7.a(actualTypeArguments[1])), this.f3953a.b(aVar));
    }
}
