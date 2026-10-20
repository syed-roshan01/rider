package p6;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class z extends w {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12824n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f12825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f12826p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, w wVar) {
        super(taskCompletionSource);
        this.f12826p = cVar;
        this.f12824n = taskCompletionSource2;
        this.f12825o = wVar;
    }

    @Override // p6.w
    public final void b() {
        synchronized (this.f12826p.f12799f) {
            try {
                final c cVar = this.f12826p;
                final TaskCompletionSource taskCompletionSource = this.f12824n;
                cVar.f12798e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: p6.x
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        c cVar2 = cVar;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (cVar2.f12799f) {
                            cVar2.f12798e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.f12826p.f12805l.getAndIncrement() > 0) {
                    this.f12826p.f12795b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f12826p, this.f12825o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
