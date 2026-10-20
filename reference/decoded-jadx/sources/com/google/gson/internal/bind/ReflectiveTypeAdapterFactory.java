package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p7.a0;
import p7.b0;
import p7.q;
import r7.t;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.h f3957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7.i f3958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Excluder f3959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f3960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3961e;

    public ReflectiveTypeAdapterFactory(r7.h hVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        p7.a aVar = p7.h.f12827a;
        this.f3957a = hVar;
        this.f3958b = aVar;
        this.f3959c = excluder;
        this.f3960d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f3961e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!t.f13641a.a(obj, accessibleObject)) {
            throw new q(l.q.j(t7.c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // p7.b0
    public final a0 a(p7.n nVar, u7.a aVar) {
        Class cls = aVar.f15425a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        z6.a.F(this.f3961e);
        return t7.c.f14667a.Q(cls) ? new k(cls, c(nVar, aVar, cls, true)) : new j(this.f3957a.b(aVar), c(nVar, aVar, cls, false));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:64:0x012d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:67:0x013d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:70:0x0144  */
    /* JADX WARN: Code duplicated, block: B:73:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01c1 A[SYNTHETIC] */
    public final LinkedHashMap c(p7.n nVar, u7.a aVar, Class cls, boolean z10) {
        boolean z11;
        Method method;
        Type typeF;
        q7.b bVar;
        String strValue;
        String[] strArrAlternate;
        List listSingletonList;
        List list;
        int size;
        h hVar;
        boolean z12;
        int i10;
        List list2;
        Field field;
        int i11;
        int i12;
        Field[] fieldArr;
        Class cls2;
        u7.a aVar2;
        LinkedHashMap linkedHashMap;
        h hVar2;
        boolean z13;
        boolean z14;
        u7.a aVar3;
        Class cls3;
        boolean z15;
        int modifiers;
        boolean z16;
        q7.a aVar4;
        a0 a0VarC;
        boolean z17;
        h hVar3;
        h hVar4;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap2;
        }
        u7.a aVar5 = aVar;
        Class cls4 = cls;
        while (cls4 != Object.class) {
            Field[] declaredFields = cls4.getDeclaredFields();
            if (cls4 != cls && declaredFields.length > 0) {
                z6.a.F(this.f3961e);
            }
            int length = declaredFields.length;
            boolean z18 = false;
            int i13 = 0;
            while (i13 < length) {
                Field field2 = declaredFields[i13];
                boolean zD = this.d(field2, true);
                boolean zD2 = this.d(field2, z18);
                if (zD || zD2) {
                    if (z10) {
                        if (Modifier.isStatic(field2.getModifiers())) {
                            z11 = z18;
                        } else {
                            Method methodX = t7.c.f14667a.x(cls4, field2);
                            t7.c.e(methodX);
                            if (methodX.getAnnotation(q7.b.class) != null && field2.getAnnotation(q7.b.class) == null) {
                                throw new q(l.q.k("@SerializedName on ", t7.c.d(methodX, z18), " is not supported"));
                            }
                            z11 = zD2;
                            method = methodX;
                        }
                        if (method == null) {
                            t7.c.e(field2);
                        }
                        typeF = r7.d.f(aVar5.f15426b, cls4, field2.getGenericType(), new HashMap());
                        bVar = (q7.b) field2.getAnnotation(q7.b.class);
                        if (bVar == null) {
                            listSingletonList = Collections.singletonList(this.f3958b.a(field2));
                        } else {
                            strValue = bVar.value();
                            strArrAlternate = bVar.alternate();
                            if (strArrAlternate.length == 0) {
                                listSingletonList = Collections.singletonList(strValue);
                            } else {
                                ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                                arrayList.add(strValue);
                                Collections.addAll(arrayList, strArrAlternate);
                                list = arrayList;
                            }
                            size = list.size();
                            hVar = null;
                            z12 = zD;
                            i10 = 0;
                            list2 = list;
                            while (i10 < size) {
                                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                String str = (String) list2.get(i10);
                                if (i10 != 0) {
                                    z14 = false;
                                } else {
                                    z14 = z12;
                                }
                                aVar3 = new u7.a(typeF);
                                cls3 = aVar3.f15425a;
                                int i14 = i10;
                                if ((cls3 instanceof Class) || !cls3.isPrimitive()) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                modifiers = field2.getModifiers();
                                if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                aVar4 = (q7.a) field2.getAnnotation(q7.a.class);
                                if (aVar4 != null) {
                                    this.f3960d.getClass();
                                    a0VarC = JsonAdapterAnnotationTypeAdapterFactory.b(this.f3957a, nVar, aVar3, aVar4);
                                } else {
                                    a0VarC = null;
                                }
                                if (a0VarC != null) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (a0VarC == null) {
                                    a0VarC = nVar.c(aVar3);
                                }
                                int i15 = size;
                                List list3 = list2;
                                Field field3 = field2;
                                int i16 = i13;
                                Type type = typeF;
                                boolean z19 = z17;
                                int i17 = length;
                                Field[] fieldArr2 = declaredFields;
                                Class cls5 = cls4;
                                u7.a aVar6 = aVar5;
                                hVar3 = (h) linkedHashMap3.put(str, new h(str, field2, z14, z11, false, method, z19, a0VarC, nVar, aVar3, z15, z16));
                                hVar4 = hVar;
                                if (hVar4 == null) {
                                    hVar = hVar3;
                                } else {
                                    hVar = hVar4;
                                }
                                i10 = i14 + 1;
                                this = this;
                                cls4 = cls5;
                                linkedHashMap2 = linkedHashMap3;
                                aVar5 = aVar6;
                                z12 = z14;
                                length = i17;
                                declaredFields = fieldArr2;
                                size = i15;
                                list2 = list3;
                                field2 = field3;
                                i13 = i16;
                                typeF = type;
                                nVar = nVar;
                            }
                            field = field2;
                            i11 = i13;
                            i12 = length;
                            fieldArr = declaredFields;
                            cls2 = cls4;
                            aVar2 = aVar5;
                            linkedHashMap = linkedHashMap2;
                            hVar2 = hVar;
                            z13 = false;
                            if (hVar2 == null) {
                                throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + hVar2.f3991a + "'; conflict is caused by fields " + t7.c.c(hVar2.f3992b) + " and " + t7.c.c(field));
                            }
                        }
                        list = listSingletonList;
                        size = list.size();
                        hVar = null;
                        z12 = zD;
                        i10 = 0;
                        list2 = list;
                        while (i10 < size) {
                            LinkedHashMap linkedHashMap4 = linkedHashMap2;
                            String str2 = (String) list2.get(i10);
                            if (i10 != 0) {
                                z14 = false;
                            } else {
                                z14 = z12;
                            }
                            aVar3 = new u7.a(typeF);
                            cls3 = aVar3.f15425a;
                            int i18 = i10;
                            if (cls3 instanceof Class) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            modifiers = field2.getModifiers();
                            if (Modifier.isStatic(modifiers)) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            aVar4 = (q7.a) field2.getAnnotation(q7.a.class);
                            if (aVar4 != null) {
                                this.f3960d.getClass();
                                a0VarC = JsonAdapterAnnotationTypeAdapterFactory.b(this.f3957a, nVar, aVar3, aVar4);
                            } else {
                                a0VarC = null;
                            }
                            if (a0VarC != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (a0VarC == null) {
                                a0VarC = nVar.c(aVar3);
                            }
                            int i19 = size;
                            List list4 = list2;
                            Field field4 = field2;
                            int i110 = i13;
                            Type type2 = typeF;
                            boolean z110 = z17;
                            int i111 = length;
                            Field[] fieldArr3 = declaredFields;
                            Class cls6 = cls4;
                            u7.a aVar7 = aVar5;
                            hVar3 = (h) linkedHashMap4.put(str2, new h(str2, field2, z14, z11, false, method, z110, a0VarC, nVar, aVar3, z15, z16));
                            hVar4 = hVar;
                            if (hVar4 == null) {
                                hVar = hVar3;
                            } else {
                                hVar = hVar4;
                            }
                            i10 = i18 + 1;
                            this = this;
                            cls4 = cls6;
                            linkedHashMap2 = linkedHashMap4;
                            aVar5 = aVar7;
                            z12 = z14;
                            length = i111;
                            declaredFields = fieldArr3;
                            size = i19;
                            list2 = list4;
                            field2 = field4;
                            i13 = i110;
                            typeF = type2;
                            nVar = nVar;
                        }
                        field = field2;
                        i11 = i13;
                        i12 = length;
                        fieldArr = declaredFields;
                        cls2 = cls4;
                        aVar2 = aVar5;
                        linkedHashMap = linkedHashMap2;
                        hVar2 = hVar;
                        z13 = false;
                        if (hVar2 == null) {
                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + hVar2.f3991a + "'; conflict is caused by fields " + t7.c.c(hVar2.f3992b) + " and " + t7.c.c(field));
                        }
                    } else {
                        z11 = zD2;
                    }
                    method = null;
                    if (method == null) {
                        t7.c.e(field2);
                    }
                    typeF = r7.d.f(aVar5.f15426b, cls4, field2.getGenericType(), new HashMap());
                    bVar = (q7.b) field2.getAnnotation(q7.b.class);
                    if (bVar == null) {
                        listSingletonList = Collections.singletonList(this.f3958b.a(field2));
                    } else {
                        strValue = bVar.value();
                        strArrAlternate = bVar.alternate();
                        if (strArrAlternate.length == 0) {
                            listSingletonList = Collections.singletonList(strValue);
                        } else {
                            ArrayList arrayList2 = new ArrayList(strArrAlternate.length + 1);
                            arrayList2.add(strValue);
                            Collections.addAll(arrayList2, strArrAlternate);
                            list = arrayList2;
                        }
                        size = list.size();
                        hVar = null;
                        z12 = zD;
                        i10 = 0;
                        list2 = list;
                        while (i10 < size) {
                            LinkedHashMap linkedHashMap5 = linkedHashMap2;
                            String str3 = (String) list2.get(i10);
                            if (i10 != 0) {
                                z14 = false;
                            } else {
                                z14 = z12;
                            }
                            aVar3 = new u7.a(typeF);
                            cls3 = aVar3.f15425a;
                            int i112 = i10;
                            if (cls3 instanceof Class) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            modifiers = field2.getModifiers();
                            if (Modifier.isStatic(modifiers)) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            aVar4 = (q7.a) field2.getAnnotation(q7.a.class);
                            if (aVar4 != null) {
                                this.f3960d.getClass();
                                a0VarC = JsonAdapterAnnotationTypeAdapterFactory.b(this.f3957a, nVar, aVar3, aVar4);
                            } else {
                                a0VarC = null;
                            }
                            if (a0VarC != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (a0VarC == null) {
                                a0VarC = nVar.c(aVar3);
                            }
                            int i113 = size;
                            List list5 = list2;
                            Field field5 = field2;
                            int i114 = i13;
                            Type type3 = typeF;
                            boolean z111 = z17;
                            int i115 = length;
                            Field[] fieldArr4 = declaredFields;
                            Class cls7 = cls4;
                            u7.a aVar8 = aVar5;
                            hVar3 = (h) linkedHashMap5.put(str3, new h(str3, field2, z14, z11, false, method, z111, a0VarC, nVar, aVar3, z15, z16));
                            hVar4 = hVar;
                            if (hVar4 == null) {
                                hVar = hVar3;
                            } else {
                                hVar = hVar4;
                            }
                            i10 = i112 + 1;
                            this = this;
                            cls4 = cls7;
                            linkedHashMap2 = linkedHashMap5;
                            aVar5 = aVar8;
                            z12 = z14;
                            length = i115;
                            declaredFields = fieldArr4;
                            size = i113;
                            list2 = list5;
                            field2 = field5;
                            i13 = i114;
                            typeF = type3;
                            nVar = nVar;
                        }
                        field = field2;
                        i11 = i13;
                        i12 = length;
                        fieldArr = declaredFields;
                        cls2 = cls4;
                        aVar2 = aVar5;
                        linkedHashMap = linkedHashMap2;
                        hVar2 = hVar;
                        z13 = false;
                        if (hVar2 == null) {
                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + hVar2.f3991a + "'; conflict is caused by fields " + t7.c.c(hVar2.f3992b) + " and " + t7.c.c(field));
                        }
                    }
                    list = listSingletonList;
                    size = list.size();
                    hVar = null;
                    z12 = zD;
                    i10 = 0;
                    list2 = list;
                    while (i10 < size) {
                        LinkedHashMap linkedHashMap6 = linkedHashMap2;
                        String str4 = (String) list2.get(i10);
                        if (i10 != 0) {
                            z14 = false;
                        } else {
                            z14 = z12;
                        }
                        aVar3 = new u7.a(typeF);
                        cls3 = aVar3.f15425a;
                        int i116 = i10;
                        if (cls3 instanceof Class) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        modifiers = field2.getModifiers();
                        if (Modifier.isStatic(modifiers)) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        aVar4 = (q7.a) field2.getAnnotation(q7.a.class);
                        if (aVar4 != null) {
                            this.f3960d.getClass();
                            a0VarC = JsonAdapterAnnotationTypeAdapterFactory.b(this.f3957a, nVar, aVar3, aVar4);
                        } else {
                            a0VarC = null;
                        }
                        if (a0VarC != null) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (a0VarC == null) {
                            a0VarC = nVar.c(aVar3);
                        }
                        int i117 = size;
                        List list6 = list2;
                        Field field6 = field2;
                        int i118 = i13;
                        Type type4 = typeF;
                        boolean z112 = z17;
                        int i119 = length;
                        Field[] fieldArr5 = declaredFields;
                        Class cls8 = cls4;
                        u7.a aVar9 = aVar5;
                        hVar3 = (h) linkedHashMap6.put(str4, new h(str4, field2, z14, z11, false, method, z112, a0VarC, nVar, aVar3, z15, z16));
                        hVar4 = hVar;
                        if (hVar4 == null) {
                            hVar = hVar3;
                        } else {
                            hVar = hVar4;
                        }
                        i10 = i116 + 1;
                        this = this;
                        cls4 = cls8;
                        linkedHashMap2 = linkedHashMap6;
                        aVar5 = aVar9;
                        z12 = z14;
                        length = i119;
                        declaredFields = fieldArr5;
                        size = i117;
                        list2 = list6;
                        field2 = field6;
                        i13 = i118;
                        typeF = type4;
                        nVar = nVar;
                    }
                    field = field2;
                    i11 = i13;
                    i12 = length;
                    fieldArr = declaredFields;
                    cls2 = cls4;
                    aVar2 = aVar5;
                    linkedHashMap = linkedHashMap2;
                    hVar2 = hVar;
                    z13 = false;
                    if (hVar2 == null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + hVar2.f3991a + "'; conflict is caused by fields " + t7.c.c(hVar2.f3992b) + " and " + t7.c.c(field));
                    }
                } else {
                    i11 = i13;
                    z13 = z18;
                    i12 = length;
                    fieldArr = declaredFields;
                    cls2 = cls4;
                    aVar2 = aVar5;
                    linkedHashMap = linkedHashMap2;
                }
                i13 = i11 + 1;
                this = this;
                cls4 = cls2;
                linkedHashMap2 = linkedHashMap;
                aVar5 = aVar2;
                length = i12;
                declaredFields = fieldArr;
                z18 = z13;
                nVar = nVar;
            }
            Class cls9 = cls4;
            aVar5 = new u7.a(r7.d.f(aVar5.f15426b, cls9, cls9.getGenericSuperclass(), new HashMap()));
            cls4 = aVar5.f15425a;
            linkedHashMap2 = linkedHashMap2;
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    public final boolean d(Field field, boolean z10) {
        List list;
        Iterator it;
        Class<?> type;
        Class<?> type2 = field.getType();
        Excluder excluder = this.f3959c;
        if (!excluder.b(type2)) {
            excluder.c(z10);
            if ((field.getModifiers() & excluder.f3947b) == 0) {
                if (excluder.f3946a != -1.0d) {
                    q7.c cVar = (q7.c) field.getAnnotation(q7.c.class);
                    q7.d dVar = (q7.d) field.getAnnotation(q7.d.class);
                    double d10 = excluder.f3946a;
                    if ((cVar == null || d10 >= cVar.value()) && (dVar == null || d10 < dVar.value())) {
                        if (!field.isSynthetic()) {
                            if (!excluder.f3948c) {
                                type = field.getType();
                                if (type.isMemberClass() || (type.getModifiers() & 8) != 0) {
                                    if (!Excluder.d(field.getType())) {
                                        if (z10) {
                                            list = excluder.f3949d;
                                        } else {
                                            list = excluder.f3950e;
                                        }
                                        if (!list.isEmpty()) {
                                            it = list.iterator();
                                            if (it.hasNext()) {
                                                a7.a.w(it.next());
                                                throw null;
                                            }
                                        }
                                        return true;
                                    }
                                }
                            } else if (!Excluder.d(field.getType())) {
                                if (z10) {
                                    list = excluder.f3949d;
                                } else {
                                    list = excluder.f3950e;
                                }
                                if (!list.isEmpty()) {
                                    it = list.iterator();
                                    if (it.hasNext()) {
                                        a7.a.w(it.next());
                                        throw null;
                                    }
                                }
                                return true;
                            }
                        }
                    }
                } else if (!field.isSynthetic()) {
                    if (!excluder.f3948c) {
                        type = field.getType();
                        if (type.isMemberClass()) {
                            if (!Excluder.d(field.getType())) {
                                if (z10) {
                                    list = excluder.f3949d;
                                } else {
                                    list = excluder.f3950e;
                                }
                                if (!list.isEmpty()) {
                                    it = list.iterator();
                                    if (it.hasNext()) {
                                        a7.a.w(it.next());
                                        throw null;
                                    }
                                }
                                return true;
                            }
                        } else if (!Excluder.d(field.getType())) {
                            if (z10) {
                                list = excluder.f3949d;
                            } else {
                                list = excluder.f3950e;
                            }
                            if (!list.isEmpty()) {
                                it = list.iterator();
                                if (it.hasNext()) {
                                    a7.a.w(it.next());
                                    throw null;
                                }
                            }
                            return true;
                        }
                    } else if (!Excluder.d(field.getType())) {
                        if (z10) {
                            list = excluder.f3949d;
                        } else {
                            list = excluder.f3950e;
                        }
                        if (!list.isEmpty()) {
                            it = list.iterator();
                            if (it.hasNext()) {
                                a7.a.w(it.next());
                                throw null;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
