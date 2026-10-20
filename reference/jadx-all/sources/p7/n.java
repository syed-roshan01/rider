package p7;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f12834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.h f12836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f12837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f12840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f12841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f12842i;

    public n() {
        Excluder excluder = Excluder.f3945f;
        Map mapEmptyMap = Collections.emptyMap();
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        List listEmptyList4 = Collections.emptyList();
        this.f12834a = new ThreadLocal();
        this.f12835b = new ConcurrentHashMap();
        r7.h hVar = new r7.h(mapEmptyMap, listEmptyList4);
        this.f12836c = hVar;
        this.f12839f = true;
        this.f12840g = listEmptyList;
        this.f12841h = listEmptyList2;
        this.f12842i = listEmptyList4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.p.A);
        arrayList.add(com.google.gson.internal.bind.g.f3988c);
        arrayList.add(excluder);
        arrayList.addAll(listEmptyList3);
        arrayList.add(com.google.gson.internal.bind.p.f4033p);
        arrayList.add(com.google.gson.internal.bind.p.f4024g);
        arrayList.add(com.google.gson.internal.bind.p.f4021d);
        arrayList.add(com.google.gson.internal.bind.p.f4022e);
        arrayList.add(com.google.gson.internal.bind.p.f4023f);
        k kVar = com.google.gson.internal.bind.p.f4028k;
        arrayList.add(com.google.gson.internal.bind.p.a(Long.TYPE, Long.class, kVar));
        arrayList.add(com.google.gson.internal.bind.p.a(Double.TYPE, Double.class, new j(0)));
        arrayList.add(com.google.gson.internal.bind.p.a(Float.TYPE, Float.class, new j(1)));
        arrayList.add(com.google.gson.internal.bind.f.f3986b);
        arrayList.add(com.google.gson.internal.bind.p.f4025h);
        arrayList.add(com.google.gson.internal.bind.p.f4026i);
        arrayList.add(com.google.gson.internal.bind.p.b(AtomicLong.class, new l(kVar, 0).a()));
        arrayList.add(com.google.gson.internal.bind.p.b(AtomicLongArray.class, new l(kVar, 1).a()));
        arrayList.add(com.google.gson.internal.bind.p.f4027j);
        arrayList.add(com.google.gson.internal.bind.p.f4029l);
        arrayList.add(com.google.gson.internal.bind.p.f4034q);
        arrayList.add(com.google.gson.internal.bind.p.f4035r);
        arrayList.add(com.google.gson.internal.bind.p.b(BigDecimal.class, com.google.gson.internal.bind.p.f4030m));
        arrayList.add(com.google.gson.internal.bind.p.b(BigInteger.class, com.google.gson.internal.bind.p.f4031n));
        arrayList.add(com.google.gson.internal.bind.p.b(r7.k.class, com.google.gson.internal.bind.p.f4032o));
        arrayList.add(com.google.gson.internal.bind.p.f4036s);
        arrayList.add(com.google.gson.internal.bind.p.f4037t);
        arrayList.add(com.google.gson.internal.bind.p.f4039v);
        arrayList.add(com.google.gson.internal.bind.p.f4040w);
        arrayList.add(com.google.gson.internal.bind.p.f4042y);
        arrayList.add(com.google.gson.internal.bind.p.f4038u);
        arrayList.add(com.google.gson.internal.bind.p.f4019b);
        arrayList.add(com.google.gson.internal.bind.b.f3975b);
        arrayList.add(com.google.gson.internal.bind.p.f4041x);
        if (com.google.gson.internal.sql.e.f4050a) {
            arrayList.add(com.google.gson.internal.sql.e.f4052c);
            arrayList.add(com.google.gson.internal.sql.e.f4051b);
            arrayList.add(com.google.gson.internal.sql.e.f4053d);
        }
        arrayList.add(com.google.gson.internal.bind.a.f3972c);
        arrayList.add(com.google.gson.internal.bind.p.f4018a);
        arrayList.add(new CollectionTypeAdapterFactory(hVar));
        arrayList.add(new MapTypeAdapterFactory(hVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(hVar);
        this.f12837d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.google.gson.internal.bind.p.B);
        arrayList.add(new ReflectiveTypeAdapterFactory(hVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, listEmptyList4));
        this.f12838e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String str, Type type) {
        u7.a aVar = new u7.a(type);
        Object objB = null;
        if (str != null) {
            v7.a aVar2 = new v7.a(new StringReader(str));
            boolean z10 = true;
            aVar2.f15938b = true;
            try {
                try {
                    try {
                        try {
                            aVar2.k0();
                            try {
                                objB = c(aVar).b(aVar2);
                            } catch (EOFException e4) {
                                e = e4;
                                z10 = false;
                                if (!z10) {
                                    throw new q(e);
                                }
                            }
                        } catch (Throwable th) {
                            aVar2.f15938b = false;
                            throw th;
                        }
                    } catch (EOFException e10) {
                        e = e10;
                    }
                    aVar2.f15938b = false;
                    if (objB != null) {
                        try {
                            if (aVar2.k0() != 10) {
                                throw new q("JSON document was not fully consumed.");
                            }
                        } catch (v7.c e11) {
                            throw new q(e11);
                        } catch (IOException e12) {
                            throw new q(e12);
                        }
                    }
                } catch (IOException e13) {
                    throw new q(e13);
                }
            } catch (AssertionError e14) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e14.getMessage(), e14);
            } catch (IllegalStateException e15) {
                throw new q(e15);
            }
        }
        return objB;
    }

    public final a0 c(u7.a aVar) {
        boolean z10;
        ConcurrentHashMap concurrentHashMap = this.f12835b;
        a0 a0Var = (a0) concurrentHashMap.get(aVar);
        if (a0Var != null) {
            return a0Var;
        }
        ThreadLocal threadLocal = this.f12834a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            a0 a0Var2 = (a0) map.get(aVar);
            if (a0Var2 != null) {
                return a0Var2;
            }
            z10 = false;
        }
        try {
            m mVar = new m();
            a0 a0VarA = null;
            mVar.f12833a = null;
            map.put(aVar, mVar);
            Iterator it = this.f12838e.iterator();
            while (it.hasNext()) {
                a0VarA = ((b0) it.next()).a(this, aVar);
                if (a0VarA != null) {
                    if (mVar.f12833a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    mVar.f12833a = a0VarA;
                    map.put(aVar, a0VarA);
                    break;
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (a0VarA != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return a0VarA;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z10) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final v7.b d(Writer writer) {
        v7.b bVar = new v7.b(writer);
        bVar.f15960f = this.f12839f;
        bVar.f15959e = false;
        bVar.f15962o = false;
        return bVar;
    }

    public final String e(ArrayList arrayList) {
        Class cls = arrayList.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            f(arrayList, cls, d(stringWriter));
            return stringWriter.toString();
        } catch (IOException e4) {
            throw new q(e4);
        }
    }

    public final void f(ArrayList arrayList, Class cls, v7.b bVar) {
        a0 a0VarC = c(new u7.a(cls));
        boolean z10 = bVar.f15959e;
        bVar.f15959e = true;
        boolean z11 = bVar.f15960f;
        bVar.f15960f = this.f12839f;
        boolean z12 = bVar.f15962o;
        bVar.f15962o = false;
        try {
            try {
                try {
                    a0VarC.c(bVar, arrayList);
                    bVar.f15959e = z10;
                    bVar.f15960f = z11;
                    bVar.f15962o = z12;
                } catch (IOException e4) {
                    throw new q(e4);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e10.getMessage(), e10);
            }
        } catch (Throwable th) {
            bVar.f15959e = z10;
            bVar.f15960f = z11;
            bVar.f15962o = z12;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f12838e + ",instanceCreators:" + this.f12836c + "}";
    }
}
