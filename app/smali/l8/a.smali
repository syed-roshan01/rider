.class public final Ll8/a;
.super Ljava/io/InputStream;

# interfaces
.implements Le8/f0;
.implements Le8/t0;


# instance fields
.field public a:Lcom/google/protobuf/t1;

.field public final b:Lcom/google/protobuf/b2;

.field public c:Ljava/io/ByteArrayInputStream;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/t1;Lcom/google/protobuf/b2;)V
    .locals 0

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iput-object p1, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    iput-object p2, p0, Ll8/a;->b:Lcom/google/protobuf/b2;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    iget-object v0, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/protobuf/t1;->getSerializedSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Ll8/a;->c:Ljava/io/ByteArrayInputStream;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final read()I
    .locals 2

    iget-object v0, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    if-eqz v0, :cond_0

    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    invoke-interface {v1}, Lcom/google/protobuf/t1;->toByteArray()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object v0, p0, Ll8/a;->c:Ljava/io/ByteArrayInputStream;

    const/4 v0, 0x0

    iput-object v0, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    :cond_0
    iget-object v0, p0, Ll8/a;->c:Ljava/io/ByteArrayInputStream;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public final read([BII)I
    .locals 4

    iget-object v0, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    .line 3
    invoke-interface {v0}, Lcom/google/protobuf/t1;->getSerializedSize()I

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iput-object v2, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    iput-object v2, p0, Ll8/a;->c:Ljava/io/ByteArrayInputStream;

    return v1

    :cond_0
    if-lt p3, v0, :cond_2

    .line 4
    sget-object p3, Lcom/google/protobuf/v;->d:Ljava/util/logging/Logger;

    .line 5
    new-instance p3, Lcom/google/protobuf/t;

    invoke-direct {p3, p1, p2, v0}, Lcom/google/protobuf/t;-><init>([BII)V

    iget-object p1, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    .line 6
    invoke-interface {p1, p3}, Lcom/google/protobuf/t1;->writeTo(Lcom/google/protobuf/v;)V

    .line 7
    invoke-virtual {p3}, Lcom/google/protobuf/t;->q0()I

    move-result p1

    if-nez p1, :cond_1

    iput-object v2, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    iput-object v2, p0, Ll8/a;->c:Ljava/io/ByteArrayInputStream;

    return v0

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Did not write as much data as expected."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_2
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v3, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    invoke-interface {v3}, Lcom/google/protobuf/t1;->toByteArray()[B

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object v0, p0, Ll8/a;->c:Ljava/io/ByteArrayInputStream;

    iput-object v2, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    :cond_3
    iget-object v0, p0, Ll8/a;->c:Ljava/io/ByteArrayInputStream;

    if-eqz v0, :cond_4

    .line 10
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayInputStream;->read([BII)I

    move-result p1

    return p1

    :cond_4
    return v1
.end method
