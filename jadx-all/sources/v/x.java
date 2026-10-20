package v;

/* JADX INFO: loaded from: classes.dex */
public final class x implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f15821a;

    public x(y yVar) {
        this.f15821a = yVar;
    }

    @Override // v.r1
    public final float a(float f10) {
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        return ((Number) this.f15821a.f15826a.invoke(Float.valueOf(f10))).floatValue();
    }
}
