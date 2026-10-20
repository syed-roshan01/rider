package l5;

import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11360a;

    @Override // p8.a
    public final Object get() {
        int i10 = 0;
        int i11 = this.f11360a;
        switch (i11) {
            case 0:
                return new r(Executors.newSingleThreadExecutor(), i10);
            case 1:
                return "com.google.android.datatransport.events";
            case 2:
                return Integer.valueOf(r5.p.f13510d);
            case 3:
                r5.a aVar = r5.a.f13474f;
                if (aVar != null) {
                    return aVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 4:
                switch (i11) {
                    case 4:
                        return new t5.c(1);
                    default:
                        return new t5.c(0);
                }
            default:
                switch (i11) {
                    case 4:
                        return new t5.c(1);
                    default:
                        return new t5.c(0);
                }
        }
    }
}
