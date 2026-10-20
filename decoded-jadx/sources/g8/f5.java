package g8;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class f5 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5 f6764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f6765b;

    public f5(y2 y2Var, g5 g5Var) {
        this.f6765b = y2Var;
        this.f6764a = g5Var;
    }

    @Override // g8.b6
    public final void a(a6 a6Var) {
        c5 c5Var = this.f6765b.f7277o;
        y3.e.N("Headers should be received prior to messages.", c5Var.f6706f != null);
        if (c5Var.f6706f == this.f6764a) {
            this.f6765b.f7265c.execute(new x1(27, this, a6Var));
            return;
        }
        Logger logger = s1.f7085a;
        while (true) {
            InputStream next = a6Var.next();
            if (next == null) {
                return;
            } else {
                s1.b(next);
            }
        }
    }

    @Override // g8.b6
    public final void b() {
        y2 y2Var = this.f6765b;
        if (y2Var.k()) {
            y2Var.f7265c.execute(new e5(this, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01df  */
    @Override // g8.j0
    public final void c(e8.c2 c2Var, i0 i0Var, e8.l1 l1Var) {
        boolean z10;
        a5 a5Var;
        y2 y2Var;
        r7.h hVar;
        synchronized (this.f6765b.f7271i) {
            y2 y2Var2 = this.f6765b;
            y2Var2.f7277o = y2Var2.f7277o.d(this.f6764a);
            this.f6765b.f7276n.b(c2Var.f5227a);
        }
        int i10 = 0;
        if (this.f6765b.f7280r.decrementAndGet() == Integer.MIN_VALUE) {
            this.f6765b.f7265c.execute(new e5(this, i10));
            return;
        }
        g5 g5Var = this.f6764a;
        if (g5Var.f6819c) {
            b3.a1 a1VarS = this.f6765b.s(g5Var);
            if (a1VarS != null) {
                a1VarS.run();
            }
            if (this.f6765b.f7277o.f6706f == this.f6764a) {
                this.f6765b.y(c2Var, i0Var, l1Var);
                return;
            }
            return;
        }
        i0 i0Var2 = i0.f6842d;
        if (i0Var == i0Var2 && this.f6765b.f7279q.incrementAndGet() > 1000) {
            b3.a1 a1VarS2 = this.f6765b.s(this.f6764a);
            if (a1VarS2 != null) {
                a1VarS2.run();
            }
            if (this.f6765b.f7277o.f6706f == this.f6764a) {
                this.f6765b.y(e8.c2.f5223l.g("Too many transparent retries. Might be a bug in gRPC").f(new e8.e2(c2Var)), i0Var, l1Var);
                return;
            }
            return;
        }
        if (this.f6765b.f7277o.f6706f == null) {
            int i11 = 1;
            if (i0Var == i0Var2 || (i0Var == i0.f6840b && this.f6765b.f7278p.compareAndSet(false, true))) {
                g5 g5VarT = this.f6765b.t(this.f6764a.f6820d, true);
                if (g5VarT == null) {
                    return;
                }
                y2 y2Var3 = this.f6765b;
                if (y2Var3.f7270h) {
                    synchronized (y2Var3.f7271i) {
                        y2 y2Var4 = this.f6765b;
                        y2Var4.f7277o = y2Var4.f7277o.c(this.f6764a, g5VarT);
                    }
                }
                this.f6765b.f7264b.execute(new d5(this, g5VarT, i11));
                return;
            }
            if (i0Var == i0.f6841c) {
                y2 y2Var5 = this.f6765b;
                if (y2Var5.f7270h) {
                    y2Var5.w();
                }
            } else {
                this.f6765b.f7278p.set(true);
                y2 y2Var6 = this.f6765b;
                Integer numValueOf = null;
                if (y2Var6.f7270h) {
                    String str = (String) l1Var.c(y2.F);
                    if (str != null) {
                        try {
                            numValueOf = Integer.valueOf(str);
                        } catch (NumberFormatException unused) {
                            numValueOf = -1;
                        }
                    }
                    y2 y2Var7 = this.f6765b;
                    boolean z11 = !y2Var7.f7269g.f7153c.contains(c2Var.f5227a);
                    boolean z12 = (y2Var7.f7275m == null || (z11 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !y2Var7.f7275m.a();
                    if (!z11 && !z12 && !c2Var.e() && numValueOf != null && numValueOf.intValue() > 0) {
                        numValueOf = 0;
                    }
                    if (!z11 && !z12) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        y2.r(this.f6765b, numValueOf);
                    }
                    synchronized (this.f6765b.f7271i) {
                        try {
                            y2 y2Var8 = this.f6765b;
                            y2Var8.f7277o = y2Var8.f7277o.b(this.f6764a);
                            if (i10 != 0) {
                                y2 y2Var9 = this.f6765b;
                                if (!y2Var9.x(y2Var9.f7277o)) {
                                    if (!this.f6765b.f7277o.f6704d.isEmpty()) {
                                    }
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    i5 i5Var = y2Var6.f7268f;
                    long nanos = 0;
                    if (i5Var == null) {
                        a5Var = new a5(0L, false);
                    } else {
                        boolean zContains = i5Var.f6860f.contains(c2Var.f5227a);
                        String str2 = (String) l1Var.c(y2.F);
                        if (str2 != null) {
                            try {
                                numValueOf = Integer.valueOf(str2);
                            } catch (NumberFormatException unused2) {
                                numValueOf = -1;
                            }
                        }
                        boolean z13 = (y2Var6.f7275m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !y2Var6.f7275m.a();
                        if (y2Var6.f7268f.f6855a <= this.f6764a.f6820d + 1 || z13) {
                            z10 = false;
                        } else if (numValueOf == null) {
                            if (zContains) {
                                nanos = (long) (y2.H.nextDouble() * y2Var6.f7286x);
                                double d10 = y2Var6.f7286x;
                                i5 i5Var2 = y2Var6.f7268f;
                                y2Var6.f7286x = Math.min((long) (d10 * i5Var2.f6858d), i5Var2.f6857c);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else if (numValueOf.intValue() >= 0) {
                            nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                            y2Var6.f7286x = y2Var6.f7268f.f6856b;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        a5Var = new a5(nanos, z10);
                    }
                    if (a5Var.f6645a) {
                        g5 g5VarT2 = this.f6765b.t(this.f6764a.f6820d + 1, false);
                        if (g5VarT2 == null) {
                            return;
                        }
                        synchronized (this.f6765b.f7271i) {
                            y2Var = this.f6765b;
                            hVar = new r7.h(y2Var.f7271i);
                            y2Var.f7284v = hVar;
                        }
                        hVar.e(y2Var.f7266d.schedule(new d5(this, g5VarT2, i10), a5Var.f6646b, TimeUnit.NANOSECONDS));
                        return;
                    }
                }
            }
        }
        b3.a1 a1VarS3 = this.f6765b.s(this.f6764a);
        if (a1VarS3 != null) {
            a1VarS3.run();
        }
        if (this.f6765b.f7277o.f6706f == this.f6764a) {
            this.f6765b.y(c2Var, i0Var, l1Var);
        }
    }

    @Override // g8.j0
    public final void d(e8.l1 l1Var) {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        if (this.f6764a.f6820d > 0) {
            e8.g1 g1Var = y2.E;
            l1Var.a(g1Var);
            l1Var.f(g1Var, String.valueOf(this.f6764a.f6820d));
        }
        y2 y2Var = this.f6765b;
        g5 g5Var = this.f6764a;
        e8.g1 g1Var2 = y2.E;
        b3.a1 a1VarS = y2Var.s(g5Var);
        if (a1VarS != null) {
            a1VarS.run();
        }
        if (this.f6765b.f7277o.f6706f == this.f6764a) {
            h5 h5Var = this.f6765b.f7275m;
            if (h5Var != null) {
                do {
                    atomicInteger = h5Var.f6837d;
                    i10 = atomicInteger.get();
                    i11 = h5Var.f6834a;
                    if (i10 == i11) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i10, Math.min(h5Var.f6836c + i10, i11)));
            }
            this.f6765b.f7265c.execute(new x1(26, this, l1Var));
        }
    }
}
