package com.auto.accept.app;

import a8.C0009;
import androidx.annotation.C0019;
import com.google.android.datatransport.cct.C0078;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0212;
import dagger.hilt.android.HiltAndroidApp;
import f.C0269;
import g2.C0286;
import g5.C0291;
import java.util.ArrayList;
import la.f;
import m7.C0356;
import m7.C0357;
import o7.i2;
import q1.C0383;
import r2.C0395;
import t2.C0423;
import y4.a;
import y4.r;

/* JADX INFO: loaded from: classes.dex */
@HiltAndroidApp
public final class AutoAcceptApp extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f3076c = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f91short = {3144, 3196, 3197, 3174, 3144, 3178, 3178, 3180, 3193, 3197, 3144, 3193, 3193, 1272, 1219, 1218, 1233, 1246, 1216, 1246, 1163, 1223, 1218, 1240, 1247, 1230, 1221, 1230, 1241, 1163, 1240, 1230, 1247, 1246, 1243, 1163, 1230, 1241, 1241, 1220, 1241, 1169, 1163};

    public AutoAcceptApp() {
        int iM7523 = C0383.m7523();
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
                    System.out.println(Integer.decode(C0286.m5510("Tpxaox0CioxYbMQAMDJ7S")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۤۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m1368() {
        int iM5605 = C0291.m5605();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5605 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f91short;
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

    @Override // y4.r, android.app.Application
    public final void onCreate() {
        super.onCreate();
        try {
            a aVar = new a();
            ArrayList arrayListM188 = C0009.m188();
            synchronized (arrayListM188) {
                C0357.m6998(arrayListM188, new f(aVar));
            }
            a aVar2 = new a();
            synchronized (arrayListM188) {
                C0357.m6998(C0356.m6983(), new f(aVar2));
            }
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        int iM7737 = C0395.m7737();
                        int i11 = 1864;
                        while (true) {
                            i11 ^= 1881;
                            switch (i11) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (iM7737 <= 0) {
                                        i11 = 48736;
                                    }
                                    break;
                                case 47384:
                                    return;
                                case 47417:
                                    System.out.println(C0078.m1680("Dr"));
                                    return;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i11 = 48705;
                        }
                        break;
                    case 49:
                        i10 = 1647;
                        break;
                }
            }
        } catch (Exception e4) {
            int i12 = 1740;
            while (true) {
                i12 ^= 1757;
                switch (i12) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i12 = 1771;
                        continue;
                    case 54:
                        String strM8301 = C0423.m8301(m1368(), 0, C0269.f349 ^ (-504), 3081);
                        C0291.m5604(C0019.m390(m1368(), 13, C0159.f183 ^ 12, 1195), C0212.m4049(e4), strM8301);
                        break;
                    default:
                        continue;
                }
            }
        }
    }
}
