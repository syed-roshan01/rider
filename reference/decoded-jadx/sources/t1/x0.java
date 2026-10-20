package t1;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f14575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f14576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c1 f14577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1 f14578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y0.n f14579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o0.i f14580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o0.i f14581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w0 f14582h;

    public x0(androidx.compose.ui.node.a aVar) {
        this.f14575a = aVar;
        x xVar = new x(aVar);
        this.f14576b = xVar;
        this.f14577c = xVar;
        s1 s1Var = xVar.N;
        this.f14578d = s1Var;
        this.f14579e = s1Var;
    }

    public static final void a(x0 x0Var, y0.n nVar, c1 c1Var) {
        x0Var.getClass();
        for (y0.n nVar2 = nVar.f16734e; nVar2 != null; nVar2 = nVar2.f16734e) {
            if (nVar2 == androidx.compose.ui.node.b.f1755a) {
                androidx.compose.ui.node.a aVarQ = x0Var.f14575a.q();
                c1Var.f14397r = aVarQ != null ? aVarQ.C.f14576b : null;
                x0Var.f14577c = c1Var;
                return;
            } else {
                if ((nVar2.f16732c & 2) != 0) {
                    return;
                }
                nVar2.F0(c1Var);
            }
        }
    }

    public static y0.n b(y0.m mVar, y0.n nVar) {
        y0.n nVarL;
        if (mVar instanceof u0) {
            nVarL = ((u0) mVar).l();
            nVarL.f16732c = g.n(nVarL);
        } else {
            d dVar = new d();
            dVar.f16732c = g.l(mVar);
            dVar.f14406u = mVar;
            dVar.f14408w = new HashSet();
            nVarL = dVar;
        }
        if (!(!nVarL.f16742t)) {
            throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
        }
        nVarL.f16738p = true;
        y0.n nVar2 = nVar.f16735f;
        if (nVar2 != null) {
            nVar2.f16734e = nVarL;
            nVarL.f16735f = nVar2;
        }
        nVar.f16735f = nVarL;
        nVarL.f16734e = nVar;
        return nVarL;
    }

    public static y0.n c(y0.n nVar) {
        boolean z10 = nVar.f16742t;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("autoInvalidateRemovedNode called on unattached node".toString());
            }
            g.i(nVar, -1, 2);
            nVar.E0();
            nVar.y0();
        }
        y0.n nVar2 = nVar.f16735f;
        y0.n nVar3 = nVar.f16734e;
        if (nVar2 != null) {
            nVar2.f16734e = nVar3;
            nVar.f16735f = null;
        }
        if (nVar3 != null) {
            nVar3.f16735f = nVar2;
            nVar.f16734e = null;
        }
        d7.a.j(nVar3);
        return nVar3;
    }

    public static void h(y0.m mVar, y0.m mVar2, y0.n nVar) {
        if ((mVar instanceof u0) && (mVar2 instanceof u0)) {
            y0 y0Var = androidx.compose.ui.node.b.f1755a;
            d7.a.k(nVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((u0) mVar2).m(nVar);
            if (nVar.f16742t) {
                g.k(nVar);
                return;
            } else {
                nVar.f16739q = true;
                return;
            }
        }
        if (!(nVar instanceof d)) {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
        d dVar = (d) nVar;
        if (dVar.f16742t) {
            dVar.H0();
        }
        dVar.f14406u = mVar2;
        dVar.f16732c = g.l(mVar2);
        if (dVar.f16742t) {
            dVar.G0(false);
        }
        if (nVar.f16742t) {
            g.k(nVar);
        } else {
            nVar.f16739q = true;
        }
    }

    public final boolean d(int i10) {
        return (i10 & this.f14579e.f16733d) != 0;
    }

    public final void e() {
        for (y0.n nVar = this.f14579e; nVar != null; nVar = nVar.f16735f) {
            nVar.D0();
            if (nVar.f16738p) {
                g.h(nVar);
            }
            if (nVar.f16739q) {
                g.k(nVar);
            }
            nVar.f16738p = false;
            nVar.f16739q = false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:t1.w0) from 0x001e: IPUT (r11v13 ?? I:t1.w0), (r29v0 'this' ?? I:t1.x0 A[IMMUTABLE_TYPE, THIS]) t1.x0.h t1.w0
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:t1.w0) from 0x001e: IPUT (r11v13 ?? I:t1.w0), (r29v0 'this' ?? I:t1.x0 A[IMMUTABLE_TYPE, THIS]) t1.x0.h t1.w0
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    public final void g() {
        androidx.compose.ui.node.a aVar;
        c0 c0Var;
        j1 j1Var;
        y0.n nVar = this.f14578d.f16734e;
        c1 c1Var = this.f14576b;
        while (true) {
            aVar = this.f14575a;
            if (nVar == null) {
                break;
            }
            b0 b0VarG = g.g(nVar);
            if (b0VarG != null) {
                c1 c1Var2 = nVar.f16737o;
                if (c1Var2 != null) {
                    c0Var = (c0) c1Var2;
                    b0 b0Var = c0Var.N;
                    c0Var.N = b0VarG;
                    if (b0Var != nVar && (j1Var = c0Var.H) != null) {
                        j1Var.invalidate();
                    }
                } else {
                    c0Var = new c0(aVar, b0VarG);
                    nVar.F0(c0Var);
                }
                c1Var.f14397r = c0Var;
                c0Var.f14396q = c1Var;
                c1Var = c0Var;
            } else {
                nVar.F0(c1Var);
            }
            nVar = nVar.f16734e;
        }
        androidx.compose.ui.node.a aVarQ = aVar.q();
        c1Var.f14397r = aVarQ != null ? aVarQ.C.f14576b : null;
        this.f14577c = c1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        y0.n nVar = this.f14579e;
        s1 s1Var = this.f14578d;
        if (nVar == s1Var) {
            sb.append("]");
        } else {
            while (nVar != null && nVar != s1Var) {
                sb.append(String.valueOf(nVar));
                if (nVar.f16735f == s1Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                nVar = nVar.f16735f;
            }
        }
        String string = sb.toString();
        d7.a.l(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
