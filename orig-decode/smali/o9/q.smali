.class public final Lo9/q;
.super Lm9/a;

# interfaces
.implements Lo9/r;
.implements Lo9/g;


# instance fields
.field public final d:Lo9/g;


# direct methods
.method public constructor <init>(Lu8/j;Lo9/c;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lm9/a;-><init>(Lu8/j;Z)V

    iput-object p2, p0, Lo9/q;->d:Lo9/g;

    return-void
.end method


# virtual methods
.method public final A(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0, p1}, Lo9/s;->a(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {p0, p1}, Lm9/p1;->z(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm9/u;

    if-nez v1, :cond_2

    instance-of v1, v0, Lm9/m1;

    if-eqz v1, :cond_0

    check-cast v0, Lm9/m1;

    invoke-virtual {v0}, Lm9/m1;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, Lm9/g1;

    invoke-virtual {p0}, Lm9/a;->C()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lm9/g1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm9/f1;)V

    :cond_1
    invoke-virtual {p0, p1}, Lo9/q;->A(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final b()Z
    .locals 1

    invoke-super {p0}, Lm9/a;->b()Z

    move-result v0

    return v0
.end method

.method public final c(Lh1/b;)V
    .locals 1

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0, p1}, Lo9/t;->c(Lh1/b;)V

    return-void
.end method

.method public final h(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0, p1, p2}, Lo9/t;->h(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lw8/i;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0, p1}, Lo9/s;->i(Lw8/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i0(Ljava/lang/Throwable;Z)V
    .locals 1

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0, p1}, Lo9/t;->j(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    iget-object p2, p0, Lm9/a;->c:Lu8/j;

    invoke-static {p2, p1}, Lh6/g;->n0(Lu8/j;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final iterator()Lo9/b;
    .locals 1

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0}, Lo9/s;->iterator()Lo9/b;

    move-result-object v0

    return-object v0
.end method

.method public final j(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0, p1}, Lo9/t;->j(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final j0(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lq8/l;

    const/4 p1, 0x0

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0, p1}, Lo9/t;->j(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final m()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0}, Lo9/s;->m()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0, p1}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final r()Z
    .locals 1

    iget-object v0, p0, Lo9/q;->d:Lo9/g;

    invoke-interface {v0}, Lo9/t;->r()Z

    move-result v0

    return v0
.end method
