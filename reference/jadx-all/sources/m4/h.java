package m4;

import android.webkit.MimeTypeMap;
import ja.x;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f11838a;

    public h(File file) {
        this.f11838a = file;
    }

    @Override // m4.g
    public final Object a(u8.e eVar) {
        String str = x.f8577b;
        File file = this.f11838a;
        k4.n nVar = new k4.n(fa.l.j(file), ja.m.f8558a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        d7.a.l(name, "getName(...)");
        return new n(nVar, singleton.getMimeTypeFromExtension(l9.i.k1(name, '.', "")), k4.f.f9756c);
    }
}
