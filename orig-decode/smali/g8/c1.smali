.class public final Lg8/c1;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/j0;


# instance fields
.field public final a:Lg8/j0;

.field public volatile b:Z

.field public c:Ljava/util/List;


# direct methods
.method public constructor <init>(Lg8/j0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg8/c1;->c:Ljava/util/List;

    iput-object p1, p0, Lg8/c1;->a:Lg8/j0;

    return-void
.end method


# virtual methods
.method public final a(Lg8/a6;)V
    .locals 2

    iget-boolean v0, p0, Lg8/c1;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/c1;->a:Lg8/j0;

    invoke-interface {v0, p1}, Lg8/b6;->a(Lg8/a6;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lg8/x1;

    const/16 v1, 0xf

    invoke-direct {v0, v1, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lg8/c1;->e(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget-boolean v0, p0, Lg8/c1;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/c1;->a:Lg8/j0;

    invoke-interface {v0}, Lg8/b6;->b()V

    goto :goto_0

    :cond_0
    new-instance v0, Lg8/t0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lg8/c1;->e(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final c(Le8/c2;Lg8/i0;Le8/l1;)V
    .locals 7

    new-instance v6, Lk/e;

    const/4 v5, 0x7

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lk/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v6}, Lg8/c1;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(Le8/l1;)V
    .locals 2

    new-instance v0, Lg8/x1;

    const/16 v1, 0x10

    invoke-direct {v0, v1, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lg8/c1;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Ljava/lang/Runnable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lg8/c1;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lg8/c1;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
