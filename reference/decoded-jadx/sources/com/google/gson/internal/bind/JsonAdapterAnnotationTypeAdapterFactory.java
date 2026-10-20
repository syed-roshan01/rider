package com.google.gson.internal.bind;

import p7.a0;
import p7.b0;

/* JADX INFO: loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.h f3952a;

    public JsonAdapterAnnotationTypeAdapterFactory(r7.h hVar) {
        this.f3952a = hVar;
    }

    public static a0 b(r7.h hVar, p7.n nVar, u7.a aVar, q7.a aVar2) {
        a0 a0VarA;
        Object objE = hVar.b(new u7.a(aVar2.value())).e();
        boolean zNullSafe = aVar2.nullSafe();
        if (objE instanceof a0) {
            a0VarA = (a0) objE;
        } else {
            if (!(objE instanceof b0)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objE.getClass().getName() + " as a @JsonAdapter for " + r7.d.g(aVar.f15426b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0VarA = ((b0) objE).a(nVar, aVar);
        }
        return (a0VarA == null || !zNullSafe) ? a0VarA : a0VarA.a();
    }

    @Override // p7.b0
    public final a0 a(p7.n nVar, u7.a aVar) {
        q7.a aVar2 = (q7.a) aVar.f15425a.getAnnotation(q7.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f3952a, nVar, aVar, aVar2);
    }
}
