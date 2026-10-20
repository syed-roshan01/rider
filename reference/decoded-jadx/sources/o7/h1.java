package o7;

/* JADX INFO: loaded from: classes.dex */
public enum h1 implements com.google.protobuf.s0 {
    OPERATOR_UNSPECIFIED(0),
    LESS_THAN(1),
    LESS_THAN_OR_EQUAL(2),
    GREATER_THAN(3),
    GREATER_THAN_OR_EQUAL(4),
    EQUAL(5),
    NOT_EQUAL(6),
    ARRAY_CONTAINS(7),
    IN(8),
    ARRAY_CONTAINS_ANY(9),
    NOT_IN(10),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12621a;

    h1(int i10) {
        this.f12621a = i10;
    }

    public static h1 a(int i10) {
        switch (i10) {
            case 0:
                return OPERATOR_UNSPECIFIED;
            case 1:
                return LESS_THAN;
            case 2:
                return LESS_THAN_OR_EQUAL;
            case 3:
                return GREATER_THAN;
            case 4:
                return GREATER_THAN_OR_EQUAL;
            case 5:
                return EQUAL;
            case 6:
                return NOT_EQUAL;
            case 7:
                return ARRAY_CONTAINS;
            case 8:
                return IN;
            case 9:
                return ARRAY_CONTAINS_ANY;
            case 10:
                return NOT_IN;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f12621a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
