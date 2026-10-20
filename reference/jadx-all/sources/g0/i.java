package g0;

import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6480c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f6481d = null;

    public i(String str, String str2) {
        this.f6478a = str;
        this.f6479b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return d7.a.d(this.f6478a, iVar.f6478a) && d7.a.d(this.f6479b, iVar.f6479b) && this.f6480c == iVar.f6480c && d7.a.d(this.f6481d, iVar.f6481d);
    }

    public final int hashCode() {
        int iC = q.c(this.f6480c, a7.a.i(this.f6479b, this.f6478a.hashCode() * 31, 31), 31);
        e eVar = this.f6481d;
        return iC + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + this.f6478a + ", substitution=" + this.f6479b + ", isShowingSubstitution=" + this.f6480c + ", layoutCache=" + this.f6481d + ')';
    }
}
