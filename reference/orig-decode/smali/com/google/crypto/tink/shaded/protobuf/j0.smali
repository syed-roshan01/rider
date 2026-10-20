.class public final Lcom/google/crypto/tink/shaded/protobuf/j0;
.super Lcom/google/crypto/tink/shaded/protobuf/c;

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/k0;
.implements Ljava/util/RandomAccess;


# instance fields
.field public final b:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/j0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/j0;-><init>(I)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/crypto/tink/shaded/protobuf/c;->a:Z

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;-><init>(Ljava/util/ArrayList;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/c;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/google/crypto/tink/shaded/protobuf/e0;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-direct {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/j0;-><init>(Ljava/util/ArrayList;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/c;->e()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/c;->e()V

    .line 4
    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/k0;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-interface {p2}, Lcom/google/crypto/tink/shaded/protobuf/k0;->d()Ljava/util/List;

    move-result-object p2

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    .line 5
    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    iget p2, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ljava/util/AbstractList;->modCount:I

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    .line 1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final b()Lcom/google/crypto/tink/shaded/protobuf/k0;
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/c;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/r1;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/r1;-><init>(Lcom/google/crypto/tink/shaded/protobuf/k0;)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final c(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final clear()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/c;->e()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final d()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/String;

    goto :goto_2

    :cond_0
    instance-of v2, v1, Lcom/google/crypto/tink/shaded/protobuf/l;

    if-eqz v2, :cond_3

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v3

    if-nez v3, :cond_1

    const-string v2, ""

    goto :goto_0

    :cond_1
    move-object v3, v1

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/k;

    new-instance v4, Ljava/lang/String;

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->p()I

    move-result v5

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->size()I

    move-result v6

    iget-object v3, v3, Lcom/google/crypto/tink/shaded/protobuf/k;->d:[B

    invoke-direct {v4, v3, v5, v6, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    move-object v2, v4

    :goto_0
    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->p()I

    move-result v3

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->size()I

    move-result v4

    add-int/2addr v4, v3

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/z1;->a:Lcom/google/crypto/tink/shaded/protobuf/x1;

    iget-object v1, v1, Lcom/google/crypto/tink/shaded/protobuf/k;->d:[B

    invoke-virtual {v5, v1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/x1;->t0([BII)I

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v0, p1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    move-object v1, v2

    goto :goto_2

    :cond_3
    check-cast v1, [B

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/z1;->a:Lcom/google/crypto/tink/shaded/protobuf/x1;

    array-length v4, v1

    const/4 v5, 0x0

    invoke-virtual {v3, v1, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/x1;->t0([BII)I

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v0, p1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :goto_2
    return-object v1
.end method

.method public final l(Lcom/google/crypto/tink/shaded/protobuf/l;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/c;->e()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/c;->e()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/l;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v1

    if-nez v1, :cond_1

    const-string p1, ""

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/k;

    new-instance v1, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->p()I

    move-result v2

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->size()I

    move-result v3

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/k;->d:[B

    invoke-direct {v1, p1, v2, v3, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    move-object p1, v1

    goto :goto_0

    :cond_2
    check-cast p1, [B

    new-instance v0, Ljava/lang/String;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/c;->e()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lcom/google/crypto/tink/shaded/protobuf/l;

    if-eqz p2, :cond_2

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v0

    if-nez v0, :cond_1

    const-string p1, ""

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/k;

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->p()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->size()I

    move-result v2

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/k;->d:[B

    invoke-direct {v0, p1, v1, v2, p2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    move-object p1, v0

    goto :goto_0

    :cond_2
    check-cast p1, [B

    new-instance p2, Ljava/lang/String;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-direct {p2, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/j0;->b:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
