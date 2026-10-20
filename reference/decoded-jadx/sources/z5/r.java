package z5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f17273c;

    public r(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f17273c = bArr;
    }

    @Override // z5.q
    public final byte[] b() {
        return this.f17273c;
    }
}
