package com.google.firebase.remoteconfig;

import d7.t;
import d9.j;
import o9.r;
import q8.l;
import w8.e;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
@e(c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", l = {71}, m = "invokeSuspend")
public final class RemoteConfigKt$configUpdates$1 extends i implements c9.e {
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements c9.a {
        final /* synthetic */ ConfigUpdateListenerRegistration $registration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfigUpdateListenerRegistration configUpdateListenerRegistration) {
            super(0);
            this.$registration = configUpdateListenerRegistration;
        }

        @Override // c9.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3726invoke();
            return l.f13235a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3726invoke() {
            this.$registration.remove();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, u8.e eVar) {
        super(2, eVar);
        this.$this_configUpdates = firebaseRemoteConfig;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.$this_configUpdates, eVar);
        remoteConfigKt$configUpdates$1.L$0 = obj;
        return remoteConfigKt$configUpdates$1;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.label;
        if (i10 == 0) {
            t.v0(obj);
            r rVar = (r) this.L$0;
            FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
            ConfigUpdateListenerRegistration configUpdateListenerRegistrationAddOnConfigUpdateListener = firebaseRemoteConfig.addOnConfigUpdateListener(new RemoteConfigKt$configUpdates$1$registration$1(firebaseRemoteConfig, rVar));
            d7.a.l(configUpdateListenerRegistrationAddOnConfigUpdateListener, "FirebaseRemoteConfig.con\u2026      }\n        }\n      )");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(configUpdateListenerRegistrationAddOnConfigUpdateListener);
            this.label = 1;
            if (t.E(rVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(obj);
        }
        return l.f13235a;
    }

    @Override // c9.e
    public final Object invoke(r rVar, u8.e eVar) {
        return ((RemoteConfigKt$configUpdates$1) create(rVar, eVar)).invokeSuspend(l.f13235a);
    }
}
