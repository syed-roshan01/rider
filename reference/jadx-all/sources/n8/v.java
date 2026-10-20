package n8;

import e8.c2;
import e8.g0;
import e8.j0;
import e8.u0;
import e8.w0;
import e8.x;
import e8.x0;
import e8.y;
import e8.z0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v extends z0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e8.b f12310h = new e8.b("state-info");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c2 f12311i = c2.f5216e.g("no subchannels ready");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f12312c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f12314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f12315f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f12313d = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f12316g = new r(f12311i);

    public v(j0 j0Var) {
        y3.e.J(j0Var, "helper");
        this.f12312c = j0Var;
        this.f12314e = new Random();
    }

    public static t g(x0 x0Var) {
        e8.c cVarC = x0Var.c();
        t tVar = (t) cVarC.f5207a.get(f12310h);
        y3.e.J(tVar, "STATE_INFO");
        return tVar;
    }

    @Override // e8.z0
    public final boolean a(w0 w0Var) {
        List<g0> list = w0Var.f5391a;
        int i10 = 0;
        if (list.isEmpty()) {
            c(c2.f5224m.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + w0Var.f5392b));
            return false;
        }
        HashMap map = this.f12313d;
        Set setKeySet = map.keySet();
        HashMap map2 = new HashMap(list.size() * 2);
        for (g0 g0Var : list) {
            map2.put(new g0(g0Var.f5259a, e8.c.f5206b), g0Var);
        }
        Set setKeySet2 = map2.keySet();
        HashSet hashSet = new HashSet(setKeySet);
        hashSet.removeAll(setKeySet2);
        for (Map.Entry entry : map2.entrySet()) {
            g0 g0Var2 = (g0) entry.getKey();
            g0 g0Var3 = (g0) entry.getValue();
            x0 x0Var = (x0) map.get(g0Var2);
            if (x0Var != null) {
                x0Var.i(Collections.singletonList(g0Var3));
            } else {
                e8.c cVar = e8.c.f5206b;
                e8.b bVar = f12310h;
                y yVarA = y.a(x.f5397d);
                t tVar = new t();
                tVar.f12309a = yVarA;
                IdentityHashMap identityHashMap = new IdentityHashMap(1);
                identityHashMap.put(bVar, tVar);
                Object[][] objArr = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
                List listSingletonList = Collections.singletonList(g0Var3);
                for (Map.Entry entry2 : cVar.f5207a.entrySet()) {
                    if (!identityHashMap.containsKey(entry2.getKey())) {
                        identityHashMap.put((e8.b) entry2.getKey(), entry2.getValue());
                    }
                }
                x0 x0VarH = this.f12312c.h(new u0(listSingletonList, new e8.c(identityHashMap), objArr, i10));
                y3.e.J(x0VarH, "subchannel");
                x0VarH.h(new v6.d(this, x0VarH, 17));
                map.put(g0Var2, x0VarH);
                x0VarH.f();
            }
        }
        ArrayList<x0> arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add((x0) map.remove((g0) it.next()));
        }
        h();
        for (x0 x0Var2 : arrayList) {
            x0Var2.g();
            g(x0Var2).f12309a = y.a(x.f5398e);
        }
        return true;
    }

    @Override // e8.z0
    public final void c(c2 c2Var) {
        if (this.f12315f != x.f5395b) {
            i(x.f5396c, new r(c2Var));
        }
    }

    @Override // e8.z0
    public final void f() {
        HashMap map = this.f12313d;
        for (x0 x0Var : map.values()) {
            x0Var.g();
            g(x0Var).f12309a = y.a(x.f5398e);
        }
        map.clear();
    }

    public final void h() {
        x xVar;
        x xVar2;
        HashMap map = this.f12313d;
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList(collectionValues.size());
        Iterator it = collectionValues.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            xVar = x.f5395b;
            if (!zHasNext) {
                break;
            }
            x0 x0Var = (x0) it.next();
            if (((y) g(x0Var).f12309a).f5403a == xVar) {
                arrayList.add(x0Var);
            }
        }
        if (!arrayList.isEmpty()) {
            i(xVar, new s(this.f12314e.nextInt(arrayList.size()), arrayList));
            return;
        }
        Iterator it2 = map.values().iterator();
        c2 c2Var = f12311i;
        boolean z10 = false;
        c2 c2Var2 = c2Var;
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            xVar2 = x.f5394a;
            if (!zHasNext2) {
                break;
            }
            y yVar = (y) g((x0) it2.next()).f12309a;
            x xVar3 = yVar.f5403a;
            if (xVar3 == xVar2 || xVar3 == x.f5397d) {
                z10 = true;
            }
            if (c2Var2 == c2Var || !c2Var2.e()) {
                c2Var2 = yVar.f5404b;
            }
        }
        if (!z10) {
            xVar2 = x.f5396c;
        }
        i(xVar2, new r(c2Var2));
    }

    public final void i(x xVar, u uVar) {
        if (xVar == this.f12315f && uVar.B0(this.f12316g)) {
            return;
        }
        this.f12312c.r(xVar, uVar);
        this.f12315f = xVar;
        this.f12316g = uVar;
    }
}
