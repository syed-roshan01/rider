package m1;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f11786a;

    public /* synthetic */ b(KeyEvent keyEvent) {
        this.f11786a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return d7.a.d(this.f11786a, ((b) obj).f11786a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11786a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f11786a + ')';
    }
}
