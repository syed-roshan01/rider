.class public abstract Lg8/m1;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/o0;


# virtual methods
.method public final a(Lg8/o2;)V
    .locals 1

    invoke-virtual {p0}, Lg8/m1;->g()Lg8/o0;

    move-result-object v0

    invoke-interface {v0, p1}, Lg8/k0;->a(Lg8/o2;)V

    return-void
.end method

.method public final b()Le8/q0;
    .locals 1

    invoke-virtual {p0}, Lg8/m1;->g()Lg8/o0;

    move-result-object v0

    invoke-interface {v0}, Le8/p0;->b()Le8/q0;

    move-result-object v0

    return-object v0
.end method

.method public c(Le8/c2;)V
    .locals 1

    invoke-virtual {p0}, Lg8/m1;->g()Lg8/o0;

    move-result-object v0

    invoke-interface {v0, p1}, Lg8/u3;->c(Le8/c2;)V

    return-void
.end method

.method public final e(Lg8/t3;)Ljava/lang/Runnable;
    .locals 1

    invoke-virtual {p0}, Lg8/m1;->g()Lg8/o0;

    move-result-object v0

    invoke-interface {v0, p1}, Lg8/u3;->e(Lg8/t3;)Ljava/lang/Runnable;

    move-result-object p1

    return-object p1
.end method

.method public f(Le8/c2;)V
    .locals 1

    invoke-virtual {p0}, Lg8/m1;->g()Lg8/o0;

    move-result-object v0

    invoke-interface {v0, p1}, Lg8/u3;->f(Le8/c2;)V

    return-void
.end method

.method public abstract g()Lg8/o0;
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {p0}, Lg8/m1;->g()Lg8/o0;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
