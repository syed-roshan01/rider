package k4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class p extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f9777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Context context, int i10) {
        super(0);
        this.f9776a = i10;
        this.f9777b = context;
    }

    @Override // c9.a
    public final Object invoke() {
        q8.l lVar = q8.l.f13235a;
        Context context = this.f9777b;
        int i10 = this.f9776a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return w4.e.c(context);
                    default:
                        return w4.e.c(context);
                }
            case 1:
                switch (i10) {
                    case 0:
                        return w4.e.c(context);
                    default:
                        return w4.e.c(context);
                }
            case 2:
                m6513invoke();
                return lVar;
            case 3:
                m6513invoke();
                return lVar;
            case 4:
                m6513invoke();
                return lVar;
            case 5:
                m6513invoke();
                return lVar;
            case 6:
                m6513invoke();
                return lVar;
            case 7:
                m6513invoke();
                return lVar;
            case 8:
                m6513invoke();
                return lVar;
            case 9:
                m6513invoke();
                return lVar;
            default:
                m6513invoke();
                return lVar;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m6513invoke() {
        int i10 = this.f9776a;
        Context context = this.f9777b;
        switch (i10) {
            case 2:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(R.string.url_website))));
                break;
            case 3:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(R.string.url_telegram))));
                break;
            case 4:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(R.string.url_whatsapp))));
                break;
            case 5:
                context.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
                break;
            case 6:
                context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())));
                break;
            case 7:
                try {
                    Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    intent.setData(Uri.parse("package:" + context.getPackageName()));
                    context.startActivity(intent);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 8:
                Intent intent2 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                intent2.addFlags(268435456);
                context.startActivity(intent2);
                break;
            case 9:
                context.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
                break;
            default:
                context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())));
                break;
        }
    }
}
