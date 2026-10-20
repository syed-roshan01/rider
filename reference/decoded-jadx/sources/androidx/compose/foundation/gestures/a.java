package androidx.compose.foundation.gestures;

import s1.i;
import u.b2;
import v.f2;
import v.h1;
import v.n;
import v.p0;
import v.v1;
import v.w1;
import v.x1;
import v.y0;
import v.y1;
import x.m;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f1632a = new p0(2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x1 f1633b = new x1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f1634c = new i(w1.f15818a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v1 f1635d = new v1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y1 f1636e = new y1();

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(o1.h0 r5, u8.e r6) {
        /*
            boolean r0 = r6 instanceof v.z1
            if (r0 == 0) goto L13
            r0 = r6
            v.z1 r0 = (v.z1) r0
            int r1 = r0.f15838c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15838c = r1
            goto L18
        L13:
            v.z1 r0 = new v.z1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15837b
            v8.a r1 = v8.a.f15963a
            int r2 = r0.f15838c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o1.h0 r5 = r0.f15836a
            d7.t.v0(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            d7.t.v0(r6)
        L34:
            r0.f15836a = r5
            r0.f15838c = r3
            o1.l r6 = o1.l.f12401b
            java.lang.Object r6 = r5.a(r6, r0)
            if (r6 != r1) goto L41
            goto L4d
        L41:
            o1.k r6 = (o1.k) r6
            int r2 = r6.f12399c
            r4 = 6
            boolean r2 = o1.s.t(r2, r4)
            if (r2 == 0) goto L34
            r1 = r6
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(o1.h0, u8.e):java.lang.Object");
    }

    public static final o b(o oVar, f2 f2Var, h1 h1Var, b2 b2Var, boolean z10, boolean z11, y0 y0Var, m mVar, v.o oVar2) {
        return oVar.j(new ScrollableElement(f2Var, h1Var, b2Var, z10, z11, y0Var, mVar, oVar2));
    }

    public static o c(o oVar, f2 f2Var, h1 h1Var, b2 b2Var, boolean z10, boolean z11, y0 y0Var, m mVar) {
        v.o.f15721a.getClass();
        return b(oVar, f2Var, h1Var, b2Var, z10, z11, y0Var, mVar, n.f15711c);
    }
}
