package androidx.profileinstaller;

import android.content.Context;
import d4.b;
import java.util.Collections;
import java.util.List;
import u1.i0;
import x9.v;
import y3.g;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // d4.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // d4.b
    public final Object b(Context context) {
        g.a(new i0(4, this, context.getApplicationContext()));
        return new v(20, (Object) null);
    }
}
