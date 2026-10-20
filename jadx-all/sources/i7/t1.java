package i7;

/* JADX INFO: loaded from: classes.dex */
public enum t1 implements com.google.crypto.tink.shaded.protobuf.d0 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8097a;

    t1(int i10) {
        this.f8097a = i10;
    }

    public static t1 a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f8097a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
