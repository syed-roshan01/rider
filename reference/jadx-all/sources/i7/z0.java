package i7;

/* JADX INFO: loaded from: classes.dex */
public enum z0 implements com.google.crypto.tink.shaded.protobuf.d0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8105a;

    z0(int i10) {
        this.f8105a = i10;
    }

    public static z0 a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i10 == 1) {
            return SYMMETRIC;
        }
        if (i10 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i10 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i10 != 4) {
            return null;
        }
        return REMOTE;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f8105a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
