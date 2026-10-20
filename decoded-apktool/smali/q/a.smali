.class public Lq/a;
.super Ljava/util/AbstractSet;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(ILjava/util/Map;)V
    .locals 0

    iput p1, p0, Lq/a;->a:I

    iput-object p2, p0, Lq/a;->b:Ljava/util/Map;

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/k2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lq/a;->a:I

    .line 2
    invoke-direct {p0, v0, p1}, Lq/a;-><init>(ILjava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Lq/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Lq/a;->e(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1

    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Lq/a;->e(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final clear()V
    .locals 2

    iget v0, p0, Lq/a;->a:I

    iget-object v1, p0, Lq/a;->b:Ljava/util/Map;

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/util/AbstractCollection;->clear()V

    return-void

    :pswitch_0
    check-cast v1, Lcom/google/protobuf/k2;

    invoke-virtual {v1}, Lcom/google/protobuf/k2;->c()V

    return-void

    :pswitch_1
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/l1;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/l1;->b()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    iget v0, p0, Lq/a;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Lq/a;->b:Ljava/util/Map;

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    check-cast v3, Lcom/google/protobuf/k2;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/protobuf/k2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eq v0, p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :cond_1
    :goto_0
    return v1

    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/l1;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/shaded/protobuf/l1;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eq v0, p1, :cond_3

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :cond_3
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/util/Map$Entry;)Z
    .locals 4

    iget v0, p0, Lq/a;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Lq/a;->b:Ljava/util/Map;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lq/a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    check-cast v3, Lcom/google/protobuf/k2;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, Lcom/google/protobuf/k2;->m(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v2

    :cond_0
    return v1

    :pswitch_0
    invoke-virtual {p0, p1}, Lq/a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/l1;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/l1;->d(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v2

    :cond_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    iget v0, p0, Lq/a;->a:I

    iget-object v1, p0, Lq/a;->b:Ljava/util/Map;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/m1;

    check-cast v1, Lcom/google/protobuf/k2;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/m1;-><init>(Lcom/google/protobuf/k2;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/m1;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/l1;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/m1;-><init>(Lcom/google/crypto/tink/shaded/protobuf/l1;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lq/d;

    check-cast v1, Lq/f;

    invoke-direct {v0, v1}, Lq/d;-><init>(Lq/f;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 4

    iget v0, p0, Lq/a;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Lq/a;->b:Ljava/util/Map;

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Lq/a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast v3, Lcom/google/protobuf/k2;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/protobuf/k2;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v2

    :cond_0
    return v1

    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Lq/a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/l1;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/l1;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v2

    :cond_1
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 2

    iget v0, p0, Lq/a;->a:I

    iget-object v1, p0, Lq/a;->b:Ljava/util/Map;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/protobuf/k2;

    invoke-virtual {v1}, Lcom/google/protobuf/k2;->p()I

    move-result v0

    return v0

    :pswitch_0
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/l1;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/l1;->h()I

    move-result v0

    return v0

    :pswitch_1
    check-cast v1, Lq/f;

    iget v0, v1, Lq/z;->c:I

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
