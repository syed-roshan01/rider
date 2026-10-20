package o2;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class d extends d9.j implements c9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f12459b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f12460c = new d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f12461d = new d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(0);
        this.f12462a = i10;
    }

    @Override // c9.a
    public final Object invoke() {
        int i10 = this.f12462a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return UUID.randomUUID();
                    default:
                        return UUID.randomUUID();
                }
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                switch (i10) {
                    case 0:
                        return UUID.randomUUID();
                    default:
                        return UUID.randomUUID();
                }
        }
    }
}
