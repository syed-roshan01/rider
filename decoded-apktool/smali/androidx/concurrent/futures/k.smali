.class public final Landroidx/concurrent/futures/k;
.super Ljava/lang/Object;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Landroidx/concurrent/futures/m;

.field public c:Landroidx/concurrent/futures/o;

.field public d:Z


# virtual methods
.method public final finalize()V
    .locals 4

    iget-object v0, p0, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/m;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/concurrent/futures/m;->b:Landroidx/concurrent/futures/l;

    invoke-virtual {v0}, Landroidx/concurrent/futures/j;->isDone()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroidx/concurrent/futures/c;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The completer object was garbage collected - this future would otherwise never complete. The tag was: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Landroidx/concurrent/futures/k;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Landroidx/concurrent/futures/c;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/j;->setException(Ljava/lang/Throwable;)Z

    :cond_0
    iget-boolean v0, p0, Landroidx/concurrent/futures/k;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/concurrent/futures/k;->c:Landroidx/concurrent/futures/o;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/o;->set(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
