.class public final Lc0/j;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lc0/m;

.field public final synthetic c:Lr1/s;

.field public final synthetic d:Lc9/a;


# direct methods
.method public constructor <init>(Lc0/m;Lr1/s;Lc9/a;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lc0/j;->b:Lc0/m;

    iput-object p2, p0, Lc0/j;->c:Lr1/s;

    iput-object p3, p0, Lc0/j;->d:Lc9/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance p1, Lc0/j;

    iget-object v0, p0, Lc0/j;->c:Lr1/s;

    iget-object v1, p0, Lc0/j;->d:Lc9/a;

    iget-object v2, p0, Lc0/j;->b:Lc0/m;

    invoke-direct {p1, v2, v0, v1, p2}, Lc0/j;-><init>(Lc0/m;Lr1/s;Lc9/a;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lc0/j;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lc0/j;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lc0/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lc0/j;->a:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lc0/j;->b:Lc0/m;

    iget-object v1, p1, Lc0/m;->w:Lc0/h;

    new-instance v4, Lc0/i;

    iget-object v5, p0, Lc0/j;->c:Lr1/s;

    iget-object v6, p0, Lc0/j;->d:Lc9/a;

    invoke-direct {v4, p1, v5, v6}, Lc0/i;-><init>(Lc0/m;Lr1/s;Lc9/a;)V

    iput v3, p0, Lc0/j;->a:I

    check-cast v1, Lv/s;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Lc0/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld1/d;

    if-eqz p1, :cond_8

    iget-wide v5, v1, Lv/s;->D:J

    invoke-virtual {v1, v5, v6, p1}, Lv/s;->I0(JLd1/d;)Z

    move-result p1

    if-nez p1, :cond_8

    new-instance p1, Lm9/l;

    invoke-static {p0}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object v5

    invoke-direct {p1, v3, v5}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {p1}, Lm9/l;->t()V

    new-instance v5, Lv/p;

    invoke-direct {v5, v4, p1}, Lv/p;-><init>(Lc0/i;Lm9/l;)V

    iget-object v6, v1, Lv/s;->y:Lv/l;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Lc0/i;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld1/d;

    if-nez v4, :cond_2

    invoke-virtual {p1, v2}, Lm9/l;->resumeWith(Ljava/lang/Object;)V

    goto :goto_4

    :cond_2
    new-instance v7, Lu/s;

    const/4 v8, 0x3

    invoke-direct {v7, v8, v6, v5}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v7}, Lm9/l;->v(Lc9/c;)V

    new-instance v7, Li9/g;

    iget-object v6, v6, Lv/l;->a:Lo0/i;

    iget v8, v6, Lo0/i;->c:I

    sub-int/2addr v8, v3

    const/4 v9, 0x0

    invoke-direct {v7, v9, v8, v3}, Li9/e;-><init>(III)V

    iget v7, v7, Li9/e;->b:I

    if-ltz v7, :cond_6

    :goto_0
    iget-object v8, v6, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v8, v8, v7

    check-cast v8, Lv/p;

    iget-object v8, v8, Lv/p;->a:Lc9/a;

    invoke-interface {v8}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ld1/d;

    if-nez v8, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4, v8}, Ld1/d;->d(Ld1/d;)Ld1/d;

    move-result-object v10

    invoke-static {v10, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    add-int/2addr v7, v3

    invoke-virtual {v6, v7, v5}, Lo0/i;->b(ILjava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {v10, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    new-instance v8, Ljava/util/concurrent/CancellationException;

    const-string v10, "bringIntoView call interrupted by a newer, non-overlapping call"

    invoke-direct {v8, v10}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    iget v10, v6, Lo0/i;->c:I

    sub-int/2addr v10, v3

    if-gt v10, v7, :cond_5

    :goto_1
    iget-object v11, v6, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v11, v11, v7

    check-cast v11, Lv/p;

    iget-object v11, v11, Lv/p;->b:Lm9/k;

    invoke-interface {v11, v8}, Lm9/k;->l(Ljava/lang/Throwable;)Z

    if-eq v10, v7, :cond_5

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    if-eqz v7, :cond_6

    add-int/lit8 v7, v7, -0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v6, v9, v5}, Lo0/i;->b(ILjava/lang/Object;)V

    :goto_3
    iget-boolean v3, v1, Lv/s;->E:Z

    if-nez v3, :cond_7

    invoke-virtual {v1}, Lv/s;->J0()V

    :cond_7
    :goto_4
    invoke-virtual {p1}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lv8/a;->a:Lv8/a;

    if-ne p1, v1, :cond_8

    goto :goto_5

    :cond_8
    move-object p1, v2

    :goto_5
    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    :goto_6
    return-object v2
.end method
