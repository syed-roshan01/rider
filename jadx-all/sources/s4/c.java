package s4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import m9.m0;
import m9.z;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f13934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f13935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f13936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f13937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v4.b f13938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t4.d f13939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f13940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f13943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f13944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Drawable f13945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f13946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f13947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f13948o;

    public c() {
        t9.d dVar = m0.f11969a;
        n9.d dVar2 = ((n9.d) r9.o.f13724a).f12323f;
        t9.c cVar = m0.f11970b;
        v4.a aVar = v4.b.f15892a;
        t4.d dVar3 = t4.d.f14652c;
        Bitmap.Config config = w4.e.f16164b;
        b bVar = b.ENABLED;
        this.f13934a = dVar2;
        this.f13935b = cVar;
        this.f13936c = cVar;
        this.f13937d = cVar;
        this.f13938e = aVar;
        this.f13939f = dVar3;
        this.f13940g = config;
        this.f13941h = true;
        this.f13942i = false;
        this.f13943j = null;
        this.f13944k = null;
        this.f13945l = null;
        this.f13946m = bVar;
        this.f13947n = bVar;
        this.f13948o = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (d7.a.d(this.f13934a, cVar.f13934a) && d7.a.d(this.f13935b, cVar.f13935b) && d7.a.d(this.f13936c, cVar.f13936c) && d7.a.d(this.f13937d, cVar.f13937d) && d7.a.d(this.f13938e, cVar.f13938e) && this.f13939f == cVar.f13939f && this.f13940g == cVar.f13940g && this.f13941h == cVar.f13941h && this.f13942i == cVar.f13942i && d7.a.d(this.f13943j, cVar.f13943j) && d7.a.d(this.f13944k, cVar.f13944k) && d7.a.d(this.f13945l, cVar.f13945l) && this.f13946m == cVar.f13946m && this.f13947n == cVar.f13947n && this.f13948o == cVar.f13948o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13937d.hashCode() + ((this.f13936c.hashCode() + ((this.f13935b.hashCode() + (this.f13934a.hashCode() * 31)) * 31)) * 31)) * 31;
        ((v4.a) this.f13938e).getClass();
        int iC = l.q.c(this.f13942i, l.q.c(this.f13941h, (this.f13940g.hashCode() + ((this.f13939f.hashCode() + ((v4.a.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31), 31);
        Drawable drawable = this.f13943j;
        int iHashCode2 = (iC + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f13944k;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f13945l;
        return this.f13948o.hashCode() + ((this.f13947n.hashCode() + ((this.f13946m.hashCode() + ((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
