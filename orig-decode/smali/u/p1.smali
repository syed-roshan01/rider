.class public final Lu/p1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lu/q1;


# direct methods
.method public constructor <init>(Lu/q1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu/p1;->b:Lu/q1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 1

    new-instance p1, Lu/p1;

    iget-object v0, p0, Lu/p1;->b:Lu/q1;

    invoke-direct {p1, v0, p2}, Lu/p1;-><init>(Lu/q1;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lu/p1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lu/p1;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lu/p1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lu/p1;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    sget-object p1, Lu/r;->d:Lu/r;

    iput v2, p0, Lu/p1;->a:I

    invoke-interface {p0}, Lu8/e;->getContext()Lu8/j;

    move-result-object v1

    invoke-static {v1}, Ld9/i;->p(Lu8/j;)Lm0/a1;

    move-result-object v1

    new-instance v2, Lt/k1;

    const/4 v3, 0x3

    invoke-direct {v2, v3, p1}, Lt/k1;-><init>(ILc9/c;)V

    invoke-interface {v1, v2, p0}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lu/p1;->b:Lu/q1;

    iget-object p1, p1, Lu/q1;->G:Lu/c2;

    if-eqz p1, :cond_3

    check-cast p1, Lu/e2;

    invoke-virtual {p1}, Lu/e2;->d()V

    :cond_3
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
