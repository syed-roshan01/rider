package m7;

import com.google.protobuf.s0;

/* JADX INFO: loaded from: classes.dex */
public enum d implements s0 {
    ORDER_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11892a;

    d(int i10) {
        this.f11892a = i10;
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f11892a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
