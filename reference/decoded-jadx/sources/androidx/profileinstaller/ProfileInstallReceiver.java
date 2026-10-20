package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import k.f;
import m.a;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            e.S0(context, new a(8), new f(this, 18), true);
            return;
        }
        if (!"androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
                return;
            } else {
                if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                String string = extras.getString("EXTRA_BENCHMARK_OPERATION");
                f fVar = new f(this, 18);
                if (!"DROP_SHADER_CACHE".equals(string)) {
                    fVar.k(16, null);
                    return;
                } else if (e.b0(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    fVar.k(14, null);
                    return;
                } else {
                    fVar.k(15, null);
                    return;
                }
            }
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            String string2 = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string2)) {
                if ("DELETE_SKIP_FILE".equals(string2)) {
                    f fVar2 = new f(this, 18);
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new y3.a(fVar2, 11, null, 1).run();
                    return;
                }
                return;
            }
            a aVar = new a(9);
            f fVar3 = new f(this, 18);
            try {
                e.o0(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                aVar.execute(new y3.a(fVar3, 10, null, 1));
            } catch (PackageManager.NameNotFoundException e4) {
                aVar.execute(new y3.a(fVar3, 7, e4, 1));
            }
        }
    }
}
