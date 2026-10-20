package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f2163f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f2168e;

    public p0(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2164a = linkedHashMap;
        this.f2165b = new LinkedHashMap();
        this.f2166c = new LinkedHashMap();
        this.f2167d = new LinkedHashMap();
        this.f2168e = new o0(this, 0);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(p0 p0Var) {
        d7.a.m(p0Var, "this$0");
        Iterator it = r8.v.G0(p0Var.f2165b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = p0Var.f2164a;
            int i10 = 0;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                q8.f[] fVarArr = {new q8.f("keys", arrayList), new q8.f("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i10 < 2) {
                    q8.f fVar = fVarArr[i10];
                    String str2 = (String) fVar.f13225a;
                    Object obj = fVar.f13226b;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        d7.a.j(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        x2.c.a(bundle, str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        x2.d.a(bundle, str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        x2.d.b(bundle, str2, (SizeF) obj);
                    }
                    i10++;
                }
                return bundle;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            Bundle bundleA = ((b4.d) entry.getValue()).a();
            d7.a.m(str3, "key");
            if (bundleA != null) {
                Class[] clsArr = f2163f;
                while (true) {
                    if (i10 >= 29) {
                        throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
                    }
                    Class cls = clsArr[i10];
                    d7.a.j(cls);
                    if (cls.isInstance(bundleA)) {
                        break;
                    }
                    i10++;
                }
            }
            Object obj2 = p0Var.f2166c.get(str3);
            e0 e0Var = obj2 instanceof e0 ? (e0) obj2 : null;
            if (e0Var != null) {
                e0Var.d(bundleA);
            } else {
                linkedHashMap.put(str3, bundleA);
            }
            p9.y yVar = (p9.y) p0Var.f2167d.get(str3);
            if (yVar != null) {
                ((p9.q0) yVar).i(bundleA);
            }
        }
    }

    public p0() {
        this.f2164a = new LinkedHashMap();
        this.f2165b = new LinkedHashMap();
        this.f2166c = new LinkedHashMap();
        this.f2167d = new LinkedHashMap();
        this.f2168e = new o0(this, 1);
    }
}
