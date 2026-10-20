package o7;

/* JADX INFO: loaded from: classes.dex */
public enum s1 implements com.google.protobuf.s0 {
    OPERATOR_UNSPECIFIED(0),
    IS_NAN(2),
    IS_NULL(3),
    IS_NOT_NAN(4),
    IS_NOT_NULL(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12656a;

    s1(int i10) {
        this.f12656a = i10;
    }

    public static s1 a(int i10) {
        if (i10 == 0) {
            return OPERATOR_UNSPECIFIED;
        }
        if (i10 == 2) {
            return IS_NAN;
        }
        if (i10 == 3) {
            return IS_NULL;
        }
        if (i10 == 4) {
            return IS_NOT_NAN;
        }
        if (i10 != 5) {
            return null;
        }
        return IS_NOT_NULL;
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f12656a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
