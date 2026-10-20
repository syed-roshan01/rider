package u1;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.ride.accepter.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0.p0 f15376a = new m0.p0(m0.o3.f11621a, q0.f15219d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0.m3 f15377b = new m0.m3(q0.f15220e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.m3 f15378c = new m0.m3(q0.f15221f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0.m3 f15379d = new m0.m3(q0.f15222n);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0.m3 f15380e = new m0.m3(q0.f15223o);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0.m3 f15381f = new m0.m3(q0.f15224p);

    public static final void a(w wVar, c9.e eVar, m0.m mVar, int i10) {
        boolean z10;
        boolean z11;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(1396852028);
        Context context = wVar.getContext();
        qVar.Z(-492369756);
        Object objP = qVar.P();
        k0.y0 y0Var = m0.l.f11578a;
        if (objP == y0Var) {
            objP = d7.t.g0(new Configuration(context.getResources().getConfiguration()), m0.o3.f11621a);
            qVar.l0(objP);
        }
        int i11 = 0;
        qVar.t(false);
        m0.g1 g1Var = (m0.g1) objP;
        qVar.Z(-797338989);
        boolean zG = qVar.g(g1Var);
        Object objP2 = qVar.P();
        if (zG || objP2 == y0Var) {
            objP2 = new w0(i11, g1Var);
            qVar.l0(objP2);
        }
        qVar.t(false);
        wVar.setConfigurationChangeObserver((c9.c) objP2);
        qVar.Z(-492369756);
        Object objP3 = qVar.P();
        if (objP3 == y0Var) {
            objP3 = new h1();
            qVar.l0(objP3);
        }
        qVar.t(false);
        h1 h1Var = (h1) objP3;
        q viewTreeOwners = wVar.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        qVar.Z(-492369756);
        Object objP4 = qVar.P();
        b4.g gVar = viewTreeOwners.f15216b;
        if (objP4 == y0Var) {
            Object parent = wVar.getParent();
            d7.a.k(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
            LinkedHashMap linkedHashMap = null;
            String strValueOf = tag instanceof String ? (String) tag : null;
            if (strValueOf == null) {
                strValueOf = String.valueOf(view.getId());
            }
            String str = v0.l.class.getSimpleName() + ':' + strValueOf;
            b4.e savedStateRegistry = gVar.getSavedStateRegistry();
            Bundle bundleA = savedStateRegistry.a(str);
            if (bundleA != null) {
                linkedHashMap = new LinkedHashMap();
                for (String str2 : bundleA.keySet()) {
                    ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                    d7.a.k(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                    linkedHashMap.put(str2, parcelableArrayList);
                    bundleA = bundleA;
                }
            }
            s sVar = s.f15267o;
            m0.m3 m3Var = v0.o.f15878a;
            v0.n nVar = new v0.n(linkedHashMap, sVar);
            int i12 = 1;
            try {
                savedStateRegistry.d(str, new androidx.activity.f(nVar, 1));
                z11 = true;
            } catch (IllegalArgumentException unused) {
                z11 = false;
            }
            w1 w1Var = new w1(nVar, new f0.d0(i12, savedStateRegistry, str, z11));
            qVar.l0(w1Var);
            objP4 = w1Var;
            z10 = false;
        } else {
            z10 = false;
        }
        qVar.t(z10);
        w1 w1Var2 = (w1) objP4;
        int i13 = 7;
        m0.s.a(q8.l.f13235a, new h1.b(w1Var2, i13), qVar);
        Configuration configuration = (Configuration) g1Var.getValue();
        qVar.Z(-485908294);
        qVar.Z(-492369756);
        Object objP5 = qVar.P();
        if (objP5 == y0Var) {
            objP5 = new x1.c();
            qVar.l0(objP5);
        }
        qVar.t(false);
        x1.c cVar = (x1.c) objP5;
        qVar.Z(-492369756);
        Object objP6 = qVar.P();
        Object obj = objP6;
        if (objP6 == y0Var) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            qVar.l0(configuration2);
            obj = configuration2;
        }
        qVar.t(false);
        Configuration configuration3 = (Configuration) obj;
        qVar.Z(-492369756);
        Object objP7 = qVar.P();
        if (objP7 == y0Var) {
            objP7 = new x0(configuration3, cVar);
            qVar.l0(objP7);
        }
        qVar.t(false);
        m0.s.a(cVar, new u.s(20, context, (x0) objP7), qVar);
        qVar.t(false);
        f6.a.c(new m0.v1[]{f15376a.b((Configuration) g1Var.getValue()), f15377b.b(context), f15379d.b(viewTreeOwners.f15215a), f15380e.b(gVar), v0.o.f15878a.b(w1Var2), f15381f.b(wVar.getView()), f15378c.b(cVar)}, d7.t.K(qVar, 1471621628, new k0.c((Object) wVar, (Object) h1Var, eVar, 2)), qVar, 56);
        m0.x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new u.x(wVar, eVar, i10, i13);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
