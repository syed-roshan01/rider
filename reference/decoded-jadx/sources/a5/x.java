package a5;

import androidx.compose.ui.node.C0037;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.remoteconfig.internal.Code;
import d5.C0218;
import fa.C0281;
import h0.C0299;

/* JADX INFO: loaded from: classes.dex */
public final class x extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f1319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, u8.e eVar) {
        super(eVar);
        this.f1319b = zVar;
        int iM2116 = C0109.m2116();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2116 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0037.m715("JfgMVbwnOzpnz5")));
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
    public final Object invokeSuspend(Object obj) {
        this.f1318a = obj;
        int iM5442 = C0281.m5442(this);
        this.f1320c = (iM5442 & Integer.MIN_VALUE) | (iM5442 ^ Integer.MIN_VALUE);
        Object objM2532 = C0131.m2532(C0218.m4214(this), null, null, this);
        v8.a aVarM5766 = C0299.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM2532 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM2532;
                case 239:
                    return new q8.h(objM2532);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
