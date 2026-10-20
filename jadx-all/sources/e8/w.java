package e8;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f5389b = new w(new q(), r.f5354a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f5390a = new ConcurrentHashMap();

    public w(s... sVarArr) {
        for (s sVar : sVarArr) {
            this.f5390a.put(sVar.c(), sVar);
        }
    }
}
