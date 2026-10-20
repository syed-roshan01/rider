package com.google.android.gms.common.api.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v extends LifecycleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f3255a;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = this.f3255a;
            this.f3255a = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
