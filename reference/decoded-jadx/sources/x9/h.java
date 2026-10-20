package x9;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16410a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f16411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f16412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16413d;

    public final i a() {
        return new i(this.f16410a, this.f16413d, this.f16411b, this.f16412c);
    }

    public final void b(String... strArr) {
        d7.a.m(strArr, "cipherSuites");
        if (!this.f16410a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        this.f16411b = (String[]) strArr.clone();
    }

    public final void c(g... gVarArr) {
        d7.a.m(gVarArr, "cipherSuites");
        if (!this.f16410a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(gVarArr.length);
        for (g gVar : gVarArr) {
            arrayList.add(gVar.f16409a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void d() {
        if (!this.f16410a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }
        this.f16413d = true;
    }

    public final void e(String... strArr) {
        d7.a.m(strArr, "tlsVersions");
        if (!this.f16410a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        this.f16412c = (String[]) strArr.clone();
    }

    public final void f(e0... e0VarArr) {
        if (!this.f16410a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(e0VarArr.length);
        for (e0 e0Var : e0VarArr) {
            arrayList.add(e0Var.f16386a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
