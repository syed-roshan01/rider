package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p7.a0;
import p7.b0;
import p7.y;
import p7.z;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f3988c = new b0() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter$1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f3956a = y.f12847a;

        @Override // p7.b0
        public final a0 a(p7.n nVar, u7.a aVar) {
            if (aVar.f15425a == Object.class) {
                return new g(nVar, this.f3956a);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.n f3989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f3990b;

    public g(p7.n nVar, z zVar) {
        this.f3989a = nVar;
        this.f3990b = zVar;
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iK0 = aVar.k0();
        if (iK0 == 0) {
            throw null;
        }
        int i10 = iK0 - 1;
        if (i10 == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (i10 != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new r7.p(true);
        }
        if (arrayList == null) {
            return d(aVar, iK0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.M()) {
                String strE0 = arrayList instanceof Map ? aVar.e0() : null;
                int iK1 = aVar.k0();
                if (iK1 == 0) {
                    throw null;
                }
                int i11 = iK1 - 1;
                if (i11 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (i11 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new r7.p(true);
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(aVar, iK1);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strE0, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.g();
                } else {
                    aVar.p();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.M();
            return;
        }
        Class<?> cls = obj.getClass();
        p7.n nVar = this.f3989a;
        nVar.getClass();
        a0 a0VarC = nVar.c(new u7.a(cls));
        if (!(a0VarC instanceof g)) {
            a0VarC.c(bVar, obj);
        } else {
            bVar.e();
            bVar.p();
        }
    }

    public final Serializable d(v7.a aVar, int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 5) {
            return aVar.i0();
        }
        if (i11 == 6) {
            return this.f3990b.a(aVar);
        }
        if (i11 == 7) {
            return Boolean.valueOf(aVar.Q());
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(k1.e(i10)));
        }
        aVar.g0();
        return null;
    }
}
