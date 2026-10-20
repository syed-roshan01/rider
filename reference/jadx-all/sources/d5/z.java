package d5;

import a8.C0009;
import aa.C0012;
import androidx.fragment.app.C0042;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0225;
import h0.C0300;
import h6.C0310;
import j9.C0330;
import l0.C0340;
import v0.C0442;

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
        int iM8612 = C0442.m8612();
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
        String str = "ۣۧۥ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56545:
                    this = new z(zM5985, g1VarM186, eVar);
                    str = "ۣۥ۠";
                    break;
                case 1750718:
                    return this;
                case 1754505:
                    zM5985 = C0310.m5985(this);
                    str = "ۤۡۨ";
                    break;
                default:
                    g1VarM186 = C0009.m186(this);
                    str = "ۧۨ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۥۨ";
        u8.e eVar = null;
        Object objM3087 = obj;
        u8.e eVarM6664 = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56350:
                    objM3087 = C0161.m3087(this, lVarM238);
                    str = "ۨ۟ۦ";
                    break;
                case 1746940:
                    eVarM6664 = C0340.m6664(this, d0Var, eVar);
                    str = "ۣۤۦ";
                    break;
                case 1750693:
                    str = "ۧۥۣ";
                    this = (z) eVarM6664;
                    break;
                case 1750755:
                    str = "۟ۧۤ";
                    eVar = (u8.e) obj2;
                    break;
                case 1754565:
                    str = "ۡ۟";
                    lVarM238 = C0012.m238();
                    break;
                case 1755343:
                    return lVarM238;
                default:
                    str = "ۣۦۦ";
                    d0Var = (m9.d0) objM3087;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        boolean zM5985 = false;
        String str = "ۤۨ۟";
        m0.g1 g1VarM186 = null;
        q8.l lVarM238 = null;
        Boolean boolM192 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746687:
                    str = "ۦۣۧ";
                    boolM192 = C0009.m192(zM5985);
                    break;
                case 1746726:
                    C0225.m4315(g1VarM186, boolM192);
                    str = "ۢۡۥ";
                    break;
                case 1747775:
                    zM5985 = C0310.m5985(this);
                    str = "۟۟۟";
                    break;
                case 1749638:
                    str = "ۣۨۢ";
                    lVarM238 = C0012.m238();
                    break;
                case 1751771:
                    C0300.m5766();
                    str = "ۡۡ";
                    break;
                case 1753546:
                    g1VarM186 = C0009.m186(this);
                    str = "۟۠ۧ";
                    break;
                case 1755463:
                    return lVarM238;
                default:
                    C0330.m6365(obj);
                    str = "ۣ۠ۢ";
                    break;
            }
        }
    }
}
