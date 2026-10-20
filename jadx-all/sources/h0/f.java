package h0;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f7382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.a f7383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j10, c9.a aVar, boolean z10) {
        super(1);
        this.f7382a = j10;
        this.f7383b = aVar;
        this.f7384c = z10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        b1.d dVar = (b1.d) obj;
        e1.y yVarO = d7.t.O(dVar, d1.f.d(dVar.f2512a.e()) / 2.0f);
        int i10 = Build.VERSION.SDK_INT;
        long j10 = this.f7382a;
        return dVar.a(new u.z(this.f7383b, this.f7384c, yVarO, new e1.l(j10, 5, i10 >= 29 ? e1.m.f5045a.a(j10, 5) : new PorterDuffColorFilter(androidx.compose.ui.graphics.a.s(j10), androidx.compose.ui.graphics.a.u(5)))));
    }
}
