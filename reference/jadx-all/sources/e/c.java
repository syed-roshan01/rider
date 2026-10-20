package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.p;
import d.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4981a;

    public /* synthetic */ c(int i10) {
        this.f4981a = i10;
    }

    @Override // e.b
    public final Intent a(p pVar, Object obj) {
        Bundle bundleExtra;
        switch (this.f4981a) {
            case 0:
                String str = (String) obj;
                d7.a.m(pVar, "context");
                d7.a.m(str, "input");
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
                d7.a.l(type, "Intent(Intent.ACTION_GET…          .setType(input)");
                return type;
            default:
                k kVar = (k) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = kVar.f4315b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = kVar.f4314a;
                        d7.a.m(intentSender, "intentSender");
                        kVar = new k(intentSender, null, kVar.f4316c, kVar.f4317d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }

    @Override // e.b
    public final a b(p pVar, Object obj) {
        switch (this.f4981a) {
            case 0:
                d7.a.m(pVar, "context");
                d7.a.m((String) obj, "input");
                break;
            default:
                d7.a.m(pVar, "context");
                break;
        }
        return null;
    }

    @Override // e.b
    public final Object c(Intent intent, int i10) {
        switch (this.f4981a) {
            case 0:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            default:
                return new d.b(intent, i10);
        }
    }
}
