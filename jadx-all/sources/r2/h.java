package r2;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
