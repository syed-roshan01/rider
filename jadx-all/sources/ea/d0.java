package ea;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5452a;

    public d0(b bVar) {
        super("stream was reset: " + bVar);
        this.f5452a = bVar;
    }
}
