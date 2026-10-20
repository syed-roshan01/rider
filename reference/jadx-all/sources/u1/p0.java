package u1;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import com.ride.accepter.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends b3.c implements androidx.lifecycle.g {
    public static final int[] X = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public int A;
    public Integer B;
    public final q.g C;
    public final o9.c D;
    public boolean E;
    public l.t F;
    public final q.f G;
    public final q.g H;
    public e0 I;
    public Map J;
    public final q.g K;
    public final HashMap L;
    public final HashMap M;
    public final String N;
    public final String O;
    public final i2.l P;
    public final LinkedHashMap Q;
    public g0 R;
    public boolean S;
    public final androidx.activity.d T;
    public final ArrayList U;
    public final l0 V;
    public int W;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f15195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15196e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f15197f = new l0(this, 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AccessibilityManager f15198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x f15199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f15200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f15201q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f15202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e.a f15203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15204t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AccessibilityNodeInfo f15205u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15206v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashMap f15207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f15208x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q.a0 f15209y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final q.a0 f15210z;

    /* JADX WARN: Type inference failed for: r3v2, types: [u1.x] */
    /* JADX WARN: Type inference failed for: r3v3, types: [u1.y] */
    public p0(w wVar) {
        this.f15195d = wVar;
        Object systemService = wVar.getContext().getSystemService("accessibility");
        d7.a.k(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f15198n = accessibilityManager;
        this.f15199o = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: u1.x
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                p0 p0Var = this.f15366a;
                p0Var.f15201q = z10 ? p0Var.f15198n.getEnabledAccessibilityServiceList(-1) : r8.r.f13661a;
            }
        };
        this.f15200p = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: u1.y
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                p0 p0Var = this.f15375a;
                p0Var.f15201q = p0Var.f15198n.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f15201q = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.W = 1;
        this.f15202r = new Handler(Looper.getMainLooper());
        this.f15203s = new e.a(new c0(this));
        this.f15204t = Integer.MIN_VALUE;
        this.f15207w = new HashMap();
        this.f15208x = new HashMap();
        this.f15209y = new q.a0(0);
        this.f15210z = new q.a0(0);
        this.A = -1;
        this.C = new q.g(0);
        this.D = z6.a.a(1, null, 6);
        this.E = true;
        this.G = new q.f(0);
        this.H = new q.g(0);
        r8.s sVar = r8.s.f13662a;
        this.J = sVar;
        this.K = new q.g(0);
        this.L = new HashMap();
        this.M = new HashMap();
        this.N = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.O = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.P = new i2.l();
        this.Q = new LinkedHashMap();
        this.R = new g0(wVar.getSemanticsOwner().a(), sVar);
        wVar.addOnAttachStateChangeListener(new k.d(this, 2));
        this.T = new androidx.activity.d(this, 6);
        this.U = new ArrayList();
        this.V = new l0(this, 1);
    }

    public static final boolean B(y1.h hVar, float f10) {
        c9.a aVar = hVar.f16758a;
        return (f10 < 0.0f && ((Number) aVar.invoke()).floatValue() > 0.0f) || (f10 > 0.0f && ((Number) aVar.invoke()).floatValue() < ((Number) hVar.f16759b.invoke()).floatValue());
    }

    public static final boolean C(y1.h hVar) {
        c9.a aVar = hVar.f16758a;
        float fFloatValue = ((Number) aVar.invoke()).floatValue();
        boolean z10 = hVar.f16760c;
        return (fFloatValue > 0.0f && !z10) || (((Number) aVar.invoke()).floatValue() < ((Number) hVar.f16759b.invoke()).floatValue() && z10);
    }

    public static final boolean D(y1.h hVar) {
        c9.a aVar = hVar.f16758a;
        float fFloatValue = ((Number) aVar.invoke()).floatValue();
        float fFloatValue2 = ((Number) hVar.f16759b.invoke()).floatValue();
        boolean z10 = hVar.f16760c;
        return (fFloatValue < fFloatValue2 && !z10) || (((Number) aVar.invoke()).floatValue() > 0.0f && z10);
    }

    public static /* synthetic */ void K(p0 p0Var, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        p0Var.J(i10, i11, num, null);
    }

    public static CharSequence R(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i10 = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i10 = 99999;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
        d7.a.k(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    public static boolean s(y1.o oVar) {
        z1.a aVar = (z1.a) o1.s.J(oVar.f16798d, y1.r.B);
        y1.u uVar = y1.r.f16834s;
        y1.j jVar = oVar.f16798d;
        y1.g gVar = (y1.g) o1.s.J(jVar, uVar);
        boolean z10 = true;
        boolean z11 = aVar != null;
        Object obj = jVar.f16786a.get(y1.r.A);
        if (obj == null) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return z11;
        }
        bool.booleanValue();
        if (gVar != null && y1.g.a(gVar.f16757a, 4)) {
            z10 = z11;
        }
        return z10;
    }

    public static String v(y1.o oVar) {
        a2.e eVar;
        if (oVar == null) {
            return null;
        }
        y1.u uVar = y1.r.f16816a;
        y1.j jVar = oVar.f16798d;
        if (jVar.f16786a.containsKey(uVar)) {
            return i1.b.o((List) jVar.e(uVar), ",");
        }
        y1.u uVar2 = y1.i.f16768h;
        LinkedHashMap linkedHashMap = jVar.f16786a;
        if (linkedHashMap.containsKey(uVar2)) {
            Object obj = linkedHashMap.get(y1.r.f16839x);
            if (obj == null) {
                obj = null;
            }
            a2.e eVar2 = (a2.e) obj;
            if (eVar2 != null) {
                return eVar2.f918a;
            }
            return null;
        }
        Object obj2 = linkedHashMap.get(y1.r.f16836u);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list == null || (eVar = (a2.e) r8.p.H0(list)) == null) {
            return null;
        }
        return eVar.f918a;
    }

    public static a2.a0 w(y1.j jVar) {
        c9.c cVar;
        ArrayList arrayList = new ArrayList();
        Object obj = jVar.f16786a.get(y1.i.f16761a);
        if (obj == null) {
            obj = null;
        }
        y1.a aVar = (y1.a) obj;
        if (aVar == null || (cVar = (c9.c) aVar.f16746b) == null || !((Boolean) cVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (a2.a0) arrayList.get(0);
    }

    public final void A(androidx.compose.ui.node.a aVar) {
        if (this.C.add(aVar)) {
            this.D.n(q8.l.f13235a);
        }
    }

    public final int E(int i10) {
        if (i10 == this.f15195d.getSemanticsOwner().a().f16801g) {
            return -1;
        }
        return i10;
    }

    public final void F(y1.o oVar, g0 g0Var) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listG = oVar.g(false, true);
        int size = listG.size();
        int i10 = 0;
        while (true) {
            androidx.compose.ui.node.a aVar = oVar.f16797c;
            if (i10 >= size) {
                Iterator it = g0Var.f15095c.iterator();
                while (it.hasNext()) {
                    if (!linkedHashSet.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                        A(aVar);
                        return;
                    }
                }
                List listG2 = oVar.g(false, true);
                int size2 = listG2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    y1.o oVar2 = (y1.o) listG2.get(i11);
                    if (r().containsKey(Integer.valueOf(oVar2.f16801g))) {
                        Object obj = this.Q.get(Integer.valueOf(oVar2.f16801g));
                        d7.a.j(obj);
                        F(oVar2, (g0) obj);
                    }
                }
                return;
            }
            y1.o oVar3 = (y1.o) listG.get(i10);
            if (r().containsKey(Integer.valueOf(oVar3.f16801g))) {
                LinkedHashSet linkedHashSet2 = g0Var.f15095c;
                int i12 = oVar3.f16801g;
                if (!linkedHashSet2.contains(Integer.valueOf(i12))) {
                    A(aVar);
                    return;
                }
                linkedHashSet.add(Integer.valueOf(i12));
            }
            i10++;
        }
    }

    public final void G(y1.o oVar, g0 g0Var) {
        List listG = oVar.g(false, true);
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            y1.o oVar2 = (y1.o) listG.get(i10);
            if (r().containsKey(Integer.valueOf(oVar2.f16801g)) && !g0Var.f15095c.contains(Integer.valueOf(oVar2.f16801g))) {
                S(oVar2);
            }
        }
        LinkedHashMap linkedHashMap = this.Q;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!r().containsKey(entry.getKey())) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                Integer numValueOf = Integer.valueOf(iIntValue);
                q.f fVar = this.G;
                if (fVar.containsKey(numValueOf)) {
                    fVar.remove(Integer.valueOf(iIntValue));
                } else {
                    this.H.add(Integer.valueOf(iIntValue));
                }
            }
        }
        List listG2 = oVar.g(false, true);
        int size2 = listG2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            y1.o oVar3 = (y1.o) listG2.get(i11);
            if (r().containsKey(Integer.valueOf(oVar3.f16801g))) {
                int i12 = oVar3.f16801g;
                if (linkedHashMap.containsKey(Integer.valueOf(i12))) {
                    Object obj = linkedHashMap.get(Integer.valueOf(i12));
                    d7.a.j(obj);
                    G(oVar3, (g0) obj);
                }
            }
        }
    }

    public final void H(int i10, String str) {
        int i11;
        l.t tVar = this.F;
        if (tVar != null && (i11 = Build.VERSION.SDK_INT) >= 29) {
            AutofillId autofillIdA = i11 >= 29 ? w1.b.a(l2.f(tVar.f10928b), w1.d.a((View) tVar.f10929c), i10) : null;
            if (autofillIdA == null) {
                throw new IllegalStateException("Invalid content capture ID".toString());
            }
            if (i11 >= 29) {
                w1.b.e(l2.f(tVar.f10928b), autofillIdA, str);
            }
        }
    }

    public final boolean I(AccessibilityEvent accessibilityEvent) {
        if (!x()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f15206v = true;
        }
        try {
            return ((Boolean) this.f15197f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f15206v = false;
        }
    }

    public final boolean J(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        if (!x()) {
            d1.d dVar = r0.f15247a;
            if (this.F == null) {
                return false;
            }
        }
        AccessibilityEvent accessibilityEventM = m(i10, i11);
        if (num != null) {
            accessibilityEventM.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM.setContentDescription(i1.b.o(list, ","));
        }
        return I(accessibilityEventM);
    }

    public final void L(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventM = m(E(i10), 32);
        accessibilityEventM.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventM.getText().add(str);
        }
        I(accessibilityEventM);
    }

    public final void M(int i10) {
        e0 e0Var = this.I;
        if (e0Var != null) {
            y1.o oVar = e0Var.f15066a;
            if (i10 != oVar.f16801g) {
                return;
            }
            if (SystemClock.uptimeMillis() - e0Var.f15071f <= 1000) {
                AccessibilityEvent accessibilityEventM = m(E(oVar.f16801g), 131072);
                accessibilityEventM.setFromIndex(e0Var.f15069d);
                accessibilityEventM.setToIndex(e0Var.f15070e);
                accessibilityEventM.setAction(e0Var.f15067b);
                accessibilityEventM.setMovementGranularity(e0Var.f15068c);
                accessibilityEventM.getText().add(v(oVar));
                I(accessibilityEventM);
            }
        }
        this.I = null;
    }

    public final void N(androidx.compose.ui.node.a aVar, q.g gVar) {
        y1.j jVarN;
        androidx.compose.ui.node.a aVarD;
        if (aVar.C() && !this.f15195d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(aVar)) {
            q.g gVar2 = this.C;
            int i10 = gVar2.f12992c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (r0.f((androidx.compose.ui.node.a) gVar2.f12991b[i11], aVar)) {
                    return;
                }
            }
            if (!aVar.C.d(8)) {
                aVar = r0.d(aVar, s.f15264e);
            }
            if (aVar == null || (jVarN = aVar.n()) == null) {
                return;
            }
            if (!jVarN.f16787b && (aVarD = r0.d(aVar, s.f15263d)) != null) {
                aVar = aVarD;
            }
            int i12 = aVar.f1737b;
            if (gVar.add(Integer.valueOf(i12))) {
                K(this, E(i12), 2048, 1, 8);
            }
        }
    }

    public final void O(androidx.compose.ui.node.a aVar) {
        if (aVar.C() && !this.f15195d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(aVar)) {
            int i10 = aVar.f1737b;
            y1.h hVar = (y1.h) this.f15207w.get(Integer.valueOf(i10));
            y1.h hVar2 = (y1.h) this.f15208x.get(Integer.valueOf(i10));
            if (hVar == null && hVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM = m(i10, 4096);
            if (hVar != null) {
                accessibilityEventM.setScrollX((int) ((Number) hVar.f16758a.invoke()).floatValue());
                accessibilityEventM.setMaxScrollX((int) ((Number) hVar.f16759b.invoke()).floatValue());
            }
            if (hVar2 != null) {
                accessibilityEventM.setScrollY((int) ((Number) hVar2.f16758a.invoke()).floatValue());
                accessibilityEventM.setMaxScrollY((int) ((Number) hVar2.f16759b.invoke()).floatValue());
            }
            I(accessibilityEventM);
        }
    }

    public final boolean P(y1.o oVar, int i10, int i11, boolean z10) {
        String strV;
        y1.u uVar = y1.i.f16767g;
        y1.j jVar = oVar.f16798d;
        if (jVar.f16786a.containsKey(uVar) && r0.a(oVar)) {
            c9.f fVar = (c9.f) ((y1.a) jVar.e(uVar)).f16746b;
            if (fVar != null) {
                return ((Boolean) fVar.e(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        }
        if ((i10 == i11 && i11 == this.A) || (strV = v(oVar)) == null) {
            return false;
        }
        if (i10 < 0 || i10 != i11 || i11 > strV.length()) {
            i10 = -1;
        }
        this.A = i10;
        boolean z11 = strV.length() > 0;
        int i12 = oVar.f16801g;
        I(n(E(i12), z11 ? Integer.valueOf(this.A) : null, z11 ? Integer.valueOf(this.A) : null, z11 ? Integer.valueOf(strV.length()) : null, strV));
        M(i12);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b8 A[EDGE_INSN: B:28:0x00b8->B:29:0x00cc BREAK  A[LOOP:2: B:17:0x0050->B:27:0x00b5]] */
    public final ArrayList Q(ArrayList arrayList, boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            o((y1.o) arrayList.get(i10), arrayList2, linkedHashMap);
        }
        ArrayList arrayList3 = new ArrayList();
        int iY = d7.t.Y(arrayList2);
        if (iY >= 0) {
            int i11 = 0;
            while (true) {
                y1.o oVar = (y1.o) arrayList2.get(i11);
                if (i11 == 0) {
                    arrayList3.add(new q8.f(oVar.f(), d7.t.f0(oVar)));
                    break;
                }
                d1.d dVarF = oVar.f();
                d1.d dVarF2 = oVar.f();
                float f10 = dVarF.f4333b;
                float f11 = dVarF2.f4335d;
                boolean z11 = f10 >= f11;
                int iY2 = d7.t.Y(arrayList3);
                if (iY2 < 0) {
                    arrayList3.add(new q8.f(oVar.f(), d7.t.f0(oVar)));
                    break;
                }
                int i12 = 0;
                while (true) {
                    d1.d dVar = (d1.d) ((q8.f) arrayList3.get(i12)).f13225a;
                    float f12 = dVar.f4333b;
                    float f13 = dVar.f4335d;
                    boolean z12 = f12 >= f13;
                    if (!z11 && !z12 && Math.max(f10, f12) < Math.min(f11, f13)) {
                        arrayList3.set(i12, new q8.f(new d1.d(Math.max(dVar.f4332a, 0.0f), Math.max(dVar.f4333b, f10), Math.min(dVar.f4334c, Float.POSITIVE_INFINITY), Math.min(f13, f11)), ((q8.f) arrayList3.get(i12)).f13226b));
                        ((List) ((q8.f) arrayList3.get(i12)).f13226b).add(oVar);
                        break;
                    }
                    if (i12 == iY2) {
                        arrayList3.add(new q8.f(oVar.f(), d7.t.f0(oVar)));
                        break;
                    }
                    i12++;
                }
                if (i11 == iY) {
                    break;
                }
                i11++;
            }
        }
        r8.m.z0(arrayList3, h0.f15108a);
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        for (int i13 = 0; i13 < size3; i13++) {
            q8.f fVar = (q8.f) arrayList3.get(i13);
            r8.m.z0((List) fVar.f13226b, new n0(new m0(z10 ? f0.f15087a : d0.f15060a), size2));
            arrayList4.addAll((Collection) fVar.f13226b);
        }
        r8.m.z0(arrayList4, new z(o0.f15173b, size2));
        while (size2 <= d7.t.Y(arrayList4)) {
            List list = (List) linkedHashMap.get(Integer.valueOf(((y1.o) arrayList4.get(size2)).f16801g));
            if (list != null) {
                if (y((y1.o) arrayList4.get(size2))) {
                    size2++;
                } else {
                    arrayList4.remove(size2);
                }
                arrayList4.addAll(size2, list);
                size2 += list.size();
            } else {
                size2++;
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a3 A[PHI: r9
  0x00a3: PHI (r9v2 android.view.autofill.AutofillId) = (r9v1 android.view.autofill.AutofillId), (r9v11 android.view.autofill.AutofillId) binds: [B:36:0x0084, B:41:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0131  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:90:0x0166  */
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
    public final void S(y1.o oVar) {
        c9.c cVar;
        int i10;
        long j10;
        w1.h hVar;
        y1.u uVar;
        y1.j jVar;
        Object obj;
        List list;
        ViewStructure viewStructure;
        Object obj2;
        a2.e eVar;
        Object obj3;
        List list2;
        ViewStructure viewStructure2;
        Object obj4;
        y1.g gVar;
        a2.a0 a0VarW;
        y1.o oVarI;
        d1.d dVarB;
        t1.c1 c1VarC;
        t1.c1 c1Var;
        String strC;
        c9.c cVar2;
        d1.d dVar = r0.f15247a;
        if (this.F == null) {
            return;
        }
        y1.j jVar2 = oVar.f16798d;
        Boolean bool = (Boolean) o1.s.J(jVar2, y1.r.f16838w);
        int i11 = this.W;
        Object obj5 = null;
        obj5 = null;
        obj5 = null;
        obj5 = null;
        obj5 = null;
        LinkedHashMap linkedHashMap = jVar2.f16786a;
        if (i11 == 1 && d7.a.d(bool, Boolean.TRUE)) {
            Object obj6 = linkedHashMap.get(y1.i.f16770j);
            if (obj6 == null) {
                obj6 = null;
            }
            y1.a aVar = (y1.a) obj6;
            if (aVar != null && (cVar2 = (c9.c) aVar.f16746b) != null) {
            }
        } else if (this.W == 2 && d7.a.d(bool, Boolean.FALSE)) {
            Object obj7 = linkedHashMap.get(y1.i.f16770j);
            if (obj7 == null) {
                obj7 = null;
            }
            y1.a aVar2 = (y1.a) obj7;
            if (aVar2 != null && (cVar = (c9.c) aVar2.f16746b) != null) {
            }
        }
        l.t tVar = this.F;
        int i12 = oVar.f16801g;
        if (tVar != null && (i10 = Build.VERSION.SDK_INT) >= 29) {
            AutofillId autofillIdA = w1.d.a(this.f15195d);
            y1.o oVarI2 = oVar.i();
            if (oVarI2 != null) {
                autofillIdA = i10 >= 29 ? w1.b.a(l2.f(tVar.f10928b), w1.d.a((View) tVar.f10929c), oVarI2.f16801g) : null;
                if (autofillIdA != null) {
                    j10 = i12;
                    if (i10 >= 29) {
                        hVar = new w1.h(w1.b.c(l2.f(tVar.f10928b), autofillIdA, j10));
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        uVar = y1.r.C;
                        jVar = oVar.f16798d;
                        if (!jVar.f16786a.containsKey(uVar)) {
                            y1.u uVar2 = y1.r.f16836u;
                            LinkedHashMap linkedHashMap2 = jVar.f16786a;
                            obj = linkedHashMap2.get(uVar2);
                            if (obj == null) {
                                obj = null;
                            }
                            list = (List) obj;
                            viewStructure = hVar.f16145a;
                            if (list != null) {
                                w1.g.a(viewStructure, "android.widget.TextView");
                                w1.g.d(viewStructure, i1.b.o(list, "\n"));
                            }
                            obj2 = linkedHashMap2.get(y1.r.f16839x);
                            if (obj2 == null) {
                                obj2 = null;
                            }
                            eVar = (a2.e) obj2;
                            if (eVar != null) {
                                w1.g.a(viewStructure, "android.widget.EditText");
                                w1.g.d(viewStructure, eVar);
                            }
                            obj3 = linkedHashMap2.get(y1.r.f16816a);
                            if (obj3 == null) {
                                obj3 = null;
                            }
                            list2 = (List) obj3;
                            viewStructure2 = hVar.f16145a;
                            if (list2 != null) {
                                w1.g.b(viewStructure2, i1.b.o(list2, "\n"));
                            }
                            obj4 = linkedHashMap2.get(y1.r.f16834s);
                            if (obj4 == null) {
                                obj4 = null;
                            }
                            gVar = (y1.g) obj4;
                            if (gVar != null && (strC = r0.c(gVar.f16757a)) != null) {
                                w1.g.a(viewStructure, strC);
                            }
                            a0VarW = w(jVar);
                            if (a0VarW != null) {
                                a2.z zVar = a0VarW.f893a;
                                float fC = m2.n.c(zVar.f1053b.f911a.f1032b);
                                m2.b bVar = zVar.f1058g;
                                w1.g.e(viewStructure2, bVar.m() * bVar.c() * fC, 0, 0, 0);
                            }
                            oVarI = oVar.i();
                            dVarB = d1.d.f4331e;
                            if (oVarI != null && (c1VarC = oVar.c()) != null) {
                                c1Var = c1VarC.K0().f16742t ? c1VarC : null;
                                if (c1Var != null) {
                                    dVarB = t1.g.x(oVarI.f16795a, 8).b(c1Var, true);
                                }
                            }
                            w1.g.c(viewStructure2, (int) dVarB.f4332a, (int) dVarB.f4333b, 0, 0, (int) dVarB.c(), (int) dVarB.b());
                            obj5 = hVar;
                        }
                    }
                }
            } else {
                j10 = i12;
                if (i10 >= 29) {
                    hVar = new w1.h(w1.b.c(l2.f(tVar.f10928b), autofillIdA, j10));
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    uVar = y1.r.C;
                    jVar = oVar.f16798d;
                    if (!jVar.f16786a.containsKey(uVar)) {
                        y1.u uVar3 = y1.r.f16836u;
                        LinkedHashMap linkedHashMap3 = jVar.f16786a;
                        obj = linkedHashMap3.get(uVar3);
                        if (obj == null) {
                            obj = null;
                        }
                        list = (List) obj;
                        viewStructure = hVar.f16145a;
                        if (list != null) {
                            w1.g.a(viewStructure, "android.widget.TextView");
                            w1.g.d(viewStructure, i1.b.o(list, "\n"));
                        }
                        obj2 = linkedHashMap3.get(y1.r.f16839x);
                        if (obj2 == null) {
                            obj2 = null;
                        }
                        eVar = (a2.e) obj2;
                        if (eVar != null) {
                            w1.g.a(viewStructure, "android.widget.EditText");
                            w1.g.d(viewStructure, eVar);
                        }
                        obj3 = linkedHashMap3.get(y1.r.f16816a);
                        if (obj3 == null) {
                            obj3 = null;
                        }
                        list2 = (List) obj3;
                        viewStructure2 = hVar.f16145a;
                        if (list2 != null) {
                            w1.g.b(viewStructure2, i1.b.o(list2, "\n"));
                        }
                        obj4 = linkedHashMap3.get(y1.r.f16834s);
                        if (obj4 == null) {
                            obj4 = null;
                        }
                        gVar = (y1.g) obj4;
                        if (gVar != null) {
                            w1.g.a(viewStructure, strC);
                        }
                        a0VarW = w(jVar);
                        if (a0VarW != null) {
                            a2.z zVar2 = a0VarW.f893a;
                            float fC2 = m2.n.c(zVar2.f1053b.f911a.f1032b);
                            m2.b bVar2 = zVar2.f1058g;
                            w1.g.e(viewStructure2, bVar2.m() * bVar2.c() * fC2, 0, 0, 0);
                        }
                        oVarI = oVar.i();
                        dVarB = d1.d.f4331e;
                        if (oVarI != null) {
                            if (c1VarC.K0().f16742t) {
                            }
                            if (c1Var != null) {
                                dVarB = t1.g.x(oVarI.f16795a, 8).b(c1Var, true);
                            }
                        }
                        w1.g.c(viewStructure2, (int) dVarB.f4332a, (int) dVarB.f4333b, 0, 0, (int) dVarB.c(), (int) dVarB.b());
                        obj5 = hVar;
                    }
                }
            }
        }
        if (obj5 != null) {
            Integer numValueOf = Integer.valueOf(i12);
            q.g gVar2 = this.H;
            if (gVar2.contains(numValueOf)) {
                gVar2.remove(Integer.valueOf(i12));
            } else {
                this.G.put(Integer.valueOf(i12), obj5);
            }
        }
        List listG = oVar.g(false, true);
        int size = listG.size();
        for (int i13 = 0; i13 < size; i13++) {
            S((y1.o) listG.get(i13));
        }
    }

    public final void T(y1.o oVar) {
        d1.d dVar = r0.f15247a;
        if (this.F == null) {
            return;
        }
        int i10 = oVar.f16801g;
        Integer numValueOf = Integer.valueOf(i10);
        q.f fVar = this.G;
        if (fVar.containsKey(numValueOf)) {
            fVar.remove(Integer.valueOf(i10));
        } else {
            this.H.add(Integer.valueOf(i10));
        }
        List listG = oVar.g(false, true);
        int size = listG.size();
        for (int i11 = 0; i11 < size; i11++) {
            T((y1.o) listG.get(i11));
        }
    }

    @Override // b3.c
    public final e.a a(View view) {
        return this.f15203s;
    }

    @Override // androidx.lifecycle.g
    public final void d(androidx.lifecycle.w wVar) {
        S(this.f15195d.getSemanticsOwner().a());
        z();
    }

    @Override // androidx.lifecycle.g
    public final void f(androidx.lifecycle.w wVar) {
        T(this.f15195d.getSemanticsOwner().a());
        z();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    public final void i(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        y1.o oVar;
        long jK;
        RectF rectF;
        s2 s2Var = (s2) r().get(Integer.valueOf(i10));
        if (s2Var == null || (oVar = s2Var.f15289a) == null) {
            return;
        }
        String strV = v(oVar);
        if (d7.a.d(str, this.N)) {
            Integer num = (Integer) this.L.get(Integer.valueOf(i10));
            if (num != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                return;
            }
            return;
        }
        if (d7.a.d(str, this.O)) {
            Integer num2 = (Integer) this.M.get(Integer.valueOf(i10));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        y1.u uVar = y1.i.f16761a;
        y1.j jVar = oVar.f16798d;
        if (!jVar.f16786a.containsKey(uVar) || bundle == null || !d7.a.d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            y1.u uVar2 = y1.r.f16835t;
            LinkedHashMap linkedHashMap = jVar.f16786a;
            if (!linkedHashMap.containsKey(uVar2) || bundle == null || !d7.a.d(str, "androidx.compose.ui.semantics.testTag")) {
                if (d7.a.d(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, oVar.f16801g);
                    return;
                }
                return;
            } else {
                Object obj = linkedHashMap.get(uVar2);
                String str2 = (String) (obj != null ? obj : null);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i12 > 0 && i11 >= 0) {
            if (i11 < (strV != null ? strV.length() : Integer.MAX_VALUE)) {
                a2.a0 a0VarW = w(jVar);
                if (a0VarW == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = i11 + i13;
                    if (i14 >= a0VarW.f893a.f1052a.f918a.length()) {
                        arrayList.add(null);
                    } else {
                        d1.d dVarB = a0VarW.b(i14);
                        t1.c1 c1VarC = oVar.c();
                        if (c1VarC == null) {
                            jK = d1.c.f4326b;
                        } else {
                            if (!c1VarC.K0().f16742t) {
                                c1VarC = null;
                            }
                            if (c1VarC != null) {
                                jK = androidx.compose.ui.layout.a.k(c1VarC);
                            } else {
                                jK = d1.c.f4326b;
                            }
                        }
                        d1.d dVarG = dVarB.g(jK);
                        d1.d dVarE = oVar.e();
                        d1.d dVarD = dVarG.e(dVarE) ? dVarG.d(dVarE) : null;
                        if (dVarD != null) {
                            long jF = d9.i.f(dVarD.f4332a, dVarD.f4333b);
                            w wVar = this.f15195d;
                            long jQ = wVar.q(jF);
                            long jQ2 = wVar.q(d9.i.f(dVarD.f4334c, dVarD.f4335d));
                            rectF = new RectF(d1.c.d(jQ), d1.c.e(jQ), d1.c.d(jQ2), d1.c.e(jQ2));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect j(s2 s2Var) {
        Rect rect = s2Var.f15290b;
        long jF = d9.i.f(rect.left, rect.top);
        w wVar = this.f15195d;
        long jQ = wVar.q(jF);
        long jQ2 = wVar.q(d9.i.f(rect.right, rect.bottom));
        return new Rect((int) Math.floor(d1.c.d(jQ)), (int) Math.floor(d1.c.e(jQ)), (int) Math.ceil(d1.c.d(jQ2)), (int) Math.ceil(d1.c.e(jQ2)));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:25:0x005b, B:29:0x006e, B:31:0x0076, B:35:0x0086, B:38:0x008e, B:40:0x0093, B:41:0x00a2, B:43:0x00a9, B:44:0x00b2, B:34:0x0083, B:20:0x0044), top: B:54:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:25:0x005b, B:29:0x006e, B:31:0x0076, B:35:0x0086, B:38:0x008e, B:40:0x0093, B:41:0x00a2, B:43:0x00a9, B:44:0x00b2, B:34:0x0083, B:20:0x0044), top: B:54:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008e A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:25:0x005b, B:29:0x006e, B:31:0x0076, B:35:0x0086, B:38:0x008e, B:40:0x0093, B:41:0x00a2, B:43:0x00a9, B:44:0x00b2, B:34:0x0083, B:20:0x0044), top: B:54:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0093 A[Catch: all -> 0x0033, LOOP:0: B:39:0x0091->B:40:0x0093, LOOP_END, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:25:0x005b, B:29:0x006e, B:31:0x0076, B:35:0x0086, B:38:0x008e, B:40:0x0093, B:41:0x00a2, B:43:0x00a9, B:44:0x00b2, B:34:0x0083, B:20:0x0044), top: B:54:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002d, B:25:0x005b, B:29:0x006e, B:31:0x0076, B:35:0x0086, B:38:0x008e, B:40:0x0093, B:41:0x00a2, B:43:0x00a9, B:44:0x00b2, B:34:0x0083, B:20:0x0044), top: B:54:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00cd -> B:14:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object k(u8.e r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.p0.k(u8.e):java.lang.Object");
    }

    public final boolean l(int i10, long j10, boolean z10) {
        y1.u uVar;
        y1.h hVar;
        if (!d7.a.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        Collection collectionValues = r().values();
        if (d1.c.b(j10, d1.c.f4328d)) {
            return false;
        }
        if (Float.isNaN(d1.c.d(j10)) || Float.isNaN(d1.c.e(j10))) {
            throw new IllegalStateException("Offset argument contained a NaN value.".toString());
        }
        if (z10) {
            uVar = y1.r.f16831p;
        } else {
            if (z10) {
                throw new androidx.fragment.app.a0();
            }
            uVar = y1.r.f16830o;
        }
        Collection<s2> collection = collectionValues;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        for (s2 s2Var : collection) {
            Rect rect = s2Var.f15290b;
            float f10 = rect.left;
            float f11 = rect.top;
            float f12 = rect.right;
            float f13 = rect.bottom;
            if (d1.c.d(j10) >= f10 && d1.c.d(j10) < f12 && d1.c.e(j10) >= f11 && d1.c.e(j10) < f13 && (hVar = (y1.h) o1.s.J(s2Var.f15289a.h(), uVar)) != null) {
                boolean z11 = hVar.f16760c;
                int i11 = z11 ? -i10 : i10;
                c9.a aVar = hVar.f16758a;
                if (!(i10 == 0 && z11) && i11 >= 0) {
                    if (((Number) aVar.invoke()).floatValue() < ((Number) hVar.f16759b.invoke()).floatValue()) {
                        return true;
                    }
                } else if (((Number) aVar.invoke()).floatValue() > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AccessibilityEvent m(int i10, int i11) {
        s2 s2Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        w wVar = this.f15195d;
        accessibilityEventObtain.setPackageName(wVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(wVar, i10);
        if (x() && (s2Var = (s2) r().get(Integer.valueOf(i10))) != null) {
            accessibilityEventObtain.setPassword(s2Var.f15289a.h().f16786a.containsKey(y1.r.C));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent n(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM = m(i10, 8192);
        if (num != null) {
            accessibilityEventM.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM.getText().add(charSequence);
        }
        return accessibilityEventM;
    }

    public final void o(y1.o oVar, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        boolean z10 = oVar.f16797c.f1753y == m2.l.f11816b;
        boolean zBooleanValue = ((Boolean) oVar.h().i(y1.r.f16827l, q0.f15217b)).booleanValue();
        int i10 = oVar.f16801g;
        if ((zBooleanValue || y(oVar)) && r().keySet().contains(Integer.valueOf(i10))) {
            arrayList.add(oVar);
        }
        boolean z11 = oVar.f16796b;
        if (zBooleanValue) {
            linkedHashMap.put(Integer.valueOf(i10), Q(r8.p.Y0(oVar.g(!z11, false)), z10));
            return;
        }
        List listG = oVar.g(!z11, false);
        int size = listG.size();
        for (int i11 = 0; i11 < size; i11++) {
            o((y1.o) listG.get(i11), arrayList, linkedHashMap);
        }
    }

    public final int p(y1.o oVar) {
        y1.u uVar = y1.r.f16816a;
        y1.j jVar = oVar.f16798d;
        if (!jVar.f16786a.containsKey(uVar)) {
            y1.u uVar2 = y1.r.f16840y;
            if (jVar.f16786a.containsKey(uVar2)) {
                return (int) (4294967295L & ((a2.b0) jVar.e(uVar2)).f905a);
            }
        }
        return this.A;
    }

    public final int q(y1.o oVar) {
        y1.u uVar = y1.r.f16816a;
        y1.j jVar = oVar.f16798d;
        if (!jVar.f16786a.containsKey(uVar)) {
            y1.u uVar2 = y1.r.f16840y;
            if (jVar.f16786a.containsKey(uVar2)) {
                return (int) (((a2.b0) jVar.e(uVar2)).f905a >> 32);
            }
        }
        return this.A;
    }

    public final Map r() {
        if (this.E) {
            this.E = false;
            y1.p semanticsOwner = this.f15195d.getSemanticsOwner();
            d1.d dVar = r0.f15247a;
            y1.o oVarA = semanticsOwner.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            androidx.compose.ui.node.a aVar = oVarA.f16797c;
            if (aVar.D() && aVar.C()) {
                d1.d dVarE = oVarA.e();
                r0.e(new Region(d7.t.p0(dVarE.f4332a), d7.t.p0(dVarE.f4333b), d7.t.p0(dVarE.f4334c), d7.t.p0(dVarE.f4335d)), oVarA, linkedHashMap, oVarA, new Region());
            }
            this.J = linkedHashMap;
            if (x()) {
                HashMap map = this.L;
                map.clear();
                HashMap map2 = this.M;
                map2.clear();
                s2 s2Var = (s2) r().get(-1);
                y1.o oVar = s2Var != null ? s2Var.f15289a : null;
                d7.a.j(oVar);
                int i10 = 1;
                ArrayList arrayListQ = Q(d7.t.f0(oVar), oVar.f16797c.f1753y == m2.l.f11816b);
                int iY = d7.t.Y(arrayListQ);
                if (1 <= iY) {
                    while (true) {
                        int i11 = ((y1.o) arrayListQ.get(i10 - 1)).f16801g;
                        int i12 = ((y1.o) arrayListQ.get(i10)).f16801g;
                        map.put(Integer.valueOf(i11), Integer.valueOf(i12));
                        map2.put(Integer.valueOf(i12), Integer.valueOf(i11));
                        if (i10 == iY) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.J;
    }

    public final String t(y1.o oVar) {
        float fFloatValue;
        int iR;
        y1.j jVar = oVar.f16798d;
        y1.u uVar = y1.r.f16816a;
        Object objJ = o1.s.J(jVar, y1.r.f16817b);
        y1.u uVar2 = y1.r.B;
        y1.j jVar2 = oVar.f16798d;
        z1.a aVar = (z1.a) o1.s.J(jVar2, uVar2);
        y1.g gVar = (y1.g) o1.s.J(jVar2, y1.r.f16834s);
        w wVar = this.f15195d;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 && objJ == null) {
                        objJ = wVar.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else if (gVar != null && y1.g.a(gVar.f16757a, 2) && objJ == null) {
                    objJ = wVar.getContext().getResources().getString(R.string.off);
                }
            } else if (gVar != null && y1.g.a(gVar.f16757a, 2) && objJ == null) {
                objJ = wVar.getContext().getResources().getString(R.string.on);
            }
        }
        Boolean bool = (Boolean) o1.s.J(jVar2, y1.r.A);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((gVar == null || !y1.g.a(gVar.f16757a, 4)) && objJ == null) {
                objJ = zBooleanValue ? wVar.getContext().getResources().getString(R.string.selected) : wVar.getContext().getResources().getString(R.string.not_selected);
            }
        }
        y1.f fVar = (y1.f) o1.s.J(jVar2, y1.r.f16818c);
        if (fVar != null) {
            y1.f fVar2 = y1.f.f16753d;
            if (fVar != y1.f.f16753d) {
                if (objJ == null) {
                    i9.d dVar = fVar.f16755b;
                    float fFloatValue2 = Float.valueOf(dVar.f8182b).floatValue();
                    float f10 = dVar.f8181a;
                    if (fFloatValue2 - Float.valueOf(f10).floatValue() == 0.0f) {
                        fFloatValue = 0.0f;
                    } else {
                        fFloatValue = (fVar.f16754a - Float.valueOf(f10).floatValue()) / (Float.valueOf(dVar.f8182b).floatValue() - Float.valueOf(f10).floatValue());
                    }
                    float fQ = z6.a.q(fFloatValue, 0.0f, 1.0f);
                    if (fQ == 0.0f) {
                        iR = 0;
                    } else {
                        iR = fQ == 1.0f ? 100 : z6.a.r(d7.t.p0(fQ * 100), 1, 99);
                    }
                    objJ = wVar.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(iR));
                }
            } else if (objJ == null) {
                objJ = wVar.getContext().getResources().getString(R.string.in_progress);
            }
        }
        return (String) objJ;
    }

    public final SpannableString u(y1.o oVar) {
        a2.e eVar;
        w wVar = this.f15195d;
        wVar.getFontFamilyResolver();
        Object obj = oVar.f16798d.f16786a.get(y1.r.f16839x);
        SpannableString spannableStringK = null;
        if (obj == null) {
            obj = null;
        }
        a2.e eVar2 = (a2.e) obj;
        i2.l lVar = this.P;
        SpannableString spannableString = (SpannableString) R(eVar2 != null ? i1.b.K(eVar2, wVar.getDensity(), lVar) : null);
        List list = (List) o1.s.J(oVar.f16798d, y1.r.f16836u);
        if (list != null && (eVar = (a2.e) r8.p.H0(list)) != null) {
            spannableStringK = i1.b.K(eVar, wVar.getDensity(), lVar);
        }
        return spannableString == null ? (SpannableString) R(spannableStringK) : spannableString;
    }

    public final boolean x() {
        return this.f15198n.isEnabled() && (this.f15201q.isEmpty() ^ true);
    }

    public final boolean y(y1.o oVar) {
        d1.d dVar = r0.f15247a;
        List list = (List) o1.s.J(oVar.f16798d, y1.r.f16816a);
        boolean z10 = ((list != null ? (String) r8.p.H0(list) : null) == null && u(oVar) == null && t(oVar) == null && !s(oVar)) ? false : true;
        if (!oVar.f16798d.f16787b) {
            if (oVar.f16799e || !oVar.g(false, true).isEmpty()) {
                return false;
            }
            if (o1.s.v(oVar.f16797c, y1.n.f16791b) != null || !z10) {
                return false;
            }
        }
        return true;
    }

    public final void z() {
        l.t tVar = this.F;
        if (tVar != null && Build.VERSION.SDK_INT >= 29) {
            q.f fVar = this.G;
            if (!fVar.isEmpty()) {
                List listW0 = r8.p.W0(fVar.values());
                ArrayList arrayList = new ArrayList(listW0.size());
                int size = listW0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((w1.h) listW0.get(i10)).f16145a);
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 34) {
                    w1.c.a(l2.f(tVar.f10928b), arrayList);
                } else if (i11 >= 29) {
                    ViewStructure viewStructureB = w1.b.b(l2.f(tVar.f10928b), (View) tVar.f10929c);
                    w1.a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    w1.b.d(l2.f(tVar.f10928b), viewStructureB);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        w1.b.d(l2.f(tVar.f10928b), (ViewStructure) arrayList.get(i12));
                    }
                    ViewStructure viewStructureB2 = w1.b.b(l2.f(tVar.f10928b), (View) tVar.f10929c);
                    w1.a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                    w1.b.d(l2.f(tVar.f10928b), viewStructureB2);
                }
                fVar.clear();
            }
            q.g gVar = this.H;
            if (!gVar.isEmpty()) {
                List listW1 = r8.p.W0(gVar);
                ArrayList arrayList2 = new ArrayList(listW1.size());
                int size2 = listW1.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList2.add(Long.valueOf(((Number) listW1.get(i13)).intValue()));
                }
                long[] jArrX0 = r8.p.X0(arrayList2);
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 34) {
                    w1.b.f(l2.f(tVar.f10928b), w1.d.a((View) tVar.f10929c), jArrX0);
                } else if (i14 >= 29) {
                    ViewStructure viewStructureB3 = w1.b.b(l2.f(tVar.f10928b), (View) tVar.f10929c);
                    w1.a.a(viewStructureB3).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    w1.b.d(l2.f(tVar.f10928b), viewStructureB3);
                    w1.b.f(l2.f(tVar.f10928b), w1.d.a((View) tVar.f10929c), jArrX0);
                    ViewStructure viewStructureB4 = w1.b.b(l2.f(tVar.f10928b), (View) tVar.f10929c);
                    w1.a.a(viewStructureB4).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                    w1.b.d(l2.f(tVar.f10928b), viewStructureB4);
                }
                gVar.clear();
            }
        }
    }
}
