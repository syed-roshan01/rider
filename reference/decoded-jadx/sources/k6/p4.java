package k6;

import android.content.SharedPreferences;
import b4.C0052;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.measurement.C0181;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import fa.C0281;
import g4.C0289;
import g7.C0292;
import j3.C0325;
import k2.C0333;
import l8.C0345;
import n.C0361;
import q6.C0388;
import t2.C0420;
import x4.C0469;

/* JADX INFO: loaded from: classes.dex */
public final class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l4 f10275e;

    public p4(l4 l4Var, String str, long j10) {
        this.f10275e = l4Var;
        C0281.m5438(str);
        this.f10271a = str;
        this.f10272b = j10;
        int iM5634 = C0292.m5634();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5634 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0052.m1015("NAYhBRitD8hhp8khv9Ke6RqrcQ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final long a() {
        boolean zM6758 = C0345.m6758(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM6758) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    this.f10273c = true;
                    this.f10274d = C0245.m4711(C0361.m7082(C0110.m2130(this)), C0420.m8255(this), C0181.m3451(this));
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0289.m5583(this);
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorM3199 = C0167.m3199(C0361.m7082(C0110.m2130(this)));
        C0388.m7616(editorM3199, C0420.m8255(this), j10);
        C0333.m6480(editorM3199);
        this.f10274d = j10;
        int iM9143 = C0469.m9143();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9143 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0325.m6285("Iozjx7gQO5")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
