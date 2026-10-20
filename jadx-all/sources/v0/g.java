package v0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f15858b = new g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f15859c = new g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15860a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f15860a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f15860a) {
            case 0:
                return new j((Map) obj);
            default:
                return obj;
        }
    }
}
