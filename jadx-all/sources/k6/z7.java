package k6;

import a.C0000;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.codegen.C0243;
import g3.C0289;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class z7 extends m7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashSet f10621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q.f f10622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f10623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f10624h;

    @Override // k6.m7
    public final boolean r() {
        return false;
    }

    public final a8 s(Integer num) {
        boolean zM4655 = C0243.m4655(C0000.m8(this), num);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM4655) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return (a8) C0183.m3495(C0000.m8(this), num);
                case 239:
                    a8 a8Var = new a8(this, C0195.m3745(this));
                    C0289.m5548(C0000.m8(this), num, a8Var);
                    return a8Var;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
