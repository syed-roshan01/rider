package i4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.r;
import d7.t;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import l.z2;
import m9.f1;
import m9.m0;
import m9.y1;
import m9.z;
import r8.p;
import s4.q;
import x9.s;

/* JADX INFO: loaded from: classes.dex */
public final class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4.c f8057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8.c f8058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2 f8059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f8060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8061e;

    public o(Context context, s4.c cVar, q8.i iVar, q8.i iVar2, q8.i iVar3, c cVar2, w4.j jVar) {
        this.f8057a = cVar;
        this.f8058b = iVar;
        y1 y1VarK = t.k();
        t9.d dVar = m0.f11969a;
        d7.a.b(y1VarK.O(((n9.d) r9.o.f13724a).f12323f).O(new n(this)));
        w4.l lVar = new w4.l(this, context, jVar.f16179b);
        z2 z2Var = new z2(this, lVar);
        this.f8059c = z2Var;
        b bVar = new b(cVar2);
        bVar.b(new p4.a(2), s.class);
        bVar.b(new p4.a(5), String.class);
        bVar.b(new p4.a(1), Uri.class);
        bVar.b(new p4.a(4), Uri.class);
        bVar.b(new p4.a(3), Integer.class);
        bVar.b(new p4.a(0), byte[].class);
        o4.c cVar3 = new o4.c();
        ArrayList arrayList = bVar.f8020c;
        arrayList.add(new q8.f(cVar3, Uri.class));
        arrayList.add(new q8.f(new o4.a(jVar.f16178a), File.class));
        bVar.a(new m4.i(iVar3, iVar2, jVar.f16180c), Uri.class);
        bVar.a(new m4.a(5), File.class);
        bVar.a(new m4.a(0), Uri.class);
        bVar.a(new m4.a(3), Uri.class);
        bVar.a(new m4.a(6), Uri.class);
        bVar.a(new m4.a(4), Drawable.class);
        bVar.a(new m4.a(1), Bitmap.class);
        bVar.a(new m4.a(2), ByteBuffer.class);
        k4.c cVar4 = new k4.c(jVar.f16181d, jVar.f16182e);
        ArrayList arrayList2 = bVar.f8022e;
        arrayList2.add(cVar4);
        List listF0 = y3.e.F0(bVar.f8018a);
        this.f8060d = new c(listF0, y3.e.F0(bVar.f8019b), y3.e.F0(arrayList), y3.e.F0(bVar.f8021d), y3.e.F0(arrayList2));
        this.f8061e = p.Q0(listF0, new n4.i(this, z2Var));
        new AtomicBoolean(false);
        context.registerComponentCallbacks(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:42:0x00c7, B:44:0x00d1, B:46:0x00d5, B:48:0x00dd, B:53:0x00eb, B:56:0x00f1, B:60:0x010b, B:62:0x010f, B:63:0x0112, B:59:0x00ff), top: B:112:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:42:0x00c7, B:44:0x00d1, B:46:0x00d5, B:48:0x00dd, B:53:0x00eb, B:56:0x00f1, B:60:0x010b, B:62:0x010f, B:63:0x0112, B:59:0x00ff), top: B:112:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:42:0x00c7, B:44:0x00d1, B:46:0x00d5, B:48:0x00dd, B:53:0x00eb, B:56:0x00f1, B:60:0x010b, B:62:0x010f, B:63:0x0112, B:59:0x00ff), top: B:112:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:42:0x00c7, B:44:0x00d1, B:46:0x00d5, B:48:0x00dd, B:53:0x00eb, B:56:0x00f1, B:60:0x010b, B:62:0x010f, B:63:0x0112, B:59:0x00ff), top: B:112:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:42:0x00c7, B:44:0x00d1, B:46:0x00d5, B:48:0x00dd, B:53:0x00eb, B:56:0x00f1, B:60:0x010b, B:62:0x010f, B:63:0x0112, B:59:0x00ff), top: B:112:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:42:0x00c7, B:44:0x00d1, B:46:0x00d5, B:48:0x00dd, B:53:0x00eb, B:56:0x00f1, B:60:0x010b, B:62:0x010f, B:63:0x0112, B:59:0x00ff), top: B:112:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x010f A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:42:0x00c7, B:44:0x00d1, B:46:0x00d5, B:48:0x00dd, B:53:0x00eb, B:56:0x00f1, B:60:0x010b, B:62:0x010f, B:63:0x0112, B:59:0x00ff), top: B:112:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0158  */
    /* JADX WARN: Code duplicated, block: B:73:0x015f A[Catch: all -> 0x0187, TryCatch #6 {all -> 0x0187, blocks: (B:71:0x0159, B:73:0x015f, B:76:0x016f, B:78:0x017e, B:77:0x0173, B:82:0x0189, B:84:0x018d), top: B:111:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0173 A[Catch: all -> 0x0187, TryCatch #6 {all -> 0x0187, blocks: (B:71:0x0159, B:73:0x015f, B:76:0x016f, B:78:0x017e, B:77:0x0173, B:82:0x0189, B:84:0x018d), top: B:111:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0189 A[Catch: all -> 0x0187, TryCatch #6 {all -> 0x0187, blocks: (B:71:0x0159, B:73:0x015f, B:76:0x016f, B:78:0x017e, B:77:0x0173, B:82:0x0189, B:84:0x018d), top: B:111:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x018d A[Catch: all -> 0x0187, TRY_LEAVE, TryCatch #6 {all -> 0x0187, blocks: (B:71:0x0159, B:73:0x015f, B:76:0x016f, B:78:0x017e, B:77:0x0173, B:82:0x0189, B:84:0x018d), top: B:111:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b2 A[Catch: all -> 0x01d2, TRY_LEAVE, TryCatch #4 {all -> 0x01d2, blocks: (B:91:0x01ae, B:93:0x01b2, B:96:0x01c9, B:97:0x01d1), top: B:108:0x01ae }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c9 A[Catch: all -> 0x01d2, TRY_ENTER, TryCatch #4 {all -> 0x01d2, blocks: (B:91:0x01ae, B:93:0x01b2, B:96:0x01c9, B:97:0x01d1), top: B:108:0x01ae }] */
    public static final Object a(o oVar, s4.j jVar, int i10, u8.e eVar) {
        l lVar;
        s4.j jVarA;
        e eVar2;
        s4.j jVar2;
        s4.p pVar;
        s4.p pVar2;
        q4.f fVar;
        Bitmap bitmap;
        Drawable drawableB;
        u4.a aVar;
        Object objC;
        Bitmap bitmap2;
        s4.j jVar3;
        e eVar3;
        q4.c cVar;
        q4.d dVarA;
        s4.k kVar;
        s4.k kVar2;
        u4.a aVar2;
        s4.j jVar4;
        o oVar2;
        o oVar3 = oVar;
        oVar.getClass();
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i11 = lVar.f8049o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f8049o = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new l(oVar3, eVar);
            }
        } else {
            lVar = new l(oVar3, eVar);
        }
        Object objU0 = lVar.f8047f;
        v8.a aVar3 = v8.a.f15963a;
        int i12 = lVar.f8049o;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    Bitmap bitmap3 = lVar.f8046e;
                    eVar3 = lVar.f8045d;
                    jVar3 = lVar.f8044c;
                    pVar2 = lVar.f8043b;
                    oVar2 = lVar.f8042a;
                    try {
                        t.v0(objU0);
                        bitmap2 = bitmap3;
                        oVar3 = oVar2;
                        try {
                            t4.f fVar2 = (t4.f) objU0;
                            eVar3.getClass();
                            z zVar = jVar3.f14017w;
                            m mVar = new m(jVar3, oVar3, fVar2, eVar3, bitmap2, null);
                            lVar.f8042a = oVar3;
                            lVar.f8043b = pVar2;
                            lVar.f8044c = jVar3;
                            lVar.f8045d = eVar3;
                            lVar.f8046e = null;
                            lVar.f8049o = 3;
                            objU0 = z6.a.u0(zVar, mVar, lVar);
                            if (objU0 == aVar3) {
                                return aVar3;
                            }
                            jVar2 = jVar3;
                        } catch (Throwable th) {
                            th = th;
                            eVar2 = eVar3;
                            jVar2 = jVar3;
                            pVar = pVar2;
                            if (!(th instanceof CancellationException)) {
                                oVar3.getClass();
                                eVar2.getClass();
                                s4.i iVar = jVar2.f13998d;
                                throw th;
                            }
                            oVar3.f8059c.getClass();
                            s4.e eVarO = z2.o(jVar2, th);
                            b(eVarO, jVar2.f13997c, eVar2);
                            s4.a aVar4 = (s4.a) pVar;
                            aVar4.f13927a.c(aVar4);
                            kVar = eVarO;
                            return kVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        eVar2 = eVar3;
                        jVar2 = jVar3;
                        pVar = pVar2;
                        oVar3 = oVar2;
                        if (!(th instanceof CancellationException)) {
                            oVar3.getClass();
                            eVar2.getClass();
                            s4.i iVar2 = jVar2.f13998d;
                            throw th;
                        }
                        oVar3.f8059c.getClass();
                        s4.e eVarO2 = z2.o(jVar2, th);
                        b(eVarO2, jVar2.f13997c, eVar2);
                        s4.a aVar5 = (s4.a) pVar;
                        aVar5.f13927a.c(aVar5);
                        kVar = eVarO2;
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e eVar4 = lVar.f8045d;
                    jVar2 = lVar.f8044c;
                    pVar = lVar.f8043b;
                    o oVar4 = lVar.f8042a;
                    try {
                        t.v0(objU0);
                        pVar2 = pVar;
                        eVar3 = eVar4;
                        oVar3 = oVar4;
                    } catch (Throwable th3) {
                        th = th3;
                        eVar2 = eVar4;
                        oVar3 = oVar4;
                        if (!(th instanceof CancellationException)) {
                            oVar3.getClass();
                            eVar2.getClass();
                            s4.i iVar3 = jVar2.f13998d;
                            throw th;
                        }
                        oVar3.f8059c.getClass();
                        s4.e eVarO3 = z2.o(jVar2, th);
                        b(eVarO3, jVar2.f13997c, eVar2);
                        s4.a aVar6 = (s4.a) pVar;
                        aVar6.f13927a.c(aVar6);
                        kVar = eVarO3;
                    }
                }
                try {
                    kVar2 = (s4.k) objU0;
                    if (kVar2 instanceof q) {
                        aVar2 = jVar2.f13997c;
                        oVar3.getClass();
                        jVar4 = ((q) kVar2).f14040b;
                        if (aVar2 instanceof j4.m) {
                            ((v4.a) jVar4.f14007m).getClass();
                        } else {
                            if (aVar2 != null) {
                            }
                            eVar3.getClass();
                            s4.i iVar4 = jVar4.f13998d;
                        }
                        aVar2.d();
                        eVar3.getClass();
                        s4.i iVar5 = jVar4.f13998d;
                    } else if (kVar2 instanceof s4.e) {
                        u4.a aVar7 = jVar2.f13997c;
                        oVar3.getClass();
                        b((s4.e) kVar2, aVar7, eVar3);
                    }
                    s4.a aVar8 = (s4.a) pVar2;
                    aVar8.f13927a.c(aVar8);
                    kVar = kVar2;
                } catch (Throwable th4) {
                    th = th4;
                    eVar2 = eVar3;
                    pVar = pVar2;
                    if (!(th instanceof CancellationException)) {
                        oVar3.getClass();
                        eVar2.getClass();
                        s4.i iVar6 = jVar2.f13998d;
                        throw th;
                    }
                    oVar3.f8059c.getClass();
                    s4.e eVarO4 = z2.o(jVar2, th);
                    b(eVarO4, jVar2.f13997c, eVar2);
                    s4.a aVar9 = (s4.a) pVar;
                    aVar9.f13927a.c(aVar9);
                    kVar = eVarO4;
                }
            } else {
                e eVar5 = lVar.f8045d;
                jVarA = lVar.f8044c;
                pVar2 = lVar.f8043b;
                oVar2 = lVar.f8042a;
                try {
                    t.v0(objU0);
                    eVar2 = eVar5;
                    oVar3 = oVar2;
                    try {
                        fVar = (q4.f) oVar3.f8058b.getValue();
                        if (fVar == null) {
                            bitmap = null;
                        } else {
                            cVar = jVarA.E;
                            if (cVar != null) {
                                dVarA = fVar.f13136a.a(cVar);
                                if (dVarA == null) {
                                    dVarA = fVar.f13137b.a(cVar);
                                }
                            } else {
                                dVarA = null;
                            }
                            if (dVarA != null) {
                                bitmap = dVarA.f13132a;
                            } else {
                                bitmap = null;
                            }
                        }
                        if (bitmap != null) {
                            drawableB = new BitmapDrawable(jVarA.f13995a.getResources(), bitmap);
                        } else {
                            drawableB = w4.d.b(jVarA, jVarA.G, jVarA.F, jVarA.M.f13943j);
                        }
                        aVar = jVarA.f13997c;
                        if (aVar != null) {
                            aVar.a(drawableB);
                        }
                        eVar2.getClass();
                        t4.g gVar = jVarA.B;
                        lVar.f8042a = oVar3;
                        lVar.f8043b = pVar2;
                        lVar.f8044c = jVarA;
                        lVar.f8045d = eVar2;
                        lVar.f8046e = bitmap;
                        lVar.f8049o = 2;
                        objC = gVar.c(lVar);
                        if (objC == aVar3) {
                            return aVar3;
                        }
                        bitmap2 = bitmap;
                        objU0 = objC;
                        jVar3 = jVarA;
                        eVar3 = eVar2;
                        t4.f fVar3 = (t4.f) objU0;
                        eVar3.getClass();
                        z zVar2 = jVar3.f14017w;
                        m mVar2 = new m(jVar3, oVar3, fVar3, eVar3, bitmap2, null);
                        lVar.f8042a = oVar3;
                        lVar.f8043b = pVar2;
                        lVar.f8044c = jVar3;
                        lVar.f8045d = eVar3;
                        lVar.f8046e = null;
                        lVar.f8049o = 3;
                        objU0 = z6.a.u0(zVar2, mVar2, lVar);
                        if (objU0 == aVar3) {
                            return aVar3;
                        }
                        jVar2 = jVar3;
                        kVar2 = (s4.k) objU0;
                        if (kVar2 instanceof q) {
                            aVar2 = jVar2.f13997c;
                            oVar3.getClass();
                            jVar4 = ((q) kVar2).f14040b;
                            if (aVar2 instanceof j4.m) {
                                if (aVar2 != null) {
                                }
                                eVar3.getClass();
                                s4.i iVar7 = jVar4.f13998d;
                            } else {
                                ((v4.a) jVar4.f14007m).getClass();
                            }
                            aVar2.d();
                            eVar3.getClass();
                            s4.i iVar8 = jVar4.f13998d;
                        } else if (kVar2 instanceof s4.e) {
                            u4.a aVar10 = jVar2.f13997c;
                            oVar3.getClass();
                            b((s4.e) kVar2, aVar10, eVar3);
                        }
                        s4.a aVar11 = (s4.a) pVar2;
                        aVar11.f13927a.c(aVar11);
                        kVar = kVar2;
                    } catch (Throwable th5) {
                        th = th5;
                        jVar2 = jVarA;
                        pVar = pVar2;
                        if (!(th instanceof CancellationException)) {
                            oVar3.getClass();
                            eVar2.getClass();
                            s4.i iVar9 = jVar2.f13998d;
                            throw th;
                        }
                        oVar3.f8059c.getClass();
                        s4.e eVarO5 = z2.o(jVar2, th);
                        b(eVarO5, jVar2.f13997c, eVar2);
                        s4.a aVar12 = (s4.a) pVar;
                        aVar12.f13927a.c(aVar12);
                        kVar = eVarO5;
                        return kVar;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    eVar2 = eVar5;
                    jVar2 = jVarA;
                    pVar = pVar2;
                    oVar3 = oVar2;
                    if (!(th instanceof CancellationException)) {
                        oVar3.getClass();
                        eVar2.getClass();
                        s4.i iVar10 = jVar2.f13998d;
                        throw th;
                    }
                    oVar3.f8059c.getClass();
                    s4.e eVarO6 = z2.o(jVar2, th);
                    b(eVarO6, jVar2.f13997c, eVar2);
                    s4.a aVar13 = (s4.a) pVar;
                    aVar13.f13927a.c(aVar13);
                    kVar = eVarO6;
                }
            }
            pVar = pVar2;
            oVar3 = oVar2;
            try {
                if (!(th instanceof CancellationException)) {
                    oVar3.getClass();
                    eVar2.getClass();
                    s4.i iVar11 = jVar2.f13998d;
                    throw th;
                }
                oVar3.f8059c.getClass();
                s4.e eVarO7 = z2.o(jVar2, th);
                b(eVarO7, jVar2.f13997c, eVar2);
                s4.a aVar14 = (s4.a) pVar;
                aVar14.f13927a.c(aVar14);
                kVar = eVarO7;
            } catch (Throwable th7) {
                s4.a aVar15 = (s4.a) pVar;
                aVar15.f13927a.c(aVar15);
                throw th7;
            }
        } else {
            t.v0(objU0);
            z2 z2Var = oVar3.f8059c;
            f1 f1VarG0 = h6.g.g0(lVar.getContext());
            z2Var.getClass();
            r rVar = jVar.A;
            s4.a aVar16 = new s4.a(rVar, f1VarG0);
            s4.h hVarA = s4.j.a(jVar);
            hVarA.f13970b = oVar3.f8057a;
            hVarA.O = null;
            jVarA = hVarA.a();
            eVar2 = e.f8028a;
            try {
                if (jVarA.f13996b == s4.l.f14021a) {
                    throw new s4.m("The request's data is null.");
                }
                rVar.a(aVar16);
                if (i10 == 0) {
                    r rVar2 = jVarA.A;
                    lVar.f8042a = oVar3;
                    lVar.f8043b = aVar16;
                    lVar.f8044c = jVarA;
                    lVar.f8045d = eVar2;
                    lVar.f8049o = 1;
                    if (f6.a.o(rVar2, lVar) == aVar3) {
                        return aVar3;
                    }
                }
                pVar2 = aVar16;
                fVar = (q4.f) oVar3.f8058b.getValue();
                if (fVar == null) {
                    bitmap = null;
                } else {
                    cVar = jVarA.E;
                    if (cVar != null) {
                        dVarA = fVar.f13136a.a(cVar);
                        if (dVarA == null) {
                            dVarA = fVar.f13137b.a(cVar);
                        }
                    } else {
                        dVarA = null;
                    }
                    if (dVarA != null) {
                        bitmap = dVarA.f13132a;
                    } else {
                        bitmap = null;
                    }
                }
                if (bitmap != null) {
                    drawableB = new BitmapDrawable(jVarA.f13995a.getResources(), bitmap);
                } else {
                    drawableB = w4.d.b(jVarA, jVarA.G, jVarA.F, jVarA.M.f13943j);
                }
                aVar = jVarA.f13997c;
                if (aVar != null) {
                    aVar.a(drawableB);
                }
                eVar2.getClass();
                t4.g gVar2 = jVarA.B;
                lVar.f8042a = oVar3;
                lVar.f8043b = pVar2;
                lVar.f8044c = jVarA;
                lVar.f8045d = eVar2;
                lVar.f8046e = bitmap;
                lVar.f8049o = 2;
                objC = gVar2.c(lVar);
                if (objC == aVar3) {
                    return aVar3;
                }
                bitmap2 = bitmap;
                objU0 = objC;
                jVar3 = jVarA;
                eVar3 = eVar2;
                t4.f fVar4 = (t4.f) objU0;
                eVar3.getClass();
                z zVar3 = jVar3.f14017w;
                m mVar3 = new m(jVar3, oVar3, fVar4, eVar3, bitmap2, null);
                lVar.f8042a = oVar3;
                lVar.f8043b = pVar2;
                lVar.f8044c = jVar3;
                lVar.f8045d = eVar3;
                lVar.f8046e = null;
                lVar.f8049o = 3;
                objU0 = z6.a.u0(zVar3, mVar3, lVar);
                if (objU0 == aVar3) {
                    return aVar3;
                }
                jVar2 = jVar3;
                kVar2 = (s4.k) objU0;
                if (kVar2 instanceof q) {
                    aVar2 = jVar2.f13997c;
                    oVar3.getClass();
                    jVar4 = ((q) kVar2).f14040b;
                    if (aVar2 instanceof j4.m) {
                        if (aVar2 != null) {
                        }
                        eVar3.getClass();
                        s4.i iVar12 = jVar4.f13998d;
                    } else {
                        ((v4.a) jVar4.f14007m).getClass();
                    }
                    aVar2.d();
                    eVar3.getClass();
                    s4.i iVar13 = jVar4.f13998d;
                } else if (kVar2 instanceof s4.e) {
                    u4.a aVar17 = jVar2.f13997c;
                    oVar3.getClass();
                    b((s4.e) kVar2, aVar17, eVar3);
                }
                s4.a aVar18 = (s4.a) pVar2;
                aVar18.f13927a.c(aVar18);
                kVar = kVar2;
            } catch (Throwable th8) {
                th = th8;
                jVar2 = jVarA;
                pVar = aVar16;
                if (!(th instanceof CancellationException)) {
                    oVar3.getClass();
                    eVar2.getClass();
                    s4.i iVar14 = jVar2.f13998d;
                    throw th;
                }
                oVar3.f8059c.getClass();
                s4.e eVarO8 = z2.o(jVar2, th);
                b(eVarO8, jVar2.f13997c, eVar2);
                s4.a aVar19 = (s4.a) pVar;
                aVar19.f13927a.c(aVar19);
                kVar = eVarO8;
            }
        }
        return kVar;
    }

    public static void b(s4.e eVar, u4.a aVar, e eVar2) {
        s4.j jVar = eVar.f13965b;
        if (!(aVar instanceof j4.m)) {
            if (aVar != null) {
            }
            eVar2.getClass();
            s4.i iVar = jVar.f13998d;
        }
        ((v4.a) jVar.f14007m).getClass();
        aVar.b();
        eVar2.getClass();
        s4.i iVar2 = jVar.f13998d;
    }
}
