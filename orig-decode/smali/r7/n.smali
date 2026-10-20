.class public abstract Lr7/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:Lr7/o;

.field public b:Lr7/o;

.field public c:I

.field public final synthetic d:Lr7/p;


# direct methods
.method public constructor <init>(Lr7/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr7/n;->d:Lr7/p;

    iget-object v0, p1, Lr7/p;->f:Lr7/o;

    iget-object v0, v0, Lr7/o;->d:Lr7/o;

    iput-object v0, p0, Lr7/n;->a:Lr7/o;

    const/4 v0, 0x0

    iput-object v0, p0, Lr7/n;->b:Lr7/o;

    iget p1, p1, Lr7/p;->e:I

    iput p1, p0, Lr7/n;->c:I

    return-void
.end method


# virtual methods
.method public final a()Lr7/o;
    .locals 3

    iget-object v0, p0, Lr7/n;->a:Lr7/o;

    iget-object v1, p0, Lr7/n;->d:Lr7/p;

    iget-object v2, v1, Lr7/p;->f:Lr7/o;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lr7/p;->e:I

    iget v2, p0, Lr7/n;->c:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lr7/o;->d:Lr7/o;

    iput-object v1, p0, Lr7/n;->a:Lr7/o;

    iput-object v0, p0, Lr7/n;->b:Lr7/o;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lr7/n;->a:Lr7/o;

    iget-object v1, p0, Lr7/n;->d:Lr7/p;

    iget-object v1, v1, Lr7/p;->f:Lr7/o;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lr7/n;->b:Lr7/o;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iget-object v2, p0, Lr7/n;->d:Lr7/p;

    invoke-virtual {v2, v0, v1}, Lr7/p;->c(Lr7/o;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lr7/n;->b:Lr7/o;

    iget v0, v2, Lr7/p;->e:I

    iput v0, p0, Lr7/n;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
