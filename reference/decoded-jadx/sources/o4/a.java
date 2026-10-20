package o4;

import java.io.File;
import s4.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12521a;

    public a(boolean z10) {
        this.f12521a = z10;
    }

    @Override // o4.b
    public final String a(Object obj, n nVar) {
        File file = (File) obj;
        if (!this.f12521a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
