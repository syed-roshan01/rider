package l7;

import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11384a;

    public /* synthetic */ a(int i10) {
        this.f11384a = i10;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f11384a) {
            case 0:
                return AbtRegistrar.lambda$getComponents$0(componentContainer);
            case 1:
                return ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
            case 2:
                return ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
            case 3:
                return ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
            case 4:
                return ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
            case 5:
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            case 6:
                return FirestoreRegistrar.lambda$getComponents$0(componentContainer);
            case 7:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            case 8:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(componentContainer);
            default:
                return DefaultUserAgentPublisher.lambda$component$0(componentContainer);
        }
    }
}
