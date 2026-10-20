package m4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.a0;
import d7.t;
import ja.x;
import ja.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import k4.o;
import l.r;
import x9.b0;
import x9.c0;
import x9.q;
import x9.s;
import x9.u;
import x9.w;
import x9.y;

/* JADX INFO: loaded from: classes.dex */
public final class l implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x9.c f11851f = new x9.c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x9.c f11852g = new x9.c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.n f11854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8.c f11855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q8.c f11856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11857e;

    public l(String str, s4.n nVar, q8.c cVar, q8.c cVar2, boolean z10) {
        this.f11853a = str;
        this.f11854b = nVar;
        this.f11855c = cVar;
        this.f11856d = cVar2;
        this.f11857e = z10;
    }

    public static String d(String str, u uVar) {
        String strB;
        String str2 = uVar != null ? uVar.f16467a : null;
        if ((str2 == null || l9.i.h1(str2, "text/plain", false)) && (strB = w4.e.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return l9.i.l1(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f1 A[Catch: Exception -> 0x018d, TryCatch #0 {Exception -> 0x018d, blocks: (B:101:0x01eb, B:103:0x01f1, B:104:0x0209, B:105:0x020c, B:107:0x0210, B:108:0x0212, B:111:0x021a, B:113:0x0222, B:115:0x0227, B:114:0x0225, B:110:0x0217, B:117:0x022b, B:118:0x0234, B:69:0x015d, B:72:0x0169, B:74:0x0175, B:76:0x0183, B:80:0x018f, B:82:0x0198, B:83:0x01ae, B:84:0x01b1, B:86:0x01b5, B:87:0x01b7, B:90:0x01bf, B:92:0x01c7, B:94:0x01cc, B:93:0x01ca, B:89:0x01bc, B:96:0x01d0), top: B:128:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:105:0x020c A[Catch: Exception -> 0x018d, TryCatch #0 {Exception -> 0x018d, blocks: (B:101:0x01eb, B:103:0x01f1, B:104:0x0209, B:105:0x020c, B:107:0x0210, B:108:0x0212, B:111:0x021a, B:113:0x0222, B:115:0x0227, B:114:0x0225, B:110:0x0217, B:117:0x022b, B:118:0x0234, B:69:0x015d, B:72:0x0169, B:74:0x0175, B:76:0x0183, B:80:0x018f, B:82:0x0198, B:83:0x01ae, B:84:0x01b1, B:86:0x01b5, B:87:0x01b7, B:90:0x01bf, B:92:0x01c7, B:94:0x01cc, B:93:0x01ca, B:89:0x01bc, B:96:0x01d0), top: B:128:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0210 A[Catch: Exception -> 0x018d, TRY_LEAVE, TryCatch #0 {Exception -> 0x018d, blocks: (B:101:0x01eb, B:103:0x01f1, B:104:0x0209, B:105:0x020c, B:107:0x0210, B:108:0x0212, B:111:0x021a, B:113:0x0222, B:115:0x0227, B:114:0x0225, B:110:0x0217, B:117:0x022b, B:118:0x0234, B:69:0x015d, B:72:0x0169, B:74:0x0175, B:76:0x0183, B:80:0x018f, B:82:0x0198, B:83:0x01ae, B:84:0x01b1, B:86:0x01b5, B:87:0x01b7, B:90:0x01bf, B:92:0x01c7, B:94:0x01cc, B:93:0x01ca, B:89:0x01bc, B:96:0x01d0), top: B:128:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0217 A[Catch: Exception -> 0x018d, TRY_ENTER, TryCatch #0 {Exception -> 0x018d, blocks: (B:101:0x01eb, B:103:0x01f1, B:104:0x0209, B:105:0x020c, B:107:0x0210, B:108:0x0212, B:111:0x021a, B:113:0x0222, B:115:0x0227, B:114:0x0225, B:110:0x0217, B:117:0x022b, B:118:0x0234, B:69:0x015d, B:72:0x0169, B:74:0x0175, B:76:0x0183, B:80:0x018f, B:82:0x0198, B:83:0x01ae, B:84:0x01b1, B:86:0x01b5, B:87:0x01b7, B:90:0x01bf, B:92:0x01c7, B:94:0x01cc, B:93:0x01ca, B:89:0x01bc, B:96:0x01d0), top: B:128:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0222 A[Catch: Exception -> 0x018d, TryCatch #0 {Exception -> 0x018d, blocks: (B:101:0x01eb, B:103:0x01f1, B:104:0x0209, B:105:0x020c, B:107:0x0210, B:108:0x0212, B:111:0x021a, B:113:0x0222, B:115:0x0227, B:114:0x0225, B:110:0x0217, B:117:0x022b, B:118:0x0234, B:69:0x015d, B:72:0x0169, B:74:0x0175, B:76:0x0183, B:80:0x018f, B:82:0x0198, B:83:0x01ae, B:84:0x01b1, B:86:0x01b5, B:87:0x01b7, B:90:0x01bf, B:92:0x01c7, B:94:0x01cc, B:93:0x01ca, B:89:0x01bc, B:96:0x01d0), top: B:128:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0225 A[Catch: Exception -> 0x018d, TryCatch #0 {Exception -> 0x018d, blocks: (B:101:0x01eb, B:103:0x01f1, B:104:0x0209, B:105:0x020c, B:107:0x0210, B:108:0x0212, B:111:0x021a, B:113:0x0222, B:115:0x0227, B:114:0x0225, B:110:0x0217, B:117:0x022b, B:118:0x0234, B:69:0x015d, B:72:0x0169, B:74:0x0175, B:76:0x0183, B:80:0x018f, B:82:0x0198, B:83:0x01ae, B:84:0x01b1, B:86:0x01b5, B:87:0x01b7, B:90:0x01bf, B:92:0x01c7, B:94:0x01cc, B:93:0x01ca, B:89:0x01bc, B:96:0x01d0), top: B:128:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:117:0x022b A[Catch: Exception -> 0x018d, TryCatch #0 {Exception -> 0x018d, blocks: (B:101:0x01eb, B:103:0x01f1, B:104:0x0209, B:105:0x020c, B:107:0x0210, B:108:0x0212, B:111:0x021a, B:113:0x0222, B:115:0x0227, B:114:0x0225, B:110:0x0217, B:117:0x022b, B:118:0x0234, B:69:0x015d, B:72:0x0169, B:74:0x0175, B:76:0x0183, B:80:0x018f, B:82:0x0198, B:83:0x01ae, B:84:0x01b1, B:86:0x01b5, B:87:0x01b7, B:90:0x01bf, B:92:0x01c7, B:94:0x01cc, B:93:0x01ca, B:89:0x01bc, B:96:0x01d0), top: B:128:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v14, types: [m4.l] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r14v0, types: [m4.l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [l4.b] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19, types: [l4.m] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [m4.l] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // m4.g
    public final Object a(u8.e eVar) throws Exception {
        k kVar;
        ?? r10;
        l4.m mVar;
        r4.d dVarA;
        ?? r11;
        r4.d dVar;
        r4.b bVar;
        l4.c cVar;
        l4.m mVar2;
        ?? r12;
        b0 b0Var;
        Exception e4;
        ?? r13;
        b0 b0Var2;
        o oVar;
        int i10;
        Object obj;
        k4.f fVar;
        String str;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i11 = kVar.f11850f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f11850f = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, eVar);
            }
        } else {
            kVar = new k(this, eVar);
        }
        Object obj2 = kVar.f11848d;
        v8.a aVar = v8.a.f15963a;
        ?? r14 = kVar.f11850f;
        u uVarI = null;
        try {
            if (r14 == 0) {
                t.v0(obj2);
                s4.n nVar = this.f11854b;
                boolean z10 = nVar.f14035n.f13932a;
                String str2 = this.f11853a;
                if (!z10 || (cVar = (l4.c) this.f11856d.getValue()) == null) {
                    mVar = null;
                } else {
                    String str3 = nVar.f14030i;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    ja.j jVar = ja.j.f8539d;
                    l4.g gVarF = ((l4.n) cVar).f11320b.f(fa.l.h(str3).c("SHA-256").e());
                    if (gVarF != null) {
                        mVar2 = new l4.m(gVarF);
                    } else {
                        mVar = null;
                    }
                }
                if (mVar != null) {
                    ja.m mVarC = c();
                    l4.g gVar = mVar.f11318a;
                    if (!(!gVar.f11294b)) {
                        mVar = mVar2;
                        throw new IllegalStateException("snapshot is closed".toString());
                    }
                    Long l10 = mVarC.h((x) gVar.f11293a.f11286c.get(0)).f8553d;
                    if (l10 == null) {
                        mVar = mVar2;
                    } else if (l10.longValue() == 0) {
                        mVar = mVar2;
                        return new n(g(mVar), d(str2, null), k4.f.f9756c);
                    }
                    mVar = mVar2;
                    if (!this.f11857e) {
                        k4.n nVarG = g(mVar);
                        r4.b bVarF = f(mVar);
                        return new n(nVarG, d(str2, bVarF != null ? (u) bVarF.f13450b.getValue() : null), k4.f.f9756c);
                    }
                    dVarA = new r4.c(e(), f(mVar)).a();
                    if (dVarA.f13466a == null && (bVar = dVarA.f13467b) != null) {
                        return new n(g(mVar), d(str2, (u) bVar.f13450b.getValue()), k4.f.f9756c);
                    }
                } else {
                    mVar = mVar2;
                    dVarA = new r4.c(e(), null).a();
                }
                r rVar = dVarA.f13466a;
                d7.a.j(rVar);
                kVar.f11845a = this;
                kVar.f11846b = mVar;
                kVar.f11847c = dVarA;
                kVar.f11850f = 1;
                Object objB = b(rVar, kVar);
                if (objB == aVar) {
                    return aVar;
                }
                r11 = this;
                dVar = dVarA;
                obj2 = objB;
                r12 = mVar;
            } else {
                if (r14 != 1) {
                    if (r14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b0Var = (b0) kVar.f11847c;
                    l4.m mVar3 = kVar.f11846b;
                    l lVar = kVar.f11845a;
                    try {
                        t.v0(obj2);
                        r13 = lVar;
                        b0Var2 = (b0) obj2;
                        Bitmap.Config[] configArr = w4.e.f16163a;
                        oVar = b0Var2.f16350n;
                        if (oVar != null) {
                            throw new IllegalStateException("response body == null".toString());
                        }
                        Context context = r13.f11854b.f14022a;
                        k4.r rVar2 = new k4.r(((c0) oVar).f16375c, null);
                        String str4 = r13.f11853a;
                        c0 c0Var = (c0) oVar;
                        i10 = c0Var.f16373a;
                        obj = c0Var.f16376d;
                        switch (i10) {
                            case 0:
                                uVarI = (u) obj;
                                break;
                            default:
                                str = (String) obj;
                                if (str != null) {
                                    Pattern pattern = u.f16465b;
                                    try {
                                        uVarI = q8.k.i(str);
                                    } catch (IllegalArgumentException unused) {
                                    }
                                }
                                break;
                        }
                        String strD = d(str4, uVarI);
                        if (b0Var2.f16351o != null) {
                            fVar = k4.f.f9757d;
                        } else {
                            fVar = k4.f.f9756c;
                        }
                        return new n(rVar2, strD, fVar);
                    } catch (Exception e10) {
                        e4 = e10;
                        w4.e.a(b0Var);
                        throw e4;
                    }
                }
                r4.d dVar2 = (r4.d) kVar.f11847c;
                r10 = kVar.f11846b;
                l lVar2 = kVar.f11845a;
                try {
                    t.v0(obj2);
                    dVar = dVar2;
                    r12 = r10;
                    r11 = lVar2;
                } catch (Exception e11) {
                    e = e11;
                    if (r10 != 0) {
                        w4.e.a(r10);
                    }
                    throw e;
                }
            }
            b0 b0Var3 = (b0) obj2;
            Bitmap.Config[] configArr2 = w4.e.f16163a;
            o oVar2 = b0Var3.f16350n;
            if (oVar2 == null) {
                throw new IllegalStateException("response body == null".toString());
            }
            try {
                l4.m mVarH = r11.h(r12, dVar.f13466a, b0Var3, dVar.f13467b);
                String str5 = r11.f11853a;
                if (mVarH != null) {
                    k4.n nVarG2 = r11.g(mVarH);
                    r4.b bVarF2 = r11.f(mVarH);
                    return new n(nVarG2, d(str5, bVarF2 != null ? (u) bVarF2.f13450b.getValue() : null), k4.f.f9757d);
                }
                if (((c0) oVar2).f16374b > 0) {
                    Context context2 = r11.f11854b.f14022a;
                    k4.r rVar3 = new k4.r(((c0) oVar2).f16375c, null);
                    c0 c0Var2 = (c0) oVar2;
                    int i12 = c0Var2.f16373a;
                    Object obj3 = c0Var2.f16376d;
                    switch (i12) {
                        case 0:
                            uVarI = (u) obj3;
                            break;
                        default:
                            String str6 = (String) obj3;
                            if (str6 != null) {
                                Pattern pattern2 = u.f16465b;
                                try {
                                    uVarI = q8.k.i(str6);
                                } catch (IllegalArgumentException unused2) {
                                }
                            }
                            break;
                    }
                    return new n(rVar3, d(str5, uVarI), b0Var3.f16351o != null ? k4.f.f9757d : k4.f.f9756c);
                }
                w4.e.a(b0Var3);
                r rVarE = r11.e();
                kVar.f11845a = r11;
                kVar.f11846b = mVarH;
                kVar.f11847c = b0Var3;
                kVar.f11850f = 2;
                Object objB2 = r11.b(rVarE, kVar);
                if (objB2 == aVar) {
                    return aVar;
                }
                b0Var = b0Var3;
                obj2 = objB2;
                r13 = r11;
                b0Var2 = (b0) obj2;
                Bitmap.Config[] configArr3 = w4.e.f16163a;
                oVar = b0Var2.f16350n;
                if (oVar != null) {
                    throw new IllegalStateException("response body == null".toString());
                }
                Context context3 = r13.f11854b.f14022a;
                k4.r rVar4 = new k4.r(((c0) oVar).f16375c, null);
                String str7 = r13.f11853a;
                c0 c0Var3 = (c0) oVar;
                i10 = c0Var3.f16373a;
                obj = c0Var3.f16376d;
                switch (i10) {
                    case 0:
                        uVarI = (u) obj;
                        break;
                    default:
                        str = (String) obj;
                        if (str != null) {
                            Pattern pattern3 = u.f16465b;
                            uVarI = q8.k.i(str);
                        }
                        break;
                }
                String strD2 = d(str7, uVarI);
                if (b0Var2.f16351o != null) {
                    fVar = k4.f.f9757d;
                } else {
                    fVar = k4.f.f9756c;
                }
                return new n(rVar4, strD2, fVar);
            } catch (Exception e12) {
                b0Var = b0Var3;
                e4 = e12;
                w4.e.a(b0Var);
                throw e4;
            }
        } catch (Exception e13) {
            e = e13;
            r10 = r14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(r rVar, u8.e eVar) {
        j jVar;
        ba.f fVar;
        b0 b0VarF;
        int i10;
        o oVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i11 = jVar.f11844c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f11844c = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, eVar);
            }
        } else {
            jVar = new j(this, eVar);
        }
        Object objS = jVar.f11842a;
        v8.a aVar = v8.a.f15963a;
        int i12 = jVar.f11844c;
        if (i12 == 0) {
            t.v0(objS);
            Bitmap.Config[] configArr = w4.e.f16163a;
            if (!d7.a.d(Looper.myLooper(), Looper.getMainLooper())) {
                w wVar = (w) ((x9.d) this.f11855c.getValue());
                wVar.getClass();
                d7.a.m(rVar, "request");
                ba.i iVar = new ba.i(wVar, rVar, false);
                jVar.f11844c = 1;
                m9.l lVar = new m9.l(1, t.b0(jVar));
                lVar.t();
                w4.f fVar2 = new w4.f(iVar, lVar);
                if (!iVar.f2796n.compareAndSet(false, true)) {
                    throw new IllegalStateException("Already Executed".toString());
                }
                fa.m mVar = fa.m.f6417a;
                iVar.f2797o = fa.m.f6417a.g();
                iVar.f2794e.getClass();
                x9.l lVar2 = iVar.f2790a.f16474a;
                ba.f fVar3 = new ba.f(iVar, fVar2);
                lVar2.getClass();
                synchronized (lVar2) {
                    lVar2.f16435b.add(fVar3);
                    if (!iVar.f2792c) {
                        String str = ((s) iVar.f2791b.f10910b).f16458d;
                        Iterator it = lVar2.f16436c.iterator();
                        do {
                            if (!it.hasNext()) {
                                Iterator it2 = lVar2.f16435b.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        fVar = null;
                                        break;
                                    }
                                    fVar = (ba.f) it2.next();
                                } while (!d7.a.d(((s) fVar.f2787c.f2791b.f10910b).f16458d, str));
                            } else {
                                fVar = (ba.f) it.next();
                            }
                        } while (!d7.a.d(((s) fVar.f2787c.f2791b.f10910b).f16458d, str));
                        if (fVar != null) {
                            fVar3.f2786b = fVar.f2786b;
                        }
                    }
                }
                lVar2.c();
                lVar.v(fVar2);
                objS = lVar.s();
                v8.a aVar2 = v8.a.f15963a;
                if (objS == aVar) {
                    return aVar;
                }
            } else {
                if (this.f11854b.f14036o.f13932a) {
                    throw new NetworkOnMainThreadException();
                }
                w wVar2 = (w) ((x9.d) this.f11855c.getValue());
                wVar2.getClass();
                d7.a.m(rVar, "request");
                ba.i iVar2 = new ba.i(wVar2, rVar, false);
                if (!iVar2.f2796n.compareAndSet(false, true)) {
                    throw new IllegalStateException("Already Executed".toString());
                }
                iVar2.f2795f.h();
                fa.m mVar2 = fa.m.f6417a;
                iVar2.f2797o = fa.m.f6417a.g();
                iVar2.f2794e.getClass();
                try {
                    x9.l lVar3 = iVar2.f2790a.f16474a;
                    synchronized (lVar3) {
                        lVar3.f16437d.add(iVar2);
                    }
                    b0VarF = iVar2.f();
                    x9.l lVar4 = iVar2.f2790a.f16474a;
                    lVar4.a(lVar4.f16437d, iVar2);
                } catch (Throwable th) {
                    x9.l lVar5 = iVar2.f2790a.f16474a;
                    lVar5.a(lVar5.f16437d, iVar2);
                    throw th;
                }
            }
            i10 = b0VarF.f16347d;
            if ((200 > i10 && i10 < 300) || i10 == 304) {
                return b0VarF;
            }
            oVar = b0VarF.f16350n;
            if (oVar != null) {
                w4.e.a(oVar);
            }
            throw new a0("HTTP " + b0VarF.f16347d + ": " + b0VarF.f16346c);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.v0(objS);
        b0VarF = (b0) objS;
        i10 = b0VarF.f16347d;
        if (200 > i10) {
            oVar = b0VarF.f16350n;
            if (oVar != null) {
                w4.e.a(oVar);
            }
            throw new a0("HTTP " + b0VarF.f16347d + ": " + b0VarF.f16346c);
        }
        oVar = b0VarF.f16350n;
        if (oVar != null) {
            w4.e.a(oVar);
        }
        throw new a0("HTTP " + b0VarF.f16347d + ": " + b0VarF.f16346c);
        return b0VarF;
    }

    public final ja.m c() {
        Object value = this.f11856d.getValue();
        d7.a.j(value);
        return ((l4.n) ((l4.c) value)).f11319a;
    }

    public final r e() {
        y yVar = new y();
        String strConcat = this.f11853a;
        d7.a.m(strConcat, "url");
        if (l9.i.h1(strConcat, "ws:", true)) {
            String strSubstring = strConcat.substring(3);
            d7.a.l(strSubstring, "this as java.lang.String).substring(startIndex)");
            strConcat = "http:".concat(strSubstring);
        } else if (l9.i.h1(strConcat, "wss:", true)) {
            String strSubstring2 = strConcat.substring(4);
            d7.a.l(strSubstring2, "this as java.lang.String).substring(startIndex)");
            strConcat = "https:".concat(strSubstring2);
        }
        d7.a.m(strConcat, "<this>");
        x9.r rVar = new x9.r();
        rVar.c(null, strConcat);
        yVar.f16501a = rVar.a();
        s4.n nVar = this.f11854b;
        q qVar = nVar.f14031j;
        d7.a.m(qVar, "headers");
        yVar.f16503c = qVar.k();
        for (Map.Entry entry : nVar.f14032k.f14047a.entrySet()) {
            Object key = entry.getKey();
            d7.a.k(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            Class cls = (Class) key;
            Object value = entry.getValue();
            if (value == null) {
                yVar.f16504d.remove(cls);
            } else {
                if (yVar.f16504d.isEmpty()) {
                    yVar.f16504d = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap = yVar.f16504d;
                Object objCast = cls.cast(value);
                d7.a.j(objCast);
                linkedHashMap.put(cls, objCast);
            }
        }
        s4.b bVar = nVar.f14035n;
        boolean z10 = bVar.f13932a;
        boolean z11 = nVar.f14036o.f13932a;
        if (!z11 && z10) {
            yVar.b(x9.c.f16359o);
        } else if (!z11 || z10) {
            if (!z11 && !z10) {
                yVar.b(f11852g);
            }
        } else if (bVar.f13933b) {
            yVar.b(x9.c.f16358n);
        } else {
            yVar.b(f11851f);
        }
        return yVar.a();
    }

    public final r4.b f(l4.m mVar) throws Throwable {
        Throwable th;
        r4.b bVar;
        try {
            ja.m mVarC = c();
            l4.g gVar = mVar.f11318a;
            if (!(!gVar.f11294b)) {
                throw new IllegalStateException("snapshot is closed".toString());
            }
            ja.a0 a0VarC = r9.a.c(mVarC.l((x) gVar.f11293a.f11286c.get(0)));
            try {
                bVar = new r4.b(a0VarC);
                try {
                    a0VarC.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    a0VarC.close();
                } catch (Throwable th4) {
                    d7.a.c(th3, th4);
                }
                th = th3;
                bVar = null;
            }
            if (th != null) {
                throw th;
            }
            d7.a.j(bVar);
            return bVar;
        } catch (IOException unused) {
            return null;
        }
    }

    public final k4.n g(l4.m mVar) {
        l4.g gVar = mVar.f11318a;
        if (!(!gVar.f11294b)) {
            throw new IllegalStateException("snapshot is closed".toString());
        }
        x xVar = (x) gVar.f11293a.f11286c.get(1);
        ja.m mVarC = c();
        String str = this.f11854b.f14030i;
        if (str == null) {
            str = this.f11853a;
        }
        return new k4.n(xVar, mVarC, str, mVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    public final l4.m h(l4.b bVar, r rVar, b0 b0Var, r4.b bVar2) {
        l4.l lVar;
        Throwable th;
        q8.l lVar2;
        Long lValueOf;
        q8.l lVar3;
        l4.e eVarE;
        Throwable th2 = null;
        if (!this.f11854b.f14035n.f13933b || (this.f11857e && (rVar.d().f16361b || b0Var.a().f16361b || d7.a.d(b0Var.f16349f.e("Vary"), "*")))) {
            if (bVar != null) {
                w4.e.a(bVar);
            }
            return null;
        }
        if (bVar != null) {
            l4.g gVar = ((l4.m) bVar).f11318a;
            l4.j jVar = gVar.f11295c;
            synchronized (jVar) {
                gVar.close();
                eVarE = jVar.e(gVar.f11293a.f11284a);
            }
            if (eVarE != null) {
                lVar = new l4.l(eVarE);
            } else {
                lVar = null;
            }
        } else {
            l4.c cVar = (l4.c) this.f11856d.getValue();
            if (cVar == null) {
                lVar = null;
            } else {
                String str = this.f11854b.f14030i;
                if (str == null) {
                    str = this.f11853a;
                }
                l4.j jVar2 = ((l4.n) cVar).f11320b;
                ja.j jVar3 = ja.j.f8539d;
                l4.e eVarE2 = jVar2.e(fa.l.h(str).c("SHA-256").e());
                if (eVarE2 != null) {
                    lVar = new l4.l(eVarE2);
                } else {
                    lVar = null;
                }
            }
        }
        if (lVar == null) {
            return null;
        }
        try {
            try {
                if (b0Var.f16347d != 304 || bVar2 == null) {
                    z zVarB = r9.a.b(c().k(lVar.f11317a.f(0)));
                    try {
                        new r4.b(b0Var).a(zVarB);
                        lVar2 = q8.l.f13235a;
                        try {
                            zVarB.close();
                            th = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        try {
                            zVarB.close();
                        } catch (Throwable th5) {
                            d7.a.c(th4, th5);
                        }
                        th = th4;
                        lVar2 = null;
                    }
                    if (th != null) {
                        throw th;
                    }
                    d7.a.j(lVar2);
                    z zVarB2 = r9.a.b(c().k(lVar.f11317a.f(1)));
                    try {
                        o oVar = b0Var.f16350n;
                        d7.a.j(oVar);
                        lValueOf = Long.valueOf(((c0) oVar).f16375c.x(zVarB2));
                        try {
                            zVarB2.close();
                        } catch (Throwable th6) {
                            th2 = th6;
                        }
                    } catch (Throwable th7) {
                        try {
                            zVarB2.close();
                        } catch (Throwable th8) {
                            d7.a.c(th7, th8);
                        }
                        th2 = th7;
                        lValueOf = null;
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    d7.a.j(lValueOf);
                } else {
                    x9.a0 a0VarE = b0Var.e();
                    a0VarE.f16335f = l4.d.a(bVar2.f13454f, b0Var.f16349f).k();
                    b0 b0VarA = a0VarE.a();
                    z zVarB3 = r9.a.b(c().k(lVar.f11317a.f(0)));
                    try {
                        new r4.b(b0VarA).a(zVarB3);
                        lVar3 = q8.l.f13235a;
                        try {
                            zVarB3.close();
                        } catch (Throwable th9) {
                            th2 = th9;
                        }
                    } catch (Throwable th10) {
                        try {
                            zVarB3.close();
                        } catch (Throwable th11) {
                            d7.a.c(th10, th11);
                        }
                        th2 = th10;
                        lVar3 = null;
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    d7.a.j(lVar3);
                }
                l4.m mVarA = lVar.a();
                w4.e.a(b0Var);
                return mVarA;
            } catch (Exception e4) {
                Bitmap.Config[] configArr = w4.e.f16163a;
                try {
                    lVar.f11317a.d(false);
                } catch (Exception unused) {
                }
                throw e4;
            }
        } catch (Throwable th12) {
            w4.e.a(b0Var);
            throw th12;
        }
    }
}
