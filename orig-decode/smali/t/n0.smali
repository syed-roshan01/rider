.class public final Lt/n0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Ld9/r;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lm0/g1;

.field public final synthetic e:Lt/p0;


# direct methods
.method public constructor <init>(Lm0/g1;Lt/p0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lt/n0;->d:Lm0/g1;

    iput-object p2, p0, Lt/n0;->e:Lt/p0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lt/n0;

    iget-object v1, p0, Lt/n0;->d:Lm0/g1;

    iget-object v2, p0, Lt/n0;->e:Lt/p0;

    invoke-direct {v0, v1, v2, p2}, Lt/n0;-><init>(Lm0/g1;Lt/p0;Lu8/e;)V

    iput-object p1, v0, Lt/n0;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lt/n0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lt/n0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lt/n0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lt/n0;->b:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v1, p0, Lt/n0;->a:Ld9/r;

    iget-object v4, p0, Lt/n0;->c:Ljava/lang/Object;

    check-cast v4, Lm9/d0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object p1, v4

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lt/n0;->a:Ld9/r;

    iget-object v4, p0, Lt/n0;->c:Ljava/lang/Object;

    check-cast v4, Lm9/d0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object p1, v4

    move-object v4, p0

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lt/n0;->c:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    new-instance v1, Ld9/r;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, v1, Ld9/r;->a:F

    :goto_0
    move-object v4, p0

    :cond_3
    new-instance v11, Lt/a;

    iget-object v6, v4, Lt/n0;->d:Lm0/g1;

    iget-object v7, v4, Lt/n0;->e:Lt/p0;

    const/4 v10, 0x1

    move-object v5, v11

    move-object v8, v1

    move-object v9, p1

    invoke-direct/range {v5 .. v10}, Lt/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object p1, v4, Lt/n0;->c:Ljava/lang/Object;

    iput-object v1, v4, Lt/n0;->a:Ld9/r;

    iput v2, v4, Lt/n0;->b:I

    invoke-interface {v4}, Lu8/e;->getContext()Lu8/j;

    move-result-object v5

    sget-object v6, Lu1/c2;->a:Lu1/c2;

    invoke-interface {v5, v6}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v5

    invoke-static {v5}, Lt/k;->d(Lu8/h;)V

    invoke-interface {v4}, Lu8/e;->getContext()Lu8/j;

    move-result-object v5

    invoke-static {v5}, Ld9/i;->p(Lu8/j;)Lm0/a1;

    move-result-object v5

    invoke-interface {v5, v11, v4}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iget v5, v1, Ld9/r;->a:F

    const/4 v6, 0x0

    cmpg-float v5, v5, v6

    if-nez v5, :cond_3

    new-instance v5, Lt/l0;

    const/4 v6, 0x0

    invoke-direct {v5, p1, v6}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v5}, Ld7/t;->t0(Lc9/a;)La4/c0;

    move-result-object v5

    new-instance v6, Lt/m0;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v7}, Lw8/i;-><init>(ILu8/e;)V

    iput-object p1, v4, Lt/n0;->c:Ljava/lang/Object;

    iput-object v1, v4, Lt/n0;->a:Ld9/r;

    iput v3, v4, Lt/n0;->b:I

    invoke-static {v5, v6, v4}, Lh6/g;->W(Lp9/f;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_3

    return-object v0
.end method
