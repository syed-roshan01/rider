package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f1362b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(i0 i0Var, int i10) {
        super(0);
        this.f1361a = i10;
        this.f1362b = i0Var;
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVar = q8.l.f13235a;
        switch (this.f1361a) {
            case 0:
                m330invoke();
                break;
            case 1:
                m330invoke();
                break;
            default:
                m330invoke();
                break;
        }
        return lVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 java.lang.Object, still in use, count: 2, list:
          (r3v5 java.lang.Object) from 0x002d: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v5 java.lang.Object) binds: [B:14:0x002c, B:21:0x002d] A[DONT_GENERATE, DONT_INLINE]
          (r3v5 java.lang.Object) from 0x0025: CHECK_CAST (androidx.activity.y) (r3v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m330invoke() {
        /*
            r5 = this;
            int r0 = r5.f1361a
            androidx.activity.i0 r1 = r5.f1362b
            switch(r0) {
                case 0: goto L32;
                case 1: goto Lb;
                default: goto L7;
            }
        L7:
            r1.b()
            return
        Lb:
            androidx.activity.y r0 = r1.f1396c
            r2 = 0
            if (r0 != 0) goto L2f
            r8.l r0 = r1.f1395b
            int r3 = r0.e()
            java.util.ListIterator r0 = r0.listIterator(r3)
        L1a:
            boolean r3 = r0.hasPrevious()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r0.previous()
            r4 = r3
            androidx.activity.y r4 = (androidx.activity.y) r4
            boolean r4 = r4.f1428a
            if (r4 == 0) goto L1a
            goto L2d
        L2c:
            r3 = r2
        L2d:
            androidx.activity.y r3 = (androidx.activity.y) r3
        L2f:
            r1.f1396c = r2
            return
        L32:
            r1.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.a0.m330invoke():void");
    }
}
