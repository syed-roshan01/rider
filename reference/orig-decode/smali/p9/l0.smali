.class public final Lp9/l0;
.super Lw8/i;

# interfaces
.implements Lc9/f;


# instance fields
.field public a:I

.field public synthetic b:Lp9/g;

.field public synthetic c:I

.field public final synthetic d:Lp9/n0;


# direct methods
.method public constructor <init>(Lp9/n0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lp9/l0;->d:Lp9/n0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lp9/g;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lu8/e;

    new-instance v0, Lp9/l0;

    iget-object v1, p0, Lp9/l0;->d:Lp9/n0;

    invoke-direct {v0, v1, p3}, Lp9/l0;-><init>(Lp9/n0;Lu8/e;)V

    iput-object p1, v0, Lp9/l0;->b:Lp9/g;

    iput p2, v0, Lp9/l0;->c:I

    sget-object p1, Lq8/l;->a:Lq8/l;

    invoke-virtual {v0, p1}, Lp9/l0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lp9/l0;->a:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    iget-object v7, p0, Lp9/l0;->d:Lp9/n0;

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lp9/l0;->b:Lp9/g;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lp9/l0;->b:Lp9/g;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lp9/l0;->b:Lp9/g;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v1, p0, Lp9/l0;->b:Lp9/g;

    iget p1, p0, Lp9/l0;->c:I

    if-lez p1, :cond_6

    sget-object p1, Lp9/f0;->a:Lp9/f0;

    iput v6, p0, Lp9/l0;->a:I

    invoke-interface {v1, p1, p0}, Lp9/g;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_6
    iget-wide v8, v7, Lp9/n0;->a:J

    iput-object v1, p0, Lp9/l0;->b:Lp9/g;

    iput v5, p0, Lp9/l0;->a:I

    invoke-static {v8, v9, p0}, Ld7/t;->P(JLu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_1
    iget-wide v5, v7, Lp9/n0;->b:J

    const-wide/16 v8, 0x0

    cmp-long p1, v5, v8

    if-lez p1, :cond_9

    sget-object p1, Lp9/f0;->b:Lp9/f0;

    iput-object v1, p0, Lp9/l0;->b:Lp9/g;

    iput v4, p0, Lp9/l0;->a:I

    invoke-interface {v1, p1, p0}, Lp9/g;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    iget-wide v4, v7, Lp9/n0;->b:J

    iput-object v1, p0, Lp9/l0;->b:Lp9/g;

    iput v3, p0, Lp9/l0;->a:I

    invoke-static {v4, v5, p0}, Ld7/t;->P(JLu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    :goto_3
    sget-object p1, Lp9/f0;->c:Lp9/f0;

    const/4 v3, 0x0

    iput-object v3, p0, Lp9/l0;->b:Lp9/g;

    iput v2, p0, Lp9/l0;->a:I

    invoke-interface {v1, p1, p0}, Lp9/g;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_4
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
