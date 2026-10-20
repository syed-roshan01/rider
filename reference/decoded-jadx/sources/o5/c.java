package o5;

import com.google.firebase.encoders.proto.ProtoEnum;

/* JADX INFO: loaded from: classes.dex */
public enum c implements ProtoEnum {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12536a;

    c(int i10) {
        this.f12536a = i10;
    }

    @Override // com.google.firebase.encoders.proto.ProtoEnum
    public final int getNumber() {
        return this.f12536a;
    }
}
