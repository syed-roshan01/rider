package b4;

import android.os.Bundle;
import androidx.lifecycle.f1;
import androidx.lifecycle.g1;
import androidx.lifecycle.p;
import androidx.lifecycle.s0;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import androidx.lifecycle.x0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f2700a;

    public b(g gVar) {
        d7.a.m(gVar, "owner");
        this.f2700a = gVar;
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(w wVar, p pVar) {
        if (pVar != p.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        wVar.getLifecycle().c(this);
        g gVar = this.f2700a;
        Bundle bundleA = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                d7.a.l(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        d7.a.l(objNewInstance, "{\n                constr…wInstance()\n            }");
                        if (!(gVar instanceof g1)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                        }
                        f1 viewModelStore = ((g1) gVar).getViewModelStore();
                        e savedStateRegistry = gVar.getSavedStateRegistry();
                        viewModelStore.getClass();
                        LinkedHashMap linkedHashMap = viewModelStore.f2138a;
                        for (String str2 : new HashSet(linkedHashMap.keySet())) {
                            d7.a.m(str2, "key");
                            x0 x0Var = (x0) linkedHashMap.get(str2);
                            d7.a.j(x0Var);
                            s0.a(x0Var, savedStateRegistry, gVar.getLifecycle());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            savedStateRegistry.e();
                        }
                    } catch (Exception e4) {
                        throw new RuntimeException(q.x("Failed to instantiate ", str), e4);
                    }
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                }
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(q.k("Class ", str, " wasn't found"), e11);
            }
        }
    }
}
