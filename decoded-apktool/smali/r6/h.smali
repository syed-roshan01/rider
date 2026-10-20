.class public final Lr6/h;
.super Ljava/util/AbstractCollection;


# instance fields
.field public final synthetic a:Lr6/i;


# direct methods
.method public constructor <init>(Lr6/i;)V
    .locals 0

    iput-object p1, p0, Lr6/h;->a:Lr6/i;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lr6/h;->a:Lr6/i;

    invoke-virtual {v0}, Lr6/i;->clear()V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget-object v0, p0, Lr6/h;->a:Lr6/i;

    invoke-virtual {v0}, Lr6/i;->b()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Lr6/d;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lr6/d;-><init>(Lr6/i;I)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lr6/h;->a:Lr6/i;

    invoke-virtual {v0}, Lr6/i;->size()I

    move-result v0

    return v0
.end method
