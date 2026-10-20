package m9;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11952b;

    public i(Object obj, int i10) {
        this.f11951a = i10;
        this.f11952b = obj;
    }

    @Override // m9.j
    public final void a(Throwable th) {
        int i10 = this.f11951a;
        Object obj = this.f11952b;
        switch (i10) {
            case 0:
                if (th != null) {
                    ((Future) obj).cancel(false);
                }
                break;
            case 1:
                ((o0) obj).a();
                break;
            default:
                ((c9.c) obj).invoke(th);
                break;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f11951a) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return lVar;
    }

    public final String toString() {
        int i10 = this.f11951a;
        Object obj = this.f11952b;
        switch (i10) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) obj) + ']';
            case 1:
                return "DisposeOnCancel[" + ((o0) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((c9.c) obj).getClass().getSimpleName() + '@' + e0.z(this) + ']';
        }
    }
}
