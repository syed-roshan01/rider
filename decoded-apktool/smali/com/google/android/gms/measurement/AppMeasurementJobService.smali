.class public final Lcom/google/android/gms/measurement/AppMeasurementJobService;
.super Landroid/app/job/JobService;

# interfaces
.implements Lk6/e7;


# instance fields
.field public a:Lj/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public final b(Landroid/app/job/JobParameters;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    return-void
.end method

.method public final c()Lj/a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementJobService;->a:Lj/a;

    if-nez v0, :cond_0

    new-instance v0, Lj/a;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lj/a;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementJobService;->a:Lj/a;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementJobService;->a:Lj/a;

    return-object v0
.end method

.method public final onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementJobService;->c()Lj/a;

    move-result-object v0

    iget-object v0, v0, Lj/a;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lk6/f5;->a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lk6/f5;

    move-result-object v0

    iget-object v0, v0, Lk6/f5;->i:Lk6/d4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    const-string v1, "Local AppMeasurementService is starting up"

    iget-object v0, v0, Lk6/d4;->n:Lk6/f4;

    invoke-virtual {v0, v1}, Lk6/f4;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementJobService;->c()Lj/a;

    move-result-object v0

    iget-object v0, v0, Lj/a;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lk6/f5;->a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lk6/f5;

    move-result-object v0

    iget-object v0, v0, Lk6/f5;->i:Lk6/d4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    const-string v1, "Local AppMeasurementService is shutting down"

    iget-object v0, v0, Lk6/d4;->n:Lk6/f4;

    invoke-virtual {v0, v1}, Lk6/f4;->b(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onRebind(Landroid/content/Intent;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementJobService;->c()Lj/a;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lj/a;->f()Lk6/d4;

    move-result-object p1

    const-string v0, "onRebind called with null intent"

    iget-object p1, p1, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {p1, v0}, Lk6/f4;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lj/a;->f()Lk6/d4;

    move-result-object v0

    const-string v1, "onRebind called. action"

    iget-object v0, v0, Lk6/d4;->n:Lk6/f4;

    invoke-virtual {v0, v1, p1}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementJobService;->c()Lj/a;

    move-result-object v0

    iget-object v1, v0, Lj/a;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lk6/f5;->a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lk6/f5;

    move-result-object v1

    iget-object v1, v1, Lk6/f5;->i:Lk6/d4;

    invoke-static {v1}, Lk6/f5;->d(Lk6/o5;)V

    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v2

    const-string v3, "action"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Local AppMeasurementJobService called. action"

    iget-object v4, v1, Lk6/d4;->n:Lk6/f4;

    invoke-virtual {v4, v3, v2}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ly2/a;

    const/16 v3, 0x10

    invoke-direct {v2, v0, v1, p1, v3}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Parcelable;I)V

    iget-object p1, v0, Lj/a;->a:Landroid/content/Context;

    invoke-static {p1}, Lk6/p7;->e(Landroid/content/Context;)Lk6/p7;

    move-result-object p1

    invoke-virtual {p1}, Lk6/p7;->zzl()Lk6/z4;

    move-result-object v0

    new-instance v1, Ll/h;

    invoke-direct {v1, p1, v2}, Ll/h;-><init>(Lk6/p7;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onUnbind(Landroid/content/Intent;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementJobService;->c()Lj/a;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lj/a;->f()Lk6/d4;

    move-result-object p1

    const-string v0, "onUnbind called with null intent"

    iget-object p1, p1, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {p1, v0}, Lk6/f4;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lj/a;->f()Lk6/d4;

    move-result-object v0

    const-string v1, "onUnbind called for intent. action"

    iget-object v0, v0, Lk6/d4;->n:Lk6/f4;

    invoke-virtual {v0, v1, p1}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final zza(I)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
