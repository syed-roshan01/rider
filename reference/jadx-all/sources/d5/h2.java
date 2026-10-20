package d5;

import a7.C0008;
import aa.C0012;
import androidx.compose.foundation.layout.C0022;
import b.C0049;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.installations.C0177;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.migration.C0240;
import h8.C0315;
import p5.C0378;
import q1.C0384;
import r5.C0400;
import r6.C0402;
import u4.C0436;
import u8.C0439;
import v9.C0452;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(MainViewModel mainViewModel, boolean z10, int i10, int i11, int i12) {
        super(C0486.f759 ^ 53);
        this.f4547a = i12;
        this.f4548b = mainViewModel;
        this.f4549c = z10;
        this.f4550d = i10;
        this.f4551e = i11;
        int iM8793 = C0452.m8793();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8793 >= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0439.m8565("leXKGHqcH")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h2(boolean z10, c9.a aVar, int i10, int i11) {
        int i12 = C0315.f462 ^ 256;
        this.f4547a = i12;
        this.f4549c = z10;
        this.f4548b = aVar;
        this.f4550d = i10;
        this.f4551e = i11;
        super(i12);
        int iM7828 = C0400.m7828();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7828 <= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0022.m426("iufgoE4FdcQEJm0F8hIz")));
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
        int iM4388 = C0228.m4388(this);
        boolean zM7860 = C0402.m7860(this);
        int iM3047 = C0159.m3047(this);
        int iM2001 = C0102.m2001(this);
        Object objM7392 = C0378.m7392(this);
        switch (iM4388) {
            case 0:
                C0133.m2563((MainViewModel) objM7392, zM7860, mVar, C0008.m159((iM2001 ^ 1) | (iM2001 & 1)), iM3047);
                break;
            case 1:
                C0133.m2563((MainViewModel) objM7392, zM7860, mVar, C0008.m159((iM2001 ^ 1) | (iM2001 & 1)), iM3047);
                break;
            default:
                C0384.m7513(zM7860, (c9.a) objM7392, mVar, (iM2001 ^ 1) | (iM2001 & 1), iM3047);
                int iM3380 = C0177.m3380();
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM3380 <= 0) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Integer.valueOf(C0240.m4599("zsmnKkl")));
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
        switch (C0228.m4388(this)) {
            case 0:
                C0049.m962(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            case 1:
                C0049.m962(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
            default:
                C0049.m962(this, (m0.m) obj, C0436.m8515((Number) obj2));
                return lVarM238;
        }
    }
}
