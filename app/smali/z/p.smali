.class public final Lz/p;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/Object;Lm0/l3;I)V
    .locals 0

    iput p4, p0, Lz/p;->a:I

    iput-object p1, p0, Lz/p;->c:Ljava/lang/Object;

    iput-object p2, p0, Lz/p;->d:Ljava/lang/Object;

    iput-object p3, p0, Lz/p;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lz/p;->a:I

    iput-object p1, p0, Lz/p;->b:Ljava/lang/Object;

    iput-object p2, p0, Lz/p;->c:Ljava/lang/Object;

    iput-object p3, p0, Lz/p;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    iget v0, p0, Lz/p;->a:I

    iget-object v1, p0, Lz/p;->d:Ljava/lang/Object;

    iget-object v2, p0, Lz/p;->c:Ljava/lang/Object;

    iget-object v3, p0, Lz/p;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lx9/f;

    iget-object v0, v3, Lx9/f;->b:Lf6/a;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v2, Lx9/o;

    invoke-virtual {v2}, Lx9/o;->a()Ljava/util/List;

    move-result-object v2

    check-cast v1, Lx9/a;

    iget-object v1, v1, Lx9/a;->i:Lx9/s;

    iget-object v1, v1, Lx9/s;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lf6/a;->A(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v3, Lx9/f;

    iget-object v0, v3, Lx9/f;->b:Lf6/a;

    if-eqz v0, :cond_0

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lf6/a;->A(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v2

    check-cast v0, Ljava/util/List;

    :cond_1
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0}, Lf9/a;->y0(Ljava/lang/Iterable;)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    const-string v3, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {v2, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 6

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lz/p;->a:I

    iget-object v2, p0, Lz/p;->d:Ljava/lang/Object;

    iget-object v3, p0, Lz/p;->c:Ljava/lang/Object;

    iget-object v4, p0, Lz/p;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    .line 1
    invoke-virtual {p0}, Lz/p;->a()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Lz/p;->a()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Lz/p;->invoke()V

    return-object v0

    .line 4
    :pswitch_2
    invoke-virtual {p0}, Lz/p;->invoke()V

    return-object v0

    .line 5
    :pswitch_3
    invoke-virtual {p0}, Lz/p;->invoke()V

    return-object v0

    .line 6
    :pswitch_4
    invoke-virtual {p0}, Lz/p;->invoke()V

    return-object v0

    .line 7
    :pswitch_5
    invoke-virtual {p0}, Lz/p;->invoke()V

    return-object v0

    :pswitch_6
    check-cast v4, Lc0/m;

    check-cast v3, Lr1/s;

    check-cast v2, Lc9/a;

    .line 8
    invoke-static {v4, v3, v2}, Lc0/m;->H0(Lc0/m;Lr1/s;Lc9/a;)Ld1/d;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, v4, Lc0/m;->w:Lc0/h;

    check-cast v1, Lv/s;

    .line 9
    iget-wide v2, v1, Lv/s;->D:J

    const-wide/16 v4, 0x0

    .line 10
    invoke-static {v2, v3, v4, v5}, Lm2/k;->a(JJ)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_0

    .line 11
    iget-wide v2, v1, Lv/s;->D:J

    .line 12
    invoke-virtual {v1, v2, v3, v0}, Lv/s;->K0(JLd1/d;)J

    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Ld1/c;->d(J)F

    move-result v3

    neg-float v3, v3

    invoke-static {v1, v2}, Ld1/c;->e(J)F

    move-result v1

    neg-float v1, v1

    invoke-static {v3, v1}, Ld9/i;->f(FF)J

    move-result-wide v1

    .line 14
    invoke-virtual {v0, v1, v2}, Ld1/d;->g(J)Ld1/d;

    move-result-object v0

    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected BringIntoViewRequester to not be used before parents are placed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 16
    :pswitch_7
    new-instance v0, Lb0/r;

    check-cast v4, Lm0/l3;

    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc9/g;

    check-cast v3, Lm0/l3;

    invoke-interface {v3}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc9/c;

    check-cast v2, Lc9/a;

    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-direct {v0, v1, v3, v2}, Lb0/r;-><init>(Lc9/g;Lc9/c;I)V

    return-object v0

    :pswitch_8
    check-cast v4, Lm0/l3;

    .line 17
    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/g;

    .line 18
    new-instance v1, La0/r0;

    check-cast v3, Lz/g0;

    .line 19
    iget-object v4, v3, Lz/g0;->c:Lz/z;

    .line 20
    iget-object v4, v4, Lz/z;->e:La0/y;

    .line 21
    invoke-virtual {v4}, La0/y;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li9/g;

    .line 22
    invoke-direct {v1, v4, v0}, La0/r0;-><init>(Li9/g;Lh6/g;)V

    .line 23
    new-instance v4, Lz/m;

    check-cast v2, Lz/c;

    invoke-direct {v4, v3, v0, v2, v1}, Lz/m;-><init>(Lz/g0;Lz/g;Lz/c;La0/r0;)V

    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()V
    .locals 14

    const/4 v0, 0x3

    const/4 v1, 0x2

    iget v2, p0, Lz/p;->a:I

    const/4 v3, 0x0

    iget-object v4, p0, Lz/p;->c:Ljava/lang/Object;

    iget-object v5, p0, Lz/p;->b:Ljava/lang/Object;

    iget-object v6, p0, Lz/p;->d:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v6, Lm0/g1;

    .line 24
    invoke-interface {v6}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    check-cast v4, Landroid/content/Context;

    .line 25
    sget-object v0, Lg5/b;->a:Ljava/util/List;

    check-cast v5, Lm0/l3;

    .line 26
    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "enable_shizuku_first"

    .line 27
    invoke-static {v1, v0}, Lg5/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_2

    :cond_0
    const-string v2, "ShellTapExecutor"

    const-string v6, "0"

    const-string v7, "global"

    const-string v8, "put"

    const-string v9, "settings"

    .line 28
    invoke-static {}, Lo7/d0;->P()Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_2

    :cond_1
    const/4 v10, 0x5

    :try_start_0
    new-array v11, v10, [Ljava/lang/String;

    aput-object v9, v11, v3

    const/4 v12, 0x1

    aput-object v8, v11, v12

    aput-object v7, v11, v1

    const-string v13, "development_settings_enabled"

    aput-object v13, v11, v0

    const/4 v13, 0x4

    aput-object v6, v11, v13

    .line 29
    invoke-static {v11}, Lo7/d0;->b0([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v11

    if-eqz v11, :cond_2

    .line 30
    invoke-virtual {v11}, Ljava/lang/Process;->waitFor()I

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_2
    :goto_0
    new-array v10, v10, [Ljava/lang/String;

    aput-object v9, v10, v3

    aput-object v8, v10, v12

    aput-object v7, v10, v1

    const-string v1, "adb_enabled"

    aput-object v1, v10, v0

    aput-object v6, v10, v13

    .line 31
    invoke-static {v10}, Lo7/d0;->b0([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 32
    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    :cond_3
    const-string v1, "\ud83d\udd12 Hide Developer Settings executed via Shizuku"

    .line 33
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v11, :cond_4

    .line 34
    invoke-virtual {v11}, Ljava/lang/Process;->exitValue()I

    move-result v1

    if-nez v1, :cond_4

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Process;->exitValue()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_4

    check-cast v4, Landroid/content/Context;

    .line 35
    sget-object v0, Lg5/b;->a:Ljava/util/List;

    check-cast v5, Lm0/l3;

    .line 36
    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "dev_options_hidden"

    .line 37
    invoke-static {v1, v0}, Lg5/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_2

    .line 38
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "hideDevSettings failed: "

    .line 39
    invoke-static {v1, v0, v2}, La7/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_2
    return-void

    :pswitch_0
    check-cast v5, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    check-cast v6, Lm0/g1;

    .line 40
    invoke-interface {v6}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 41
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "langCode"

    .line 42
    invoke-static {v0, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v1, v5, Lcom/auto/accept/ui/viewmodel/MainViewModel;->b:Lz4/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    iget-object v2, v1, Lz4/d;->M:Lp9/q0;

    invoke-virtual {v2, v0}, Lp9/q0;->i(Ljava/lang/Object;)V

    .line 45
    iget-object v2, v1, Lz4/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    iget-object v5, v1, Lz4/d;->L:Ljava/lang/String;

    invoke-interface {v2, v5, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 46
    :try_start_1
    sget-object v2, Lg5/b;->a:Ljava/util/List;

    iget-object v1, v1, Lz4/d;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lg5/b;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    check-cast v4, Landroid/content/Context;

    .line 47
    sget-object v0, Lg5/b;->a:Ljava/util/List;

    .line 48
    invoke-interface {v6}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "save_language"

    .line 49
    invoke-static {v1, v0}, Lg5/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    .line 50
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    check-cast v5, Lm0/l3;

    .line 51
    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "package:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "android.intent.action.DELETE"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    check-cast v4, Landroid/content/Context;

    .line 53
    invoke-virtual {v4, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    check-cast v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    .line 54
    iget-object v0, v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;->T:Lp9/q0;

    const-string v1, ""

    .line 55
    invoke-virtual {v0, v1}, Lp9/q0;->i(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    check-cast v5, Lu1/a;

    check-cast v4, Lk/d;

    .line 56
    invoke-virtual {v5, v4}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    check-cast v6, Lb/b;

    const-string v0, "listener"

    .line 57
    invoke-static {v6, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-static {v5}, Lh6/g;->l0(Landroid/view/View;)Lg3/a;

    move-result-object v0

    .line 59
    iget-object v0, v0, Lg3/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_3
    check-cast v5, Lt1/k0;

    .line 60
    iget-object v2, v5, Lt1/k0;->D:Lt1/n0;

    .line 61
    iput v3, v2, Lt1/n0;->j:I

    .line 62
    iget-object v2, v2, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v2

    .line 63
    iget v7, v2, Lo0/i;->c:I

    const v8, 0x7fffffff

    if-lez v7, :cond_7

    .line 64
    iget-object v2, v2, Lo0/i;->a:[Ljava/lang/Object;

    move v9, v3

    .line 65
    :cond_5
    aget-object v10, v2, v9

    check-cast v10, Landroidx/compose/ui/node/a;

    .line 66
    iget-object v10, v10, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    .line 67
    iget-object v10, v10, Lt1/n0;->p:Lt1/k0;

    .line 68
    invoke-static {v10}, Ld7/a;->j(Ljava/lang/Object;)V

    .line 69
    iget v11, v10, Lt1/k0;->o:I

    iput v11, v10, Lt1/k0;->n:I

    .line 70
    iput v8, v10, Lt1/k0;->o:I

    .line 71
    iget v11, v10, Lt1/k0;->p:I

    if-ne v11, v1, :cond_6

    .line 72
    iput v0, v10, Lt1/k0;->p:I

    :cond_6
    add-int/lit8 v9, v9, 0x1

    if-lt v9, v7, :cond_5

    :cond_7
    sget-object v0, Lt1/f;->c:Lt1/f;

    .line 73
    invoke-virtual {v5, v0}, Lt1/k0;->k(Lc9/c;)V

    .line 74
    invoke-virtual {v5}, Lt1/k0;->l()Lt1/x;

    move-result-object v0

    .line 75
    iget-object v0, v0, Lt1/x;->O:Lt1/r0;

    if-eqz v0, :cond_9

    .line 76
    iget-boolean v0, v0, Lt1/q0;->n:Z

    move-object v1, v6

    check-cast v1, Lt1/n0;

    .line 77
    iget-object v1, v1, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    .line 78
    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->m()Ljava/util/List;

    move-result-object v1

    .line 79
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v7, v3

    :goto_3
    if-ge v7, v2, :cond_9

    .line 80
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 81
    check-cast v9, Landroidx/compose/ui/node/a;

    .line 82
    iget-object v9, v9, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    .line 83
    iget-object v9, v9, Lt1/x0;->c:Lt1/c1;

    .line 84
    invoke-virtual {v9}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v9

    if-nez v9, :cond_8

    goto :goto_4

    .line 85
    :cond_8
    iput-boolean v0, v9, Lt1/q0;->n:Z

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_9
    check-cast v4, Lt1/r0;

    .line 86
    invoke-virtual {v4}, Lt1/r0;->s0()Lr1/k0;

    move-result-object v0

    invoke-interface {v0}, Lr1/k0;->e()V

    .line 87
    invoke-virtual {v5}, Lt1/k0;->l()Lt1/x;

    move-result-object v0

    .line 88
    iget-object v0, v0, Lt1/x;->O:Lt1/r0;

    if-eqz v0, :cond_b

    check-cast v6, Lt1/n0;

    .line 89
    iget-object v0, v6, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    .line 90
    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->m()Ljava/util/List;

    move-result-object v0

    .line 91
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move v2, v3

    :goto_5
    if-ge v2, v1, :cond_b

    .line 92
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 93
    check-cast v4, Landroidx/compose/ui/node/a;

    .line 94
    iget-object v4, v4, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    .line 95
    iget-object v4, v4, Lt1/x0;->c:Lt1/c1;

    .line 96
    invoke-virtual {v4}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v4

    if-nez v4, :cond_a

    goto :goto_6

    .line 97
    :cond_a
    iput-boolean v3, v4, Lt1/q0;->n:Z

    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 98
    :cond_b
    iget-object v0, v5, Lt1/k0;->D:Lt1/n0;

    .line 99
    iget-object v0, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    .line 100
    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v0

    .line 101
    iget v1, v0, Lo0/i;->c:I

    if-lez v1, :cond_e

    .line 102
    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    .line 103
    :cond_c
    aget-object v2, v0, v3

    check-cast v2, Landroidx/compose/ui/node/a;

    .line 104
    iget-object v2, v2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    .line 105
    iget-object v2, v2, Lt1/n0;->p:Lt1/k0;

    .line 106
    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    .line 107
    iget v4, v2, Lt1/k0;->n:I

    iget v6, v2, Lt1/k0;->o:I

    if-eq v4, v6, :cond_d

    if-ne v6, v8, :cond_d

    .line 108
    invoke-virtual {v2}, Lt1/k0;->m0()V

    :cond_d
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_c

    :cond_e
    sget-object v0, Lt1/f;->d:Lt1/f;

    .line 109
    invoke-virtual {v5, v0}, Lt1/k0;->k(Lc9/c;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
