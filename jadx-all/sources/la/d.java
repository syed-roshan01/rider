package la;

import com.auto.accept.service.RideAcceptorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11413d;

    public /* synthetic */ d(int i10, int i11, RideAcceptorService rideAcceptorService) {
        this.f11410a = 2;
        this.f11412c = i10;
        this.f11413d = i11;
        this.f11411b = rideAcceptorService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f11410a;
        int i11 = this.f11413d;
        Object obj = this.f11411b;
        switch (i10) {
            case 0:
                ((c5.f) ((f) obj).f11414a).a(i11);
                break;
            case 1:
                ((c5.f) ((f) obj).f11414a).a(i11);
                break;
            default:
                RideAcceptorService.m1539(this.f11412c, i11, (RideAcceptorService) obj);
                break;
        }
    }

    public /* synthetic */ d(f fVar, int i10, int i11, int i12) {
        this.f11410a = i12;
        this.f11411b = fVar;
        this.f11412c = i10;
        this.f11413d = i11;
    }
}
