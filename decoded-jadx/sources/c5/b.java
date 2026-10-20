package c5;

import k0.c5;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d9.j implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f2965b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f2966c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f2967d = new b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2968a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(2);
        this.f2968a = i10;
    }

    public final void a(m0.m mVar, int i10) {
        switch (this.f2968a) {
            case 0:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                    }
                }
                c5.b("Account Disabled", null, e5.a.f5138n, 0L, null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 196998, 0, 131034);
                break;
            case 1:
                if ((i10 & 11) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    }
                }
                c5.b("Your account has been disabled or deleted by the administrator. Please contact support for assistance.", null, e5.a.f5136l, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 390, 0, 131066);
                break;
            default:
                if ((i10 & 11) == 2) {
                    m0.q qVar3 = (m0.q) mVar;
                    if (qVar3.G()) {
                        qVar3.U();
                    }
                }
                c5.b("\u26a0\ufe0f Blocked App Detected", null, e5.a.f5138n, 0L, null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 196998, 0, 131034);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f2968a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            case 1:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }
}
