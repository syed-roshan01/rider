package h8;

import e8.d1;
import e8.e1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends e1 {
    @Override // e8.e1
    public d1 a(String str) {
        return i.forTarget(str);
    }

    @Override // e8.e1
    public boolean b() {
        return true;
    }

    @Override // e8.e1
    public int c() {
        try {
            Class.forName("android.app.Application", false, j.class.getClassLoader());
            return 8;
        } catch (Exception unused) {
            return 3;
        }
    }
}
