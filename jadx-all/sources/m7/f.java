package m7;

import com.google.protobuf.s0;

/* JADX INFO: loaded from: classes.dex */
public enum f implements s0 {
    /* JADX INFO: Fake field, exist only in values array */
    QUERY_SCOPE_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION(1),
    COLLECTION_GROUP(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11896a;

    f(int i10) {
        this.f11896a = i10;
    }

    @Override // com.google.protobuf.s0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f11896a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
