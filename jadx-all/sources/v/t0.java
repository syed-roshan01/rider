package v;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f15783a = new l0();

    /* JADX WARN: Code duplicated, block: B:48:0x019e  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b6 A[LOOP:0: B:47:0x019c->B:51:0x01b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c5 A[EDGE_INSN: B:91:0x01c5->B:53:0x01c5 BREAK  A[LOOP:0: B:47:0x019c->B:51:0x01b6], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01fa -> B:42:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x023f -> B:79:0x0247). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x027f -> B:42:0x016b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.io.Serializable a(o1.h0 r21, v.a r22, t.l0 r23, p1.d r24, v.d0 r25, u8.e r26) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.t0.a(o1.h0, v.a, t.l0, p1.d, v.d0, u8.e):java.io.Serializable");
    }

    public static final Object b(o1.h0 h0Var, o1.u uVar, long j10, p1.d dVar, o9.c cVar, boolean z10, a aVar, b bVar) {
        float fSignum = Math.signum(d1.c.d(uVar.f12416c));
        long j11 = uVar.f12416c;
        cVar.n(new b0(d1.c.f(j11, d9.i.f(d1.c.d(j10) * fSignum, d1.c.e(j10) * Math.signum(d1.c.e(j11))))));
        if (z10) {
            j10 = d1.c.h(-1.0f, j10);
        }
        cVar.n(new a0(j10));
        return c(h0Var, aVar, uVar.f12414a, new o0(dVar, cVar, z10), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[LOOP:0: B:25:0x008d->B:29:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac A[EDGE_INSN: B:67:0x00ac->B:31:0x00ac BREAK  A[LOOP:0: B:25:0x008d->B:29:0x00a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:24:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(o1.h0 r18, v.a r19, long r20, v.o0 r22, u8.e r23) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.t0.c(o1.h0, v.a, long, v.o0, u8.e):java.lang.Object");
    }

    public static u.b2 d(m0.m mVar) {
        u.b2 b2Var;
        m0.q qVar = (m0.q) mVar;
        qVar.Z(1809802212);
        y0.o oVar = u.m.f14850a;
        qVar.Z(-1476348564);
        Context context = (Context) qVar.m(u1.y0.f15377b);
        u.z1 z1Var = (u.z1) qVar.m(u.a2.f14725a);
        if (z1Var != null) {
            qVar.Z(511388516);
            boolean zG = qVar.g(context) | qVar.g(z1Var);
            Object objP = qVar.P();
            if (zG || objP == m0.l.f11578a) {
                objP = new u.j(context, z1Var);
                qVar.l0(objP);
            }
            qVar.t(false);
            b2Var = (u.b2) objP;
        } else {
            b2Var = u.y1.f14988a;
        }
        qVar.t(false);
        qVar.t(false);
        return b2Var;
    }
}
