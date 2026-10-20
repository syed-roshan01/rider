package v9;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d7.t;
import m9.k;
import m9.l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f15974a;

    public b(l lVar) {
        this.f15974a = lVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Exception exception = task.getException();
        k kVar = this.f15974a;
        if (exception != null) {
            kVar.resumeWith(t.N(exception));
        } else if (task.isCanceled()) {
            kVar.l(null);
        } else {
            kVar.resumeWith(task.getResult());
        }
    }
}
