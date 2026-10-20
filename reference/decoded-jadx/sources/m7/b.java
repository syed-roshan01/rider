package m7;

import com.google.protobuf.s0;

/* JADX INFO: loaded from: classes.dex */
public enum b implements s0 {
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_CONFIG_UNSPECIFIED(0),
    CONTAINS(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11886a;

    b(int i10) {
        this.f11886a = i10;
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f11886a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
