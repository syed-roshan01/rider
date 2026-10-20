.class public final Lh0/j0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lm0/l3;

.field public final synthetic d:Lt/d;


# direct methods
.method public constructor <init>(Lm0/l3;Lt/d;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lh0/j0;->c:Lm0/l3;

    iput-object p2, p0, Lh0/j0;->d:Lt/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lh0/j0;

    iget-object v1, p0, Lh0/j0;->c:Lm0/l3;

    iget-object v2, p0, Lh0/j0;->d:Lt/d;

    invoke-direct {v0, v1, v2, p2}, Lh0/j0;-><init>(Lm0/l3;Lt/d;Lu8/e;)V

    iput-object p1, v0, Lh0/j0;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lh0/j0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lh0/j0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lh0/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lh0/j0;->a:I

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

    iget-object p1, p0, Lh0/j0;->b:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    new-instance v1, Lz/o;

    iget-object v3, p0, Lh0/j0;->c:Lm0/l3;

    const/4 v4, 0x4

    invoke-direct {v1, v3, v4}, Lz/o;-><init>(Lm0/l3;I)V

    invoke-static {v1}, Ld7/t;->t0(Lc9/a;)La4/c0;

    move-result-object v1

    new-instance v3, Lh0/i0;

    iget-object v4, p0, Lh0/j0;->d:Lt/d;

    const/4 v5, 0x0

    invoke-direct {v3, v5, v4, p1}, Lh0/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v2, p0, Lh0/j0;->a:I

    invoke-virtual {v1, v3, p0}, La4/c0;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
