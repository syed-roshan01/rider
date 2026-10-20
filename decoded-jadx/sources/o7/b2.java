package o7;

/* JADX INFO: loaded from: classes.dex */
public enum b2 implements com.google.protobuf.s0 {
    NO_CHANGE(0),
    ADD(1),
    REMOVE(2),
    CURRENT(3),
    RESET(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12571a;

    b2(int i10) {
        this.f12571a = i10;
    }

    public static b2 a(int i10) {
        if (i10 == 0) {
            return NO_CHANGE;
        }
        if (i10 == 1) {
            return ADD;
        }
        if (i10 == 2) {
            return REMOVE;
        }
        if (i10 == 3) {
            return CURRENT;
        }
        if (i10 != 4) {
            return null;
        }
        return RESET;
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f12571a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
