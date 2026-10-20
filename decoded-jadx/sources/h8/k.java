package h8;

import e8.c2;
import e8.g1;
import e8.j1;
import e8.l1;
import e8.r0;
import e8.s0;
import g8.d6;
import g8.i0;
import g8.o4;
import g8.p4;
import g8.q2;
import g8.s1;
import g8.v1;
import g8.y5;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends v1 implements u {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final e F;
    public final y5.o G;
    public final n H;
    public boolean I;
    public final o8.c J;
    public i3.v K;
    public int L;
    public final /* synthetic */ l M;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f7659w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f7660x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f7661y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ja.g f7662z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, int i10, y5 y5Var, Object obj, e eVar, y5.o oVar, n nVar, int i11) {
        super(i10, y5Var, lVar.f6648c);
        this.M = lVar;
        this.f7173t = q6.d.f13204b;
        this.f7662z = new ja.g();
        this.A = false;
        this.B = false;
        this.C = false;
        this.I = true;
        this.L = -1;
        y3.e.J(obj, "lock");
        this.f7660x = obj;
        this.F = eVar;
        this.G = oVar;
        this.H = nVar;
        this.D = i11;
        this.E = i11;
        this.f7659w = i11;
        o8.b.f12664a.getClass();
        this.J = o8.a.f12662a;
    }

    public static void l(k kVar, l1 l1Var, String str) {
        l lVar = kVar.M;
        String str2 = lVar.f7667m;
        boolean z10 = lVar.f7671q;
        n nVar = kVar.H;
        boolean z11 = nVar.B == null;
        j8.c cVar = f.f7620a;
        y3.e.J(l1Var, "headers");
        y3.e.J(str, "defaultPath");
        y3.e.J(str2, "authority");
        l1Var.a(s1.f7093i);
        l1Var.a(s1.f7094j);
        g1 g1Var = s1.f7095k;
        l1Var.a(g1Var);
        ArrayList arrayList = new ArrayList(l1Var.f5306b + 7);
        if (z11) {
            arrayList.add(f.f7621b);
        } else {
            arrayList.add(f.f7620a);
        }
        if (z10) {
            arrayList.add(f.f7623d);
        } else {
            arrayList.add(f.f7622c);
        }
        arrayList.add(new j8.c(j8.c.f8450h, str2));
        arrayList.add(new j8.c(j8.c.f8448f, str));
        arrayList.add(new j8.c(g1Var.f5284a, lVar.f7665k));
        arrayList.add(f.f7624e);
        arrayList.add(f.f7625f);
        Logger logger = d6.f6732a;
        Charset charset = r0.f5355a;
        int i10 = l1Var.f5306b * 2;
        byte[][] bArr = new byte[i10][];
        Object[] objArr = l1Var.f5305a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i10);
        } else {
            for (int i11 = 0; i11 < l1Var.f5306b; i11++) {
                int i12 = i11 * 2;
                bArr[i12] = l1Var.e(i11);
                int i13 = i12 + 1;
                Object obj = l1Var.f5305a[i13];
                if (!(obj instanceof byte[])) {
                    a7.a.w(obj);
                    throw null;
                }
                bArr[i13] = (byte[]) obj;
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15 += 2) {
            byte[] bArr2 = bArr[i15];
            byte[] bArr3 = bArr[i15 + 1];
            if (d6.a(bArr2, d6.f6733b)) {
                bArr[i14] = bArr2;
                bArr[i14 + 1] = r0.f5356b.c(bArr3).getBytes(q6.d.f13203a);
            } else {
                int length = bArr3.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length) {
                        bArr[i14] = bArr2;
                        bArr[i14 + 1] = bArr3;
                    } else {
                        byte b10 = bArr3[i16];
                        if (b10 < 32 || b10 > 126) {
                            StringBuilder sbR = a7.a.r("Metadata key=", new String(bArr2, q6.d.f13203a), ", value=");
                            sbR.append(Arrays.toString(bArr3));
                            sbR.append(" contains invalid ASCII characters");
                            d6.f6732a.warning(sbR.toString());
                        } else {
                            i16++;
                        }
                    }
                }
            }
            i14 += 2;
        }
        if (i14 != i10) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i14);
        }
        for (int i17 = 0; i17 < bArr.length; i17 += 2) {
            ja.j jVarL = ja.j.l(bArr[i17]);
            byte[] bArr4 = jVarL.f8540a;
            if (bArr4.length != 0 && bArr4[0] != 58) {
                arrayList.add(new j8.c(jVarL, ja.j.l(bArr[i17 + 1])));
            }
        }
        kVar.f7661y = arrayList;
        c2 c2Var = nVar.f7693v;
        if (c2Var != null) {
            lVar.f7668n.i(c2Var, i0.f6842d, true, new l1());
            return;
        }
        if (nVar.f7685n.size() < nVar.D) {
            nVar.u(lVar);
            return;
        }
        nVar.E.add(lVar);
        if (!nVar.f7697z) {
            nVar.f7697z = true;
            q2 q2Var = nVar.G;
            if (q2Var != null) {
                q2Var.b();
            }
        }
        if (lVar.f6650e) {
            nVar.P.f(lVar, true);
        }
    }

    public static void m(k kVar, ja.g gVar, boolean z10, boolean z11) {
        if (kVar.C) {
            return;
        }
        if (!kVar.I) {
            y3.e.N("streamId should be set", kVar.L != -1);
            kVar.G.a(z10, kVar.K, gVar, z11);
        } else {
            kVar.f7662z.b0(gVar, (int) gVar.f8534b);
            kVar.A |= z10;
            kVar.B |= z11;
        }
    }

    @Override // g8.v3
    public final void b(Throwable th) {
        n(new l1(), c2.d(th), true);
    }

    @Override // g8.v3
    public final void c(boolean z10) {
        boolean z11 = this.f6637o;
        i0 i0Var = i0.f6839a;
        if (z11) {
            this.H.j(this.L, null, i0Var, false, null, null);
        } else {
            this.H.j(this.L, null, i0Var, false, j8.a.CANCEL, null);
        }
        y3.e.N("status should have been reported on deframer closed", this.f6638p);
        this.f6635m = true;
        if (this.f6639q && z10) {
            h(new l1(), c2.f5223l.g("Encountered end-of-stream mid-frame"), true);
        }
        k.e eVar = this.f6636n;
        if (eVar != null) {
            eVar.run();
            this.f6636n = null;
        }
    }

    @Override // g8.v3
    public final void d(int i10) {
        int i11 = this.E - i10;
        this.E = i11;
        float f10 = i11;
        int i12 = this.f7659w;
        if (f10 <= i12 * 0.5f) {
            int i13 = i12 - i11;
            this.D += i13;
            this.E = i11 + i13;
            this.F.N(this.L, i13);
        }
    }

    public final void n(l1 l1Var, c2 c2Var, boolean z10) {
        if (this.C) {
            return;
        }
        this.C = true;
        if (!this.I) {
            this.H.j(this.L, c2Var, i0.f6839a, z10, j8.a.CANCEL, l1Var);
            return;
        }
        n nVar = this.H;
        LinkedList linkedList = nVar.E;
        l lVar = this.M;
        linkedList.remove(lVar);
        nVar.o(lVar);
        this.f7661y = null;
        this.f7662z.a();
        this.I = false;
        if (l1Var == null) {
            l1Var = new l1();
        }
        h(l1Var, c2Var, true);
    }

    public final void o(Runnable runnable) {
        synchronized (this.f7660x) {
            runnable.run();
        }
    }

    public final void p(ja.g gVar, boolean z10) throws Throwable {
        long j10 = gVar.f8534b;
        int i10 = this.D - ((int) j10);
        this.D = i10;
        if (i10 < 0) {
            this.F.o(this.L, j8.a.FLOW_CONTROL_ERROR);
            this.H.j(this.L, c2.f5223l.g("Received data size exceeded our receiving window size"), i0.f6839a, false, null, null);
            return;
        }
        r rVar = new r(gVar);
        c2 c2Var = this.f7171r;
        boolean z11 = false;
        if (c2Var != null) {
            Charset charset = this.f7173t;
            o4 o4Var = p4.f7038a;
            y3.e.J(charset, "charset");
            int i11 = (int) gVar.f8534b;
            byte[] bArr = new byte[i11];
            rVar.Z(bArr, 0, i11);
            this.f7171r = c2Var.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            rVar.close();
            if (this.f7171r.f5228b.length() > 1000 || z10) {
                n(this.f7172s, this.f7171r, false);
                return;
            }
            return;
        }
        if (!this.f7174u) {
            n(new l1(), c2.f5223l.g("headers not received before payload"), false);
            return;
        }
        int i12 = (int) j10;
        try {
            if (this.f6638p) {
                g8.b.f6647i.log(Level.INFO, "Received data on closed stream");
                rVar.close();
            } else {
                try {
                    this.f6749a.e(rVar);
                } catch (Throwable th) {
                    try {
                        b(th);
                    } catch (Throwable th2) {
                        th = th2;
                        if (z11) {
                            rVar.close();
                        }
                        throw th;
                    }
                }
            }
            if (z10) {
                if (i12 > 0) {
                    this.f7171r = c2.f5223l.g("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f7171r = c2.f5223l.g("Received unexpected EOS on empty DATA frame from server");
                }
                l1 l1Var = new l1();
                this.f7172s = l1Var;
                h(l1Var, this.f7171r, false);
            }
        } catch (Throwable th3) {
            th = th3;
            z11 = true;
        }
    }

    public final void q(List list, boolean z10) {
        c2 c2VarK;
        StringBuilder sb;
        c2 c2VarA;
        j1 j1Var = v1.f7170v;
        if (z10) {
            byte[][] bArrA = w.a(list);
            int length = bArrA.length / 2;
            l1 l1Var = new l1();
            l1Var.f5306b = length;
            l1Var.f5305a = bArrA;
            if (this.f7171r == null && !this.f7174u) {
                c2 c2VarK2 = v1.k(l1Var);
                this.f7171r = c2VarK2;
                if (c2VarK2 != null) {
                    this.f7172s = l1Var;
                }
            }
            c2 c2Var = this.f7171r;
            if (c2Var != null) {
                c2 c2VarA2 = c2Var.a("trailers: " + l1Var);
                this.f7171r = c2VarA2;
                n(this.f7172s, c2VarA2, false);
                return;
            }
            j1 j1Var2 = s0.f5360b;
            c2 c2Var2 = (c2) l1Var.c(j1Var2);
            if (c2Var2 != null) {
                c2VarA = c2Var2.g((String) l1Var.c(s0.f5359a));
            } else if (this.f7174u) {
                c2VarA = c2.f5218g.g("missing GRPC status in response");
            } else {
                Integer num = (Integer) l1Var.c(j1Var);
                c2VarA = (num != null ? s1.g(num.intValue()) : c2.f5223l.g("missing HTTP status code")).a("missing GRPC status, inferred error from HTTP status code");
            }
            l1Var.a(j1Var);
            l1Var.a(j1Var2);
            l1Var.a(s0.f5359a);
            if (this.f6638p) {
                g8.b.f6647i.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{c2VarA, l1Var});
                return;
            }
            for (d0 d0Var : this.f6630h.f7292a) {
                ((e8.p) d0Var).q0(l1Var);
            }
            h(l1Var, c2VarA, false);
            return;
        }
        byte[][] bArrA2 = w.a(list);
        int length2 = bArrA2.length / 2;
        l1 l1Var2 = new l1();
        l1Var2.f5306b = length2;
        l1Var2.f5305a = bArrA2;
        c2 c2Var3 = this.f7171r;
        if (c2Var3 != null) {
            this.f7171r = c2Var3.a("headers: " + l1Var2);
            return;
        }
        try {
            if (this.f7174u) {
                c2VarK = c2.f5223l.g("Received headers twice");
                this.f7171r = c2VarK;
                sb = new StringBuilder("headers: ");
            } else {
                Integer num2 = (Integer) l1Var2.c(j1Var);
                if (num2 == null || num2.intValue() < 100 || num2.intValue() >= 200) {
                    this.f7174u = true;
                    c2VarK = v1.k(l1Var2);
                    this.f7171r = c2VarK;
                    if (c2VarK != null) {
                        sb = new StringBuilder("headers: ");
                    } else {
                        l1Var2.a(j1Var);
                        l1Var2.a(s0.f5360b);
                        l1Var2.a(s0.f5359a);
                        g(l1Var2);
                        c2VarK = this.f7171r;
                        if (c2VarK == null) {
                            return;
                        } else {
                            sb = new StringBuilder("headers: ");
                        }
                    }
                } else {
                    c2VarK = this.f7171r;
                    if (c2VarK == null) {
                        return;
                    } else {
                        sb = new StringBuilder("headers: ");
                    }
                }
            }
            sb.append(l1Var2);
            this.f7171r = c2VarK.a(sb.toString());
            this.f7172s = l1Var2;
            this.f7173t = v1.j(l1Var2);
        } catch (Throwable th) {
            c2 c2Var4 = this.f7171r;
            if (c2Var4 != null) {
                this.f7171r = c2Var4.a("headers: " + l1Var2);
                this.f7172s = l1Var2;
                this.f7173t = v1.j(l1Var2);
            }
            throw th;
        }
    }
}
