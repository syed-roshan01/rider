package s4;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f13964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f13965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f13966c;

    public e(Drawable drawable, j jVar, Throwable th) {
        this.f13964a = drawable;
        this.f13965b = jVar;
        this.f13966c = th;
    }

    @Override // s4.k
    public final Drawable a() {
        return this.f13964a;
    }

    @Override // s4.k
    public final j b() {
        return this.f13965b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (d7.a.d(this.f13964a, eVar.f13964a)) {
                if (d7.a.d(this.f13965b, eVar.f13965b) && d7.a.d(this.f13966c, eVar.f13966c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f13964a;
        return this.f13966c.hashCode() + ((this.f13965b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
