package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1947c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f1945a = i10;
        this.f1947c = obj;
        this.f1946b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1945a;
        Object obj = this.f1946b;
        switch (i10) {
            case 0:
                h1.a((ArrayList) obj, 4);
                break;
            default:
                ((t1) obj).c();
                break;
        }
    }
}
