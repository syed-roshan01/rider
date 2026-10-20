package c5;

import android.content.Context;
import android.widget.Toast;
import com.auto.accept.ui.viewmodel.MainViewModel;
import m0.l3;
import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f3015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f3016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f3017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, MainViewModel mainViewModel, l3 l3Var, l3 l3Var2, u8.e eVar) {
        super(2, eVar);
        this.f3014a = context;
        this.f3015b = mainViewModel;
        this.f3016c = l3Var;
        this.f3017d = l3Var2;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new t(this.f3014a, this.f3015b, this.f3016c, this.f3017d, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        t tVar = (t) create((d0) obj, (u8.e) obj2);
        q8.l lVar = q8.l.f13235a;
        tVar.invokeSuspend(lVar);
        return lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        if (((Boolean) this.f3016c.getValue()).booleanValue()) {
            l3 l3Var = this.f3017d;
            if (((String) l3Var.getValue()).length() > 0) {
                Toast.makeText(this.f3014a, (String) l3Var.getValue(), 1).show();
                this.f3015b.f3086d0.i(Boolean.FALSE);
            }
        }
        return q8.l.f13235a;
    }
}
