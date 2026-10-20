package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes.dex */
final class f extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f3478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f3479b;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f3479b == 1) {
            return new h(this.f3478a, null);
        }
        throw new IllegalStateException("Missing required properties: cloudProjectNumber");
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f3478a = j10;
        this.f3479b = (byte) 1;
        return this;
    }
}
