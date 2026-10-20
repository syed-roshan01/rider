package u;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f14772a = new f2();

    @Override // u.d2
    public final boolean a() {
        return false;
    }

    @Override // u.d2
    public final c2 b(View view, boolean z10, long j10, float f10, float f11, boolean z11, m2.b bVar, float f12) {
        return new e2(new Magnifier(view));
    }
}
