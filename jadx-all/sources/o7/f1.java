package o7;

/* JADX INFO: loaded from: classes.dex */
public enum f1 implements com.google.protobuf.s0 {
    DIRECTION_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12607a;

    f1(int i10) {
        this.f12607a = i10;
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f12607a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
