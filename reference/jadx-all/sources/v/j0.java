package v;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f15638a = new d0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f15639b = new d0(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f15640c = new d0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f15641d = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078 A[LOOP:0: B:22:0x0064->B:26:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x007c A[EDGE_INSN: B:52:0x007c->B:28:0x007c BREAK  A[LOOP:0: B:22:0x0064->B:26:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:21:0x005a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(long r12, o1.h0 r14, u8.e r15) {
        /*
            boolean r0 = r15 instanceof v.e0
            if (r0 == 0) goto L13
            r0 = r15
            v.e0 r0 = (v.e0) r0
            int r1 = r0.f15525d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15525d = r1
            goto L18
        L13:
            v.e0 r0 = new v.e0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f15524c
            v8.a r1 = v8.a.f15963a
            int r2 = r0.f15525d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            d9.t r12 = r0.f15523b
            o1.h0 r13 = r0.f15522a
            d7.t.v0(r15)
            r14 = r13
            goto L5a
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            d7.t.v0(r15)
            o1.j0 r15 = r14.f12379e
            o1.k r15 = r15.f12393w
            boolean r15 = d(r15, r12)
            if (r15 == 0) goto L43
            return r4
        L43:
            d9.t r15 = new d9.t
            r15.<init>()
            r15.f4951a = r12
            r12 = r15
        L4b:
            r0.f15522a = r14
            r0.f15523b = r12
            r0.f15525d = r3
            o1.l r13 = o1.l.f12401b
            java.lang.Object r15 = r14.a(r13, r0)
            if (r15 != r1) goto L5a
            return r1
        L5a:
            o1.k r15 = (o1.k) r15
            java.util.List r13 = r15.f12397a
            int r2 = r13.size()
            r5 = 0
            r6 = r5
        L64:
            if (r6 >= r2) goto L7b
            java.lang.Object r7 = r13.get(r6)
            r8 = r7
            o1.u r8 = (o1.u) r8
            long r8 = r8.f12414a
            long r10 = r12.f4951a
            boolean r8 = o1.t.a(r8, r10)
            if (r8 == 0) goto L78
            goto L7c
        L78:
            int r6 = r6 + 1
            goto L64
        L7b:
            r7 = r4
        L7c:
            o1.u r7 = (o1.u) r7
            if (r7 != 0) goto L82
            r7 = r4
            goto Lb7
        L82:
            boolean r13 = m9.e0.t(r7)
            if (r13 == 0) goto Laa
            java.util.List r13 = r15.f12397a
            int r15 = r13.size()
        L8e:
            if (r5 >= r15) goto L9f
            java.lang.Object r2 = r13.get(r5)
            r6 = r2
            o1.u r6 = (o1.u) r6
            boolean r6 = r6.f12417d
            if (r6 == 0) goto L9c
            goto La0
        L9c:
            int r5 = r5 + 1
            goto L8e
        L9f:
            r2 = r4
        La0:
            o1.u r2 = (o1.u) r2
            if (r2 != 0) goto La5
            goto Lb7
        La5:
            long r5 = r2.f12414a
            r12.f4951a = r5
            goto L4b
        Laa:
            long r5 = m9.e0.I(r7, r3)
            long r8 = d1.c.f4326b
            boolean r13 = d1.c.b(r5, r8)
            r13 = r13 ^ r3
            if (r13 == 0) goto L4b
        Lb7:
            if (r7 == 0) goto Lc0
            boolean r12 = r7.b()
            if (r12 != 0) goto Lc0
            r4 = r7
        Lc0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v.j0.a(long, o1.h0, u8.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final Object b(long j10, o1.h0 h0Var, u8.e eVar) {
        f0 f0Var;
        Object obj;
        o1.u uVar;
        if (eVar instanceof f0) {
            f0Var = (f0) eVar;
            int i10 = f0Var.f15544d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f0Var.f15544d = i10 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(eVar);
            }
        } else {
            f0Var = new f0(eVar);
        }
        Object obj2 = f0Var.f15543c;
        Object obj3 = v8.a.f15963a;
        int i11 = f0Var.f15544d;
        try {
            if (i11 == 0) {
                d7.t.v0(obj2);
                if (d(h0Var.f12379e.f12393w, j10)) {
                    return null;
                }
                List list = h0Var.f12379e.f12393w.f12397a;
                int size = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i12);
                    if (o1.t.a(((o1.u) obj).f12414a, j10)) {
                        break;
                    }
                    i12++;
                }
                uVar = (o1.u) obj;
                if (uVar == null) {
                    return null;
                }
                d9.u uVar2 = new d9.u();
                d9.u uVar3 = new d9.u();
                uVar3.f4952a = uVar;
                long jD = h0Var.g().d();
                c9.e g0Var = new g0(uVar3, uVar2, null);
                f0Var.f15541a = uVar;
                f0Var.f15542b = uVar2;
                f0Var.f15544d = 1;
                Object objH = h0Var.h(jD, g0Var, f0Var);
                j10 = objH;
                if (objH == obj3) {
                    return obj3;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d9.u uVar4 = f0Var.f15542b;
                uVar = f0Var.f15541a;
                d7.t.v0(obj2);
                j10 = uVar4;
            }
            return null;
        } catch (o1.m unused) {
            o1.u uVar5 = (o1.u) j10.f4952a;
            return uVar5 == null ? uVar : uVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(o1.h0 r4, long r5, c9.c r7, u8.e r8) {
        /*
            boolean r0 = r8 instanceof v.i0
            if (r0 == 0) goto L13
            r0 = r8
            v.i0 r0 = (v.i0) r0
            int r1 = r0.f15618d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15618d = r1
            goto L18
        L13:
            v.i0 r0 = new v.i0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15617c
            v8.a r1 = v8.a.f15963a
            int r2 = r0.f15618d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            c9.c r4 = r0.f15616b
            o1.h0 r5 = r0.f15615a
            d7.t.v0(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            d7.t.v0(r8)
        L38:
            r0.f15615a = r4
            r0.f15616b = r7
            r0.f15618d = r3
            java.lang.Object r8 = a(r5, r4, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            o1.u r8 = (o1.u) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = m9.e0.t(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f12414a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: v.j0.c(o1.h0, long, c9.c, u8.e):java.lang.Object");
    }

    public static final boolean d(o1.k kVar, long j10) {
        Object obj;
        List list = kVar.f12397a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (o1.t.a(((o1.u) obj).f12414a, j10)) {
                break;
            }
            i10++;
        }
        o1.u uVar = (o1.u) obj;
        if (uVar != null && uVar.f12417d) {
            z10 = true;
        }
        return true ^ z10;
    }
}
