.class public final Lw0/m0;
.super Lw0/i;


# instance fields
.field public final f:Lw0/i;

.field public final g:Z

.field public final h:Z

.field public final i:Lc9/c;


# direct methods
.method public constructor <init>(Lw0/i;Lc9/c;Z)V
    .locals 2

    sget-object v0, Lw0/n;->e:Lw0/n;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lw0/i;-><init>(ILw0/n;)V

    iput-object p1, p0, Lw0/m0;->f:Lw0/i;

    iput-boolean v1, p0, Lw0/m0;->g:Z

    iput-boolean p3, p0, Lw0/m0;->h:Z

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lw0/i;->f()Lc9/c;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw0/b;

    iget-object p1, p1, Lw0/c;->f:Lc9/c;

    :cond_1
    invoke-static {p2, p1, v1}, Lw0/p;->j(Lc9/c;Lc9/c;Z)Lc9/c;

    move-result-object p1

    iput-object p1, p0, Lw0/m0;->i:Lc9/c;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw0/i;->c:Z

    iget-boolean v0, p0, Lw0/m0;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw0/m0;->f:Lw0/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lw0/i;->c()V

    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    invoke-virtual {p0}, Lw0/m0;->u()Lw0/i;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->d()I

    move-result v0

    return v0
.end method

.method public final e()Lw0/n;
    .locals 1

    invoke-virtual {p0}, Lw0/m0;->u()Lw0/i;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->e()Lw0/n;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lc9/c;
    .locals 1

    iget-object v0, p0, Lw0/m0;->i:Lc9/c;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    invoke-virtual {p0}, Lw0/m0;->u()Lw0/i;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->g()Z

    move-result v0

    return v0
.end method

.method public final i()Lc9/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
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

    invoke-virtual {p0}, Lw0/m0;->u()Lw0/i;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->m()V

    return-void
.end method

.method public final n(Lw0/g0;)V
    .locals 1

    invoke-virtual {p0}, Lw0/m0;->u()Lw0/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw0/i;->n(Lw0/g0;)V

    return-void
.end method

.method public final t(Lc9/c;)Lw0/i;
    .locals 3

    iget-object v0, p0, Lw0/m0;->i:Lc9/c;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lw0/p;->j(Lc9/c;Lc9/c;Z)Lc9/c;

    move-result-object p1

    iget-boolean v0, p0, Lw0/m0;->g:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lw0/m0;->u()Lw0/i;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lw0/i;->t(Lc9/c;)Lw0/i;

    move-result-object v0

    invoke-static {v0, p1, v1}, Lw0/p;->g(Lw0/i;Lc9/c;Z)Lw0/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lw0/m0;->u()Lw0/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw0/i;->t(Lc9/c;)Lw0/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final u()Lw0/i;
    .locals 1

    iget-object v0, p0, Lw0/m0;->f:Lw0/i;

    if-nez v0, :cond_0

    sget-object v0, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw0/i;

    :cond_0
    return-object v0
.end method
