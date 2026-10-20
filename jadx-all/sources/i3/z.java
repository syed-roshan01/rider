package i3;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f8014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f8015b;

    public z(int i10) {
        this.f8014a = new SparseArray(i10);
    }

    public final void a(d0 d0Var, int i10, int i11) {
        int iA = d0Var.a(i10);
        SparseArray sparseArray = this.f8014a;
        z zVar = sparseArray == null ? null : (z) sparseArray.get(iA);
        if (zVar == null) {
            zVar = new z(1);
            sparseArray.put(d0Var.a(i10), zVar);
        }
        if (i11 > i10) {
            zVar.a(d0Var, i10 + 1, i11);
        } else {
            zVar.f8015b = d0Var;
        }
    }
}
