package r7;

import a4.c0;
import e8.y1;
import g8.i1;
import g8.m3;
import g8.s1;
import g8.v5;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements q, y1, v5, m3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f13597b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13598a;

    public e(int i10) {
        this.f13598a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:313:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:315:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:318:0x071c  */
    /* JADX WARN: Code duplicated, block: B:321:0x0725  */
    /* JADX WARN: Code duplicated, block: B:323:0x072f  */
    /* JADX WARN: Code duplicated, block: B:332:0x0759  */
    /* JADX WARN: Code duplicated, block: B:334:0x075d  */
    /* JADX WARN: Code duplicated, block: B:336:0x0765  */
    /* JADX WARN: Code duplicated, block: B:360:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:362:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:366:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:369:0x07b5 A[LOOP:31: B:365:0x07ab->B:369:0x07b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:371:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:413:0x0848  */
    /* JADX WARN: Code duplicated, block: B:415:0x084e  */
    /* JADX WARN: Code duplicated, block: B:417:0x0853  */
    /* JADX WARN: Code duplicated, block: B:422:0x0870  */
    /* JADX WARN: Code duplicated, block: B:423:0x0873  */
    /* JADX WARN: Code duplicated, block: B:426:0x0884  */
    /* JADX WARN: Code duplicated, block: B:555:0x073d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x07ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x07bf A[EDGE_INSN: B:575:0x07bf->B:372:0x07bf BREAK  A[LOOP:31: B:365:0x07ab->B:369:0x07b5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0855 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v66 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r10v93 */
    /* JADX WARN: Type inference failed for: r11v100 */
    /* JADX WARN: Type inference failed for: r11v15, types: [int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [int] */
    /* JADX WARN: Type inference failed for: r11v25, types: [int] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v92 */
    /* JADX WARN: Type inference failed for: r11v93 */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r11v96 */
    /* JADX WARN: Type inference failed for: r11v97 */
    /* JADX WARN: Type inference failed for: r11v98 */
    /* JADX WARN: Type inference failed for: r11v99 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r4v7, types: [z7.a] */
    /* JADX WARN: Type inference failed for: r6v128 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5, types: [z7.a] */
    public static z7.b c(String str, Map map) throws y5.n {
        b8.b bVar;
        b8.c cVarB;
        z7.a aVar;
        b8.c cVar;
        z7.c cVar2;
        ?? r11;
        ?? r13;
        ?? r12;
        ?? r14;
        ?? r10;
        int i10;
        int i11;
        b8.a aVar2;
        int iMax;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[][] bArr;
        int i16;
        int i17;
        int i18;
        int i19;
        byte[][] bArr2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        byte[][] bArr3;
        int i25;
        int i26;
        int i27;
        int i28;
        int iAbs;
        byte[] bArr4;
        int i29;
        int i30;
        int i31;
        int i32;
        byte[] bArr5;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        byte[] bArr6;
        byte[] bArr7;
        int i40;
        byte b10;
        int i41;
        byte[] bArr8;
        char c10;
        a8.b bVar2;
        a8.b bVar3;
        a8.b bVar4;
        boolean z10;
        char c11;
        a8.b bVar5;
        Map map2 = map;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        b8.a aVarValueOf = b8.a.L;
        y7.a aVar3 = y7.a.f16989a;
        if (map2.containsKey(aVar3)) {
            aVarValueOf = b8.a.valueOf(map2.get(aVar3).toString());
        }
        y7.a aVar4 = y7.a.f16991c;
        char c12 = 4;
        int i42 = map2.containsKey(aVar4) ? Integer.parseInt(map2.get(aVar4).toString()) : 4;
        int[] iArr = c8.b.f3041a;
        y7.a aVar5 = y7.a.f16995n;
        boolean z11 = false;
        boolean z12 = map2.containsKey(aVar5) && Boolean.parseBoolean(map2.get(aVar5).toString());
        y7.a aVar6 = y7.a.f16994f;
        boolean z13 = map2.containsKey(aVar6) && Boolean.parseBoolean(map2.get(aVar6).toString());
        y7.a aVar7 = y7.a.f16990b;
        boolean zContainsKey = map2.containsKey(aVar7);
        Object obj = c8.b.f3042b;
        Charset charsetForName = zContainsKey ? Charset.forName(map2.get(aVar7).toString()) : obj;
        b8.b bVar6 = b8.b.BYTE;
        byte b11 = -1;
        if (z13) {
            if (charsetForName.equals(obj)) {
                charsetForName = null;
            }
            l4.e eVar = new l4.e(str, charsetForName, z12, aVarValueOf);
            b8.c[] cVarArr = {l4.e.g(1), l4.e.g(2), l4.e.g(3)};
            z2[] z2VarArr = {eVar.e(cVarArr[0]), eVar.e(cVarArr[1]), eVar.e(cVarArr[2])};
            int i43 = 0;
            int i44 = -1;
            int i45 = Integer.MAX_VALUE;
            for (int i46 = 3; i43 < i46; i46 = 3) {
                z2 z2Var = z2VarArr[i43];
                int iA = z2Var.A((b8.c) z2Var.f10984c);
                if (c8.b.c(iA, cVarArr[i43], (b8.a) eVar.f11283d) && iA < i45) {
                    i45 = iA;
                    i44 = i43;
                }
                i43++;
            }
            if (i44 < 0) {
                throw new y5.n("Data too big for any version");
            }
            z2 z2Var2 = z2VarArr[i44];
            aVar = new z7.a();
            for (c8.e eVar2 : (List) z2Var2.f10983b) {
                b8.b bVar7 = eVar2.f3053a;
                aVar.b(bVar7.f2751b, 4);
                int i47 = eVar2.f3056d;
                z2 z2Var3 = eVar2.f3057e;
                if (i47 > 0) {
                    aVar.b(eVar2.a(), bVar7.a((b8.c) z2Var3.f10984c));
                }
                b8.b bVar8 = b8.b.ECI;
                int i48 = eVar2.f3055c;
                if (bVar7 == bVar8) {
                    aVar.b(((z7.c) z7.c.f17326d.get(((z7.d) ((l4.e) z2Var3.f10985d).f11282c).f17331a[i48].charset().name())).f17328a[0], 8);
                } else if (i47 > 0) {
                    String str2 = (String) ((l4.e) z2Var3.f10985d).f11281b;
                    int i49 = eVar2.f3054b;
                    c8.b.a(str2.substring(i49, i47 + i49), bVar7, aVar, ((z7.d) ((l4.e) z2Var3.f10985d).f11282c).f17331a[i48].charset());
                }
            }
            cVar = (b8.c) z2Var2.f10984c;
        } else {
            if (!z7.e.f17334b.equals(charsetForName) || !c8.b.b(str)) {
                boolean z14 = false;
                boolean z15 = false;
                int i50 = 0;
                while (true) {
                    if (i50 < str.length()) {
                        char cCharAt = str.charAt(i50);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            z15 = true;
                        } else if (cCharAt < '`' && c8.b.f3041a[cCharAt] != -1) {
                            z14 = true;
                        }
                        i50++;
                    } else {
                        if (z14) {
                            bVar = b8.b.ALPHANUMERIC;
                            break;
                        }
                        if (z15) {
                            bVar = b8.b.NUMERIC;
                            break;
                        }
                    }
                    bVar = bVar6;
                    break;
                }
            }
            bVar = b8.b.KANJI;
            ?? aVar8 = new z7.a();
            if (bVar == bVar6 && zContainsKey && (cVar2 = (z7.c) z7.c.f17326d.get(charsetForName.name())) != null) {
                aVar8.b(7, 4);
                aVar8.b(cVar2.f17328a[0], 8);
            }
            if (z12) {
                aVar8.b(5, 4);
            }
            aVar8.b(bVar.f2751b, 4);
            ?? aVar9 = new z7.a();
            c8.b.a(str, bVar, aVar9, charsetForName);
            y7.a aVar10 = y7.a.f16992d;
            if (map2.containsKey(aVar10)) {
                b8.c cVarB2 = b8.c.b(Integer.parseInt(map2.get(aVar10).toString()));
                if (!c8.b.c(bVar.a(cVarB2) + aVar8.f17320b + aVar9.f17320b, cVarB2, aVarValueOf)) {
                    throw new y5.n("Data too big for requested version");
                }
                cVarB = cVarB2;
            } else {
                int iA2 = bVar.a(b8.c.b(1)) + aVar8.f17320b + aVar9.f17320b;
                int i51 = 1;
                while (true) {
                    if (i51 > 40) {
                        throw new y5.n("Data too big");
                    }
                    b8.c cVarB3 = b8.c.b(i51);
                    if (c8.b.c(iA2, cVarB3, aVarValueOf)) {
                        int iA3 = bVar.a(cVarB3) + aVar8.f17320b + aVar9.f17320b;
                        int i52 = 1;
                        while (true) {
                            if (i52 > 40) {
                                throw new y5.n("Data too big");
                            }
                            cVarB = b8.c.b(i52);
                            if (c8.b.c(iA3, cVarB, aVarValueOf)) {
                                break;
                            }
                            i52++;
                            c12 = c12;
                            map2 = map2;
                            b11 = b11;
                            z11 = z11;
                            i42 = i42;
                        }
                    } else {
                        i51++;
                        c12 = c12;
                        map2 = map2;
                        b11 = b11;
                        z11 = z11;
                        i42 = i42;
                    }
                }
            }
            z7.a aVar11 = new z7.a();
            int i53 = aVar8.f17320b;
            aVar11.c(i53);
            for (?? r15 = z11; r15 < i53; r15++) {
                aVar11.a(aVar8.d(r15));
            }
            int iE = bVar == bVar6 ? aVar9.e() : str.length();
            int iA4 = bVar.a(cVarB);
            int i54 = 1 << iA4;
            if (iE >= i54) {
                throw new y5.n(iE + " is bigger than " + (i54 - 1));
            }
            aVar11.b(iE, iA4);
            int i55 = aVar9.f17320b;
            aVar11.c(aVar11.f17320b + i55);
            for (?? r16 = z11; r16 < i55; r16++) {
                aVar11.a(aVar9.d(r16));
            }
            aVar = aVar11;
            cVar = cVarB;
        }
        c0 c0Var = cVar.f2754b[aVarValueOf.ordinal()];
        int i56 = c0Var.f1079a;
        b3.s[] sVarArr = (b3.s[]) c0Var.f1080b;
        int length = sVarArr.length;
        boolean z16 = z11;
        ?? r17 = z16;
        ?? r18 = z16;
        while (r18 < length) {
            int i57 = r17 + sVarArr[r18].f2676a;
            r18++;
            r17 = i57;
        }
        int i58 = r17 * i56;
        int i59 = cVar.f2755c;
        int i60 = i59 - i58;
        int i61 = i60 * 8;
        if (aVar.f17320b > i61) {
            throw new y5.n("data bits cannot fit in the QR Code" + aVar.f17320b + " > " + i61);
        }
        for (?? r19 = z11; r19 < c12 && aVar.f17320b < i61; r19++) {
            aVar.a(z11);
        }
        int i62 = aVar.f17320b & 7;
        if (i62 > 0) {
            while (i62 < 8) {
                aVar.a(z11);
                i62++;
            }
        }
        int iE2 = i60 - aVar.e();
        for (?? r110 = z11; r110 < iE2; r110++) {
            aVar.b((r110 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.f17320b != i61) {
            throw new y5.n("Bits size does not equal capacity");
        }
        b3.s[] sVarArr2 = (b3.s[]) c0Var.f1080b;
        int length2 = sVarArr2.length;
        boolean z17 = z11;
        ?? r111 = z17;
        while (r11 < length2) {
            r11 = z17;
            int i63 = sVarArr2[r11].f2676a;
            r11++;
            r111 = (r111 == true ? 1 : 0) + i63;
        }
        r11 = z17;
        if (aVar.e() != i60) {
            throw new y5.n("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(r111 == true ? 1 : 0);
        boolean z18 = z11;
        boolean z19 = z18;
        boolean z20 = z19;
        ?? r112 = z20;
        while (r10 < r12) {
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            if (r10 >= r12) {
                r10 = z18;
                r14 = z19;
                r12 = r111;
                r13 = z20;
                throw new y5.n("Block ID too large");
            }
            int i64 = i59 % (r12 == true ? 1 : 0);
            int i65 = i42;
            int i66 = (r12 == true ? 1 : 0) - i64;
            int i67 = i59 / (r12 == true ? 1 : 0);
            int i68 = i60 / (r12 == true ? 1 : 0);
            int i69 = i68 + 1;
            b8.a aVar12 = aVarValueOf;
            int i70 = i67 - i68;
            int i71 = (i67 + 1) - i69;
            if (i70 != i71) {
                r10 = z18;
                r14 = z19;
                r12 = r111;
                r13 = z20;
                throw new y5.n("EC bytes mismatch");
            }
            b8.c cVar3 = cVar;
            if (r12 != i66 + i64) {
                r10 = z18;
                r14 = z19;
                r12 = r111;
                r13 = z20;
                throw new y5.n("RS blocks mismatch");
            }
            if (i59 != ((i69 + i71) * i64) + ((i68 + i70) * i66)) {
                r10 = z18;
                r14 = z19;
                r12 = r111;
                r13 = z20;
                throw new y5.n("Total bytes mismatch");
            }
            if (r10 < i66) {
                c10 = 0;
                iArr2[0] = i68;
                iArr3[0] = i70;
            } else {
                c10 = 0;
                iArr2[0] = i69;
                iArr3[0] = i71;
            }
            int i72 = iArr2[c10];
            byte[] bArr9 = new byte[i72];
            int i73 = (r14 == true ? 1 : 0) * 8;
            int i74 = 0;
            ?? r113 = r12;
            while (i74 < i72) {
                int i75 = i59;
                ?? r23 = r113;
                int i76 = 0;
                int i77 = 0;
                for (int i78 = 8; i77 < i78; i78 = 8) {
                    if (aVar.d(i73)) {
                        i76 = (1 << (7 - i77)) | i76;
                    }
                    i73++;
                    i77++;
                }
                bArr9[i74] = (byte) i76;
                i74++;
                r113 = r23 == true ? 1 : 0;
                i59 = i75;
            }
            int i79 = i59;
            ?? r24 = r113;
            int i80 = iArr3[0];
            int i81 = i72 + i80;
            int[] iArr4 = new int[i81];
            for (int i82 = 0; i82 < i72; i82++) {
                iArr4[i82] = bArr9[i82] & 255;
            }
            a8.a aVar13 = a8.a.f1326g;
            ArrayList arrayList2 = new ArrayList();
            z7.a aVar14 = aVar;
            arrayList2.add(new a8.b(aVar13, new int[]{1}));
            if (i80 == 0) {
                throw new IllegalArgumentException("No error correction bytes");
            }
            int i83 = i81 - i80;
            if (i83 <= 0) {
                throw new IllegalArgumentException("No data bytes provided");
            }
            if (i80 >= arrayList2.size()) {
                a8.b bVar9 = (a8.b) a7.a.k(arrayList2, 1);
                int size = arrayList2.size();
                while (size <= i80) {
                    int i84 = i60;
                    int i85 = aVar13.f1327a[(size - 1) + aVar13.f1332f];
                    boolean z21 = r10 == true ? 1 : 0;
                    int[] iArr5 = {1, i85};
                    if (iArr5[0] == 0) {
                        boolean z22 = r14 == true ? 1 : 0;
                        int i86 = 1;
                        while (i86 < 2 && iArr5[i86] == 0) {
                            r10 = r10;
                            r14 = r14;
                            r13 = r13;
                            r112 = r112;
                            i86++;
                        }
                        if (i86 == 2) {
                            r10 = r10;
                            r14 = r14;
                            r13 = r13;
                            r112 = r112;
                            r10 = r10;
                            r14 = r14;
                            r13 = r13;
                            r112 = r112;
                            c11 = 0;
                            iArr5 = new int[]{0};
                            z10 = z22;
                        } else {
                            r10 = r10;
                            r14 = r14;
                            r13 = r13;
                            r112 = r112;
                            r10 = r10;
                            r14 = r14;
                            r13 = r13;
                            r112 = r112;
                            c11 = 0;
                            int i87 = 2 - i86;
                            int[] iArr6 = new int[i87];
                            System.arraycopy(iArr5, i86, iArr6, 0, i87);
                            iArr5 = iArr6;
                            z10 = z22;
                        }
                    } else {
                        r10 = r10;
                        r14 = r14;
                        r13 = r13;
                        r112 = r112;
                        z10 = r14 == true ? 1 : 0;
                        c11 = 0;
                    }
                    bVar9.getClass();
                    a8.b bVar10 = bVar9;
                    a8.a aVar15 = bVar10.f1333a;
                    if (!aVar15.equals(aVar13)) {
                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                    }
                    if (bVar10.c() || iArr5[c11] == 0) {
                        bVar5 = aVar15.f1329c;
                    } else {
                        int[] iArr7 = bVar10.f1334b;
                        int length3 = iArr7.length;
                        int length4 = iArr5.length;
                        int[] iArr8 = new int[(length3 + length4) - 1];
                        int i88 = 0;
                        while (i88 < length3) {
                            int i89 = length3;
                            int i90 = iArr7[i88];
                            int[] iArr9 = iArr7;
                            int i91 = 0;
                            while (i91 < length4) {
                                int i92 = i88 + i91;
                                iArr8[i92] = iArr8[i92] ^ aVar15.a(i90, iArr5[i91]);
                                i91++;
                                length4 = length4;
                            }
                            i88++;
                            length3 = i89;
                            iArr7 = iArr9;
                        }
                        bVar5 = new a8.b(aVar15, iArr8);
                    }
                    arrayList2.add(bVar5);
                    size++;
                    arrayList = arrayList;
                    r10 = z21 ? 1 : 0;
                    i60 = i84;
                    r14 = z10;
                    r13 = r13 == true ? 1 : 0;
                    r112 = r112 == true ? 1 : 0;
                    bVar9 = bVar5;
                    iArr2 = iArr2;
                }
                r10 = r10;
                r14 = r14;
                r13 = r13;
                r112 = r112;
            }
            int[] iArr10 = iArr2;
            ArrayList arrayList3 = arrayList;
            int i93 = i60;
            ?? r28 = r10;
            ?? r30 = r14;
            ?? r32 = r13;
            ?? r33 = r112;
            a8.b bVar11 = (a8.b) arrayList2.get(i80);
            int[] iArr11 = new int[i83];
            System.arraycopy(iArr4, 0, iArr11, 0, i83);
            if (i83 == 0) {
                throw new IllegalArgumentException();
            }
            if (i83 > 1 && iArr11[0] == 0) {
                int i94 = 1;
                while (i94 < i83 && iArr11[i94] == 0) {
                    i94++;
                }
                if (i94 == i83) {
                    iArr11 = new int[]{0};
                } else {
                    int i95 = i83 - i94;
                    int[] iArr12 = new int[i95];
                    System.arraycopy(iArr11, i94, iArr12, 0, i95);
                    iArr11 = iArr12;
                }
            }
            if (i80 < 0) {
                throw new IllegalArgumentException();
            }
            int length5 = iArr11.length;
            int[] iArr13 = new int[length5 + i80];
            for (int i96 = 0; i96 < length5; i96++) {
                iArr13[i96] = aVar13.a(iArr11[i96], 1);
            }
            a8.b bVar12 = new a8.b(aVar13, iArr13);
            if (!aVar13.equals(bVar11.f1333a)) {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            if (bVar11.c()) {
                throw new IllegalArgumentException("Divide by 0");
            }
            int iB = bVar11.b();
            int[] iArr14 = bVar11.f1334b;
            int i97 = iArr14[(iArr14.length - 1) - iB];
            if (i97 == 0) {
                throw new ArithmeticException();
            }
            int i98 = aVar13.f1327a[(aVar13.f1330d - aVar13.f1328b[i97]) - 1];
            a8.b bVar13 = aVar13.f1329c;
            a8.b bVarA = bVar13;
            while (bVar12.b() >= bVar11.b() && !bVar12.c()) {
                int iB2 = bVar12.b() - bVar11.b();
                int iB3 = bVar12.b();
                int[] iArr15 = bVar12.f1334b;
                int iA5 = aVar13.a(iArr15[(iArr15.length - 1) - iB3], i98);
                if (iB2 < 0) {
                    throw new IllegalArgumentException();
                }
                a8.a aVar16 = bVar11.f1333a;
                if (iA5 == 0) {
                    bVar3 = aVar16.f1329c;
                    bVar2 = bVar13;
                } else {
                    int length6 = iArr14.length;
                    int[] iArr16 = new int[length6 + iB2];
                    int i99 = 0;
                    while (i99 < length6) {
                        iArr16[i99] = aVar16.a(iArr14[i99], iA5);
                        i99++;
                        bVar13 = bVar13;
                    }
                    bVar2 = bVar13;
                    bVar3 = new a8.b(aVar16, iArr16);
                }
                if (iB2 < 0) {
                    throw new IllegalArgumentException();
                }
                if (iA5 == 0) {
                    bVar4 = bVar2;
                } else {
                    int[] iArr17 = new int[iB2 + 1];
                    iArr17[0] = iA5;
                    bVar4 = new a8.b(aVar13, iArr17);
                }
                bVarA = bVarA.a(bVar4);
                bVar12 = bVar12.a(bVar3);
                bVar11 = bVar11;
                i98 = i98;
                bVar13 = bVar2;
            }
            int[] iArr18 = new a8.b[]{bVarA, bVar12}[1].f1334b;
            int length7 = i80 - iArr18.length;
            for (int i100 = 0; i100 < length7; i100++) {
                iArr4[i83 + i100] = 0;
            }
            System.arraycopy(iArr18, 0, iArr4, i83 + length7, iArr18.length);
            byte[] bArr10 = new byte[i80];
            for (int i101 = 0; i101 < i80; i101++) {
                bArr10[i101] = (byte) iArr4[i72 + i101];
            }
            arrayList3.add(new c8.a(bArr9, bArr10));
            int iMax2 = Math.max(r33 == true ? 1 : 0, i72);
            int iMax3 = Math.max(r32 == true ? 1 : 0, i80);
            int i102 = (r30 == true ? 1 : 0) + iArr10[0];
            int i103 = (r28 == true ? 1 : 0) + 1;
            arrayList = arrayList3;
            i42 = i65;
            cVar = cVar3;
            r12 = r24 == true ? 1 : 0;
            i59 = i79;
            aVarValueOf = aVar12;
            aVar = aVar14;
            i60 = i93;
            r10 = i103;
            r14 = i102;
            r13 = iMax3;
            r112 = iMax2;
        }
        r10 = z18;
        r14 = z19;
        r12 = r111;
        r13 = z20;
        b8.c cVar4 = cVar;
        b8.a aVar17 = aVarValueOf;
        int i104 = i42;
        ArrayList arrayList4 = arrayList;
        int i105 = i59;
        int i106 = i60;
        int i107 = r13 == true ? 1 : 0;
        int i108 = r112 == true ? 1 : 0;
        if (i106 != r14) {
            throw new y5.n("Data bytes does not match offset");
        }
        z7.a aVar18 = new z7.a();
        for (int i109 = 0; i109 < i108; i109++) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                byte[] bArr11 = ((c8.a) it.next()).f3039a;
                if (i109 < bArr11.length) {
                    aVar18.b(bArr11[i109], 8);
                }
            }
        }
        for (int i110 = 0; i110 < i107; i110++) {
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                byte[] bArr12 = ((c8.a) it2.next()).f3040b;
                if (i110 < bArr12.length) {
                    aVar18.b(bArr12[i110], 8);
                }
            }
        }
        if (i105 != aVar18.e()) {
            StringBuilder sbQ = a7.a.q("Interleaving error: ", i105, " and ");
            sbQ.append(aVar18.e());
            sbQ.append(" differ.");
            throw new y5.n(sbQ.toString());
        }
        int i111 = (cVar4.f2753a * 4) + 17;
        k3.b bVar14 = new k3.b(i111, i111, 2);
        y7.a aVar19 = y7.a.f16993e;
        if (map.containsKey(aVar19)) {
            i11 = Integer.parseInt(map.get(aVar19).toString());
            i10 = 8;
            if (i11 < 0 || i11 >= 8) {
            }
            if (i11 == -1) {
                i12 = -1;
                i13 = Integer.MAX_VALUE;
                i14 = 0;
                while (i14 < i10) {
                    b8.a aVar20 = aVar17;
                    c8.c.a(aVar18, aVar20, cVar4, i14, bVar14);
                    i15 = 0;
                    int iC = d7.t.C(bVar14, false) + d7.t.C(bVar14, true);
                    bArr = (byte[][]) bVar14.f9722d;
                    i16 = bVar14.f9720b;
                    i17 = bVar14.f9721c;
                    i18 = 0;
                    i19 = 0;
                    while (i18 < i17 - 1) {
                        bArr7 = bArr[i18];
                        int i112 = i19;
                        i40 = i15;
                        while (i40 < i16 - 1) {
                            b10 = bArr7[i40];
                            i41 = i40 + 1;
                            int i113 = i16;
                            if (b10 == bArr7[i41]) {
                                bArr8 = bArr[i18 + 1];
                                if (b10 != bArr8[i40] && b10 == bArr8[i41]) {
                                    i112++;
                                }
                            }
                            i40 = i41;
                            i16 = i113;
                        }
                        i18++;
                        i19 = i112;
                        i15 = 0;
                    }
                    int i114 = (i19 * 3) + iC;
                    bArr2 = (byte[][]) bVar14.f9722d;
                    i20 = bVar14.f9720b;
                    i21 = bVar14.f9721c;
                    i22 = 0;
                    i23 = 0;
                    while (i22 < i21) {
                        i31 = i23;
                        i32 = 0;
                        while (i32 < i20) {
                            bArr5 = bArr2[i22];
                            i33 = i32 + 6;
                            int i115 = i20;
                            if (i33 < i20) {
                                i34 = i12;
                                byte b12 = 1;
                                if (bArr5[i32] == 1 && bArr5[i32 + 1] == 0 && bArr5[i32 + 2] == 1 && bArr5[i32 + 3] == 1 && bArr5[i32 + 4] == 1 && bArr5[i32 + 5] == 0 && bArr5[i33] == 1) {
                                    i37 = i32 - 4;
                                    if (i37 >= 0 && bArr5.length >= i32) {
                                        while (true) {
                                            if (i37 < i32) {
                                                if (bArr5[i37] == b12) {
                                                    i38 = i32 + 7;
                                                    i39 = i32 + 11;
                                                    if (i38 >= 0) {
                                                        while (true) {
                                                            if (i38 >= i39) {
                                                                bArr6 = bArr5;
                                                                if (bArr5[i38] == 1) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i38++;
                                                                bArr5 = bArr6;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i37++;
                                                    b12 = 1;
                                                }
                                            }
                                            i31++;
                                            break;
                                        }
                                    } else {
                                        i38 = i32 + 7;
                                        i39 = i32 + 11;
                                        if (i38 >= 0 && bArr5.length >= i39) {
                                            while (true) {
                                                if (i38 >= i39) {
                                                    i31++;
                                                    break;
                                                }
                                                bArr6 = bArr5;
                                                if (bArr5[i38] == 1) {
                                                    break;
                                                }
                                                i38++;
                                                bArr5 = bArr6;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i34 = i12;
                            }
                            i35 = i22 + 6;
                            if (i35 >= i21 && bArr2[i22][i32] == 1 && bArr2[i22 + 1][i32] == 0 && bArr2[i22 + 2][i32] == 1 && bArr2[i22 + 3][i32] == 1 && bArr2[i22 + 4][i32] == 1 && bArr2[i22 + 5][i32] == 0 && bArr2[i35][i32] == 1) {
                                int i116 = i22 - 4;
                                if (i116 >= 0 && bArr2.length >= i22) {
                                    while (true) {
                                        if (i116 < i22) {
                                            if (bArr2[i116][i32] == 1) {
                                                i36 = i22 + 7;
                                                int i117 = i22 + 11;
                                                if (i36 < 0) {
                                                }
                                            } else {
                                                i116++;
                                            }
                                        }
                                        i31++;
                                        break;
                                        break;
                                    }
                                }
                                i36 = i22 + 7;
                                int i118 = i22 + 11;
                                if (i36 < 0 && bArr2.length >= i118) {
                                    while (true) {
                                        if (i36 >= i118) {
                                            i31++;
                                            break;
                                        }
                                        if (bArr2[i36][i32] == 1) {
                                            break;
                                        }
                                        i36++;
                                    }
                                }
                            }
                            i32++;
                            i12 = i34;
                            i20 = i115;
                        }
                        i22++;
                        i23 = i31;
                    }
                    i24 = i12;
                    int i119 = (i23 * 40) + i114;
                    bArr3 = (byte[][]) bVar14.f9722d;
                    i25 = bVar14.f9720b;
                    i26 = bVar14.f9721c;
                    i27 = 0;
                    i28 = 0;
                    while (i27 < i26) {
                        bArr4 = bArr3[i27];
                        i29 = i28;
                        for (i30 = 0; i30 < i25; i30++) {
                            if (bArr4[i30] == 1) {
                                i29++;
                            }
                        }
                        i27++;
                        i28 = i29;
                    }
                    int i120 = bVar14.f9721c * bVar14.f9720b;
                    iAbs = (((Math.abs((i28 * 2) - i120) * 10) / i120) * 10) + i119;
                    if (iAbs < i13) {
                        i12 = i14;
                        i13 = iAbs;
                    } else {
                        i12 = i24;
                    }
                    i14++;
                    aVar17 = aVar20;
                    i10 = 8;
                }
                aVar2 = aVar17;
                i11 = i12;
            } else {
                aVar2 = aVar17;
            }
            c8.c.a(aVar18, aVar2, cVar4, i11, bVar14);
            int i121 = bVar14.f9720b;
            int i122 = bVar14.f9721c;
            int i123 = i104 * 2;
            int i124 = i121 + i123;
            int i125 = i123 + i122;
            iMax = Math.max(512, i124);
            int iMax4 = Math.max(512, i125);
            int iMin = Math.min(iMax / i124, iMax4 / i125);
            int i126 = (iMax - (i121 * iMin)) / 2;
            int i127 = (iMax4 - (i122 * iMin)) / 2;
            z7.b bVar15 = new z7.b();
            if (iMax >= 1 || iMax4 < 1) {
                throw new IllegalArgumentException("Both dimensions must be greater than 0");
            }
            bVar15.f17321a = iMax;
            bVar15.f17322b = iMax4;
            int i128 = (iMax + 31) / 32;
            bVar15.f17323c = i128;
            bVar15.f17324d = new int[i128 * iMax4];
            int i129 = 0;
            while (i129 < i122) {
                int i130 = i126;
                int i131 = 0;
                while (i131 < i121) {
                    if (bVar14.a(i131, i129) == 1) {
                        if (i127 < 0 || i130 < 0) {
                            throw new IllegalArgumentException("Left and top must be nonnegative");
                        }
                        if (iMin < 1 || iMin < 1) {
                            throw new IllegalArgumentException("Height and width must be at least 1");
                        }
                        int i132 = i130 + iMin;
                        int i133 = i127 + iMin;
                        if (i133 > bVar15.f17322b || i132 > bVar15.f17321a) {
                            throw new IllegalArgumentException("The region must fit inside the matrix");
                        }
                        for (int i134 = i127; i134 < i133; i134++) {
                            int i135 = bVar15.f17323c * i134;
                            int i136 = i130;
                            while (i136 < i132) {
                                int i137 = (i136 / 32) + i135;
                                int i138 = i121;
                                int[] iArr19 = bVar15.f17324d;
                                iArr19[i137] = iArr19[i137] | (1 << (i136 & 31));
                                i136++;
                                i121 = i138;
                            }
                        }
                    }
                    i131++;
                    i130 += iMin;
                    i121 = i121;
                }
                i129++;
                i127 += iMin;
            }
            return bVar15;
        }
        i10 = 8;
        i11 = -1;
        if (i11 == -1) {
            i12 = -1;
            i13 = Integer.MAX_VALUE;
            i14 = 0;
            while (i14 < i10) {
                b8.a aVar21 = aVar17;
                c8.c.a(aVar18, aVar21, cVar4, i14, bVar14);
                i15 = 0;
                int iC2 = d7.t.C(bVar14, false) + d7.t.C(bVar14, true);
                bArr = (byte[][]) bVar14.f9722d;
                i16 = bVar14.f9720b;
                i17 = bVar14.f9721c;
                i18 = 0;
                i19 = 0;
                while (i18 < i17 - 1) {
                    bArr7 = bArr[i18];
                    int i1110 = i19;
                    i40 = i15;
                    while (i40 < i16 - 1) {
                        b10 = bArr7[i40];
                        i41 = i40 + 1;
                        int i1111 = i16;
                        if (b10 == bArr7[i41]) {
                            bArr8 = bArr[i18 + 1];
                            if (b10 != bArr8[i40]) {
                            }
                        }
                        i40 = i41;
                        i16 = i1111;
                    }
                    i18++;
                    i19 = i1110;
                    i15 = 0;
                }
                int i1112 = (i19 * 3) + iC2;
                bArr2 = (byte[][]) bVar14.f9722d;
                i20 = bVar14.f9720b;
                i21 = bVar14.f9721c;
                i22 = 0;
                i23 = 0;
                while (i22 < i21) {
                    i31 = i23;
                    i32 = 0;
                    while (i32 < i20) {
                        bArr5 = bArr2[i22];
                        i33 = i32 + 6;
                        int i1113 = i20;
                        if (i33 < i20) {
                            i34 = i12;
                            byte b13 = 1;
                            if (bArr5[i32] == 1) {
                                i37 = i32 - 4;
                                if (i37 >= 0) {
                                    i38 = i32 + 7;
                                    i39 = i32 + 11;
                                    if (i38 >= 0) {
                                        while (true) {
                                            if (i38 >= i39) {
                                                i31++;
                                                break;
                                            }
                                            bArr6 = bArr5;
                                            if (bArr5[i38] == 1) {
                                                break;
                                                break;
                                            }
                                            i38++;
                                            bArr5 = bArr6;
                                        }
                                    }
                                } else {
                                    i38 = i32 + 7;
                                    i39 = i32 + 11;
                                    if (i38 >= 0) {
                                        while (true) {
                                            if (i38 >= i39) {
                                                i31++;
                                                break;
                                            }
                                            bArr6 = bArr5;
                                            if (bArr5[i38] == 1) {
                                                break;
                                                break;
                                            }
                                            i38++;
                                            bArr5 = bArr6;
                                        }
                                    }
                                }
                            }
                        } else {
                            i34 = i12;
                        }
                        i35 = i22 + 6;
                        if (i35 >= i21) {
                        }
                        i32++;
                        i12 = i34;
                        i20 = i1113;
                    }
                    i22++;
                    i23 = i31;
                }
                i24 = i12;
                int i1114 = (i23 * 40) + i1112;
                bArr3 = (byte[][]) bVar14.f9722d;
                i25 = bVar14.f9720b;
                i26 = bVar14.f9721c;
                i27 = 0;
                i28 = 0;
                while (i27 < i26) {
                    bArr4 = bArr3[i27];
                    i29 = i28;
                    while (i30 < i25) {
                        if (bArr4[i30] == 1) {
                            i29++;
                        }
                    }
                    i27++;
                    i28 = i29;
                }
                int i1210 = bVar14.f9721c * bVar14.f9720b;
                iAbs = (((Math.abs((i28 * 2) - i1210) * 10) / i1210) * 10) + i1114;
                if (iAbs < i13) {
                    i12 = i14;
                    i13 = iAbs;
                } else {
                    i12 = i24;
                }
                i14++;
                aVar17 = aVar21;
                i10 = 8;
            }
            aVar2 = aVar17;
            i11 = i12;
        } else {
            aVar2 = aVar17;
        }
        c8.c.a(aVar18, aVar2, cVar4, i11, bVar14);
        int i1211 = bVar14.f9720b;
        int i1212 = bVar14.f9721c;
        int i1213 = i104 * 2;
        int i1214 = i1211 + i1213;
        int i1215 = i1213 + i1212;
        iMax = Math.max(512, i1214);
        int iMax5 = Math.max(512, i1215);
        int iMin2 = Math.min(iMax / i1214, iMax5 / i1215);
        int i1216 = (iMax - (i1211 * iMin2)) / 2;
        int i1217 = (iMax5 - (i1212 * iMin2)) / 2;
        z7.b bVar16 = new z7.b();
        if (iMax >= 1) {
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public static i1 d() {
        i1 i1Var = new i1();
        i1Var.f6844a = new Random();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        i1Var.f6845b = TimeUnit.MINUTES.toNanos(2L);
        i1Var.f6846c = 1.6d;
        i1Var.f6847d = 0.2d;
        i1Var.f6848e = nanos;
        return i1Var;
    }

    @Override // g8.m3
    public final int a() {
        return 443;
    }

    public final ExecutorService b() {
        int i10 = this.f13598a;
        switch (i10) {
            case 21:
                switch (i10) {
                    case 21:
                        return Executors.newCachedThreadPool(s1.e("grpc-default-executor-%d"));
                    default:
                        return Executors.newCachedThreadPool(s1.e("grpc-okhttp-%d"));
                }
            case 22:
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, s1.e("grpc-timer-%d"));
                try {
                    scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
                    break;
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
                return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
            default:
                switch (i10) {
                    case 21:
                        return Executors.newCachedThreadPool(s1.e("grpc-default-executor-%d"));
                    default:
                        return Executors.newCachedThreadPool(s1.e("grpc-okhttp-%d"));
                }
        }
    }

    @Override // r7.q
    public final Object e() {
        switch (this.f13598a) {
            case 0:
                return new ArrayList();
            case 1:
                return new ConcurrentSkipListMap();
            case 2:
                return new ConcurrentHashMap();
            case 3:
                return new TreeMap();
            case 4:
                return new LinkedHashMap();
            default:
                return new p(true);
        }
    }

    public final String toString() {
        switch (this.f13598a) {
            case 9:
                return "service config is unused";
            case 21:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i10, int i11) {
        this.f13598a = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l.q qVar) {
        this(13, 0);
        this.f13598a = 13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj) {
        this(11, 0);
        this.f13598a = 11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e() {
        this(8);
        this.f13598a = 8;
    }
}
