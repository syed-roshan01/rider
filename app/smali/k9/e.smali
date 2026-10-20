.class public final Lk9/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;
.implements Le9/a;


# instance fields
.field public final a:Ljava/util/Iterator;

.field public b:I

.field public c:Ljava/lang/Object;

.field public final synthetic d:Lk9/f;


# direct methods
.method public constructor <init>(Lk9/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/e;->d:Lk9/f;

    iget-object p1, p1, Lk9/f;->a:Lk9/i;

    invoke-interface {p1}, Lk9/i;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lk9/e;->a:Ljava/util/Iterator;

    const/4 p1, -0x1

    iput p1, p0, Lk9/e;->b:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    :cond_0
    iget-object v0, p0, Lk9/e;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lk9/e;->d:Lk9/f;

    iget-object v2, v1, Lk9/f;->c:Lc9/c;

    invoke-interface {v2, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-boolean v1, v1, Lk9/f;->b:Z

    if-ne v2, v1, :cond_0

    iput-object v0, p0, Lk9/e;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lk9/e;->b:I

    return-void

    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lk9/e;->b:I

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lk9/e;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lk9/e;->a()V

    :cond_0
    iget v0, p0, Lk9/e;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lk9/e;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lk9/e;->a()V

    :cond_0
    iget v0, p0, Lk9/e;->b:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lk9/e;->c:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, Lk9/e;->c:Ljava/lang/Object;

    iput v1, p0, Lk9/e;->b:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
