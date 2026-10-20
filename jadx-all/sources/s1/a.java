package s1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f6.a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g f13905z;

    @Override // f6.a
    public final boolean B(c cVar) {
        return cVar == this.f13905z.getKey();
    }

    @Override // f6.a
    public final Object I(i iVar) {
        if (iVar == this.f13905z.getKey()) {
            return this.f13905z.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
