.class public Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;
.super Lcom/google/android/gms/internal/measurement/zzct;


# annotations
.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# instance fields
.field public a:Lk6/f5;

.field public final b:Lq/f;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzct;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    new-instance v0, Lq/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq/z;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lq/f;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempting to perform action before initialize."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->l:Lk6/u7;

    invoke-static {v0}, Lk6/f5;->c(Lk6/o5;)V

    invoke-virtual {v0, p1, p2}, Lk6/u7;->K(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    return-void
.end method

.method public beginAdUnitExposure(Ljava/lang/String;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    invoke-virtual {v0}, Lk6/f5;->i()Lk6/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lk6/q;->u(Ljava/lang/String;J)V

    return-void
.end method

.method public clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v0, p1, p2, p3}, Lk6/y5;->B(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public clearMeasurementEnabled(J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p1, p1, Lk6/f5;->p:Lk6/y5;

    invoke-static {p1}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {p1}, Lk6/p2;->s()V

    invoke-virtual {p1}, Lf4/y;->zzl()Lk6/z4;

    move-result-object p2

    new-instance v0, Ll/h;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public endAdUnitExposure(Ljava/lang/String;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    invoke-virtual {v0}, Lk6/f5;->i()Lk6/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lk6/q;->x(Ljava/lang/String;J)V

    return-void
.end method

.method public generateEventId(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->l:Lk6/u7;

    invoke-static {v0}, Lk6/f5;->c(Lk6/o5;)V

    invoke-virtual {v0}, Lk6/u7;->t0()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v2, v2, Lk6/f5;->l:Lk6/u7;

    invoke-static {v2}, Lk6/f5;->c(Lk6/o5;)V

    invoke-virtual {v2, p1, v0, v1}, Lk6/u7;->F(Lcom/google/android/gms/internal/measurement/zzcv;J)V

    return-void
.end method

.method public getAppInstanceId(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->j:Lk6/z4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    new-instance v1, Lk6/n5;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lk6/n5;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;I)V

    invoke-virtual {v0, v1}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCachedAppInstanceId(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v0, v0, Lk6/y5;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    return-void
.end method

.method public getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->j:Lk6/z4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    new-instance v7, Lk/e;

    const/4 v6, 0x3

    move-object v1, v7

    move-object v2, p0

    move-object v3, p3

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lk/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v7}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCurrentScreenClass(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v0, v0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->o:Lk6/p6;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v0, v0, Lk6/p6;->c:Lk6/q6;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lk6/q6;->b:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    return-void
.end method

.method public getCurrentScreenName(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v0, v0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->o:Lk6/p6;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v0, v0, Lk6/p6;->c:Lk6/q6;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lk6/q6;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    return-void
.end method

.method public getGmpAppId(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v1, v0, Lf4/y;->a:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lk6/f5;

    iget-object v3, v2, Lk6/f5;->b:Ljava/lang/String;

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v0}, Lf4/y;->zza()Landroid/content/Context;

    move-result-object v0

    check-cast v1, Lk6/f5;

    iget-object v1, v1, Lk6/f5;->s:Ljava/lang/String;

    const-string v4, "google_app_id"

    invoke-static {v0}, Lf6/a;->x(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/s;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v0, "string"

    invoke-virtual {v5, v4, v0, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    :try_start_1
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v3, v0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v1, v2, Lk6/f5;->i:Lk6/d4;

    invoke-static {v1}, Lk6/f5;->d(Lk6/o5;)V

    const-string v2, "getGoogleAppId failed with exception"

    iget-object v1, v1, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v1, v2, v0}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :catch_1
    :goto_1
    invoke-virtual {p0, v3, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    return-void
.end method

.method public getMaxUserProperties(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    invoke-static {p1}, Lf6/a;->u(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p1, p1, Lk6/f5;->l:Lk6/u7;

    invoke-static {p1}, Lk6/f5;->c(Lk6/o5;)V

    const/16 v0, 0x19

    invoke-virtual {p1, p2, v0}, Lk6/u7;->E(Lcom/google/android/gms/internal/measurement/zzcv;I)V

    return-void
.end method

.method public getSessionId(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v1

    new-instance v2, Ll/h;

    const/16 v3, 0x8

    invoke-direct {v2, v3, v0, p1}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getTestFlag(Lcom/google/android/gms/internal/measurement/zzcv;I)V
    .locals 9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    const/4 v0, 0x2

    if-eqz p2, :cond_4

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-eq p2, v2, :cond_3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->l:Lk6/u7;

    invoke-static {p2}, Lk6/f5;->c(Lk6/o5;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v3

    const-wide/16 v5, 0x3a98

    const-string v7, "boolean test flag value"

    new-instance v8, Lk6/z5;

    invoke-direct {v8, v0, v4, v2}, Lk6/z5;-><init>(Lk6/y5;Ljava/util/concurrent/atomic/AtomicReference;I)V

    invoke-virtual/range {v3 .. v8}, Lk6/z4;->p(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p2, p1, v0}, Lk6/u7;->I(Lcom/google/android/gms/internal/measurement/zzcv;Z)V

    :goto_0
    return-void

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->l:Lk6/u7;

    invoke-static {p2}, Lk6/f5;->c(Lk6/o5;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v1, v1, Lk6/f5;->p:Lk6/y5;

    invoke-static {v1}, Lk6/f5;->b(Lk6/p2;)V

    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v1}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v2

    const-wide/16 v4, 0x3a98

    const-string v6, "int test flag value"

    new-instance v7, Lk6/z5;

    invoke-direct {v7, v1, v3, v0}, Lk6/z5;-><init>(Lk6/y5;Ljava/util/concurrent/atomic/AtomicReference;I)V

    invoke-virtual/range {v2 .. v7}, Lk6/z4;->p(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Lk6/u7;->E(Lcom/google/android/gms/internal/measurement/zzcv;I)V

    return-void

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->l:Lk6/u7;

    invoke-static {p2}, Lk6/f5;->c(Lk6/o5;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v1

    const-wide/16 v3, 0x3a98

    const-string v5, "double test flag value"

    new-instance v6, Lk6/z5;

    const/4 v7, 0x5

    invoke-direct {v6, v0, v2, v7}, Lk6/z5;-><init>(Lk6/y5;Ljava/util/concurrent/atomic/AtomicReference;I)V

    invoke-virtual/range {v1 .. v6}, Lk6/z4;->p(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "r"

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    :try_start_0
    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/measurement/zzcv;->zza(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p2, Lf4/y;->a:Ljava/lang/Object;

    check-cast p2, Lk6/f5;

    iget-object p2, p2, Lk6/f5;->i:Lk6/d4;

    invoke-static {p2}, Lk6/f5;->d(Lk6/o5;)V

    const-string v0, "Error returning double value to wrapper"

    iget-object p2, p2, Lk6/d4;->i:Lk6/f4;

    invoke-virtual {p2, v0, p1}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->l:Lk6/u7;

    invoke-static {p2}, Lk6/f5;->c(Lk6/o5;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v2

    const-wide/16 v4, 0x3a98

    const-string v6, "long test flag value"

    new-instance v7, Lk6/z5;

    invoke-direct {v7, v0, v3, v1}, Lk6/z5;-><init>(Lk6/y5;Ljava/util/concurrent/atomic/AtomicReference;I)V

    invoke-virtual/range {v2 .. v7}, Lk6/z4;->p(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p2, p1, v0, v1}, Lk6/u7;->F(Lcom/google/android/gms/internal/measurement/zzcv;J)V

    return-void

    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->l:Lk6/u7;

    invoke-static {p2}, Lk6/f5;->c(Lk6/o5;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v1, v1, Lk6/f5;->p:Lk6/y5;

    invoke-static {v1}, Lk6/f5;->b(Lk6/p2;)V

    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v1}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v2

    const-wide/16 v4, 0x3a98

    const-string v6, "String test flag value"

    new-instance v7, Lk6/z5;

    invoke-direct {v7, v1, v3, v0}, Lk6/z5;-><init>(Lk6/y5;Ljava/util/concurrent/atomic/AtomicReference;I)V

    invoke-virtual/range {v2 .. v7}, Lk6/z4;->p(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Lk6/u7;->K(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V

    return-void
.end method

.method public getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->j:Lk6/z4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    new-instance v7, Landroidx/fragment/app/h;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Landroidx/fragment/app/h;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public initForTests(Ljava/util/Map;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    return-void
.end method

.method public initialize(Lg6/a;Lcom/google/android/gms/internal/measurement/zzdd;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    if-nez v0, :cond_0

    invoke-static {p1}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lk6/f5;->a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lk6/f5;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    return-void

    :cond_0
    iget-object p1, v0, Lk6/f5;->i:Lk6/d4;

    invoke-static {p1}, Lk6/f5;->d(Lk6/o5;)V

    const-string p2, "Attempting to initialize multiple times"

    iget-object p1, p1, Lk6/d4;->i:Lk6/f4;

    invoke-virtual {p1, p2}, Lk6/f4;->b(Ljava/lang/String;)V

    return-void
.end method

.method public isDataCollectionEnabled(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->j:Lk6/z4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    new-instance v1, Lk6/n5;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lk6/n5;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;I)V

    invoke-virtual {v0, v1}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 10

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v2, v1, Lk6/f5;->p:Lk6/y5;

    invoke-static {v2}, Lk6/f5;->b(Lk6/p2;)V

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    move-wide/from16 v8, p6

    invoke-virtual/range {v2 .. v9}, Lk6/y5;->D(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method

.method public logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcv;J)V
    .locals 10

    move-object v0, p3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    invoke-static {p2}, Lf6/a;->u(Ljava/lang/String;)V

    const-string v3, "app"

    new-instance v1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    :goto_0
    const-string v2, "_o"

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, Lk6/v;

    new-instance v2, Lk6/s;

    invoke-direct {v2, p3}, Lk6/s;-><init>(Landroid/os/Bundle;)V

    move-object v0, v7

    move-object v1, p2

    move-wide v4, p5

    invoke-direct/range {v0 .. v5}, Lk6/v;-><init>(Ljava/lang/String;Lk6/s;Ljava/lang/String;J)V

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v1, v1, Lk6/f5;->j:Lk6/z4;

    invoke-static {v1}, Lk6/f5;->d(Lk6/o5;)V

    new-instance v2, Lk/e;

    const/4 v9, 0x1

    move-object v4, v2

    move-object v5, p0

    move-object v6, p4

    move-object v8, p1

    invoke-direct/range {v4 .. v9}, Lk/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logHealthData(ILjava/lang/String;Lg6/a;Lg6/a;Lg6/a;)V
    .locals 9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    const/4 v0, 0x0

    if-nez p3, :cond_0

    move-object v6, v0

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p3

    move-object v6, p3

    :goto_0
    if-nez p4, :cond_1

    move-object v7, v0

    goto :goto_1

    :cond_1
    invoke-static {p4}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p3

    move-object v7, p3

    :goto_1
    if-nez p5, :cond_2

    :goto_2
    move-object v8, v0

    goto :goto_3

    :cond_2
    invoke-static {p5}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :goto_3
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v1, p3, Lk6/f5;->i:Lk6/d4;

    invoke-static {v1}, Lk6/f5;->d(Lk6/o5;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    move v2, p1

    move-object v5, p2

    invoke-virtual/range {v1 .. v8}, Lk6/d4;->s(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityCreated(Lg6/a;Landroid/os/Bundle;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p3, p3, Lk6/f5;->p:Lk6/y5;

    invoke-static {p3}, Lk6/f5;->b(Lk6/p2;)V

    iget-object p3, p3, Lk6/y5;->c:Lk6/i6;

    if-eqz p3, :cond_0

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p4, p4, Lk6/f5;->p:Lk6/y5;

    invoke-static {p4}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {p4}, Lk6/y5;->N()V

    invoke-static {p1}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p3, p1, p2}, Lk6/i6;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public onActivityDestroyed(Lg6/a;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->p:Lk6/y5;

    invoke-static {p2}, Lk6/f5;->b(Lk6/p2;)V

    iget-object p2, p2, Lk6/y5;->c:Lk6/i6;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p3, p3, Lk6/f5;->p:Lk6/y5;

    invoke-static {p3}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {p3}, Lk6/y5;->N()V

    invoke-static {p1}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p2, p1}, Lk6/i6;->onActivityDestroyed(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityPaused(Lg6/a;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->p:Lk6/y5;

    invoke-static {p2}, Lk6/f5;->b(Lk6/p2;)V

    iget-object p2, p2, Lk6/y5;->c:Lk6/i6;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p3, p3, Lk6/f5;->p:Lk6/y5;

    invoke-static {p3}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {p3}, Lk6/y5;->N()V

    invoke-static {p1}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p2, p1}, Lk6/i6;->onActivityPaused(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityResumed(Lg6/a;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->p:Lk6/y5;

    invoke-static {p2}, Lk6/f5;->b(Lk6/p2;)V

    iget-object p2, p2, Lk6/y5;->c:Lk6/i6;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p3, p3, Lk6/f5;->p:Lk6/y5;

    invoke-static {p3}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {p3}, Lk6/y5;->N()V

    invoke-static {p1}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p2, p1}, Lk6/i6;->onActivityResumed(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Lg6/a;Lcom/google/android/gms/internal/measurement/zzcv;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p3, p3, Lk6/f5;->p:Lk6/y5;

    invoke-static {p3}, Lk6/f5;->b(Lk6/p2;)V

    iget-object p3, p3, Lk6/y5;->c:Lk6/i6;

    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v0}, Lk6/y5;->N()V

    invoke-static {p1}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p3, p1, p4}, Lk6/i6;->onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    :try_start_0
    invoke-interface {p2, p4}, Lcom/google/android/gms/internal/measurement/zzcv;->zza(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->i:Lk6/d4;

    invoke-static {p2}, Lk6/f5;->d(Lk6/o5;)V

    const-string p3, "Error returning bundle value to wrapper"

    iget-object p2, p2, Lk6/d4;->i:Lk6/f4;

    invoke-virtual {p2, p3, p1}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityStarted(Lg6/a;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->p:Lk6/y5;

    invoke-static {p2}, Lk6/f5;->b(Lk6/p2;)V

    iget-object p2, p2, Lk6/y5;->c:Lk6/i6;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->p:Lk6/y5;

    invoke-static {p2}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {p2}, Lk6/y5;->N()V

    invoke-static {p1}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    :cond_0
    return-void
.end method

.method public onActivityStopped(Lg6/a;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->p:Lk6/y5;

    invoke-static {p2}, Lk6/f5;->b(Lk6/p2;)V

    iget-object p2, p2, Lk6/y5;->c:Lk6/i6;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->p:Lk6/y5;

    invoke-static {p2}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {p2}, Lk6/y5;->N()V

    invoke-static {p1}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    :cond_0
    return-void
.end method

.method public performAction(Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcv;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/measurement/zzcv;->zza(Landroid/os/Bundle;)V

    return-void
.end method

.method public registerOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lq/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lq/f;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzda;->zza()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lq/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk6/u5;

    if-nez v1, :cond_0

    new-instance v1, Lk6/a;

    invoke-direct {v1, p0, p1}, Lk6/a;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzda;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lq/f;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzda;->zza()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1, v1}, Lq/z;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p1, p1, Lk6/f5;->p:Lk6/y5;

    invoke-static {p1}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {p1}, Lk6/p2;->s()V

    iget-object v0, p1, Lk6/y5;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    const-string v0, "OnEventListener already registered"

    iget-object p1, p1, Lk6/d4;->i:Lk6/f4;

    invoke-virtual {p1, v0}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public resetAnalyticsData(J)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lk6/y5;->z(Ljava/lang/String;)V

    invoke-virtual {v0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v1

    new-instance v2, Lk6/d6;

    const/4 v3, 0x1

    invoke-direct {v2, v0, p1, p2, v3}, Lk6/d6;-><init>(Lk6/y5;JI)V

    invoke-virtual {v1, v2}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setConditionalUserProperty(Landroid/os/Bundle;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p1, p1, Lk6/f5;->i:Lk6/d4;

    invoke-static {p1}, Lk6/f5;->d(Lk6/o5;)V

    const-string p2, "Conditional user property must not be null"

    iget-object p1, p1, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {p1, p2}, Lk6/f4;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v0, p1, p2, p3}, Lk6/y5;->x(Landroid/os/Bundle;J)V

    return-void
.end method

.method public setConsent(Landroid/os/Bundle;J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v1

    new-instance v2, Lk6/c6;

    invoke-direct {v2, v0, p1, p2, p3}, Lk6/c6;-><init>(Lk6/y5;Landroid/os/Bundle;J)V

    invoke-virtual {v1, v2}, Lk6/z4;->v(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setConsentThirdParty(Landroid/os/Bundle;J)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    const/16 v1, -0x14

    invoke-virtual {v0, p1, v1, p2, p3}, Lk6/y5;->w(Landroid/os/Bundle;IJ)V

    return-void
.end method

.method public setCurrentScreen(Lg6/a;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p4, p4, Lk6/f5;->o:Lk6/p6;

    invoke-static {p4}, Lk6/f5;->b(Lk6/p2;)V

    invoke-static {p1}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p4}, Lf4/y;->h()Lk6/f;

    move-result-object p5

    invoke-virtual {p5}, Lk6/f;->z()Z

    move-result p5

    if-nez p5, :cond_0

    invoke-virtual {p4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    iget-object p1, p1, Lk6/d4;->k:Lk6/f4;

    const-string p2, "setCurrentScreen cannot be called while screen reporting is disabled."

    invoke-virtual {p1, p2}, Lk6/f4;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_0
    iget-object p5, p4, Lk6/p6;->c:Lk6/q6;

    if-nez p5, :cond_1

    invoke-virtual {p4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    iget-object p1, p1, Lk6/d4;->k:Lk6/f4;

    const-string p2, "setCurrentScreen cannot be called while no activity active"

    invoke-virtual {p1, p2}, Lk6/f4;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1
    iget-object v0, p4, Lk6/p6;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    iget-object p1, p1, Lk6/d4;->k:Lk6/f4;

    const-string p2, "setCurrentScreen must be called with an activity in the activity lifecycle"

    invoke-virtual {p1, p2}, Lk6/f4;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_2
    if-nez p3, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p4, p3}, Lk6/p6;->v(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p3

    :cond_3
    iget-object v0, p5, Lk6/q6;->b:Ljava/lang/String;

    invoke-static {v0, p3}, Lf6/a;->q0(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v0

    iget-object p5, p5, Lk6/q6;->a:Ljava/lang/String;

    invoke-static {p5, p2}, Lf6/a;->q0(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result p5

    if-eqz v0, :cond_4

    if-eqz p5, :cond_4

    invoke-virtual {p4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    iget-object p1, p1, Lk6/d4;->k:Lk6/f4;

    const-string p2, "setCurrentScreen cannot be called with the same class and name"

    invoke-virtual {p1, p2}, Lk6/f4;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_4
    const/4 p5, 0x0

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p4}, Lf4/y;->h()Lk6/f;

    move-result-object v1

    invoke-virtual {v1, p5}, Lk6/f;->p(Ljava/lang/String;)I

    move-result v1

    if-le v0, v1, :cond_6

    :cond_5
    invoke-virtual {p4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    iget-object p1, p1, Lk6/d4;->k:Lk6/f4;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "Invalid screen name length in setCurrentScreen. Length"

    invoke-virtual {p1, p3, p2}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    if-eqz p3, :cond_8

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_7

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p4}, Lf4/y;->h()Lk6/f;

    move-result-object v1

    invoke-virtual {v1, p5}, Lk6/f;->p(Ljava/lang/String;)I

    move-result p5

    if-le v0, p5, :cond_8

    :cond_7
    invoke-virtual {p4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    iget-object p1, p1, Lk6/d4;->k:Lk6/f4;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "Invalid class name length in setCurrentScreen. Length"

    invoke-virtual {p1, p3, p2}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_8
    invoke-virtual {p4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p5

    iget-object p5, p5, Lk6/d4;->n:Lk6/f4;

    if-nez p2, :cond_9

    const-string v0, "null"

    goto :goto_0

    :cond_9
    move-object v0, p2

    :goto_0
    const-string v1, "Setting current screen to name, class"

    invoke-virtual {p5, v1, v0, p3}, Lk6/f4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p5, Lk6/q6;

    invoke-virtual {p4}, Lf4/y;->k()Lk6/u7;

    move-result-object v0

    invoke-virtual {v0}, Lk6/u7;->t0()J

    move-result-wide v0

    invoke-direct {p5, p2, p3, v0, v1}, Lk6/q6;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object p2, p4, Lk6/p6;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1, p5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-virtual {p4, p1, p5, p2}, Lk6/p6;->y(Landroid/app/Activity;Lk6/q6;Z)V

    :goto_1
    return-void
.end method

.method public setDataCollectionEnabled(Z)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v0}, Lk6/p2;->s()V

    invoke-virtual {v0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v1

    new-instance v2, Lk6/m4;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0, p1}, Lk6/m4;-><init>(ILjava/lang/Object;Z)V

    invoke-virtual {v1, v2}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setDefaultEventParameters(Landroid/os/Bundle;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p1, v1

    :goto_0
    invoke-virtual {v0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v1

    new-instance v2, Lk6/b6;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v3}, Lk6/b6;-><init>(Lk6/y5;Landroid/os/Bundle;I)V

    invoke-virtual {v1, v2}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setEventInterceptor(Lcom/google/android/gms/internal/measurement/zzda;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    new-instance v0, Ll/t;

    const/16 v1, 0x19

    invoke-direct {v0, p0, p1, v1}, Ll/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p1, p1, Lk6/f5;->j:Lk6/z4;

    invoke-static {p1}, Lk6/f5;->d(Lk6/o5;)V

    invoke-virtual {p1}, Lk6/z4;->w()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p1, p1, Lk6/f5;->p:Lk6/y5;

    invoke-static {p1}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {p1}, Lk6/q3;->l()V

    invoke-virtual {p1}, Lk6/p2;->s()V

    iget-object v1, p1, Lk6/y5;->d:Lk6/v5;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "EventInterceptor already set."

    invoke-static {v2, v1}, Lf6/a;->z(Ljava/lang/String;Z)V

    :cond_1
    iput-object v0, p1, Lk6/y5;->d:Lk6/v5;

    return-void

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p1, p1, Lk6/f5;->j:Lk6/z4;

    invoke-static {p1}, Lk6/f5;->d(Lk6/o5;)V

    new-instance v1, Ll/h;

    const/16 v2, 0xe

    invoke-direct {v1, v2, p0, v0}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setInstanceIdProvider(Lcom/google/android/gms/internal/measurement/zzdb;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    return-void
.end method

.method public setMeasurementEnabled(ZJ)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p2, p2, Lk6/f5;->p:Lk6/y5;

    invoke-static {p2}, Lk6/f5;->b(Lk6/p2;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2}, Lk6/p2;->s()V

    invoke-virtual {p2}, Lf4/y;->zzl()Lk6/z4;

    move-result-object p3

    new-instance v0, Ll/h;

    const/16 v1, 0x9

    invoke-direct {v0, v1, p2, p1}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, v0}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setMinimumSessionDuration(J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    return-void
.end method

.method public setSessionTimeoutDuration(J)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v1

    new-instance v2, Lk6/d6;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, p2, v3}, Lk6/d6;-><init>(Lk6/y5;JI)V

    invoke-virtual {v1, v2}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setUserId(Ljava/lang/String;J)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v1, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v1}, Lk6/f5;->b(Lk6/p2;)V

    if-eqz p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, v1, Lf4/y;->a:Ljava/lang/Object;

    check-cast p1, Lk6/f5;

    iget-object p1, p1, Lk6/f5;->i:Lk6/d4;

    invoke-static {p1}, Lk6/f5;->d(Lk6/o5;)V

    const-string p2, "User ID must be non-empty or null"

    iget-object p1, p1, Lk6/d4;->i:Lk6/f4;

    invoke-virtual {p1, p2}, Lk6/f4;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v0

    new-instance v2, Ll/h;

    const/4 v3, 0x7

    invoke-direct {v2, v1, p1, v3}, Ll/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    const/4 v2, 0x0

    const-string v3, "_id"

    const/4 v5, 0x1

    move-object v4, p1

    move-wide v6, p2

    invoke-virtual/range {v1 .. v7}, Lk6/y5;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public setUserProperty(Ljava/lang/String;Ljava/lang/String;Lg6/a;ZJ)V
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    invoke-static {p3}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object v3

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, p3, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Lk6/y5;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public unregisterOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lq/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lq/f;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzda;->zza()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lq/f;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk6/u5;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    new-instance v1, Lk6/a;

    invoke-direct {v1, p0, p1}, Lk6/a;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzda;)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object p1, p1, Lk6/f5;->p:Lk6/y5;

    invoke-static {p1}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {p1}, Lk6/p2;->s()V

    iget-object v0, p1, Lk6/y5;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    const-string v0, "OnEventListener had not been registered"

    iget-object p1, p1, Lk6/d4;->i:Lk6/f4;

    invoke-virtual {p1, v0}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
