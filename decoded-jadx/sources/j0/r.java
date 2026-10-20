package j0;

import android.content.Context;
import android.view.ViewGroup;
import com.ride.accepter.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f8307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8308e;

    public r(Context context) {
        super(context);
        this.f8304a = 5;
        ArrayList arrayList = new ArrayList();
        this.f8305b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f8306c = arrayList2;
        this.f8307d = new s(0);
        setClipChildren(false);
        t tVar = new t(context);
        addView(tVar);
        arrayList.add(tVar);
        arrayList2.add(tVar);
        this.f8308e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
