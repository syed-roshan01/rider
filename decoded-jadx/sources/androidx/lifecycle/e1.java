package androidx.lifecycle;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f2133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f2134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3.c f2135c;

    public e1(f1 f1Var, b1 b1Var, q3.c cVar) {
        d7.a.m(f1Var, "store");
        d7.a.m(b1Var, "factory");
        d7.a.m(cVar, "defaultCreationExtras");
        this.f2133a = f1Var;
        this.f2134b = b1Var;
        this.f2135c = cVar;
    }

    public final x0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final x0 b(Class cls, String str) {
        x0 x0VarCreate;
        d7.a.m(str, "key");
        f1 f1Var = this.f2133a;
        f1Var.getClass();
        LinkedHashMap linkedHashMap = f1Var.f2138a;
        x0 x0Var = (x0) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(x0Var);
        b1 b1Var = this.f2134b;
        if (!zIsInstance) {
            q3.d dVar = new q3.d(this.f2135c);
            dVar.f13125a.put(z0.f2213b, str);
            try {
                x0VarCreate = b1Var.create(cls, dVar);
            } catch (AbstractMethodError unused) {
                x0VarCreate = b1Var.create(cls);
            }
            d7.a.m(x0VarCreate, "viewModel");
            x0 x0Var2 = (x0) linkedHashMap.put(str, x0VarCreate);
            if (x0Var2 != null) {
                x0Var2.onCleared();
            }
            return x0VarCreate;
        }
        d1 d1Var = b1Var instanceof d1 ? (d1) b1Var : null;
        if (d1Var != null) {
            d7.a.j(x0Var);
            v0 v0Var = (v0) d1Var;
            r rVar = v0Var.f2190d;
            if (rVar != null) {
                b4.e eVar = v0Var.f2191e;
                d7.a.j(eVar);
                s0.a(x0Var, eVar, rVar);
            }
        }
        d7.a.k(x0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return x0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, androidx.fragment.app.a1 a1Var) {
        this(f1Var, a1Var, q3.a.f13124b);
        d7.a.m(f1Var, "store");
        d7.a.m(a1Var, "factory");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e1(g1 g1Var, b1 b1Var) {
        q3.c defaultViewModelCreationExtras;
        d7.a.m(g1Var, "owner");
        f1 viewModelStore = g1Var.getViewModelStore();
        if (g1Var instanceof l) {
            defaultViewModelCreationExtras = ((l) g1Var).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = q3.a.f13124b;
        }
        this(viewModelStore, b1Var, defaultViewModelCreationExtras);
    }
}
