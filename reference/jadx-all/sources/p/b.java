package p;

import android.content.Intent;
import android.os.Bundle;
import l.t;
import x2.e;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f12735a = new Intent("android.intent.action.VIEW");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f12736b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12737c = true;

    public final t a() {
        Intent intent = this.f12735a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            e.b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f12737c);
        a aVar = this.f12736b;
        Integer num = aVar.f12731a;
        Integer num2 = aVar.f12732b;
        Integer num3 = aVar.f12733c;
        Integer num4 = aVar.f12734d;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        if (num2 != null) {
            bundle2.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        if (num3 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        if (num4 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        return new t(2, intent, (Object) null);
    }
}
