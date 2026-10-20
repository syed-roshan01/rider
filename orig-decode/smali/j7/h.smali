.class public final Lj7/h;
.super Ljava/lang/Object;

# interfaces
.implements Lv6/a;


# instance fields
.field public final a:Lj7/l;

.field public final b:Lv6/m;

.field public final c:I


# direct methods
.method public constructor <init>(Lj7/l;Lv6/m;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/h;->a:Lj7/l;

    iput-object p2, p0, Lj7/h;->b:Lv6/m;

    iput p3, p0, Lj7/h;->c:I

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 10

    iget-object v0, p0, Lj7/h;->a:Lj7/l;

    move-object v1, v0

    check-cast v1, Lj7/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v0, p1

    const v2, 0x7fffffff

    iget v3, v1, Lj7/a;->b:I

    sub-int/2addr v2, v3

    if-gt v0, v2, :cond_1

    array-length v0, p1

    add-int/2addr v0, v3

    new-array v0, v0, [B

    invoke-static {v3}, Lj7/q;->a(I)[B

    move-result-object v7

    const/4 v9, 0x0

    invoke-static {v7, v9, v0, v9, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v3, 0x0

    array-length v4, p1

    iget v6, v1, Lj7/a;->b:I

    const/4 v8, 0x1

    move-object v2, p1

    move-object v5, v0

    invoke-virtual/range {v1 .. v8}, Lj7/a;->a([BII[BI[BZ)V

    if-nez p2, :cond_0

    new-array p2, v9, [B

    :cond_0
    const/16 p1, 0x8

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    array-length v2, p2

    int-to-long v2, v2

    const-wide/16 v4, 0x8

    mul-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    const/4 v1, 0x3

    new-array v1, v1, [[B

    aput-object p2, v1, v9

    const/4 p2, 0x1

    aput-object v0, v1, p2

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-static {v1}, Lz6/a;->u([[B)[B

    move-result-object p1

    iget-object v1, p0, Lj7/h;->b:Lv6/m;

    invoke-interface {v1, p1}, Lv6/m;->b([B)[B

    move-result-object p1

    new-array v1, v2, [[B

    aput-object v0, v1, v9

    aput-object p1, v1, p2

    invoke-static {v1}, Lz6/a;->u([[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "plaintext length can not exceed "

    invoke-static {p2, v2}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b([B[B)[B
    .locals 12

    array-length v0, p1

    const-string v1, "ciphertext too short"

    iget v2, p0, Lj7/h;->c:I

    if-lt v0, v2, :cond_2

    array-length v0, p1

    sub-int/2addr v0, v2

    const/4 v3, 0x0

    invoke-static {p1, v3, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    array-length v0, p1

    sub-int/2addr v0, v2

    array-length v2, p1

    invoke-static {p1, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    if-nez p2, :cond_0

    new-array p2, v3, [B

    :cond_0
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    array-length v4, p2

    int-to-long v6, v4

    const-wide/16 v8, 0x8

    mul-long/2addr v6, v8

    invoke-virtual {v2, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [[B

    aput-object p2, v2, v3

    const/4 p2, 0x1

    aput-object v5, v2, p2

    const/4 p2, 0x2

    aput-object v0, v2, p2

    invoke-static {v2}, Lz6/a;->u([[B)[B

    move-result-object p2

    iget-object v0, p0, Lj7/h;->b:Lv6/m;

    invoke-interface {v0, p1, p2}, Lv6/m;->a([B[B)V

    iget-object p1, p0, Lj7/h;->a:Lj7/l;

    move-object v4, p1

    check-cast v4, Lj7/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length p1, v5

    iget p2, v4, Lj7/a;->b:I

    if-lt p1, p2, :cond_1

    new-array v10, p2, [B

    invoke-static {v5, v3, v10, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p1, v5

    iget v6, v4, Lj7/a;->b:I

    sub-int/2addr p1, v6

    new-array p1, p1, [B

    array-length p2, v5

    sub-int v7, p2, v6

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v8, p1

    invoke-virtual/range {v4 .. v11}, Lj7/a;->a([BII[BI[BZ)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
