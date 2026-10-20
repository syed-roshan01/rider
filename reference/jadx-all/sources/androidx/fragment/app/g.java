package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import java.util.HashMap;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class g implements x2.f, ViewWithFragmentComponentBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1915e;

    public g(int i10) {
        if (i10 != 5) {
            return;
        }
        this.f1911a = null;
        this.f1912b = null;
        this.f1913c = null;
        this.f1914d = null;
        this.f1915e = null;
    }

    public final void a(i5.a aVar) {
        b0.l0 l0Var = new b0.l0(12);
        l5.t tVar = (l5.t) this.f1915e;
        g gVar = new g(2);
        l5.j jVar = (l5.j) this.f1911a;
        if (jVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        gVar.f1911a = jVar;
        gVar.f1913c = aVar;
        String str = (String) this.f1912b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        gVar.f1912b = str;
        b0.l0 l0Var2 = (b0.l0) this.f1914d;
        if (l0Var2 == null) {
            throw new NullPointerException("Null transformer");
        }
        gVar.f1914d = l0Var2;
        i5.c cVar = (i5.c) this.f1913c;
        if (cVar == null) {
            throw new NullPointerException("Null encoding");
        }
        gVar.f1915e = cVar;
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        l5.j jVar2 = (l5.j) gVar.f1911a;
        String str2 = (String) gVar.f1912b;
        i5.a aVar2 = (i5.a) gVar.f1913c;
        b0.l0 l0Var3 = (b0.l0) gVar.f1914d;
        i5.c cVar2 = (i5.c) gVar.f1915e;
        l5.u uVar = (l5.u) tVar;
        uVar.getClass();
        aVar2.getClass();
        i5.d dVar = i5.d.f8066a;
        jVar2.getClass();
        z2 z2VarA = l5.j.a();
        z2VarA.L(jVar2.f11348a);
        z2VarA.N(dVar);
        z2VarA.f10984c = jVar2.f11349b;
        l5.j jVarJ = z2VarA.j();
        l.r rVar = new l.r(1);
        rVar.f10915g = new HashMap();
        rVar.f10913e = Long.valueOf(((t5.c) uVar.f11370a).a());
        rVar.f10914f = Long.valueOf(((t5.c) uVar.f11371b).a());
        if (str2 == null) {
            throw new NullPointerException("Null transportName");
        }
        rVar.f10910b = str2;
        l0Var3.getClass();
        rVar.i(new l5.m(cVar2, ((MessagingClientEventExtension) aVar2.f8062a).toByteArray()));
        rVar.f10911c = null;
        l5.i iVarC = rVar.c();
        p5.c cVar3 = (p5.c) uVar.f11372c;
        cVar3.getClass();
        cVar3.f12777b.execute(new p5.a(cVar3, jVarJ, l0Var, iVarC, 0));
    }

    @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
    public final ViewWithFragmentComponent build() {
        z6.a.g(View.class, (View) this.f1911a);
        return new y4.l();
    }

    @Override // x2.f
    public final void c() {
        ((View) this.f1911a).clearAnimation();
        ((ViewGroup) this.f1912b).endViewTransition((View) this.f1911a);
        ((k) this.f1913c).a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((s1) this.f1914d) + " has been cancelled.");
        }
    }

    @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
    public final ViewWithFragmentComponentBuilder view(View view) {
        view.getClass();
        this.f1911a = view;
        return this;
    }
}
