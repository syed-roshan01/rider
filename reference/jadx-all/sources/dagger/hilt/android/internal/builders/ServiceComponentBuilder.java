package dagger.hilt.android.internal.builders;

import android.app.Service;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ServiceComponent;

/* JADX INFO: loaded from: classes.dex */
@DefineComponent.Builder
public interface ServiceComponentBuilder {
    /* JADX INFO: renamed from: build */
    ServiceComponent mo6654build();

    ServiceComponentBuilder service(Service service);
}
