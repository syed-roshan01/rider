package k6;

import android.os.Looper;
import b.C0049;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import i.C0316;
import u8.C0438;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements g, w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f10074a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f10075b = new h();

    public static boolean b() {
        Looper looperM6132 = C0316.m6132();
        Looper looperM3950 = C0207.m3950();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (looperM6132 == looperM3950) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    return false;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // k6.g
    public String a(String str, String str2) {
        return null;
    }

    @Override // k6.w3
    public Object zza() {
        C0049.m954();
        return C0438.m8554(C0136.m2638());
    }
}
