package i7;

/* JADX INFO: loaded from: classes.dex */
public enum r0 implements com.google.crypto.tink.shaded.protobuf.d0 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8089a;

    r0(int i10) {
        this.f8089a = i10;
    }

    public static r0 a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f8089a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
