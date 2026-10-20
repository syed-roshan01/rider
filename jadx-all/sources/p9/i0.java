package p9;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12903a;

    @Override // p9.h0
    public final f a(q9.z zVar) {
        switch (this.f12903a) {
            case 0:
                return new a4.c0(f0.f12890a, 1);
            default:
                return new a4.c0(new k0(zVar, null));
        }
    }

    public final String toString() {
        switch (this.f12903a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
