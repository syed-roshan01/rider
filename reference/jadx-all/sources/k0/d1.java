package k0;

import a7.C0008;
import aa.C0012;
import c4.C0064;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0253;
import h3.C0302;
import h8.C0314;
import l0.C0340;
import s6.C0414;
import u4.C0436;
import v6.C0447;
import w5.C0463;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0.o f8822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8825f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f8826n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, String str, y0.o oVar, long j10, int i10, int i11, int i12) {
        super(C0340.f610 ^ (-971));
        this.f8820a = i12;
        this.f8826n = obj;
        this.f8821b = str;
        this.f8822c = oVar;
        this.f8823d = j10;
        this.f8824e = i10;
        this.f8825f = i11;
        int iM1729 = C0080.m1729();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1729 >= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0164.m3141("nOAA")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        int iM1246 = C0064.m1246(this);
        int iM9016 = C0463.m9016(this);
        Object objM4663 = C0244.m4663(this);
        switch (iM1246) {
            case 0:
                C0142.m2736((i1.f) objM4663, C0195.m3744(this), C0253.m4820(this), C0414.m8109(this), mVar, C0008.m159((iM9016 ^ 1) | (iM9016 & 1)), C0314.m6055(this));
                break;
            default:
                C0121.m2338((h1.c) objM4663, C0195.m3744(this), C0253.m4820(this), C0414.m8109(this), mVar, C0008.m159((iM9016 ^ 1) | (iM9016 & 1)), C0314.m6055(this));
                int iM4678 = C0244.m4678();
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM4678 <= 0) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Float.parseFloat(C0302.m5815("x9S0FssDJGmtc1d2fUZcI3H0F")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i11 = 1678;
                }
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0064.m1246(this)) {
            case 0:
                C0447.m8701(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0447.m8701(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
