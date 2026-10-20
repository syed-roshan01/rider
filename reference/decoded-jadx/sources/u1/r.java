package u1;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class r extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f15246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(w wVar, int i10) {
        super(1);
        this.f15245a = i10;
        this.f15246b = wVar;
    }

    public final void a(c9.a aVar) {
        int i10 = this.f15245a;
        w wVar = this.f15246b;
        switch (i10) {
            case 1:
                o0.i iVar = wVar.f15348u0;
                if (!iVar.h(aVar)) {
                    iVar.c(aVar);
                }
                break;
            default:
                Handler handler = wVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = wVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new v(aVar, 0));
                    }
                } else {
                    aVar.invoke();
                }
                break;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        c1.b bVar;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f15245a;
        boolean zRequestFocusFromTouch = true;
        w wVar = this.f15246b;
        switch (i10) {
            case 0:
                int i11 = ((l1.a) obj).f11192a;
                if (i11 == 1) {
                    zRequestFocusFromTouch = wVar.isInTouchMode();
                } else if (i11 != 2) {
                    zRequestFocusFromTouch = false;
                } else if (wVar.isInTouchMode()) {
                    zRequestFocusFromTouch = wVar.requestFocusFromTouch();
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            case 1:
                a((c9.a) obj);
                return lVar;
            case 2:
                KeyEvent keyEvent = ((m1.b) obj).f11786a;
                wVar.getClass();
                long jA = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
                if (m1.a.a(jA, m1.a.f11778h)) {
                    bVar = new c1.b(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (m1.a.a(jA, m1.a.f11776f)) {
                    bVar = new c1.b(4);
                } else if (m1.a.a(jA, m1.a.f11775e)) {
                    bVar = new c1.b(3);
                } else if (m1.a.a(jA, m1.a.f11773c) || m1.a.a(jA, m1.a.f11781k)) {
                    bVar = new c1.b(5);
                } else if (m1.a.a(jA, m1.a.f11774d) || m1.a.a(jA, m1.a.f11782l)) {
                    bVar = new c1.b(6);
                } else if (m1.a.a(jA, m1.a.f11777g) || m1.a.a(jA, m1.a.f11779i) || m1.a.a(jA, m1.a.f11783m)) {
                    bVar = new c1.b(7);
                } else {
                    bVar = (m1.a.a(jA, m1.a.f11772b) || m1.a.a(jA, m1.a.f11780j)) ? new c1.b(8) : null;
                }
                return (bVar == null || !z6.a.B(androidx.compose.ui.input.key.a.b(keyEvent), 2)) ? Boolean.FALSE : Boolean.valueOf(((c1.f) wVar.getFocusOwner()).b(bVar.f2875a));
            default:
                a((c9.a) obj);
                return lVar;
        }
    }
}
