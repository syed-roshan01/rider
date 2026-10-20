package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3654c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f3652a = i10;
        this.f3654c = obj;
        this.f3653b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3652a;
        Object obj = this.f3653b;
        Object obj2 = this.f3654c;
        switch (i10) {
            case 0:
                ((OptionalProvider) obj2).set((Provider) obj);
                break;
            case 1:
                ((LazySet) obj2).add((Provider) obj);
                break;
            default:
                EventBus.lambda$publish$0((Map.Entry) obj2, (Event) obj);
                break;
        }
    }
}
