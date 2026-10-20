.class public final Lt/q0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Number;Lt/k0;Ljava/lang/Number;Lt/j0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lt/q0;->a:I

    iput-object p1, p0, Lt/q0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lt/q0;->d:Ljava/lang/Object;

    iput-object p3, p0, Lt/q0;->c:Ljava/lang/Object;

    iput-object p4, p0, Lt/q0;->e:Ljava/lang/Object;

    .line 1
    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lt/q0;->a:I

    iput-object p1, p0, Lt/q0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lt/q0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lt/q0;->d:Ljava/lang/Object;

    iput-object p4, p0, Lt/q0;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lt/q0;->a:I

    packed-switch v1, :pswitch_data_0

    .line 1
    invoke-virtual {p0}, Lt/q0;->invoke()V

    return-object v0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Lt/q0;->invoke()V

    return-object v0

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Lt/q0;->invoke()V

    return-object v0

    .line 4
    :pswitch_2
    invoke-virtual {p0}, Lt/q0;->invoke()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()V
    .locals 11

    iget v0, p0, Lt/q0;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lt/q0;->d:Ljava/lang/Object;

    iget-object v4, p0, Lt/q0;->e:Ljava/lang/Object;

    iget-object v5, p0, Lt/q0;->c:Ljava/lang/Object;

    iget-object v6, p0, Lt/q0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v6, Ljava/util/Map;

    check-cast v5, Lcom/auto/accept/data/model/SupportedApp;

    .line 5
    invoke-virtual {v5}, Lcom/auto/accept/data/model/SupportedApp;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    invoke-virtual {v5}, Lcom/auto/accept/data/model/SupportedApp;->getPackageKeywords()Ljava/util/List;

    move-result-object v0

    .line 6
    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    check-cast v4, Landroid/content/pm/PackageManager;

    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    .line 8
    :try_start_0
    invoke-virtual {v4, v6, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    move-object v5, v1

    .line 9
    :goto_0
    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_2

    .line 10
    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    :try_start_1
    check-cast v3, Landroid/content/Context;

    .line 11
    invoke-virtual {v3, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_3
    return-void

    :pswitch_0
    check-cast v6, Lo2/p;

    check-cast v5, Lc9/a;

    check-cast v3, Lo2/o;

    check-cast v4, Lm2/l;

    .line 12
    invoke-virtual {v6, v5, v3, v4}, Lo2/p;->e(Lc9/a;Lo2/o;Lm2/l;)V

    return-void

    :pswitch_1
    check-cast v6, Lm0/q;

    .line 13
    iget-object v0, v6, Lm0/q;->L:Ln0/b;

    check-cast v5, Ln0/a;

    check-cast v3, Lm0/m2;

    check-cast v4, Lm0/c1;

    .line 14
    iget-object v7, v0, Ln0/b;->b:Ln0/a;

    .line 15
    :try_start_2
    iput-object v5, v0, Ln0/b;->b:Ln0/a;

    .line 16
    iget-object v5, v6, Lm0/q;->F:Lm0/m2;

    .line 17
    iget-object v8, v6, Lm0/q;->n:[I

    .line 18
    iget-object v9, v6, Lm0/q;->u:Lo0/e;

    .line 19
    iput-object v1, v6, Lm0/q;->n:[I

    .line 20
    iput-object v1, v6, Lm0/q;->u:Lo0/e;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 21
    :try_start_3
    iput-object v3, v6, Lm0/q;->F:Lm0/m2;

    .line 22
    iget-boolean v1, v0, Ln0/b;->e:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 23
    :try_start_4
    iput-boolean v2, v0, Ln0/b;->e:Z

    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-static {v6, v2, v3}, Lm0/q;->b(Lm0/q;Lm0/r1;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 28
    :try_start_5
    iput-boolean v1, v0, Ln0/b;->e:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 29
    :try_start_6
    iput-object v5, v6, Lm0/q;->F:Lm0/m2;

    .line 30
    iput-object v8, v6, Lm0/q;->n:[I

    .line 31
    iput-object v9, v6, Lm0/q;->u:Lo0/e;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 32
    iput-object v7, v0, Ln0/b;->b:Ln0/a;

    return-void

    :catchall_0
    move-exception v2

    .line 33
    :try_start_7
    iput-boolean v1, v0, Ln0/b;->e:Z

    .line 34
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v1

    .line 35
    :try_start_8
    iput-object v5, v6, Lm0/q;->F:Lm0/m2;

    .line 36
    iput-object v8, v6, Lm0/q;->n:[I

    .line 37
    iput-object v9, v6, Lm0/q;->u:Lo0/e;

    .line 38
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v1

    .line 39
    iput-object v7, v0, Ln0/b;->b:Ln0/a;

    .line 40
    throw v1

    :pswitch_2
    check-cast v3, Lt/k0;

    .line 41
    iget-object v0, v3, Lt/k0;->a:Ljava/lang/Object;

    .line 42
    invoke-static {v6, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 43
    iget-object v0, v3, Lt/k0;->b:Ljava/lang/Object;

    .line 44
    invoke-static {v5, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    iget-object v8, p0, Lt/q0;->b:Ljava/lang/Object;

    iget-object v9, p0, Lt/q0;->c:Ljava/lang/Object;

    move-object v6, v4

    check-cast v6, Lt/j0;

    .line 45
    iput-object v8, v3, Lt/k0;->a:Ljava/lang/Object;

    .line 46
    iput-object v9, v3, Lt/k0;->b:Ljava/lang/Object;

    .line 47
    new-instance v0, Lt/l1;

    .line 48
    iget-object v7, v3, Lt/k0;->c:Lt/x1;

    const/4 v10, 0x0

    move-object v5, v0

    .line 49
    invoke-direct/range {v5 .. v10}, Lt/l1;-><init>(Lt/n;Lt/x1;Ljava/lang/Object;Ljava/lang/Object;Lt/t;)V

    .line 50
    iput-object v0, v3, Lt/k0;->e:Lt/l1;

    .line 51
    iget-object v0, v3, Lt/k0;->p:Lt/p0;

    iget-object v0, v0, Lt/p0;->b:Lm0/n1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 52
    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    .line 53
    iput-boolean v2, v3, Lt/k0;->f:Z

    const/4 v0, 0x1

    .line 54
    iput-boolean v0, v3, Lt/k0;->n:Z

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
