package x9;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16444a = new ArrayList(20);

    public final void a(String str, String str2) {
        d7.a.m(str, "name");
        d7.a.m(str2, FirebaseAnalytics.Param.VALUE);
        ArrayList arrayList = this.f16444a;
        arrayList.add(str);
        arrayList.add(l9.i.o1(str2).toString());
    }

    public final void b(String str, String str2) {
        d7.a.m(str, "name");
        d7.a.m(str2, FirebaseAnalytics.Param.VALUE);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(y9.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
            }
        }
        a(str, str2);
    }

    public final q c() {
        return new q((String[]) this.f16444a.toArray(new String[0]));
    }

    public final void d(String str) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f16444a;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (l9.i.K0(str, (String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }
}
