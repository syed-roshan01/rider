package x2;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f16300a;

    public o(Object obj) {
        this.f16300a = (LocaleList) obj;
    }

    @Override // x2.n
    public final Object a() {
        return this.f16300a;
    }

    public final boolean equals(Object obj) {
        return this.f16300a.equals(((n) obj).a());
    }

    public final int hashCode() {
        return this.f16300a.hashCode();
    }

    public final String toString() {
        return this.f16300a.toString();
    }
}
