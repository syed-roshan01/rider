package f5;

import aa.C0012;
import c6.C0067;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.inject.C0172;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import dagger.hilt.android.lifecycle.C0238;
import h.C0298;
import h0.C0300;
import java.util.Iterator;
import k3.C0336;
import n1.C0363;
import o7.i2;
import v0.C0443;
import z0.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f396short = {2535, 2533, 2536, 2536, 2468, 2544, 2539, 2468, 2467, 2550, 2529, 2551, 2545, 2537, 2529, 2467, 2468, 2534, 2529, 2530, 2539, 2550, 2529, 2468, 2467, 2541, 2538, 2546, 2539, 2543, 2529, 2467, 2468, 2547, 2541, 2544, 2540, 2468, 2535, 2539, 2550, 2539, 2545, 2544, 2541, 2538, 2529, 3278, 3291, 3280, 3290, 3287, 3280, 3289, 2243, 2245, 2259, 2259, 2261, 2243, 2243};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f6232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MainViewModel f6234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(MainViewModel mainViewModel, String str, String str2, int i10, u8.e eVar) {
        super(C0067.f87 ^ (-806), eVar);
        this.f6234c = mainViewModel;
        this.f6235d = str;
        this.f6236e = str2;
        this.f6237f = i10;
        int iM7099 = C0363.m7099();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7099 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0336.m6509("vFUMPjTDKwcoHdJI")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5332() {
        int iM8630 = C0443.m8630();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8630 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f396short;
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
        int iM5760 = 0;
        String str = "ۢۥ۠";
        String strM3771 = null;
        MainViewModel mainViewModelM3290 = null;
        String strM9401 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749757:
                    mainViewModelM3290 = C0172.m3290(this);
                    str = "ۧۧۧ";
                    break;
                case 1750625:
                    str = "ۨۧ۟";
                    this = new b0(mainViewModelM3290, strM3771, strM9401, iM5760, eVar);
                    break;
                case 1754631:
                    strM3771 = C0197.m3771(this);
                    str = "ۥ۟ۥ";
                    break;
                case 1755438:
                    iM5760 = C0300.m5760(this);
                    str = "ۣۢ۠";
                    break;
                case 1755584:
                    return this;
                default:
                    strM9401 = C0483.m9401(this);
                    str = "ۨۢۨ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۨۧۢ";
        Object objM5716 = obj;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        u8.e eVarM4580 = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747745:
                    eVarM4580 = C0238.m4580(this, d0Var, eVar);
                    str = "ۡۦ۟";
                    break;
                case 1747807:
                    return objM5716;
                case 1750726:
                    objM5716 = C0298.m5716(this, lVarM238);
                    str = "ۣ۠ۤ";
                    break;
                case 1754595:
                    str = "ۣۥۨ";
                    lVarM238 = C0012.m238();
                    break;
                case 1755342:
                    str = "ۣ۠ۢ";
                    eVar = (u8.e) obj2;
                    break;
                case 1755587:
                    str = "ۨ۟ۥ";
                    d0Var = (m9.d0) objM5716;
                    break;
                default:
                    str = "ۧۦۢ";
                    this = (b0) eVarM4580;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:210:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[LOOP:5: B:102:0x01ea->B:222:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x02c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x02fe A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x022e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:153:0x02e4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x032e -> B:27:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:261:0x02cd
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
