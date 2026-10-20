package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f3386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3387b;

    public s(Context context) {
        f6.a.x(context);
        Resources resources = context.getResources();
        this.f3386a = resources;
        this.f3387b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public static String b(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String a(String str) {
        Resources resources = this.f3386a;
        int identifier = resources.getIdentifier(str, "string", this.f3387b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
