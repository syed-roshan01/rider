package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;
import p7.a0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4013d;

    public m(Class cls) {
        this.f4010a = 1;
        this.f4011b = new HashMap();
        this.f4012c = new HashMap();
        this.f4013d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new o(cls))) {
                Enum r10 = (Enum) field.get(null);
                String strName = r10.name();
                String string = r10.toString();
                q7.b bVar = (q7.b) field.getAnnotation(q7.b.class);
                Object obj = this.f4011b;
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        ((Map) obj).put(str, r10);
                    }
                }
                ((Map) obj).put(strName, r10);
                ((Map) this.f4012c).put(string, r10);
                ((Map) this.f4013d).put(r10, strName);
            }
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) throws IOException {
        int i10 = this.f4010a;
        Object obj = this.f4012c;
        switch (i10) {
            case 0:
                return ((a0) obj).b(aVar);
            default:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                String strI0 = aVar.i0();
                Enum r10 = (Enum) ((Map) this.f4011b).get(strI0);
                return r10 == null ? (Enum) ((Map) obj).get(strI0) : r10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) {
        int i10 = this.f4010a;
        Object obj2 = this.f4013d;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) this.f4012c;
                Type type = (Type) obj2;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    a0 a0VarC = ((p7.n) this.f4011b).c(new u7.a(type2));
                    if (a0VarC instanceof i) {
                        a0 a0Var2 = a0Var;
                        while (a0Var2 instanceof l) {
                            a0 a0Var3 = ((p7.m) ((l) a0Var2)).f12833a;
                            if (a0Var3 == null) {
                                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                            }
                            if (a0Var3 != a0Var2) {
                                a0Var2 = a0Var3;
                            } else if (a0Var2 instanceof i) {
                                a0Var = a0VarC;
                            }
                        }
                        if (a0Var2 instanceof i) {
                            a0Var = a0VarC;
                        }
                    } else {
                        a0Var = a0VarC;
                    }
                }
                a0Var.c(bVar, obj);
                return;
            default:
                Enum r10 = (Enum) obj;
                bVar.e0(r10 == null ? null : (String) ((Map) obj2).get(r10));
                return;
        }
    }

    public m(p7.n nVar, a0 a0Var, Type type) {
        this.f4010a = 0;
        this.f4011b = nVar;
        this.f4012c = a0Var;
        this.f4013d = type;
    }
}
