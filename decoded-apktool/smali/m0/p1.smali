.class public final Lm0/p1;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/a1;


# instance fields
.field public final a:Lm0/a1;

.field public final b:Lm0/x0;


# direct methods
.method public constructor <init>(Lm0/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/p1;->a:Lm0/a1;

    new-instance p1, Lm0/x0;

    invoke-direct {p1}, Lm0/x0;-><init>()V

    iput-object p1, p0, Lm0/p1;->b:Lm0/x0;

    return-void
.end method


# virtual methods
.method public final O(Lu8/j;)Lu8/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ld7/a;->A(Lu8/j;Lu8/j;)Lu8/j;

    move-result-object p1

    return-object p1
.end method

.method public final T(Lc9/c;Lu8/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lm0/o1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lm0/o1;

    iget v1, v0, Lm0/o1;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm0/o1;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm0/o1;

    invoke-direct {v0, p0, p2}, Lm0/o1;-><init>(Lm0/p1;Lu8/e;)V

    :goto_0
    iget-object p2, v0, Lm0/o1;->c:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lm0/o1;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lm0/o1;->b:Lc9/c;

    iget-object v2, v0, Lm0/o1;->a:Lm0/p1;

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p2, p0, Lm0/p1;->b:Lm0/x0;

    iput-object p0, v0, Lm0/o1;->a:Lm0/p1;

    iput-object p1, v0, Lm0/o1;->b:Lc9/c;

    iput v4, v0, Lm0/o1;->e:I

    iget-object v2, p2, Lm0/x0;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-boolean v5, p2, Lm0/x0;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v2

    if-eqz v5, :cond_4

    sget-object p2, Lq8/l;->a:Lq8/l;

    goto :goto_1

    :cond_4
    new-instance v2, Lm9/l;

    invoke-static {v0}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v2}, Lm9/l;->t()V

    iget-object v4, p2, Lm0/x0;->a:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    iget-object v5, p2, Lm0/x0;->b:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    new-instance v4, Lu/s;

    const/16 v5, 0x10

    invoke-direct {v4, v5, p2, v2}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Lm9/l;->v(Lc9/c;)V

    invoke-virtual {v2}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_1

    :cond_5
    sget-object p2, Lq8/l;->a:Lq8/l;

    :goto_1
    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p0

    :goto_2
    iget-object p2, v2, Lm0/p1;->a:Lm0/a1;

    const/4 v2, 0x0

    iput-object v2, v0, Lm0/o1;->a:Lm0/p1;

    iput-object v2, v0, Lm0/o1;->b:Lc9/c;

    iput v3, v0, Lm0/o1;->e:I

    invoke-interface {p2, p1, v0}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    :goto_3
    return-object p2

    :catchall_0
    move-exception p1

    monitor-exit v4

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v2

    throw p1
.end method

.method public final e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lu8/i;)Lu8/h;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->D(Lu8/h;Lu8/i;)Lu8/h;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lu8/i;)Lu8/j;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->V(Lu8/h;Lu8/i;)Lu8/j;

    move-result-object p1

    return-object p1
.end method
