package e1;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1.e f4992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f4993f;

    public c0(d1.e eVar) {
        i iVar;
        this.f4992e = eVar;
        long j10 = eVar.f4343h;
        float fB = d1.a.b(j10);
        long j11 = eVar.f4342g;
        float fB2 = d1.a.b(j11);
        boolean z10 = false;
        long j12 = eVar.f4340e;
        long j13 = eVar.f4341f;
        boolean z11 = fB == fB2 && d1.a.b(j11) == d1.a.b(j13) && d1.a.b(j13) == d1.a.b(j12);
        if (d1.a.c(j10) == d1.a.c(j11) && d1.a.c(j11) == d1.a.c(j13) && d1.a.c(j13) == d1.a.c(j12)) {
            z10 = true;
        }
        if (z11 && z10) {
            iVar = null;
        } else {
            i iVarG = androidx.compose.ui.graphics.a.g();
            iVarG.a(eVar);
            iVar = iVarG;
        }
        this.f4993f = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return d7.a.d(this.f4992e, ((c0) obj).f4992e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4992e.hashCode();
    }
}
