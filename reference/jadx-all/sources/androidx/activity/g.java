package androidx.activity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1385b;

    public /* synthetic */ g(p pVar, int i10) {
        this.f1384a = i10;
        this.f1385b = pVar;
    }

    @Override // c.b
    public final void a(Context context) {
        int i10 = this.f1384a;
        p pVar = this.f1385b;
        switch (i10) {
            case 0:
                p.b(pVar);
                break;
            default:
                androidx.fragment.app.g0.c((androidx.fragment.app.g0) pVar);
                break;
        }
    }
}
