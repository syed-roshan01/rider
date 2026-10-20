package s;

import t.q1;
import t.u1;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f13753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(u1 u1Var, int i10) {
        super(0);
        this.f13752a = i10;
        this.f13753b = u1Var;
    }

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
    @Override // c9.a
    public final Object invoke() {
        boolean z10 = false;
        z10 = false;
        int i10 = this.f13752a;
        u1 u1Var = this.f13753b;
        switch (i10) {
            case 0:
                Object objB = u1Var.b();
                j0 j0Var = j0.f13803c;
                if (objB == j0Var && u1Var.f14321c.getValue() == j0Var) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                w0.u uVar = u1Var.f14326h;
                int size = uVar.size();
                long jMax = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    jMax = Math.max(jMax, ((q1) uVar.get(i11)).b().f14239h);
                }
                w0.u uVar2 = u1Var.f14327i;
                int size2 = uVar2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    jMax = Math.max(jMax, ((Number) ((u1) uVar2.get(i12)).f14330l.getValue()).longValue());
                }
                return Long.valueOf(jMax);
        }
    }
}
