package t1;

import com.google.firebase.remoteconfig.internal.Code;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f14415b = new f(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f14416c = new f(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f14417d = new f(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f14418e = new f(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f14419f = new f(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f14420n = new f(6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f14421o = new f(7);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f14422p = new f(8);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f14423q = new f(9);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f14424r = new f(10);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f14425s = new f(11);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f14426t = new f(12);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f14427u = new f(13);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f14428v = new f(14);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f14429w = new f(15);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f f14430x = new f(16);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f14431y = new f(17);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final f f14432z = new f(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(1);
        this.f14433a = i10;
    }

    public final void a(androidx.compose.ui.node.a aVar) {
        switch (this.f14433a) {
            case 12:
                if (aVar.C()) {
                    aVar.P(false);
                }
                break;
            case 13:
                if (aVar.C()) {
                    aVar.P(false);
                }
                break;
            case Code.UNAVAILABLE /* 14 */:
                if (aVar.C()) {
                    aVar.N(false);
                }
                break;
            case 15:
                if (aVar.C()) {
                    aVar.N(false);
                }
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                if (aVar.C()) {
                    androidx.compose.ui.node.a.O(aVar, false, 3);
                }
                break;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                if (aVar.C()) {
                    androidx.compose.ui.node.a.Q(aVar, false, 3);
                }
                break;
            default:
                if (aVar.C()) {
                    aVar.A();
                }
                break;
        }
    }

    public final void b(b bVar) {
        switch (this.f14433a) {
            case 2:
                bVar.d().f14371d = false;
                break;
            case 3:
                bVar.d().f14372e = bVar.d().f14371d;
                break;
            case 4:
                bVar.d().f14370c = false;
                break;
            case 5:
                bVar.d().f14371d = false;
                break;
            case 6:
                bVar.d().f14372e = bVar.d().f14371d;
                break;
            default:
                bVar.d().f14370c = false;
                break;
        }
    }

    public final void d(c1 c1Var) {
        switch (this.f14433a) {
            case 8:
                j1 j1Var = c1Var.H;
                if (j1Var != null) {
                    j1Var.invalidate();
                }
                break;
            default:
                if (c1Var.w()) {
                    z zVar = c1Var.D;
                    if (zVar != null) {
                        z zVar2 = c1.J;
                        zVar2.getClass();
                        zVar2.f14585a = zVar.f14585a;
                        zVar2.f14586b = zVar.f14586b;
                        zVar2.f14587c = zVar.f14587c;
                        zVar2.f14588d = zVar.f14588d;
                        zVar2.f14589e = zVar.f14589e;
                        zVar2.f14590f = zVar.f14590f;
                        zVar2.f14591g = zVar.f14591g;
                        zVar2.f14592h = zVar.f14592h;
                        zVar2.f14593i = zVar.f14593i;
                        c1Var.d1(true);
                        if (zVar2.f14585a != zVar.f14585a || zVar2.f14586b != zVar.f14586b || zVar2.f14587c != zVar.f14587c || zVar2.f14588d != zVar.f14588d || zVar2.f14589e != zVar.f14589e || zVar2.f14590f != zVar.f14590f || zVar2.f14591g != zVar.f14591g || zVar2.f14592h != zVar.f14592h || zVar2.f14593i != zVar.f14593i) {
                            androidx.compose.ui.node.a aVar = c1Var.f14395p;
                            n0 n0Var = aVar.D;
                            if (n0Var.f14507n > 0) {
                                if (n0Var.f14506m || n0Var.f14505l) {
                                    aVar.P(false);
                                }
                                n0Var.f14508o.s0();
                            }
                            l1 l1Var = aVar.f1744p;
                            if (l1Var != null) {
                                u1.w wVar = (u1.w) l1Var;
                                wVar.L.f14549d.f14449a.c(aVar);
                                aVar.I = true;
                                wVar.z(null);
                            }
                        }
                    } else {
                        c1Var.d1(true);
                    }
                }
                break;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f14433a;
        switch (i10) {
            case 0:
                d dVar = (d) obj;
                switch (i10) {
                    case 0:
                        dVar.getClass();
                        g.s(dVar);
                        return lVar;
                    default:
                        dVar.I0();
                        return lVar;
                }
            case 1:
                d dVar2 = (d) obj;
                switch (i10) {
                    case 0:
                        dVar2.getClass();
                        g.s(dVar2);
                        return lVar;
                    default:
                        dVar2.I0();
                        return lVar;
                }
            case 2:
                b((b) obj);
                return lVar;
            case 3:
                b((b) obj);
                return lVar;
            case 4:
                b((b) obj);
                return lVar;
            case 5:
                b((b) obj);
                return lVar;
            case 6:
                b((b) obj);
                return lVar;
            case 7:
                b((b) obj);
                return lVar;
            case 8:
                d((c1) obj);
                return lVar;
            case 9:
                d((c1) obj);
                return lVar;
            case 10:
                g1 g1Var = (g1) obj;
                if (g1Var.w()) {
                    g1Var.f14438a.G();
                }
                return lVar;
            case 11:
                d7.a.k(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((m1) obj).w());
            case 12:
                a((androidx.compose.ui.node.a) obj);
                return lVar;
            case 13:
                a((androidx.compose.ui.node.a) obj);
                return lVar;
            case Code.UNAVAILABLE /* 14 */:
                a((androidx.compose.ui.node.a) obj);
                return lVar;
            case 15:
                a((androidx.compose.ui.node.a) obj);
                return lVar;
            case Code.UNAUTHENTICATED /* 16 */:
                a((androidx.compose.ui.node.a) obj);
                return lVar;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                a((androidx.compose.ui.node.a) obj);
                return lVar;
            default:
                a((androidx.compose.ui.node.a) obj);
                return lVar;
        }
    }
}
