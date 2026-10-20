package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class q implements ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3493a;

    private q() {
    }

    public /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.f3493a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ai
    public final s b() {
        Context context = this.f3493a;
        if (context != null) {
            return new s(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }
}
