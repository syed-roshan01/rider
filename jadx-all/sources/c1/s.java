package c1;

/* JADX INFO: loaded from: classes.dex */
public final class s extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f2920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.c f2922e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(p pVar, p pVar2, int i10, c9.c cVar, int i11) {
        super(1);
        this.f2918a = i11;
        this.f2919b = pVar;
        this.f2920c = pVar2;
        this.f2921d = i10;
        this.f2922e = cVar;
    }

    public final Boolean a(r1.e eVar) {
        int i10 = this.f2918a;
        c9.c cVar = this.f2922e;
        int i11 = this.f2921d;
        p pVar = this.f2920c;
        p pVar2 = this.f2919b;
        switch (i10) {
            case 0:
                Boolean boolValueOf = Boolean.valueOf(androidx.compose.ui.focus.a.G(pVar2, pVar, i11, cVar));
                if (boolValueOf.booleanValue() || !eVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                Boolean boolValueOf2 = Boolean.valueOf(androidx.compose.ui.focus.a.H(pVar2, pVar, i11, cVar));
                if (boolValueOf2.booleanValue() || !eVar.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2918a) {
            case 0:
                break;
        }
        return a((r1.e) obj);
    }
}
