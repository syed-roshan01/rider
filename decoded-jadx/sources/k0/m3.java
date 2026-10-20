package k0;

import aa.C0012;
import c4.C0066;
import com.google.firebase.annotations.concurrent.C0124;
import e0.C0256;
import h0.C0299;
import j3.C0325;
import j9.C0329;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends w8.i implements c9.e {
    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        m3 m3Var = null;
        String str = "\u06df\u06e2";
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56506:
                    m3Var = new m3(i11, eVar);
                    str = "\u06e2\u06df\u06e2";
                    break;
                case 1749573:
                    return m3Var;
                case 1755522:
                    str = "\u06e6\u06e0";
                    i11 = i10 ^ (-220);
                    break;
                default:
                    i10 = C0066.f86;
                    str = "\u06e8\u06e5\u06df";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e0\u06e6\u06df";
        Object objM4904 = obj;
        q8.l lVarM238 = null;
        u8.e eVar = null;
        u8.e eVarM6293 = null;
        o1.z zVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747744:
                    eVarM6293 = C0325.m6293(this, zVar, eVar);
                    str = "\u06e1\u06e2\u06e8";
                    break;
                case 1747865:
                    str = "\u06e8\u06e6\u06e0";
                    zVar = (o1.z) objM4904;
                    break;
                case 1748711:
                    str = "\u06e6\u06e3\u06e8";
                    this = (m3) eVarM6293;
                    break;
                case 1750819:
                    objM4904 = C0256.m4904(this, lVarM238);
                    str = "\u06e6\u06e1\u06e4";
                    break;
                case 1753481:
                    return lVarM238;
                case 1755554:
                    str = "\u06e0\u06e2\u06e2";
                    eVar = (u8.e) obj2;
                    break;
                default:
                    str = "\u06e3\u06e8\u06e8";
                    lVarM238 = C0012.m238();
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        q8.l lVarM238 = null;
        String str = "\u06df\u06e8\u06e7";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56543:
                    return lVarM238;
                case 1746974:
                    C0299.m5766();
                    str = "\u06e6\u06e1\u06e2";
                    break;
                case 1753479:
                    C0329.m6365(obj);
                    str = "\u06e7\u06e1\u06e5";
                    break;
                default:
                    lVarM238 = C0012.m238();
                    str = "\u06e7\u06e6";
                    break;
            }
        }
    }
}
