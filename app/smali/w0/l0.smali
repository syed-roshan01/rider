.class public final Lw0/l0;
.super Lw0/c;


# instance fields
.field public final p:Lw0/c;

.field public final q:Z

.field public final r:Z


# direct methods
.method public constructor <init>(Lw0/c;Lc9/c;Lc9/c;ZZ)V
    .locals 2

    sget-object v0, Lw0/n;->e:Lw0/n;

    if-eqz p1, :cond_0

    iget-object v1, p1, Lw0/c;->f:Lc9/c;

    if-nez v1, :cond_1

    :cond_0
    sget-object v1, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw0/b;

    iget-object v1, v1, Lw0/c;->f:Lc9/c;

    :cond_1
    invoke-static {p2, v1, p4}, Lw0/p;->j(Lc9/c;Lc9/c;Z)Lc9/c;

    move-result-object p2

    if-eqz p1, :cond_2

    iget-object v1, p1, Lw0/c;->g:Lc9/c;

    if-nez v1, :cond_3

    :cond_2
    sget-object v1, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw0/b;

    iget-object v1, v1, Lw0/c;->g:Lc9/c;

    :cond_3
    invoke-static {p3, v1}, Lw0/p;->a(Lc9/c;Lc9/c;)Lc9/c;

    move-result-object p3

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p2, p3}, Lw0/c;-><init>(ILw0/n;Lc9/c;Lc9/c;)V

    iput-object p1, p0, Lw0/l0;->p:Lw0/c;

    iput-boolean p4, p0, Lw0/l0;->q:Z

    iput-boolean p5, p0, Lw0/l0;->r:Z

    return-void
.end method


# virtual methods
.method public final A(Lc9/c;Lc9/c;)Lw0/c;
    .locals 8

    const/4 v0, 0x1

    iget-object v1, p0, Lw0/c;->f:Lc9/c;

    invoke-static {p1, v1, v0}, Lw0/p;->j(Lc9/c;Lc9/c;Z)Lc9/c;

    move-result-object v4

    iget-object p1, p0, Lw0/c;->g:Lc9/c;

    invoke-static {p2, p1}, Lw0/p;->a(Lc9/c;Lc9/c;)Lc9/c;

    move-result-object v5

    iget-boolean p1, p0, Lw0/l0;->q:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2, v5}, Lw0/c;->A(Lc9/c;Lc9/c;)Lw0/c;

    move-result-object v3

    new-instance p1, Lw0/l0;

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lw0/l0;-><init>(Lw0/c;Lc9/c;Lc9/c;ZZ)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object p1

    invoke-virtual {p1, v4, v5}, Lw0/c;->A(Lc9/c;Lc9/c;)Lw0/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final B()Lw0/c;
    .locals 1

    iget-object v0, p0, Lw0/l0;->p:Lw0/c;

    if-nez v0, :cond_0

    sget-object v0, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw0/c;

    :cond_0
    return-object v0
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw0/i;->c:Z

    iget-boolean v0, p0, Lw0/l0;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw0/l0;->p:Lw0/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lw0/c;->c()V

    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->d()I

    move-result v0

    return v0
.end method

.method public final e()Lw0/n;
    .locals 1

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->e()Lw0/n;

    move-result-object v0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    invoke-virtual {v0}, Lw0/c;->g()Z

    move-result v0

    return v0
.end method

.method public final h()I
    .locals 1

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    invoke-virtual {v0}, Lw0/c;->h()I

    move-result v0

    return v0
.end method

.method public final k()V
    .locals 1

    invoke-static {}, Lw0/y;->a()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final l()V
    .locals 1

    invoke-static {}, Lw0/y;->a()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final m()V
    .locals 1

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    invoke-virtual {v0}, Lw0/c;->m()V

    return-void
.end method

.method public final n(Lw0/g0;)V
    .locals 1

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw0/c;->n(Lw0/g0;)V

    return-void
.end method

.method public final q(I)V
    .locals 0

    invoke-static {}, Lw0/y;->a()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final r(Lw0/n;)V
    .locals 0

    invoke-static {}, Lw0/y;->a()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final s(I)V
    .locals 1

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw0/c;->s(I)V

    return-void
.end method

.method public final t(Lc9/c;)Lw0/i;
    .locals 3

    iget-object v0, p0, Lw0/c;->f:Lc9/c;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lw0/p;->j(Lc9/c;Lc9/c;Z)Lc9/c;

    move-result-object p1

    iget-boolean v0, p0, Lw0/l0;->q:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lw0/c;->t(Lc9/c;)Lw0/i;

    move-result-object v0

    invoke-static {v0, p1, v1}, Lw0/p;->g(Lw0/i;Lc9/c;Z)Lw0/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw0/c;->t(Lc9/c;)Lw0/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final v()Ly/a0;
    .locals 1

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    invoke-virtual {v0}, Lw0/c;->v()Ly/a0;

    move-result-object v0

    return-object v0
.end method

.method public final w()Lo0/d;
    .locals 1

    invoke-virtual {p0}, Lw0/l0;->B()Lw0/c;

    move-result-object v0

    invoke-virtual {v0}, Lw0/c;->w()Lo0/d;

    move-result-object v0

    return-object v0
.end method

.method public final z(Lo0/d;)V
    .locals 0

    invoke-static {}, Lw0/y;->a()V

    const/4 p1, 0x0

    throw p1
.end method
