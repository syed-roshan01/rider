package k0;

import aa.C0012;
import androidx.compose.foundation.layout.C0022;
import c0.C0057;
import c1.C0059;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.C0256;
import dagger.hilt.codegen.C0243;
import dagger.hilt.internal.aggregatedroot.C0247;
import i.C0316;
import i5.C0319;
import i6.C0321;
import rikka.shizuku.C0407;
import s6.C0414;
import z8.C0493;

/* JADX INFO: loaded from: classes.dex */
public final class m extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i10) {
        super(1);
        this.f9190a = i10;
        this.f9191b = str;
        int iM6163 = C0319.m6163();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6163 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0316.m6114("yzdLqOhc4n3oyQS2I4MQV")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public final void a(y1.v vVar) {
        int iM7978 = C0407.m7978(this);
        String strM4726 = C0247.m4726(this);
        switch (iM7978) {
            case 0:
                C0201.m3861();
                y1.u uVarM1135 = C0059.m1135();
                j9.f fVar = C0201.m3861()[2];
                C0256.m4872(uVarM1135, vVar, strM4726);
                break;
            case 1:
                C0201.m3861();
                C0493.m9574((y1.j) vVar, C0022.m435(), C0321.m6195(strM4726));
                C0148.m2833(vVar, C0243.f322 ^ 393);
                break;
            default:
                C0201.m3861();
                C0493.m9574((y1.j) vVar, C0057.m1092(), strM4726);
                int iM3737 = C0195.m3737();
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM3737 >= 0) {
                                i10 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Long.decode(C0183.m3506("0dleQ")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i10 = 1678;
                }
                break;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q8.l lVarM238 = C0012.m238();
        switch (C0407.m7978(this)) {
            case 0:
                C0414.m8106(this, (y1.v) obj);
                return lVarM238;
            case 1:
                C0414.m8106(this, (y1.v) obj);
                return lVarM238;
            default:
                C0414.m8106(this, (y1.v) obj);
                return lVarM238;
        }
    }
}
