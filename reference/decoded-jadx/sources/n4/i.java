package n4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.a0;
import d7.t;
import d9.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import k4.o;
import l.z2;
import m9.z;
import r8.p;
import s4.n;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4.i f12213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f12214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4.e f12215c;

    public i(i4.i iVar, z2 z2Var) {
        this.f12213a = iVar;
        this.f12214b = z2Var;
        this.f12215c = new q4.e(iVar, z2Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x0096  */
    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c7 -> B:24:0x00ce). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(n4.i r19, m4.n r20, i4.c r21, s4.j r22, java.lang.Object r23, s4.n r24, i4.e r25, u8.e r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.a(n4.i, m4.n, i4.c, s4.j, java.lang.Object, s4.n, i4.e, u8.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0254  */
    /* JADX WARN: Code duplicated, block: B:120:0x0258  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code duplicated, block: B:93:0x021c A[PHI: r1 r3
  0x021c: PHI (r1v37 java.lang.Object) = (r1v33 java.lang.Object), (r1v1 java.lang.Object) binds: [B:91:0x0219, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x021c: PHI (r3v15 android.graphics.drawable.BitmapDrawable) = (r3v13 android.graphics.drawable.BitmapDrawable), (r3v19 android.graphics.drawable.BitmapDrawable) binds: [B:91:0x0219, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0225  */
    /* JADX WARN: Code duplicated, block: B:96:0x0229  */
    /* JADX WARN: Code duplicated, block: B:98:0x022c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [v8.a] */
    /* JADX WARN: Type inference failed for: r10v3, types: [n4.a] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public static final Object b(i iVar, s4.j jVar, Object obj, n nVar, i4.e eVar, u8.e eVar2) throws Throwable {
        c cVar;
        m4.n nVar2;
        Object obj2;
        m4.n nVar3;
        o oVar;
        u uVar;
        u uVar2;
        i4.e eVar3;
        s4.j jVar2;
        Object obj3;
        u uVar3;
        Object obj4;
        i iVar2;
        a aVar;
        i4.e eVar4;
        i iVar3;
        s4.j jVar3;
        i4.e eVar5;
        u uVar4;
        u uVar5;
        Object obj5;
        m4.n nVar4;
        n nVar5;
        BitmapDrawable bitmapDrawable;
        List list;
        o oVar2;
        u uVar6;
        Object obj6;
        Drawable drawable;
        BitmapDrawable bitmapDrawable2;
        Bitmap bitmap;
        i iVar4 = iVar;
        iVar.getClass();
        if (eVar2 instanceof c) {
            cVar = (c) eVar2;
            int i10 = cVar.f12169r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f12169r = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(iVar4, eVar2);
            }
        } else {
            cVar = new c(iVar4, eVar2);
        }
        c cVar2 = cVar;
        Object objU0 = cVar2.f12167p;
        Object obj7 = v8.a.f15963a;
        u uVar7 = cVar2.f12169r;
        try {
            if (uVar7 != 0) {
                if (uVar7 == 1) {
                    u uVar8 = cVar2.f12166o;
                    u uVar9 = cVar2.f12165n;
                    u uVar10 = cVar2.f12164f;
                    u uVar11 = cVar2.f12163e;
                    i4.e eVar6 = (i4.e) cVar2.f12162d;
                    Object obj8 = cVar2.f12161c;
                    jVar2 = cVar2.f12160b;
                    i iVar5 = cVar2.f12159a;
                    t.v0(objU0);
                    uVar2 = uVar8;
                    uVar3 = uVar10;
                    uVar = uVar11;
                    eVar3 = eVar6;
                    obj3 = obj8;
                    iVar4 = iVar5;
                    obj4 = objU0;
                    uVar7 = uVar9;
                } else {
                    if (uVar7 == 2) {
                        u uVar12 = cVar2.f12163e;
                        uVar4 = (u) cVar2.f12162d;
                        eVar5 = (i4.e) cVar2.f12161c;
                        jVar3 = cVar2.f12160b;
                        iVar3 = cVar2.f12159a;
                        t.v0(objU0);
                        obj6 = objU0;
                        uVar6 = uVar12;
                        uVar = uVar4;
                        eVar4 = eVar5;
                        jVar2 = jVar3;
                        iVar2 = iVar3;
                        aVar = (a) obj6;
                        uVar5 = uVar6;
                        obj5 = uVar5.f4952a;
                        if (obj5 instanceof m4.n) {
                            nVar4 = (m4.n) obj5;
                        } else {
                            nVar4 = null;
                        }
                        if (nVar4 != null && (oVar2 = nVar4.f11860a) != null) {
                            w4.e.a(oVar2);
                        }
                        nVar5 = (n) uVar.f4952a;
                        bitmapDrawable = null;
                        cVar2.f12159a = null;
                        cVar2.f12160b = null;
                        cVar2.f12161c = null;
                        cVar2.f12162d = null;
                        cVar2.f12163e = null;
                        cVar2.f12164f = null;
                        cVar2.f12165n = null;
                        cVar2.f12166o = null;
                        cVar2.f12169r = 3;
                        iVar2.getClass();
                        list = jVar2.f14006l;
                        objU0 = aVar;
                        if (!list.isEmpty() && ((aVar.f12144a instanceof BitmapDrawable) || jVar2.f14010p)) {
                            objU0 = aVar;
                            objU0 = z6.a.u0(jVar2.f14020z, new h(iVar2, aVar, nVar5, list, eVar4, jVar2, null), cVar2);
                        }
                        if (objU0 != obj7) {
                        }
                        return obj7;
                    }
                    if (uVar7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.v0(objU0);
                    bitmapDrawable = null;
                }
                obj7 = (a) objU0;
                drawable = obj7.f12144a;
                if (drawable instanceof BitmapDrawable) {
                    bitmapDrawable2 = (BitmapDrawable) drawable;
                } else {
                    bitmapDrawable2 = bitmapDrawable;
                }
                if (bitmapDrawable2 != null && (bitmap = bitmapDrawable2.getBitmap()) != null) {
                    bitmap.prepareToDraw();
                }
                return obj7;
            }
            t.v0(objU0);
            uVar = new u();
            uVar.f4952a = nVar;
            u uVar13 = new u();
            uVar13.f4952a = ((i4.o) iVar4.f12213a).f8060d;
            u uVar14 = new u();
            try {
                z2 z2Var = iVar4.f12214b;
                try {
                    n nVar6 = (n) uVar.f4952a;
                    try {
                        z2Var.getClass();
                        if (nVar6.f14023b == Bitmap.Config.HARDWARE && !((w4.i) z2Var.f10985d).a()) {
                            try {
                                uVar.f4952a = n.a((n) uVar.f4952a, Bitmap.Config.ARGB_8888);
                            } catch (Throwable th) {
                                th = th;
                                uVar7 = uVar14;
                                nVar2 = null;
                            }
                        }
                        q8.f fVar = jVar.f14004j;
                        k4.c cVar3 = jVar.f14005k;
                        if (fVar != null || cVar3 != null) {
                            i4.c cVar4 = (i4.c) uVar13.f4952a;
                            cVar4.getClass();
                            ArrayList arrayListY0 = p.Y0(cVar4.f8023a);
                            ArrayList arrayListY1 = p.Y0(cVar4.f8024b);
                            ArrayList arrayListY2 = p.Y0(cVar4.f8025c);
                            ArrayList arrayListY3 = p.Y0(cVar4.f8026d);
                            ArrayList arrayListY4 = p.Y0(cVar4.f8027e);
                            q8.f fVar2 = jVar.f14004j;
                            if (fVar2 != null) {
                                arrayListY3.add(0, fVar2);
                            }
                            if (cVar3 != null) {
                                arrayListY4.add(0, cVar3);
                            }
                            uVar13.f4952a = new i4.c(y3.e.F0(arrayListY0), y3.e.F0(arrayListY1), y3.e.F0(arrayListY2), y3.e.F0(arrayListY3), y3.e.F0(arrayListY4));
                        }
                        i4.c cVar5 = (i4.c) uVar13.f4952a;
                        n nVar7 = (n) uVar.f4952a;
                        cVar2.f12159a = iVar4;
                        cVar2.f12160b = jVar;
                        cVar2.f12161c = obj;
                        eVar3 = eVar;
                        cVar2.f12162d = eVar3;
                        cVar2.f12163e = uVar;
                        cVar2.f12164f = uVar13;
                        cVar2.f12165n = uVar14;
                        cVar2.f12166o = uVar14;
                        cVar2.f12169r = 1;
                        uVar2 = uVar14;
                        try {
                            Object objC = iVar.c(cVar5, jVar, obj, nVar7, eVar, cVar2);
                            if (objC != obj7) {
                                jVar2 = jVar;
                                obj3 = obj;
                                uVar7 = uVar2;
                                uVar3 = uVar13;
                                obj4 = objC;
                            }
                            return obj7;
                        } catch (Throwable th2) {
                            th = th2;
                            nVar2 = null;
                            uVar7 = uVar2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        uVar2 = uVar14;
                        nVar2 = null;
                        uVar7 = uVar2;
                        obj2 = uVar7.f4952a;
                        if (obj2 instanceof m4.n) {
                            nVar3 = (m4.n) obj2;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (nVar3 != null) {
                            w4.e.a(oVar);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    uVar2 = uVar14;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            uVar2.f4952a = obj4;
            Object obj9 = uVar7.f4952a;
            m4.e eVar7 = (m4.e) obj9;
            if (!(eVar7 instanceof m4.n)) {
                if (eVar7 instanceof m4.d) {
                    try {
                        iVar2 = iVar4;
                        aVar = new a(((m4.d) obj9).f11835a, ((m4.d) obj9).f11836b, ((m4.d) obj9).f11837c, null);
                        eVar4 = eVar3;
                        uVar5 = uVar7;
                        obj5 = uVar5.f4952a;
                        if (obj5 instanceof m4.n) {
                            nVar4 = (m4.n) obj5;
                        } else {
                            nVar4 = null;
                        }
                        if (nVar4 != null) {
                            w4.e.a(oVar2);
                        }
                        nVar5 = (n) uVar.f4952a;
                        bitmapDrawable = null;
                        cVar2.f12159a = null;
                        cVar2.f12160b = null;
                        cVar2.f12161c = null;
                        cVar2.f12162d = null;
                        cVar2.f12163e = null;
                        cVar2.f12164f = null;
                        cVar2.f12165n = null;
                        cVar2.f12166o = null;
                        cVar2.f12169r = 3;
                        iVar2.getClass();
                        list = jVar2.f14006l;
                        objU0 = aVar;
                        if (!list.isEmpty()) {
                            objU0 = aVar;
                            objU0 = z6.a.u0(jVar2.f14020z, new h(iVar2, aVar, nVar5, list, eVar4, jVar2, null), cVar2);
                        }
                        if (objU0 != obj7) {
                            obj7 = (a) objU0;
                            drawable = obj7.f12144a;
                            if (drawable instanceof BitmapDrawable) {
                                bitmapDrawable2 = (BitmapDrawable) drawable;
                            } else {
                                bitmapDrawable2 = bitmapDrawable;
                            }
                            if (bitmapDrawable2 != null) {
                                bitmap.prepareToDraw();
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        nVar2 = null;
                    }
                } else {
                    nVar2 = null;
                    try {
                        throw new a0();
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
                obj2 = uVar7.f4952a;
                if (obj2 instanceof m4.n) {
                    nVar3 = (m4.n) obj2;
                } else {
                    nVar3 = nVar2;
                }
                if (nVar3 != null && (oVar = nVar3.f11860a) != null) {
                    w4.e.a(oVar);
                }
                throw th;
            }
            z zVar = jVar2.f14019y;
            d dVar = new d(iVar4, uVar7, uVar3, jVar2, obj3, uVar, eVar3, null);
            cVar2.f12159a = iVar4;
            cVar2.f12160b = jVar2;
            cVar2.f12161c = eVar3;
            cVar2.f12162d = uVar;
            cVar2.f12163e = uVar7;
            cVar2.f12164f = null;
            cVar2.f12165n = null;
            cVar2.f12166o = null;
            cVar2.f12169r = 2;
            Object objU1 = z6.a.u0(zVar, dVar, cVar2);
            if (objU1 != obj7) {
                iVar3 = iVar4;
                jVar3 = jVar2;
                eVar5 = eVar3;
                uVar4 = uVar;
                obj6 = objU1;
                uVar6 = uVar7;
                uVar = uVar4;
                eVar4 = eVar5;
                jVar2 = jVar3;
                iVar2 = iVar3;
                aVar = (a) obj6;
                uVar5 = uVar6;
                obj5 = uVar5.f4952a;
                if (obj5 instanceof m4.n) {
                    nVar4 = (m4.n) obj5;
                } else {
                    nVar4 = null;
                }
                if (nVar4 != null) {
                    w4.e.a(oVar2);
                }
                nVar5 = (n) uVar.f4952a;
                bitmapDrawable = null;
                cVar2.f12159a = null;
                cVar2.f12160b = null;
                cVar2.f12161c = null;
                cVar2.f12162d = null;
                cVar2.f12163e = null;
                cVar2.f12164f = null;
                cVar2.f12165n = null;
                cVar2.f12166o = null;
                cVar2.f12169r = 3;
                iVar2.getClass();
                list = jVar2.f14006l;
                objU0 = aVar;
                if (!list.isEmpty()) {
                    objU0 = aVar;
                    objU0 = z6.a.u0(jVar2.f14020z, new h(iVar2, aVar, nVar5, list, eVar4, jVar2, null), cVar2);
                }
                if (objU0 != obj7) {
                    obj7 = (a) objU0;
                    drawable = obj7.f12144a;
                    if (drawable instanceof BitmapDrawable) {
                        bitmapDrawable2 = (BitmapDrawable) drawable;
                    } else {
                        bitmapDrawable2 = bitmapDrawable;
                    }
                    if (bitmapDrawable2 != null) {
                        bitmap.prepareToDraw();
                    }
                }
            }
            return obj7;
        } catch (Throwable th8) {
            th = th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Code duplicated, block: B:25:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c9 -> B:29:0x00cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(i4.c r18, s4.j r19, java.lang.Object r20, s4.n r21, i4.e r22, u8.e r23) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.c(i4.c, s4.j, java.lang.Object, s4.n, i4.e, u8.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(l lVar, u8.e eVar) throws Throwable {
        f fVar;
        i iVar;
        l lVar2 = lVar;
        q4.e eVar2 = this.f12215c;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i10 = fVar.f12192e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f12192e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, eVar);
            }
        } else {
            fVar = new f(this, eVar);
        }
        f fVar2 = fVar;
        Object objU0 = fVar2.f12190c;
        v8.a aVar = v8.a.f15963a;
        int i11 = fVar2.f12192e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l lVar3 = fVar2.f12189b;
            iVar = fVar2.f12188a;
            try {
                t.v0(objU0);
            } catch (Throwable th) {
                th = th;
                lVar2 = lVar3;
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                z2 z2Var = iVar.f12214b;
                s4.j jVar = lVar2.f12224d;
                z2Var.getClass();
                return z2.o(jVar, th);
            }
        }
        t.v0(objU0);
        try {
            s4.j jVar2 = lVar2.f12224d;
            Object obj = jVar2.f13996b;
            t4.f fVar3 = lVar2.f12225e;
            Bitmap.Config[] configArr = w4.e.f16163a;
            i4.e eVar3 = lVar2.f12226f;
            n nVarJ = this.f12214b.J(jVar2, fVar3);
            t4.e eVar4 = nVarJ.f14026e;
            eVar3.getClass();
            Object objA = ((i4.o) this.f12213a).f8060d.a(obj, nVarJ);
            q4.c cVarB = eVar2.b(jVar2, objA, nVarJ, eVar3);
            q4.d dVarA = cVarB != null ? eVar2.a(jVar2, cVarB, fVar3, eVar4) : null;
            if (dVarA != null) {
                return q4.e.c(lVar2, jVar2, cVarB, dVarA);
            }
            z zVar = jVar2.f14018x;
            g gVar = new g(this, jVar2, objA, nVarJ, eVar3, cVarB, lVar, null);
            fVar2.f12188a = this;
            fVar2.f12189b = lVar2;
            fVar2.f12192e = 1;
            objU0 = z6.a.u0(zVar, gVar, fVar2);
            return objU0 == aVar ? aVar : objU0;
        } catch (Throwable th2) {
            th = th2;
            iVar = this;
            if (!(th instanceof CancellationException)) {
                throw th;
            }
            z2 z2Var2 = iVar.f12214b;
            s4.j jVar3 = lVar2.f12224d;
            z2Var2.getClass();
            return z2.o(jVar3, th);
        }
    }
}
