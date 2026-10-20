package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes.dex */
final class h extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3480a;

    public /* synthetic */ h(long j10, g gVar) {
        this.f3480a = j10;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long a() {
        return this.f3480a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) && this.f3480a == ((StandardIntegrityManager.PrepareIntegrityTokenRequest) obj).a();
    }

    public final int hashCode() {
        long j10 = this.f3480a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f3480a + "}";
    }
}
