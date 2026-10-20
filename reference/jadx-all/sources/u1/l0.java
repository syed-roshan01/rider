package u1;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f15158b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(p0 p0Var, int i10) {
        super(1);
        this.f15157a = i10;
        this.f15158b = p0Var;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f15157a;
        p0 p0Var = this.f15158b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(p0Var.f15195d.getParent().requestSendAccessibilityEvent(p0Var.f15195d, (AccessibilityEvent) obj));
            default:
                r2 r2Var = (r2) obj;
                p0Var.getClass();
                if (r2Var.f15251b.contains(r2Var)) {
                    p0Var.f15195d.getSnapshotObserver().a(r2Var, p0Var.V, new u.r0(15, r2Var, p0Var));
                }
                return q8.l.f13235a;
        }
    }
}
