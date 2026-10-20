package k6;

import a6.C0007;
import android.support.v4.app.C0015;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.graphics.C0030;
import androidx.lifecycle.C0043;
import b8.C0055;
import c1.C0060;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0107;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.annotations.C0127;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import e7.C0265;
import f0.C0273;
import f6.C0278;
import h.C0298;
import i4.C0318;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m1.C0352;
import m4.C0354;
import p8.C0380;
import q1.C0384;
import r4.C0399;
import s6.C0414;
import w0.C0455;
import x5.C0471;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Iterator {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f590short = {1179, 1196, 1188, 1190, 1215, 1196, 1257, 1191, 1190, 1213, 1257, 1210, 1212, 1209, 1209, 1190, 1211, 1213, 1196, 1197};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10410a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterable f10412c;

    public u(com.google.crypto.tink.shaded.protobuf.r1 r1Var) {
        this.f10412c = r1Var;
        this.f10411b = C0107.m2089(C0007.m152(r1Var));
        int iM2699 = C0140.m2699();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2699 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0115.m2222("zEX5nrncRA3vGCPDic9PtynaIT")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public u(com.google.protobuf.n nVar) {
        boolean z10 = nVar instanceof com.google.protobuf.h2;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = z10 ? 1709 : 1678;
                    break;
                case 204:
                    com.google.protobuf.h2 h2Var = (com.google.protobuf.h2) nVar;
                    ArrayDeque arrayDeque = new ArrayDeque(C0471.m9167(h2Var));
                    this.f10411b = arrayDeque;
                    C0200.m3847(arrayDeque, h2Var);
                    this.f10412c = C0113.m2194(this, C0399.m7806(h2Var));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    this.f10411b = null;
                    this.f10412c = (com.google.protobuf.l) nVar;
                    break;
                default:
                    break;
            }
        }
        int iM3894 = C0203.m3894();
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM3894 <= 0) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    return;
                case 47417:
                    System.out.println(Float.decode(C0043.m842("bF1fLfBe4rek5GhjxDIdAYLE1Imo")));
                    return;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
    }

    public /* synthetic */ u(com.google.protobuf.n nVar, int i10) {
        this(nVar);
        int iM508 = C0026.m508();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM508 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0265.m5049("ZqXA2kdjVExprEYceu")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public u(com.google.protobuf.u2 u2Var) {
        this.f10412c = u2Var;
        this.f10411b = C0107.m2089(C0030.m580(u2Var));
        int iM8861 = C0455.m8861();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8861 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0318.m6148("vs8AwaPuzxXBhdwumJPS3Dr")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public u(s sVar) {
        this.f10412c = sVar;
        this.f10411b = C0273.m5256(C0060.m1152(C0152.m2916(sVar)));
        int iM7523 = C0384.m7523();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7523 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0055.m1068("UkwxYmf1OJirludo9")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۦۣۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6600() {
        int iM2143 = C0111.m2143();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2143 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f590short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0007. Please report as an issue. */
    public final com.google.protobuf.l a(com.google.protobuf.n nVar) {
        com.google.protobuf.n nVarM7806 = nVar;
        while (true) {
            boolean z10 = nVarM7806 instanceof com.google.protobuf.h2;
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = z10 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                return (com.google.protobuf.l) nVarM7806;
            }
            com.google.protobuf.h2 h2Var = (com.google.protobuf.h2) nVarM7806;
            C0200.m3847((ArrayDeque) C0352.m6894(this), h2Var);
            nVarM7806 = C0399.m7806(h2Var);
            int i11 = 1740;
            while (true) {
                i11 ^= 1757;
                switch (i11) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i11 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0023. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0037. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0077. Please report as an issue. */
    public final com.google.protobuf.l b() {
        com.google.protobuf.l lVarM2194;
        Iterable iterableM2065 = C0106.m2065(this);
        com.google.protobuf.l lVar = (com.google.protobuf.l) iterableM2065;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (lVar != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    com.google.protobuf.l lVar2 = (com.google.protobuf.l) iterableM2065;
                    while (true) {
                        ArrayDeque arrayDeque = (ArrayDeque) C0352.m6894(this);
                        int i11 = 1740;
                        while (true) {
                            i11 ^= 1757;
                            switch (i11) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i11 = arrayDeque != null ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    boolean zM7448 = C0380.m7448(arrayDeque);
                                    int i12 = 1864;
                                    while (true) {
                                        i12 ^= 1881;
                                        switch (i12) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i12 = zM7448 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                lVarM2194 = C0113.m2194(this, C0015.m298((com.google.protobuf.h2) C0354.m6922((ArrayDeque) C0352.m6894(this))));
                                                boolean zM312 = C0016.m312(lVarM2194);
                                                int i13 = 48891;
                                                while (true) {
                                                    i13 ^= 48908;
                                                    switch (i13) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 503:
                                                            i13 = !zM312 ? 49635 : 48953;
                                                            break;
                                                        case 32495:
                                                            int i14 = 49666;
                                                            while (true) {
                                                                i14 ^= 49683;
                                                                switch (i14) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i14 = 49697;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47417:
                                                int i15 = 48767;
                                                while (true) {
                                                    i15 ^= 48784;
                                                    switch (i15) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 239:
                                                            i15 = 48798;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                            this.f10412c = lVarM2194;
                            return lVar2;
                        }
                    }
                    lVarM2194 = null;
                    this.f10412c = lVarM2194;
                    return lVar2;
                case 239:
                    throw new NoSuchElementException();
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (C0136.m2626(this)) {
            case 0:
                return C0174.m3327((Iterator) C0352.m6894(this));
            case 1:
                return C0174.m3327((Iterator) C0352.m6894(this));
            case 2:
                com.google.protobuf.l lVar = (com.google.protobuf.l) C0106.m2065(this);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (lVar != null) {
                                i10 = 1709;
                            }
                            break;
                        case 204:
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = 1771;
                                        break;
                                    case 54:
                                        return true;
                                }
                            }
                            break;
                        case 239:
                            return false;
                        default:
                            continue;
                    }
                    i10 = 1678;
                }
                break;
            default:
                return C0174.m3327((Iterator) C0352.m6894(this));
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM2626 = C0136.m2626(this);
        switch (iM2626) {
            case 0:
                return (String) C0414.m8115((Iterator) C0352.m6894(this));
            case 1:
                switch (iM2626) {
                    case 1:
                        return (String) C0414.m8115((Iterator) C0352.m6894(this));
                    default:
                        String str = (String) C0414.m8115((Iterator) C0352.m6894(this));
                        int i10 = 1740;
                        while (true) {
                            i10 ^= 1757;
                            switch (i10) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i10 = 1771;
                                    break;
                                case 54:
                                    return str;
                            }
                        }
                        break;
                }
                break;
            case 2:
                return C0298.m5730(this);
            default:
                switch (iM2626) {
                    case 1:
                        return (String) C0414.m8115((Iterator) C0352.m6894(this));
                    default:
                        String str2 = (String) C0414.m8115((Iterator) C0352.m6894(this));
                        int i11 = 1616;
                        while (true) {
                            i11 ^= 1633;
                            switch (i11) {
                                case Code.UNAVAILABLE /* 14 */:
                                    return str2;
                                case 49:
                                    i11 = 1647;
                                    break;
                            }
                        }
                        break;
                }
                break;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (C0136.m2626(this)) {
            case 0:
                throw new UnsupportedOperationException(C0127.m2451(m6600(), 0, C0278.f422 ^ (-422), 1225));
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
