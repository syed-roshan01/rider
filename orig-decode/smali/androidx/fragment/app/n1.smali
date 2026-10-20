.class public final Landroidx/fragment/app/n1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p7, p0, Landroidx/fragment/app/n1;->a:I

    iput-object p1, p0, Landroidx/fragment/app/n1;->n:Ljava/lang/Object;

    iput p2, p0, Landroidx/fragment/app/n1;->b:I

    iput-object p3, p0, Landroidx/fragment/app/n1;->c:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/fragment/app/n1;->d:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/fragment/app/n1;->e:Ljava/lang/Object;

    iput-object p6, p0, Landroidx/fragment/app/n1;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lk6/i4;ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 9

    const/4 v0, 0x2

    iput v0, p0, Landroidx/fragment/app/n1;->a:I

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 2
    invoke-direct/range {v1 .. v8}, Landroidx/fragment/app/n1;-><init>(Ljava/lang/String;Lk6/i4;ILjava/io/IOException;[BLjava/util/Map;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lk6/i4;ILjava/io/IOException;[BLjava/util/Map;I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p7, 0x2

    iput p7, p0, Landroidx/fragment/app/n1;->a:I

    .line 4
    invoke-static {p2}, Lf6/a;->x(Ljava/lang/Object;)V

    iput-object p2, p0, Landroidx/fragment/app/n1;->c:Ljava/lang/Object;

    iput p3, p0, Landroidx/fragment/app/n1;->b:I

    iput-object p4, p0, Landroidx/fragment/app/n1;->d:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/fragment/app/n1;->e:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/fragment/app/n1;->f:Ljava/lang/Object;

    iput-object p6, p0, Landroidx/fragment/app/n1;->n:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    iget v0, p0, Landroidx/fragment/app/n1;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/fragment/app/n1;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lk6/i4;

    iget-object v0, p0, Landroidx/fragment/app/n1;->f:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget v3, p0, Landroidx/fragment/app/n1;->b:I

    iget-object v0, p0, Landroidx/fragment/app/n1;->d:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Throwable;

    iget-object v0, p0, Landroidx/fragment/app/n1;->e:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, [B

    iget-object v0, p0, Landroidx/fragment/app/n1;->n:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/util/Map;

    invoke-interface/range {v1 .. v6}, Lk6/i4;->a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/n1;->n:Ljava/lang/Object;

    check-cast v0, Lk6/d4;

    iget-object v0, v0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v0, v0, Lk6/f5;->h:Lk6/l4;

    invoke-static {v0}, Lk6/f5;->c(Lk6/o5;)V

    iget-boolean v2, v0, Lk6/o5;->b:Z

    if-nez v2, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/n1;->n:Ljava/lang/Object;

    check-cast v0, Lk6/d4;

    const-string v1, "Persisted config not initialized. Not logging error/warn"

    invoke-virtual {v0}, Lk6/d4;->A()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x6

    invoke-static {v2, v0, v1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_4

    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/n1;->n:Ljava/lang/Object;

    check-cast v2, Lk6/d4;

    iget-char v3, v2, Lk6/d4;->c:C

    const/4 v4, 0x1

    if-nez v3, :cond_6

    invoke-virtual {v2}, Lf4/y;->h()Lk6/f;

    move-result-object v2

    iget-object v3, v2, Lk6/f;->d:Ljava/lang/Boolean;

    if-nez v3, :cond_4

    monitor-enter v2

    :try_start_0
    iget-object v3, v2, Lk6/f;->d:Ljava/lang/Boolean;

    if-nez v3, :cond_3

    invoke-virtual {v2}, Lf4/y;->zza()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    invoke-static {}, Le6/d;->b()Ljava/lang/String;

    move-result-object v5

    if-eqz v3, :cond_2

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v2, Lk6/f;->d:Ljava/lang/Boolean;

    :cond_2
    iget-object v3, v2, Lk6/f;->d:Ljava/lang/Boolean;

    if-nez v3, :cond_3

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v3, v2, Lk6/f;->d:Ljava/lang/Boolean;

    invoke-virtual {v2}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v3

    iget-object v3, v3, Lk6/d4;->f:Lk6/f4;

    const-string v5, "My process not in the list of running processes"

    invoke-virtual {v3, v5}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_3
    monitor-exit v2

    goto :goto_2

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_4
    :goto_2
    iget-object v2, v2, Lk6/f;->d:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Landroidx/fragment/app/n1;->n:Ljava/lang/Object;

    check-cast v2, Lk6/d4;

    const/16 v3, 0x43

    iput-char v3, v2, Lk6/d4;->c:C

    goto :goto_3

    :cond_5
    iget-object v2, p0, Landroidx/fragment/app/n1;->n:Ljava/lang/Object;

    check-cast v2, Lk6/d4;

    const/16 v3, 0x63

    iput-char v3, v2, Lk6/d4;->c:C

    :cond_6
    :goto_3
    iget-object v2, p0, Landroidx/fragment/app/n1;->n:Ljava/lang/Object;

    check-cast v2, Lk6/d4;

    iget-wide v5, v2, Lk6/d4;->d:J

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-gez v3, :cond_7

    const-wide/32 v5, 0x14051

    iput-wide v5, v2, Lk6/d4;->d:J

    :cond_7
    const-string v2, "01VDIWEA?"

    iget v3, p0, Landroidx/fragment/app/n1;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    iget-object v3, p0, Landroidx/fragment/app/n1;->n:Ljava/lang/Object;

    check-cast v3, Lk6/d4;

    iget-char v5, v3, Lk6/d4;->c:C

    iget-wide v9, v3, Lk6/d4;->d:J

    iget-object v3, p0, Landroidx/fragment/app/n1;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v6, p0, Landroidx/fragment/app/n1;->d:Ljava/lang/Object;

    iget-object v11, p0, Landroidx/fragment/app/n1;->e:Ljava/lang/Object;

    iget-object v12, p0, Landroidx/fragment/app/n1;->f:Ljava/lang/Object;

    invoke-static {v4, v3, v6, v11, v12}, Lk6/d4;->q(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "2"

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-static {v6, v2, v3}, La7/a;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v5, 0x400

    if-le v3, v5, :cond_8

    iget-object v2, p0, Landroidx/fragment/app/n1;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_8
    iget-object v0, v0, Lk6/l4;->d:Lk6/o4;

    if-eqz v0, :cond_e

    iget-object v3, v0, Lk6/o4;->e:Lk6/l4;

    invoke-virtual {v3}, Lf4/y;->l()V

    iget-object v5, v0, Lk6/o4;->e:Lk6/l4;

    invoke-virtual {v5}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v5

    iget-object v6, v0, Lk6/o4;->a:Ljava/lang/String;

    invoke-interface {v5, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    cmp-long v5, v5, v7

    if-nez v5, :cond_9

    invoke-virtual {v0}, Lk6/o4;->a()V

    :cond_9
    if-nez v2, :cond_a

    const-string v2, ""

    :cond_a
    invoke-virtual {v3}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v5

    iget-object v6, v0, Lk6/o4;->b:Ljava/lang/String;

    invoke-interface {v5, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v9

    cmp-long v5, v9, v7

    iget-object v0, v0, Lk6/o4;->c:Ljava/lang/String;

    const-wide/16 v7, 0x1

    if-gtz v5, :cond_b

    invoke-virtual {v3}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1, v6, v7, v8}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_4

    :cond_b
    invoke-virtual {v3}, Lf4/y;->k()Lk6/u7;

    move-result-object v5

    invoke-virtual {v5}, Lk6/u7;->x0()Ljava/security/SecureRandom;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Random;->nextLong()J

    move-result-wide v11

    const-wide v13, 0x7fffffffffffffffL

    and-long/2addr v11, v13

    add-long/2addr v9, v7

    div-long/2addr v13, v9

    cmp-long v5, v11, v13

    if-gez v5, :cond_c

    move v1, v4

    :cond_c
    invoke-virtual {v3}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    if-eqz v1, :cond_d

    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_d
    invoke-interface {v3, v6, v9, v10}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_e
    :goto_4
    return-void

    :goto_5
    :pswitch_1
    iget v0, p0, Landroidx/fragment/app/n1;->b:I

    if-ge v1, v0, :cond_f

    iget-object v0, p0, Landroidx/fragment/app/n1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v2, p0, Landroidx/fragment/app/n1;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v0, v2}, Lb3/h0;->v(Landroid/view/View;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/n1;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v2, p0, Landroidx/fragment/app/n1;->f:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v2}, Lb3/h0;->v(Landroid/view/View;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_f
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
