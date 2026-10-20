package x2;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
