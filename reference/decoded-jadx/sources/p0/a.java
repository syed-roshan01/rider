package p0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12740c;

    public a(b bVar, int i10, int i11) {
        this.f12738a = bVar;
        this.f12739b = i10;
        z6.a.l(i10, i11, bVar.size());
        this.f12740c = i11 - i10;
    }

    @Override // r8.a
    public final int e() {
        return this.f12740c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z6.a.h(i10, this.f12740c);
        return this.f12738a.get(this.f12739b + i10);
    }

    @Override // r8.d, java.util.List
    public final List subList(int i10, int i11) {
        z6.a.l(i10, i11, this.f12740c);
        int i12 = this.f12739b;
        return new a(this.f12738a, i10 + i12, i12 + i11);
    }
}
