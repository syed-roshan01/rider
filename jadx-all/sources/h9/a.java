package h9;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g9.a {
    @Override // g9.d
    public final int b() {
        return ThreadLocalRandom.current().nextInt(-3, 4);
    }

    @Override // g9.a
    public final Random c() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        d7.a.l(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
