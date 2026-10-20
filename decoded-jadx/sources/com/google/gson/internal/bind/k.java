package com.google.gson.internal.bind;

import androidx.fragment.app.a0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f4006e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f4007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f4008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f4009d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f4006e = map;
    }

    public k(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f4009d = new HashMap();
        d0 d0Var = t7.c.f14667a;
        Constructor constructorZ = d0Var.z(cls);
        this.f4007b = constructorZ;
        t7.c.e(constructorZ);
        String[] strArrF = d0Var.F(cls);
        for (int i10 = 0; i10 < strArrF.length; i10++) {
            this.f4009d.put(strArrF[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f4007b.getParameterTypes();
        this.f4008c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f4008c[i11] = f4006e.get(parameterTypes[i11]);
        }
    }

    @Override // com.google.gson.internal.bind.i
    public final Object d() {
        return (Object[]) this.f4008c.clone();
    }

    @Override // com.google.gson.internal.bind.i
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f4007b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e4) {
            d0 d0Var = t7.c.f14667a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e4);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException("Failed to invoke constructor '" + t7.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + t7.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + t7.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override // com.google.gson.internal.bind.i
    public final void f(Object obj, v7.a aVar, h hVar) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f4009d;
        String str = hVar.f3993c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + t7.c.b(this.f4007b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = hVar.f3999i.b(aVar);
        if (objB != null || !hVar.f4002l) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbR = a7.a.r("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbR.append(aVar.u(false));
            throw new a0(sbR.toString());
        }
    }
}
