package u1;

import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f15054a;

    public c0(p0 p0Var) {
        this.f15054a = p0Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f15054a.i(i10, accessibilityNodeInfo, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:152:0x030a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0366  */
    /* JADX WARN: Code duplicated, block: B:254:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:256:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:258:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:260:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:264:0x04c9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        boolean z10;
        AccessibilityNodeInfo accessibilityNodeInfo;
        y1.b bVar;
        androidx.compose.ui.node.a aVarD;
        y1.j jVarN;
        Object obj;
        ClipDescription primaryClipDescription;
        androidx.lifecycle.w wVar;
        androidx.lifecycle.r lifecycle;
        p0 p0Var = this.f15054a;
        w wVar2 = p0Var.f15195d;
        q viewTreeOwners = wVar2.getViewTreeOwners();
        if (((viewTreeOwners == null || (wVar = viewTreeOwners.f15215a) == null || (lifecycle = wVar.getLifecycle()) == null) ? null : lifecycle.b()) == androidx.lifecycle.q.f2169a) {
            accessibilityNodeInfo = null;
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            c3.k kVar = new c3.k(accessibilityNodeInfoObtain);
            s2 s2Var = (s2) p0Var.r().get(Integer.valueOf(i10));
            if (s2Var == null) {
                accessibilityNodeInfo = null;
            } else {
                y1.o oVar = s2Var.f15289a;
                if (i10 == -1) {
                    Field field = b3.q0.f2670a;
                    Object objF = b3.b0.f(wVar2);
                    View view = objF instanceof View ? (View) objF : null;
                    kVar.f2943b = -1;
                    accessibilityNodeInfoObtain.setParent(view);
                } else {
                    y1.o oVarI = oVar.i();
                    Integer numValueOf = oVarI != null ? Integer.valueOf(oVarI.f16801g) : null;
                    if (numValueOf == null) {
                        throw new IllegalStateException(l.q.h("semanticsNode ", i10, " has null parent").toString());
                    }
                    int iIntValue = numValueOf.intValue();
                    int i11 = iIntValue != wVar2.getSemanticsOwner().a().f16801g ? iIntValue : -1;
                    kVar.f2943b = i11;
                    accessibilityNodeInfoObtain.setParent(wVar2, i11);
                }
                kVar.f2944c = i10;
                accessibilityNodeInfoObtain.setSource(wVar2, i10);
                accessibilityNodeInfoObtain.setBoundsInScreen(p0Var.j(s2Var));
                kVar.g("android.view.View");
                y1.g gVar = (y1.g) o1.s.J(oVar.f16798d, y1.r.f16834s);
                androidx.compose.ui.node.a aVar = oVar.f16797c;
                y1.j jVar = oVar.f16798d;
                if (gVar != null && (oVar.f16799e || oVar.g(false, true).isEmpty())) {
                    int i12 = gVar.f16757a;
                    if (y1.g.a(i12, 4)) {
                        c3.f.c(accessibilityNodeInfoObtain).putCharSequence("AccessibilityNodeInfo.roleDescription", wVar2.getContext().getResources().getString(R.string.tab));
                    } else if (y1.g.a(i12, 2)) {
                        c3.f.c(accessibilityNodeInfoObtain).putCharSequence("AccessibilityNodeInfo.roleDescription", wVar2.getContext().getResources().getString(R.string.switch_role));
                    } else {
                        String strC = r0.c(i12);
                        if (!y1.g.a(i12, 5) || ((!oVar.f16799e && oVar.g(false, true).isEmpty() && o1.s.v(aVar, y1.n.f16791b) == null) || jVar.f16787b)) {
                            kVar.g(strC);
                        }
                    }
                }
                if (jVar.f16786a.containsKey(y1.i.f16768h)) {
                    kVar.g("android.widget.EditText");
                }
                if (oVar.h().f16786a.containsKey(y1.r.f16836u)) {
                    kVar.g("android.widget.TextView");
                }
                accessibilityNodeInfoObtain.setPackageName(wVar2.getContext().getPackageName());
                accessibilityNodeInfoObtain.setImportantForAccessibility(r0.g(oVar));
                List listG = oVar.g(false, true);
                int size = listG.size();
                for (int i13 = 0; i13 < size; i13++) {
                    y1.o oVar2 = (y1.o) listG.get(i13);
                    if (p0Var.r().containsKey(Integer.valueOf(oVar2.f16801g))) {
                        a7.a.w(wVar2.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(oVar2.f16797c));
                        accessibilityNodeInfoObtain.addChild(wVar2, oVar2.f16801g);
                    }
                }
                int i14 = p0Var.f15204t;
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f2942a;
                if (i10 == i14) {
                    accessibilityNodeInfo2.setAccessibilityFocused(true);
                    kVar.b(c3.e.f2932d);
                } else {
                    accessibilityNodeInfo2.setAccessibilityFocused(false);
                    kVar.b(c3.e.f2931c);
                }
                accessibilityNodeInfoObtain.setText(p0Var.u(oVar));
                y1.u uVar = y1.r.D;
                LinkedHashMap linkedHashMap = jVar.f16786a;
                if (linkedHashMap.containsKey(uVar)) {
                    accessibilityNodeInfoObtain.setContentInvalid(true);
                    Object obj2 = linkedHashMap.get(uVar);
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    accessibilityNodeInfoObtain.setError((CharSequence) obj2);
                }
                String strT = p0Var.t(oVar);
                if (Build.VERSION.SDK_INT >= 30) {
                    c3.g.c(accessibilityNodeInfo2, strT);
                } else {
                    c3.f.c(accessibilityNodeInfo2).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strT);
                }
                accessibilityNodeInfoObtain.setCheckable(p0.s(oVar));
                Object obj3 = linkedHashMap.get(y1.r.B);
                if (obj3 == null) {
                    obj3 = null;
                }
                z1.a aVar2 = (z1.a) obj3;
                if (aVar2 != null) {
                    if (aVar2 == z1.a.f17192a) {
                        accessibilityNodeInfo2.setChecked(true);
                    } else if (aVar2 == z1.a.f17193b) {
                        accessibilityNodeInfo2.setChecked(false);
                    }
                }
                Object obj4 = linkedHashMap.get(y1.r.A);
                if (obj4 == null) {
                    obj4 = null;
                }
                Boolean bool = (Boolean) obj4;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    if (gVar != null && y1.g.a(gVar.f16757a, 4)) {
                        accessibilityNodeInfoObtain.setSelected(zBooleanValue);
                    } else {
                        accessibilityNodeInfo2.setChecked(zBooleanValue);
                    }
                }
                if (!jVar.f16787b || oVar.g(false, true).isEmpty()) {
                    List list = (List) o1.s.J(jVar, y1.r.f16816a);
                    accessibilityNodeInfoObtain.setContentDescription(list != null ? (String) r8.p.H0(list) : null);
                }
                Object obj5 = linkedHashMap.get(y1.r.f16835t);
                if (obj5 == null) {
                    obj5 = null;
                }
                String str = (String) obj5;
                if (str != null) {
                    for (y1.o oVarI2 = oVar; oVarI2 != null; oVarI2 = oVarI2.i()) {
                        y1.u uVar2 = y1.s.f16842a;
                        y1.j jVar2 = oVarI2.f16798d;
                        if (jVar2.f16786a.containsKey(uVar2)) {
                            if (!((Boolean) jVar2.e(uVar2)).booleanValue()) {
                                break;
                            }
                            accessibilityNodeInfoObtain.setViewIdResourceName(str);
                            break;
                        }
                    }
                }
                Object obj6 = linkedHashMap.get(y1.r.f16823h);
                if (obj6 == null) {
                    obj6 = null;
                }
                if (((q8.l) obj6) != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo2.setHeading(true);
                    } else {
                        Bundle bundleC = c3.f.c(accessibilityNodeInfo2);
                        if (bundleC != null) {
                            bundleC.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (bundleC.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | 2);
                        }
                    }
                }
                accessibilityNodeInfoObtain.setPassword(oVar.h().f16786a.containsKey(y1.r.C));
                y1.u uVar3 = y1.i.f16768h;
                accessibilityNodeInfoObtain.setEditable(linkedHashMap.containsKey(uVar3));
                accessibilityNodeInfoObtain.setEnabled(r0.a(oVar));
                y1.u uVar4 = y1.r.f16826k;
                accessibilityNodeInfoObtain.setFocusable(linkedHashMap.containsKey(uVar4));
                if (accessibilityNodeInfoObtain.isFocusable()) {
                    accessibilityNodeInfoObtain.setFocused(((Boolean) jVar.e(uVar4)).booleanValue());
                    if (accessibilityNodeInfoObtain.isFocused()) {
                        kVar.a(2);
                    } else {
                        kVar.a(1);
                    }
                }
                t1.c1 c1VarC = oVar.c();
                if (c1VarC != null && c1VarC.Q0()) {
                    z10 = false;
                } else if (jVar.f16786a.containsKey(y1.r.f16828m)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                accessibilityNodeInfoObtain.setVisibleToUser(z10);
                Object obj7 = linkedHashMap.get(y1.r.f16825j);
                if (obj7 == null) {
                    obj7 = null;
                }
                y1.e eVar = (y1.e) obj7;
                if (eVar != null) {
                    int i15 = eVar.f16752a;
                    accessibilityNodeInfoObtain.setLiveRegion((i15 != 0 && i15 == 1) ? 2 : 1);
                }
                accessibilityNodeInfo2.setClickable(false);
                Object obj8 = linkedHashMap.get(y1.i.f16762b);
                if (obj8 == null) {
                    obj8 = null;
                }
                y1.a aVar3 = (y1.a) obj8;
                if (aVar3 != null) {
                    Object obj9 = linkedHashMap.get(y1.r.A);
                    if (obj9 == null) {
                        obj9 = null;
                    }
                    boolean zD = d7.a.d(obj9, Boolean.TRUE);
                    accessibilityNodeInfo2.setClickable(!zD);
                    if (r0.a(oVar) && !zD) {
                        kVar.b(new c3.e(null, 16, aVar3.f16745a, null));
                    }
                }
                accessibilityNodeInfo2.setLongClickable(false);
                Object obj10 = linkedHashMap.get(y1.i.f16763c);
                if (obj10 == null) {
                    obj10 = null;
                }
                y1.a aVar4 = (y1.a) obj10;
                if (aVar4 != null) {
                    accessibilityNodeInfo2.setLongClickable(true);
                    if (r0.a(oVar)) {
                        kVar.b(new c3.e(null, 32, aVar4.f16745a, null));
                    }
                }
                Object obj11 = linkedHashMap.get(y1.i.f16774n);
                if (obj11 == null) {
                    obj11 = null;
                }
                y1.a aVar5 = (y1.a) obj11;
                if (aVar5 != null) {
                    kVar.b(new c3.e(null, 16384, aVar5.f16745a, null));
                }
                if (r0.a(oVar)) {
                    Object obj12 = linkedHashMap.get(uVar3);
                    if (obj12 == null) {
                        obj12 = null;
                    }
                    y1.a aVar6 = (y1.a) obj12;
                    if (aVar6 != null) {
                        kVar.b(new c3.e(null, 2097152, aVar6.f16745a, null));
                    }
                    Object obj13 = linkedHashMap.get(y1.i.f16773m);
                    if (obj13 == null) {
                        obj13 = null;
                    }
                    y1.a aVar7 = (y1.a) obj13;
                    if (aVar7 != null) {
                        kVar.b(new c3.e(null, android.R.id.accessibilityActionImeEnter, aVar7.f16745a, null));
                    }
                    Object obj14 = linkedHashMap.get(y1.i.f16775o);
                    if (obj14 == null) {
                        obj14 = null;
                    }
                    y1.a aVar8 = (y1.a) obj14;
                    if (aVar8 != null) {
                        kVar.b(new c3.e(null, 65536, aVar8.f16745a, null));
                    }
                    Object obj15 = linkedHashMap.get(y1.i.f16776p);
                    if (obj15 == null) {
                        obj15 = null;
                    }
                    y1.a aVar9 = (y1.a) obj15;
                    if (aVar9 != null && accessibilityNodeInfoObtain.isFocused() && (primaryClipDescription = wVar2.m8439getClipboardManager().f15156a.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
                        kVar.b(new c3.e(null, 32768, aVar9.f16745a, null));
                    }
                }
                String strV = p0.v(oVar);
                if (strV != null && strV.length() != 0) {
                    accessibilityNodeInfoObtain.setTextSelection(p0Var.q(oVar), p0Var.p(oVar));
                    Object obj16 = linkedHashMap.get(y1.i.f16767g);
                    if (obj16 == null) {
                        obj16 = null;
                    }
                    y1.a aVar10 = (y1.a) obj16;
                    kVar.b(new c3.e(null, 131072, aVar10 != null ? aVar10.f16745a : null, null));
                    kVar.a(256);
                    kVar.a(512);
                    accessibilityNodeInfo2.setMovementGranularities(11);
                    Object obj17 = linkedHashMap.get(y1.r.f16816a);
                    if (obj17 == null) {
                        obj17 = null;
                    }
                    List list2 = (List) obj17;
                    if ((list2 == null || list2.isEmpty()) && linkedHashMap.containsKey(y1.i.f16761a)) {
                        if (linkedHashMap.containsKey(uVar3)) {
                            Object obj18 = linkedHashMap.get(uVar4);
                            if (obj18 == null) {
                                obj18 = null;
                            }
                            if (d7.a.d(obj18, Boolean.TRUE)) {
                                aVarD = r0.d(aVar, s.f15265f);
                                if (aVarD == null) {
                                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                } else {
                                    jVarN = aVarD.n();
                                    if (jVarN != null) {
                                        obj = jVarN.f16786a.get(uVar4);
                                        if (obj == null) {
                                            obj = null;
                                        }
                                        if (d7.a.d(obj, Boolean.TRUE)) {
                                            accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                        }
                                    }
                                }
                            }
                        } else {
                            aVarD = r0.d(aVar, s.f15265f);
                            if (aVarD == null) {
                                accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                            } else {
                                jVarN = aVarD.n();
                                if (jVarN != null) {
                                    obj = jVarN.f16786a.get(uVar4);
                                    if (obj == null) {
                                        obj = null;
                                    }
                                    if (d7.a.d(obj, Boolean.TRUE)) {
                                        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add("androidx.compose.ui.semantics.id");
                CharSequence charSequenceF = kVar.f();
                if (charSequenceF != null && charSequenceF.length() != 0 && linkedHashMap.containsKey(y1.i.f16761a)) {
                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                }
                if (linkedHashMap.containsKey(y1.r.f16835t)) {
                    arrayList.add("androidx.compose.ui.semantics.testTag");
                }
                j.f15117a.a(accessibilityNodeInfoObtain, arrayList);
                Object obj19 = linkedHashMap.get(y1.r.f16818c);
                if (obj19 == null) {
                    obj19 = null;
                }
                y1.f fVar = (y1.f) obj19;
                if (fVar != null) {
                    y1.u uVar5 = y1.i.f16766f;
                    if (linkedHashMap.containsKey(uVar5)) {
                        kVar.g("android.widget.SeekBar");
                    } else {
                        kVar.g("android.widget.ProgressBar");
                    }
                    y1.f fVar2 = y1.f.f16753d;
                    float f10 = fVar.f16754a;
                    i9.d dVar = fVar.f16755b;
                    if (fVar != fVar2) {
                        accessibilityNodeInfoObtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(dVar.f8181a).floatValue(), Float.valueOf(dVar.f8182b).floatValue(), f10));
                    }
                    if (linkedHashMap.containsKey(uVar5) && r0.a(oVar)) {
                        float fFloatValue = Float.valueOf(dVar.f8182b).floatValue();
                        float f11 = dVar.f8181a;
                        if (f10 < z6.a.m(fFloatValue, Float.valueOf(f11).floatValue())) {
                            kVar.b(c3.e.f2933e);
                        }
                        if (f10 > z6.a.o(Float.valueOf(f11).floatValue(), Float.valueOf(dVar.f8182b).floatValue())) {
                            kVar.b(c3.e.f2934f);
                        }
                    }
                }
                a0.a(kVar, oVar);
                y1.b bVar2 = (y1.b) o1.s.J(oVar.h(), y1.r.f16821f);
                if (bVar2 != null) {
                    accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar2.f16747a, bVar2.f16748b, false, 0));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    if (o1.s.J(oVar.h(), y1.r.f16820e) != null) {
                        List listG2 = oVar.g(false, true);
                        int size2 = listG2.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            y1.o oVar3 = (y1.o) listG2.get(i16);
                            int i17 = size2;
                            if (oVar3.h().f16786a.containsKey(y1.r.A)) {
                                arrayList2.add(oVar3);
                            }
                            i16++;
                            size2 = i17;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        boolean zK = o1.s.k(arrayList2);
                        accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zK ? 1 : arrayList2.size(), zK ? arrayList2.size() : 1, false, 0));
                    }
                }
                a7.a.w(o1.s.J(oVar.h(), y1.r.f16822g));
                y1.o oVarI3 = oVar.i();
                if (oVarI3 != null && o1.s.J(oVarI3.h(), y1.r.f16820e) != null && ((bVar = (y1.b) o1.s.J(oVarI3.h(), y1.r.f16821f)) == null || (bVar.f16747a >= 0 && bVar.f16748b >= 0))) {
                    if (oVar.h().f16786a.containsKey(y1.r.A)) {
                        ArrayList arrayList3 = new ArrayList();
                        List listG3 = oVarI3.g(false, true);
                        int size3 = listG3.size();
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < size3) {
                            y1.o oVar4 = (y1.o) listG3.get(i18);
                            List list3 = listG3;
                            int i20 = size3;
                            if (oVar4.h().f16786a.containsKey(y1.r.A)) {
                                arrayList3.add(oVar4);
                                if (oVar4.f16797c.r() < aVar.r()) {
                                    i19++;
                                }
                            }
                            i18++;
                            listG3 = list3;
                            size3 = i20;
                        }
                        if (!arrayList3.isEmpty()) {
                            boolean zK2 = o1.s.k(arrayList3);
                            int i21 = zK2 ? 0 : i19;
                            int i22 = zK2 ? i19 : 0;
                            Object obj20 = oVar.h().f16786a.get(y1.r.A);
                            Object obj21 = obj20;
                            if (obj20 == null) {
                                obj21 = Boolean.FALSE;
                            }
                            accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i21, 1, i22, 1, false, ((Boolean) obj21).booleanValue()));
                        }
                    }
                }
                Object obj22 = linkedHashMap.get(y1.r.f16830o);
                if (obj22 == null) {
                    obj22 = null;
                }
                y1.h hVar = (y1.h) obj22;
                Object obj23 = linkedHashMap.get(y1.i.f16764d);
                if (obj23 == null) {
                    obj23 = null;
                }
                y1.a aVar11 = (y1.a) obj23;
                if (hVar != null && aVar11 != null) {
                    if (o1.s.J(oVar.h(), y1.r.f16821f) == null && o1.s.J(oVar.h(), y1.r.f16820e) == null) {
                        kVar.g("android.widget.HorizontalScrollView");
                    }
                    if (((Number) hVar.f16759b.invoke()).floatValue() > 0.0f) {
                        accessibilityNodeInfo2.setScrollable(true);
                    }
                    if (r0.a(oVar)) {
                        boolean zD2 = p0.D(hVar);
                        m2.l lVar = m2.l.f11816b;
                        if (zD2) {
                            kVar.b(c3.e.f2933e);
                            kVar.b(aVar.f1753y == lVar ? c3.e.f2936h : c3.e.f2938j);
                        }
                        if (p0.C(hVar)) {
                            kVar.b(c3.e.f2934f);
                            kVar.b(aVar.f1753y == lVar ? c3.e.f2938j : c3.e.f2936h);
                        }
                    }
                }
                Object obj24 = linkedHashMap.get(y1.r.f16831p);
                if (obj24 == null) {
                    obj24 = null;
                }
                y1.h hVar2 = (y1.h) obj24;
                if (hVar2 != null && aVar11 != null) {
                    if (o1.s.J(oVar.h(), y1.r.f16821f) == null && o1.s.J(oVar.h(), y1.r.f16820e) == null) {
                        kVar.g("android.widget.ScrollView");
                    }
                    if (((Number) hVar2.f16759b.invoke()).floatValue() > 0.0f) {
                        accessibilityNodeInfo2.setScrollable(true);
                    }
                    if (r0.a(oVar)) {
                        if (p0.D(hVar2)) {
                            kVar.b(c3.e.f2933e);
                            kVar.b(c3.e.f2937i);
                        }
                        if (p0.C(hVar2)) {
                            kVar.b(c3.e.f2934f);
                            kVar.b(c3.e.f2935g);
                        }
                    }
                }
                int i23 = Build.VERSION.SDK_INT;
                if (i23 >= 29) {
                    b0.a(kVar, oVar);
                }
                Object obj25 = linkedHashMap.get(y1.r.f16819d);
                if (obj25 == null) {
                    obj25 = null;
                }
                CharSequence charSequence = (CharSequence) obj25;
                if (i23 >= 28) {
                    accessibilityNodeInfo2.setPaneTitle(charSequence);
                } else {
                    c3.f.c(accessibilityNodeInfo2).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                }
                if (r0.a(oVar)) {
                    Object obj26 = linkedHashMap.get(y1.i.f16777q);
                    if (obj26 == null) {
                        obj26 = null;
                    }
                    y1.a aVar12 = (y1.a) obj26;
                    if (aVar12 != null) {
                        kVar.b(new c3.e(null, 262144, aVar12.f16745a, null));
                    }
                    Object obj27 = linkedHashMap.get(y1.i.f16778r);
                    if (obj27 == null) {
                        obj27 = null;
                    }
                    y1.a aVar13 = (y1.a) obj27;
                    if (aVar13 != null) {
                        kVar.b(new c3.e(null, 524288, aVar13.f16745a, null));
                    }
                    Object obj28 = linkedHashMap.get(y1.i.f16779s);
                    if (obj28 == null) {
                        obj28 = null;
                    }
                    y1.a aVar14 = (y1.a) obj28;
                    if (aVar14 != null) {
                        kVar.b(new c3.e(null, 1048576, aVar14.f16745a, null));
                    }
                    y1.u uVar6 = y1.i.f16781u;
                    if (linkedHashMap.containsKey(uVar6)) {
                        List list4 = (List) jVar.e(uVar6);
                        if (list4.size() >= 32) {
                            throw new IllegalStateException("Can't have more than 32 custom actions for one widget");
                        }
                        q.a0 a0Var = new q.a0(0);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        q.a0 a0Var2 = p0Var.f15210z;
                        if (r.a.a(a0Var2.f12977c, i10, a0Var2.f12975a) >= 0) {
                            Map map = (Map) a0Var2.c(i10);
                            ArrayList arrayListY = b9.b.Y(p0.X);
                            ArrayList arrayList4 = new ArrayList();
                            if (list4.size() > 0) {
                                a7.a.w(list4.get(0));
                                d7.a.j(map);
                                throw null;
                            }
                            if (arrayList4.size() > 0) {
                                a7.a.w(arrayList4.get(0));
                                ((Number) arrayListY.get(0)).intValue();
                                throw null;
                            }
                        } else if (list4.size() > 0) {
                            a7.a.w(list4.get(0));
                            throw null;
                        }
                        p0Var.f15209y.d(i10, a0Var);
                        a0Var2.d(i10, linkedHashMap2);
                    }
                }
                boolean zY = p0Var.y(oVar);
                if (i23 >= 28) {
                    accessibilityNodeInfo2.setScreenReaderFocusable(zY);
                } else {
                    Bundle bundleC2 = c3.f.c(accessibilityNodeInfo2);
                    if (bundleC2 != null) {
                        bundleC2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (zY ? 1 : 0) | (bundleC2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                    }
                }
                Integer num = (Integer) p0Var.L.get(Integer.valueOf(i10));
                if (num != null) {
                    num.intValue();
                    r0.h(wVar2.getAndroidViewsHandler$ui_release(), num.intValue());
                    accessibilityNodeInfoObtain.setTraversalBefore(wVar2, num.intValue());
                    p0Var.i(i10, accessibilityNodeInfoObtain, p0Var.N, null);
                }
                Integer num2 = (Integer) p0Var.M.get(Integer.valueOf(i10));
                if (num2 != null) {
                    num2.intValue();
                    r0.h(wVar2.getAndroidViewsHandler$ui_release(), num2.intValue());
                }
                accessibilityNodeInfo = accessibilityNodeInfo2;
            }
        }
        if (p0Var.f15206v && i10 == p0Var.f15204t) {
            p0Var.f15205u = accessibilityNodeInfo;
        }
        return accessibilityNodeInfo;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        return createAccessibilityNodeInfo(this.f15054a.f15204t);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:237:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:240:0x0408  */
    /* JADX WARN: Code duplicated, block: B:242:0x0412  */
    /* JADX WARN: Code duplicated, block: B:263:0x0450  */
    /* JADX WARN: Code duplicated, block: B:265:0x0458  */
    /* JADX WARN: Code duplicated, block: B:266:0x045a  */
    /* JADX WARN: Code duplicated, block: B:269:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:272:0x0467 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:273:0x0469  */
    /* JADX WARN: Code duplicated, block: B:276:0x046e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0475  */
    /* JADX WARN: Code duplicated, block: B:350:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:407:0x06aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:409:0x06ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0169 -> B:83:0x016a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:83:0x016a
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int r20, int r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 1880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.c0.performAction(int, int, android.os.Bundle):boolean");
    }
}
