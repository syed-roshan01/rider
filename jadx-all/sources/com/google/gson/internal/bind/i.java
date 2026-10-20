package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o7.d0;
import p7.a0;
import p7.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4004a;

    public i(LinkedHashMap linkedHashMap) {
        this.f4004a = linkedHashMap;
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) throws IOException {
        if (aVar.k0() == 9) {
            aVar.g0();
            return null;
        }
        Object objD = d();
        try {
            aVar.b();
            while (aVar.M()) {
                h hVar = (h) this.f4004a.get(aVar.e0());
                if (hVar == null || !hVar.f3995e) {
                    aVar.q0();
                } else {
                    f(objD, aVar, hVar);
                }
            }
            aVar.p();
            return e(objD);
        } catch (IllegalAccessException e4) {
            d0 d0Var = t7.c.f14667a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e4);
        } catch (IllegalStateException e10) {
            throw new q(e10);
        }
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.M();
            return;
        }
        bVar.e();
        try {
            Iterator it = this.f4004a.values().iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(bVar, obj);
            }
            bVar.p();
        } catch (IllegalAccessException e4) {
            d0 d0Var = t7.c.f14667a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e4);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, v7.a aVar, h hVar);
}
