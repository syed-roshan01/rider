.class public abstract Lq/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;
.implements Le9/a;


# instance fields
.field public a:I

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq/h;->a:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lq/h;->b:I

    iget v1, p0, Lq/h;->a:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lq/h;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lq/h;->b:I

    move-object v1, p0

    check-cast v1, Lq/b;

    iget v2, v1, Lq/b;->d:I

    iget-object v1, v1, Lq/b;->e:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v1, Lq/g;

    iget-object v1, v1, Lq/g;->b:[Ljava/lang/Object;

    aget-object v0, v1, v0

    goto :goto_0

    :pswitch_0
    check-cast v1, Lq/f;

    invoke-virtual {v1, v0}, Lq/z;->j(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    check-cast v1, Lq/f;

    invoke-virtual {v1, v0}, Lq/z;->f(I)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iget v1, p0, Lq/h;->b:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lq/h;->b:I

    iput-boolean v2, p0, Lq/h;->c:Z

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    iget-boolean v0, p0, Lq/h;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lq/h;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lq/h;->b:I

    move-object v1, p0

    check-cast v1, Lq/b;

    iget v2, v1, Lq/b;->d:I

    iget-object v1, v1, Lq/b;->e:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v1, Lq/g;

    invoke-virtual {v1, v0}, Lq/g;->e(I)Ljava/lang/Object;

    goto :goto_0

    :pswitch_0
    check-cast v1, Lq/f;

    invoke-virtual {v1, v0}, Lq/z;->h(I)Ljava/lang/Object;

    goto :goto_0

    :pswitch_1
    check-cast v1, Lq/f;

    invoke-virtual {v1, v0}, Lq/z;->h(I)Ljava/lang/Object;

    :goto_0
    iget v0, p0, Lq/h;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lq/h;->a:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq/h;->c:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() before removing an element."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
