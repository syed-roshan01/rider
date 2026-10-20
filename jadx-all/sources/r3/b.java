package r3;

import androidx.fragment.app.a1;
import androidx.lifecycle.x0;
import q.a0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f13443b = new a1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f13444a = new a0();

    @Override // androidx.lifecycle.x0
    public final void onCleared() {
        a0 a0Var = this.f13444a;
        int i10 = a0Var.f12977c;
        if (i10 > 0) {
            a7.a.w(a0Var.f12976b[0]);
            throw null;
        }
        Object[] objArr = a0Var.f12976b;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        a0Var.f12977c = 0;
    }
}
