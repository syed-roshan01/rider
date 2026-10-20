package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f3339g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(f fVar, int i10) {
        super(fVar, i10, null);
        this.f3339g = fVar;
    }

    @Override // com.google.android.gms.common.internal.b0
    public final void b(z5.b bVar) {
        f fVar = this.f3339g;
        if (fVar.enableLocalFallback() && f.zzo(fVar)) {
            f.zzk(fVar, 16);
        } else {
            fVar.zzc.j(bVar);
            fVar.onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.b0
    public final boolean c() {
        this.f3339g.zzc.j(z5.b.f17239e);
        return true;
    }
}
