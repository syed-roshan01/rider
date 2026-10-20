package u8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f15438a = new k();

    @Override // u8.j
    public final j O(j jVar) {
        d7.a.m(jVar, "context");
        return jVar;
    }

    @Override // u8.j
    public final Object e(Object obj, c9.e eVar) {
        return obj;
    }

    @Override // u8.j
    public final h f(i iVar) {
        d7.a.m(iVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // u8.j
    public final j u(i iVar) {
        d7.a.m(iVar, "key");
        return this;
    }
}
