.class public final Lg8/e2;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/h0;


# instance fields
.field public final synthetic a:Lg8/h0;

.field public final synthetic b:Lg8/f2;


# direct methods
.method public constructor <init>(Lg8/f2;Lg8/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/e2;->b:Lg8/f2;

    iput-object p2, p0, Lg8/e2;->a:Lg8/h0;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/z5;->a(I)V

    return-void
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->b(I)V

    return-void
.end method

.method public final c(Z)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/z5;->c(Z)V

    return-void
.end method

.method public final d(Le8/s;)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/z5;->d(Le8/s;)V

    return-void
.end method

.method public final e(I)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->e(I)V

    return-void
.end method

.method public final f(Lg8/u;)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->f(Lg8/u;)V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0}, Lg8/z5;->flush()V

    return-void
.end method

.method public final g(Le8/c0;)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->g(Le8/c0;)V

    return-void
.end method

.method public final h(Le8/e0;)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->h(Le8/e0;)V

    return-void
.end method

.method public final i(Le8/c2;)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->i(Le8/c2;)V

    return-void
.end method

.method public final j(Lg8/j0;)V
    .locals 2

    iget-object v0, p0, Lg8/e2;->b:Lg8/f2;

    iget-object v0, v0, Lg8/f2;->b:Lg8/y;

    iget-object v1, v0, Lg8/y;->b:Lg8/s2;

    invoke-interface {v1}, Lg8/s2;->a()V

    iget-object v0, v0, Lg8/y;->a:Lg8/c6;

    check-cast v0, Lg8/k4;

    invoke-virtual {v0}, Lg8/k4;->a()J

    new-instance v0, Lg8/d2;

    invoke-direct {v0, p0, p1}, Lg8/d2;-><init>(Lg8/e2;Lg8/j0;)V

    iget-object p1, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {p1, v0}, Lg8/h0;->j(Lg8/j0;)V

    return-void
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0}, Lg8/z5;->k()Z

    move-result v0

    return v0
.end method

.method public final l(Ljava/io/InputStream;)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/z5;->l(Ljava/io/InputStream;)V

    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->m(Ljava/lang/String;)V

    return-void
.end method

.method public final n()V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0}, Lg8/z5;->n()V

    return-void
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0}, Lg8/h0;->o()V

    return-void
.end method

.method public final p()Le8/c;
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0}, Lg8/h0;->p()Le8/c;

    move-result-object v0

    return-object v0
.end method

.method public final q(Z)V
    .locals 1

    iget-object v0, p0, Lg8/e2;->a:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->q(Z)V

    return-void
.end method

.method public final r()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget-object v1, p0, Lg8/e2;->a:Lg8/h0;

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lg8/e2;->r()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
