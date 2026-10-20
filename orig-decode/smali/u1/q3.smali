.class public final Lu1/q3;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ld9/u;

.field public final synthetic d:Lm0/g2;

.field public final synthetic e:Landroidx/lifecycle/w;

.field public final synthetic f:Lu1/r3;

.field public final synthetic n:Landroid/view/View;


# direct methods
.method public constructor <init>(Ld9/u;Lm0/g2;Landroidx/lifecycle/w;Lu1/r3;Landroid/view/View;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu1/q3;->c:Ld9/u;

    iput-object p2, p0, Lu1/q3;->d:Lm0/g2;

    iput-object p3, p0, Lu1/q3;->e:Landroidx/lifecycle/w;

    iput-object p4, p0, Lu1/q3;->f:Lu1/r3;

    iput-object p5, p0, Lu1/q3;->n:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 8

    new-instance v7, Lu1/q3;

    iget-object v1, p0, Lu1/q3;->c:Ld9/u;

    iget-object v2, p0, Lu1/q3;->d:Lm0/g2;

    iget-object v3, p0, Lu1/q3;->e:Landroidx/lifecycle/w;

    iget-object v4, p0, Lu1/q3;->f:Lu1/r3;

    iget-object v5, p0, Lu1/q3;->n:Landroid/view/View;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lu1/q3;-><init>(Ld9/u;Lm0/g2;Landroidx/lifecycle/w;Lu1/r3;Landroid/view/View;Lu8/e;)V

    iput-object p1, v7, Lu1/q3;->b:Ljava/lang/Object;

    return-object v7
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lu1/q3;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lu1/q3;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lu1/q3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lu1/q3;->a:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x0

    iget-object v4, p0, Lu1/q3;->f:Lu1/r3;

    iget-object v5, p0, Lu1/q3;->e:Landroidx/lifecycle/w;

    const/4 v6, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v6, :cond_0

    iget-object v0, p0, Lu1/q3;->b:Ljava/lang/Object;

    check-cast v0, Lm9/f1;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lu1/q3;->b:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    :try_start_1
    iget-object v1, p0, Lu1/q3;->c:Ld9/u;

    iget-object v1, v1, Ld9/u;->a:Ljava/lang/Object;

    check-cast v1, Lu1/h2;

    if-eqz v1, :cond_2

    iget-object v7, p0, Lu1/q3;->n:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7}, Lu1/u3;->a(Landroid/content/Context;)Lp9/o0;

    move-result-object v7

    invoke-interface {v7}, Lp9/o0;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    iget-object v9, v1, Lu1/h2;->a:Lm0/k1;

    invoke-virtual {v9, v8}, Lm0/s2;->f(F)V

    new-instance v8, Lu1/p3;

    invoke-direct {v8, v7, v1, v3}, Lu1/p3;-><init>(Lp9/o0;Lu1/h2;Lu8/e;)V

    const/4 v1, 0x0

    const/4 v7, 0x3

    invoke-static {p1, v3, v1, v8, v7}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :goto_0
    move-object v0, v3

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_0

    :cond_2
    move-object p1, v3

    :goto_1
    :try_start_2
    iget-object v1, p0, Lu1/q3;->d:Lm0/g2;

    iput-object p1, p0, Lu1/q3;->b:Ljava/lang/Object;

    iput v6, p0, Lu1/q3;->a:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lm0/f2;

    invoke-direct {v6, v1, v3}, Lm0/f2;-><init>(Lm0/g2;Lu8/e;)V

    invoke-interface {p0}, Lu8/e;->getContext()Lu8/j;

    move-result-object v7

    invoke-static {v7}, Ld9/i;->p(Lu8/j;)Lm0/a1;

    move-result-object v7

    new-instance v8, Lm0/d2;

    invoke-direct {v8, v1, v6, v7, v3}, Lm0/d2;-><init>(Lm0/g2;Lc9/f;Lm0/a1;Lu8/e;)V

    iget-object v1, v1, Lm0/g2;->a:Lm0/g;

    invoke-static {v1, v8, p0}, Lz6/a;->u0(Lu8/j;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v1, v0, :cond_3

    goto :goto_2

    :cond_3
    move-object v1, v2

    :goto_2
    if-ne v1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v1, v2

    :goto_3
    if-ne v1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v0, p1

    :goto_4
    if-eqz v0, :cond_6

    invoke-interface {v0, v3}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_6
    invoke-interface {v5}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    return-object v2

    :goto_5
    move-object v10, v0

    move-object v0, p1

    move-object p1, v10

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_5

    :goto_6
    if-eqz v0, :cond_7

    invoke-interface {v0, v3}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    invoke-interface {v5}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    throw p1
.end method
