package o7;

/* JADX INFO: loaded from: classes.dex */
public enum d1 implements com.google.protobuf.s0 {
    OPERATOR_UNSPECIFIED(0),
    AND(1),
    OR(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12600a;

    d1(int i10) {
        this.f12600a = i10;
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f12600a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
