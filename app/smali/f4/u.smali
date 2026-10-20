.class public final Lf4/u;
.super Lf4/r;


# instance fields
.field public a:Lf4/v;


# virtual methods
.method public final a(Lf4/q;)V
    .locals 1

    iget-object p1, p0, Lf4/u;->a:Lf4/v;

    iget-boolean v0, p1, Lf4/v;->H:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lf4/q;->G()V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lf4/v;->H:Z

    :cond_0
    return-void
.end method

.method public final c(Lf4/q;)V
    .locals 2

    iget-object v0, p0, Lf4/u;->a:Lf4/v;

    iget v1, v0, Lf4/v;->G:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lf4/v;->G:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lf4/v;->H:Z

    invoke-virtual {v0}, Lf4/q;->n()V

    :cond_0
    invoke-virtual {p1, p0}, Lf4/q;->w(Lf4/p;)V

    return-void
.end method
