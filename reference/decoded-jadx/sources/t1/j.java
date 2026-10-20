package t1;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d9.j implements c9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f14451b = new j(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f14452c = new j(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14453a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10) {
        super(0);
        this.f14453a = i10;
    }

    @Override // c9.a
    public final Object invoke() {
        int i10 = this.f14453a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return new androidx.compose.ui.node.a(true, 2);
                    default:
                        return new androidx.compose.ui.node.a(false, 3);
                }
            case 1:
                return new LinkedHashMap();
            default:
                switch (i10) {
                    case 0:
                        return new androidx.compose.ui.node.a(true, 2);
                    default:
                        return new androidx.compose.ui.node.a(false, 3);
                }
        }
    }
}
