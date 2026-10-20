.class public final Ly2/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Parcelable;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Ly2/a;->a:I

    iput-object p1, p0, Ly2/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Ly2/a;->c:Ljava/lang/Object;

    iput-object p3, p0, Ly2/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Ly2/a;->a:I

    iput-object p1, p0, Ly2/a;->d:Ljava/lang/Object;

    iput-object p2, p0, Ly2/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Ly2/a;->c:Ljava/lang/Object;

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v0, Lk/f;

    iget-object v1, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Typeface;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lt2/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lt2/b;->e(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method

.method private b()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v1, La3/a;

    iget-object v2, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    new-instance v3, Ly2/a;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v1, v0, v4}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private c()V
    .locals 3

    iget-object v0, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/s1;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Landroidx/fragment/app/n;->j(Landroidx/fragment/app/s1;)V

    :cond_0
    return-void
.end method

.method private d()V
    .locals 3

    iget-object v0, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/l;->a()V

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Transition for operation "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/s1;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "has completed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method private final e()V
    .locals 5

    iget-object v0, p0, Ly2/a;->d:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/common/api/internal/w0;

    iget v2, v1, Lcom/google/android/gms/common/api/internal/w0;->b:I

    iget-object v3, p0, Ly2/a;->b:Ljava/lang/Object;

    if-lez v2, :cond_1

    move-object v2, v3

    check-cast v2, Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/w0;->c:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    iget-object v4, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2, v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onCreate(Landroid/os/Bundle;)V

    :cond_1
    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/common/api/internal/w0;

    iget v1, v1, Lcom/google/android/gms/common/api/internal/w0;->b:I

    const/4 v2, 0x2

    if-lt v1, v2, :cond_2

    move-object v1, v3

    check-cast v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onStart()V

    :cond_2
    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/common/api/internal/w0;

    iget v1, v1, Lcom/google/android/gms/common/api/internal/w0;->b:I

    const/4 v2, 0x3

    if-lt v1, v2, :cond_3

    move-object v1, v3

    check-cast v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onResume()V

    :cond_3
    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/common/api/internal/w0;

    iget v1, v1, Lcom/google/android/gms/common/api/internal/w0;->b:I

    const/4 v2, 0x4

    if-lt v1, v2, :cond_4

    move-object v1, v3

    check-cast v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onStop()V

    :cond_4
    check-cast v0, Lcom/google/android/gms/common/api/internal/w0;

    iget v0, v0, Lcom/google/android/gms/common/api/internal/w0;->b:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_5

    check-cast v3, Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onDestroy()V

    :cond_5
    return-void
.end method

.method private final f()V
    .locals 5

    iget-object v0, p0, Ly2/a;->d:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/common/api/internal/x0;

    iget v2, v1, Lcom/google/android/gms/common/api/internal/x0;->b:I

    iget-object v3, p0, Ly2/a;->b:Ljava/lang/Object;

    if-lez v2, :cond_1

    move-object v2, v3

    check-cast v2, Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/x0;->c:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    iget-object v4, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2, v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onCreate(Landroid/os/Bundle;)V

    :cond_1
    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/common/api/internal/x0;

    iget v1, v1, Lcom/google/android/gms/common/api/internal/x0;->b:I

    const/4 v2, 0x2

    if-lt v1, v2, :cond_2

    move-object v1, v3

    check-cast v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onStart()V

    :cond_2
    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/common/api/internal/x0;

    iget v1, v1, Lcom/google/android/gms/common/api/internal/x0;->b:I

    const/4 v2, 0x3

    if-lt v1, v2, :cond_3

    move-object v1, v3

    check-cast v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onResume()V

    :cond_3
    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/common/api/internal/x0;

    iget v1, v1, Lcom/google/android/gms/common/api/internal/x0;->b:I

    const/4 v2, 0x4

    if-lt v1, v2, :cond_4

    move-object v1, v3

    check-cast v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onStop()V

    :cond_4
    check-cast v0, Lcom/google/android/gms/common/api/internal/x0;

    iget v0, v0, Lcom/google/android/gms/common/api/internal/x0;->b:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_5

    check-cast v3, Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onDestroy()V

    :cond_5
    return-void
.end method

.method private final g()V
    .locals 6

    iget-object v0, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lk6/q4;

    iget-object v1, v0, Lk6/q4;->b:Lk6/r4;

    iget-object v0, v0, Lk6/q4;->a:Ljava/lang/String;

    iget-object v2, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzby;

    iget-object v3, v1, Lk6/r4;->a:Lk6/f5;

    iget-object v4, v3, Lk6/f5;->j:Lk6/z4;

    invoke-static {v4}, Lk6/f5;->d(Lk6/o5;)V

    invoke-virtual {v4}, Lk6/z4;->l()V

    iget-object v3, v3, Lk6/f5;->i:Lk6/d4;

    if-eqz v2, :cond_0

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "package_name"

    invoke-virtual {v4, v5, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {v2, v4}, Lcom/google/android/gms/internal/measurement/zzby;->zza(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {v3}, Lk6/f5;->d(Lk6/o5;)V

    iget-object v0, v3, Lk6/d4;->f:Lk6/f4;

    const-string v2, "Install Referrer Service returned a null response"

    invoke-virtual {v0, v2}, Lk6/f4;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v3}, Lk6/f5;->d(Lk6/o5;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v3, Lk6/d4;->f:Lk6/f4;

    const-string v3, "Exception occurred while retrieving the Install Referrer"

    invoke-virtual {v2, v3, v0}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lk6/f5;->d(Lk6/o5;)V

    const-string v0, "Attempting to use Install Referrer Service while it is not initialized"

    iget-object v2, v3, Lk6/d4;->i:Lk6/f4;

    invoke-virtual {v2, v0}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v0, v1, Lk6/r4;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->j:Lk6/z4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    invoke-virtual {v0}, Lk6/z4;->l()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on client side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final h()V
    .locals 9

    iget-object v0, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v0, Lk6/h5;

    iget-object v1, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v2, Landroid/os/Bundle;

    iget-object v0, v0, Lk6/h5;->a:Lk6/p7;

    iget-object v0, v0, Lk6/p7;->c:Lk6/k;

    invoke-static {v0}, Lk6/p7;->o(Lk6/m7;)V

    invoke-virtual {v0}, Lf4/y;->l()V

    invoke-virtual {v0}, Lk6/m7;->p()V

    iget-object v3, v0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v3, Lk6/f5;

    invoke-static {v1}, Lf6/a;->u(Ljava/lang/String;)V

    const-string v4, "dep"

    invoke-static {v4}, Lf6/a;->u(Ljava/lang/String;)V

    const-string v4, ""

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v4}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_0

    iget-object v5, v3, Lk6/f5;->i:Lk6/d4;

    invoke-static {v5}, Lk6/f5;->d(Lk6/o5;)V

    const-string v6, "Param name can\'t be null"

    iget-object v5, v5, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v5, v6}, Lk6/f4;->b(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    iget-object v6, v3, Lk6/f5;->l:Lk6/u7;

    invoke-static {v6}, Lk6/f5;->c(Lk6/o5;)V

    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7, v5}, Lk6/u7;->d0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_1

    iget-object v6, v3, Lk6/f5;->i:Lk6/d4;

    invoke-static {v6}, Lk6/f5;->d(Lk6/o5;)V

    iget-object v7, v3, Lk6/f5;->m:Lk6/c4;

    invoke-virtual {v7, v5}, Lk6/c4;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v6, Lk6/d4;->i:Lk6/f4;

    const-string v7, "Param value can\'t be null"

    invoke-virtual {v6, v7, v5}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    iget-object v7, v3, Lk6/f5;->l:Lk6/u7;

    invoke-static {v7}, Lk6/f5;->c(Lk6/o5;)V

    invoke-virtual {v7, v4, v5, v6}, Lk6/u7;->D(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance v2, Lk6/s;

    invoke-direct {v2, v4}, Lk6/s;-><init>(Landroid/os/Bundle;)V

    goto :goto_1

    :cond_3
    new-instance v2, Lk6/s;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-direct {v2, v3}, Lk6/s;-><init>(Landroid/os/Bundle;)V

    :goto_1
    invoke-virtual {v0}, Lk6/k7;->m()Lk6/r7;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    move-result-object v4

    const-wide/16 v5, 0x0

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    move-result-object v4

    new-instance v5, Lk6/u;

    invoke-direct {v5, v2}, Lk6/u;-><init>(Lk6/s;)V

    :goto_2
    invoke-virtual {v5}, Lk6/u;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5}, Lk6/u;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v7

    iget-object v8, v2, Lk6/s;->a:Landroid/os/Bundle;

    invoke-virtual {v8, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lf6/a;->x(Ljava/lang/Object;)V

    invoke-virtual {v3, v7, v6}, Lk6/r7;->I(Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;Ljava/lang/Object;)V

    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzix$zzb;->zzab()Lcom/google/android/gms/internal/measurement/zzkj;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzix;

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhd;->zzbv()[B

    move-result-object v2

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v3

    invoke-virtual {v0}, Lf4/y;->i()Lk6/c4;

    move-result-object v4

    invoke-virtual {v4, v1}, Lk6/c4;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    array-length v5, v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v3, v3, Lk6/d4;->n:Lk6/f4;

    const-string v6, "Saving default event parameters, appId, data size"

    invoke-virtual {v3, v6, v4, v5}, Lk6/f4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    const-string v4, "app_id"

    invoke-virtual {v3, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "parameters"

    invoke-virtual {v3, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_0
    invoke-virtual {v0}, Lk6/k;->s()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v4, "default_event_params"

    const/4 v5, 0x5

    const/4 v6, 0x0

    invoke-virtual {v2, v4, v6, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_5

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v2

    iget-object v2, v2, Lk6/d4;->f:Lk6/f4;

    const-string v3, "Failed to insert default event parameters (got -1). appId"

    invoke-static {v1}, Lk6/d4;->r(Ljava/lang/String;)Lk6/h4;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v2

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    invoke-static {v1}, Lk6/d4;->r(Ljava/lang/String;)Lk6/h4;

    move-result-object v1

    iget-object v0, v0, Lk6/d4;->f:Lk6/f4;

    const-string v3, "Error storing default event parameters. appId"

    invoke-virtual {v0, v3, v1, v2}, Lk6/f4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_3
    return-void
.end method

.method private final i()V
    .locals 4

    iget-object v0, p0, Ly2/a;->d:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lk6/h5;

    iget-object v1, v1, Lk6/h5;->a:Lk6/p7;

    invoke-virtual {v1}, Lk6/p7;->N()V

    iget-object v1, p0, Ly2/a;->b:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lk6/e;

    iget-object v2, v2, Lk6/e;->c:Lk6/t7;

    invoke-virtual {v2}, Lk6/t7;->e()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Ly2/a;->c:Ljava/lang/Object;

    if-nez v2, :cond_0

    check-cast v0, Lk6/h5;

    iget-object v0, v0, Lk6/h5;->a:Lk6/p7;

    check-cast v1, Lk6/e;

    check-cast v3, Lk6/x7;

    invoke-virtual {v0, v1, v3}, Lk6/p7;->l(Lk6/e;Lk6/x7;)V

    return-void

    :cond_0
    check-cast v0, Lk6/h5;

    iget-object v0, v0, Lk6/h5;->a:Lk6/p7;

    check-cast v1, Lk6/e;

    check-cast v3, Lk6/x7;

    invoke-virtual {v0, v1, v3}, Lk6/p7;->y(Lk6/e;Lk6/x7;)V

    return-void
.end method

.method private final j()V
    .locals 3

    iget-object v0, p0, Ly2/a;->d:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lk6/h5;

    iget-object v1, v1, Lk6/h5;->a:Lk6/p7;

    invoke-virtual {v1}, Lk6/p7;->N()V

    check-cast v0, Lk6/h5;

    iget-object v0, v0, Lk6/h5;->a:Lk6/p7;

    iget-object v1, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v1, Lk6/v;

    iget-object v2, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lk6/p7;->m(Lk6/v;Ljava/lang/String;)V

    return-void
.end method

.method private final k()V
    .locals 7

    iget-object v0, p0, Ly2/a;->b:Ljava/lang/Object;

    const-string v1, "Failed to get app instance id"

    iget-object v2, p0, Ly2/a;->c:Ljava/lang/Object;

    iget-object v3, p0, Ly2/a;->d:Ljava/lang/Object;

    const/4 v4, 0x0

    :try_start_0
    move-object v5, v3

    check-cast v5, Lk6/s6;

    invoke-virtual {v5}, Lf4/y;->j()Lk6/l4;

    move-result-object v5

    invoke-virtual {v5}, Lk6/l4;->u()Lk6/s5;

    move-result-object v5

    sget-object v6, Lk6/r5;->c:Lk6/r5;

    invoke-virtual {v5, v6}, Lk6/s5;->f(Lk6/r5;)Z

    move-result v5

    if-nez v5, :cond_0

    move-object v0, v3

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    iget-object v0, v0, Lk6/d4;->k:Lk6/f4;

    const-string v5, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v0, v5}, Lk6/f4;->b(Ljava/lang/String;)V

    move-object v0, v3

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lk6/q3;->o()Lk6/y5;

    move-result-object v0

    invoke-virtual {v0, v4}, Lk6/y5;->z(Ljava/lang/String;)V

    move-object v0, v3

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lf4/y;->j()Lk6/l4;

    move-result-object v0

    iget-object v0, v0, Lk6/l4;->f:Lj0/b0;

    invoke-virtual {v0, v4}, Lj0/b0;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    check-cast v3, Lk6/s6;

    invoke-virtual {v3}, Lf4/y;->k()Lk6/u7;

    move-result-object v0

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v0, v4, v2}, Lk6/u7;->K(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    move-object v5, v3

    check-cast v5, Lk6/s6;

    iget-object v5, v5, Lk6/s6;->d:Lk6/y3;

    if-nez v5, :cond_1

    move-object v0, v3

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    iget-object v0, v0, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v0, v1}, Lk6/f4;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    check-cast v3, Lk6/s6;

    invoke-virtual {v3}, Lf4/y;->k()Lk6/u7;

    move-result-object v0

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v0, v4, v2}, Lk6/u7;->K(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    return-void

    :cond_1
    :try_start_2
    move-object v6, v0

    check-cast v6, Lk6/x7;

    invoke-static {v6}, Lf6/a;->x(Ljava/lang/Object;)V

    check-cast v0, Lk6/x7;

    invoke-interface {v5, v0}, Lk6/y3;->q(Lk6/x7;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    move-object v0, v3

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lk6/q3;->o()Lk6/y5;

    move-result-object v0

    invoke-virtual {v0, v4}, Lk6/y5;->z(Ljava/lang/String;)V

    move-object v0, v3

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lf4/y;->j()Lk6/l4;

    move-result-object v0

    iget-object v0, v0, Lk6/l4;->f:Lj0/b0;

    invoke-virtual {v0, v4}, Lj0/b0;->k(Ljava/lang/String;)V

    :cond_2
    move-object v0, v3

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lk6/s6;->F()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    check-cast v3, Lk6/s6;

    invoke-virtual {v3}, Lf4/y;->k()Lk6/u7;

    move-result-object v0

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v0, v4, v2}, Lk6/u7;->K(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    return-void

    :goto_0
    :try_start_3
    move-object v5, v3

    check-cast v5, Lk6/s6;

    invoke-virtual {v5}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v5

    iget-object v5, v5, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v5, v1, v0}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    check-cast v3, Lk6/s6;

    invoke-virtual {v3}, Lf4/y;->k()Lk6/u7;

    move-result-object v0

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v0, v4, v2}, Lk6/u7;->K(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    return-void

    :goto_1
    check-cast v3, Lk6/s6;

    invoke-virtual {v3}, Lf4/y;->k()Lk6/u7;

    move-result-object v1

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v1, v4, v2}, Lk6/u7;->K(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    throw v0
.end method

.method private final l()V
    .locals 4

    iget-object v0, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lf4/y;->j()Lk6/l4;

    move-result-object v1

    invoke-virtual {v1}, Lk6/l4;->u()Lk6/s5;

    move-result-object v1

    sget-object v2, Lk6/r5;->c:Lk6/r5;

    invoke-virtual {v1, v2}, Lk6/s5;->f(Lk6/r5;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v1

    iget-object v1, v1, Lk6/d4;->k:Lk6/f4;

    const-string v2, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v1, v2}, Lk6/f4;->b(Ljava/lang/String;)V

    iget-object v1, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lk6/q3;->o()Lk6/y5;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lk6/y5;->z(Ljava/lang/String;)V

    iget-object v1, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lf4/y;->j()Lk6/l4;

    move-result-object v1

    iget-object v1, v1, Lk6/l4;->f:Lj0/b0;

    invoke-virtual {v1, v2}, Lj0/b0;->k(Ljava/lang/String;)V

    iget-object v1, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    goto/16 :goto_3

    :catchall_1
    move-exception v1

    goto/16 :goto_2

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v1, p0, Ly2/a;->d:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lk6/s6;

    iget-object v2, v2, Lk6/s6;->d:Lk6/y3;

    if-nez v2, :cond_1

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v1

    iget-object v1, v1, Lk6/d4;->f:Lk6/f4;

    const-string v2, "Failed to get app instance id"

    invoke-virtual {v1, v2}, Lk6/f4;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v1, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    :cond_1
    :try_start_4
    iget-object v1, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v1, Lk6/x7;

    invoke-static {v1}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v1, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v3, Lk6/x7;

    invoke-interface {v2, v3}, Lk6/y3;->q(Lk6/x7;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v1, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v2, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v2, Lk6/s6;

    invoke-virtual {v2}, Lk6/q3;->o()Lk6/y5;

    move-result-object v2

    invoke-virtual {v2, v1}, Lk6/y5;->z(Ljava/lang/String;)V

    iget-object v2, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v2, Lk6/s6;

    invoke-virtual {v2}, Lf4/y;->j()Lk6/l4;

    move-result-object v2

    iget-object v2, v2, Lk6/l4;->f:Lj0/b0;

    invoke-virtual {v2, v1}, Lj0/b0;->k(Ljava/lang/String;)V

    :cond_2
    iget-object v1, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lk6/s6;->F()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iget-object v1, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    :goto_0
    :try_start_6
    iget-object v2, p0, Ly2/a;->d:Ljava/lang/Object;

    check-cast v2, Lk6/s6;

    invoke-virtual {v2}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v2

    iget-object v2, v2, Lk6/d4;->f:Lk6/f4;

    const-string v3, "Failed to get app instance id"

    invoke-virtual {v2, v3, v1}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    iget-object v1, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    iget-object v2, p0, Ly2/a;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :goto_3
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 23

    move-object/from16 v1, p0

    iget v0, v1, Ly2/a;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Ln8/p;

    iget-object v2, v0, Ln8/p;->f:Lg8/c6;

    check-cast v2, Lg8/k4;

    invoke-virtual {v2}, Lg8/k4;->a()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v0, Ln8/p;->i:Ljava/lang/Long;

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Ln8/p;

    iget-object v0, v0, Ln8/p;->c:Ln8/h;

    iget-object v0, v0, Ln8/h;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/g;

    iget-object v5, v2, Ln8/g;->c:Lv6/d;

    invoke-virtual {v5}, Lv6/d;->n()V

    iget-object v5, v2, Ln8/g;->b:Lv6/d;

    iget-object v6, v2, Ln8/g;->c:Lv6/d;

    iput-object v6, v2, Ln8/g;->b:Lv6/d;

    iput-object v5, v2, Ln8/g;->c:Lv6/d;

    goto :goto_0

    :cond_0
    iget-object v0, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v0, Ln8/j;

    iget-object v2, v1, Ly2/a;->c:Ljava/lang/Object;

    check-cast v2, Le8/i;

    sget-object v5, Lr6/p;->b:Lr6/m;

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, v0, Ln8/j;->e:Lp/a;

    if-eqz v6, :cond_2

    new-instance v6, Ln8/i;

    invoke-direct {v6, v0, v2, v4}, Ln8/i;-><init>(Ln8/j;Le8/i;I)V

    const/4 v7, 0x0

    add-int/2addr v7, v4

    array-length v8, v5

    if-ge v8, v7, :cond_1

    array-length v8, v5

    invoke-static {v8, v7}, Lo7/d0;->w(II)I

    move-result v7

    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    :cond_1
    const/4 v7, 0x0

    add-int/2addr v7, v4

    aput-object v6, v5, v3

    goto :goto_1

    :cond_2
    move v7, v3

    :goto_1
    iget-object v6, v0, Ln8/j;->f:Lp/a;

    if-eqz v6, :cond_4

    new-instance v6, Ln8/i;

    invoke-direct {v6, v0, v2, v3}, Ln8/i;-><init>(Ln8/j;Le8/i;I)V

    add-int/lit8 v0, v7, 0x1

    array-length v2, v5

    if-ge v2, v0, :cond_3

    array-length v2, v5

    invoke-static {v2, v0}, Lo7/d0;->w(II)I

    move-result v0

    invoke-static {v5, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    :cond_3
    add-int/lit8 v0, v7, 0x1

    aput-object v6, v5, v7

    move v7, v0

    :cond_4
    invoke-static {v7, v5}, Lr6/p;->o(I[Ljava/lang/Object;)Lr6/a0;

    move-result-object v0

    invoke-virtual {v0, v3}, Lr6/p;->p(I)Lr6/m;

    move-result-object v0

    :goto_2
    invoke-virtual {v0}, Lr6/a;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {v0}, Lr6/a;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/o;

    iget-object v5, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v5, Ln8/p;

    iget-object v6, v5, Ln8/p;->c:Ln8/h;

    iget-object v5, v5, Ln8/p;->i:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    check-cast v2, Ln8/i;

    iget v5, v2, Ln8/i;->a:I

    iget-object v9, v2, Ln8/i;->c:Le8/i;

    iget-object v2, v2, Ln8/i;->b:Ln8/j;

    packed-switch v5, :pswitch_data_1

    iget-object v5, v2, Ln8/j;->e:Lp/a;

    iget-object v5, v5, Lp/a;->d:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v6, v5}, Ln8/p;->h(Ln8/h;I)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v11

    iget-object v12, v2, Ln8/j;->e:Lp/a;

    iget-object v13, v12, Lp/a;->c:Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-lt v11, v13, :cond_5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-nez v11, :cond_6

    :cond_5
    :goto_3
    move-object/from16 v20, v0

    goto/16 :goto_a

    :cond_6
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ln8/g;

    invoke-virtual {v14}, Ln8/g;->f()D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const-wide/16 v16, 0x0

    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/Double;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v18

    add-double v16, v18, v16

    goto :goto_5

    :cond_8
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v13

    int-to-double v14, v13

    div-double v16, v16, v14

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const-wide/16 v14, 0x0

    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_9

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/Double;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v18

    sub-double v18, v18, v16

    mul-double v18, v18, v18

    add-double v14, v18, v14

    goto :goto_6

    :cond_9
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    int-to-double v10, v11

    div-double/2addr v14, v10

    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    iget-object v14, v12, Lp/a;->a:Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    int-to-float v14, v14

    const/high16 v15, 0x447a0000    # 1000.0f

    div-float/2addr v14, v15

    float-to-double v14, v14

    mul-double/2addr v14, v10

    sub-double v14, v16, v14

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v13, v18

    check-cast v13, Ln8/g;

    invoke-virtual {v6}, Ln8/h;->b()D

    move-result-wide v20

    iget-object v3, v2, Ln8/j;->d:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move-object/from16 v22, v5

    int-to-double v4, v3

    cmpl-double v3, v20, v4

    if-ltz v3, :cond_a

    goto/16 :goto_3

    :cond_a
    invoke-virtual {v13}, Ln8/g;->f()D

    move-result-wide v3

    cmpg-double v3, v3, v14

    if-gez v3, :cond_b

    invoke-virtual {v13}, Ln8/g;->f()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    move-object/from16 v20, v0

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    filled-new-array {v13, v3, v4, v5, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}"

    const/4 v4, 0x1

    invoke-virtual {v9, v4, v3, v0}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v3, 0x64

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iget-object v4, v12, Lp/a;->b:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ge v0, v4, :cond_c

    invoke-virtual {v13, v7, v8}, Ln8/g;->b(J)V

    goto :goto_8

    :cond_b
    move-object/from16 v20, v0

    :cond_c
    :goto_8
    move-object/from16 v0, v20

    move-object/from16 v5, v22

    const/4 v3, 0x0

    const/4 v4, 0x1

    goto :goto_7

    :pswitch_0
    move-object/from16 v20, v0

    iget-object v0, v2, Ln8/j;->f:Lp/a;

    iget-object v0, v0, Lp/a;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v6, v0}, Ln8/p;->h(Ln8/h;I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    iget-object v5, v2, Ln8/j;->f:Lp/a;

    iget-object v10, v5, Lp/a;->c:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-lt v4, v10, :cond_12

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_d

    goto/16 :goto_a

    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln8/g;

    invoke-virtual {v6}, Ln8/h;->b()D

    move-result-wide v10

    iget-object v12, v2, Ln8/j;->d:Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    int-to-double v12, v12

    cmpl-double v10, v10, v12

    if-ltz v10, :cond_f

    goto :goto_a

    :cond_f
    invoke-virtual {v4}, Ln8/g;->c()J

    move-result-wide v10

    iget-object v12, v5, Lp/a;->d:Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    int-to-long v12, v12

    cmp-long v10, v10, v12

    if-gez v10, :cond_10

    goto :goto_9

    :cond_10
    iget-object v10, v5, Lp/a;->a:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    int-to-double v10, v10

    const-wide/high16 v12, 0x4059000000000000L    # 100.0

    div-double/2addr v10, v12

    iget-object v12, v4, Ln8/g;->c:Lv6/d;

    iget-object v12, v12, Lv6/d;->c:Ljava/lang/Object;

    check-cast v12, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v12

    long-to-double v12, v12

    invoke-virtual {v4}, Ln8/g;->c()J

    move-result-wide v14

    long-to-double v14, v14

    div-double/2addr v12, v14

    cmpl-double v10, v12, v10

    if-lez v10, :cond_11

    iget-object v10, v4, Ln8/g;->c:Lv6/d;

    iget-object v10, v10, Lv6/d;->c:Ljava/lang/Object;

    check-cast v10, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v10

    long-to-double v10, v10

    invoke-virtual {v4}, Ln8/g;->c()J

    move-result-wide v12

    long-to-double v12, v12

    div-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    filled-new-array {v4, v10}, [Ljava/lang/Object;

    move-result-object v10

    const-string v11, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}"

    const/4 v12, 0x1

    invoke-virtual {v9, v12, v11, v10}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    new-instance v10, Ljava/util/Random;

    invoke-direct {v10}, Ljava/util/Random;-><init>()V

    const/16 v3, 0x64

    invoke-virtual {v10, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v10

    iget-object v11, v5, Lp/a;->b:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-ge v10, v11, :cond_e

    invoke-virtual {v4, v7, v8}, Ln8/g;->b(J)V

    goto/16 :goto_9

    :cond_11
    const/16 v3, 0x64

    goto/16 :goto_9

    :cond_12
    :goto_a
    move-object/from16 v0, v20

    const/4 v3, 0x0

    const/4 v4, 0x1

    goto/16 :goto_2

    :cond_13
    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Ln8/p;

    iget-object v2, v0, Ln8/p;->c:Ln8/h;

    iget-object v0, v0, Ln8/p;->i:Ljava/lang/Long;

    iget-object v2, v2, Ln8/h;->a:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln8/g;

    invoke-virtual {v3}, Ln8/g;->e()Z

    move-result v4

    if-nez v4, :cond_16

    iget v4, v3, Ln8/g;->e:I

    if-nez v4, :cond_15

    const/4 v4, 0x0

    goto :goto_c

    :cond_15
    add-int/lit8 v4, v4, -0x1

    :goto_c
    iput v4, v3, Ln8/g;->e:I

    :cond_16
    invoke-virtual {v3}, Ln8/g;->e()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v6, v3, Ln8/g;->a:Ln8/j;

    iget-object v6, v6, Ln8/j;->b:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v8, v3, Ln8/g;->a:Ln8/j;

    iget-object v8, v8, Ln8/j;->c:Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iget-object v8, v3, Ln8/g;->d:Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    iget-object v10, v3, Ln8/g;->a:Ln8/j;

    iget-object v10, v10, Ln8/j;->b:Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget v12, v3, Ln8/g;->e:I

    int-to-long v12, v12

    mul-long/2addr v10, v12

    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    add-long/2addr v6, v8

    cmp-long v4, v4, v6

    if-lez v4, :cond_14

    invoke-virtual {v3}, Ln8/g;->g()V

    goto :goto_b

    :cond_17
    return-void

    :pswitch_1
    const-string v0, "Unsupported SocketAddress implementation "

    :try_start_0
    iget-object v3, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_d

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    :goto_d
    new-instance v3, Lh8/m;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v3}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v3

    :try_start_1
    iget-object v4, v1, Ly2/a;->d:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Lh8/n;

    iget-object v5, v5, Lh8/n;->Q:Le8/k0;

    if-nez v5, :cond_18

    move-object v0, v4

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->A:Ljavax/net/SocketFactory;

    check-cast v4, Lh8/n;

    iget-object v4, v4, Lh8/n;->a:Ljava/net/InetSocketAddress;

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v4

    iget-object v5, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v5, Lh8/n;

    iget-object v5, v5, Lh8/n;->a:Ljava/net/InetSocketAddress;

    invoke-virtual {v5}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v5

    invoke-virtual {v0, v4, v5}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v0

    :goto_e
    move-object v6, v0

    goto :goto_f

    :catchall_0
    move-exception v0

    goto/16 :goto_17

    :catch_1
    move-exception v0

    goto/16 :goto_13

    :catch_2
    move-exception v0

    goto/16 :goto_15

    :cond_18
    move-object v5, v4

    check-cast v5, Lh8/n;

    iget-object v5, v5, Lh8/n;->Q:Le8/k0;

    iget-object v5, v5, Le8/k0;->a:Ljava/net/SocketAddress;

    instance-of v5, v5, Ljava/net/InetSocketAddress;

    if-eqz v5, :cond_1f

    move-object v0, v4

    check-cast v0, Lh8/n;

    move-object v5, v4

    check-cast v5, Lh8/n;

    iget-object v5, v5, Lh8/n;->Q:Le8/k0;

    iget-object v5, v5, Le8/k0;->b:Ljava/net/InetSocketAddress;

    move-object v6, v4

    check-cast v6, Lh8/n;

    iget-object v6, v6, Lh8/n;->Q:Le8/k0;

    iget-object v6, v6, Le8/k0;->a:Ljava/net/SocketAddress;

    check-cast v6, Ljava/net/InetSocketAddress;

    move-object v7, v4

    check-cast v7, Lh8/n;

    iget-object v7, v7, Lh8/n;->Q:Le8/k0;

    iget-object v7, v7, Le8/k0;->c:Ljava/lang/String;

    check-cast v4, Lh8/n;

    iget-object v4, v4, Lh8/n;->Q:Le8/k0;

    iget-object v4, v4, Le8/k0;->d:Ljava/lang/String;

    invoke-static {v0, v5, v6, v7, v4}, Lh8/n;->h(Lh8/n;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object v0

    goto :goto_e

    :goto_f
    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lh8/n;

    iget-object v4, v4, Lh8/n;->B:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v4, :cond_1a

    move-object v2, v0

    check-cast v2, Lh8/n;

    iget-object v4, v2, Lh8/n;->B:Ljavax/net/ssl/SSLSocketFactory;

    move-object v2, v0

    check-cast v2, Lh8/n;

    iget-object v5, v2, Lh8/n;->C:Ljavax/net/ssl/HostnameVerifier;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->b:Ljava/lang/String;

    invoke-static {v0}, Lg8/s1;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_19

    invoke-virtual {v2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    :cond_19
    move-object v7, v0

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    invoke-virtual {v0}, Lh8/n;->l()I

    move-result v8

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v9, v0, Lh8/n;->F:Li8/b;

    invoke-static/range {v4 .. v9}, Lh8/s;->a(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Socket;Ljava/lang/String;ILi8/b;)Ljavax/net/ssl/SSLSocket;

    move-result-object v6

    invoke-virtual {v6}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v2

    :cond_1a
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    invoke-static {v6}, Lr9/a;->p(Ljava/net/Socket;)Lja/c;

    move-result-object v0

    invoke-static {v0}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v3

    iget-object v0, v1, Ly2/a;->c:Ljava/lang/Object;

    check-cast v0, Lh8/c;

    invoke-static {v6}, Lr9/a;->n(Ljava/net/Socket;)Lja/b;

    move-result-object v4

    invoke-virtual {v0, v4, v6}, Lh8/c;->a(Lja/b;Ljava/net/Socket;)V

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lh8/n;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->u:Le8/c;

    invoke-virtual {v0}, Le8/c;->a()Le8/a;

    move-result-object v0

    sget-object v5, Le8/i;->a:Le8/b;

    invoke-virtual {v6}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    move-result-object v7

    invoke-virtual {v0, v5, v7}, Le8/a;->c(Le8/b;Ljava/lang/Object;)V

    sget-object v5, Le8/i;->b:Le8/b;

    invoke-virtual {v6}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Le8/a;->c(Le8/b;Ljava/lang/Object;)V

    sget-object v5, Le8/i;->c:Le8/b;

    invoke-virtual {v0, v5, v2}, Le8/a;->c(Le8/b;Ljava/lang/Object;)V

    sget-object v5, Lg8/l;->a:Le8/b;

    if-nez v2, :cond_1b

    sget-object v6, Le8/x1;->a:Le8/x1;

    goto :goto_10

    :cond_1b
    sget-object v6, Le8/x1;->b:Le8/x1;

    :goto_10
    invoke-virtual {v0, v5, v6}, Le8/a;->c(Le8/b;Ljava/lang/Object;)V

    invoke-virtual {v0}, Le8/a;->a()Le8/c;

    move-result-object v0

    iput-object v0, v4, Lh8/n;->u:Le8/c;
    :try_end_1
    .catch Le8/d2; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    new-instance v4, Lk6/v6;

    iget-object v5, v0, Lh8/n;->g:Lj8/m;

    check-cast v5, Lj8/k;

    invoke-virtual {v5, v3}, Lj8/k;->d(Lja/a0;)Lj8/i;

    move-result-object v3

    invoke-direct {v4, v0, v3}, Lk6/v6;-><init>(Lh8/n;Lj8/i;)V

    iput-object v4, v0, Lh8/n;->t:Lk6/v6;

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v4, v0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v4

    :try_start_2
    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v2, :cond_1e

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lh8/n;

    invoke-interface {v2}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    invoke-interface {v2}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    if-eqz v0, :cond_1c

    const/4 v5, 0x0

    aget-object v0, v0, v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_11

    :cond_1c
    const/4 v5, 0x0

    :goto_11
    :try_start_3
    invoke-interface {v2}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    if-eqz v0, :cond_1d

    aget-object v0, v0, v5
    :try_end_3
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_12

    :catch_3
    move-exception v0

    :try_start_4
    sget-object v5, Le8/n0;->d:Ljava/util/logging/Logger;

    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-interface {v2}, Ljavax/net/ssl/SSLSession;->getPeerHost()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v7, "Peer cert not available for peerHost=%s"

    invoke-static {v7, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v6, v2, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1d
    :goto_12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1e
    monitor-exit v4

    goto :goto_16

    :catchall_1
    move-exception v0

    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_1f
    :try_start_5
    sget-object v2, Le8/c2;->l:Le8/c2;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->Q:Le8/k0;

    iget-object v0, v0, Le8/k0;->a:Ljava/net/SocketAddress;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    new-instance v2, Le8/d2;

    invoke-direct {v2, v0}, Le8/d2;-><init>(Le8/c2;)V

    throw v2
    :try_end_5
    .catch Le8/d2; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_13
    :try_start_6
    iget-object v2, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v2, Lh8/n;

    invoke-virtual {v2, v0}, Lh8/n;->p(Ljava/lang/Exception;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    new-instance v2, Lk6/v6;

    iget-object v4, v0, Lh8/n;->g:Lj8/m;

    check-cast v4, Lj8/k;

    invoke-virtual {v4, v3}, Lj8/k;->d(Lja/a0;)Lj8/i;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lk6/v6;-><init>(Lh8/n;Lj8/i;)V

    :goto_14
    iput-object v2, v0, Lh8/n;->t:Lk6/v6;

    goto :goto_16

    :goto_15
    :try_start_7
    iget-object v2, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v2, Lh8/n;

    sget-object v4, Lj8/a;->d:Lj8/a;

    iget-object v0, v0, Le8/d2;->a:Le8/c2;

    sget-object v5, Lh8/n;->S:Ljava/util/Map;

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v4, v0}, Lh8/n;->s(ILj8/a;Le8/c2;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    new-instance v2, Lk6/v6;

    iget-object v4, v0, Lh8/n;->g:Lj8/m;

    check-cast v4, Lj8/k;

    invoke-virtual {v4, v3}, Lj8/k;->d(Lja/a0;)Lj8/i;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lk6/v6;-><init>(Lh8/n;Lj8/i;)V

    goto :goto_14

    :goto_16
    return-void

    :goto_17
    iget-object v2, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v2, Lh8/n;

    new-instance v4, Lk6/v6;

    iget-object v5, v2, Lh8/n;->g:Lj8/m;

    check-cast v5, Lj8/k;

    invoke-virtual {v5, v3}, Lj8/k;->d(Lja/a0;)Lj8/i;

    move-result-object v3

    invoke-direct {v4, v2, v3}, Lk6/v6;-><init>(Lh8/n;Lj8/i;)V

    iput-object v4, v2, Lh8/n;->t:Lk6/v6;

    throw v0

    :pswitch_2
    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lg8/c3;

    iget-object v2, v0, Lg8/c3;->b:Lg8/l3;

    iget-object v3, v2, Lg8/l3;->w:Lg8/c3;

    if-eq v0, v3, :cond_20

    goto :goto_18

    :cond_20
    iget-object v3, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v3, Lz6/a;

    iput-object v3, v2, Lg8/l3;->x:Lz6/a;

    iget-object v2, v2, Lg8/l3;->D:Lg8/y0;

    invoke-virtual {v2, v3}, Lg8/y0;->i(Lz6/a;)V

    iget-object v2, v1, Ly2/a;->c:Ljava/lang/Object;

    check-cast v2, Le8/x;

    sget-object v4, Le8/x;->e:Le8/x;

    if-eq v2, v4, :cond_21

    iget-object v4, v0, Lg8/c3;->b:Lg8/l3;

    iget-object v4, v4, Lg8/l3;->N:Lg8/z;

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v5, "Entering {0} state with picker: {1}"

    const/4 v6, 0x2

    invoke-virtual {v4, v6, v5, v3}, Lg8/z;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, v0, Lg8/c3;->b:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->r:Lz5/k;

    invoke-virtual {v0, v2}, Lz5/k;->c(Le8/x;)V

    :cond_21
    :goto_18
    return-void

    :pswitch_3
    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lg8/l3;

    iget-object v2, v0, Lg8/l3;->r:Lz5/k;

    iget-object v3, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Runnable;

    iget-object v0, v0, Lg8/l3;->h:Ljava/util/concurrent/Executor;

    iget-object v4, v1, Ly2/a;->c:Ljava/lang/Object;

    check-cast v4, Le8/x;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "callback"

    invoke-static {v3, v5}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "executor"

    invoke-static {v0, v5}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "source"

    invoke-static {v4, v5}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lg8/p0;

    invoke-direct {v5, v3, v0}, Lg8/p0;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v6, v2, Lz5/k;->b:Ljava/lang/Object;

    check-cast v6, Le8/x;

    if-eq v6, v4, :cond_22

    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_19

    :cond_22
    iget-object v0, v2, Lz5/k;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_19
    return-void

    :pswitch_4
    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lg8/u0;

    iget-object v0, v0, Lg8/u0;->a:Le8/j;

    iget-object v2, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v2, Le8/c2;

    iget-object v3, v1, Ly2/a;->c:Ljava/lang/Object;

    check-cast v3, Le8/l1;

    invoke-virtual {v0, v2, v3}, Le8/j;->onClose(Le8/c2;Le8/l1;)V

    return-void

    :pswitch_5
    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lg8/v0;

    iget-object v0, v0, Lg8/v0;->f:Le8/k;

    iget-object v2, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v2, Le8/j;

    iget-object v3, v1, Ly2/a;->c:Ljava/lang/Object;

    check-cast v3, Le8/l1;

    invoke-virtual {v0, v2, v3}, Le8/k;->start(Le8/j;Le8/l1;)V

    return-void

    :pswitch_6
    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Le8/h2;

    iget-object v2, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v2, Le8/g2;

    invoke-virtual {v0, v2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_7
    iget-object v0, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v0, Lj/a;

    iget-object v2, v1, Ly2/a;->c:Ljava/lang/Object;

    check-cast v2, Lk6/d4;

    iget-object v3, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v3, Landroid/app/job/JobParameters;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lk6/d4;->n:Lk6/f4;

    const-string v4, "AppMeasurementJobService processed last upload request."

    invoke-virtual {v2, v4}, Lk6/f4;->b(Ljava/lang/String;)V

    iget-object v0, v0, Lj/a;->a:Landroid/content/Context;

    check-cast v0, Lk6/e7;

    invoke-interface {v0, v3}, Lk6/e7;->b(Landroid/app/job/JobParameters;)V

    return-void

    :pswitch_8
    iget-object v0, v1, Ly2/a;->b:Ljava/lang/Object;

    iget-object v2, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v2, Lk6/s6;

    iget-object v3, v2, Lk6/s6;->d:Lk6/y3;

    const-string v4, "Failed to send default event parameters to service"

    if-nez v3, :cond_23

    invoke-virtual {v2}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    iget-object v0, v0, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v0, v4}, Lk6/f4;->b(Ljava/lang/String;)V

    goto :goto_1a

    :cond_23
    :try_start_8
    move-object v5, v0

    check-cast v5, Lk6/x7;

    invoke-static {v5}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v5, v1, Ly2/a;->c:Ljava/lang/Object;

    check-cast v5, Landroid/os/Bundle;

    check-cast v0, Lk6/x7;

    invoke-interface {v3, v5, v0}, Lk6/y3;->c(Landroid/os/Bundle;Lk6/x7;)V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_4

    goto :goto_1a

    :catch_4
    move-exception v0

    invoke-virtual {v2}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v2

    iget-object v2, v2, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v2, v4, v0}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1a
    return-void

    :pswitch_9
    invoke-direct/range {p0 .. p0}, Ly2/a;->l()V

    return-void

    :pswitch_a
    invoke-direct/range {p0 .. p0}, Ly2/a;->k()V

    return-void

    :pswitch_b
    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lk6/h5;

    iget-object v2, v0, Lk6/h5;->a:Lk6/p7;

    invoke-virtual {v2}, Lk6/p7;->N()V

    iget-object v2, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v2, Lk6/t7;

    invoke-virtual {v2}, Lk6/t7;->e()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, v1, Ly2/a;->c:Ljava/lang/Object;

    if-nez v3, :cond_24

    iget-object v0, v0, Lk6/h5;->a:Lk6/p7;

    iget-object v2, v2, Lk6/t7;->b:Ljava/lang/String;

    check-cast v4, Lk6/x7;

    invoke-virtual {v0, v2, v4}, Lk6/p7;->k(Ljava/lang/String;Lk6/x7;)V

    goto :goto_1b

    :cond_24
    iget-object v0, v0, Lk6/h5;->a:Lk6/p7;

    check-cast v4, Lk6/x7;

    invoke-virtual {v0, v2, v4}, Lk6/p7;->p(Lk6/t7;Lk6/x7;)V

    :goto_1b
    return-void

    :pswitch_c
    iget-object v0, v1, Ly2/a;->d:Ljava/lang/Object;

    check-cast v0, Lk6/h5;

    iget-object v3, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v3, Lk6/v;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Lk6/v;->a:Ljava/lang/String;

    const-string v5, "_cmp"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_27

    iget-object v4, v3, Lk6/v;->b:Lk6/s;

    if-eqz v4, :cond_27

    iget-object v4, v4, Lk6/s;->a:Landroid/os/Bundle;

    invoke-virtual {v4}, Landroid/os/BaseBundle;->size()I

    move-result v5

    if-nez v5, :cond_25

    goto :goto_1c

    :cond_25
    const-string v5, "_cis"

    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "referrer broadcast"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_26

    const-string v5, "referrer API"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_27

    :cond_26
    iget-object v4, v0, Lk6/h5;->a:Lk6/p7;

    invoke-virtual {v4}, Lk6/p7;->zzj()Lk6/d4;

    move-result-object v4

    invoke-virtual {v3}, Lk6/v;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v4, v4, Lk6/d4;->l:Lk6/f4;

    const-string v6, "Event has been filtered "

    invoke-virtual {v4, v6, v5}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v4, Lk6/v;

    const-string v8, "_cmpx"

    iget-object v9, v3, Lk6/v;->b:Lk6/s;

    iget-object v10, v3, Lk6/v;->c:Ljava/lang/String;

    iget-wide v11, v3, Lk6/v;->d:J

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lk6/v;-><init>(Ljava/lang/String;Lk6/s;Ljava/lang/String;J)V

    move-object v3, v4

    :cond_27
    :goto_1c
    iget-object v4, v3, Lk6/v;->a:Ljava/lang/String;

    iget-object v5, v1, Ly2/a;->c:Ljava/lang/Object;

    check-cast v5, Lk6/x7;

    iget-object v6, v0, Lk6/h5;->a:Lk6/p7;

    iget-object v7, v6, Lk6/p7;->a:Lk6/t4;

    iget-object v8, v6, Lk6/p7;->g:Lk6/r7;

    invoke-static {v7}, Lk6/p7;->o(Lk6/m7;)V

    iget-object v9, v5, Lk6/x7;->a:Ljava/lang/String;

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_28

    goto/16 :goto_21

    :cond_28
    iget-object v7, v7, Lk6/t4;->h:Lq/f;

    invoke-virtual {v7, v9}, Lq/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    if-nez v7, :cond_29

    goto/16 :goto_21

    :cond_29
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zza()I

    move-result v7

    if-eqz v7, :cond_2f

    invoke-virtual {v6}, Lk6/p7;->zzj()Lk6/d4;

    move-result-object v7

    iget-object v7, v7, Lk6/d4;->n:Lk6/f4;

    const-string v9, "EES config found for"

    iget-object v10, v5, Lk6/x7;->a:Ljava/lang/String;

    invoke-virtual {v7, v9, v10}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v7, v6, Lk6/p7;->a:Lk6/t4;

    invoke-static {v7}, Lk6/p7;->o(Lk6/m7;)V

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_2a

    goto :goto_1d

    :cond_2a
    iget-object v2, v7, Lk6/t4;->j:Lq4/h;

    invoke-virtual {v2, v10}, Lq/n;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzb;

    :goto_1d
    if-nez v2, :cond_2b

    invoke-virtual {v6}, Lk6/p7;->zzj()Lk6/d4;

    move-result-object v2

    const-string v4, "EES not loaded for"

    iget-object v2, v2, Lk6/d4;->n:Lk6/f4;

    invoke-virtual {v2, v4, v10}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v5}, Lk6/h5;->t(Lk6/v;Lk6/x7;)V

    goto/16 :goto_22

    :cond_2b
    :try_start_9
    invoke-static {v8}, Lk6/p7;->o(Lk6/m7;)V

    iget-object v7, v3, Lk6/v;->b:Lk6/s;

    invoke-virtual {v7}, Lk6/s;->g()Landroid/os/Bundle;

    move-result-object v7

    const/4 v9, 0x1

    invoke-static {v7, v9}, Lk6/r7;->B(Landroid/os/Bundle;Z)Ljava/util/HashMap;

    move-result-object v7

    sget-object v9, Lk6/t5;->c:[Ljava/lang/String;

    sget-object v10, Lk6/t5;->a:[Ljava/lang/String;

    invoke-static {v9, v10, v4}, Ly3/e;->a1([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_2c

    move-object v9, v4

    :cond_2c
    new-instance v10, Lcom/google/android/gms/internal/measurement/zzad;

    iget-wide v11, v3, Lk6/v;->d:J

    invoke-direct {v10, v9, v11, v12, v7}, Lcom/google/android/gms/internal/measurement/zzad;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/measurement/zzb;->zza(Lcom/google/android/gms/internal/measurement/zzad;)Z

    move-result v7
    :try_end_9
    .catch Lcom/google/android/gms/internal/measurement/zzc; {:try_start_9 .. :try_end_9} :catch_5

    if-nez v7, :cond_2d

    goto :goto_20

    :cond_2d
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzb;->zzd()Z

    move-result v7

    if-eqz v7, :cond_2e

    invoke-virtual {v6}, Lk6/p7;->zzj()Lk6/d4;

    move-result-object v3

    const-string v7, "EES edited event"

    iget-object v3, v3, Lk6/d4;->n:Lk6/f4;

    invoke-virtual {v3, v7, v4}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v8}, Lk6/p7;->o(Lk6/m7;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzb;->zza()Lcom/google/android/gms/internal/measurement/zzac;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzac;->zzb()Lcom/google/android/gms/internal/measurement/zzad;

    move-result-object v3

    invoke-static {v3}, Lk6/r7;->D(Lcom/google/android/gms/internal/measurement/zzad;)Lk6/v;

    move-result-object v3

    invoke-virtual {v0, v3, v5}, Lk6/h5;->t(Lk6/v;Lk6/x7;)V

    goto :goto_1e

    :cond_2e
    invoke-virtual {v0, v3, v5}, Lk6/h5;->t(Lk6/v;Lk6/x7;)V

    :goto_1e
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzb;->zzc()Z

    move-result v3

    if-eqz v3, :cond_30

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzb;->zza()Lcom/google/android/gms/internal/measurement/zzac;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzac;->zzc()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_30

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzad;

    invoke-virtual {v6}, Lk6/p7;->zzj()Lk6/d4;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzad;->zzb()Ljava/lang/String;

    move-result-object v7

    iget-object v4, v4, Lk6/d4;->n:Lk6/f4;

    const-string v9, "EES logging created event"

    invoke-virtual {v4, v9, v7}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v8}, Lk6/p7;->o(Lk6/m7;)V

    invoke-static {v3}, Lk6/r7;->D(Lcom/google/android/gms/internal/measurement/zzad;)Lk6/v;

    move-result-object v3

    invoke-virtual {v0, v3, v5}, Lk6/h5;->t(Lk6/v;Lk6/x7;)V

    goto :goto_1f

    :catch_5
    invoke-virtual {v6}, Lk6/p7;->zzj()Lk6/d4;

    move-result-object v2

    iget-object v2, v2, Lk6/d4;->f:Lk6/f4;

    const-string v7, "EES error. appId, eventName"

    iget-object v8, v5, Lk6/x7;->b:Ljava/lang/String;

    invoke-virtual {v2, v7, v8, v4}, Lk6/f4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_20
    invoke-virtual {v6}, Lk6/p7;->zzj()Lk6/d4;

    move-result-object v2

    iget-object v2, v2, Lk6/d4;->n:Lk6/f4;

    const-string v6, "EES was not applied to event"

    invoke-virtual {v2, v6, v4}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v5}, Lk6/h5;->t(Lk6/v;Lk6/x7;)V

    goto :goto_22

    :cond_2f
    :goto_21
    invoke-virtual {v0, v3, v5}, Lk6/h5;->t(Lk6/v;Lk6/x7;)V

    :cond_30
    :goto_22
    return-void

    :pswitch_d
    invoke-direct/range {p0 .. p0}, Ly2/a;->j()V

    return-void

    :pswitch_e
    invoke-direct/range {p0 .. p0}, Ly2/a;->i()V

    return-void

    :pswitch_f
    invoke-direct/range {p0 .. p0}, Ly2/a;->h()V

    return-void

    :pswitch_10
    invoke-direct/range {p0 .. p0}, Ly2/a;->g()V

    throw v2

    :pswitch_11
    invoke-direct/range {p0 .. p0}, Ly2/a;->f()V

    return-void

    :pswitch_12
    invoke-direct/range {p0 .. p0}, Ly2/a;->e()V

    return-void

    :pswitch_13
    invoke-direct/range {p0 .. p0}, Ly2/a;->d()V

    return-void

    :pswitch_14
    invoke-direct/range {p0 .. p0}, Ly2/a;->c()V

    return-void

    :pswitch_15
    invoke-direct/range {p0 .. p0}, Ly2/a;->b()V

    return-void

    :pswitch_16
    iget-object v0, v1, Ly2/a;->b:Ljava/lang/Object;

    check-cast v0, La3/a;

    iget-object v2, v1, Ly2/a;->c:Ljava/lang/Object;

    invoke-interface {v0, v2}, La3/a;->accept(Ljava/lang/Object;)V

    return-void

    :pswitch_17
    invoke-direct/range {p0 .. p0}, Ly2/a;->a()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Ly2/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ly2/a;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(scheduled in SynchronizationContext)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method
