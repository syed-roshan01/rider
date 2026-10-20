package f4;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6165c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f6163a = i10;
        this.f6165c = obj;
        this.f6164b = obj2;
    }

    @Override // f4.p
    public final void c(q qVar) {
        int i10 = this.f6163a;
        Object obj = this.f6164b;
        switch (i10) {
            case 0:
                d0 d0Var = z.f6227a;
                d0Var.M((View) obj, 1.0f);
                d0Var.getClass();
                qVar.w(this);
                break;
            case 1:
                ((ArrayList) ((q.f) obj).get(((s) this.f6165c).f6216b)).remove(qVar);
                qVar.w(this);
                break;
            default:
                ((q) obj).z();
                qVar.w(this);
                break;
        }
    }
}
