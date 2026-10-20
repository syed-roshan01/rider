package k3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.widget.EditText;
import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9722d;

    public b(Context context) {
        this.f9719a = 1;
        this.f9721c = 0;
        this.f9722d = context;
    }

    public final byte a(int i10, int i11) {
        return ((byte[][]) this.f9722d)[i11][i10];
    }

    public final void b() {
        this.f9720b = 0;
        this.f9721c = 0;
    }

    public final void c(int i10, int i11, int i12) {
        ((byte[][]) this.f9722d)[i11][i10] = (byte) i12;
    }

    public final void d(int i10, boolean z10, int i11) {
        ((byte[][]) this.f9722d)[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public final synchronized int e() {
        PackageInfo packageInfoD;
        if (this.f9720b == 0) {
            try {
                packageInfoD = f6.b.a((Context) this.f9722d).d(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e4) {
                Log.w("Metadata", "Failed to find package ".concat(e4.toString()));
                packageInfoD = null;
            }
            if (packageInfoD != null) {
                this.f9720b = packageInfoD.versionCode;
            }
        }
        return this.f9720b;
    }

    public final synchronized int f() {
        int i10 = this.f9721c;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.f9722d;
        PackageManager packageManager = context.getPackageManager();
        if (f6.b.a(context).f8194a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.f9721c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f9721c = 2;
        return 2;
    }

    public final String toString() {
        switch (this.f9719a) {
            case 2:
                StringBuilder sb = new StringBuilder((this.f9720b * 2 * this.f9721c) + 2);
                for (int i10 = 0; i10 < this.f9721c; i10++) {
                    byte[] bArr = ((byte[][]) this.f9722d)[i10];
                    for (int i11 = 0; i11 < this.f9720b; i11++) {
                        byte b10 = bArr[i11];
                        if (b10 == 0) {
                            sb.append(" 0");
                        } else if (b10 != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public b(int i10, int i11, int i12) {
        this.f9719a = i12;
        if (i12 == 4) {
            this.f9722d = null;
            this.f9720b = i10;
            int i13 = i11 & 7;
            this.f9721c = i13 != 0 ? i13 : 8;
            return;
        }
        if (i12 != 5) {
            this.f9722d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
            this.f9720b = i10;
            this.f9721c = i11;
        } else {
            this.f9722d = null;
            this.f9720b = i10;
            int i14 = i11 & 7;
            this.f9721c = i14 != 0 ? i14 : 8;
        }
    }

    public b(EditText editText) {
        this.f9719a = 0;
        this.f9720b = Integer.MAX_VALUE;
        this.f9721c = 0;
        if (editText != null) {
            this.f9722d = new a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }

    public b(int i10) {
        this.f9719a = i10;
        if (i10 != 5) {
            this.f9722d = new b[256];
            this.f9720b = 0;
            this.f9721c = 0;
        } else {
            this.f9722d = new b[256];
            this.f9720b = 0;
            this.f9721c = 0;
        }
    }

    public b(List list) {
        this.f9719a = 3;
        this.f9722d = list;
    }
}
