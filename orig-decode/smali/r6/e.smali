.class public final Lr6/e;
.super Ljava/util/AbstractSet;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/i;


# direct methods
.method public synthetic constructor <init>(Lr6/i;I)V
    .locals 0

    iput p2, p0, Lr6/e;->a:I

    iput-object p1, p0, Lr6/e;->b:Lr6/i;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 2

    iget v0, p0, Lr6/e;->a:I

    iget-object v1, p0, Lr6/e;->b:Lr6/i;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Lr6/i;->clear()V

    return-void

    :pswitch_0
    invoke-virtual {v1}, Lr6/i;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    iget v0, p0, Lr6/e;->a:I

    iget-object v1, p0, Lr6/e;->b:Lr6/i;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1, p1}, Lr6/i;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    invoke-virtual {v1}, Lr6/i;->b()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lr6/i;->d(Ljava/lang/Object;)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    invoke-virtual {v1}, Lr6/i;->k()[Ljava/lang/Object;

    move-result-object v1

    aget-object v0, v1, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, v2

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget v0, p0, Lr6/e;->a:I

    iget-object v1, p0, Lr6/e;->b:Lr6/i;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Lr6/i;->b()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Lr6/d;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr6/d;-><init>(Lr6/i;I)V

    :goto_0
    return-object v0

    :pswitch_0
    invoke-virtual {v1}, Lr6/i;->b()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance v0, Lr6/d;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr6/d;-><init>(Lr6/i;I)V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 11

    iget v0, p0, Lr6/e;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Lr6/e;->b:Lr6/i;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v3}, Lr6/i;->b()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p1}, Lr6/i;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr6/i;->q:Ljava/lang/Object;

    if-eq p1, v0, :cond_1

    move v1, v2

    :cond_1
    :goto_0
    return v1

    :pswitch_0
    invoke-virtual {v3}, Lr6/i;->b()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_1

    :cond_2
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_5

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v3}, Lr6/i;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lr6/i;->c()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    iget-object v7, v3, Lr6/i;->a:Ljava/lang/Object;

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lr6/i;->i()[I

    move-result-object v8

    invoke-virtual {v3}, Lr6/i;->j()[Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3}, Lr6/i;->k()[Ljava/lang/Object;

    move-result-object v10

    move v6, v0

    invoke-static/range {v4 .. v10}, Lz6/a;->b0(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v4, -0x1

    if-ne p1, v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v3, p1, v0}, Lr6/i;->e(II)V

    iget p1, v3, Lr6/i;->f:I

    sub-int/2addr p1, v2

    iput p1, v3, Lr6/i;->f:I

    iget p1, v3, Lr6/i;->e:I

    add-int/lit8 p1, p1, 0x20

    iput p1, v3, Lr6/i;->e:I

    move v1, v2

    :cond_5
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 2

    iget v0, p0, Lr6/e;->a:I

    iget-object v1, p0, Lr6/e;->b:Lr6/i;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Lr6/i;->size()I

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {v1}, Lr6/i;->size()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
