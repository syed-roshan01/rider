package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.tracing.ComponentMonitor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3921c;

    public /* synthetic */ a(String str, int i10, Object obj) {
        this.f3919a = i10;
        this.f3920b = str;
        this.f3921c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        int i10 = this.f3919a;
        String str = this.f3920b;
        Object obj = this.f3921c;
        switch (i10) {
            case 0:
                return LibraryVersionComponent.lambda$fromContext$0(str, (LibraryVersionComponent.VersionExtractor) obj, componentContainer);
            default:
                return ComponentMonitor.lambda$processRegistrar$0(str, (Component) obj, componentContainer);
        }
    }
}
