package u1;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f15173b = new o0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f15174c = new o0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0 f15175d = new o0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0 f15176e = new o0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15177a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i10) {
        super(2);
        this.f15177a = i10;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f15177a) {
            case 0:
                y1.j jVarH = ((y1.o) obj).h();
                y1.u uVar = y1.r.f16829n;
                q0 q0Var = q0.f15218c;
                return Integer.valueOf(Float.compare(((Number) jVarH.i(uVar, q0Var)).floatValue(), ((Number) ((y1.o) obj2).h().i(uVar, q0Var)).floatValue()));
            case 1:
                m0.m mVar = (m0.m) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                return lVar;
            case 2:
                ((v1) obj).I((Matrix) obj2);
                return lVar;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return lVar;
        }
    }
}
