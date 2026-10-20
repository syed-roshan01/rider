package a5;

import android.support.v4.app.C0014;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.C0255;
import dagger.hilt.android.internal.modules.C0234;
import f4.C0274;
import n7.C0363;
import o2.C0368;
import o7.i2;
import p8.C0379;
import q7.C0390;
import u.C0429;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements EventListener {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f21short = {2451, 2485, 2467, 2484, 2534, 2466, 2473, 2469, 2483, 2475, 2467, 2472, 2482, 2534, 2472, 2473, 2482, 2534, 2464, 2473, 2483, 2472, 2466};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9.r f1298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f1299b;

    public /* synthetic */ r(o9.r rVar, z zVar) {
        this.f1298a = rVar;
        this.f1299b = zVar;
        int iM2863 = C0149.m2863();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2863 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0234.m4515("sAz5QEyZpDleKC")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m138() {
        int iM2227 = C0115.m2227();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2227 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f21short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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

    @Override // com.google.firebase.firestore.EventListener
    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        DocumentSnapshot documentSnapshot = (DocumentSnapshot) obj;
        o9.r rVarM5280 = C0274.m5280(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (firebaseFirestoreException != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0363.m7122((o9.q) rVarM5280, new q8.h(C0195.m3728(firebaseFirestoreException)));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                case 239:
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = documentSnapshot == null ? 48705 : 48736;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                boolean zM7232 = C0368.m7232(documentSnapshot);
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            C0014.m280(C0379.m7446(this));
                                            C0363.m7122((o9.q) rVarM5280, new q8.h(C0255.m4877(documentSnapshot)));
                                            int i14 = 49666;
                                            while (true) {
                                                i14 ^= 49683;
                                                switch (i14) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i14 = 49697;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        return;
                                                }
                                            }
                                            break;
                                        case 76:
                                            int i15 = 48891;
                                            while (true) {
                                                i15 ^= 48908;
                                                switch (i15) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i15 = 48922;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            if (!zM7232) {
                                                i13 = 48860;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48829;
                                }
                                break;
                            case 47483:
                                break;
                        }
                    }
                    C0363.m7122((o9.q) rVarM5280, new q8.h(C0195.m3728(new Exception(C0429.m8416(m138(), 0, C0390.f661 ^ (-302), 2502)))));
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
