package f2;

import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.messaging.ServiceStarter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f6114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f6115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f6116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f6117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f6118f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l f6119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l f6120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f6121p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6122a;

    static {
        l lVar = new l(100);
        l lVar2 = new l(200);
        l lVar3 = new l(300);
        l lVar4 = new l(400);
        l lVar5 = new l(ServiceStarter.ERROR_UNKNOWN);
        l lVar6 = new l(600);
        f6114b = lVar6;
        l lVar7 = new l(700);
        l lVar8 = new l(800);
        l lVar9 = new l(SQLitePersistence.MAX_ARGS);
        f6115c = lVar4;
        f6116d = lVar5;
        f6117e = lVar6;
        f6118f = lVar7;
        f6119n = lVar8;
        f6120o = lVar9;
        f6121p = d7.t.e0(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
    }

    public l(int i10) {
        this.f6122a = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(l.q.g("Font weight can be in range [1, 1000]. Current value: ", i10).toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return d7.a.o(this.f6122a, ((l) obj).f6122a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f6122a == ((l) obj).f6122a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6122a;
    }

    public final String toString() {
        return a7.a.o(new StringBuilder("FontWeight(weight="), this.f6122a, ')');
    }
}
