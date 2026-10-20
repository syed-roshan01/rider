package s4;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class q extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f14039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f14040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4.f f14041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q4.c f14042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14045g;

    public q(Drawable drawable, j jVar, k4.f fVar, q4.c cVar, String str, boolean z10, boolean z11) {
        this.f14039a = drawable;
        this.f14040b = jVar;
        this.f14041c = fVar;
        this.f14042d = cVar;
        this.f14043e = str;
        this.f14044f = z10;
        this.f14045g = z11;
    }

    @Override // s4.k
    public final Drawable a() {
        return this.f14039a;
    }

    @Override // s4.k
    public final j b() {
        return this.f14040b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (d7.a.d(this.f14039a, qVar.f14039a)) {
                if (d7.a.d(this.f14040b, qVar.f14040b) && this.f14041c == qVar.f14041c && d7.a.d(this.f14042d, qVar.f14042d) && d7.a.d(this.f14043e, qVar.f14043e) && this.f14044f == qVar.f14044f && this.f14045g == qVar.f14045g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f14041c.hashCode() + ((this.f14040b.hashCode() + (this.f14039a.hashCode() * 31)) * 31)) * 31;
        q4.c cVar = this.f14042d;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str = this.f14043e;
        return Boolean.hashCode(this.f14045g) + l.q.c(this.f14044f, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }
}
