package a4;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1171f;

    public final int a() {
        if (this.f1169d) {
            return this.f1166a - this.f1167b;
        }
        return 0;
    }

    public final String toString() {
        return "State{mTargetPosition=-1, mData=null, mItemCount=0, mIsMeasuring=false, mPreviousLayoutItemCount=" + this.f1166a + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1167b + ", mStructureChanged=" + this.f1168c + ", mInPreLayout=" + this.f1169d + ", mRunSimpleAnimations=" + this.f1170e + ", mRunPredictiveAnimations=" + this.f1171f + '}';
    }
}
