package d9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements j9.b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f4940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f4941c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4942a;

    static {
        int i10 = 0;
        List listE0 = d7.t.e0(c9.a.class, c9.c.class, c9.e.class, c9.f.class, c9.g.class, u0.a.class, u0.a.class, c9.h.class, u0.a.class, u0.a.class, u0.a.class, u0.a.class, c9.b.class, u0.a.class, u0.a.class, u0.a.class, u0.a.class, u0.a.class, u0.a.class, u0.a.class, u0.a.class, u0.a.class, c9.d.class);
        ArrayList arrayList = new ArrayList(f9.a.y0(listE0));
        for (Object obj : listE0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                d7.t.u0();
                throw null;
            }
            arrayList.add(new q8.f((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f4940b = r8.v.F0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        d7.a.l(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            d7.a.j(str);
            sb.append(l9.i.k1(str, '.', str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f4940b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z6.a.T(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, l9.i.k1(str2, '.', str2));
        }
        f4941c = linkedHashMap;
    }

    public e(Class cls) {
        d7.a.m(cls, "jClass");
        this.f4942a = cls;
    }

    @Override // d9.d
    public final Class a() {
        return this.f4942a;
    }

    public final String b() {
        String str;
        Class cls = this.f4942a;
        d7.a.m(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f4941c;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return l9.i.j1(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return l9.i.j1(simpleName, enclosingConstructor.getName() + '$');
        }
        int iO0 = l9.i.O0(simpleName, '$', 0, false, 6);
        if (iO0 == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iO0 + 1, simpleName.length());
        d7.a.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && d7.a.d(d7.t.X(this), d7.t.X((j9.b) obj));
    }

    public final int hashCode() {
        return d7.t.X(this).hashCode();
    }

    public final String toString() {
        return this.f4942a.toString() + " (Kotlin reflection is not available)";
    }
}
