package com.google.gson.internal.bind;

import java.io.IOException;
import p7.a0;
import p7.b0;
import p7.q;
import p7.y;
import p7.z;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f3986b = d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f3987a = y.f12848b;

    public static b0 d() {
        final f fVar = new f();
        return new b0() { // from class: com.google.gson.internal.bind.NumberTypeAdapter$1
            @Override // p7.b0
            public final a0 a(p7.n nVar, u7.a aVar) {
                if (aVar.f15425a == Number.class) {
                    return this.f3955a;
                }
                return null;
            }
        };
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) throws IOException {
        int iK0 = aVar.k0();
        int iE = t.k.e(iK0);
        if (iE == 5 || iE == 6) {
            return this.f3987a.a(aVar);
        }
        if (iE == 8) {
            aVar.g0();
            return null;
        }
        throw new q("Expecting number, got: " + k1.e(iK0) + "; at path " + aVar.u(false));
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        bVar.d0((Number) obj);
    }
}
