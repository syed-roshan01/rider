package m4;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q8.c f11839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8.c f11840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11841c;

    public i(q8.i iVar, q8.i iVar2, boolean z10) {
        this.f11839a = iVar;
        this.f11840b = iVar2;
        this.f11841c = z10;
    }

    @Override // m4.f
    public final g a(Object obj, s4.n nVar, i4.i iVar) {
        Uri uri = (Uri) obj;
        if (d7.a.d(uri.getScheme(), "http") || d7.a.d(uri.getScheme(), "https")) {
            return new l(uri.toString(), nVar, this.f11839a, this.f11840b, this.f11841c);
        }
        return null;
    }
}
