package k6;

import a.C0000;
import a0.C0003;
import c4.C0065;
import c7.C0069;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0170;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import e2.C0261;
import fa.C0282;
import g5.C0292;
import g7.C0293;
import j9.C0330;
import l2.C0342;
import p3.C0376;
import u8.C0439;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f10372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f10373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f10374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f10375k;

    public t(String str, String str2, long j10) {
        this(str, str2, 0L, 0L, 0L, j10, 0L, null, null, null, null);
        int iM2805 = C0147.m2805();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2805 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0439.m8565("A9Lp4wzRWghech1Z9S")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public t(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        C0282.m5438(str);
        C0282.m5438(str2);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = j10 >= 0 ? 1709 : 1678;
                    break;
                case 204:
                    z10 = true;
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
                    z10 = false;
                    break;
                default:
                    break;
            }
        }
        C0261.m4977(z10);
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = j11 >= 0 ? 48736 : 48705;
                    break;
                case 47384:
                    z11 = false;
                    break;
                case 47417:
                    z11 = true;
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i13 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        C0261.m4977(z11);
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    z12 = false;
                    break;
                case 503:
                    i14 = j12 >= 0 ? 49635 : 48953;
                    break;
                case 32495:
                    z12 = true;
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = 49697;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        C0261.m4977(z12);
        int i16 = 49790;
        while (true) {
            i16 ^= 49807;
            switch (i16) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    z13 = false;
                    break;
                case 84:
                    int i17 = 49914;
                    while (true) {
                        i17 ^= 49931;
                        switch (i17) {
                            case 497:
                                i17 = 50596;
                                continue;
                            case 1711:
                                z13 = true;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i16 = j14 >= 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        C0261.m4977(z13);
        this.f10365a = str;
        this.f10366b = str2;
        this.f10367c = j10;
        this.f10368d = j11;
        this.f10369e = j12;
        this.f10370f = j13;
        this.f10371g = j14;
        this.f10372h = l10;
        this.f10373i = l11;
        this.f10374j = l12;
        this.f10375k = bool;
        int iM3247 = C0170.m3247();
        int i18 = 50689;
        while (true) {
            i18 ^= 50706;
            switch (i18) {
                case 19:
                    if (iM3247 >= 0) {
                        i18 = 50782;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    return;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    System.out.println(Long.decode(C0104.m2042("iZQQfUnTmV")));
                    return;
                default:
                    continue;
            }
            i18 = 50751;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0018. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0004. Please report as an issue. */
    public final t a(Long l10, Long l11, Boolean bool) {
        Boolean bool2;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = bool != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM14 = C0000.m14(bool);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = !zM14 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                bool2 = bool;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            break;
                                        case 47483:
                                            bool2 = null;
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    bool2 = bool;
                    break;
                default:
                    break;
            }
        }
        return new t(C0376.m7358(this), C0065.m1256(this), C0330.m6361(this), C0342.m6693(this), C0069.m1352(this), C0292.m5611(this), C0293.m5635(this), C0003.m66(this), l10, l11, bool2);
    }
}
