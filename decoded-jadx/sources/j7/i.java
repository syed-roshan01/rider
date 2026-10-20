package j7;

import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f8417b;

    public /* synthetic */ i(v vVar, int i10, int i11) {
        this.f8416a = i10;
        this.f8417b = vVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(v vVar, int i10) {
        this.f8416a = i10;
        int i11 = 0;
        int i12 = 1;
        if (i10 == 1) {
            this(vVar, i12, i11);
            return;
        }
        int i13 = 2;
        if (i10 != 2) {
            this(vVar, i11, i11);
        } else {
            this(vVar, i13, i11);
        }
    }
}
