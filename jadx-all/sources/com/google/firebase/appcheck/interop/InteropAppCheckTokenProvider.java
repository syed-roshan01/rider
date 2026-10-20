package com.google.firebase.appcheck.interop;

import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.AppCheckTokenResult;

/* JADX INFO: loaded from: classes.dex */
public interface InteropAppCheckTokenProvider {
    void addAppCheckTokenListener(AppCheckTokenListener appCheckTokenListener);

    Task<AppCheckTokenResult> getToken(boolean z10);

    void removeAppCheckTokenListener(AppCheckTokenListener appCheckTokenListener);
}
