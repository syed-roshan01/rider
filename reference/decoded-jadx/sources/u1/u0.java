package u1;

import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f15306a = new u0();

    public final void a(View view, o1.q qVar) {
        PointerIcon systemIcon = qVar instanceof o1.a ? PointerIcon.getSystemIcon(view.getContext(), ((o1.a) qVar).f12345b) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (d7.a.d(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
