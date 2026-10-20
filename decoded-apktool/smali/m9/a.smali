.class public abstract Lm9/a;
.super Lm9/p1;

# interfaces
.implements Lu8/e;
.implements Lm9/d0;


# instance fields
.field public final c:Lu8/j;


# direct methods
.method public constructor <init>(Lu8/j;Z)V
    .locals 0

    invoke-direct {p0, p2}, Lm9/p1;-><init>(Z)V

    sget-object p2, Lm9/a0;->b:Lm9/a0;

    invoke-interface {p1, p2}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object p2

    check-cast p2, Lm9/f1;

    invoke-virtual {p0, p2}, Lm9/p1;->S(Lm9/f1;)V

    invoke-interface {p1, p0}, Lu8/j;->O(Lu8/j;)Lu8/j;

    move-result-object p1

    iput-object p1, p0, Lm9/a;->c:Lu8/j;

    return-void
.end method


# virtual methods
.method public final C()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final R(Landroidx/fragment/app/a0;)V
    .locals 1

    iget-object v0, p0, Lm9/a;->c:Lu8/j;

    invoke-static {v0, p1}, Lh6/g;->n0(Lu8/j;Ljava/lang/Throwable;)V

    return-void
.end method

.method public Z()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lm9/p1;->Z()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    invoke-super {p0}, Lm9/p1;->b()Z

    move-result v0

    return v0
.end method

.method public final c0(Ljava/lang/Object;)V
    .locals 2

    instance-of v0, p1, Lm9/u;

    if-eqz v0, :cond_1

    check-cast p1, Lm9/u;

    iget-object v0, p1, Lm9/u;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lm9/u;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, v0, p1}, Lm9/a;->i0(Ljava/lang/Throwable;Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, Lm9/a;->j0(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final getContext()Lu8/j;
    .locals 1

    iget-object v0, p0, Lm9/a;->c:Lu8/j;

    return-object v0
.end method

.method public i0(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method public j0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final k0(ILm9/a;Lc9/e;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    if-eqz p1, :cond_2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v2, 0x3

    if-ne p1, v2, :cond_0

    :try_start_0
    iget-object p1, p0, Lm9/a;->c:Lu8/j;

    invoke-static {p1, v0}, Lr9/a;->t(Lu8/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v1, p3}, Lz6/a;->f(ILjava/lang/Object;)V

    invoke-interface {p3, p2, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {p1, v0}, Lr9/a;->k(Lu8/j;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget-object p1, Lv8/a;->a:Lv8/a;

    if-eq p2, p1, :cond_3

    invoke-virtual {p0, p2}, Lm9/a;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_3
    invoke-static {p1, v0}, Lr9/a;->k(Lu8/j;Ljava/lang/Object;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    invoke-static {p1}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm9/a;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    const-string p1, "<this>"

    invoke-static {p3, p1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p0, p3}, Ld7/t;->M(Ljava/lang/Object;Lu8/e;Lc9/e;)Lu8/e;

    move-result-object p1

    invoke-static {p1}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p1

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-interface {p1, p2}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p3, p2, p0}, Lh6/g;->v0(Lc9/e;Lm9/a;Lm9/a;)V

    :cond_3
    :goto_1
    return-void

    :cond_4
    throw v0
.end method

.method public final q()Lu8/j;
    .locals 1

    iget-object v0, p0, Lm9/a;->c:Lu8/j;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1}, Lq8/h;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lm9/u;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lm9/u;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    invoke-virtual {p0, p1}, Lm9/p1;->Y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lm9/e0;->e:Li3/u;

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lm9/a;->v(Ljava/lang/Object;)V

    return-void
.end method
