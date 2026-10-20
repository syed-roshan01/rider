package m0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2 f11483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0.d f11484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0.d f11485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f11486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f11487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Set f11488f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f11489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Set f11490o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(g2 g2Var, o0.d dVar, o0.d dVar2, List list, List list2, Set set, List list3, Set set2) {
        super(1);
        this.f11483a = g2Var;
        this.f11484b = dVar;
        this.f11485c = dVar2;
        this.f11486d = list;
        this.f11487e = list2;
        this.f11488f = set;
        this.f11489n = list3;
        this.f11490o = set2;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc A[Catch: all -> 0x0108, Exception -> 0x010a, TRY_LEAVE, TryCatch #3 {Exception -> 0x010a, blocks: (B:55:0x00e6, B:56:0x00f6, B:58:0x00fc), top: B:158:0x00e6, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0122 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, blocks: (B:14:0x0043, B:15:0x0048, B:22:0x006a, B:23:0x006b, B:24:0x0071, B:26:0x007c, B:29:0x0088, B:43:0x00bf, B:52:0x00dc, B:64:0x010c, B:70:0x0122, B:82:0x0149, B:88:0x0160, B:89:0x0162, B:91:0x0166, B:92:0x0167, B:95:0x017b, B:96:0x017c, B:86:0x015c, B:87:0x015f, B:85:0x0157, B:68:0x011e, B:69:0x0121, B:67:0x011a, B:50:0x00d8, B:51:0x00db, B:48:0x00d0, B:108:0x01a4, B:110:0x01ad, B:111:0x01af, B:123:0x01de, B:125:0x01e0, B:126:0x01e1, B:127:0x01e2, B:129:0x01e8, B:130:0x01eb, B:132:0x01f5, B:137:0x020b, B:144:0x0229, B:145:0x022c, B:140:0x0221, B:146:0x022d, B:147:0x022e, B:16:0x0049, B:18:0x0053, B:21:0x0065, B:73:0x012c, B:74:0x0133, B:76:0x0139, B:84:0x014d, B:55:0x00e6, B:56:0x00f6, B:58:0x00fc, B:32:0x0093, B:34:0x009a, B:39:0x00aa, B:41:0x00b1, B:47:0x00c6, B:66:0x0110, B:97:0x017d, B:99:0x0184, B:101:0x0193, B:112:0x01b0, B:114:0x01bb, B:116:0x01c9, B:118:0x01d1, B:90:0x0163, B:139:0x0217), top: B:156:0x0043, inners: #0, #2, #3, #4, #5, #7, #9, #10, #11, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0139 A[Catch: all -> 0x0145, Exception -> 0x0147, TRY_LEAVE, TryCatch #2 {all -> 0x0145, blocks: (B:73:0x012c, B:74:0x0133, B:76:0x0139, B:84:0x014d), top: B:157:0x012a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0160 A[Catch: all -> 0x00c3, TryCatch #1 {all -> 0x00c3, blocks: (B:14:0x0043, B:15:0x0048, B:22:0x006a, B:23:0x006b, B:24:0x0071, B:26:0x007c, B:29:0x0088, B:43:0x00bf, B:52:0x00dc, B:64:0x010c, B:70:0x0122, B:82:0x0149, B:88:0x0160, B:89:0x0162, B:91:0x0166, B:92:0x0167, B:95:0x017b, B:96:0x017c, B:86:0x015c, B:87:0x015f, B:85:0x0157, B:68:0x011e, B:69:0x0121, B:67:0x011a, B:50:0x00d8, B:51:0x00db, B:48:0x00d0, B:108:0x01a4, B:110:0x01ad, B:111:0x01af, B:123:0x01de, B:125:0x01e0, B:126:0x01e1, B:127:0x01e2, B:129:0x01e8, B:130:0x01eb, B:132:0x01f5, B:137:0x020b, B:144:0x0229, B:145:0x022c, B:140:0x0221, B:146:0x022d, B:147:0x022e, B:16:0x0049, B:18:0x0053, B:21:0x0065, B:73:0x012c, B:74:0x0133, B:76:0x0139, B:84:0x014d, B:55:0x00e6, B:56:0x00f6, B:58:0x00fc, B:32:0x0093, B:34:0x009a, B:39:0x00aa, B:41:0x00b1, B:47:0x00c6, B:66:0x0110, B:97:0x017d, B:99:0x0184, B:101:0x0193, B:112:0x01b0, B:114:0x01bb, B:116:0x01c9, B:118:0x01d1, B:90:0x0163, B:139:0x0217), top: B:156:0x0043, inners: #0, #2, #3, #4, #5, #7, #9, #10, #11, #12, #13, #14 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // c9.c
    public final Object invoke(Object obj) {
        boolean zV;
        boolean z10;
        Iterator it;
        Iterator it2;
        long jLongValue = ((Number) obj).longValue();
        g2 g2Var = this.f11483a;
        synchronized (g2Var.f11520b) {
            zV = g2Var.v();
        }
        if (zV) {
            g2 g2Var2 = this.f11483a;
            Trace.beginSection("Recomposer:animation");
            try {
                g2Var2.f11519a.c(jLongValue);
                k0.y0.g();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        g2 g2Var3 = this.f11483a;
        o0.d dVar = this.f11484b;
        o0.d dVar2 = this.f11485c;
        ?? r10 = this.f11486d;
        List list = this.f11487e;
        Set set = this.f11488f;
        ?? r12 = this.f11489n;
        Set set2 = this.f11490o;
        Trace.beginSection("Recomposer:recompose");
        try {
            g2.r(g2Var3);
            synchronized (g2Var3.f11520b) {
                try {
                    ArrayList arrayList = g2Var3.f11526h;
                    int size = arrayList.size();
                    z10 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        ((Collection) r10).add((e0) arrayList.get(i10));
                    }
                    g2Var3.f11526h.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.clear();
            dVar2.clear();
            try {
                while (true) {
                    if (!(!((Collection) r10).isEmpty()) && !(!list.isEmpty())) {
                        break;
                    }
                    try {
                        try {
                            int size2 = r10.size();
                            for (?? r11 = z10; r11 < size2; r11++) {
                                e0 e0Var = (e0) r10.get(r11);
                                dVar2.add(e0Var);
                                e0 e0VarQ = g2.q(g2Var3, e0Var, dVar);
                                if (e0VarQ != null) {
                                    ((Collection) r12).add(e0VarQ);
                                }
                            }
                            r10.clear();
                            if (dVar.k()) {
                                synchronized (g2Var3.f11520b) {
                                    ?? X = g2Var3.x();
                                    int size3 = X.size();
                                    for (?? r15 = z10; r15 < size3; r15++) {
                                        e0 e0Var2 = (e0) X.get(r15);
                                        if (!dVar2.contains(e0Var2)) {
                                            x xVar = (x) e0Var2;
                                            if (xVar.w(dVar)) {
                                                ((Collection) r10).add(xVar);
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                            if (r10.isEmpty()) {
                                try {
                                    f2.i(list, g2Var3);
                                    while (!list.isEmpty()) {
                                        r8.n.A0(g2Var3.A(list, dVar), set);
                                        f2.i(list, g2Var3);
                                    }
                                } catch (Exception e4) {
                                    g2.C(g2Var3, e4, true, 2);
                                    f2.h(r10, list, r12, set, set2, dVar, dVar2);
                                }
                            }
                            z10 = false;
                        } catch (Exception e10) {
                            g2.C(g2Var3, e10, true, 2);
                            f2.h(r10, list, r12, set, set2, dVar, dVar2);
                            r10.clear();
                        }
                    } catch (Throwable th3) {
                        r10.clear();
                        throw th3;
                    }
                    Trace.endSection();
                    return q8.l.f13235a;
                }
                if (!((Collection) r12).isEmpty()) {
                    try {
                        int size4 = r12.size();
                        for (?? r13 = z10; r13 < size4; r13++) {
                            set2.add((e0) r12.get(r13));
                        }
                        int size5 = r12.size();
                        for (?? r14 = z10; r14 < size5; r14++) {
                            ((x) ((e0) r12.get(r14))).i();
                        }
                        r12.clear();
                        if (!set.isEmpty()) {
                            try {
                                try {
                                    r8.n.A0(set, set2);
                                    it = set.iterator();
                                    while (it.hasNext()) {
                                        ((x) ((e0) it.next())).k();
                                    }
                                    set.clear();
                                    try {
                                        if (!set2.isEmpty()) {
                                            try {
                                                it2 = set2.iterator();
                                                while (it2.hasNext()) {
                                                    ((x) ((e0) it2.next())).l();
                                                }
                                                set2.clear();
                                                synchronized (g2Var3.f11520b) {
                                                    g2Var3.u();
                                                }
                                                w0.p.i().m();
                                                dVar2.clear();
                                                dVar.clear();
                                                g2Var3.f11532n = null;
                                            } catch (Exception e11) {
                                                g2.C(g2Var3, e11, z10, 6);
                                                f2.h(r10, list, r12, set, set2, dVar, dVar2);
                                                set2.clear();
                                            }
                                        } else {
                                            synchronized (g2Var3.f11520b) {
                                                g2Var3.u();
                                                w0.p.i().m();
                                                dVar2.clear();
                                                dVar.clear();
                                                g2Var3.f11532n = null;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        set2.clear();
                                        throw th4;
                                    }
                                } catch (Exception e12) {
                                    g2.C(g2Var3, e12, z10, 6);
                                    f2.h(r10, list, r12, set, set2, dVar, dVar2);
                                    set.clear();
                                }
                            } catch (Throwable th5) {
                                set.clear();
                                throw th5;
                            }
                        } else if (!set2.isEmpty()) {
                            it2 = set2.iterator();
                            while (it2.hasNext()) {
                                ((x) ((e0) it2.next())).l();
                            }
                            set2.clear();
                            synchronized (g2Var3.f11520b) {
                                g2Var3.u();
                                w0.p.i().m();
                                dVar2.clear();
                                dVar.clear();
                                g2Var3.f11532n = null;
                            }
                        } else {
                            synchronized (g2Var3.f11520b) {
                                g2Var3.u();
                                w0.p.i().m();
                                dVar2.clear();
                                dVar.clear();
                                g2Var3.f11532n = null;
                            }
                        }
                    } catch (Exception e13) {
                        g2.C(g2Var3, e13, z10, 6);
                        f2.h(r10, list, r12, set, set2, dVar, dVar2);
                        r12.clear();
                    }
                } else if (!set.isEmpty()) {
                    r8.n.A0(set, set2);
                    it = set.iterator();
                    while (it.hasNext()) {
                        ((x) ((e0) it.next())).k();
                    }
                    set.clear();
                    if (!set2.isEmpty()) {
                        it2 = set2.iterator();
                        while (it2.hasNext()) {
                            ((x) ((e0) it2.next())).l();
                        }
                        set2.clear();
                        synchronized (g2Var3.f11520b) {
                            g2Var3.u();
                            w0.p.i().m();
                            dVar2.clear();
                            dVar.clear();
                            g2Var3.f11532n = null;
                        }
                    } else {
                        synchronized (g2Var3.f11520b) {
                            g2Var3.u();
                            w0.p.i().m();
                            dVar2.clear();
                            dVar.clear();
                            g2Var3.f11532n = null;
                        }
                    }
                } else if (!set2.isEmpty()) {
                    it2 = set2.iterator();
                    while (it2.hasNext()) {
                        ((x) ((e0) it2.next())).l();
                    }
                    set2.clear();
                    synchronized (g2Var3.f11520b) {
                        g2Var3.u();
                        w0.p.i().m();
                        dVar2.clear();
                        dVar.clear();
                        g2Var3.f11532n = null;
                    }
                } else {
                    synchronized (g2Var3.f11520b) {
                        g2Var3.u();
                        w0.p.i().m();
                        dVar2.clear();
                        dVar.clear();
                        g2Var3.f11532n = null;
                    }
                }
                Trace.endSection();
                return q8.l.f13235a;
            } catch (Throwable th6) {
                r12.clear();
                throw th6;
            }
        } catch (Throwable th7) {
            Trace.endSection();
            throw th7;
        }
    }
}
