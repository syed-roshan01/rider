package x9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f16414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f16415f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f16418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f16419d;

    static {
        g gVar = g.f16406r;
        g gVar2 = g.f16407s;
        g gVar3 = g.f16408t;
        g gVar4 = g.f16400l;
        g gVar5 = g.f16402n;
        g gVar6 = g.f16401m;
        g gVar7 = g.f16403o;
        g gVar8 = g.f16405q;
        g gVar9 = g.f16404p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f16398j, g.f16399k, g.f16396h, g.f16397i, g.f16394f, g.f16395g, g.f16393e};
        h hVar = new h();
        hVar.c((g[]) Arrays.copyOf(new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9}, 9));
        e0 e0Var = e0.TLS_1_3;
        e0 e0Var2 = e0.TLS_1_2;
        hVar.f(e0Var, e0Var2);
        hVar.d();
        hVar.a();
        h hVar2 = new h();
        hVar2.c((g[]) Arrays.copyOf(gVarArr, 16));
        hVar2.f(e0Var, e0Var2);
        hVar2.d();
        f16414e = hVar2.a();
        h hVar3 = new h();
        hVar3.c((g[]) Arrays.copyOf(gVarArr, 16));
        hVar3.f(e0Var, e0Var2, e0.TLS_1_1, e0.TLS_1_0);
        hVar3.d();
        hVar3.a();
        f16415f = new i(false, false, null, null);
    }

    public i(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f16416a = z10;
        this.f16417b = z11;
        this.f16418c = strArr;
        this.f16419d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f16418c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f16390b.g(str));
        }
        return r8.p.W0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f16416a) {
            return false;
        }
        String[] strArr = this.f16419d;
        if (strArr != null && !y9.b.h(strArr, sSLSocket.getEnabledProtocols(), t8.a.f14668a)) {
            return false;
        }
        String[] strArr2 = this.f16418c;
        return strArr2 == null || y9.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), g.f16391c);
    }

    public final List c() {
        String[] strArr = this.f16419d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(v.q(str));
        }
        return r8.p.W0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z10 = iVar.f16416a;
        boolean z11 = this.f16416a;
        if (z11 != z10) {
            return false;
        }
        return !z11 || (Arrays.equals(this.f16418c, iVar.f16418c) && Arrays.equals(this.f16419d, iVar.f16419d) && this.f16417b == iVar.f16417b);
    }

    public final int hashCode() {
        if (!this.f16416a) {
            return 17;
        }
        String[] strArr = this.f16418c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f16419d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f16417b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f16416a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f16417b + ')';
    }
}
