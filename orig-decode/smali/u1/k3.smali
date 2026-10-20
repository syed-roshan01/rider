.class public final Lu1/k3;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lm0/g2;

.field public final synthetic c:Landroid/view/View;


# direct methods
.method public constructor <init>(Lm0/g2;Landroid/view/View;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu1/k3;->b:Lm0/g2;

    iput-object p2, p0, Lu1/k3;->c:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance p1, Lu1/k3;

    iget-object v0, p0, Lu1/k3;->b:Lm0/g2;

    iget-object v1, p0, Lu1/k3;->c:Landroid/view/View;

    invoke-direct {p1, v0, v1, p2}, Lu1/k3;-><init>(Lm0/g2;Landroid/view/View;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lu1/k3;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lu1/k3;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lu1/k3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lu1/k3;->a:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    const v3, 0x7f080040

    const/4 v4, 0x0

    const/4 v5, 0x1

    iget-object v6, p0, Lu1/k3;->b:Lm0/g2;

    iget-object v7, p0, Lu1/k3;->c:Landroid/view/View;

    if-eqz v1, :cond_1

    if-ne v1, v5, :cond_0

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    :try_start_1
    iput v5, p0, Lu1/k3;->a:I

    iget-object p1, v6, Lm0/g2;->r:Lp9/q0;

    new-instance v1, Lm0/b2;

    const/4 v5, 0x2

    invoke-direct {v1, v5, v4}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {p1, v1, p0}, Lh6/g;->W(Lp9/f;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    invoke-static {v7}, Lu1/u3;->b(Landroid/view/View;)Lm0/u;

    move-result-object p1

    if-ne p1, v6, :cond_4

    invoke-virtual {v7, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    return-object v2

    :goto_2
    invoke-static {v7}, Lu1/u3;->b(Landroid/view/View;)Lm0/u;

    move-result-object v0

    if-ne v0, v6, :cond_5

    invoke-virtual {v7, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_5
    throw p1
.end method
