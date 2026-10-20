package g9;

import java.util.Random;
import u1.c1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f7312c = new c1(8);

    @Override // g9.a
    public final Random c() {
        Object obj = this.f7312c.get();
        d7.a.l(obj, "get(...)");
        return (Random) obj;
    }
}
