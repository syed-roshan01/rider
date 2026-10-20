package z;

import a0.r0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import com.auto.accept.ui.viewmodel.MainViewModel;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import m0.g1;
import m0.l3;
import t1.k0;
import t1.n0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Context context, Object obj, l3 l3Var, int i10) {
        super(0);
        this.f17098a = i10;
        this.f17100c = context;
        this.f17101d = obj;
        this.f17099b = l3Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    public final List a() {
        List listA;
        int i10 = this.f17098a;
        Object obj = this.f17101d;
        Object obj2 = this.f17100c;
        Object obj3 = this.f17099b;
        switch (i10) {
            case 8:
                f6.a aVar = ((x9.f) obj3).f16389b;
                if (aVar != null) {
                    listA = aVar.A((String) obj, (List) obj2);
                    if (listA == null) {
                        listA = (List) obj2;
                    }
                } else {
                    listA = (List) obj2;
                }
                List<Certificate> list = listA;
                ArrayList arrayList = new ArrayList(f9.a.y0(list));
                for (Certificate certificate : list) {
                    d7.a.k(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                f6.a aVar2 = ((x9.f) obj3).f16389b;
                d7.a.j(aVar2);
                return aVar2.A(((x9.a) obj).f16327i.f16458d, ((x9.o) obj2).a());
        }
    }

    @Override // c9.a
    public final Object invoke() {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f17098a;
        Object obj = this.f17101d;
        Object obj2 = this.f17100c;
        Object obj3 = this.f17099b;
        switch (i10) {
            case 0:
                g gVar = (g) ((l3) obj3).getValue();
                g0 g0Var = (g0) obj2;
                return new m(g0Var, gVar, (c) obj, new r0((i9.g) g0Var.f17047c.f17184e.getValue(), gVar));
            case 1:
                return new b0.r((c9.g) ((l3) obj3).getValue(), (c9.c) ((l3) obj2).getValue(), ((Number) ((c9.a) obj).invoke()).intValue());
            case 2:
                c0.m mVar = (c0.m) obj3;
                d1.d dVarH0 = c0.m.H0(mVar, (r1.s) obj2, (c9.a) obj);
                if (dVarH0 == null) {
                    return null;
                }
                v.s sVar = (v.s) mVar.f2870w;
                if (!(!m2.k.a(sVar.D, 0L))) {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
                }
                long jK0 = sVar.K0(sVar.D, dVarH0);
                return dVarH0.g(d9.i.f(-d1.c.d(jK0), -d1.c.e(jK0)));
            case 3:
                m9348invoke();
                return lVar;
            case 4:
                m9348invoke();
                return lVar;
            case 5:
                m9348invoke();
                return lVar;
            case 6:
                m9348invoke();
                return lVar;
            case 7:
                m9348invoke();
                return lVar;
            case 8:
                return a();
            default:
                return a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f17098a = i10;
        this.f17099b = obj;
        this.f17100c = obj2;
        this.f17101d = obj3;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m9348invoke() {
        int i10 = this.f17098a;
        int i11 = 0;
        Object obj = this.f17100c;
        Object obj2 = this.f17099b;
        Object obj3 = this.f17101d;
        switch (i10) {
            case 3:
                k0 k0Var = (k0) obj2;
                n0 n0Var = k0Var.D;
                n0Var.f14503j = 0;
                o0.i iVarT = n0Var.f14494a.t();
                int i12 = iVarT.f12343c;
                if (i12 > 0) {
                    Object[] objArr = iVarT.f12341a;
                    int i13 = 0;
                    do {
                        k0 k0Var2 = ((androidx.compose.ui.node.a) objArr[i13]).D.f14509p;
                        d7.a.j(k0Var2);
                        k0Var2.f14464n = k0Var2.f14465o;
                        k0Var2.f14465o = Integer.MAX_VALUE;
                        if (k0Var2.f14466p == 2) {
                            k0Var2.f14466p = 3;
                        }
                        i13++;
                    } while (i13 < i12);
                }
                k0Var.k(t1.f.f14416c);
                t1.r0 r0Var = k0Var.l().O;
                if (r0Var != null) {
                    boolean z10 = r0Var.f14532n;
                    List listM = ((n0) obj3).f14494a.m();
                    int size = listM.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        t1.r0 r0VarI0 = ((androidx.compose.ui.node.a) listM.get(i14)).C.f14577c.I0();
                        if (r0VarI0 != null) {
                            r0VarI0.f14532n = z10;
                        }
                    }
                }
                ((t1.r0) obj).s0().e();
                if (k0Var.l().O != null) {
                    List listM2 = ((n0) obj3).f14494a.m();
                    int size2 = listM2.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        t1.r0 r0VarI1 = ((androidx.compose.ui.node.a) listM2.get(i15)).C.f14577c.I0();
                        if (r0VarI1 != null) {
                            r0VarI1.f14532n = false;
                        }
                    }
                }
                o0.i iVarT2 = k0Var.D.f14494a.t();
                int i16 = iVarT2.f12343c;
                if (i16 > 0) {
                    Object[] objArr2 = iVarT2.f12341a;
                    do {
                        k0 k0Var3 = ((androidx.compose.ui.node.a) objArr2[i11]).D.f14509p;
                        d7.a.j(k0Var3);
                        int i17 = k0Var3.f14464n;
                        int i18 = k0Var3.f14465o;
                        if (i17 != i18 && i18 == Integer.MAX_VALUE) {
                            k0Var3.m0();
                        }
                        i11++;
                    } while (i11 < i16);
                }
                k0Var.k(t1.f.f14417d);
                break;
            case 4:
                u1.a aVar = (u1.a) obj2;
                aVar.removeOnAttachStateChangeListener((k.d) obj);
                b.b bVar = (b.b) obj3;
                d7.a.m(bVar, "listener");
                h6.g.l0(aVar).f6612a.remove(bVar);
                break;
            case 5:
                ((Context) obj).startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + ((String) ((l3) obj2).getValue()))));
                ((MainViewModel) obj3).T.i("");
                break;
            case 6:
                MainViewModel mainViewModel = (MainViewModel) obj2;
                g1 g1Var = (g1) obj3;
                String str = (String) g1Var.getValue();
                mainViewModel.getClass();
                d7.a.m(str, "langCode");
                z4.d dVar = mainViewModel.f3081b;
                dVar.getClass();
                dVar.M.i(str);
                dVar.f17209c.edit().putString(dVar.L, str).apply();
                try {
                    List list = g5.b.f6616a;
                    g5.b.a(dVar.f17207a, str);
                    break;
                } catch (Exception unused) {
                }
                List list2 = g5.b.f6616a;
                Toast.makeText((Context) obj, g5.b.b("save_language", (String) g1Var.getValue()), 0).show();
                break;
            default:
                if (!((Boolean) ((g1) obj3).getValue()).booleanValue()) {
                    List list3 = g5.b.f6616a;
                    Toast.makeText((Context) obj, g5.b.b("enable_shizuku_first", (String) ((l3) obj2).getValue()), 0).show();
                    break;
                } else if (o7.d0.P()) {
                    try {
                        Process processB0 = o7.d0.b0(new String[]{"settings", "put", "global", "development_settings_enabled", "0"});
                        if (processB0 != null) {
                            processB0.waitFor();
                        }
                        Process processB1 = o7.d0.b0(new String[]{"settings", "put", "global", "adb_enabled", "0"});
                        if (processB1 != null) {
                            processB1.waitFor();
                        }
                        Log.d("ShellTapExecutor", "🔒 Hide Developer Settings executed via Shizuku");
                        if (processB0 != null && processB0.exitValue() == 0 && processB1 != null && processB1.exitValue() == 0) {
                            List list4 = g5.b.f6616a;
                            Toast.makeText((Context) obj, g5.b.b("dev_options_hidden", (String) ((l3) obj2).getValue()), 0).show();
                            break;
                        }
                    } catch (Exception e4) {
                        a7.a.t("hideDevSettings failed: ", e4.getMessage(), "ShellTapExecutor");
                    }
                }
                break;
        }
    }
}
