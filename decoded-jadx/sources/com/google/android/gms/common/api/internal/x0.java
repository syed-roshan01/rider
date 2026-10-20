package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends androidx.fragment.app.d0 implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f3271d = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3272a = Collections.synchronizedMap(new q.f());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3273b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f3274c;

    @Override // com.google.android.gms.common.api.internal.j
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f3272a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(l.q.k("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f3273b > 0) {
            new zzi(Looper.getMainLooper()).post(new y2.a(this, lifecycleCallback, str, 6));
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final LifecycleCallback b(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f3272a.get(str));
    }

    @Override // androidx.fragment.app.d0
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f3272a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f3272a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3273b = 1;
        this.f3274c = bundle;
        for (Map.Entry entry : this.f3272a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onDestroy() {
        super.onDestroy();
        this.f3273b = 5;
        Iterator it = this.f3272a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onResume() {
        super.onResume();
        this.f3273b = 3;
        Iterator it = this.f3272a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f3272a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onStart() {
        super.onStart();
        this.f3273b = 2;
        Iterator it = this.f3272a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.d0
    public final void onStop() {
        super.onStop();
        this.f3273b = 4;
        Iterator it = this.f3272a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
