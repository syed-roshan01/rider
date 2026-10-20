package k6;

import android.content.Context;
import androidx.compose.foundation.layout.C0023;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.internal.definecomponent.C0250;
import f.C0271;
import u3.C0435;

/* JADX INFO: loaded from: classes.dex */
public final class s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10364a;

    public s7(Context context) {
        C0271.m5173(context);
        Context contextM447 = C0023.m447(context);
        C0271.m5173(contextM447);
        this.f10364a = contextM447;
        int iM4779 = C0250.m4779();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4779 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0435.m8493("2v7m5LvE")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
