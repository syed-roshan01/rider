package w0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import k0.y0;
import m0.o3;
import m0.z2;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.c f16133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q.r f16135c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16142j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16136d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0.j f16137e = new o0.j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q.s f16138f = new q.s();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q.t f16139g = new q.t();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o0.i f16140h = new o0.i(new m0.k0[16]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m0.p f16141i = new m0.p(this, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0.j f16143k = new o0.j();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f16144l = new HashMap();

    public z(c9.c cVar) {
        this.f16133a = cVar;
    }

    public final void a(Object obj, q.w wVar, c9.a aVar) {
        long[] jArr;
        int i10;
        Object obj2 = this.f16134b;
        q.r rVar = this.f16135c;
        int i11 = this.f16136d;
        this.f16134b = obj;
        this.f16135c = (q.r) this.f16138f.f(obj);
        if (this.f16136d == -1) {
            this.f16136d = p.i().d();
        }
        m0.p pVar = this.f16141i;
        o0.i iVarQ = d7.t.Q();
        try {
            iVarQ.c(pVar);
            y0.e(wVar, aVar);
            iVarQ.n(iVarQ.f12343c - 1);
            Object obj3 = this.f16134b;
            d7.a.j(obj3);
            int i12 = this.f16136d;
            q.r rVar2 = this.f16135c;
            if (rVar2 != null) {
                long[] jArr2 = rVar2.f13021a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr2[i13];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j10 & 255) < 128) {
                                    int i17 = (i13 << 3) + i16;
                                    Object obj4 = rVar2.f13022b[i17];
                                    boolean z10 = rVar2.f13023c[i17] != i12;
                                    if (z10) {
                                        d(obj3, obj4);
                                    }
                                    if (z10) {
                                        rVar2.g(i17);
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = i14;
                                }
                                j10 >>= i10;
                                i16++;
                                i14 = i10;
                                jArr2 = jArr2;
                            }
                            jArr = jArr2;
                            if (i15 != i14) {
                                break;
                            }
                        } else {
                            jArr = jArr2;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        jArr2 = jArr;
                    }
                }
            }
            this.f16134b = obj2;
            this.f16135c = rVar;
            this.f16136d = i11;
        } catch (Throwable th) {
            iVarQ.n(iVarQ.f12343c - 1);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02a5 A[DONT_INVERT, PHI: r22
  0x02a5: PHI (r22v35 boolean) = (r22v34 boolean), (r22v36 boolean) binds: [B:101:0x0278, B:109:0x02a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x02a7 A[LOOP:5: B:100:0x026a->B:111:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x04e1 A[DONT_INVERT, PHI: r22
  0x04e1: PHI (r22v11 boolean) = (r22v10 boolean), (r22v12 boolean) binds: [B:194:0x04b4, B:202:0x04df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:204:0x04e3 A[LOOP:19: B:193:0x04a6->B:204:0x04e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x0550 A[DONT_INVERT, PHI: r22
  0x0550: PHI (r22v5 boolean) = (r22v4 boolean), (r22v6 boolean) binds: [B:216:0x0523, B:224:0x054e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:226:0x0552 A[LOOP:17: B:215:0x0515->B:226:0x0552, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x02af A[EDGE_INSN: B:281:0x02af->B:113:0x02af BREAK  A[LOOP:5: B:100:0x026a->B:111:0x02a7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0251 A[EDGE_INSN: B:292:0x0251->B:93:0x0251 BREAK  A[LOOP:7: B:78:0x01fa->B:89:0x0238], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x055a A[EDGE_INSN: B:306:0x055a->B:228:0x055a BREAK  A[LOOP:17: B:215:0x0515->B:226:0x0552], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x04fa A[EDGE_INSN: B:317:0x04fa->B:208:0x04fa BREAK  A[LOOP:19: B:193:0x04a6->B:204:0x04e3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x013f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0236 A[DONT_INVERT, PHI: r22
  0x0236: PHI (r22v41 boolean) = (r22v40 boolean), (r22v42 boolean) binds: [B:79:0x0209, B:87:0x0234] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0238 A[LOOP:7: B:78:0x01fa->B:89:0x0238, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0245  */
    public final boolean b(Set set) {
        boolean z10;
        Iterator it;
        Object obj;
        HashMap map;
        o0.j jVar;
        Object objF;
        HashMap map2;
        o0.j jVar2;
        long[] jArr;
        Iterator it2;
        o0.j jVar3;
        long[] jArr2;
        int i10;
        o0.j jVar4;
        long[] jArr3;
        o0.j jVar5;
        Object[] objArr;
        q.r rVar;
        int i11;
        Object[] objArr2;
        o3 o3Var;
        String str;
        o0.j jVar6;
        int i12;
        Object objF2;
        long[] jArr4;
        Object[] objArr3;
        int i13;
        int i14;
        String str2;
        o0.j jVar7;
        int i15;
        int i16;
        long[] jArr5;
        Object[] objArr4;
        long[] jArr6;
        HashMap map3 = this.f16144l;
        boolean z11 = set instanceof o0.d;
        o3 o3Var2 = o3.f11621a;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        o0.i iVar = this.f16140h;
        int i17 = 2;
        o0.j jVar8 = this.f16143k;
        o0.j jVar9 = this.f16137e;
        q.t tVar = this.f16139g;
        if (z11) {
            o0.d dVar = (o0.d) set;
            Object[] objArr5 = dVar.f12333b;
            int i18 = dVar.f12332a;
            int i19 = 0;
            z10 = false;
            while (i19 < i18) {
                Object obj2 = objArr5[i19];
                d7.a.k(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(obj2 instanceof h0) || ((h0) obj2).b(i17)) {
                    if (!jVar8.f12344a.b(obj2) || (objF2 = jVar8.f12344a.f(obj2)) == null) {
                        i11 = i18;
                        objArr2 = objArr5;
                        o3Var = o3Var2;
                        str = str3;
                        jVar6 = jVar8;
                        i12 = i19;
                    } else if (objF2 instanceof q.t) {
                        q.t tVar2 = (q.t) objF2;
                        Object[] objArr6 = tVar2.f13039b;
                        long[] jArr7 = tVar2.f13038a;
                        int length = jArr7.length - i17;
                        if (length >= 0) {
                            objArr2 = objArr5;
                            o3Var = o3Var2;
                            int i20 = 0;
                            while (true) {
                                long j10 = jArr7[i20];
                                i11 = i18;
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i21 = 8 - ((~(i20 - length)) >>> 31);
                                    int i22 = 0;
                                    while (i22 < i21) {
                                        if ((j10 & 255) < 128) {
                                            jArr5 = jArr7;
                                            m0.k0 k0Var = (m0.k0) objArr6[(i20 << 3) + i22];
                                            d7.a.k(k0Var, str3);
                                            objArr4 = objArr6;
                                            Object obj3 = map3.get(k0Var);
                                            str2 = str3;
                                            m0.j0 j0Var = (m0.j0) k0Var;
                                            jVar7 = jVar8;
                                            z2 z2Var = j0Var.f11571c;
                                            if (z2Var == null) {
                                                z2Var = o3Var;
                                            }
                                            if (z2Var.a(j0Var.f().f11562f, obj3)) {
                                                i13 = i21;
                                                i14 = i22;
                                                i15 = i19;
                                                i16 = length;
                                                iVar.c(k0Var);
                                            } else {
                                                Object objF3 = jVar9.f12344a.f(k0Var);
                                                if (objF3 == null) {
                                                    i13 = i21;
                                                    i14 = i22;
                                                    i15 = i19;
                                                    i16 = length;
                                                } else if (objF3 instanceof q.t) {
                                                    q.t tVar3 = (q.t) objF3;
                                                    Object[] objArr7 = tVar3.f13039b;
                                                    long[] jArr8 = tVar3.f13038a;
                                                    int length2 = jArr8.length - 2;
                                                    if (length2 >= 0) {
                                                        i15 = i19;
                                                        i16 = length;
                                                        int i23 = 0;
                                                        while (true) {
                                                            long j11 = jArr8[i23];
                                                            i13 = i21;
                                                            i14 = i22;
                                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                                int i25 = 0;
                                                                while (i25 < i24) {
                                                                    if ((j11 & 255) < 128) {
                                                                        tVar.c(objArr7[(i23 << 3) + i25]);
                                                                        z10 = true;
                                                                    }
                                                                    j11 >>= 8;
                                                                    i25++;
                                                                    jArr8 = jArr8;
                                                                }
                                                                jArr6 = jArr8;
                                                                if (i24 != 8) {
                                                                    break;
                                                                }
                                                            } else {
                                                                jArr6 = jArr8;
                                                            }
                                                            if (i23 == length2) {
                                                                break;
                                                            }
                                                            i23++;
                                                            i21 = i13;
                                                            i22 = i14;
                                                            jArr8 = jArr6;
                                                        }
                                                    } else {
                                                        i13 = i21;
                                                        i14 = i22;
                                                        i15 = i19;
                                                        i16 = length;
                                                    }
                                                } else {
                                                    i13 = i21;
                                                    i14 = i22;
                                                    i15 = i19;
                                                    i16 = length;
                                                    tVar.c(objF3);
                                                    z10 = true;
                                                }
                                            }
                                        } else {
                                            i13 = i21;
                                            i14 = i22;
                                            str2 = str3;
                                            jVar7 = jVar8;
                                            i15 = i19;
                                            i16 = length;
                                            jArr5 = jArr7;
                                            objArr4 = objArr6;
                                        }
                                        j10 >>= 8;
                                        i22 = i14 + 1;
                                        objArr6 = objArr4;
                                        jArr7 = jArr5;
                                        str3 = str2;
                                        jVar8 = jVar7;
                                        i19 = i15;
                                        length = i16;
                                        i21 = i13;
                                    }
                                    str = str3;
                                    jVar6 = jVar8;
                                    i12 = i19;
                                    int i26 = length;
                                    jArr4 = jArr7;
                                    objArr3 = objArr6;
                                    if (i21 != 8) {
                                        break;
                                    }
                                    length = i26;
                                } else {
                                    str = str3;
                                    jVar6 = jVar8;
                                    i12 = i19;
                                    jArr4 = jArr7;
                                    objArr3 = objArr6;
                                }
                                if (i20 == length) {
                                    break;
                                }
                                i20++;
                                i18 = i11;
                                objArr6 = objArr3;
                                jArr7 = jArr4;
                                str3 = str;
                                jVar8 = jVar6;
                                i19 = i12;
                            }
                        } else {
                            i11 = i18;
                            objArr2 = objArr5;
                            o3Var = o3Var2;
                            str = str3;
                            jVar6 = jVar8;
                            i12 = i19;
                        }
                    } else {
                        i11 = i18;
                        objArr2 = objArr5;
                        o3Var = o3Var2;
                        str = str3;
                        jVar6 = jVar8;
                        i12 = i19;
                        m0.k0 k0Var2 = (m0.k0) objF2;
                        Object obj4 = map3.get(k0Var2);
                        m0.j0 j0Var2 = (m0.j0) k0Var2;
                        z2 z2Var2 = j0Var2.f11571c;
                        if (z2Var2 == null) {
                            z2Var2 = o3Var;
                        }
                        if (z2Var2.a(j0Var2.f().f11562f, obj4)) {
                            iVar.c(k0Var2);
                        } else {
                            Object objF4 = jVar9.f12344a.f(k0Var2);
                            if (objF4 != null) {
                                if (objF4 instanceof q.t) {
                                    q.t tVar4 = (q.t) objF4;
                                    Object[] objArr8 = tVar4.f13039b;
                                    long[] jArr9 = tVar4.f13038a;
                                    int length3 = jArr9.length - 2;
                                    if (length3 >= 0) {
                                        int i27 = 0;
                                        while (true) {
                                            long j12 = jArr9[i27];
                                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i27 != length3) {
                                                    break;
                                                    break;
                                                }
                                                i27++;
                                            } else {
                                                int i28 = 8 - ((~(i27 - length3)) >>> 31);
                                                for (int i29 = 0; i29 < i28; i29++) {
                                                    if ((j12 & 255) < 128) {
                                                        tVar.c(objArr8[(i27 << 3) + i29]);
                                                        z10 = true;
                                                    }
                                                    j12 >>= 8;
                                                }
                                                if (i28 != 8) {
                                                    break;
                                                }
                                                if (i27 != length3) {
                                                    break;
                                                }
                                                i27++;
                                            }
                                        }
                                    }
                                } else {
                                    tVar.c(objF4);
                                    z10 = true;
                                }
                            }
                        }
                    }
                    Object objF5 = jVar9.f12344a.f(obj2);
                    if (objF5 != null) {
                        if (objF5 instanceof q.t) {
                            q.t tVar5 = (q.t) objF5;
                            Object[] objArr9 = tVar5.f13039b;
                            long[] jArr10 = tVar5.f13038a;
                            int length4 = jArr10.length - 2;
                            if (length4 >= 0) {
                                int i30 = 0;
                                while (true) {
                                    long j13 = jArr10[i30];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i30 != length4) {
                                            break;
                                            break;
                                        }
                                        i30++;
                                    } else {
                                        int i31 = 8 - ((~(i30 - length4)) >>> 31);
                                        for (int i32 = 0; i32 < i31; i32++) {
                                            if ((j13 & 255) < 128) {
                                                tVar.c(objArr9[(i30 << 3) + i32]);
                                                z10 = true;
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i31 != 8) {
                                            break;
                                        }
                                        if (i30 != length4) {
                                            break;
                                        }
                                        i30++;
                                    }
                                }
                            }
                        } else {
                            tVar.c(objF5);
                            z10 = true;
                        }
                    }
                } else {
                    i11 = i18;
                    objArr2 = objArr5;
                    o3Var = o3Var2;
                    str = str3;
                    jVar6 = jVar8;
                    i12 = i19;
                }
                i19 = i12 + 1;
                i17 = 2;
                objArr5 = objArr2;
                o3Var2 = o3Var;
                i18 = i11;
                str3 = str;
                jVar8 = jVar6;
            }
        } else {
            o0.j jVar10 = jVar8;
            Iterator it3 = set.iterator();
            z10 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof h0) || ((h0) next).b(2)) {
                    o0.j jVar11 = jVar10;
                    if (!jVar11.f12344a.b(next) || (objF = jVar11.f12344a.f(next)) == null) {
                        it = it3;
                        obj = next;
                        map = map3;
                        jVar10 = jVar11;
                        jVar = jVar9;
                    } else if (objF instanceof q.t) {
                        q.t tVar6 = (q.t) objF;
                        Object[] objArr10 = tVar6.f13039b;
                        long[] jArr11 = tVar6.f13038a;
                        int length5 = jArr11.length - 2;
                        if (length5 >= 0) {
                            int i33 = 0;
                            while (true) {
                                long j14 = jArr11[i33];
                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i34 = 8 - ((~(i33 - length5)) >>> 31);
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        if ((j14 & 255) < 128) {
                                            m0.k0 k0Var3 = (m0.k0) objArr10[(i33 << 3) + i35];
                                            it2 = it3;
                                            d7.a.k(k0Var3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                            Object obj5 = map3.get(k0Var3);
                                            jVar3 = jVar11;
                                            m0.j0 j0Var3 = (m0.j0) k0Var3;
                                            jArr2 = jArr11;
                                            z2 z2Var3 = j0Var3.f11571c;
                                            if (z2Var3 == null) {
                                                z2Var3 = o3Var2;
                                            }
                                            if (z2Var3.a(j0Var3.f().f11562f, obj5)) {
                                                next = next;
                                                map3 = map3;
                                                i10 = length5;
                                                jVar4 = jVar9;
                                                iVar.c(k0Var3);
                                            } else {
                                                Object objF6 = jVar9.f12344a.f(k0Var3);
                                                if (objF6 != null) {
                                                    if (objF6 instanceof q.t) {
                                                        q.t tVar7 = (q.t) objF6;
                                                        Object[] objArr11 = tVar7.f13039b;
                                                        long[] jArr12 = tVar7.f13038a;
                                                        int length6 = jArr12.length - 2;
                                                        if (length6 >= 0) {
                                                            next = next;
                                                            map3 = map3;
                                                            int i36 = 0;
                                                            while (true) {
                                                                long j15 = jArr12[i36];
                                                                i10 = length5;
                                                                jVar4 = jVar9;
                                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i37 = 8 - ((~(i36 - length6)) >>> 31);
                                                                    int i38 = 0;
                                                                    while (i38 < i37) {
                                                                        if ((j15 & 255) < 128) {
                                                                            tVar.c(objArr11[(i36 << 3) + i38]);
                                                                            z10 = true;
                                                                        }
                                                                        j15 >>= 8;
                                                                        i38++;
                                                                        jArr12 = jArr12;
                                                                    }
                                                                    jArr3 = jArr12;
                                                                    if (i37 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr3 = jArr12;
                                                                }
                                                                if (i36 == length6) {
                                                                    break;
                                                                }
                                                                i36++;
                                                                jVar9 = jVar4;
                                                                length5 = i10;
                                                                jArr12 = jArr3;
                                                            }
                                                        }
                                                    } else {
                                                        next = next;
                                                        map3 = map3;
                                                        i10 = length5;
                                                        jVar4 = jVar9;
                                                        tVar.c(objF6);
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                            j14 >>= 8;
                                            i35++;
                                            it3 = it2;
                                            jArr11 = jArr2;
                                            map3 = map3;
                                            next = next;
                                            jVar11 = jVar3;
                                            jVar9 = jVar4;
                                            length5 = i10;
                                        } else {
                                            it2 = it3;
                                            jVar3 = jVar11;
                                            jArr2 = jArr11;
                                        }
                                        i10 = length5;
                                        jVar4 = jVar9;
                                        j14 >>= 8;
                                        i35++;
                                        it3 = it2;
                                        jArr11 = jArr2;
                                        map3 = map3;
                                        next = next;
                                        jVar11 = jVar3;
                                        jVar9 = jVar4;
                                        length5 = i10;
                                    }
                                    it = it3;
                                    obj = next;
                                    map2 = map3;
                                    jVar10 = jVar11;
                                    jArr = jArr11;
                                    int i39 = length5;
                                    jVar2 = jVar9;
                                    if (i34 != 8) {
                                        break;
                                    }
                                    length5 = i39;
                                } else {
                                    it = it3;
                                    obj = next;
                                    map2 = map3;
                                    jVar10 = jVar11;
                                    jArr = jArr11;
                                    jVar2 = jVar9;
                                }
                                if (i33 == length5) {
                                    break;
                                }
                                i33++;
                                it3 = it;
                                jArr11 = jArr;
                                map3 = map2;
                                next = obj;
                                jVar11 = jVar10;
                                jVar9 = jVar2;
                            }
                        } else {
                            it = it3;
                            obj = next;
                            map2 = map3;
                            jVar10 = jVar11;
                            jVar2 = jVar9;
                        }
                        map = map2;
                        jVar = jVar2;
                    } else {
                        it = it3;
                        obj = next;
                        jVar10 = jVar11;
                        o0.j jVar12 = jVar9;
                        m0.k0 k0Var4 = (m0.k0) objF;
                        map = map3;
                        Object obj6 = map.get(k0Var4);
                        m0.j0 j0Var4 = (m0.j0) k0Var4;
                        z2 z2Var4 = j0Var4.f11571c;
                        if (z2Var4 == null) {
                            z2Var4 = o3Var2;
                        }
                        if (z2Var4.a(j0Var4.f().f11562f, obj6)) {
                            jVar = jVar12;
                            iVar.c(k0Var4);
                        } else {
                            jVar = jVar12;
                            Object objF7 = jVar.f12344a.f(k0Var4);
                            if (objF7 != null) {
                                if (objF7 instanceof q.t) {
                                    q.t tVar8 = (q.t) objF7;
                                    Object[] objArr12 = tVar8.f13039b;
                                    long[] jArr13 = tVar8.f13038a;
                                    int length7 = jArr13.length - 2;
                                    if (length7 >= 0) {
                                        int i40 = 0;
                                        while (true) {
                                            long j16 = jArr13[i40];
                                            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i40 != length7) {
                                                    break;
                                                    break;
                                                }
                                                i40++;
                                            } else {
                                                int i41 = 8 - ((~(i40 - length7)) >>> 31);
                                                for (int i42 = 0; i42 < i41; i42++) {
                                                    if ((j16 & 255) < 128) {
                                                        tVar.c(objArr12[(i40 << 3) + i42]);
                                                        z10 = true;
                                                    }
                                                    j16 >>= 8;
                                                }
                                                if (i41 != 8) {
                                                    break;
                                                }
                                                if (i40 != length7) {
                                                    break;
                                                }
                                                i40++;
                                            }
                                        }
                                    }
                                } else {
                                    tVar.c(objF7);
                                    z10 = true;
                                }
                            }
                        }
                    }
                    Object objF8 = jVar.f12344a.f(obj);
                    if (objF8 != null) {
                        if (objF8 instanceof q.t) {
                            q.t tVar9 = (q.t) objF8;
                            Object[] objArr13 = tVar9.f13039b;
                            long[] jArr14 = tVar9.f13038a;
                            int length8 = jArr14.length - 2;
                            if (length8 >= 0) {
                                int i43 = 0;
                                while (true) {
                                    long j17 = jArr14[i43];
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i43 != length8) {
                                            break;
                                            break;
                                        }
                                        i43++;
                                    } else {
                                        int i44 = 8 - ((~(i43 - length8)) >>> 31);
                                        for (int i45 = 0; i45 < i44; i45++) {
                                            if ((j17 & 255) < 128) {
                                                tVar.c(objArr13[(i43 << 3) + i45]);
                                                z10 = true;
                                            }
                                            j17 >>= 8;
                                        }
                                        if (i44 != 8) {
                                            break;
                                        }
                                        if (i43 != length8) {
                                            break;
                                        }
                                        i43++;
                                    }
                                }
                            }
                        } else {
                            tVar.c(objF8);
                            z10 = true;
                        }
                    }
                } else {
                    it = it3;
                    map = map3;
                    jVar = jVar9;
                }
                map3 = map;
                jVar9 = jVar;
                it3 = it;
            }
        }
        o0.j jVar13 = jVar9;
        if (iVar.l()) {
            int i46 = iVar.f12343c;
            if (i46 > 0) {
                Object[] objArr14 = iVar.f12341a;
                int i47 = 0;
                while (true) {
                    m0.k0 k0Var5 = (m0.k0) objArr14[i47];
                    int iD = p.i().d();
                    Object objF9 = jVar13.f12344a.f(k0Var5);
                    if (objF9 != null) {
                        boolean z12 = objF9 instanceof q.t;
                        q.s sVar = this.f16138f;
                        if (z12) {
                            q.t tVar10 = (q.t) objF9;
                            Object[] objArr15 = tVar10.f13039b;
                            long[] jArr15 = tVar10.f13038a;
                            int length9 = jArr15.length - 2;
                            if (length9 >= 0) {
                                int i48 = 0;
                                while (true) {
                                    long j18 = jArr15[i48];
                                    int i49 = i48;
                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i50 = 8 - ((~(i49 - length9)) >>> 31);
                                        int i51 = 0;
                                        while (i51 < i50) {
                                            if ((j18 & 255) < 128) {
                                                Object obj7 = objArr15[(i49 << 3) + i51];
                                                q.r rVar2 = (q.r) sVar.f(obj7);
                                                if (rVar2 == null) {
                                                    rVar = new q.r();
                                                    sVar.l(obj7, rVar);
                                                } else {
                                                    rVar = rVar2;
                                                }
                                                c(k0Var5, iD, obj7, rVar);
                                            }
                                            j18 >>= 8;
                                            i51++;
                                            objArr14 = objArr14;
                                            jVar13 = jVar13;
                                        }
                                        jVar5 = jVar13;
                                        objArr = objArr14;
                                        if (i50 != 8) {
                                            break;
                                        }
                                    } else {
                                        jVar5 = jVar13;
                                        objArr = objArr14;
                                    }
                                    if (i49 == length9) {
                                        break;
                                    }
                                    i48 = i49 + 1;
                                    objArr14 = objArr;
                                    jVar13 = jVar5;
                                }
                            } else {
                                jVar5 = jVar13;
                                objArr = objArr14;
                            }
                        } else {
                            jVar5 = jVar13;
                            objArr = objArr14;
                            q.r rVar3 = (q.r) sVar.f(objF9);
                            if (rVar3 == null) {
                                rVar3 = new q.r();
                                sVar.l(objF9, rVar3);
                            }
                            c(k0Var5, iD, objF9, rVar3);
                        }
                    } else {
                        jVar5 = jVar13;
                        objArr = objArr14;
                    }
                    i47++;
                    if (i47 >= i46) {
                        break;
                    }
                    objArr14 = objArr;
                    jVar13 = jVar5;
                }
            }
            iVar.g();
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008e A[LOOP:0: B:15:0x0049->B:28:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091 A[EDGE_INSN: B:37:0x0091->B:29:0x0091 BREAK  A[LOOP:0: B:15:0x0049->B:28:0x008e], SYNTHETIC] */
    public final void c(Object obj, int i10, Object obj2, q.r rVar) {
        int i11;
        if (this.f16142j > 0) {
            return;
        }
        int iC = rVar.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i11 = -1;
        } else {
            i11 = rVar.f13023c[iC];
        }
        rVar.f13022b[iC] = obj;
        rVar.f13023c[iC] = i10;
        if ((obj instanceof m0.k0) && i11 != i10) {
            m0.i0 i0VarF = ((m0.j0) ((m0.k0) obj)).f();
            this.f16144l.put(obj, i0VarF.f11562f);
            q.r rVar2 = i0VarF.f11561e;
            o0.j jVar = this.f16143k;
            jVar.c(obj);
            Object[] objArr = rVar2.f13022b;
            long[] jArr = rVar2.f13021a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j10 = jArr[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i12 != length) {
                            break;
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j10 & 255) < 128) {
                                g0 g0Var = (g0) objArr[(i12 << 3) + i14];
                                if (g0Var instanceof h0) {
                                    ((h0) g0Var).c(2);
                                }
                                jVar.a(g0Var, obj);
                            }
                            j10 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        } else if (i12 != length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        if (i11 == -1) {
            if (obj instanceof h0) {
                ((h0) obj).c(2);
            }
            this.f16137e.a(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        o0.j jVar = this.f16137e;
        jVar.b(obj2, obj);
        if (!(obj2 instanceof m0.k0) || jVar.f12344a.b(obj2)) {
            return;
        }
        this.f16143k.c(obj2);
        this.f16144l.remove(obj2);
    }

    public final void e() {
        t1.f fVar;
        long[] jArr;
        int i10;
        t1.f fVar2;
        long[] jArr2;
        int i11;
        int i12;
        int i13;
        char c10;
        long j10;
        int i14;
        t1.f fVar3 = t1.f.f14425s;
        q.s sVar = this.f16138f;
        long[] jArr3 = sVar.f13027a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j11 = jArr3[i15];
            char c11 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j11 & 255) < 128) {
                        int i19 = (i15 << 3) + i18;
                        Object obj = sVar.f13028b[i19];
                        q.r rVar = (q.r) sVar.f13029c[i19];
                        Boolean bool = (Boolean) fVar3.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = rVar.f13022b;
                            int[] iArr = rVar.f13023c;
                            long[] jArr4 = rVar.f13021a;
                            int length2 = jArr4.length - 2;
                            fVar2 = fVar3;
                            jArr2 = jArr3;
                            i11 = length;
                            if (length2 >= 0) {
                                int i20 = 0;
                                while (true) {
                                    long j13 = jArr4[i20];
                                    i13 = i17;
                                    long[] jArr5 = jArr4;
                                    c10 = 7;
                                    j10 = -9187201950435737472L;
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                        int i22 = 0;
                                        while (i22 < i21) {
                                            if ((j13 & 255) < 128) {
                                                int i23 = (i20 << 3) + i22;
                                                Object obj2 = objArr[i23];
                                                int i24 = iArr[i23];
                                                d(obj, obj2);
                                            }
                                            j13 >>= 8;
                                            i22++;
                                            i15 = i15;
                                        }
                                        i12 = i15;
                                        if (i21 != 8) {
                                            break;
                                        }
                                    } else {
                                        i12 = i15;
                                    }
                                    if (i20 == length2) {
                                        break;
                                    }
                                    i20++;
                                    i17 = i13;
                                    jArr4 = jArr5;
                                    i15 = i12;
                                }
                            } else {
                                i12 = i15;
                                i13 = i17;
                                j10 = -9187201950435737472L;
                                c10 = 7;
                            }
                        } else {
                            fVar2 = fVar3;
                            jArr2 = jArr3;
                            i11 = length;
                            i12 = i15;
                            i13 = i17;
                            c10 = c11;
                            j10 = j12;
                        }
                        if (bool.booleanValue()) {
                            sVar.j(i19);
                        }
                        i14 = 8;
                    } else {
                        fVar2 = fVar3;
                        jArr2 = jArr3;
                        i11 = length;
                        i12 = i15;
                        i13 = i17;
                        c10 = c11;
                        j10 = j12;
                        i14 = i16;
                    }
                    j11 >>= i14;
                    i18++;
                    i16 = i14;
                    j12 = j10;
                    c11 = c10;
                    fVar3 = fVar2;
                    jArr3 = jArr2;
                    length = i11;
                    i17 = i13;
                    i15 = i12;
                }
                fVar = fVar3;
                jArr = jArr3;
                int i25 = length;
                int i26 = i15;
                if (i17 != i16) {
                    return;
                }
                length = i25;
                i10 = i26;
            } else {
                fVar = fVar3;
                jArr = jArr3;
                i10 = i15;
            }
            if (i10 == length) {
                return;
            }
            i15 = i10 + 1;
            fVar3 = fVar;
            jArr3 = jArr;
        }
    }
}
