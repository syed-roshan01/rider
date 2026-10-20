package i1;

import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d9.j implements c9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f7800b = new g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f7801c = new g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7802a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(0);
        this.f7802a = i10;
    }

    @Override // c9.a
    public final Object invoke() {
        switch (this.f7802a) {
            case 0:
                return new e1.j(new PathMeasure());
            default:
                return q8.l.f13235a;
        }
    }
}
