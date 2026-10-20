.class public abstract Li1/c0;
.super Ljava/lang/Object;


# instance fields
.field public a:Lc9/c;


# virtual methods
.method public abstract a(Lg1/g;)V
.end method

.method public b()Lc9/c;
    .locals 1

    iget-object v0, p0, Li1/c0;->a:Lc9/c;

    return-object v0
.end method

.method public final c()V
    .locals 1

    invoke-virtual {p0}, Li1/c0;->b()Lc9/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public d(Lh1/b;)V
    .locals 0

    iput-object p1, p0, Li1/c0;->a:Lc9/c;

    return-void
.end method
