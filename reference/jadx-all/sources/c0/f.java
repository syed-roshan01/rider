package c0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.i f2853a = new o0.i(new g[16]);

    /* JADX WARN: Code duplicated, block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r13 >= r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r6 != r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(d1.d r13, u8.e r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof c0.e
            if (r0 == 0) goto L13
            r0 = r14
            c0.e r0 = (c0.e) r0
            int r1 = r0.f2852n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2852n = r1
            goto L18
        L13:
            c0.e r0 = new c0.e
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f2850e
            v8.a r1 = v8.a.f15963a
            int r2 = r0.f2852n
            q8.l r3 = q8.l.f13235a
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            int r13 = r0.f2849d
            int r2 = r0.f2848c
            java.lang.Object[] r5 = r0.f2847b
            d1.d r6 = r0.f2846a
            d7.t.v0(r14)
            r14 = r6
            goto L80
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            d7.t.v0(r14)
            o0.i r14 = r12.f2853a
            int r2 = r14.f12343c
            if (r2 <= 0) goto L83
            java.lang.Object[] r14 = r14.f12341a
            r5 = 0
            r11 = r14
            r14 = r13
            r13 = r5
            r5 = r11
        L4a:
            r6 = r5[r13]
            c0.g r6 = (c0.g) r6
            r0.f2846a = r14
            r0.f2847b = r5
            r0.f2848c = r2
            r0.f2849d = r13
            r0.f2852n = r4
            r6.getClass()
            s1.i r7 = c0.c.f2845a
            java.lang.Object r7 = r6.g(r7)
            c0.d r7 = (c0.d) r7
            if (r7 != 0) goto L67
            c0.n r7 = r6.f2842u
        L67:
            r1.s r8 = r6.G0()
            if (r8 != 0) goto L6f
        L6d:
            r6 = r3
            goto L7d
        L6f:
            u.r0 r9 = new u.r0
            r10 = 2
            r9.<init>(r10, r14, r6)
            java.lang.Object r6 = r7.x(r8, r9, r0)
            v8.a r7 = v8.a.f15963a
            if (r6 != r7) goto L6d
        L7d:
            if (r6 != r1) goto L80
            return r1
        L80:
            int r13 = r13 + r4
            if (r13 < r2) goto L4a
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.f.a(d1.d, u8.e):java.lang.Object");
    }
}
