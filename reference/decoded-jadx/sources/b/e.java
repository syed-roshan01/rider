package b;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d9.j implements c9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f2299b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f2300c = new e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f2301d = new e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2302a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(0);
        this.f2302a = i10;
    }

    @Override // c9.a
    public final Object invoke() {
        switch (this.f2302a) {
            case 0:
                return UUID.randomUUID().toString();
            default:
                return null;
        }
    }
}
