.class public final Lm0/f3;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lu8/j;

.field public final synthetic d:Lp9/f;


# direct methods
.method public constructor <init>(Lu8/j;Lp9/f;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lm0/f3;->c:Lu8/j;

    iput-object p2, p0, Lm0/f3;->d:Lp9/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lm0/f3;

    iget-object v1, p0, Lm0/f3;->c:Lu8/j;

    iget-object v2, p0, Lm0/f3;->d:Lp9/f;

    invoke-direct {v0, v1, v2, p2}, Lm0/f3;-><init>(Lu8/j;Lp9/f;Lu8/e;)V

    iput-object p1, v0, Lm0/f3;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm0/t1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lm0/f3;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lm0/f3;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lm0/f3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lm0/f3;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lm0/f3;->b:Ljava/lang/Object;

    check-cast p1, Lm0/t1;

    sget-object v1, Lu8/k;->a:Lu8/k;

    iget-object v4, p0, Lm0/f3;->c:Lu8/j;

    invoke-static {v4, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iget-object v5, p0, Lm0/f3;->d:Lp9/f;

    if-eqz v1, :cond_3

    new-instance v1, Lm0/d3;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lm0/d3;-><init>(Lm0/t1;I)V

    iput v3, p0, Lm0/f3;->a:I

    invoke-interface {v5, v1, p0}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_3
    new-instance v1, Lm0/e3;

    const/4 v3, 0x0

    invoke-direct {v1, v5, p1, v3}, Lm0/e3;-><init>(Lp9/f;Lm0/t1;Lu8/e;)V

    iput v2, p0, Lm0/f3;->a:I

    invoke-static {v4, v1, p0}, Lz6/a;->u0(Lu8/j;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
