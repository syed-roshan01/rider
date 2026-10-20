.class public final Li4/k;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ls4/j;

.field public final synthetic d:Li4/o;


# direct methods
.method public constructor <init>(Li4/o;Ls4/j;Lu8/e;)V
    .locals 0

    iput-object p2, p0, Li4/k;->c:Ls4/j;

    iput-object p1, p0, Li4/k;->d:Li4/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Li4/k;

    iget-object v1, p0, Li4/k;->c:Ls4/j;

    iget-object v2, p0, Li4/k;->d:Li4/o;

    invoke-direct {v0, v2, v1, p2}, Li4/k;-><init>(Li4/o;Ls4/j;Lu8/e;)V

    iput-object p1, v0, Li4/k;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Li4/k;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Li4/k;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Li4/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Li4/k;->a:I

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

    iget-object p1, p0, Li4/k;->b:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    sget-object v1, Lm9/m0;->a:Lt9/d;

    sget-object v1, Lr9/o;->a:Lm9/s1;

    check-cast v1, Ln9/d;

    iget-object v1, v1, Ln9/d;->f:Ln9/d;

    new-instance v3, Li4/j;

    iget-object v4, p0, Li4/k;->d:Li4/o;

    iget-object v5, p0, Li4/k;->c:Ls4/j;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Li4/j;-><init>(Li4/o;Ls4/j;Lu8/e;)V

    const/4 v4, 0x2

    invoke-static {p1, v1, v3, v4}, Lz6/a;->e(Lm9/d0;Ln9/d;Lc9/e;I)Lm9/i0;

    move-result-object p1

    iget-object v1, v5, Ls4/j;->c:Lu4/a;

    iput v2, p0, Li4/k;->a:I

    invoke-virtual {p1, p0}, Lm9/p1;->y(Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method
