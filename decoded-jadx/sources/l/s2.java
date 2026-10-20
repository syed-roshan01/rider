package l;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class s2 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10926a = new Object();

    public static void a(Context context) {
        if (context.getResources() instanceof u2) {
            return;
        }
        context.getResources();
        int i10 = m3.f10848a;
    }
}
