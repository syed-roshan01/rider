package d5;

import a8.C0009;
import aa.C0012;
import androidx.fragment.app.C0042;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import h0.C0299;
import h6.C0309;
import j9.C0329;
import l0.C0339;
import v0.C0441;

/* JADX INFO: loaded from: classes.dex */
public final class z extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.g1 f4872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(boolean z10, m0.g1 g1Var, u8.e eVar) {
        super(C0130.f156 ^ (-59), eVar);
        this.f4871a = z10;
        this.f4872b = g1Var;
        int iM8612 = C0441.m8612();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8612 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0042.m831("DFoFB")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        boolean zM5985 = false;
        m0.g1 g1VarM186 = null;
        String str = "\u06e7\u06e3\u06e5";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56545:
                    this = new z(zM5985, g1VarM186, eVar);
                    str = "\u06e3\u06e5\u06e0";
                    break;
                case 1750718:
                    return this;
                case 1754505:
                    zM5985 = C0309.m5985(this);
                    str = "\u06e4\u06e1\u06e8";
                    break;
                default:
                    g1VarM186 = C0009.m186(this);
                    str = "\u06e7\u06e8";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e5\u06e8";
        u8.e eVar = null;
        Object objM3087 = obj;
        u8.e eVarM6664 = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56350:
                    objM3087 = C0161.m3087(this, lVarM238);
                    str = "\u06e8\u06df\u06e6";
                    break;
                case 1746940:
                    eVarM6664 = C0339.m6664(this, d0Var, eVar);
                    str = "\u06e3\u06e4\u06e6";
                    break;
                case 1750693:
                    str = "\u06e7\u06e5\u06e3";
                    this = (z) eVarM6664;
                    break;
                case 1750755:
                    str = "\u06df\u06e7\u06e4";
                    eVar = (u8.e) obj2;
                    break;
                case 1754565:
                    str = "\u06e1\u06df";
                    lVarM238 = C0012.m238();
                    break;
                case 1755343:
                    return lVarM238;
                default:
                    str = "\u06e3\u06e6\u06e6";
                    d0Var = (m9.d0) objM3087;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        boolean zM5985 = false;
        String str = "\u06e4\u06e8\u06df";
        m0.g1 g1VarM186 = null;
        q8.l lVarM238 = null;
        Boolean boolM192 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746687:
                    str = "\u06e6\u06e3\u06e7";
                    boolM192 = C0009.m192(zM5985);
                    break;
                case 1746726:
                    C0224.m4315(g1VarM186, boolM192);
                    str = "\u06e2\u06e1\u06e5";
                    break;
                case 1747775:
                    zM5985 = C0309.m5985(this);
                    str = "\u06df\u06df\u06df";
                    break;
                case 1749638:
                    str = "\u06e8\u06e3\u06e2";
                    lVarM238 = C0012.m238();
                    break;
                case 1751771:
                    C0299.m5766();
                    str = "\u06e1\u06e1";
                    break;
                case 1753546:
                    g1VarM186 = C0009.m186(this);
                    str = "\u06df\u06e0\u06e7";
                    break;
                case 1755463:
                    return lVarM238;
                default:
                    C0329.m6365(obj);
                    str = "\u06e0\u06e3\u06e2";
                    break;
            }
        }
    }
}
