package y;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.List;
import m0.w2;

/* JADX INFO: loaded from: classes.dex */
public final class r extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16670f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f16671n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        super(1);
        this.f16665a = i10;
        this.f16666b = obj;
        this.f16667c = obj2;
        this.f16668d = obj3;
        this.f16669e = obj4;
        this.f16670f = obj5;
        this.f16671n = obj6;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f16665a;
        Object obj2 = this.f16671n;
        Object obj3 = this.f16670f;
        Object obj4 = this.f16669e;
        Object obj5 = this.f16668d;
        Object obj6 = this.f16666b;
        Object obj7 = this.f16667c;
        switch (i10) {
            case 0:
                r1.w0 w0Var = (r1.w0) obj;
                r1.x0[] x0VarArr = (r1.x0[]) obj6;
                List list = (List) obj7;
                r1.l0 l0Var = (r1.l0) obj5;
                d9.s sVar = (d9.s) obj4;
                d9.s sVar2 = (d9.s) obj3;
                s sVar3 = (s) obj2;
                int length = x0VarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i12 < length) {
                    r1.x0 x0Var = x0VarArr[i12];
                    d7.a.k(x0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    p.b(w0Var, x0Var, (r1.i0) list.get(i11), l0Var.getLayoutDirection(), sVar.f4950a, sVar2.f4950a, sVar3.f16674a);
                    i12++;
                    i11++;
                }
                return q8.l.f13235a;
            default:
                d7.a.m((m0.o0) obj, "$this$DisposableEffect");
                m0.f1 f1Var = (m0.f1) obj7;
                if (((w2) f1Var).d() == -1) {
                    return new f0.q();
                }
                Context context = (Context) obj6;
                d5.w wVar = new d5.w(context, f1Var, (m0.g1) obj5, (m0.g1) obj4, (m0.d1) obj3, (m0.g1) obj2);
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(wVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
                } else {
                    context.registerReceiver(wVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
                }
                return new t.r0(9, context, wVar);
        }
    }
}
