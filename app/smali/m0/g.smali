.class public final Lm0/g;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/a1;


# instance fields
.field public final a:Lc9/a;

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Throwable;

.field public d:Ljava/util/List;

.field public e:Ljava/util/List;


# direct methods
.method public constructor <init>(Lt/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/g;->a:Lc9/a;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/g;->b:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm0/g;->d:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm0/g;->e:Ljava/util/List;

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

    new-instance v0, Lm9/l;

    invoke-static {p2}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    new-instance p2, Ld9/u;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lm0/g;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lm0/g;->c:Ljava/lang/Throwable;

    if-eqz v2, :cond_0

    invoke-static {v2}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Lm9/l;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :try_start_1
    new-instance v2, Lm0/f;

    invoke-direct {v2, p1, v0}, Lm0/f;-><init>(Lc9/c;Lm9/l;)V

    iput-object v2, p2, Ld9/u;->a:Ljava/lang/Object;

    iget-object p1, p0, Lm0/g;->d:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    iget-object v2, p0, Lm0/g;->d:Ljava/util/List;

    iget-object v3, p2, Ld9/u;->a:Ljava/lang/Object;

    if-eqz v3, :cond_4

    check-cast v3, Lm0/f;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    new-instance v1, Lu/s;

    const/16 v2, 0xf

    invoke-direct {v1, v2, p0, p2}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lm9/l;->v(Lc9/c;)V

    if-eqz p1, :cond_3

    iget-object p1, p0, Lm0/g;->a:Lc9/a;

    if-eqz p1, :cond_3

    :try_start_2
    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    iget-object p2, p0, Lm0/g;->b:Ljava/lang/Object;

    monitor-enter p2

    :try_start_3
    iget-object v1, p0, Lm0/g;->c:Ljava/lang/Throwable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v1, :cond_1

    monitor-exit p2

    goto :goto_2

    :cond_1
    :try_start_4
    iput-object p1, p0, Lm0/g;->c:Ljava/lang/Throwable;

    iget-object v1, p0, Lm0/g;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/f;

    iget-object v4, v4, Lm0/f;->b:Lu8/e;

    invoke-static {p1}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object v5

    invoke-interface {v4, v5}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_2
    move-exception p1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lm0/g;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2

    throw p1

    :cond_3
    :goto_2
    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    return-object p1

    :cond_4
    :try_start_5
    const-string p1, "awaiter"

    invoke-static {p1}, Ld7/a;->D(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_3
    monitor-exit v1

    throw p1
.end method

.method public final c(J)V
    .locals 7

    iget-object v0, p0, Lm0/g;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm0/g;->d:Ljava/util/List;

    iget-object v2, p0, Lm0/g;->e:Ljava/util/List;

    iput-object v2, p0, Lm0/g;->d:Ljava/util/List;

    iput-object v1, p0, Lm0/g;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/f;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v5, v4, Lm0/f;->a:Lc9/c;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v5, v6}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v5

    :try_start_2
    invoke-static {v5}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object v5

    :goto_1
    iget-object v4, v4, Lm0/f;->b:Lu8/e;

    invoke-interface {v4, v5}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

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
