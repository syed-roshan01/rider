.class public final Lcom/google/protobuf/x1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/protobuf/i2;


# instance fields
.field public final a:Lcom/google/protobuf/t1;

.field public final b:Lcom/google/protobuf/t2;

.field public final c:Lcom/google/protobuf/a0;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/t2;Lcom/google/protobuf/a0;Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/x1;->b:Lcom/google/protobuf/t2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lcom/google/protobuf/x1;->c:Lcom/google/protobuf/a0;

    iput-object p3, p0, Lcom/google/protobuf/x1;->a:Lcom/google/protobuf/t1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x1;->b:Lcom/google/protobuf/t2;

    invoke-static {v0, p1, p2}, Lcom/google/protobuf/j2;->B(Lcom/google/protobuf/t2;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x1;->b:Lcom/google/protobuf/t2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/google/protobuf/t2;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/protobuf/x1;->c:Lcom/google/protobuf/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x1;->c:Lcom/google/protobuf/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x1;->b:Lcom/google/protobuf/t2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lcom/google/protobuf/l0;

    iget-object p1, p1, Lcom/google/protobuf/l0;->unknownFields:Lcom/google/protobuf/s2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Lcom/google/protobuf/l0;

    iget-object p2, p2, Lcom/google/protobuf/l0;->unknownFields:Lcom/google/protobuf/s2;

    invoke-virtual {p1, p2}, Lcom/google/protobuf/s2;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 7

    iget-object v0, p0, Lcom/google/protobuf/x1;->b:Lcom/google/protobuf/t2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lcom/google/protobuf/l0;

    iget-object p1, p1, Lcom/google/protobuf/l0;->unknownFields:Lcom/google/protobuf/s2;

    iget v0, p1, Lcom/google/protobuf/s2;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p1, Lcom/google/protobuf/s2;->a:I

    if-ge v0, v2, :cond_1

    iget-object v2, p1, Lcom/google/protobuf/s2;->b:[I

    aget v2, v2, v0

    const/4 v3, 0x3

    ushr-int/2addr v2, v3

    iget-object v4, p1, Lcom/google/protobuf/s2;->c:[Ljava/lang/Object;

    aget-object v4, v4, v0

    check-cast v4, Lcom/google/protobuf/n;

    const/4 v5, 0x1

    invoke-static {v5}, Lcom/google/protobuf/v;->k0(I)I

    move-result v5

    const/4 v6, 0x2

    mul-int/2addr v5, v6

    invoke-static {v6, v2}, Lcom/google/protobuf/v;->l0(II)I

    move-result v2

    add-int/2addr v2, v5

    invoke-static {v3, v4}, Lcom/google/protobuf/v;->U(ILcom/google/protobuf/n;)I

    move-result v3

    add-int/2addr v3, v2

    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iput v1, p1, Lcom/google/protobuf/s2;->d:I

    move v0, v1

    :goto_1
    return v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/x1;->a:Lcom/google/protobuf/t1;

    instance-of v1, v0, Lcom/google/protobuf/l0;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/protobuf/l0;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->newMutableInstance()Lcom/google/protobuf/l0;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/protobuf/t1;->newBuilderForType()Lcom/google/protobuf/s1;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/protobuf/s1;->buildPartial()Lcom/google/protobuf/t1;

    move-result-object v0

    return-object v0
.end method

.method public final g(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x1;->b:Lcom/google/protobuf/t2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lcom/google/protobuf/l0;

    iget-object p1, p1, Lcom/google/protobuf/l0;->unknownFields:Lcom/google/protobuf/s2;

    invoke-virtual {p1}, Lcom/google/protobuf/s2;->hashCode()I

    move-result p1

    return p1
.end method

.method public final h(Ljava/lang/Object;Lg2/m;Lcom/google/protobuf/z;)V
    .locals 0

    iget-object p2, p0, Lcom/google/protobuf/x1;->b:Lcom/google/protobuf/t2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/google/protobuf/t2;->a(Ljava/lang/Object;)Lcom/google/protobuf/s2;

    iget-object p2, p0, Lcom/google/protobuf/x1;->c:Lcom/google/protobuf/a0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e;)V
    .locals 0

    move-object p2, p1

    check-cast p2, Lcom/google/protobuf/l0;

    iget-object p3, p2, Lcom/google/protobuf/l0;->unknownFields:Lcom/google/protobuf/s2;

    sget-object p4, Lcom/google/protobuf/s2;->f:Lcom/google/protobuf/s2;

    if-ne p3, p4, :cond_0

    new-instance p3, Lcom/google/protobuf/s2;

    invoke-direct {p3}, Lcom/google/protobuf/s2;-><init>()V

    iput-object p3, p2, Lcom/google/protobuf/l0;->unknownFields:Lcom/google/protobuf/s2;

    :cond_0
    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final j(Ljava/lang/Object;Lk6/w4;)V
    .locals 0

    iget-object p2, p0, Lcom/google/protobuf/x1;->c:Lcom/google/protobuf/a0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method
