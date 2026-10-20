package c5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import m0.g1;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f3005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Context context, g1 g1Var, int i10) {
        super(0);
        this.f3003a = i10;
        this.f3004b = context;
        this.f3005c = g1Var;
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVar = q8.l.f13235a;
        switch (this.f3003a) {
            case 0:
                m1292invoke();
                break;
            case 1:
                m1292invoke();
                break;
            case 2:
                m1292invoke();
                break;
            case 3:
                m1292invoke();
                break;
            default:
                m1292invoke();
                break;
        }
        return lVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m1292invoke() {
        int i10 = this.f3003a;
        g1 g1Var = this.f3005c;
        Context context = this.f3004b;
        switch (i10) {
            case 0:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                Network activeNetwork = connectivityManager.getActiveNetwork();
                NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
                g1Var.setValue(Boolean.valueOf(networkCapabilities != null && networkCapabilities.hasCapability(12)));
                break;
            case 1:
                File file = (File) g1Var.getValue();
                d7.a.j(file);
                int i11 = Build.VERSION.SDK_INT;
                if (!context.getPackageManager().canRequestPackageInstalls()) {
                    Toast.makeText(context, "Please enable 'Install unknown apps' for this app, then tap Install again.", 1).show();
                    Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName()));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                } else {
                    if (i11 >= 34) {
                        try {
                            d0.N(context, file);
                        } catch (Exception e4) {
                            a7.a.t("PackageInstaller failed, falling back: ", e4.getMessage(), "ForceUpdateScreen");
                        }
                    }
                    try {
                        Uri uriC = FileProvider.c(context, context.getPackageName() + ".fileprovider", file);
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setDataAndType(uriC, "application/vnd.android.package-archive");
                        intent2.addFlags(1);
                        intent2.addFlags(268435456);
                        intent2.addFlags(67108864);
                        context.startActivity(intent2);
                        break;
                    } catch (Exception e10) {
                        a7.a.t("FileProvider install error: ", e10.getMessage(), "ForceUpdateScreen");
                        try {
                            d0.N(context, file);
                            return;
                        } catch (Exception unused) {
                            Toast.makeText(context, "Install failed. Please install manually from Downloads.", 1).show();
                            return;
                        }
                    }
                }
                break;
            case 2:
                int iOrdinal = ((g5.c) g1Var.getValue()).ordinal();
                if (iOrdinal == 0) {
                    try {
                        try {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=moe.shizuku.privileged.api")));
                        } catch (Exception unused2) {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=moe.shizuku.privileged.api")));
                            return;
                        }
                    } catch (Exception unused3) {
                        return;
                    }
                    break;
                } else if (iOrdinal == 1) {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("moe.shizuku.privileged.api");
                    if (launchIntentForPackage != null) {
                        context.startActivity(launchIntentForPackage);
                    } else {
                        Toast.makeText(context, "Opening Shizuku app...", 0).show();
                    }
                    break;
                } else if (iOrdinal == 2) {
                    try {
                        la.g.g(10001);
                    } catch (Exception unused4) {
                        Intent launchIntentForPackage2 = context.getPackageManager().getLaunchIntentForPackage("moe.shizuku.privileged.api");
                        if (launchIntentForPackage2 != null) {
                            context.startActivity(launchIntentForPackage2);
                            return;
                        }
                        return;
                    }
                    break;
                } else if (iOrdinal == 3) {
                    Toast.makeText(context, "Shizuku Service is Active & Ready ✓", 0).show();
                    break;
                }
                break;
            case 3:
                int iOrdinal2 = ((g5.c) g1Var.getValue()).ordinal();
                if (iOrdinal2 == 0) {
                    try {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=moe.shizuku.privileged.api")));
                    } catch (Exception unused5) {
                        return;
                    }
                } else if (iOrdinal2 != 2) {
                    Intent launchIntentForPackage3 = context.getPackageManager().getLaunchIntentForPackage("moe.shizuku.privileged.api");
                    if (launchIntentForPackage3 != null) {
                        context.startActivity(launchIntentForPackage3);
                    } else {
                        Toast.makeText(context, "Shizuku app not found", 0).show();
                    }
                } else {
                    try {
                        la.g.g(0);
                    } catch (Exception unused6) {
                        Intent launchIntentForPackage4 = context.getPackageManager().getLaunchIntentForPackage("moe.shizuku.privileged.api");
                        if (launchIntentForPackage4 != null) {
                            context.startActivity(launchIntentForPackage4);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
                if (clipboardManager != null) {
                    String str = (String) g1Var.getValue();
                    if (str == null) {
                        str = "";
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Transaction ID", str));
                }
                break;
        }
    }
}
