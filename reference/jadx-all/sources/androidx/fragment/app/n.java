package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class n extends t1 {
    public static void j(s1 s1Var) {
        a7.a.a(s1Var.f2023a, s1Var.f2025c.mView);
    }

    public static void k(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (b3.t0.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                k(arrayList, childAt);
            }
        }
    }

    public static void l(q.f fVar, View view) {
        Field field = b3.q0.f2670a;
        String strK = b3.h0.k(view);
        if (strK != null) {
            fVar.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    l(fVar, childAt);
                }
            }
        }
    }

    public static void m(q.f fVar, Collection collection) {
        Iterator it = fVar.entrySet().iterator();
        while (it.hasNext()) {
            View view = (View) ((Map.Entry) it.next()).getValue();
            Field field = b3.q0.f2670a;
            if (!collection.contains(b3.h0.k(view))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    @Override // androidx.fragment.app.t1
    public final void b(ArrayList arrayList, boolean z10) {
        int i10;
        HashMap map;
        s1 s1Var;
        String str;
        ArrayList arrayList2;
        ArrayList<k> arrayList3;
        s1 s1Var2;
        String str2;
        boolean z11;
        s1 s1Var3;
        String str3;
        s1 s1Var4;
        Object obj;
        View view;
        View view2;
        q.f fVar;
        ArrayList arrayList4;
        HashMap map2;
        s1 s1Var5;
        String str4;
        String str5;
        ArrayList arrayList5;
        Rect rect;
        s1 s1Var6;
        View view3;
        int i11;
        View view4;
        View view5;
        boolean z12 = z10;
        Iterator it = arrayList.iterator();
        s1 s1Var7 = null;
        s1 s1Var8 = null;
        while (true) {
            i10 = 3;
            if (!it.hasNext()) {
                break;
            }
            s1 s1Var9 = (s1) it.next();
            int iD = a7.a.d(s1Var9.f2025c.mView);
            int iE = t.k.e(s1Var9.f2023a);
            if (iE != 0) {
                if (iE != 1) {
                    if (iE == 2 || iE == 3) {
                    }
                } else if (iD != 2) {
                    s1Var8 = s1Var9;
                }
            }
            if (iD == 2 && s1Var7 == null) {
                s1Var7 = s1Var9;
            }
        }
        String str6 = "FragmentManager";
        String str7 = " to ";
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + s1Var7 + " to " + s1Var8);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList<m> arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList(arrayList);
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z13 = false;
            if (!it2.hasNext()) {
                break;
            }
            s1 s1Var10 = (s1) it2.next();
            x2.g gVar = new x2.g();
            s1Var10.d();
            HashSet hashSet = s1Var10.f2027e;
            hashSet.add(gVar);
            k kVar = new k(s1Var10, gVar);
            kVar.f1951d = false;
            kVar.f1950c = z12;
            arrayList6.add(kVar);
            x2.g gVar2 = new x2.g();
            s1Var10.d();
            hashSet.add(gVar2);
            if (z12) {
                if (s1Var10 == s1Var7) {
                    z13 = true;
                }
            } else if (s1Var10 == s1Var8) {
                z13 = true;
            }
            arrayList7.add(new m(s1Var10, gVar2, z12, z13));
            s1Var10.f2026d.add(new y2.a(this, arrayList8, s1Var10, i10));
        }
        HashMap map3 = new HashMap();
        Iterator it3 = arrayList7.iterator();
        o1 o1Var = null;
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (!mVar.b()) {
                Object obj2 = mVar.f1968c;
                o1 o1VarC = mVar.c(obj2);
                Object obj3 = mVar.f1970e;
                Iterator it4 = it3;
                o1 o1VarC2 = mVar.c(obj3);
                ArrayList arrayList9 = arrayList8;
                ArrayList arrayList10 = arrayList6;
                s1 s1Var11 = mVar.f1964a;
                if (o1VarC != null && o1VarC2 != null && o1VarC != o1VarC2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + s1Var11.f2025c + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj3);
                }
                if (o1VarC == null) {
                    o1VarC = o1VarC2;
                }
                if (o1Var == null) {
                    o1Var = o1VarC;
                } else if (o1VarC != null && o1Var != o1VarC) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + s1Var11.f2025c + " returned Transition " + obj2 + " which uses a different Transition  type than other Fragments.");
                }
                it3 = it4;
                arrayList8 = arrayList9;
                arrayList6 = arrayList10;
            }
        }
        ArrayList arrayList11 = arrayList8;
        ArrayList arrayList12 = arrayList6;
        ViewGroup viewGroup = this.f2033a;
        if (o1Var == null) {
            for (m mVar2 : arrayList7) {
                map3.put(mVar2.f1964a, Boolean.FALSE);
                mVar2.a();
            }
            map = map3;
            s1Var = s1Var7;
            s1Var2 = s1Var8;
            str = " to ";
            arrayList2 = arrayList11;
            arrayList3 = arrayList12;
            z11 = false;
            str2 = "FragmentManager";
        } else {
            View view6 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            q.f fVar2 = new q.f(0);
            Iterator it5 = arrayList7.iterator();
            Object obj4 = null;
            View view7 = null;
            boolean z14 = false;
            while (it5.hasNext()) {
                ArrayList arrayList15 = arrayList7;
                Object obj5 = ((m) it5.next()).f1970e;
                if (obj5 == null || s1Var7 == null || s1Var8 == null) {
                    fVar = fVar2;
                    arrayList4 = arrayList13;
                    map2 = map3;
                    s1Var5 = s1Var7;
                    str4 = str6;
                    str5 = str7;
                    arrayList5 = arrayList14;
                    rect = rect2;
                    s1Var6 = s1Var8;
                    view3 = view6;
                    view7 = view7;
                } else {
                    Object objR = o1Var.r(o1Var.f(obj5));
                    d0 d0Var = s1Var8.f2025c;
                    str5 = str7;
                    ArrayList<String> sharedElementSourceNames = d0Var.getSharedElementSourceNames();
                    d0 d0Var2 = s1Var7.f2025c;
                    Rect rect3 = rect2;
                    ArrayList<String> sharedElementSourceNames2 = d0Var2.getSharedElementSourceNames();
                    ArrayList<String> sharedElementTargetNames = d0Var2.getSharedElementTargetNames();
                    HashMap map4 = map3;
                    view3 = view6;
                    int i12 = 0;
                    while (i12 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i12));
                        ArrayList<String> arrayList16 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i12));
                        }
                        i12++;
                        sharedElementTargetNames = arrayList16;
                    }
                    ArrayList<String> sharedElementTargetNames2 = d0Var.getSharedElementTargetNames();
                    if (z12) {
                        d0Var2.getEnterTransitionCallback();
                        d0Var.getExitTransitionCallback();
                    } else {
                        d0Var2.getExitTransitionCallback();
                        d0Var.getEnterTransitionCallback();
                    }
                    int i13 = 0;
                    for (int size = sharedElementSourceNames.size(); i13 < size; size = size) {
                        fVar2.put(sharedElementSourceNames.get(i13), sharedElementTargetNames2.get(i13));
                        i13++;
                    }
                    if (Log.isLoggable(str6, 2)) {
                        Log.v(str6, ">>> entering view names <<<");
                        for (Iterator<String> it6 = sharedElementTargetNames2.iterator(); it6.hasNext(); it6 = it6) {
                            Log.v(str6, "Name: " + it6.next());
                        }
                        Log.v(str6, ">>> exiting view names <<<");
                        for (Iterator<String> it7 = sharedElementSourceNames.iterator(); it7.hasNext(); it7 = it7) {
                            Log.v(str6, "Name: " + it7.next());
                        }
                    }
                    q.f fVar3 = new q.f(0);
                    l(fVar3, d0Var2.mView);
                    fVar3.m(sharedElementSourceNames);
                    fVar2.m(fVar3.keySet());
                    q.f fVar4 = new q.f(0);
                    l(fVar4, d0Var.mView);
                    fVar4.m(sharedElementTargetNames2);
                    fVar4.m(fVar2.values());
                    m1 m1Var = h1.f1933a;
                    int i14 = fVar2.f13045c - 1;
                    while (i14 >= 0) {
                        String str8 = str6;
                        if (!fVar4.containsKey((String) fVar2.j(i14))) {
                            fVar2.h(i14);
                        }
                        i14--;
                        str6 = str8;
                    }
                    str4 = str6;
                    m(fVar3, fVar2.keySet());
                    m(fVar4, fVar2.values());
                    if (fVar2.isEmpty()) {
                        arrayList13.clear();
                        arrayList14.clear();
                        fVar = fVar2;
                        arrayList4 = arrayList13;
                        s1Var5 = s1Var7;
                        s1Var6 = s1Var8;
                        rect = rect3;
                        map2 = map4;
                        obj4 = null;
                        arrayList5 = arrayList14;
                        view3 = view3;
                    } else {
                        if (z12) {
                            d0Var2.getEnterTransitionCallback();
                        } else {
                            d0Var.getEnterTransitionCallback();
                        }
                        View view8 = view7;
                        ArrayList arrayList17 = arrayList14;
                        arrayList4 = arrayList13;
                        s1 s1Var12 = s1Var7;
                        fVar = fVar2;
                        s1 s1Var13 = s1Var8;
                        s1 s1Var14 = s1Var7;
                        rect = rect3;
                        b3.u.a(viewGroup, new h(this, s1Var8, s1Var12, z10, fVar4));
                        arrayList4.addAll(fVar3.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i11 = 0;
                            view4 = view8;
                        } else {
                            i11 = 0;
                            view4 = (View) fVar3.get(sharedElementSourceNames.get(0));
                            o1Var.m(view4, objR);
                        }
                        arrayList5 = arrayList17;
                        arrayList5.addAll(fVar4.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view5 = (View) fVar4.get(sharedElementTargetNames2.get(i11))) != null) {
                            b3.u.a(viewGroup, new i(o1Var, view5, rect));
                            z14 = true;
                        }
                        o1Var.p(objR, view3, arrayList4);
                        o1Var.l(objR, null, null, objR, arrayList5);
                        Boolean bool = Boolean.TRUE;
                        map2 = map4;
                        s1Var5 = s1Var14;
                        map2.put(s1Var5, bool);
                        s1Var6 = s1Var13;
                        map2.put(s1Var6, bool);
                        view7 = view4;
                        obj4 = objR;
                    }
                }
                view6 = view3;
                arrayList14 = arrayList5;
                s1Var8 = s1Var6;
                arrayList13 = arrayList4;
                rect2 = rect;
                arrayList12 = arrayList12;
                str7 = str5;
                str6 = str4;
                arrayList11 = arrayList11;
                fVar2 = fVar;
                z12 = z10;
                s1Var7 = s1Var5;
                map3 = map2;
                arrayList7 = arrayList15;
            }
            q.f fVar5 = fVar2;
            ArrayList arrayList18 = arrayList13;
            ArrayList arrayList19 = arrayList7;
            map = map3;
            s1Var = s1Var7;
            String str9 = str6;
            str = str7;
            View view9 = view7;
            arrayList2 = arrayList11;
            arrayList3 = arrayList12;
            ArrayList arrayList20 = arrayList14;
            Rect rect4 = rect2;
            s1 s1Var15 = s1Var8;
            View view10 = view6;
            ArrayList arrayList21 = new ArrayList();
            Iterator it8 = arrayList19.iterator();
            Object objJ = null;
            Object objJ2 = null;
            while (it8.hasNext()) {
                m mVar3 = (m) it8.next();
                boolean zB = mVar3.b();
                it8 = it8;
                s1 s1Var16 = mVar3.f1964a;
                if (zB) {
                    map.put(s1Var16, Boolean.FALSE);
                    mVar3.a();
                } else {
                    Object objF = o1Var.f(mVar3.f1968c);
                    boolean z15 = obj4 != null && (s1Var16 == s1Var || s1Var16 == s1Var15);
                    if (objF == null) {
                        if (!z15) {
                            map.put(s1Var16, Boolean.FALSE);
                            mVar3.a();
                        }
                        obj = obj4;
                        view = view10;
                        s1Var4 = s1Var15;
                        arrayList18 = arrayList18;
                        view2 = view9;
                    } else {
                        s1Var4 = s1Var15;
                        ArrayList arrayList22 = new ArrayList();
                        obj = obj4;
                        k(arrayList22, s1Var16.f2025c.mView);
                        if (z15) {
                            if (s1Var16 == s1Var) {
                                arrayList22.removeAll(arrayList18);
                            } else {
                                arrayList22.removeAll(arrayList20);
                            }
                        }
                        if (arrayList22.isEmpty()) {
                            o1Var.a(view10, objF);
                            view = view10;
                        } else {
                            o1Var.b(objF, arrayList22);
                            o1Var.l(objF, objF, arrayList22, null, null);
                            view = view10;
                            if (s1Var16.f2023a == 3) {
                                arrayList2.remove(s1Var16);
                                ArrayList arrayList23 = new ArrayList(arrayList22);
                                d0 d0Var3 = s1Var16.f2025c;
                                arrayList23.remove(d0Var3.mView);
                                o1Var.k(objF, d0Var3.mView, arrayList23);
                                b3.u.a(viewGroup, new j(0, this, arrayList22));
                            }
                        }
                        if (s1Var16.f2023a == 2) {
                            arrayList21.addAll(arrayList22);
                            if (z14) {
                                o1Var.n(objF, rect4);
                            }
                            view2 = view9;
                        } else {
                            view2 = view9;
                            o1Var.m(view2, objF);
                        }
                        map.put(s1Var16, Boolean.TRUE);
                        if (mVar3.f1969d) {
                            objJ = o1Var.j(objJ, objF);
                        } else {
                            objJ2 = o1Var.j(objJ2, objF);
                        }
                    }
                    view9 = view2;
                    view10 = view;
                    obj4 = obj;
                    arrayList18 = arrayList18;
                    s1Var15 = s1Var4;
                }
            }
            s1Var2 = s1Var15;
            ArrayList arrayList24 = arrayList18;
            Object obj6 = obj4;
            Object objI = o1Var.i(objJ, objJ2, obj6);
            if (objI == null) {
                str2 = str9;
            } else {
                Iterator it9 = arrayList19.iterator();
                while (true) {
                    int i15 = 4;
                    if (!it9.hasNext()) {
                        break;
                    }
                    m mVar4 = (m) it9.next();
                    if (!mVar4.b()) {
                        s1 s1Var17 = mVar4.f1964a;
                        s1 s1Var18 = s1Var2;
                        boolean z16 = obj6 != null && (s1Var17 == s1Var || s1Var17 == s1Var18);
                        if (mVar4.f1968c != null || z16) {
                            Field field = b3.q0.f2670a;
                            if (b3.e0.c(viewGroup)) {
                                str3 = str9;
                                d0 d0Var4 = s1Var17.f2025c;
                                o1Var.o(objI, mVar4.f1965b, new y2.a(this, mVar4, s1Var17, i15));
                            } else {
                                str3 = str9;
                                if (Log.isLoggable(str3, 2)) {
                                    Log.v(str3, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + s1Var17);
                                }
                                mVar4.a();
                            }
                        } else {
                            str3 = str9;
                        }
                        s1Var2 = s1Var18;
                        str9 = str3;
                    }
                }
                str2 = str9;
                s1 s1Var19 = s1Var2;
                Field field2 = b3.q0.f2670a;
                if (b3.e0.c(viewGroup)) {
                    h1.a(arrayList21, 4);
                    ArrayList arrayList25 = new ArrayList();
                    int size2 = arrayList20.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        View view11 = (View) arrayList20.get(i16);
                        Field field3 = b3.q0.f2670a;
                        arrayList25.add(b3.h0.k(view11));
                        b3.h0.v(view11, null);
                    }
                    if (Log.isLoggable(str2, 2)) {
                        Log.v(str2, ">>>>> Beginning transition <<<<<");
                        Log.v(str2, ">>>>> SharedElementFirstOutViews <<<<<");
                        for (Iterator it10 = arrayList24.iterator(); it10.hasNext(); it10 = it10) {
                            View view12 = (View) it10.next();
                            Log.v(str2, "View: " + view12 + " Name: " + b3.h0.k(view12));
                        }
                        Log.v(str2, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator it11 = arrayList20.iterator(); it11.hasNext(); it11 = it11) {
                            View view13 = (View) it11.next();
                            Log.v(str2, "View: " + view13 + " Name: " + b3.h0.k(view13));
                        }
                    }
                    o1Var.c(viewGroup, objI);
                    int size3 = arrayList20.size();
                    ArrayList arrayList26 = new ArrayList();
                    int i17 = 0;
                    while (i17 < size3) {
                        ArrayList arrayList27 = arrayList24;
                        View view14 = (View) arrayList27.get(i17);
                        Field field4 = b3.q0.f2670a;
                        s1 s1Var20 = s1Var19;
                        String strK = b3.h0.k(view14);
                        arrayList26.add(strK);
                        if (strK == null) {
                            s1Var3 = s1Var;
                        } else {
                            s1Var3 = s1Var;
                            b3.h0.v(view14, null);
                            q.f fVar6 = fVar5;
                            String str10 = (String) fVar6.get(strK);
                            fVar5 = fVar6;
                            for (int i18 = 0; i18 < size3; i18++) {
                                if (str10.equals(arrayList25.get(i18))) {
                                    b3.h0.v((View) arrayList20.get(i18), strK);
                                    break;
                                }
                            }
                        }
                        i17++;
                        arrayList24 = arrayList27;
                        s1Var19 = s1Var20;
                        s1Var = s1Var3;
                    }
                    s1Var = s1Var;
                    s1Var2 = s1Var19;
                    ArrayList arrayList28 = arrayList24;
                    b3.u.a(viewGroup, new n1(o1Var, size3, arrayList20, arrayList25, arrayList28, arrayList26, 0));
                    z11 = false;
                    h1.a(arrayList21, 0);
                    o1Var.q(obj6, arrayList28, arrayList20);
                } else {
                    s1Var2 = s1Var19;
                }
            }
            z11 = false;
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        Context context = viewGroup.getContext();
        ArrayList<k> arrayList29 = new ArrayList();
        boolean z17 = z11;
        for (k kVar2 : arrayList3) {
            if (kVar2.b()) {
                kVar2.a();
            } else {
                h0 h0VarC = kVar2.c(context);
                if (h0VarC == null) {
                    kVar2.a();
                } else {
                    Animator animator = h0VarC.f1932b;
                    if (animator == null) {
                        arrayList29.add(kVar2);
                    } else {
                        s1 s1Var21 = kVar2.f1964a;
                        d0 d0Var5 = s1Var21.f2025c;
                        if (Boolean.TRUE.equals(map.get(s1Var21))) {
                            if (Log.isLoggable(str2, 2)) {
                                Log.v(str2, "Ignoring Animator set on " + d0Var5 + " as this Fragment was involved in a Transition.");
                            }
                            kVar2.a();
                        } else {
                            boolean z18 = s1Var21.f2023a == 3 ? true : z11;
                            ArrayList arrayList30 = arrayList2;
                            if (z18) {
                                arrayList30.remove(s1Var21);
                            }
                            View view15 = d0Var5.mView;
                            viewGroup.startViewTransition(view15);
                            animator.addListener(new d(viewGroup, view15, z18, s1Var21, kVar2));
                            animator.setTarget(view15);
                            animator.start();
                            if (Log.isLoggable(str2, 2)) {
                                Log.v(str2, "Animator from operation " + s1Var21 + " has started.");
                            }
                            kVar2.f1965b.b(new z2(this, animator, s1Var21));
                            arrayList2 = arrayList30;
                            z17 = true;
                        }
                    }
                }
            }
        }
        ArrayList arrayList31 = arrayList2;
        for (k kVar3 : arrayList29) {
            s1 s1Var22 = kVar3.f1964a;
            d0 d0Var6 = s1Var22.f2025c;
            if (zContainsValue) {
                if (Log.isLoggable(str2, 2)) {
                    Log.v(str2, "Ignoring Animation set on " + d0Var6 + " as Animations cannot run alongside Transitions.");
                }
                kVar3.a();
            } else if (z17) {
                if (Log.isLoggable(str2, 2)) {
                    Log.v(str2, "Ignoring Animation set on " + d0Var6 + " as Animations cannot run alongside Animators.");
                }
                kVar3.a();
            } else {
                View view16 = d0Var6.mView;
                h0 h0VarC2 = kVar3.c(context);
                h0VarC2.getClass();
                Animation animation = h0VarC2.f1931a;
                animation.getClass();
                if (s1Var22.f2023a != 1) {
                    view16.startAnimation(animation);
                    kVar3.a();
                } else {
                    viewGroup.startViewTransition(view16);
                    i0 i0Var = new i0(animation, viewGroup, view16);
                    i0Var.setAnimationListener(new f(view16, viewGroup, kVar3, s1Var22));
                    view16.startAnimation(i0Var);
                    if (Log.isLoggable(str2, 2)) {
                        Log.v(str2, "Animation from operation " + s1Var22 + " has started.");
                    }
                }
                g gVar3 = new g();
                gVar3.f1915e = this;
                gVar3.f1911a = view16;
                gVar3.f1912b = viewGroup;
                gVar3.f1913c = kVar3;
                gVar3.f1914d = s1Var22;
                kVar3.f1965b.b(gVar3);
            }
        }
        Iterator it12 = arrayList31.iterator();
        while (it12.hasNext()) {
            j((s1) it12.next());
        }
        arrayList31.clear();
        if (Log.isLoggable(str2, 2)) {
            Log.v(str2, "Completed executing operations from " + s1Var + str + s1Var2);
        }
    }
}
