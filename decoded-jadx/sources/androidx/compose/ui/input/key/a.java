package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import c9.c;
import u.s;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final long a(int i10) {
        long j10 = (((long) i10) << 32) | (((long) 0) & 4294967295L);
        int i11 = m1.a.f11784n;
        return j10;
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final o c(c cVar) {
        return new KeyInputElement(cVar, null);
    }

    public static final o d(o oVar, s sVar) {
        return oVar.j(new KeyInputElement(null, sVar));
    }
}
