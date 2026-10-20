package f5;

import a8.C0010;
import aa.C0012;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.C0241;
import g7.C0293;
import java.util.Iterator;
import m7.C0359;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f407short = {1608, 1610, 1607, 1607, 1547, 1631, 1604, 1547, 1548, 1625, 1614, 1624, 1630, 1606, 1614, 1548, 1547, 1609, 1614, 1613, 1604, 1625, 1614, 1547, 1548, 1602, 1605, 1629, 1604, 1600, 1614, 1548, 1547, 1628, 1602, 1631, 1603, 1547, 1608, 1604, 1625, 1604, 1630, 1631, 1602, 1605, 1614, 3225, 3212, 3207, 3213, 3200, 3207, 3214, 2751, 2745, 2735, 2735, 2729, 2751, 2751};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MainViewModel f6281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f6282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6284f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MainViewModel f6287p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MainViewModel mainViewModel, u8.e eVar) {
        super(C0241.f320 ^ 457, eVar);
        this.f6287p = mainViewModel;
        int iM2662 = C0138.m2662();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2662 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0293.m5632("0Ccnu9QYrdIkPyujzIQQaeXR")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨۢۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5343() {
        int iM199 = C0010.m199();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM199 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f407short;
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        MainViewModel mainViewModelM7021 = null;
        String str = "ۡ۠ۡ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748642:
                    mainViewModelM7021 = C0359.m7021(this);
                    str = "ۣ۟ۤ";
                    break;
                case 1752550:
                    return this;
                default:
                    this = new k(mainViewModelM7021, eVar);
                    str = "ۥۣۢ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۦۨۥ";
        u8.e eVar = null;
        Object objM2148 = obj;
        q8.l lVarM238 = null;
        u8.e eVarM3570 = null;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56319:
                    str = "ۥ۟ۦ";
                    lVarM238 = C0012.m238();
                    break;
                case 1746820:
                    return objM2148;
                case 1750687:
                    eVarM3570 = C0187.m3570(this, d0Var, eVar);
                    str = "ۨۨ۠";
                    break;
                case 1752460:
                    objM2148 = C0111.m2148(this, lVarM238);
                    str = "ۣ۟ۨ";
                    break;
                case 1753699:
                    str = "ۦۧ۠";
                    d0Var = (m9.d0) objM2148;
                    break;
                case 1755616:
                    str = "۠۟";
                    this = (k) eVarM3570;
                    break;
                default:
                    str = "ۣۤ۠";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:372:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x0599 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x059d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x057b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:177:0x030d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:284:0x0583 -> B:27:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:307:0x05c6 -> B:308:0x05cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:331:0x0613 -> B:338:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
