package v;

/* JADX INFO: loaded from: classes.dex */
public abstract class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f15663a = new p0(3, null);

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[LOOP:0: B:19:0x004b->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[LOOP:1: B:22:0x005f->B:26:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0061
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(o1.h0 r8, u8.e r9) {
        /*
            boolean r0 = r9 instanceof v.o2
            if (r0 == 0) goto L13
            r0 = r9
            v.o2 r0 = (v.o2) r0
            int r1 = r0.f15730c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15730c = r1
            goto L18
        L13:
            v.o2 r0 = new v.o2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f15729b
            v8.a r1 = v8.a.f15963a
            int r2 = r0.f15730c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o1.h0 r8 = r0.f15728a
            d7.t.v0(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            d7.t.v0(r9)
        L34:
            r0.f15728a = r8
            r0.f15730c = r3
            o1.l r9 = o1.l.f12401b
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L41
            goto L71
        L41:
            o1.k r9 = (o1.k) r9
            java.util.List r2 = r9.f12397a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4b:
            if (r6 >= r4) goto L59
            java.lang.Object r7 = r2.get(r6)
            o1.u r7 = (o1.u) r7
            r7.a()
            int r6 = r6 + 1
            goto L4b
        L59:
            java.util.List r9 = r9.f12397a
            int r2 = r9.size()
        L5f:
            if (r5 >= r2) goto L6f
            java.lang.Object r4 = r9.get(r5)
            o1.u r4 = (o1.u) r4
            boolean r4 = r4.f12417d
            if (r4 == 0) goto L6c
            goto L34
        L6c:
            int r5 = r5 + 1
            goto L5f
        L6f:
            q8.l r1 = q8.l.f13235a
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.k3.a(o1.h0, u8.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(o1.h0 r10, boolean r11, o1.l r12, u8.e r13) {
        /*
            boolean r0 = r13 instanceof v.m2
            if (r0 == 0) goto L13
            r0 = r13
            v.m2 r0 = (v.m2) r0
            int r1 = r0.f15702e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15702e = r1
            goto L18
        L13:
            v.m2 r0 = new v.m2
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f15701d
            v8.a r1 = v8.a.f15963a
            int r2 = r0.f15702e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f15700c
            o1.l r11 = r0.f15699b
            o1.h0 r12 = r0.f15698a
            d7.t.v0(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            d7.t.v0(r13)
        L3c:
            r0.f15698a = r10
            r0.f15699b = r12
            r0.f15700c = r11
            r0.f15702e = r3
            java.lang.Object r13 = r10.a(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            o1.k r13 = (o1.k) r13
            java.util.List r2 = r13.f12397a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L78
            java.lang.Object r7 = r2.get(r6)
            o1.u r7 = (o1.u) r7
            if (r11 == 0) goto L6e
            boolean r8 = r7.b()
            if (r8 != 0) goto L3c
            boolean r8 = r7.f12421h
            if (r8 != 0) goto L3c
            boolean r7 = r7.f12417d
            if (r7 == 0) goto L3c
            goto L75
        L6e:
            boolean r7 = m9.e0.r(r7)
            if (r7 != 0) goto L75
            goto L3c
        L75:
            int r6 = r6 + 1
            goto L55
        L78:
            java.util.List r10 = r13.f12397a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: v.k3.b(o1.h0, boolean, o1.l, u8.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3 A[LOOP:1: B:23:0x006e->B:46:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b2 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:51:0x00d6
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(o1.h0 r17, o1.l r18, u8.e r19) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.k3.d(o1.h0, o1.l, u8.e):java.lang.Object");
    }
}
