package o7;

/* JADX INFO: loaded from: classes.dex */
public enum z implements com.google.protobuf.s0 {
    SERVER_VALUE_UNSPECIFIED(0),
    REQUEST_TIME(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12661a;

    z(int i10) {
        this.f12661a = i10;
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f12661a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
