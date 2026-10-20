package t2;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f14616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f14617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14618c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f14616a = colorStateList;
        this.f14617b = configuration;
        this.f14618c = theme == null ? 0 : theme.hashCode();
    }
}
