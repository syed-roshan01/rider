.class public final Li6/b;
.super Li6/a;


# instance fields
.field public final a:Lk6/f5;

.field public final b:Lk6/y5;


# direct methods
.method public constructor <init>(Lk6/f5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    iput-object p1, p0, Li6/b;->a:Lk6/f5;

    iget-object p1, p1, Lk6/f5;->p:Lk6/y5;

    invoke-static {p1}, Lk6/f5;->b(Lk6/p2;)V

    iput-object p1, p0, Li6/b;->b:Lk6/y5;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p1}, Lf6/a;->u(Ljava/lang/String;)V

    const/16 p1, 0x19

    return p1
.end method

.method public final zza()J
    .locals 2

    iget-object v0, p0, Li6/b;->a:Lk6/f5;

    .line 24
    iget-object v0, v0, Lk6/f5;->l:Lk6/u7;

    .line 25
    invoke-static {v0}, Lk6/f5;->c(Lk6/o5;)V

    .line 26
    invoke-virtual {v0}, Lk6/u7;->t0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 9

    iget-object v0, p0, Li6/b;->b:Lk6/y5;

    .line 2
    invoke-virtual {v0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lk6/z4;->w()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    const-string p2, "Cannot get conditional user properties from analytics worker thread"

    .line 5
    iget-object p1, p1, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {p1, p2}, Lk6/f4;->b(Ljava/lang/String;)V

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lk6/h;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    const-string p2, "Cannot get conditional user properties from main thread"

    iget-object p1, p1, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {p1, p2}, Lk6/f4;->b(Ljava/lang/String;)V

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_0

    .line 10
    :cond_1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 11
    iget-object v2, v0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v2, Lk6/f5;

    .line 12
    iget-object v3, v2, Lk6/f5;->j:Lk6/z4;

    .line 13
    invoke-static {v3}, Lk6/f5;->d(Lk6/o5;)V

    const-wide/16 v5, 0x1388

    const-string v7, "get conditional user properties"

    .line 14
    new-instance v8, Lb3/a1;

    invoke-direct {v8, v0, v1, p1, p2}, Lb3/a1;-><init>(Lk6/y5;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v1

    .line 15
    invoke-virtual/range {v3 .. v8}, Lk6/z4;->p(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 16
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_2

    .line 17
    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object p1

    .line 18
    iget-object p1, p1, Lk6/d4;->f:Lk6/f4;

    const-string p2, "Timed out waiting for get conditional user properties"

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    .line 20
    :cond_2
    invoke-static {p1}, Lk6/u7;->e0(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 15

    move-object v0, p0

    iget-object v7, v0, Li6/b;->b:Lk6/y5;

    .line 27
    invoke-virtual {v7}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v1

    .line 28
    invoke-virtual {v1}, Lk6/z4;->w()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 29
    invoke-virtual {v7}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v1

    const-string v2, "Cannot get user properties from analytics worker thread"

    iget-object v1, v1, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v1, v2}, Lk6/f4;->b(Ljava/lang/String;)V

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    goto/16 :goto_1

    .line 31
    :cond_0
    invoke-static {}, Lk6/h;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 32
    invoke-virtual {v7}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v1

    const-string v2, "Cannot get user properties from main thread"

    iget-object v1, v1, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v1, v2}, Lk6/f4;->b(Ljava/lang/String;)V

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    .line 34
    :cond_1
    new-instance v14, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v14}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 35
    iget-object v1, v7, Lf4/y;->a:Ljava/lang/Object;

    check-cast v1, Lk6/f5;

    .line 36
    iget-object v8, v1, Lk6/f5;->j:Lk6/z4;

    .line 37
    invoke-static {v8}, Lk6/f5;->d(Lk6/o5;)V

    const-wide/16 v10, 0x1388

    const-string v12, "get user properties"

    .line 38
    new-instance v13, Lk6/g6;

    move-object v1, v13

    move-object v2, v7

    move-object v3, v14

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move/from16 v6, p3

    invoke-direct/range {v1 .. v6}, Lk6/g6;-><init>(Lk6/y5;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v9, v14

    .line 39
    invoke-virtual/range {v8 .. v13}, Lk6/z4;->p(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 40
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_2

    .line 41
    invoke-virtual {v7}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v1

    .line 42
    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 43
    iget-object v1, v1, Lk6/d4;->f:Lk6/f4;

    const-string v3, "Timed out waiting for handle get user properties, includeInternal"

    invoke-virtual {v1, v3, v2}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    .line 45
    :cond_2
    new-instance v2, Lq/f;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    .line 46
    invoke-direct {v2, v3}, Lq/z;-><init>(I)V

    .line 47
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk6/t7;

    .line 48
    invoke-virtual {v3}, Lk6/t7;->e()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 49
    iget-object v3, v3, Lk6/t7;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lq/z;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    move-object v1, v2

    :goto_1
    return-object v1
.end method

.method public final zza(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Li6/b;->b:Lk6/y5;

    .line 50
    invoke-virtual {v0}, Lf4/y;->zzb()Le6/b;

    move-result-object v1

    check-cast v1, Le6/c;

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 53
    invoke-virtual {v0, p1, v1, v2}, Lk6/y5;->x(Landroid/os/Bundle;J)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Li6/b;->a:Lk6/f5;

    .line 21
    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    .line 22
    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    .line 23
    invoke-virtual {v0, p1, p2, p3}, Lk6/y5;->B(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Li6/b;->a:Lk6/f5;

    .line 1
    invoke-virtual {v0}, Lk6/f5;->i()Lk6/q;

    move-result-object v1

    .line 2
    iget-object v0, v0, Lk6/f5;->n:Le6/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 4
    invoke-virtual {v1, p1, v2, v3}, Lk6/q;->u(Ljava/lang/String;J)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 8

    const/4 v4, 0x1

    const/4 v5, 0x1

    iget-object v0, p0, Li6/b;->b:Lk6/y5;

    .line 5
    invoke-virtual {v0}, Lf4/y;->zzb()Le6/b;

    move-result-object v1

    check-cast v1, Le6/c;

    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 8
    invoke-virtual/range {v0 .. v7}, Lk6/y5;->D(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method

.method public final zzc(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Li6/b;->a:Lk6/f5;

    invoke-virtual {v0}, Lk6/f5;->i()Lk6/q;

    move-result-object v1

    iget-object v0, v0, Lk6/f5;->n:Le6/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Lk6/q;->x(Ljava/lang/String;J)V

    return-void
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li6/b;->b:Lk6/y5;

    iget-object v0, v0, Lk6/y5;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final zzg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li6/b;->b:Lk6/y5;

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
    return-object v0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li6/b;->b:Lk6/y5;

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
    return-object v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li6/b;->b:Lk6/y5;

    iget-object v0, v0, Lk6/y5;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
