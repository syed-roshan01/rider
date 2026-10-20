package o1;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12399c;

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:30:0x0047  */
    /* JADX WARN: Code duplicated, block: B:31:0x0049  */
    public k(List list, f fVar) {
        this.f12397a = list;
        MotionEvent motionEvent = fVar != null ? fVar.f12361b.f12431b : null;
        int i10 = 0;
        this.f12398b = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = fVar != null ? fVar.f12361b.f12431b : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = fVar != null ? fVar.f12361b.f12431b : null;
        int i11 = 1;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked == 0) {
                i10 = 1;
            } else if (actionMasked == 1) {
                i10 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i10 = 1;
                        break;
                    case 6:
                        i10 = 2;
                        break;
                    case 7:
                        i10 = 3;
                        break;
                    case 8:
                        i10 = 6;
                        break;
                    case 9:
                        i10 = 4;
                        break;
                    case 10:
                        i10 = 5;
                        break;
                }
            } else {
                i10 = 3;
            }
            i11 = i10;
        } else {
            int size = list.size();
            while (i10 < size) {
                u uVar = (u) list.get(i10);
                if (m9.e0.t(uVar)) {
                    i11 = 2;
                } else if (!m9.e0.r(uVar)) {
                    i10++;
                }
            }
            i11 = 3;
        }
        this.f12399c = i11;
    }
}
