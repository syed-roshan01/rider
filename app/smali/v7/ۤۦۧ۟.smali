.class public Lv7/ۤۦۧ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۠ۡ۟:I = 0x168


# direct methods
.method public static ۣ۟۟۠ۥ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lv0/۟ۤۧ۠ۧ;->۟ۤ۠ۤۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/m0;

    iget-object v1, p0, Ld5/m0;->d:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠۟ۤۦ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v0, 0x0

    const-string v3, ""

    const-string v2, ""

    move v1, v0

    :goto_0
    const/16 v4, 0xf

    if-lt v1, v4, :cond_0

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    invoke-direct {v1, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_1

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    array-length v3, v1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-lt v0, v3, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    return-object v0

    :cond_0
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v4

    const/16 v6, 0xa

    int-to-double v6, v6

    mul-double/2addr v4, v6

    double-to-int v4, v4

    xor-int/2addr v4, v1

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, -0x2

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    const/4 v5, -0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_2
    aget-byte v5, v1, v0

    rem-int v6, v0, v4

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method

.method public static ۟ۡۡۡۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lt2/۟ۢ۟ۢ۟;->۠ۤۦۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/auto/accept/data/model/AppConfig;

    invoke-virtual {p0}, Lcom/auto/accept/data/model/AppConfig;->getToastMessage()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ()I
    .locals 2

    const v0, -0x348

    sget v1, Lz7/۟۟ۨۢۢ;->ۣ۟ۥۡ۠:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۢۤۨۦ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lr2/ۡۧۥۧ;->ۢۥۤۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/l2;

    iget-wide v2, p0, Lk0/l2;->o:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۦۤۦ([SIII)Ljava/lang/String;
    .locals 3

    .prologue
    .line 25
    new-array v1, p2, [C

    .line 26
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 27
    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    .line 26
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ۟ۤۦۥۡ(Ljava/lang/Object;)Lr9/e;
    .locals 1

    invoke-static {}, Ls7/ۧۤۦۤ;->۟۟ۦۣ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lm0/m;

    invoke-static {p0}, Lm0/s;->h(Lm0/m;)Lr9/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۦۣۨ(Ljava/lang/Object;)Ljava/util/concurrent/Executor;
    .locals 2

    invoke-static {}, Lm7/ۧۢ۟;->ۤۧ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly3/b;

    iget-object v1, p0, Ly3/b;->a:Ljava/util/concurrent/Executor;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۤ۠(Ljava/lang/Object;)Lg8/t3;
    .locals 2

    invoke-static {}, Lb4/ۦۣۧ۟;->۠ۢ۠ۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lh8/n;

    iget-object v1, p0, Lh8/n;->h:Lg8/t3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۤۤۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/inject/ۣۣ۟۠ۧ;->ۦۨۡ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/protobuf/i2;

    check-cast p2, Lk6/w4;

    invoke-interface {p0, p1, p2}, Lcom/google/protobuf/i2;->j(Ljava/lang/Object;Lk6/w4;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۧۦۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/startup/ۨۤ۟ۡ;->۟ۥۣۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "active"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, Lfa/ۣ۟ۥۤ;->ۦ۟ۡۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/os/Bundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۡۦۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lt8/ۦۣ۠;->۟ۤۥ۠ۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La4/c0;

    check-cast p1, Lp9/g;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, La4/c0;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۥ۟ۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۤ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lh7/۟۟ۧۨ۟;->۟ۡۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lm0/x1;

    check-cast p1, Lc9/e;

    invoke-virtual {p0, p1}, Lm0/x1;->d(Lc9/e;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۤۦۨ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Ldagger/hilt/migration/۟ۦۨۥۣ;->ۢۧۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lz4/d;

    iget-object v1, p0, Lz4/d;->s:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۦۨۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lw4/ۥۤ۟۠;->۟ۧۡ۠۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/u1;

    iget v1, p0, Ld5/u1;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
