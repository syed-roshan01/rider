package j3;

import java.nio.ByteBuffer;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f8336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8338d;

    public c() {
        if (v.f16468b == null) {
            v.f16468b = new v(2);
        }
    }

    public final int a(int i10) {
        if (i10 < this.f8338d) {
            return this.f8336b.getShort(this.f8337c + i10);
        }
        return 0;
    }
}
