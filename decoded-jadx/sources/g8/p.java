package g8;

/* JADX INFO: loaded from: classes.dex */
public final class p extends z6.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7030s;

    public /* synthetic */ p(int i10) {
        this.f7030s = i10;
    }

    @Override // z6.a
    public final e8.v0 Y(j4 j4Var) {
        switch (this.f7030s) {
            case 0:
                break;
        }
        return e8.v0.f5378e;
    }

    public final String toString() {
        switch (this.f7030s) {
            case 0:
                return new q6.g(p.class.getSimpleName()).toString();
            default:
                return "BUFFER_PICKER";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p() {
        this(0);
        this.f7030s = 0;
    }
}
