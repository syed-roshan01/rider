package k6;

import android.content.SharedPreferences;
import android.os.C0013;
import androidx.core.app.C0040;
import c7.C0068;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import fa.C0281;
import h0.C0299;
import k2.C0333;
import n.C0361;
import u1.C0432;
import z0.C0482;

/* JADX INFO: loaded from: classes.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l4 f10225e;

    public n4(l4 l4Var, String str, boolean z10) {
        this.f10225e = l4Var;
        C0281.m5438(str);
        this.f10221a = str;
        this.f10222b = z10;
        int iM1322 = C0068.m1322();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1322 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0299.m5769("rWIvoP0XY")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void a(boolean z10) {
        String str = "\u06e1\u06e5\u06e3";
        l4 l4VarM3955 = null;
        SharedPreferences sharedPreferencesM7082 = null;
        SharedPreferences.Editor editorM3199 = null;
        String strM252 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748799:
                    l4VarM3955 = C0207.m3955(this);
                    str = "\u06df\u06e8\u06e3";
                    break;
                case 1752518:
                    str = "\u06e5\u06e1\u06e4";
                    strM252 = C0013.m252(this);
                    break;
                case 1752520:
                    C0482.m9390(editorM3199, strM252, z10);
                    str = "\u06e8\u06e4\u06e8";
                    break;
                case 1753484:
                    return;
                case 1754531:
                    str = "\u06e5\u06e1\u06e2";
                    editorM3199 = C0167.m3199(sharedPreferencesM7082);
                    break;
                case 1755500:
                    C0333.m6480(editorM3199);
                    str = "\u06e8\u06e8\u06e3";
                    break;
                case 1755619:
                    this.f10224d = z10;
                    str = "\u06e6\u06e1\u06e7";
                    break;
                default:
                    str = "\u06e7\u06e4\u06e0";
                    sharedPreferencesM7082 = C0361.m7082(l4VarM3955);
                    break;
            }
        }
    }

    public final boolean b() {
        boolean zM2291 = C0119.m2291(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM2291) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    this.f10223c = true;
                    this.f10224d = C0146.m2784(C0361.m7082(C0207.m3955(this)), C0013.m252(this), C0040.m778(this));
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0432.m8471(this);
    }
}
