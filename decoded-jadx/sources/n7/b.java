package n7;

import com.google.protobuf.s0;

/* JADX INFO: loaded from: classes.dex */
public enum b implements s0 {
    FIRST(0),
    LAST(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12250a;

    b(int i10) {
        this.f12250a = i10;
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f12250a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
