package f0;

import a7.C0008;
import aa.C0012;
import androidx.core.content.C0041;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import d9.C0223;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.internal.generatesrootinput.C0251;
import j5.C0328;
import ja.C0331;
import n.C0362;
import okhttp3.internal.publicsuffix.C0373;
import r.C0393;
import r2.C0398;
import t1.C0420;
import u4.C0436;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(long j10, Object obj, c9.e eVar, int i10, int i11) {
        super(C0133.f159 ^ 794);
        this.f5623a = i11;
        this.f5624b = j10;
        this.f5627e = obj;
        this.f5625c = eVar;
        this.f5626d = i10;
        int iM7675 = C0393.m7675();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7675 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0223.m4278("OtTqi")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String str, String str2, long j10, int i10) {
        int i11 = C0203.f227 ^ (-25);
        this.f5623a = i11;
        this.f5627e = str;
        this.f5625c = str2;
        this.f5624b = j10;
        this.f5626d = i10;
        super(i11);
        int iM8247 = C0420.m8247();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8247 <= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0328.m6326("boPb"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    public final void a(m0.m mVar, int i10) {
        int iM1578 = C0073.m1578(this);
        int iM799 = C0041.m799(this);
        Object objM7782 = C0398.m7782(this);
        Object objM4535 = C0236.m4535(this);
        switch (iM1578) {
            case 0:
                C0373.m7315(C0122.m2357(this), (y0.o) objM4535, (c9.e) objM7782, mVar, C0008.m159((iM799 & 1) | (iM799 ^ 1)));
                break;
            case 1:
                C0251.m4802(C0122.m2357(this), (a2.c0) objM4535, (c9.e) objM7782, mVar, C0008.m159((iM799 & 1) | (iM799 ^ 1)));
                break;
            default:
                C0362.m7084((String) objM4535, (String) objM7782, C0122.m2357(this), mVar, C0008.m159((iM799 & 1) | (iM799 ^ 1)));
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVarM238 = C0012.m238();
        switch (C0073.m1578(this)) {
            case 0:
                C0331.m6372(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            case 1:
                C0331.m6372(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0331.m6372(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
