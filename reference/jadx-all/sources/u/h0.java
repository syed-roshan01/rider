package u;

import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f14794a = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14795b = 0;

    public static final boolean a(KeyEvent keyEvent) {
        int iA = (int) (androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()) >> 32);
        return iA == 23 || iA == 66 || iA == 160;
    }
}
