package b4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2699a;

    public a(e eVar) {
        d7.a.m(eVar, "registry");
        this.f2699a = new LinkedHashSet();
        eVar.d("androidx.savedstate.Restarter", this);
    }

    @Override // b4.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2699a));
        return bundle;
    }
}
