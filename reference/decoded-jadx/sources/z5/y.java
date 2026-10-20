package z5;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class y extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable f17295e;

    public /* synthetic */ y(o oVar) {
        super(false, null, null);
        this.f17295e = oVar;
    }

    @Override // z5.z
    public final String a() {
        try {
            return (String) this.f17295e.call();
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }
}
