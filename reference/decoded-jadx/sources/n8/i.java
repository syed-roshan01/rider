package n8;

/* JADX INFO: loaded from: classes.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f12275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.i f12276c;

    public i(j jVar, e8.i iVar, int i10) {
        this.f12274a = i10;
        if (i10 != 1) {
            this.f12275b = jVar;
            this.f12276c = iVar;
        } else {
            y3.e.G("success rate ejection config is null", jVar.f12281e != null);
            this.f12275b = jVar;
            this.f12276c = iVar;
        }
    }
}
