package b;

import m0.l3;
import m0.n0;
import m0.o0;
import o2.r;
import o2.u;

/* JADX INFO: loaded from: classes.dex */
public final class d extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2298f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f2293a = i10;
        this.f2294b = obj;
        this.f2295c = obj2;
        this.f2296d = obj3;
        this.f2297e = obj4;
        this.f2298f = obj5;
    }

    public final n0 a(o0 o0Var) {
        int i10 = this.f2293a;
        Object obj = this.f2298f;
        Object obj2 = this.f2296d;
        Object obj3 = this.f2297e;
        Object obj4 = this.f2295c;
        Object obj5 = this.f2294b;
        switch (i10) {
            case 0:
                a aVar = (a) obj5;
                aVar.f2288a = ((d.i) obj4).d((String) obj2, (e.b) obj3, new b((l3) obj, 0));
                return new c(aVar, 0);
            default:
                r rVar = (r) obj5;
                rVar.f12504u.addView(rVar, rVar.f12505v);
                rVar.i((c9.a) obj4, (u) obj3, (String) obj2, (m2.l) obj);
                return new c(rVar, 8);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 24, instructions: 82 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:34)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:24)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:295)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // c9.c
    public final java.lang.Object invoke(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, c9.a aVar, u uVar, String str, m2.l lVar) {
        super(1);
        this.f2293a = 2;
        this.f2294b = rVar;
        this.f2295c = aVar;
        this.f2297e = uVar;
        this.f2296d = str;
        this.f2298f = lVar;
    }
}
