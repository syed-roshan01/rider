package y;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f16651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(float f10, float f11, int i10) {
        super(1);
        this.f16649a = i10;
        this.f16650b = f10;
        this.f16651c = f11;
    }

    public final void a() {
        switch (this.f16649a) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f16649a) {
            case 0:
                a7.a.w(obj);
                a();
                throw null;
            case 1:
                a7.a.w(obj);
                a();
                throw null;
            default:
                return Float.valueOf(((Boolean) obj).booleanValue() ? this.f16650b : this.f16651c);
        }
    }
}
