package u1;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import java.util.Iterator;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class y1 implements View.OnDragListener, a1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1.e f15382a = new a1.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q.g f15383b = new q.g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f15384c = new t1.u0() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // t1.u0
        public final int hashCode() {
            return this.f1756b.f15382a.hashCode();
        }

        @Override // t1.u0
        public final n l() {
            return this.f1756b.f15382a;
        }

        @Override // t1.u0
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        a1.a aVar = new a1.a(dragEvent);
        int action = dragEvent.getAction();
        a1.e eVar = this.f15382a;
        switch (action) {
            case 1:
                boolean zG0 = eVar.G0(aVar);
                Iterator<E> it = this.f15383b.iterator();
                while (it.hasNext()) {
                    ((a1.e) ((a1.c) it.next())).M0(aVar);
                }
                return zG0;
            case 2:
                eVar.L0(aVar);
                return false;
            case 3:
                return eVar.H0(aVar);
            case 4:
                eVar.I0(aVar);
                return false;
            case 5:
                eVar.J0(aVar);
                return false;
            case 6:
                eVar.K0(aVar);
                return false;
            default:
                return false;
        }
    }
}
