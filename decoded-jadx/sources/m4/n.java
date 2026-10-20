package m4;

import k4.o;

/* JADX INFO: loaded from: classes.dex */
public final class n extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f11860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4.f f11862c;

    public n(o oVar, String str, k4.f fVar) {
        this.f11860a = oVar;
        this.f11861b = str;
        this.f11862c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (d7.a.d(this.f11860a, nVar.f11860a) && d7.a.d(this.f11861b, nVar.f11861b) && this.f11862c == nVar.f11862c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f11860a.hashCode() * 31;
        String str = this.f11861b;
        return this.f11862c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
