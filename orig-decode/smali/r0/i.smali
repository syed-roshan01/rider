.class public final Lr0/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;
.implements Le9/a;


# instance fields
.field public final a:Lr0/g;


# direct methods
.method public constructor <init>(Lr0/f;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v1, v0, [Lr0/s;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    new-instance v3, Lr0/v;

    invoke-direct {v3, p0}, Lr0/v;-><init>(Lr0/i;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/g;

    invoke-direct {v0, p1, v1}, Lr0/g;-><init>(Lr0/f;[Lr0/s;)V

    iput-object v0, p0, Lr0/i;->a:Lr0/g;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lr0/i;->a:Lr0/g;

    iget-boolean v0, v0, Lr0/e;->c:Z

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr0/i;->a:Lr0/g;

    invoke-virtual {v0}, Lr0/g;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final remove()V
    .locals 1

    iget-object v0, p0, Lr0/i;->a:Lr0/g;

    invoke-virtual {v0}, Lr0/g;->remove()V

    return-void
.end method
