package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class g extends Exception {

    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Status status) {
        int i10 = status.f3150b;
        String str = status.f3151c;
        super(i10 + ": " + (str == null ? "" : str));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f3150b;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f3151c;
    }
}
