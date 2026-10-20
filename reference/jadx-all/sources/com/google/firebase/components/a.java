package com.google.firebase.components;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3649b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f3648a = i10;
        this.f3649b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        int i10 = this.f3648a;
        Object obj = this.f3649b;
        switch (i10) {
            case 0:
                return Component.lambda$of$1(obj, componentContainer);
            case 1:
                return Component.lambda$intoSet$3(obj, componentContainer);
            case 2:
                return Component.lambda$intoSet$4(obj, componentContainer);
            case 3:
                return Component.lambda$of$2(obj, componentContainer);
            default:
                return Component.lambda$of$0(obj, componentContainer);
        }
    }
}
