.class public final Lv/a1;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lu8/j;

.field public final synthetic e:Lc9/e;


# direct methods
.method public constructor <init>(Lu8/j;Lc9/e;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/a1;->d:Lu8/j;

    iput-object p2, p0, Lv/a1;->e:Lc9/e;

    invoke-direct {p0, p3}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lv/a1;

    iget-object v1, p0, Lv/a1;->d:Lu8/j;

    iget-object v2, p0, Lv/a1;->e:Lc9/e;

    invoke-direct {v0, v1, v2, p2}, Lv/a1;-><init>(Lu8/j;Lc9/e;Lu8/e;)V

    iput-object p1, v0, Lv/a1;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/a1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/a1;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/a1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/a1;->b:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lv/a1;->c:Ljava/lang/Object;

    check-cast v1, Lo1/h0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lv/a1;->c:Ljava/lang/Object;

    check-cast v1, Lo1/h0;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object p1, v1

    goto :goto_1

    :catch_0
    move-exception p1

    move-object v5, v1

    move-object v1, p0

    goto :goto_4

    :cond_2
    iget-object v1, p0, Lv/a1;->c:Ljava/lang/Object;

    check-cast v1, Lo1/h0;

    :try_start_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    move-object p1, p0

    goto :goto_3

    :cond_3
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/a1;->c:Ljava/lang/Object;

    check-cast p1, Lo1/h0;

    :goto_1
    move-object v1, p0

    :goto_2
    iget-object v5, v1, Lv/a1;->d:Lu8/j;

    invoke-static {v5}, Lh6/g;->o0(Lu8/j;)Z

    move-result v5

    if-eqz v5, :cond_8

    :try_start_2
    iget-object v5, v1, Lv/a1;->e:Lc9/e;

    iput-object p1, v1, Lv/a1;->c:Ljava/lang/Object;

    iput v4, v1, Lv/a1;->b:I

    invoke-interface {v5, p1, v1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    if-ne v5, v0, :cond_4

    return-object v0

    :cond_4
    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    :goto_3
    :try_start_3
    iput-object v1, p1, Lv/a1;->c:Ljava/lang/Object;

    iput v3, p1, Lv/a1;->b:I

    invoke-static {v1, p1}, Lm9/e0;->p(Lo1/h0;Lu8/e;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    if-ne v5, v0, :cond_5

    return-object v0

    :cond_5
    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    goto :goto_2

    :catch_1
    move-exception v5

    move-object v7, v1

    move-object v1, p1

    move-object p1, v5

    move-object v5, v7

    goto :goto_4

    :catch_2
    move-exception v5

    move-object v7, v5

    move-object v5, p1

    move-object p1, v7

    :goto_4
    iget-object v6, v1, Lv/a1;->d:Lu8/j;

    invoke-static {v6}, Lh6/g;->o0(Lu8/j;)Z

    move-result v6

    if-eqz v6, :cond_7

    iput-object v5, v1, Lv/a1;->c:Ljava/lang/Object;

    iput v2, v1, Lv/a1;->b:I

    invoke-static {v5, v1}, Lm9/e0;->p(Lo1/h0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    move-object p1, v5

    goto :goto_2

    :cond_7
    throw p1

    :cond_8
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
