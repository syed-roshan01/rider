package v;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends w8.h implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u8.j f15470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.e f15471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(u8.j jVar, c9.e eVar, u8.e eVar2) {
        super(eVar2);
        this.f15470d = jVar;
        this.f15471e = eVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        a1 a1Var = new a1(this.f15470d, this.f15471e, eVar);
        a1Var.f15469c = obj;
        return a1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a1) create((o1.h0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:44:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, o1.h0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, o1.h0] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [c9.e] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0060 -> B:20:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0081 -> B:20:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            v8.a r0 = v8.a.f15963a
            int r1 = r8.f15468b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r8.f15469c
            o1.h0 r1 = (o1.h0) r1
            d7.t.v0(r9)
            goto L26
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f15469c
            o1.h0 r1 = (o1.h0) r1
            d7.t.v0(r9)     // Catch: java.util.concurrent.CancellationException -> L28
        L26:
            r9 = r1
            goto L3c
        L28:
            r9 = move-exception
            r5 = r1
            r1 = r8
            goto L6e
        L2c:
            java.lang.Object r1 = r8.f15469c
            o1.h0 r1 = (o1.h0) r1
            d7.t.v0(r9)     // Catch: java.util.concurrent.CancellationException -> L28
            r9 = r8
            goto L55
        L35:
            d7.t.v0(r9)
            java.lang.Object r9 = r8.f15469c
            o1.h0 r9 = (o1.h0) r9
        L3c:
            r1 = r8
        L3d:
            u8.j r5 = r1.f15470d
            boolean r5 = h6.g.o0(r5)
            if (r5 == 0) goto L84
            c9.e r5 = r1.f15471e     // Catch: java.util.concurrent.CancellationException -> L6a
            r1.f15469c = r9     // Catch: java.util.concurrent.CancellationException -> L6a
            r1.f15468b = r4     // Catch: java.util.concurrent.CancellationException -> L6a
            java.lang.Object r5 = r5.invoke(r9, r1)     // Catch: java.util.concurrent.CancellationException -> L6a
            if (r5 != r0) goto L52
            return r0
        L52:
            r7 = r1
            r1 = r9
            r9 = r7
        L55:
            r9.f15469c = r1     // Catch: java.util.concurrent.CancellationException -> L64
            r9.f15468b = r3     // Catch: java.util.concurrent.CancellationException -> L64
            java.lang.Object r5 = m9.e0.p(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L64
            if (r5 != r0) goto L60
            return r0
        L60:
            r7 = r1
            r1 = r9
            r9 = r7
            goto L3d
        L64:
            r5 = move-exception
            r7 = r1
            r1 = r9
            r9 = r5
            r5 = r7
            goto L6e
        L6a:
            r5 = move-exception
            r7 = r5
            r5 = r9
            r9 = r7
        L6e:
            u8.j r6 = r1.f15470d
            boolean r6 = h6.g.o0(r6)
            if (r6 == 0) goto L83
            r1.f15469c = r5
            r1.f15468b = r2
            java.lang.Object r9 = m9.e0.p(r5, r1)
            if (r9 != r0) goto L81
            return r0
        L81:
            r9 = r5
            goto L3d
        L83:
            throw r9
        L84:
            q8.l r9 = q8.l.f13235a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
