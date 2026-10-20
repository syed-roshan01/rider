package e;

import android.content.Intent;
import androidx.activity.p;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    @Override // e.b
    public final Intent a(p pVar, Object obj) {
        Intent intent = (Intent) obj;
        d7.a.m(pVar, "context");
        d7.a.m(intent, "input");
        return intent;
    }

    @Override // e.b
    public final Object c(Intent intent, int i10) {
        return new d.b(intent, i10);
    }
}
