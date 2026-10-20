.class public final Lu/o0;
.super Ly0/n;


# instance fields
.field public u:Lx/m;

.field public v:Lx/d;


# virtual methods
.method public final G0(Lx/m;Lx/k;)V
    .locals 3

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly0/n;->v0()Lm9/d0;

    move-result-object v0

    new-instance v1, Lu/n0;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lu/n0;-><init>(Lx/m;Lx/k;Lu8/e;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, v2, p2, v1, p1}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Lx/m;->b(Lx/k;)V

    :goto_0
    return-void
.end method
