.class public final Lg8/d2;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/j0;


# instance fields
.field public final synthetic a:Lg8/j0;

.field public final synthetic b:Lg8/e2;


# direct methods
.method public constructor <init>(Lg8/e2;Lg8/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/d2;->b:Lg8/e2;

    iput-object p2, p0, Lg8/d2;->a:Lg8/j0;

    return-void
.end method


# virtual methods
.method public final a(Lg8/a6;)V
    .locals 1

    iget-object v0, p0, Lg8/d2;->a:Lg8/j0;

    invoke-interface {v0, p1}, Lg8/b6;->a(Lg8/a6;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lg8/d2;->a:Lg8/j0;

    invoke-interface {v0}, Lg8/b6;->b()V

    return-void
.end method

.method public final c(Le8/c2;Lg8/i0;Le8/l1;)V
    .locals 2

    iget-object v0, p0, Lg8/d2;->b:Lg8/e2;

    iget-object v0, v0, Lg8/e2;->b:Lg8/f2;

    iget-object v0, v0, Lg8/f2;->b:Lg8/y;

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lg8/y;->c:Lg8/s2;

    invoke-interface {v0}, Lg8/s2;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lg8/y;->d:Lg8/s2;

    invoke-interface {v0}, Lg8/s2;->a()V

    :goto_0
    iget-object v0, p0, Lg8/d2;->a:Lg8/j0;

    invoke-interface {v0, p1, p2, p3}, Lg8/j0;->c(Le8/c2;Lg8/i0;Le8/l1;)V

    return-void
.end method

.method public final d(Le8/l1;)V
    .locals 1

    iget-object v0, p0, Lg8/d2;->a:Lg8/j0;

    invoke-interface {v0, p1}, Lg8/j0;->d(Le8/l1;)V

    return-void
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget-object v1, p0, Lg8/d2;->a:Lg8/j0;

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lg8/d2;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
