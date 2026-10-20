.class public final Lq8/m;
.super Ljava/lang/Object;

# interfaces
.implements Lq8/c;
.implements Ljava/io/Serializable;


# instance fields
.field public a:Lc9/a;

.field public b:Ljava/lang/Object;


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lq8/m;->b:Ljava/lang/Object;

    sget-object v1, Lq8/k;->a:Lq8/k;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lq8/m;->a:Lc9/a;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lq8/m;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lq8/m;->a:Lc9/a;

    :cond_0
    iget-object v0, p0, Lq8/m;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lq8/m;->b:Ljava/lang/Object;

    sget-object v1, Lq8/k;->a:Lq8/k;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lq8/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method
