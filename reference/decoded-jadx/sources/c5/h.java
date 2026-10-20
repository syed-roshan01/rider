package c5;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.p f2986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(androidx.activity.p pVar, int i10) {
        super(0);
        this.f2985a = i10;
        this.f2986b = pVar;
    }

    @Override // c9.a
    public final Object invoke() {
        int i10 = this.f2985a;
        androidx.activity.p pVar = this.f2986b;
        switch (i10) {
            case 0:
                return pVar.getDefaultViewModelProviderFactory();
            default:
                return pVar.getViewModelStore();
        }
    }
}
