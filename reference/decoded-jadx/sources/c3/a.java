package c3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f2929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2930c;

    public a(int i10, k kVar, int i11) {
        this.f2928a = i10;
        this.f2929b = kVar;
        this.f2930c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2928a);
        this.f2929b.f2942a.performAction(this.f2930c, bundle);
    }
}
