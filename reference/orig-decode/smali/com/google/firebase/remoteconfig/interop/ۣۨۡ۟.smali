.class public Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۣۥۨۦ:I = 0x63


# direct methods
.method public static ۣ۟۟ۥۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lea/۟ۦۢۦۤ;->ۣۨۡۡ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "location_filter"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۦ۟ۥ()Ly1/u;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۨۨ۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lh0/d0;->c:Ly1/u;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۟۟ۡ(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    invoke-static {}, Lk1/ۨ۟ۧۡ;->۟ۤ۟ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/d;

    iget-object v1, p0, Lk6/d;->e:Ljava/lang/Long;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۡۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lfa/ۣ۟ۥۤ;->ۦ۟ۡۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf5/b0;

    iget-object v1, p0, Lf5/b0;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;
    .locals 1

    invoke-static {}, Lg4/۠ۤۢۥ;->ۨۡۥۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۥۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۤۦۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/Context;

    check-cast p1, Landroid/content/res/Configuration;

    invoke-virtual {p0, p1}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۦ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟ۤۧۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->۠ۦۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf5/t;

    iget v1, p0, Lf5/t;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۡ۟(Ljava/lang/Object;)Li1/f;
    .locals 2

    invoke-static {}, Lc0/ۦۢۦۥ;->ۢۢۨ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/m1;

    iget-object v1, p0, Ld5/m1;->a:Li1/f;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۢۤۦ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-direct {v4, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    move v0, v1

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v0, v5, :cond_2

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v3, v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-lt v1, v3, :cond_3

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1

    :cond_1
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

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

    xor-int/2addr v4, v0

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    shl-int/lit8 v5, v5, 0x4

    add-int/lit8 v6, v0, 0x1

    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_3
    aget-byte v5, v0, v1

    rem-int v6, v1, v4

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2
.end method

.method public static ۡۥۧۦ()Lt1/i;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->۟۠ۦۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lt1/k;->b()Lt1/i;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۦۢ۟(Ljava/lang/Object;)Lc9/c;
    .locals 2

    invoke-static {}, Lt0/ۣ۟۠ۡۢ;->۟ۤۤۦۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/s3;

    iget-object v1, p0, Lk0/s3;->b:Lc9/c;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۧۢ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lz3/۟ۡ۠ۦۣ;->ۡۤ۟۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/e0;

    iget-object v1, p0, Lk0/e0;->d:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥ۟ۤ۟(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ln7/۟ۤ۠۟ۥ;->۠ۦۥۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/StackTraceElement;

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۤۦۣ()[B
    .locals 1

    invoke-static {}, Landroidx/compose/ui/layout/ۢۡۤۤ;->ۣ۟۟ۨ۟()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Ly3/e;->d:[B

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧ۟۟ۧ()Lk0/l0;
    .locals 1

    invoke-static {}, Lb1/۟ۥۥ۟ۢ;->ۦۤۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk0/l0;->t:Lk0/l0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧۤۦ(Ljava/lang/Object;)Lf0/c2;
    .locals 2

    invoke-static {}, Lja/ۥۣۨ۠;->۟ۡۨ۠ۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/c0;

    iget-object v1, p0, Lf0/c0;->e:Lf0/c2;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۧۨۧ([SIII)Ljava/lang/String;
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

.method public static ۧۨۤۢ()I
    .locals 2

    const v0, -0xbb

    sget v1, Lz3/۟ۡ۠ۦۣ;->ۣ۠ۦۣ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۨۨۤ۟()[Ljava/lang/String;
    .locals 1

    invoke-static {}, Lh3/۟ۡۥ۠۠;->۟۠ۨ۠۠()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lk6/t5;->b:[Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۨۧۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/ۡۡۨۦ;->ۣۢ۠ۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/j0;

    iget v1, p0, Lf0/j0;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
