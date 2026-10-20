.class public abstract Lw0/f0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lw0/x;

.field public final b:Ljava/util/Iterator;

.field public c:I

.field public d:Ljava/util/Map$Entry;

.field public e:Ljava/util/Map$Entry;


# direct methods
.method public constructor <init>(Lw0/x;Ljava/util/Iterator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/f0;->a:Lw0/x;

    iput-object p2, p0, Lw0/f0;->b:Ljava/util/Iterator;

    invoke-virtual {p1}, Lw0/x;->a()Lw0/w;

    move-result-object p1

    iget p1, p1, Lw0/w;->d:I

    iput p1, p0, Lw0/f0;->c:I

    invoke-virtual {p0}, Lw0/f0;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lw0/f0;->e:Ljava/util/Map$Entry;

    iput-object v0, p0, Lw0/f0;->d:Ljava/util/Map$Entry;

    iget-object v0, p0, Lw0/f0;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lw0/f0;->e:Ljava/util/Map$Entry;

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lw0/f0;->e:Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lw0/f0;->a:Lw0/x;

    invoke-virtual {v0}, Lw0/x;->a()Lw0/w;

    move-result-object v1

    iget v1, v1, Lw0/w;->d:I

    iget v2, p0, Lw0/f0;->c:I

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lw0/f0;->d:Ljava/util/Map$Entry;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lw0/f0;->d:Ljava/util/Map$Entry;

    invoke-virtual {v0}, Lw0/x;->a()Lw0/w;

    move-result-object v0

    iget v0, v0, Lw0/w;->d:I

    iput v0, p0, Lw0/f0;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method
