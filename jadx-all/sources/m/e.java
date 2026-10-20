package m;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f11439x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ExecutorService f11440y = Executors.newFixedThreadPool(4, new c(this));
}
