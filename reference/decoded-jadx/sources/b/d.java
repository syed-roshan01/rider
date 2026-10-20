package b;

import a2.a0;
import a2.b0;
import android.content.Context;
import android.widget.Toast;
import com.auto.accept.ui.viewmodel.MainViewModel;
import e1.n;
import f0.c2;
import f0.d2;
import f0.n1;
import g2.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.l3;
import m0.n0;
import m0.o0;
import o2.r;
import o2.u;
import t1.i0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2298f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f2293a = i10;
        this.f2294b = obj;
        this.f2295c = obj2;
        this.f2296d = obj3;
        this.f2297e = obj4;
        this.f2298f = obj5;
    }

    public final n0 a(o0 o0Var) {
        int i10 = this.f2293a;
        Object obj = this.f2298f;
        Object obj2 = this.f2296d;
        Object obj3 = this.f2297e;
        Object obj4 = this.f2295c;
        Object obj5 = this.f2294b;
        switch (i10) {
            case 0:
                a aVar = (a) obj5;
                aVar.f2288a = ((d.i) obj4).d((String) obj2, (e.b) obj3, new b((l3) obj, 0));
                return new c(aVar, 0);
            default:
                r rVar = (r) obj5;
                rVar.f12504u.addView(rVar, rVar.f12505v);
                rVar.i((c9.a) obj4, (u) obj3, (String) obj2, (m2.l) obj);
                return new c(rVar, 8);
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        a0 a0Var;
        String str;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f2293a;
        Object obj2 = this.f2297e;
        Object obj3 = this.f2296d;
        Object obj4 = this.f2295c;
        Object obj5 = this.f2294b;
        Object obj6 = this.f2298f;
        switch (i10) {
            case 0:
                return a((o0) obj);
            case 1:
                i0 i0Var = (i0) ((g1.e) obj);
                i0Var.a();
                float fQ = z6.a.q(((Number) ((t.d) obj5).d()).floatValue(), 0.0f, 1.0f);
                if (fQ != 0.0f) {
                    long j10 = ((g2.a0) obj3).f6510b;
                    int i11 = b0.f904c;
                    int iB = ((s) obj4).b((int) (j10 >> 32));
                    d2 d2VarD = ((c2) obj2).d();
                    d1.d dVar = (d2VarD == null || (a0Var = d2VarD.f5667a) == null) ? new d1.d(0.0f, 0.0f, 0.0f, 0.0f) : a0Var.c(iB);
                    float fV = i0Var.v(n1.f5828b);
                    float f10 = fV / 2;
                    float fM = z6.a.m(z6.a.o(dVar.f4332a + f10, d1.f.d(i0Var.f14447a.e()) - f10), f10);
                    i0Var.d((n) obj6, d9.i.f(fM, dVar.f4333b), d9.i.f(fM, dVar.f4335d), fV, 0, fQ, null, 3);
                }
                return lVar;
            case 2:
                return a((o0) obj);
            default:
                if (!((Boolean) obj).booleanValue()) {
                    ((MainViewModel) obj6).r(false);
                } else if (((List) obj5).isEmpty()) {
                    Map map = (Map) obj4;
                    if (!map.isEmpty()) {
                        Collection collectionValues = map.values();
                        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                            Iterator it = collectionValues.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Boolean) it.next()).booleanValue()) {
                                        str = "Ola/Uber need Shizuku running. Review your app selection in the Apps tab.";
                                    }
                                }
                            }
                        }
                        str = "Turn on at least one app in the Apps tab first.";
                    } else {
                        str = "Ola/Uber need Shizuku running. Review your app selection in the Apps tab.";
                    }
                    Toast.makeText((Context) obj3, str, 1).show();
                    ((c9.a) obj2).invoke();
                } else {
                    ((MainViewModel) obj6).r(true);
                }
                return lVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, c9.a aVar, u uVar, String str, m2.l lVar) {
        super(1);
        this.f2293a = 2;
        this.f2294b = rVar;
        this.f2295c = aVar;
        this.f2297e = uVar;
        this.f2296d = str;
        this.f2298f = lVar;
    }
}
