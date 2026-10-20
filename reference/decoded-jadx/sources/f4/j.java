package f4;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f6179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6180b;

    public j(View view, ArrayList arrayList) {
        this.f6179a = view;
        this.f6180b = arrayList;
    }

    @Override // f4.p
    public final void a(q qVar) {
        qVar.w(this);
        qVar.a(this);
    }

    @Override // f4.p
    public final void b() {
    }

    @Override // f4.p
    public final void c(q qVar) {
        qVar.w(this);
        this.f6179a.setVisibility(8);
        ArrayList arrayList = this.f6180b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // f4.p
    public final void d() {
    }

    @Override // f4.p
    public final void e() {
    }
}
