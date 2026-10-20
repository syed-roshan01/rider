package com.google.android.play.core.integrity;

import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
final class e extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f3477b;

    public /* synthetic */ e(String str, Long l10, Network network, d dVar) {
        this.f3476a = str;
        this.f3477b = l10;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Network a() {
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f3477b;
    }

    public final boolean equals(Object obj) {
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f3476a.equals(integrityTokenRequest.nonce()) && ((l10 = this.f3477b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                integrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f3476a.hashCode() ^ 1000003;
        Long l10 = this.f3477b;
        return ((iHashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode())) * 1000003;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f3476a;
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f3476a + ", cloudProjectNumber=" + this.f3477b + ", network=null}";
    }
}
