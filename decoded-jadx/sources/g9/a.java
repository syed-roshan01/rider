package g9;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends d {
    @Override // g9.d
    public final int a() {
        return c().nextInt();
    }

    public abstract Random c();
}
