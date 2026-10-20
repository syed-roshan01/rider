package ba;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IOException f2830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f2831b;

    public m(IOException iOException) {
        super(iOException);
        this.f2830a = iOException;
        this.f2831b = iOException;
    }
}
