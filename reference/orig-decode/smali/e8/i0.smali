.class public abstract Le8/i0;
.super Le8/k;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {p0}, Le8/i0;->delegate()Le8/k;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public cancel(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Le8/i0;->delegate()Le8/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le8/k;->cancel(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public abstract delegate()Le8/k;
.end method

.method public getAttributes()Le8/c;
    .locals 1

    invoke-virtual {p0}, Le8/i0;->delegate()Le8/k;

    move-result-object v0

    invoke-virtual {v0}, Le8/k;->getAttributes()Le8/c;

    move-result-object v0

    return-object v0
.end method

.method public halfClose()V
    .locals 1

    invoke-virtual {p0}, Le8/i0;->delegate()Le8/k;

    move-result-object v0

    invoke-virtual {v0}, Le8/k;->halfClose()V

    return-void
.end method

.method public isReady()Z
    .locals 1

    invoke-virtual {p0}, Le8/i0;->delegate()Le8/k;

    move-result-object v0

    invoke-virtual {v0}, Le8/k;->isReady()Z

    move-result v0

    return v0
.end method

.method public request(I)V
    .locals 1

    invoke-virtual {p0}, Le8/i0;->delegate()Le8/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Le8/k;->request(I)V

    return-void
.end method

.method public sendMessage(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Le8/i0;->delegate()Le8/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Le8/k;->sendMessage(Ljava/lang/Object;)V

    return-void
.end method

.method public setMessageCompression(Z)V
    .locals 1

    invoke-virtual {p0}, Le8/i0;->delegate()Le8/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Le8/k;->setMessageCompression(Z)V

    return-void
.end method

.method public start(Le8/j;Le8/l1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le8/j;",
            "Le8/l1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Le8/i0;->delegate()Le8/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le8/k;->start(Le8/j;Le8/l1;)V

    return-void
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Le8/i0;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
