package v0;

import java.util.Map;
import m0.m3;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15863b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f15864c;

    public i(j jVar, Object obj) {
        this.f15862a = obj;
        Map map = (Map) jVar.f15866a.get(obj);
        h hVar = new h(jVar);
        m3 m3Var = o.f15878a;
        this.f15864c = new n(map, hVar);
    }
}
