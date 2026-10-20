package l5;

import b0.l0;
import com.google.firebase.messaging.Constants;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s implements i5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f11367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f11368c;

    public s(Set set, j jVar, u uVar) {
        this.f11366a = set;
        this.f11367b = jVar;
        this.f11368c = uVar;
    }

    public final androidx.fragment.app.g a(i5.c cVar, l0 l0Var) {
        Set set = this.f11366a;
        if (!set.contains(cVar)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
        }
        androidx.fragment.app.g gVar = new androidx.fragment.app.g();
        gVar.f1911a = this.f11367b;
        gVar.f1912b = Constants.FirelogAnalytics.FCM_LOG_SOURCE;
        gVar.f1913c = cVar;
        gVar.f1914d = l0Var;
        gVar.f1915e = this.f11368c;
        return gVar;
    }
}
