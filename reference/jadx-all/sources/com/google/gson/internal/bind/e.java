package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p7.a0;
import p7.r;
import p7.s;
import p7.t;
import r7.q;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f3982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f3983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f3984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MapTypeAdapterFactory f3985d;

    public e(MapTypeAdapterFactory mapTypeAdapterFactory, p7.n nVar, Type type, a0 a0Var, Type type2, a0 a0Var2, q qVar) {
        this.f3985d = mapTypeAdapterFactory;
        this.f3982a = new m(nVar, a0Var, type);
        this.f3983b = new m(nVar, a0Var2, type2);
        this.f3984c = qVar;
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) throws IOException {
        int iK0 = aVar.k0();
        if (iK0 == 9) {
            aVar.g0();
            return null;
        }
        Map map = (Map) this.f3984c.e();
        m mVar = this.f3983b;
        m mVar2 = this.f3982a;
        if (iK0 == 1) {
            aVar.a();
            while (aVar.M()) {
                aVar.a();
                Object objB = mVar2.b(aVar);
                if (map.put(objB, mVar.b(aVar)) != null) {
                    throw new p7.q("duplicate key: " + objB);
                }
                aVar.g();
            }
            aVar.g();
        } else {
            aVar.b();
            while (aVar.M()) {
                r7.e.f13597b.getClass();
                int iF = aVar.f15944o;
                if (iF == 0) {
                    iF = aVar.f();
                }
                if (iF == 13) {
                    aVar.f15944o = 9;
                } else if (iF == 12) {
                    aVar.f15944o = 8;
                } else {
                    if (iF != 14) {
                        throw new IllegalStateException("Expected a name but was " + k1.e(aVar.k0()) + aVar.P());
                    }
                    aVar.f15944o = 10;
                }
                Object objB2 = mVar2.b(aVar);
                if (map.put(objB2, mVar.b(aVar)) != null) {
                    throw new p7.q("duplicate key: " + objB2);
                }
            }
            aVar.p();
        }
        return map;
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        String strG;
        Map map = (Map) obj;
        if (map == null) {
            bVar.M();
            return;
        }
        boolean z10 = this.f3985d.f3954b;
        m mVar = this.f3983b;
        if (!z10) {
            bVar.e();
            for (Map.Entry entry : map.entrySet()) {
                bVar.q(String.valueOf(entry.getKey()));
                mVar.c(bVar, entry.getValue());
            }
            bVar.p();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i10 = 0;
        boolean z11 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            m mVar2 = this.f3982a;
            mVar2.getClass();
            try {
                d dVar = new d();
                mVar2.c(dVar, key);
                ArrayList arrayList3 = dVar.f3979s;
                if (!arrayList3.isEmpty()) {
                    throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                }
                p7.p pVar = dVar.f3981u;
                arrayList.add(pVar);
                arrayList2.add(entry2.getValue());
                pVar.getClass();
                z11 |= (pVar instanceof p7.o) || (pVar instanceof s);
            } catch (IOException e4) {
                throw new p7.q(e4);
            }
        }
        if (z11) {
            bVar.b();
            int size = arrayList.size();
            while (i10 < size) {
                bVar.b();
                z6.a.x0((p7.p) arrayList.get(i10), bVar);
                mVar.c(bVar, arrayList2.get(i10));
                bVar.g();
                i10++;
            }
            bVar.g();
            return;
        }
        bVar.e();
        int size2 = arrayList.size();
        while (i10 < size2) {
            p7.p pVar2 = (p7.p) arrayList.get(i10);
            pVar2.getClass();
            boolean z12 = pVar2 instanceof t;
            if (z12) {
                if (!z12) {
                    throw new IllegalStateException("Not a JSON Primitive: " + pVar2);
                }
                t tVar = (t) pVar2;
                Serializable serializable = tVar.f12846a;
                if (serializable instanceof Number) {
                    strG = String.valueOf(tVar.e());
                } else if (serializable instanceof Boolean) {
                    strG = Boolean.toString(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(tVar.g()));
                } else {
                    if (!(serializable instanceof String)) {
                        throw new AssertionError();
                    }
                    strG = tVar.g();
                }
            } else {
                if (!(pVar2 instanceof r)) {
                    throw new AssertionError();
                }
                strG = "null";
            }
            bVar.q(strG);
            mVar.c(bVar, arrayList2.get(i10));
            i10++;
        }
        bVar.p();
    }
}
