package n9;

import android.os.Looper;
import java.util.List;
import m9.s1;
import r9.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    @Override // r9.n
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // r9.n
    public s1 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // r9.n
    public int c() {
        return 1073741823;
    }
}
