package com.google.gson.internal.bind;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import r7.q;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f4005b;

    public j(q qVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f4005b = qVar;
    }

    @Override // com.google.gson.internal.bind.i
    public final Object d() {
        return this.f4005b.e();
    }

    @Override // com.google.gson.internal.bind.i
    public final Object e(Object obj) {
        return obj;
    }

    @Override // com.google.gson.internal.bind.i
    public final void f(Object obj, v7.a aVar, h hVar) throws IllegalAccessException {
        Object objB = hVar.f3999i.b(aVar);
        if (objB == null && hVar.f4002l) {
            return;
        }
        boolean z10 = hVar.f3996f;
        Field field = hVar.f3992b;
        if (z10) {
            ReflectiveTypeAdapterFactory.b(obj, field);
        } else if (hVar.f4003m) {
            throw new p7.q(l.q.x("Cannot set value of 'static final' ", t7.c.d(field, false)));
        }
        field.set(obj, objB);
    }
}
