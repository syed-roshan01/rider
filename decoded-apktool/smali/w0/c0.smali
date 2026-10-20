.class public final Lw0/c0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/ListIterator;
.implements Le9/a;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ls8/a;I)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lw0/c0;->a:I

    const-string v0, "list"

    .line 7
    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lw0/c0;->e:Ljava/lang/Object;

    iput p2, p0, Lw0/c0;->b:I

    const/4 p2, -0x1

    iput p2, p0, Lw0/c0;->c:I

    .line 8
    invoke-static {p1}, Ls8/a;->k(Ls8/a;)I

    move-result p1

    iput p1, p0, Lw0/c0;->d:I

    return-void
.end method

.method public constructor <init>(Lt1/v;II)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lw0/c0;->a:I

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p2, v1

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    .line 1
    iget p3, p1, Lt1/v;->d:I

    goto :goto_0

    :cond_1
    move p3, v1

    .line 2
    :goto_0
    invoke-direct {p0, p1, p2, v1, p3}, Lw0/c0;-><init>(Lt1/v;III)V

    return-void
.end method

.method public constructor <init>(Lt1/v;III)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lw0/c0;->a:I

    iput-object p1, p0, Lw0/c0;->e:Ljava/lang/Object;

    iput p2, p0, Lw0/c0;->b:I

    iput p3, p0, Lw0/c0;->c:I

    iput p4, p0, Lw0/c0;->d:I

    return-void
.end method

.method public constructor <init>(Lw0/u;I)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lw0/c0;->a:I

    iput-object p1, p0, Lw0/c0;->e:Ljava/lang/Object;

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Lw0/c0;->b:I

    const/4 p2, -0x1

    iput p2, p0, Lw0/c0;->c:I

    .line 5
    invoke-virtual {p1}, Lw0/u;->o()I

    move-result p1

    iput p1, p0, Lw0/c0;->d:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lw0/c0;->e:Ljava/lang/Object;

    check-cast v0, Ls8/a;

    invoke-static {v0}, Ls8/a;->k(Ls8/a;)I

    move-result v0

    iget v1, p0, Lw0/c0;->d:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lw0/c0;->e:Ljava/lang/Object;

    iget v1, p0, Lw0/c0;->a:I

    const/4 v2, -0x1

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p0}, Lw0/c0;->a()V

    check-cast v0, Ls8/a;

    iget v1, p0, Lw0/c0;->b:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Lw0/c0;->b:I

    invoke-virtual {v0, v1, p1}, Ls8/a;->add(ILjava/lang/Object;)V

    iput v2, p0, Lw0/c0;->c:I

    invoke-static {v0}, Ls8/a;->k(Ls8/a;)I

    move-result p1

    iput p1, p0, Lw0/c0;->d:I

    return-void

    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-virtual {p0}, Lw0/c0;->b()V

    check-cast v0, Lw0/u;

    iget v1, p0, Lw0/c0;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1, p1}, Lw0/u;->add(ILjava/lang/Object;)V

    iput v2, p0, Lw0/c0;->c:I

    iget p1, p0, Lw0/c0;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lw0/c0;->b:I

    invoke-virtual {v0}, Lw0/u;->o()I

    move-result p1

    iput p1, p0, Lw0/c0;->d:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lw0/c0;->e:Ljava/lang/Object;

    check-cast v0, Lw0/u;

    invoke-virtual {v0}, Lw0/u;->o()I

    move-result v0

    iget v1, p0, Lw0/c0;->d:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 4

    iget-object v0, p0, Lw0/c0;->e:Ljava/lang/Object;

    iget v1, p0, Lw0/c0;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v1, :pswitch_data_0

    iget v1, p0, Lw0/c0;->b:I

    check-cast v0, Ls8/a;

    iget v0, v0, Ls8/a;->c:I

    if-ge v1, v0, :cond_0

    move v2, v3

    :cond_0
    return v2

    :pswitch_0
    iget v0, p0, Lw0/c0;->b:I

    iget v1, p0, Lw0/c0;->d:I

    if-ge v0, v1, :cond_1

    move v2, v3

    :cond_1
    return v2

    :pswitch_1
    iget v1, p0, Lw0/c0;->b:I

    check-cast v0, Lw0/u;

    invoke-virtual {v0}, Lw0/u;->size()I

    move-result v0

    sub-int/2addr v0, v3

    if-ge v1, v0, :cond_2

    move v2, v3

    :cond_2
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 4

    iget v0, p0, Lw0/c0;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lw0/c0;->b:I

    if-lez v0, :cond_0

    move v1, v2

    :cond_0
    return v1

    :pswitch_0
    iget v0, p0, Lw0/c0;->b:I

    iget v3, p0, Lw0/c0;->c:I

    if-le v0, v3, :cond_1

    move v1, v2

    :cond_1
    return v1

    :pswitch_1
    iget v0, p0, Lw0/c0;->b:I

    if-ltz v0, :cond_2

    move v1, v2

    :cond_2
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lw0/c0;->e:Ljava/lang/Object;

    iget v1, p0, Lw0/c0;->a:I

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p0}, Lw0/c0;->a()V

    iget v1, p0, Lw0/c0;->b:I

    check-cast v0, Ls8/a;

    iget v2, v0, Ls8/a;->c:I

    if-ge v1, v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lw0/c0;->b:I

    iput v1, p0, Lw0/c0;->c:I

    iget-object v2, v0, Ls8/a;->a:[Ljava/lang/Object;

    iget v0, v0, Ls8/a;->b:I

    add-int/2addr v0, v1

    aget-object v0, v2, v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_0
    check-cast v0, Lt1/v;

    iget-object v0, v0, Lt1/v;->a:[Ljava/lang/Object;

    iget v1, p0, Lw0/c0;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lw0/c0;->b:I

    aget-object v0, v0, v1

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly0/n;

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Lw0/c0;->b()V

    iget v1, p0, Lw0/c0;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lw0/c0;->c:I

    check-cast v0, Lw0/u;

    invoke-virtual {v0}, Lw0/u;->size()I

    move-result v2

    invoke-static {v1, v2}, Lw0/v;->a(II)V

    invoke-virtual {v0, v1}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput v1, p0, Lw0/c0;->b:I

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 2

    iget v0, p0, Lw0/c0;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lw0/c0;->b:I

    return v0

    :pswitch_0
    iget v0, p0, Lw0/c0;->b:I

    iget v1, p0, Lw0/c0;->c:I

    sub-int/2addr v0, v1

    return v0

    :pswitch_1
    iget v0, p0, Lw0/c0;->b:I

    add-int/lit8 v0, v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lw0/c0;->e:Ljava/lang/Object;

    iget v1, p0, Lw0/c0;->a:I

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p0}, Lw0/c0;->a()V

    iget v1, p0, Lw0/c0;->b:I

    if-lez v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lw0/c0;->b:I

    iput v1, p0, Lw0/c0;->c:I

    check-cast v0, Ls8/a;

    iget-object v2, v0, Ls8/a;->a:[Ljava/lang/Object;

    iget v0, v0, Ls8/a;->b:I

    add-int/2addr v0, v1

    aget-object v0, v2, v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_0
    check-cast v0, Lt1/v;

    iget-object v0, v0, Lt1/v;->a:[Ljava/lang/Object;

    iget v1, p0, Lw0/c0;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lw0/c0;->b:I

    aget-object v0, v0, v1

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly0/n;

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Lw0/c0;->b()V

    iget v1, p0, Lw0/c0;->b:I

    check-cast v0, Lw0/u;

    invoke-virtual {v0}, Lw0/u;->size()I

    move-result v2

    invoke-static {v1, v2}, Lw0/v;->a(II)V

    iget v1, p0, Lw0/c0;->b:I

    iput v1, p0, Lw0/c0;->c:I

    invoke-virtual {v0, v1}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw0/c0;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lw0/c0;->b:I

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 2

    iget v0, p0, Lw0/c0;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lw0/c0;->b:I

    add-int/lit8 v0, v0, -0x1

    return v0

    :pswitch_0
    iget v0, p0, Lw0/c0;->b:I

    iget v1, p0, Lw0/c0;->c:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0

    :pswitch_1
    iget v0, p0, Lw0/c0;->b:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lw0/c0;->e:Ljava/lang/Object;

    iget v1, p0, Lw0/c0;->a:I

    const/4 v2, -0x1

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p0}, Lw0/c0;->a()V

    iget v1, p0, Lw0/c0;->c:I

    if-eq v1, v2, :cond_0

    check-cast v0, Ls8/a;

    invoke-virtual {v0, v1}, Ls8/a;->i(I)Ljava/lang/Object;

    iget v1, p0, Lw0/c0;->c:I

    iput v1, p0, Lw0/c0;->b:I

    iput v2, p0, Lw0/c0;->c:I

    invoke-static {v0}, Ls8/a;->k(Ls8/a;)I

    move-result v0

    iput v0, p0, Lw0/c0;->d:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() or previous() before removing element from the iterator."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    invoke-virtual {p0}, Lw0/c0;->b()V

    check-cast v0, Lw0/u;

    iget v1, p0, Lw0/c0;->b:I

    invoke-virtual {v0, v1}, Lw0/u;->remove(I)Ljava/lang/Object;

    iget v1, p0, Lw0/c0;->b:I

    add-int/2addr v1, v2

    iput v1, p0, Lw0/c0;->b:I

    iput v2, p0, Lw0/c0;->c:I

    invoke-virtual {v0}, Lw0/u;->o()I

    move-result v0

    iput v0, p0, Lw0/c0;->d:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lw0/c0;->e:Ljava/lang/Object;

    iget v1, p0, Lw0/c0;->a:I

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p0}, Lw0/c0;->a()V

    iget v1, p0, Lw0/c0;->c:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    check-cast v0, Ls8/a;

    invoke-virtual {v0, v1, p1}, Ls8/a;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Call next() or previous() before replacing element from the iterator."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-virtual {p0}, Lw0/c0;->b()V

    iget v1, p0, Lw0/c0;->c:I

    if-ltz v1, :cond_1

    check-cast v0, Lw0/u;

    invoke-virtual {v0, v1, p1}, Lw0/u;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lw0/u;->o()I

    move-result p1

    iput p1, p0, Lw0/c0;->d:I

    return-void

    :cond_1
    sget-object p1, Lw0/v;->a:Ljava/lang/Object;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
