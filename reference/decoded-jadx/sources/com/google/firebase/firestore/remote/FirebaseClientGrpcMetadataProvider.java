package com.google.firebase.firestore.remote;

import com.google.firebase.FirebaseOptions;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import e8.g1;
import e8.i1;
import e8.l1;
import java.util.BitSet;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseClientGrpcMetadataProvider implements GrpcMetadataProvider {
    private static final i1 GMP_APP_ID_HEADER;
    private static final i1 HEART_BEAT_HEADER;
    private static final String HEART_BEAT_TAG = "fire-fst";
    private static final i1 USER_AGENT_HEADER;
    private final FirebaseOptions firebaseOptions;
    private final Provider<HeartBeatInfo> heartBeatInfoProvider;
    private final Provider<UserAgentPublisher> userAgentPublisherProvider;

    static {
        v vVar = l1.f5303d;
        BitSet bitSet = i1.f5283d;
        HEART_BEAT_HEADER = new g1("x-firebase-client-log-type", vVar);
        USER_AGENT_HEADER = new g1("x-firebase-client", vVar);
        GMP_APP_ID_HEADER = new g1("x-firebase-gmpid", vVar);
    }

    public FirebaseClientGrpcMetadataProvider(Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseOptions firebaseOptions) {
        this.userAgentPublisherProvider = provider;
        this.heartBeatInfoProvider = provider2;
        this.firebaseOptions = firebaseOptions;
    }

    private void maybeAddGmpAppId(l1 l1Var) {
        FirebaseOptions firebaseOptions = this.firebaseOptions;
        if (firebaseOptions == null) {
            return;
        }
        String applicationId = firebaseOptions.getApplicationId();
        if (applicationId.length() != 0) {
            l1Var.f(GMP_APP_ID_HEADER, applicationId);
        }
    }

    @Override // com.google.firebase.firestore.remote.GrpcMetadataProvider
    public void updateMetadata(l1 l1Var) {
        if (this.heartBeatInfoProvider.get() == null || this.userAgentPublisherProvider.get() == null) {
            return;
        }
        int code = this.heartBeatInfoProvider.get().getHeartBeatCode(HEART_BEAT_TAG).getCode();
        if (code != 0) {
            l1Var.f(HEART_BEAT_HEADER, Integer.toString(code));
        }
        l1Var.f(USER_AGENT_HEADER, this.userAgentPublisherProvider.get().getUserAgent());
        maybeAddGmpAppId(l1Var);
    }
}
