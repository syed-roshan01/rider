.class public final Lj0/f;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lx/l;

.field public final synthetic d:Lj0/u;


# direct methods
.method public constructor <init>(Lx/l;Lj0/u;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lj0/f;->c:Lx/l;

    iput-object p2, p0, Lj0/f;->d:Lj0/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lj0/f;

    iget-object v1, p0, Lj0/f;->c:Lx/l;

    iget-object v2, p0, Lj0/f;->d:Lj0/u;

    invoke-direct {v0, v1, v2, p2}, Lj0/f;-><init>(Lx/l;Lj0/u;Lu8/e;)V

    iput-object p1, v0, Lj0/f;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lj0/f;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lj0/f;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lj0/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lj0/f;->a:I

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

    iget-object p1, p0, Lj0/f;->b:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    iget-object v1, p0, Lj0/f;->c:Lx/l;

    check-cast v1, Lx/m;

    iget-object v1, v1, Lx/m;->a:Lp9/c0;

    new-instance v3, Lh0/i0;

    iget-object v4, p0, Lj0/f;->d:Lj0/u;

    invoke-direct {v3, v2, v4, p1}, Lh0/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v2, p0, Lj0/f;->a:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3, p0}, Lp9/c0;->k(Lp9/c0;Lp9/g;Lu8/e;)Lv8/a;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
