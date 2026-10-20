package i7;

/* JADX INFO: loaded from: classes.dex */
public enum b1 implements com.google.crypto.tink.shaded.protobuf.d0 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8079a;

    b1(int i10) {
        this.f8079a = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f8079a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
