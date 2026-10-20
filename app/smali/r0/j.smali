.class public final Lr0/j;
.super Lr8/i;


# instance fields
.field public final a:Lr0/f;


# direct methods
.method public constructor <init>(Lr0/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    iput-object p1, p0, Lr0/j;->a:Lr0/f;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lr0/j;->a:Lr0/f;

    invoke-virtual {v0}, Lr0/f;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lr0/j;->a:Lr0/f;

    invoke-virtual {v0, p1}, Lr0/f;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, Lr0/j;->a:Lr0/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, Lr0/f;->f:I

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 5

    new-instance v0, Lr0/k;

    const/16 v1, 0x8

    new-array v2, v1, [Lr0/s;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    new-instance v4, Lr0/u;

    invoke-direct {v4}, Lr0/s;-><init>()V

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lr0/j;->a:Lr0/f;

    invoke-direct {v0, v1, v2}, Lr0/g;-><init>(Lr0/f;[Lr0/s;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lr0/j;->a:Lr0/f;

    invoke-virtual {v0, p1}, Lr0/f;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Lr0/f;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
