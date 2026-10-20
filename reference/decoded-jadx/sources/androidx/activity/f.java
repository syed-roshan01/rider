package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.x0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements b4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1379b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f1378a = i10;
        this.f1379b = obj;
    }

    @Override // b4.d
    public final Bundle a() {
        int i10 = this.f1378a;
        Object obj = this.f1379b;
        switch (i10) {
            case 0:
                return p.a((p) obj);
            case 1:
                Map mapB = ((v0.l) obj).b();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapB.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 2:
                return androidx.fragment.app.g0.d((androidx.fragment.app.g0) obj);
            default:
                return ((x0) obj).L();
        }
    }
}
