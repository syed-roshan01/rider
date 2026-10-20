.class public final Lcom/google/crypto/tink/shaded/protobuf/m1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Z

.field public d:Ljava/util/Iterator;

.field public final synthetic e:Ljava/util/AbstractMap;


# direct methods
.method public synthetic constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/l1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->a:I

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/m1;-><init>(Ljava/util/AbstractMap;I)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/k2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->a:I

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/m1;-><init>(Ljava/util/AbstractMap;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/AbstractMap;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->a:I

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->e:Ljava/util/AbstractMap;

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->b:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Iterator;
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->a:I

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->e:Ljava/util/AbstractMap;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->d:Ljava/util/Iterator;

    if-nez v0, :cond_0

    check-cast v1, Lcom/google/protobuf/k2;

    iget-object v0, v1, Lcom/google/protobuf/k2;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->d:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->d:Ljava/util/Iterator;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->d:Ljava/util/Iterator;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->d:Ljava/util/Iterator;

    return-object v0

    :cond_1
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/l1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/util/Map$Entry;
    .locals 3

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->a:I

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->e:Ljava/util/AbstractMap;

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    iput-boolean v2, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->c:Z

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->b:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->b:I

    check-cast v1, Lcom/google/protobuf/k2;

    iget-object v2, v1, Lcom/google/protobuf/k2;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v0, v1, Lcom/google/protobuf/k2;->b:Ljava/util/List;

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/m1;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    :goto_0
    return-object v0

    :pswitch_0
    iput-boolean v2, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->c:Z

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->b:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->b:I

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/l1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hasNext()Z
    .locals 5

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->e:Ljava/util/AbstractMap;

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->b:I

    add-int/2addr v0, v3

    check-cast v2, Lcom/google/protobuf/k2;

    iget-object v4, v2, Lcom/google/protobuf/k2;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lt v0, v4, :cond_0

    iget-object v0, v2, Lcom/google/protobuf/k2;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/m1;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v1, v3

    :cond_1
    return v1

    :pswitch_0
    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/l1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/m1;->b()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/m1;->b()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 4

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->a:I

    const-string v1, "remove() was called before next()"

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->e:Ljava/util/AbstractMap;

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->c:Z

    if-eqz v0, :cond_1

    iput-boolean v3, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->c:Z

    check-cast v2, Lcom/google/protobuf/k2;

    sget v0, Lcom/google/protobuf/k2;->n:I

    invoke-virtual {v2}, Lcom/google/protobuf/k2;->b()V

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->b:I

    iget-object v1, v2, Lcom/google/protobuf/k2;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->b:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->b:I

    invoke-virtual {v2, v0}, Lcom/google/protobuf/k2;->o(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/m1;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->c:Z

    if-eqz v0, :cond_2

    iput-boolean v3, p0, Lcom/google/crypto/tink/shaded/protobuf/m1;->c:Z

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/l1;

    sget v0, Lcom/google/crypto/tink/shaded/protobuf/l1;->a:I

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/l1;->a()V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
