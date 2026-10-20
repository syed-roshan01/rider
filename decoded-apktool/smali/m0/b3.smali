.class public final Lm0/b3;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lc9/e;

.field public final synthetic d:Lm0/g1;


# direct methods
.method public constructor <init>(Lc9/e;Lm0/g1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lm0/b3;->c:Lc9/e;

    iput-object p2, p0, Lm0/b3;->d:Lm0/g1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lm0/b3;

    iget-object v1, p0, Lm0/b3;->c:Lc9/e;

    iget-object v2, p0, Lm0/b3;->d:Lm0/g1;

    invoke-direct {v0, v1, v2, p2}, Lm0/b3;-><init>(Lc9/e;Lm0/g1;Lu8/e;)V

    iput-object p1, v0, Lm0/b3;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lm0/b3;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lm0/b3;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lm0/b3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lm0/b3;->a:I

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

    iget-object p1, p0, Lm0/b3;->b:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    new-instance v1, Lm0/t1;

    iget-object v3, p0, Lm0/b3;->d:Lm0/g1;

    invoke-interface {p1}, Lm9/d0;->q()Lu8/j;

    move-result-object p1

    invoke-direct {v1, v3, p1}, Lm0/t1;-><init>(Lm0/g1;Lu8/j;)V

    iput v2, p0, Lm0/b3;->a:I

    iget-object p1, p0, Lm0/b3;->c:Lc9/e;

    invoke-interface {p1, v1, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
