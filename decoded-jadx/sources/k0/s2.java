package k0;

import aa.C0012;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import h7.C0310;
import i9.C0321;
import k3.C0334;
import o2.C0368;
import p5.C0377;
import v8.C0450;
import z1.C0483;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f9448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(x2 x2Var, int i10) {
        super(0);
        this.f9447a = i10;
        this.f9448b = x2Var;
        int iM7389 = C0377.m7389();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7389 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0152.m2923("6dpbUuq"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.a
    public final Object invoke() {
        q8.l lVarM238 = C0012.m238();
        l3 l3VarM9523 = C0489.m9523();
        l3 l3VarM7235 = C0368.m7235();
        x2 x2VarM9408 = C0483.m9408(this);
        int iM6003 = C0310.m6003(this);
        switch (iM6003) {
            case 0:
                m9.k kVarM8773 = C0450.m8773(x2VarM9408);
                boolean zM6220 = C0321.m6220(kVarM8773);
                int i10 = 49790;
                while (true) {
                    i10 ^= 49807;
                    switch (i10) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 51:
                            break;
                        case 84:
                            C0107.m2090(kVarM8773, l3VarM7235);
                            break;
                        case 241:
                            i10 = zM6220 ? 49883 : 49852;
                            break;
                        default:
                            break;
                    }
                }
                return C0334.m6483();
            case 1:
                switch (iM6003) {
                    case 1:
                        m9.k kVarM8774 = C0450.m8773(x2VarM9408);
                        boolean zM6221 = C0321.m6220(kVarM8774);
                        int i11 = 49666;
                        while (true) {
                            i11 ^= 49683;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (zM6221) {
                                        i11 = 49759;
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 76:
                                    C0107.m2090(kVarM8774, l3VarM9523);
                                    return lVarM238;
                                case 83:
                                    return lVarM238;
                                default:
                                    continue;
                            }
                            i11 = 49728;
                        }
                        break;
                    default:
                        m9.k kVarM8775 = C0450.m8773(x2VarM9408);
                        boolean zM6222 = C0321.m6220(kVarM8775);
                        int i12 = 48767;
                        while (true) {
                            i12 ^= 48784;
                            switch (i12) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    return lVarM238;
                                case 76:
                                    C0107.m2090(kVarM8775, l3VarM7235);
                                    int i13 = 48891;
                                    while (true) {
                                        i13 ^= 48908;
                                        switch (i13) {
                                            case 22:
                                                return lVarM238;
                                            case 503:
                                                i13 = 48922;
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    if (zM6222) {
                                        i12 = 48860;
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i12 = 48829;
                        }
                        break;
                }
                break;
            default:
                switch (iM6003) {
                    case 1:
                        m9.k kVarM8776 = C0450.m8773(x2VarM9408);
                        boolean zM6223 = C0321.m6220(kVarM8776);
                        int i14 = 1864;
                        while (true) {
                            i14 ^= 1881;
                            switch (i14) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (zM6223) {
                                        i14 = 48736;
                                    }
                                    break;
                                case 47384:
                                    return lVarM238;
                                case 47417:
                                    C0107.m2090(kVarM8776, l3VarM9523);
                                    return lVarM238;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i14 = 48705;
                        }
                        break;
                    default:
                        m9.k kVarM8777 = C0450.m8773(x2VarM9408);
                        boolean zM6224 = C0321.m6220(kVarM8777);
                        int i15 = 1616;
                        while (true) {
                            i15 ^= 1633;
                            switch (i15) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 49:
                                    if (zM6224) {
                                        i15 = 1709;
                                    }
                                    break;
                                case 204:
                                    C0107.m2090(kVarM8777, l3VarM7235);
                                    int i16 = 1740;
                                    while (true) {
                                        i16 ^= 1757;
                                        switch (i16) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i16 = 1771;
                                                break;
                                            case 54:
                                                return lVarM238;
                                        }
                                    }
                                    break;
                                case 239:
                                    return lVarM238;
                                default:
                                    continue;
                            }
                            i15 = 1678;
                        }
                        break;
                }
                break;
        }
    }
}
