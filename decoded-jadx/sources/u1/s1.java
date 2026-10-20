package u1;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0.m3 f15271a = new m0.m3(q0.f15226r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0.m3 f15272b = new m0.m3(q0.f15227s);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.m3 f15273c = new m0.m3(q0.f15228t);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0.m3 f15274d = new m0.m3(q0.f15229u);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0.m3 f15275e = new m0.m3(q0.f15230v);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0.m3 f15276f = new m0.m3(q0.f15231w);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m0.m3 f15277g = new m0.m3(q0.f15233y);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m0.m3 f15278h = new m0.m3(q0.f15232x);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m0.m3 f15279i = new m0.m3(q0.f15234z);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m0.m3 f15280j = new m0.m3(q0.A);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m0.m3 f15281k = new m0.m3(q0.B);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m0.m3 f15282l = new m0.m3(q0.E);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m0.m3 f15283m = new m0.m3(q0.D);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m0.m3 f15284n = new m0.m3(q0.F);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m0.m3 f15285o = new m0.m3(q0.G);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m0.m3 f15286p = new m0.m3(q0.H);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m0.m3 f15287q = new m0.m3(q0.I);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m0.m3 f15288r = new m0.m3(q0.C);

    public static final void a(t1.l1 l1Var, w2 w2Var, c9.e eVar, m0.m mVar, int i10) {
        int i11;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(874662829);
        if ((i10 & 14) == 0) {
            i11 = (qVar.g(l1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= qVar.g(w2Var) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= qVar.i(eVar) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && qVar.G()) {
            qVar.U();
        } else {
            w wVar = (w) l1Var;
            m0.v1 v1VarB = f15271a.b(wVar.getAccessibilityManager());
            m0.v1 v1VarB2 = f15272b.b(wVar.getAutofill());
            m0.v1 v1VarB3 = f15273c.b(wVar.getAutofillTree());
            m0.v1 v1VarB4 = f15274d.b(wVar.m8439getClipboardManager());
            m0.v1 v1VarB5 = f15275e.b(wVar.getDensity());
            m0.v1 v1VarB6 = f15276f.b(wVar.getFocusOwner());
            f2.c fontLoader = wVar.getFontLoader();
            m0.m3 m3Var = f15277g;
            m3Var.getClass();
            m0.v1 v1Var = new m0.v1(m3Var, fontLoader, false);
            f2.d fontFamilyResolver = wVar.getFontFamilyResolver();
            m0.m3 m3Var2 = f15278h;
            m3Var2.getClass();
            f6.a.c(new m0.v1[]{v1VarB, v1VarB2, v1VarB3, v1VarB4, v1VarB5, v1VarB6, v1Var, new m0.v1(m3Var2, fontFamilyResolver, false), f15279i.b(wVar.getHapticFeedBack()), f15280j.b(wVar.getInputModeManager()), f15281k.b(wVar.getLayoutDirection()), f15282l.b(wVar.getTextInputService()), f15283m.b(wVar.getSoftwareKeyboardController()), f15284n.b(wVar.getTextToolbar()), f15285o.b(w2Var), f15286p.b(wVar.getViewConfiguration()), f15287q.b(wVar.getWindowInfo()), f15288r.b(wVar.getPointerIconService())}, eVar, qVar, ((i11 >> 3) & 112) | 8);
        }
        m0.x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new a0.g0(i10, 6, l1Var, w2Var, eVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
