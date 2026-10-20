package v0;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d9.j implements c9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f15869b = new k(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f15870c = new k(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15871a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10) {
        super(0);
        this.f15871a = i10;
    }

    @Override // c9.a
    public final Object invoke() {
        switch (this.f15871a) {
            case 0:
                return new j(new LinkedHashMap());
            default:
                return null;
        }
    }
}
