.class public abstract Lr6/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final synthetic d:Lr6/i;


# direct methods
.method public constructor <init>(Lr6/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/f;->d:Lr6/i;

    iget v0, p1, Lr6/i;->e:I

    iput v0, p0, Lr6/f;->a:I

    invoke-virtual {p1}, Lr6/i;->isEmpty()Z

    move-result p1

    const/4 v0, -0x1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lr6/f;->b:I

    iput v0, p0, Lr6/f;->c:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget v0, p0, Lr6/f;->b:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lr6/f;->d:Lr6/i;

    iget v1, v0, Lr6/i;->e:I

    iget v2, p0, Lr6/f;->a:I

    if-ne v1, v2, :cond_2

    invoke-virtual {p0}, Lr6/f;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lr6/f;->b:I

    iput v1, p0, Lr6/f;->c:I

    move-object v2, p0

    check-cast v2, Lr6/d;

    iget v3, v2, Lr6/d;->e:I

    iget-object v2, v2, Lr6/d;->f:Lr6/i;

    packed-switch v3, :pswitch_data_0

    invoke-virtual {v2}, Lr6/i;->k()[Ljava/lang/Object;

    move-result-object v2

    aget-object v1, v2, v1

    goto :goto_0

    :pswitch_0
    new-instance v3, Lr6/g;

    invoke-direct {v3, v2, v1}, Lr6/g;-><init>(Lr6/i;I)V

    move-object v1, v3

    goto :goto_0

    :pswitch_1
    invoke-virtual {v2}, Lr6/i;->j()[Ljava/lang/Object;

    move-result-object v2

    aget-object v1, v2, v1

    :goto_0
    iget v2, p0, Lr6/f;->b:I

    add-int/lit8 v2, v2, 0x1

    iget v0, v0, Lr6/i;->f:I

    if-ge v2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, -0x1

    :goto_1
    iput v2, p0, Lr6/f;->b:I

    return-object v1

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 4

    iget-object v0, p0, Lr6/f;->d:Lr6/i;

    iget v1, v0, Lr6/i;->e:I

    iget v2, p0, Lr6/f;->a:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Lr6/f;->c:I

    const/4 v2, 0x1

    if-ltz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v3, "no calls to next() since the last call to remove()"

    invoke-static {v3, v1}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget v1, p0, Lr6/f;->a:I

    add-int/lit8 v1, v1, 0x20

    iput v1, p0, Lr6/f;->a:I

    iget v1, p0, Lr6/f;->c:I

    invoke-virtual {v0}, Lr6/i;->j()[Ljava/lang/Object;

    move-result-object v3

    aget-object v1, v3, v1

    invoke-virtual {v0, v1}, Lr6/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lr6/f;->b:I

    sub-int/2addr v0, v2

    iput v0, p0, Lr6/f;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lr6/f;->c:I

    return-void

    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method
