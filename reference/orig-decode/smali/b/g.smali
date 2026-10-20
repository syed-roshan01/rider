.class public final Lb/g;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lb/g;->a:I

    iput-object p1, p0, Lb/g;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb/g;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb/g;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/o0;)Lm0/n0;
    .locals 4

    iget p1, p0, Lb/g;->a:I

    const/4 v0, 0x1

    iget-object v1, p0, Lb/g;->d:Ljava/lang/Object;

    iget-object v2, p0, Lb/g;->c:Ljava/lang/Object;

    iget-object v3, p0, Lb/g;->b:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v3, Lv0/j;

    iget-object p1, v3, Lv0/j;->b:Ljava/util/LinkedHashMap;

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v0

    if-eqz p1, :cond_0

    iget-object p1, v3, Lv0/j;->a:Ljava/util/Map;

    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v3, Lv0/j;->b:Ljava/util/LinkedHashMap;

    check-cast v1, Lv0/i;

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ls/j;

    invoke-direct {p1, v1, v3, v2}, Ls/j;-><init>(Lv0/i;Lv0/j;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Key "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " was used multiple times "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    check-cast v3, Lw0/u;

    check-cast v1, Ls/w;

    new-instance p1, Ls/j;

    invoke-direct {p1, v3, v2, v1}, Ls/j;-><init>(Lw0/u;Ljava/lang/Object;Ls/w;)V

    return-object p1

    :pswitch_1
    check-cast v3, Landroidx/activity/i0;

    check-cast v2, Landroidx/lifecycle/w;

    check-cast v1, Lb/h;

    invoke-virtual {v3, v2, v1}, Landroidx/activity/i0;->a(Landroidx/lifecycle/w;Landroidx/activity/y;)V

    new-instance p1, Lb/c;

    invoke-direct {p1, v1, v0}, Lb/c;-><init>(Ljava/lang/Object;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    const/4 p1, 0x0

    iget v0, p0, Lb/g;->a:I

    iget-object v1, p0, Lb/g;->c:Ljava/lang/Object;

    iget-object v2, p0, Lb/g;->d:Ljava/lang/Object;

    iget-object v3, p0, Lb/g;->b:Ljava/lang/Object;

    sparse-switch v0, :sswitch_data_0

    check-cast v3, Lc9/c;

    check-cast v2, Lu8/j;

    invoke-static {v3, v1, p1}, Ld7/a;->g(Lc9/c;Ljava/lang/Object;Landroidx/fragment/app/a0;)Landroidx/fragment/app/a0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {v2, p1}, Lh6/g;->n0(Lu8/j;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :sswitch_0
    sget-object v0, Lo9/e;->l:Li3/u;

    if-ne v3, v0, :cond_1

    return-void

    :cond_1
    check-cast v1, Lo9/c;

    iget-object v0, v1, Lo9/c;->b:Lc9/c;

    invoke-static {v2}, La7/a;->w(Ljava/lang/Object;)V

    throw p1

    :sswitch_1
    check-cast v3, Lt4/i;

    check-cast v1, Landroid/view/ViewTreeObserver;

    check-cast v2, Lt4/h;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void

    :cond_2
    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x13 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public final d(Lr1/w0;)V
    .locals 11

    const/4 v0, 0x0

    iget v1, p0, Lb/g;->a:I

    iget-object v2, p0, Lb/g;->d:Ljava/lang/Object;

    iget-object v3, p0, Lb/g;->c:Ljava/lang/Object;

    iget-object v4, p0, Lb/g;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v4, Ly/x0;

    check-cast v3, La4/k;

    check-cast v2, Lr1/l0;

    invoke-interface {v2}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v3, La4/k;->b:I

    :goto_0
    iget v5, v3, La4/k;->c:I

    if-ge v2, v5, :cond_6

    iget-object v5, v4, Ly/x0;->f:[Lr1/x0;

    aget-object v5, v5, v2

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v6, v4, Ly/x0;->e:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr1/i0;

    invoke-interface {v6}, Lr1/p;->a()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ly/y0;

    if-eqz v7, :cond_0

    check-cast v6, Ly/y0;

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_1

    iget-object v6, v6, Ly/y0;->c:Ly/a0;

    if-nez v6, :cond_2

    :cond_1
    iget-object v6, v4, Ly/x0;->d:Ly/a0;

    :cond_2
    const/4 v7, 0x1

    iget v8, v4, Ly/x0;->a:I

    if-ne v8, v7, :cond_3

    iget v9, v5, Lr1/x0;->b:I

    goto :goto_2

    :cond_3
    iget v9, v5, Lr1/x0;->a:I

    :goto_2
    iget v10, v3, La4/k;->a:I

    sub-int/2addr v10, v9

    if-ne v8, v7, :cond_4

    sget-object v9, Lm2/l;->a:Lm2/l;

    goto :goto_3

    :cond_4
    move-object v9, v1

    :goto_3
    invoke-virtual {v6, v10, v9}, Ly/a0;->a(ILm2/l;)I

    move-result v6

    iget v9, v3, La4/k;->b:I

    iget-object v10, v3, La4/k;->d:[I

    if-ne v8, v7, :cond_5

    sub-int v7, v2, v9

    aget v7, v10, v7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v7, v6, v0}, Lr1/w0;->c(Lr1/x0;IIF)V

    goto :goto_4

    :cond_5
    sub-int v7, v2, v9

    aget v7, v10, v7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v6, v7, v0}, Lr1/w0;->c(Lr1/x0;IIF)V

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-void

    :pswitch_0
    check-cast v4, Lr1/x0;

    check-cast v3, Lr1/l0;

    check-cast v2, Ly/v0;

    iget-object v1, v2, Ly/v0;->u:Ly/t0;

    invoke-interface {v3}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v5

    invoke-interface {v1, v5}, Ly/t0;->a(Lm2/l;)F

    move-result v1

    invoke-interface {v3, v1}, Lm2/b;->J(F)I

    move-result v1

    iget-object v2, v2, Ly/v0;->u:Ly/t0;

    invoke-interface {v2}, Ly/t0;->d()F

    move-result v2

    invoke-interface {v3, v2}, Lm2/b;->J(F)I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v1, v2, v0}, Lr1/w0;->c(Lr1/x0;IIF)V

    return-void

    :pswitch_1
    check-cast v4, Ly/s0;

    iget-boolean v1, v4, Ly/s0;->y:Z

    if-eqz v1, :cond_7

    check-cast v3, Lr1/x0;

    check-cast v2, Lr1/l0;

    iget v0, v4, Ly/s0;->u:F

    invoke-interface {v2, v0}, Lm2/b;->J(F)I

    move-result v0

    iget v1, v4, Ly/s0;->v:F

    invoke-interface {v2, v1}, Lm2/b;->J(F)I

    move-result v1

    invoke-static {p1, v3, v0, v1}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    goto :goto_5

    :cond_7
    check-cast v3, Lr1/x0;

    check-cast v2, Lr1/l0;

    iget v1, v4, Ly/s0;->u:F

    invoke-interface {v2, v1}, Lm2/b;->J(F)I

    move-result v1

    iget v4, v4, Ly/s0;->v:F

    invoke-interface {v2, v4}, Lm2/b;->J(F)I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v1, v2, v0}, Lr1/w0;->c(Lr1/x0;IIF)V

    :goto_5
    return-void

    :pswitch_2
    check-cast v4, Ly/q0;

    iget-object v0, v4, Ly/q0;->u:Lc9/c;

    check-cast v3, Lr1/l0;

    invoke-interface {v0, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/i;

    iget-wide v0, v0, Lm2/i;->a:J

    iget-boolean v3, v4, Ly/q0;->v:Z

    const-wide v4, 0xffffffffL

    const/16 v6, 0x20

    if-eqz v3, :cond_8

    check-cast v2, Lr1/x0;

    shr-long v6, v0, v6

    long-to-int v3, v6

    and-long/2addr v0, v4

    long-to-int v0, v0

    invoke-static {p1, v2, v3, v0}, Lr1/w0;->h(Lr1/w0;Lr1/x0;II)V

    goto :goto_6

    :cond_8
    check-cast v2, Lr1/x0;

    shr-long v6, v0, v6

    long-to-int v6, v6

    and-long/2addr v0, v4

    long-to-int v7, v0

    const/4 v8, 0x0

    const/16 v9, 0xc

    move-object v4, p1

    move-object v5, v2

    invoke-static/range {v4 .. v9}, Lr1/w0;->k(Lr1/w0;Lr1/x0;IILq/w;I)V

    :goto_6
    return-void

    :pswitch_3
    check-cast v4, Ly/p0;

    iget-boolean v1, v4, Ly/p0;->w:Z

    if-eqz v1, :cond_9

    check-cast v3, Lr1/x0;

    check-cast v2, Lr1/l0;

    iget v0, v4, Ly/p0;->u:F

    invoke-interface {v2, v0}, Lm2/b;->J(F)I

    move-result v0

    iget v1, v4, Ly/p0;->v:F

    invoke-interface {v2, v1}, Lm2/b;->J(F)I

    move-result v1

    invoke-static {p1, v3, v0, v1}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    goto :goto_7

    :cond_9
    check-cast v3, Lr1/x0;

    check-cast v2, Lr1/l0;

    iget v1, v4, Ly/p0;->u:F

    invoke-interface {v2, v1}, Lm2/b;->J(F)I

    move-result v1

    iget v4, v4, Ly/p0;->v:F

    invoke-interface {v2, v4}, Lm2/b;->J(F)I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v1, v2, v0}, Lr1/w0;->c(Lr1/x0;IIF)V

    :goto_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Z)V
    .locals 13

    iget v0, p0, Lb/g;->a:I

    iget-object v1, p0, Lb/g;->d:Ljava/lang/Object;

    iget-object v2, p0, Lb/g;->b:Ljava/lang/Object;

    iget-object v3, p0, Lb/g;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lm0/g1;

    invoke-interface {v3}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    check-cast v2, Landroid/content/Context;

    const-string p1, "Enable Shizuku first to use this feature"

    invoke-static {v2, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_1

    :cond_0
    check-cast v1, Lm0/g1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, v0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    const-string v0, "ShellTapExecutor"

    const-string v1, "global"

    const-string v2, "put"

    const-string v4, "settings"

    const-string v5, "\u26a1 Zero Animation Mode set to scale="

    invoke-static {}, Lo7/d0;->P()Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    const-string p1, "0"

    goto :goto_0

    :cond_2
    const-string p1, "1"

    :goto_0
    const/4 v6, 0x5

    :try_start_0
    new-array v7, v6, [Ljava/lang/String;

    aput-object v4, v7, v3

    const/4 v8, 0x1

    aput-object v2, v7, v8

    const/4 v9, 0x2

    aput-object v1, v7, v9

    const-string v10, "window_animation_scale"

    const/4 v11, 0x3

    aput-object v10, v7, v11

    const/4 v10, 0x4

    aput-object p1, v7, v10

    invoke-static {v7}, Lo7/d0;->b0([Ljava/lang/String;)Ljava/lang/Process;

    new-array v7, v6, [Ljava/lang/String;

    aput-object v4, v7, v3

    aput-object v2, v7, v8

    aput-object v1, v7, v9

    const-string v12, "transition_animation_scale"

    aput-object v12, v7, v11

    aput-object p1, v7, v10

    invoke-static {v7}, Lo7/d0;->b0([Ljava/lang/String;)Ljava/lang/Process;

    new-array v6, v6, [Ljava/lang/String;

    aput-object v4, v6, v3

    aput-object v2, v6, v8

    aput-object v1, v6, v9

    const-string v1, "animator_duration_scale"

    aput-object v1, v6, v11

    aput-object p1, v6, v10

    invoke-static {v6}, Lo7/d0;->b0([Ljava/lang/String;)Ljava/lang/Process;

    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Zero Animation Mode failed: "

    invoke-static {v1, p1, v0}, La7/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void

    :pswitch_0
    check-cast v1, Lm0/g1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, v0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    check-cast v2, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    check-cast v3, Lcom/auto/accept/data/model/SupportedApp;

    invoke-virtual {v3}, Lcom/auto/accept/data/model/SupportedApp;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "appName"

    invoke-static {v0, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v2, Lcom/auto/accept/ui/viewmodel/MainViewModel;->b:Lz4/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "app_enabled_"

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v1, v1, Lz4/d;->J:Lp9/q0;

    invoke-virtual {v1}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-static {v2}, Lr8/v;->I0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v2, v1, Lb/g;->a:I

    const/16 v3, 0x29

    const-wide v4, 0xffffffffL

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x0

    iget-object v11, v1, Lb/g;->d:Ljava/lang/Object;

    iget-object v12, v1, Lb/g;->b:Ljava/lang/Object;

    iget-object v13, v1, Lb/g;->c:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Lb/g;->b(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_1
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Lb/g;->b(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_2
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/String;

    const-string v3, "it"

    invoke-static {v2, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Lm0/g1;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toUpperCase(...)"

    invoke-static {v2, v3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v13, v2}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    check-cast v11, Lm0/l3;

    invoke-interface {v11}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/auto/accept/data/model/CouponData;

    if-eqz v2, :cond_0

    check-cast v12, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v2, v12, Lcom/auto/accept/ui/viewmodel/MainViewModel;->t0:Lp9/q0;

    invoke-virtual {v2, v10}, Lp9/q0;->i(Ljava/lang/Object;)V

    iget-object v2, v12, Lcom/auto/accept/ui/viewmodel/MainViewModel;->v0:Lp9/q0;

    invoke-virtual {v2, v10}, Lp9/q0;->i(Ljava/lang/Object;)V

    :cond_0
    return-object v0

    :pswitch_3
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1, v2}, Lb/g;->f(Z)V

    return-object v0

    :pswitch_4
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1, v2}, Lb/g;->f(Z)V

    return-object v0

    :pswitch_5
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Lb/g;->b(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Lt1/u1;

    instance-of v2, v0, La1/c;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, La1/c;

    check-cast v13, La1/e;

    invoke-static {v13}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v3

    check-cast v3, Lu1/w;

    invoke-virtual {v3}, Lu1/w;->getDragAndDropManager()La1/b;

    move-result-object v3

    check-cast v3, Lu1/y1;

    iget-object v3, v3, Lu1/y1;->b:Lq/g;

    invoke-virtual {v3, v2}, Lq/g;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    check-cast v11, La1/a;

    iget-object v3, v11, La1/a;->a:Landroid/view/DragEvent;

    invoke-virtual {v3}, Landroid/view/DragEvent;->getX()F

    move-result v3

    iget-object v4, v11, La1/a;->a:Landroid/view/DragEvent;

    invoke-virtual {v4}, Landroid/view/DragEvent;->getY()F

    move-result v4

    invoke-static {v3, v4}, Ld9/i;->f(FF)J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Ld9/i;->i(La1/c;J)Z

    move-result v2

    if-eqz v2, :cond_1

    check-cast v12, Ld9/u;

    iput-object v0, v12, Ld9/u;->a:Ljava/lang/Object;

    sget-object v0, Lt1/t1;->c:Lt1/t1;

    goto :goto_0

    :cond_1
    sget-object v0, Lt1/t1;->a:Lt1/t1;

    :goto_0
    return-object v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, La1/e;

    check-cast v12, Ld9/q;

    iget-boolean v2, v12, Ld9/q;->a:Z

    check-cast v13, La1/a;

    invoke-virtual {v0, v13}, La1/e;->G0(La1/a;)Z

    move-result v3

    check-cast v11, La1/e;

    if-eqz v3, :cond_2

    invoke-static {v11}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v4

    check-cast v4, Lu1/w;

    invoke-virtual {v4}, Lu1/w;->getDragAndDropManager()La1/b;

    move-result-object v4

    check-cast v4, Lu1/y1;

    iget-object v4, v4, Lu1/y1;->b:Lq/g;

    invoke-virtual {v4, v0}, Lq/g;->add(Ljava/lang/Object;)Z

    :cond_2
    or-int v0, v2, v3

    iput-boolean v0, v12, Ld9/q;->a:Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Lm0/o0;

    invoke-virtual {v1, v0}, Lb/g;->a(Lm0/o0;)Lm0/n0;

    move-result-object v0

    return-object v0

    :pswitch_9
    move-object/from16 v2, p1

    check-cast v2, Lh0/r0;

    check-cast v12, Lf0/t0;

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v8, -0x1

    packed-switch v3, :pswitch_data_1

    goto/16 :goto_7

    :pswitch_a
    check-cast v13, Lf0/p1;

    iget-object v2, v13, Lf0/p1;->h:Lf0/e2;

    if-eqz v2, :cond_22

    iget-object v3, v2, Lf0/e2;->c:Ll/t;

    if-eqz v3, :cond_3

    iget-object v4, v3, Ll/t;->b:Ljava/lang/Object;

    check-cast v4, Ll/t;

    iput-object v4, v2, Lf0/e2;->c:Ll/t;

    iget-object v4, v3, Ll/t;->c:Ljava/lang/Object;

    check-cast v4, Lg2/a0;

    iget-object v5, v2, Lf0/e2;->b:Ll/t;

    new-instance v6, Ll/t;

    invoke-direct {v6, v7, v5, v4}, Ll/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v6, v2, Lf0/e2;->b:Ll/t;

    iget v5, v2, Lf0/e2;->d:I

    iget-object v4, v4, Lg2/a0;->a:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v5

    iput v4, v2, Lf0/e2;->d:I

    iget-object v2, v3, Ll/t;->c:Ljava/lang/Object;

    move-object v10, v2

    check-cast v10, Lg2/a0;

    :cond_3
    if-eqz v10, :cond_22

    iget-object v2, v13, Lf0/p1;->k:Lc9/c;

    invoke-interface {v2, v10}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_7

    :pswitch_b
    check-cast v13, Lf0/p1;

    iget-object v3, v13, Lf0/p1;->h:Lf0/e2;

    if-eqz v3, :cond_4

    iget-object v4, v2, Lh0/h;->g:La2/e;

    iget-wide v5, v2, Lh0/h;->f:J

    const/4 v8, 0x4

    iget-object v2, v2, Lh0/r0;->h:Lg2/a0;

    invoke-static {v2, v4, v5, v6, v8}, Lg2/a0;->a(Lg2/a0;La2/e;JI)Lg2/a0;

    move-result-object v2

    invoke-virtual {v3, v2}, Lf0/e2;->a(Lg2/a0;)V

    :cond_4
    iget-object v2, v13, Lf0/p1;->h:Lf0/e2;

    if-eqz v2, :cond_22

    iget-object v3, v2, Lf0/e2;->b:Ll/t;

    if-eqz v3, :cond_5

    iget-object v4, v3, Ll/t;->b:Ljava/lang/Object;

    check-cast v4, Ll/t;

    if-eqz v4, :cond_5

    iput-object v4, v2, Lf0/e2;->b:Ll/t;

    iget v5, v2, Lf0/e2;->d:I

    iget-object v6, v3, Ll/t;->c:Ljava/lang/Object;

    check-cast v6, Lg2/a0;

    iget-object v6, v6, Lg2/a0;->a:La2/e;

    iget-object v6, v6, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v5, v6

    iput v5, v2, Lf0/e2;->d:I

    iget-object v3, v3, Ll/t;->c:Ljava/lang/Object;

    check-cast v3, Lg2/a0;

    iget-object v5, v2, Lf0/e2;->c:Ll/t;

    new-instance v6, Ll/t;

    invoke-direct {v6, v7, v5, v3}, Ll/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v6, v2, Lf0/e2;->c:Ll/t;

    iget-object v2, v4, Ll/t;->c:Ljava/lang/Object;

    move-object v10, v2

    check-cast v10, Lg2/a0;

    :cond_5
    if-eqz v10, :cond_22

    iget-object v2, v13, Lf0/p1;->k:Lc9/c;

    invoke-interface {v2, v10}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_7

    :pswitch_c
    check-cast v13, Lf0/p1;

    iget-boolean v2, v13, Lf0/p1;->e:Z

    if-nez v2, :cond_6

    new-instance v2, Lg2/a;

    const-string v3, "\t"

    invoke-direct {v2, v3, v9}, Lg2/a;-><init>(Ljava/lang/String;I)V

    invoke-static {v2}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v13, v2}, Lf0/p1;->a(Ljava/util/List;)V

    goto/16 :goto_7

    :cond_6
    check-cast v11, Ld9/q;

    iput-boolean v6, v11, Ld9/q;->a:Z

    goto/16 :goto_7

    :pswitch_d
    check-cast v13, Lf0/p1;

    iget-boolean v2, v13, Lf0/p1;->e:Z

    if-nez v2, :cond_7

    new-instance v2, Lg2/a;

    const-string v3, "\n"

    invoke-direct {v2, v3, v9}, Lg2/a;-><init>(Ljava/lang/String;I)V

    invoke-static {v2}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v13, v2}, Lf0/p1;->a(Ljava/util/List;)V

    goto/16 :goto_7

    :cond_7
    iget-object v2, v13, Lf0/p1;->a:Lf0/c2;

    iget-object v2, v2, Lf0/c2;->u:Lf0/v;

    new-instance v3, Lg2/n;

    iget v4, v13, Lf0/p1;->l:I

    invoke-direct {v3, v4}, Lg2/n;-><init>(I)V

    invoke-virtual {v2, v3}, Lf0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_7

    :pswitch_e
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    iget-wide v6, v2, Lh0/h;->f:J

    sget v3, La2/b0;->c:I

    and-long v3, v6, v4

    long-to-int v3, v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :pswitch_f
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_9

    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v2}, Lh0/h;->i()V

    goto :goto_1

    :cond_8
    invoke-virtual {v2}, Lh0/h;->j()V

    :cond_9
    :goto_1
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_10
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_b

    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v2}, Lh0/h;->j()V

    goto :goto_2

    :cond_a
    invoke-virtual {v2}, Lh0/h;->i()V

    :cond_b
    :goto_2
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_11
    invoke-virtual {v2}, Lh0/h;->i()V

    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_12
    invoke-virtual {v2}, Lh0/h;->j()V

    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_13
    invoke-virtual {v2}, Lh0/h;->h()V

    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_14
    invoke-virtual {v2}, Lh0/h;->g()V

    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_15
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v4, v2, Lh0/h;->g:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_d

    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v4

    if-eqz v4, :cond_c

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_d

    invoke-virtual {v2}, Lh0/h;->c()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto :goto_3

    :cond_c
    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_d

    invoke-virtual {v2}, Lh0/h;->d()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    :cond_d
    :goto_3
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_16
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v4, v2, Lh0/h;->g:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_f

    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v4

    if-eqz v4, :cond_e

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_f

    invoke-virtual {v2}, Lh0/h;->d()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto :goto_4

    :cond_e
    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_f

    invoke-virtual {v2}, Lh0/h;->c()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    :cond_f
    :goto_4
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_17
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v4, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_10

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    :cond_10
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_18
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_11

    invoke-virtual {v2, v6, v6}, Lh0/h;->l(II)V

    :cond_11
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_19
    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_12

    iget-object v3, v2, Lh0/r0;->i:Lf0/d2;

    if-eqz v3, :cond_12

    invoke-virtual {v2, v3, v9}, Lh0/r0;->o(Lf0/d2;I)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    :cond_12
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_1a
    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_13

    iget-object v3, v2, Lh0/r0;->i:Lf0/d2;

    if-eqz v3, :cond_13

    invoke-virtual {v2, v3, v8}, Lh0/r0;->o(Lf0/d2;I)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    :cond_13
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_1b
    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_14

    iget-object v3, v2, Lh0/h;->c:La2/a0;

    if-eqz v3, :cond_14

    invoke-virtual {v2, v3, v9}, Lh0/h;->f(La2/a0;I)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    :cond_14
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_1c
    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_15

    iget-object v3, v2, Lh0/h;->c:La2/a0;

    if-eqz v3, :cond_15

    invoke-virtual {v2, v3, v8}, Lh0/h;->f(La2/a0;I)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    :cond_15
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_1d
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v6, v2, Lh0/h;->g:La2/e;

    iget-object v6, v6, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_17

    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v6

    if-eqz v6, :cond_16

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_17

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    iget-wide v6, v2, Lh0/h;->f:J

    sget v9, La2/b0;->c:I

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4, v3}, Ld7/t;->T(ILjava/lang/String;)I

    move-result v3

    if-eq v3, v8, :cond_17

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto :goto_5

    :cond_16
    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_17

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    iget-wide v6, v2, Lh0/h;->f:J

    sget v9, La2/b0;->c:I

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4, v3}, Ld7/t;->U(ILjava/lang/String;)I

    move-result v3

    if-eq v3, v8, :cond_17

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    :cond_17
    :goto_5
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_1e
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v6, v2, Lh0/h;->g:La2/e;

    iget-object v6, v6, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_19

    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v6

    if-eqz v6, :cond_18

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_19

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    iget-wide v6, v2, Lh0/h;->f:J

    sget v9, La2/b0;->c:I

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4, v3}, Ld7/t;->U(ILjava/lang/String;)I

    move-result v3

    if-eq v3, v8, :cond_19

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto :goto_6

    :cond_18
    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_19

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    iget-wide v6, v2, Lh0/h;->f:J

    sget v9, La2/b0;->c:I

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4, v3}, Ld7/t;->T(ILjava/lang/String;)I

    move-result v3

    if-eq v3, v8, :cond_19

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    :cond_19
    :goto_6
    invoke-virtual {v2}, Lh0/h;->k()V

    goto/16 :goto_7

    :pswitch_1f
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v4, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_22

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v6, v3}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :pswitch_20
    sget-object v3, Lf0/j;->s:Lf0/j;

    invoke-virtual {v2, v3}, Lh0/r0;->n(Lf0/j;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_22

    check-cast v13, Lf0/p1;

    invoke-virtual {v13, v2}, Lf0/p1;->a(Ljava/util/List;)V

    goto/16 :goto_7

    :pswitch_21
    sget-object v3, Lf0/j;->r:Lf0/j;

    invoke-virtual {v2, v3}, Lh0/r0;->n(Lf0/j;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_22

    check-cast v13, Lf0/p1;

    invoke-virtual {v13, v2}, Lf0/p1;->a(Ljava/util/List;)V

    goto/16 :goto_7

    :pswitch_22
    sget-object v3, Lf0/j;->q:Lf0/j;

    invoke-virtual {v2, v3}, Lh0/r0;->n(Lf0/j;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_22

    check-cast v13, Lf0/p1;

    invoke-virtual {v13, v2}, Lf0/p1;->a(Ljava/util/List;)V

    goto/16 :goto_7

    :pswitch_23
    sget-object v3, Lf0/j;->p:Lf0/j;

    invoke-virtual {v2, v3}, Lh0/r0;->n(Lf0/j;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_22

    check-cast v13, Lf0/p1;

    invoke-virtual {v13, v2}, Lf0/p1;->a(Ljava/util/List;)V

    goto/16 :goto_7

    :pswitch_24
    sget-object v3, Lf0/j;->o:Lf0/j;

    invoke-virtual {v2, v3}, Lh0/r0;->n(Lf0/j;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_22

    check-cast v13, Lf0/p1;

    invoke-virtual {v13, v2}, Lf0/p1;->a(Ljava/util/List;)V

    goto/16 :goto_7

    :pswitch_25
    sget-object v3, Lf0/j;->n:Lf0/j;

    invoke-virtual {v2, v3}, Lh0/r0;->n(Lf0/j;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_22

    check-cast v13, Lf0/p1;

    invoke-virtual {v13, v2}, Lf0/p1;->a(Ljava/util/List;)V

    goto/16 :goto_7

    :pswitch_26
    check-cast v13, Lf0/p1;

    iget-object v2, v13, Lf0/p1;->b:Lh0/v0;

    invoke-virtual {v2}, Lh0/v0;->f()V

    goto/16 :goto_7

    :pswitch_27
    check-cast v13, Lf0/p1;

    iget-object v2, v13, Lf0/p1;->b:Lh0/v0;

    invoke-virtual {v2}, Lh0/v0;->m()V

    goto/16 :goto_7

    :pswitch_28
    check-cast v13, Lf0/p1;

    iget-object v2, v13, Lf0/p1;->b:Lh0/v0;

    invoke-virtual {v2, v6}, Lh0/v0;->d(Z)V

    goto/16 :goto_7

    :pswitch_29
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v4, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_22

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :pswitch_2a
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    invoke-virtual {v2, v6, v6}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :pswitch_2b
    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    iget-object v3, v2, Lh0/r0;->i:Lf0/d2;

    if-eqz v3, :cond_22

    invoke-virtual {v2, v3, v9}, Lh0/r0;->o(Lf0/d2;I)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :pswitch_2c
    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    iget-object v3, v2, Lh0/r0;->i:Lf0/d2;

    if-eqz v3, :cond_22

    invoke-virtual {v2, v3, v8}, Lh0/r0;->o(Lf0/d2;I)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :pswitch_2d
    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    iget-object v3, v2, Lh0/h;->c:La2/a0;

    if-eqz v3, :cond_22

    invoke-virtual {v2, v3, v9}, Lh0/h;->f(La2/a0;I)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :pswitch_2e
    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    iget-object v3, v2, Lh0/h;->c:La2/a0;

    if-eqz v3, :cond_22

    invoke-virtual {v2, v3, v8}, Lh0/h;->f(La2/a0;I)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :pswitch_2f
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-virtual {v2}, Lh0/h;->i()V

    goto/16 :goto_7

    :cond_1a
    invoke-virtual {v2}, Lh0/h;->j()V

    goto/16 :goto_7

    :pswitch_30
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-virtual {v2}, Lh0/h;->j()V

    goto/16 :goto_7

    :cond_1b
    invoke-virtual {v2}, Lh0/h;->i()V

    goto/16 :goto_7

    :pswitch_31
    invoke-virtual {v2}, Lh0/h;->i()V

    goto/16 :goto_7

    :pswitch_32
    invoke-virtual {v2}, Lh0/h;->j()V

    goto/16 :goto_7

    :pswitch_33
    invoke-virtual {v2}, Lh0/h;->h()V

    goto/16 :goto_7

    :pswitch_34
    invoke-virtual {v2}, Lh0/h;->g()V

    goto/16 :goto_7

    :pswitch_35
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v4, v2, Lh0/h;->g:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_22

    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v4

    if-eqz v4, :cond_1c

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    invoke-virtual {v2}, Lh0/h;->d()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_22

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :cond_1c
    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    invoke-virtual {v2}, Lh0/h;->c()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_22

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :pswitch_36
    iget-object v3, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v4, v2, Lh0/h;->g:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_22

    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v4

    if-eqz v4, :cond_1d

    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    invoke-virtual {v2}, Lh0/h;->c()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_22

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto/16 :goto_7

    :cond_1d
    iput-object v10, v3, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v3, v2, Lh0/h;->g:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_22

    invoke-virtual {v2}, Lh0/h;->d()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_22

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto :goto_7

    :pswitch_37
    sget-object v3, Lf0/j;->f:Lf0/j;

    iget-object v4, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v4, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v4, v2, Lh0/h;->g:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_22

    iget-wide v4, v2, Lh0/h;->f:J

    invoke-static {v4, v5}, La2/b0;->b(J)Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-virtual {v3, v2}, Lf0/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_1e
    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v3

    if-eqz v3, :cond_1f

    iget-wide v3, v2, Lh0/h;->f:J

    invoke-static {v3, v4}, La2/b0;->d(J)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto :goto_7

    :cond_1f
    iget-wide v3, v2, Lh0/h;->f:J

    invoke-static {v3, v4}, La2/b0;->e(J)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto :goto_7

    :pswitch_38
    sget-object v3, Lf0/j;->e:Lf0/j;

    iget-object v4, v2, Lh0/h;->e:Lh0/a1;

    iput-object v10, v4, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v4, v2, Lh0/h;->g:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_22

    iget-wide v4, v2, Lh0/h;->f:J

    invoke-static {v4, v5}, La2/b0;->b(J)Z

    move-result v4

    if-eqz v4, :cond_20

    invoke-virtual {v3, v2}, Lf0/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_20
    invoke-virtual {v2}, Lh0/h;->e()Z

    move-result v3

    if-eqz v3, :cond_21

    iget-wide v3, v2, Lh0/h;->f:J

    invoke-static {v3, v4}, La2/b0;->e(J)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    goto :goto_7

    :cond_21
    iget-wide v3, v2, Lh0/h;->f:J

    invoke-static {v3, v4}, La2/b0;->d(J)I

    move-result v3

    invoke-virtual {v2, v3, v3}, Lh0/h;->l(II)V

    :cond_22
    :goto_7
    return-object v0

    :pswitch_39
    move-object/from16 v2, p1

    check-cast v2, Ljava/util/List;

    check-cast v12, Lg2/j;

    check-cast v13, Lc9/c;

    check-cast v11, Ld9/u;

    iget-object v3, v11, Ld9/u;->a:Ljava/lang/Object;

    check-cast v3, Lg2/h0;

    invoke-virtual {v12, v2}, Lg2/j;->a(Ljava/util/List;)Lg2/a0;

    move-result-object v2

    if-eqz v3, :cond_23

    invoke-virtual {v3, v10, v2}, Lg2/h0;->a(Lg2/a0;Lg2/a0;)V

    :cond_23
    invoke-interface {v13, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :pswitch_3a
    move-object/from16 v2, p1

    check-cast v2, Lg1/g;

    check-cast v12, Lf0/c2;

    invoke-virtual {v12}, Lf0/c2;->d()Lf0/d2;

    move-result-object v3

    if-eqz v3, :cond_33

    check-cast v13, Lg2/a0;

    check-cast v11, Lg2/s;

    invoke-interface {v2}, Lg1/g;->A()Lg1/b;

    move-result-object v2

    invoke-virtual {v2}, Lg1/b;->a()Le1/p;

    move-result-object v2

    iget-wide v14, v13, Lg2/a0;->b:J

    invoke-static {v14, v15}, La2/b0;->b(J)Z

    move-result v10

    iget-object v3, v3, Lf0/d2;->a:La2/a0;

    if-nez v10, :cond_26

    iget-wide v13, v13, Lg2/a0;->b:J

    invoke-static {v13, v14}, La2/b0;->e(J)I

    move-result v10

    invoke-interface {v11, v10}, Lg2/s;->b(I)I

    move-result v10

    invoke-static {v13, v14}, La2/b0;->d(J)I

    move-result v13

    invoke-interface {v11, v13}, Lg2/s;->b(I)I

    move-result v11

    if-eq v10, v11, :cond_26

    iget-object v13, v3, La2/a0;->b:La2/i;

    iget-object v14, v13, La2/i;->a:La2/k;

    if-ltz v10, :cond_25

    if-gt v10, v11, :cond_25

    iget-object v15, v14, La2/k;->a:La2/e;

    iget-object v15, v15, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v15

    if-gt v11, v15, :cond_25

    if-ne v10, v11, :cond_24

    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v10

    goto :goto_8

    :cond_24
    invoke-static {}, Landroidx/compose/ui/graphics/a;->g()Le1/i;

    move-result-object v14

    iget-object v13, v13, La2/i;->h:Ljava/util/ArrayList;

    invoke-static {v10, v11}, Lo1/s;->g(II)J

    move-result-wide v8

    new-instance v15, Lf0/p0;

    invoke-direct {v15, v14, v10, v11}, Lf0/p0;-><init>(Le1/i;II)V

    invoke-static {v13, v8, v9, v15}, Lo1/s;->z(Ljava/util/ArrayList;JLc9/c;)V

    move-object v10, v14

    :goto_8
    iget-object v8, v12, Lf0/c2;->v:Le1/g;

    invoke-interface {v2, v10, v8}, Le1/p;->k(Le1/d0;Le1/g;)V

    goto :goto_9

    :cond_25
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Start("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") or End("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") is out of range [0.."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v14, La2/k;->a:La2/e;

    iget-object v2, v2, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "), or start > end!"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_26
    :goto_9
    iget-wide v8, v3, La2/a0;->c:J

    const/16 v10, 0x20

    shr-long v11, v8, v10

    long-to-int v11, v11

    int-to-float v11, v11

    iget-object v12, v3, La2/a0;->b:La2/i;

    iget v13, v12, La2/i;->d:F

    cmpg-float v11, v11, v13

    if-gez v11, :cond_27

    goto :goto_a

    :cond_27
    iget-boolean v11, v12, La2/i;->c:Z

    if-nez v11, :cond_29

    and-long/2addr v8, v4

    long-to-int v8, v8

    int-to-float v8, v8

    iget v9, v12, La2/i;->e:F

    cmpg-float v8, v8, v9

    if-gez v8, :cond_28

    goto :goto_a

    :cond_28
    move v8, v6

    goto :goto_b

    :cond_29
    :goto_a
    const/4 v8, 0x1

    :goto_b
    iget-object v9, v3, La2/a0;->a:La2/z;

    if-eqz v8, :cond_2a

    iget v8, v9, La2/z;->f:I

    invoke-static {v8, v7}, Lh6/g;->T(II)Z

    move-result v7

    if-nez v7, :cond_2a

    const/4 v6, 0x1

    :cond_2a
    if-eqz v6, :cond_2b

    iget-wide v7, v3, La2/a0;->c:J

    shr-long v10, v7, v10

    long-to-int v10, v10

    int-to-float v10, v10

    and-long/2addr v4, v7

    long-to-int v4, v4

    int-to-float v4, v4

    sget-wide v7, Ld1/c;->b:J

    invoke-static {v10, v4}, Ld7/t;->j(FF)J

    move-result-wide v4

    invoke-static {v7, v8, v4, v5}, Lm9/e0;->h(JJ)Ld1/d;

    move-result-object v4

    invoke-interface {v2}, Le1/p;->j()V

    invoke-static {v2, v4}, Le1/p;->o(Le1/p;Ld1/d;)V

    :cond_2b
    iget-object v4, v9, La2/z;->b:La2/c0;

    iget-object v4, v4, La2/c0;->a:La2/x;

    iget-object v5, v4, La2/x;->m:Ll2/j;

    iget-object v7, v4, La2/x;->a:Ll2/o;

    if-nez v5, :cond_2c

    sget-object v5, Ll2/j;->b:Ll2/j;

    :cond_2c
    move-object/from16 v19, v5

    iget-object v5, v4, La2/x;->n:Le1/k0;

    if-nez v5, :cond_2d

    sget-object v5, Le1/k0;->d:Le1/k0;

    :cond_2d
    move-object/from16 v18, v5

    iget-object v4, v4, La2/x;->p:Lg1/h;

    if-nez v4, :cond_2e

    sget-object v4, Lg1/j;->a:Lg1/j;

    :cond_2e
    move-object/from16 v20, v4

    :try_start_0
    invoke-interface {v7}, Ll2/o;->e()Le1/n;

    move-result-object v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v4, Ll2/m;->a:Ll2/m;

    if-eqz v16, :cond_30

    if-eq v7, v4, :cond_2f

    :try_start_1
    invoke-interface {v7}, Ll2/o;->c()F

    move-result v8

    move/from16 v17, v8

    goto :goto_c

    :catchall_0
    move-exception v0

    goto :goto_10

    :cond_2f
    const/high16 v17, 0x3f800000    # 1.0f

    :goto_c
    iget-object v14, v3, La2/a0;->b:La2/i;

    move-object v15, v2

    invoke-static/range {v14 .. v20}, La2/i;->b(La2/i;Le1/p;Le1/n;FLe1/k0;Ll2/j;Lg1/h;)V

    goto :goto_f

    :cond_30
    if-eq v7, v4, :cond_31

    invoke-interface {v7}, Ll2/o;->d()J

    move-result-wide v4

    :goto_d
    move-wide/from16 v16, v4

    goto :goto_e

    :cond_31
    sget-wide v4, Le1/r;->b:J

    goto :goto_d

    :goto_e
    iget-object v14, v3, La2/a0;->b:La2/i;

    move-object v15, v2

    invoke-static/range {v14 .. v20}, La2/i;->a(La2/i;Le1/p;JLe1/k0;Ll2/j;Lg1/h;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_f
    if-eqz v6, :cond_33

    invoke-interface {v2}, Le1/p;->h()V

    goto :goto_11

    :goto_10
    if-eqz v6, :cond_32

    invoke-interface {v2}, Le1/p;->h()V

    :cond_32
    throw v0

    :cond_33
    :goto_11
    return-object v0

    :pswitch_3b
    move-object/from16 v2, p1

    check-cast v2, Lg2/a0;

    check-cast v13, Lm0/g1;

    invoke-interface {v13, v2}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    check-cast v11, Lm0/g1;

    invoke-interface {v11}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, v2, Lg2/a0;->a:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    invoke-static {v3, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    iget-object v2, v2, Lg2/a0;->a:La2/e;

    iget-object v4, v2, La2/e;->a:Ljava/lang/String;

    invoke-interface {v11, v4}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    if-eqz v3, :cond_34

    check-cast v12, Lc9/c;

    iget-object v2, v2, La2/e;->a:Ljava/lang/String;

    invoke-interface {v12, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_34
    return-object v0

    :pswitch_3c
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    check-cast v12, Lc9/a;

    invoke-interface {v12}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La0/s;

    if-ltz v0, :cond_35

    invoke-interface {v2}, La0/s;->c()I

    move-result v4

    if-ge v0, v4, :cond_35

    check-cast v13, Lm9/d0;

    new-instance v2, La0/l0;

    check-cast v11, La0/h0;

    invoke-direct {v2, v11, v0, v10}, La0/l0;-><init>(La0/h0;ILu8/e;)V

    invoke-static {v13, v10, v6, v2, v7}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_35
    const-string v4, "Can\'t scroll to index "

    const-string v5, ", it is out of bounds [0, "

    invoke-static {v4, v0, v5}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v2}, La0/s;->c()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_3d
    move-object/from16 v2, p1

    check-cast v2, Lr1/w0;

    invoke-virtual {v1, v2}, Lb/g;->d(Lr1/w0;)V

    return-object v0

    :pswitch_3e
    move-object/from16 v2, p1

    check-cast v2, Lr1/w0;

    invoke-virtual {v1, v2}, Lb/g;->d(Lr1/w0;)V

    return-object v0

    :pswitch_3f
    move-object/from16 v2, p1

    check-cast v2, Lr1/w0;

    invoke-virtual {v1, v2}, Lb/g;->d(Lr1/w0;)V

    return-object v0

    :pswitch_40
    move-object/from16 v2, p1

    check-cast v2, Lr1/w0;

    invoke-virtual {v1, v2}, Lb/g;->d(Lr1/w0;)V

    return-object v0

    :pswitch_41
    move-object/from16 v2, p1

    check-cast v2, Lr1/w0;

    invoke-virtual {v1, v2}, Lb/g;->d(Lr1/w0;)V

    return-object v0

    :pswitch_42
    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    check-cast v12, Lv/s;

    iget-boolean v4, v12, Lv/s;->w:Z

    if-eqz v4, :cond_36

    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_12

    :cond_36
    const/high16 v8, -0x40800000    # -1.0f

    :goto_12
    mul-float v4, v8, v2

    check-cast v13, Lv/r1;

    invoke-interface {v13, v4}, Lv/r1;->a(F)F

    move-result v4

    mul-float/2addr v4, v8

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v5

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v5, v5, v6

    if-gez v5, :cond_37

    check-cast v11, Lm9/f1;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Scroll animation cancelled because scroll was not consumed ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, " < "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Ld7/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v2

    invoke-interface {v11, v2}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_37
    return-object v0

    :pswitch_43
    move-object/from16 v0, p1

    check-cast v0, Ls/j0;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3b

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3a

    const/4 v2, 0x2

    if-ne v0, v2, :cond_39

    check-cast v11, Ls/r0;

    iget-object v0, v11, Ls/r0;->a:Ls/b1;

    iget-object v0, v0, Ls/b1;->b:Ls/w0;

    if-eqz v0, :cond_38

    new-instance v10, Le1/p0;

    iget-wide v2, v0, Ls/w0;->b:J

    invoke-direct {v10, v2, v3}, Le1/p0;-><init>(J)V

    goto :goto_13

    :cond_38
    check-cast v13, Ls/q0;

    iget-object v0, v13, Ls/q0;->a:Ls/b1;

    iget-object v0, v0, Ls/b1;->b:Ls/w0;

    if-eqz v0, :cond_3d

    new-instance v10, Le1/p0;

    iget-wide v2, v0, Ls/w0;->b:J

    invoke-direct {v10, v2, v3}, Le1/p0;-><init>(J)V

    goto :goto_13

    :cond_39
    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_3a
    move-object v10, v12

    check-cast v10, Le1/p0;

    goto :goto_13

    :cond_3b
    check-cast v13, Ls/q0;

    iget-object v0, v13, Ls/q0;->a:Ls/b1;

    iget-object v0, v0, Ls/b1;->b:Ls/w0;

    if-eqz v0, :cond_3c

    new-instance v10, Le1/p0;

    iget-wide v2, v0, Ls/w0;->b:J

    invoke-direct {v10, v2, v3}, Le1/p0;-><init>(J)V

    goto :goto_13

    :cond_3c
    check-cast v11, Ls/r0;

    iget-object v0, v11, Ls/r0;->a:Ls/b1;

    iget-object v0, v0, Ls/b1;->b:Ls/w0;

    if-eqz v0, :cond_3d

    new-instance v10, Le1/p0;

    iget-wide v2, v0, Ls/w0;->b:J

    invoke-direct {v10, v2, v3}, Le1/p0;-><init>(J)V

    :cond_3d
    :goto_13
    if-eqz v10, :cond_3e

    iget-wide v2, v10, Le1/p0;->a:J

    goto :goto_14

    :cond_3e
    sget-wide v2, Le1/p0;->b:J

    :goto_14
    new-instance v0, Le1/p0;

    invoke-direct {v0, v2, v3}, Le1/p0;-><init>(J)V

    return-object v0

    :pswitch_44
    move-object/from16 v2, p1

    check-cast v2, Le1/w;

    check-cast v12, Lm0/l3;

    if-eqz v12, :cond_3f

    invoke-interface {v12}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    goto :goto_15

    :cond_3f
    const/high16 v3, 0x3f800000    # 1.0f

    :goto_15
    check-cast v2, Le1/i0;

    invoke-virtual {v2, v3}, Le1/i0;->a(F)V

    check-cast v13, Lm0/l3;

    if-eqz v13, :cond_40

    invoke-interface {v13}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    goto :goto_16

    :cond_40
    const/high16 v3, 0x3f800000    # 1.0f

    :goto_16
    invoke-virtual {v2, v3}, Le1/i0;->b(F)V

    if-eqz v13, :cond_41

    invoke-interface {v13}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v8

    goto :goto_17

    :cond_41
    const/high16 v8, 0x3f800000    # 1.0f

    :goto_17
    invoke-virtual {v2, v8}, Le1/i0;->d(F)V

    check-cast v11, Lm0/l3;

    if-eqz v11, :cond_42

    invoke-interface {v11}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le1/p0;

    iget-wide v3, v3, Le1/p0;->a:J

    goto :goto_18

    :cond_42
    sget-wide v3, Le1/p0;->b:J

    :goto_18
    invoke-virtual {v2, v3, v4}, Le1/i0;->f(J)V

    return-object v0

    :pswitch_45
    move-object/from16 v0, p1

    check-cast v0, Lm0/o0;

    invoke-virtual {v1, v0}, Lb/g;->a(Lm0/o0;)Lm0/n0;

    move-result-object v0

    return-object v0

    :pswitch_46
    move-object/from16 v0, p1

    check-cast v0, Lm0/o0;

    invoke-virtual {v1, v0}, Lb/g;->a(Lm0/o0;)Lm0/n0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_9
        :pswitch_0
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
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
    .end packed-switch
.end method
