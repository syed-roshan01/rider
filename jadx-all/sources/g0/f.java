package g0;

import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.e f6466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a2.e f6467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6468c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f6469d = null;

    public f(a2.e eVar, a2.e eVar2) {
        this.f6466a = eVar;
        this.f6467b = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return d7.a.d(this.f6466a, fVar.f6466a) && d7.a.d(this.f6467b, fVar.f6467b) && this.f6468c == fVar.f6468c && d7.a.d(this.f6469d, fVar.f6469d);
    }

    public final int hashCode() {
        int iC = q.c(this.f6468c, (this.f6467b.hashCode() + (this.f6466a.hashCode() * 31)) * 31, 31);
        d dVar = this.f6469d;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f6466a) + ", substitution=" + ((Object) this.f6467b) + ", isShowingSubstitution=" + this.f6468c + ", layoutCache=" + this.f6469d + ')';
    }
}
