package k3;

import android.text.Editable;
import i3.c0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f9723a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f9724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f9725c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f9725c;
        return cls != null ? new c0(cls, charSequence) : super.newEditable(charSequence);
    }
}
