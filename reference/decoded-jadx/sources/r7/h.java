package r7;

import g8.a6;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ScheduledFuture;
import k6.w4;
import l.z2;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public class h implements a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13606d;

    public h(Map map, List list) {
        this.f13603a = 0;
        this.f13605c = map;
        this.f13604b = true;
        this.f13606d = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    public final q b(u7.a aVar) {
        g gVar;
        String str;
        q uVar;
        Type type = aVar.f15426b;
        Map map = (Map) this.f13605c;
        a7.a.w(map.get(type));
        Class cls = aVar.f15425a;
        a7.a.w(map.get(cls));
        int i10 = 0;
        q eVar = null;
        int i11 = 1;
        if (EnumSet.class.isAssignableFrom(cls)) {
            gVar = new g(type, 0);
        } else {
            gVar = cls == EnumMap.class ? new g(type, 1) : null;
        }
        if (gVar != null) {
            return gVar;
        }
        z6.a.F((List) this.f13606d);
        int i12 = 4;
        if (Modifier.isAbstract(cls.getModifiers())) {
            uVar = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                d0 d0Var = t7.c.f14667a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e4) {
                    str = "Failed making constructor '" + t7.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e4.getMessage();
                }
                uVar = str != null ? new i3.u(str, 4) : new w4(declaredConstructor, 13);
            } catch (NoSuchMethodException unused) {
                uVar = null;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        int i13 = 5;
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                eVar = new x9.v(27);
            } else if (Set.class.isAssignableFrom(cls)) {
                eVar = new x9.v(28);
            } else {
                eVar = Queue.class.isAssignableFrom(cls) ? new x9.v(29) : new e(i10, i10);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                eVar = new e(i11, i10);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                eVar = new e(2, i10);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                eVar = new e(3, i10);
            } else if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                Objects.requireNonNull(type2);
                Type typeA = d.a(type2);
                Class clsE = d.e(typeA);
                typeA.hashCode();
                if (String.class.isAssignableFrom(clsE)) {
                    eVar = new e(i13, i10);
                } else {
                    eVar = new e(i12, i10);
                }
            } else {
                eVar = new e(i13, i10);
            }
        }
        if (eVar != null) {
            return eVar;
        }
        String strA = a(cls);
        if (strA != null) {
            return new f(strA, 1);
        }
        if (this.f13604b) {
            return new v6.d(i13, this, cls);
        }
        return new f("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.", 0);
    }

    public final void e(ScheduledFuture scheduledFuture) {
        synchronized (this.f13605c) {
            try {
                if (!this.f13604b) {
                    this.f13606d = scheduledFuture;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g8.a6
    public final InputStream next() {
        if (!this.f13604b) {
            ((Runnable) this.f13605c).run();
            this.f13604b = true;
        }
        return (InputStream) ((g8.k) ((z2) this.f13606d).f10984c).f6895c.poll();
    }

    public final String toString() {
        switch (this.f13603a) {
            case 0:
                return ((Map) this.f13605c).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(z2 z2Var, Runnable runnable, int i10) {
        this(z2Var, runnable);
        this.f13603a = 1;
    }

    public h(z2 z2Var, Runnable runnable) {
        this.f13603a = 1;
        this.f13606d = z2Var;
        this.f13604b = false;
        this.f13605c = runnable;
    }

    public h(Object obj) {
        this.f13603a = 2;
        this.f13605c = obj;
    }
}
