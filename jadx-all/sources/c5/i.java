package c5;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f2988b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Activity activity, int i10) {
        super(0);
        this.f2987a = i10;
        this.f2988b = activity;
    }

    @Override // c9.a
    public final Object invoke() {
        q8.l lVar = q8.l.f13235a;
        Activity activity = this.f2988b;
        int i10 = this.f2987a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        if (activity != null) {
                            activity.finishAffinity();
                        }
                        break;
                    default:
                        if (activity != null) {
                            activity.finishAffinity();
                        }
                        break;
                }
                break;
            default:
                switch (i10) {
                    case 0:
                        if (activity != null) {
                            activity.finishAffinity();
                        }
                        break;
                    default:
                        if (activity != null) {
                            activity.finishAffinity();
                        }
                        break;
                }
                break;
        }
        return lVar;
    }
}
