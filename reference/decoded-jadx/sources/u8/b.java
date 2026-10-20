package u8;

import m9.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.c f15429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f15430b;

    public b(i iVar, x xVar) {
        d7.a.m(iVar, "baseKey");
        this.f15429a = xVar;
        this.f15430b = iVar instanceof b ? ((b) iVar).f15430b : iVar;
    }
}
