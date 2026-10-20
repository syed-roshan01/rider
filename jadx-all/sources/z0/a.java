package z0;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f17185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f17186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f17187c;

    public a(View view, f fVar) {
        this.f17185a = view;
        this.f17186b = fVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f17187c = autofillManager;
        view.setImportantForAutofill(1);
    }
}
