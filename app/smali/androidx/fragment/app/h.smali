.class public final Landroidx/fragment/app/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/n;Landroidx/fragment/app/s1;Landroidx/fragment/app/s1;ZLq/f;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/h;->a:I

    iput-object p1, p0, Landroidx/fragment/app/h;->f:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/h;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/h;->d:Ljava/lang/Object;

    iput-boolean p4, p0, Landroidx/fragment/app/h;->b:Z

    iput-object p5, p0, Landroidx/fragment/app/h;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Landroidx/fragment/app/h;->a:I

    iput-object p1, p0, Landroidx/fragment/app/h;->f:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/h;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/h;->d:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/fragment/app/h;->e:Ljava/lang/Object;

    iput-boolean p5, p0, Landroidx/fragment/app/h;->b:Z

    return-void
.end method

.method public constructor <init>(Lk6/i6;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Landroidx/fragment/app/h;->a:I

    iput-object p1, p0, Landroidx/fragment/app/h;->f:Ljava/lang/Object;

    iput-boolean p2, p0, Landroidx/fragment/app/h;->b:Z

    iput-object p3, p0, Landroidx/fragment/app/h;->c:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/fragment/app/h;->d:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/fragment/app/h;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ly5/b;Landroid/content/Intent;Landroid/content/Context;ZLandroid/content/BroadcastReceiver$PendingResult;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/h;->a:I

    iput-object p1, p0, Landroidx/fragment/app/h;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/h;->d:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/h;->e:Ljava/lang/Object;

    iput-boolean p4, p0, Landroidx/fragment/app/h;->b:Z

    iput-object p5, p0, Landroidx/fragment/app/h;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    move-object/from16 v1, p0

    iget v0, v1, Landroidx/fragment/app/h;->a:I

    iget-boolean v2, v1, Landroidx/fragment/app/h;->b:Z

    iget-object v4, v1, Landroidx/fragment/app/h;->f:Ljava/lang/Object;

    iget-object v5, v1, Landroidx/fragment/app/h;->e:Ljava/lang/Object;

    iget-object v6, v1, Landroidx/fragment/app/h;->d:Ljava/lang/Object;

    iget-object v7, v1, Landroidx/fragment/app/h;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Lk6/i6;

    check-cast v7, Landroid/net/Uri;

    check-cast v6, Ljava/lang/String;

    check-cast v5, Ljava/lang/String;

    const-string v0, "https://google.com/search?"

    iget-object v4, v4, Lk6/i6;->a:Lk6/y5;

    invoke-virtual {v4}, Lk6/q3;->l()V

    :try_start_0
    invoke-virtual {v4}, Lf4/y;->k()Lk6/u7;

    move-result-object v8

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpy;->zza()Z

    move-result v9

    const/4 v11, 0x0

    if-eqz v9, :cond_0

    invoke-virtual {v4}, Lf4/y;->h()Lk6/f;

    move-result-object v9

    sget-object v12, Lk6/x;->w0:Lk6/x3;

    invoke-virtual {v9, v11, v12}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :cond_0
    const/4 v9, 0x0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoi;->zza()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-virtual {v4}, Lf4/y;->h()Lk6/f;

    move-result-object v12

    sget-object v13, Lk6/x;->P0:Lk6/x3;

    invoke-virtual {v12, v11, v13}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x1

    goto :goto_1

    :cond_1
    const/4 v12, 0x0

    :goto_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v14, "_cis"

    const-string v15, "Activity created with data \'referrer\' without required params"

    const-string v3, "utm_medium"

    const-string v10, "utm_source"

    const-string v11, "utm_campaign"

    const-string v1, "gclid"

    if-eqz v13, :cond_2

    :goto_2
    const/4 v0, 0x0

    goto :goto_3

    :cond_2
    :try_start_1
    invoke-virtual {v5, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    if-eqz v12, :cond_3

    const-string v13, "gbraid"

    invoke-virtual {v5, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    :cond_3
    invoke-virtual {v5, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    invoke-virtual {v5, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    invoke-virtual {v5, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    const-string v13, "utm_id"

    invoke-virtual {v5, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    const-string v13, "dclid"

    invoke-virtual {v5, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    const-string v13, "srsltid"

    invoke-virtual {v5, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    if-eqz v9, :cond_4

    const-string v13, "sfmc_id"

    invoke-virtual {v5, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    :cond_4
    invoke-virtual {v8}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    iget-object v0, v0, Lk6/d4;->m:Lk6/f4;

    invoke-virtual {v0, v15}, Lk6/f4;->b(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v8, v0, v9, v12}, Lk6/u7;->u(Landroid/net/Uri;ZZ)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v8, "referrer"

    invoke-virtual {v0, v14, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_6
    :goto_3
    iget-object v8, v4, Lk6/y5;->n:Lk6/g5;

    const-string v9, "_cmp"

    if-eqz v2, :cond_c

    :try_start_2
    invoke-virtual {v4}, Lf4/y;->k()Lk6/u7;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpy;->zza()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-virtual {v4}, Lf4/y;->h()Lk6/f;

    move-result-object v12

    sget-object v13, Lk6/x;->w0:Lk6/x3;

    move-object/from16 v16, v15

    const/4 v15, 0x0

    invoke-virtual {v12, v15, v13}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/4 v12, 0x1

    goto :goto_4

    :cond_7
    move-object/from16 v16, v15

    :cond_8
    const/4 v12, 0x0

    :goto_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoi;->zza()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-virtual {v4}, Lf4/y;->h()Lk6/f;

    move-result-object v13

    sget-object v15, Lk6/x;->P0:Lk6/x3;

    move-object/from16 v17, v3

    const/4 v3, 0x0

    invoke-virtual {v13, v3, v15}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/4 v3, 0x1

    goto :goto_5

    :cond_9
    move-object/from16 v17, v3

    :cond_a
    const/4 v3, 0x0

    :goto_5
    invoke-virtual {v2, v7, v12, v3}, Lk6/u7;->u(Landroid/net/Uri;ZZ)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_d

    const-string v3, "intent"

    invoke-virtual {v2, v14, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_b

    if-eqz v0, :cond_b

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_b

    const-string v3, "_cer"

    const-string v7, "gclid=%s"

    const/4 v12, 0x1

    new-array v13, v12, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x0

    aput-object v12, v13, v14

    invoke-static {v7, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v3, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    invoke-virtual {v4, v6, v9, v2}, Lk6/y5;->S(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v8, v6, v2}, Lk6/g5;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_6

    :cond_c
    move-object/from16 v17, v3

    move-object/from16 v16, v15

    :cond_d
    :goto_6
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_e

    goto/16 :goto_a

    :cond_e
    invoke-virtual {v4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v2

    iget-object v2, v2, Lk6/d4;->m:Lk6/f4;

    const-string v3, "Activity created with referrer"

    invoke-virtual {v2, v3, v5}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lf4/y;->h()Lk6/f;

    move-result-object v2

    sget-object v3, Lk6/x;->h0:Lk6/x3;

    const/4 v7, 0x0

    invoke-virtual {v2, v7, v3}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v2
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    const-string v3, "_ldl"

    const-string v7, "auto"

    if-eqz v2, :cond_10

    if-eqz v0, :cond_f

    :try_start_3
    invoke-virtual {v4, v6, v9, v0}, Lk6/y5;->S(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v8, v6, v0}, Lk6/g5;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    :goto_7
    const/4 v0, 0x1

    const/4 v1, 0x0

    goto :goto_8

    :cond_f
    invoke-virtual {v4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    iget-object v0, v0, Lk6/d4;->m:Lk6/f4;

    const-string v1, "Referrer does not contain valid parameters"

    invoke-virtual {v0, v1, v5}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_7

    :goto_8
    invoke-virtual {v4, v7, v3, v1, v0}, Lk6/y5;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_a

    :cond_10
    invoke-virtual {v5, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {v5, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_11

    invoke-virtual {v5, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_11

    move-object/from16 v0, v17

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_11

    const-string v0, "utm_term"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_11

    const-string v0, "utm_content"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_12

    :cond_11
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_13

    const/4 v0, 0x1

    invoke-virtual {v4, v7, v3, v5, v0}, Lk6/y5;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_a

    :cond_12
    invoke-virtual {v4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    iget-object v0, v0, Lk6/d4;->m:Lk6/f4;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lk6/f4;->b(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_a

    :goto_9
    invoke-virtual {v4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v1

    const-string v2, "Throwable caught in handleReferrerForOnActivityCreated"

    iget-object v1, v1, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v1, v2, v0}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_13
    :goto_a
    return-void

    :pswitch_0
    check-cast v4, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v4, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    invoke-virtual {v0}, Lk6/f5;->m()Lk6/s6;

    move-result-object v0

    move-object v14, v7

    check-cast v14, Lcom/google/android/gms/internal/measurement/zzcv;

    move-object v10, v6

    check-cast v10, Ljava/lang/String;

    move-object v11, v5

    check-cast v11, Ljava/lang/String;

    move-object/from16 v1, p0

    iget-boolean v13, v1, Landroidx/fragment/app/h;->b:Z

    invoke-virtual {v0}, Lk6/q3;->l()V

    invoke-virtual {v0}, Lk6/p2;->s()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lk6/s6;->H(Z)Lk6/x7;

    move-result-object v12

    new-instance v2, Lk6/g6;

    move-object v8, v2

    move-object v9, v0

    invoke-direct/range {v8 .. v14}, Lk6/g6;-><init>(Lk6/s6;Ljava/lang/String;Ljava/lang/String;Lk6/x7;ZLcom/google/android/gms/internal/measurement/zzcv;)V

    invoke-virtual {v0, v2}, Lk6/s6;->v(Ljava/lang/Runnable;)V

    return-void

    :pswitch_1
    check-cast v7, Ly5/b;

    check-cast v6, Landroid/content/Intent;

    check-cast v5, Landroid/content/Context;

    check-cast v4, Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v7, v6, v5, v2, v4}, Ly5/b;->zza(Landroid/content/Intent;Landroid/content/Context;ZLandroid/content/BroadcastReceiver$PendingResult;)V

    return-void

    :pswitch_2
    check-cast v7, Landroidx/fragment/app/s1;

    iget-object v0, v7, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    check-cast v6, Landroidx/fragment/app/s1;

    iget-object v3, v6, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    sget-object v4, Landroidx/fragment/app/h1;->a:Landroidx/fragment/app/m1;

    if-eqz v2, :cond_14

    invoke-virtual {v3}, Landroidx/fragment/app/d0;->getEnterTransitionCallback()Lq2/r0;

    goto :goto_b

    :cond_14
    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getEnterTransitionCallback()Lq2/r0;

    :goto_b
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
