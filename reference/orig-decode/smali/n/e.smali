.class public abstract Ln/e;
.super Ln/f;

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:Ln/c;

.field public b:Ln/c;


# virtual methods
.method public final a(Ln/c;)V
    .locals 3

    iget-object v0, p0, Ln/e;->a:Ln/c;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ln/e;->b:Ln/c;

    if-ne p1, v0, :cond_0

    iput-object v1, p0, Ln/e;->b:Ln/c;

    iput-object v1, p0, Ln/e;->a:Ln/c;

    :cond_0
    iget-object v0, p0, Ln/e;->a:Ln/c;

    if-ne v0, p1, :cond_1

    move-object v2, p0

    check-cast v2, Ln/b;

    iget v2, v2, Ln/b;->c:I

    packed-switch v2, :pswitch_data_0

    iget-object v0, v0, Ln/c;->c:Ln/c;

    goto :goto_0

    :pswitch_0
    iget-object v0, v0, Ln/c;->d:Ln/c;

    :goto_0
    iput-object v0, p0, Ln/e;->a:Ln/c;

    :cond_1
    iget-object v0, p0, Ln/e;->b:Ln/c;

    if-ne v0, p1, :cond_4

    iget-object p1, p0, Ln/e;->a:Ln/c;

    if-eq v0, p1, :cond_3

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    move-object p1, p0

    check-cast p1, Ln/b;

    iget p1, p1, Ln/b;->c:I

    packed-switch p1, :pswitch_data_1

    iget-object p1, v0, Ln/c;->d:Ln/c;

    :goto_1
    move-object v1, p1

    goto :goto_2

    :pswitch_1
    iget-object p1, v0, Ln/c;->c:Ln/c;

    goto :goto_1

    :cond_3
    :goto_2
    iput-object v1, p0, Ln/e;->b:Ln/c;

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Ln/e;->b:Ln/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ln/e;->b:Ln/c;

    iget-object v1, p0, Ln/e;->a:Ln/c;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Ln/b;

    iget v1, v1, Ln/b;->c:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Ln/c;->d:Ln/c;

    goto :goto_1

    :pswitch_0
    iget-object v1, v0, Ln/c;->c:Ln/c;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :goto_1
    iput-object v1, p0, Ln/e;->b:Ln/c;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
