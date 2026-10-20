.class public final Lh1/b;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lh1/b;->a:I

    iput-object p1, p0, Lh1/b;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget v0, p0, Lh1/b;->a:I

    iget-object v1, p0, Lh1/b;->b:Ljava/lang/Object;

    sparse-switch v0, :sswitch_data_0

    check-cast v1, Lcom/google/android/gms/tasks/CancellationTokenSource;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/CancellationTokenSource;->cancel()V

    return-void

    :sswitch_0
    check-cast v1, Lu9/i;

    invoke-virtual {v1}, Lu9/i;->b()V

    return-void

    :sswitch_1
    check-cast v1, Lm9/k;

    sget-object p1, Lq8/l;->a:Lq8/l;

    invoke-interface {v1, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :sswitch_2
    check-cast v1, Lo1/h0;

    iget-object v0, v1, Lo1/h0;->c:Lm9/k;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lm9/k;->l(Ljava/lang/Throwable;)Z

    :cond_0
    const/4 p1, 0x0

    iput-object p1, v1, Lo1/h0;->c:Lm9/k;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x11 -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lh1/b;->a:I

    const-string v2, "it"

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p0, Lh1/b;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lh1/b;->a(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lh1/b;->a(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lh1/b;->a(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_3
    check-cast p1, Li9/g;

    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5, p1}, Ll9/i;->i1(Ljava/lang/CharSequence;Li9/g;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lr8/e;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "(this Map)"

    if-ne v1, v5, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast v5, Lr8/a;

    if-ne p1, v5, :cond_2

    const-string p1, "(this Collection)"

    goto :goto_2

    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast v5, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, v5, Lcom/auto/accept/ui/viewmodel/MainViewModel;->b:Lz4/d;

    iget-object v1, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "ride_alert_enabled"

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-object v0

    :pswitch_7
    check-cast p1, Ljava/io/IOException;

    check-cast v5, Ll4/j;

    iput-boolean v4, v5, Ll4/j;->r:Z

    return-object v0

    :pswitch_8
    check-cast p1, Lf2/t;

    check-cast v5, Lf2/f;

    const/4 v7, 0x0

    iget-object v8, p1, Lf2/t;->b:Lf2/l;

    iget v9, p1, Lf2/t;->c:I

    iget v10, p1, Lf2/t;->d:I

    iget-object v11, p1, Lf2/t;->e:Ljava/lang/Object;

    new-instance p1, Lf2/t;

    move-object v6, p1

    invoke-direct/range {v6 .. v11}, Lf2/t;-><init>(Lf2/e;Lf2/l;IILjava/lang/Object;)V

    invoke-virtual {v5, p1}, Lf2/f;->a(Lf2/t;)Lf2/w;

    move-result-object p1

    check-cast p1, Lf2/v;

    iget-object p1, p1, Lf2/v;->a:Ljava/lang/Object;

    return-object p1

    :pswitch_9
    check-cast p1, Ly1/v;

    check-cast v5, Ly1/g;

    iget v1, v5, Ly1/g;->a:I

    invoke-static {p1, v1}, Ly1/t;->d(Ly1/v;I)V

    return-object v0

    :pswitch_a
    sget-object p1, Lu1/b2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_3

    check-cast v5, Lo9/g;

    invoke-interface {v5, v0}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v0

    :pswitch_b
    check-cast p1, Lm0/o0;

    check-cast v5, Lu1/w1;

    new-instance p1, Lb/c;

    const/4 v0, 0x6

    invoke-direct {p1, v5, v0}, Lb/c;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_c
    check-cast p1, Le1/p;

    check-cast v5, Lt1/c1;

    iget-object v1, v5, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->D()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v5, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-static {v1}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v1

    check-cast v1, Lu1/w;

    invoke-virtual {v1}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object v1

    sget-object v2, Lt1/c1;->I:Le1/i0;

    sget-object v2, Lt1/f;->p:Lt1/f;

    new-instance v4, Lu/r0;

    const/16 v6, 0xe

    invoke-direct {v4, v6, v5, p1}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v5, v2, v4}, Lt1/n1;->a(Lt1/m1;Lc9/c;Lc9/a;)V

    iput-boolean v3, v5, Lt1/c1;->G:Z

    goto :goto_3

    :cond_4
    iput-boolean v4, v5, Lt1/c1;->G:Z

    :goto_3
    return-object v0

    :pswitch_d
    check-cast p1, Ly0/m;

    check-cast v5, Lo0/i;

    invoke-virtual {v5, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_e
    check-cast p1, Lt1/b;

    invoke-interface {p1}, Lt1/b;->G()Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_7

    :cond_5
    invoke-interface {p1}, Lt1/b;->d()Lt1/a;

    move-result-object v1

    iget-boolean v1, v1, Lt1/a;->b:Z

    if-eqz v1, :cond_6

    invoke-interface {p1}, Lt1/b;->B()V

    :cond_6
    invoke-interface {p1}, Lt1/b;->d()Lt1/a;

    move-result-object v1

    iget-object v1, v1, Lt1/a;->i:Ljava/util/HashMap;

    check-cast v5, Lt1/a;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr1/a;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {p1}, Lt1/b;->l()Lt1/x;

    move-result-object v4

    invoke-static {v5, v3, v2, v4}, Lt1/a;->a(Lt1/a;Lr1/a;ILt1/c1;)V

    goto :goto_4

    :cond_7
    invoke-interface {p1}, Lt1/b;->l()Lt1/x;

    move-result-object p1

    iget-object p1, p1, Lt1/c1;->r:Lt1/c1;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    :goto_5
    iget-object v1, v5, Lt1/a;->a:Lt1/b;

    invoke-interface {v1}, Lt1/b;->l()Lt1/x;

    move-result-object v1

    invoke-static {p1, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {v5, p1}, Lt1/a;->c(Lt1/c1;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr1/a;

    invoke-virtual {v5, p1, v2}, Lt1/a;->d(Lt1/c1;Lr1/a;)I

    move-result v3

    invoke-static {v5, v2, v3, p1}, Lt1/a;->a(Lt1/a;Lr1/a;ILt1/c1;)V

    goto :goto_6

    :cond_8
    iget-object p1, p1, Lt1/c1;->r:Lt1/c1;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    :goto_7
    return-object v0

    :pswitch_f
    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr1/f1;

    check-cast v5, Lr1/f0;

    iget-object v1, v5, Lr1/f0;->t:Lo0/i;

    invoke-virtual {v1, v0}, Lo0/i;->j(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_a

    iget v1, v5, Lr1/f0;->e:I

    if-lt v0, v1, :cond_b

    :cond_a
    invoke-interface {p1}, Lr1/f1;->a()V

    move v3, v4

    :cond_b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lh1/b;->a(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_11
    check-cast p1, Li1/c0;

    check-cast v5, Li1/c;

    invoke-virtual {v5, p1}, Li1/c;->g(Li1/c0;)V

    iget-object v1, v5, Li1/c;->i:Lc9/c;

    if-eqz v1, :cond_c

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
