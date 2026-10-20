.class public Le1/ۦۣۢۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۣ۟ۧۥ:I = -0x364


# direct methods
.method public static ۟۟ۦۣ۟()Landroid/os/Parcelable$Creator;
    .locals 1

    invoke-static {}, Le8/۟۠ۦ۟ۢ;->۟ۥۧۤۨ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lk6/e;->CREATOR:Landroid/os/Parcelable$Creator;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۤۦۡ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->۟ۢۦۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/i0;

    iget-wide v2, p0, Lk0/i0;->H:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۨۢ۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_0

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-direct {v4, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    move v0, v1

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v0, v5, :cond_1

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v3, v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-gtz v3, :cond_2

    :goto_3
    array-length v2, v0

    if-lt v1, v2, :cond_3

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1

    :cond_0
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

    :cond_1
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

    :cond_2
    const/4 v5, -0x1

    aget-byte v6, v0, v5

    rem-int v7, v5, v4

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v0, v5

    goto :goto_2

    :cond_3
    const-string v1, ""

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3
.end method

.method public static ۟ۢۨ۟ۨ(Ljava/lang/Object;)Lk6/c7;
    .locals 2

    invoke-static {}, Lea/۟ۦۢۦۤ;->ۣۨۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/p7;

    iget-object v1, p0, Lk6/p7;->i:Lk6/c7;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥۣۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lk3/ۦ۠ۢۥ;->۟ۤۡۢ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/h1;

    iget v1, p0, Ld5/h1;->e:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۨۧ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۧۦۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/k2;

    iget-object v1, p0, Ld5/k2;->f:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۡ۠(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۣ۟ۤۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/i2;

    iget-object v1, p0, Lk0/i2;->c:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۢۥۧ([SIII)Ljava/lang/String;
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

.method public static ۟ۦ۟ۤۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۧ۠ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/v4;

    iget-boolean v1, p0, Lk0/v4;->p:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۡۨ(Ljava/lang/Object;)La2/c0;
    .locals 2

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->۟ۤۦۨ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/p;

    iget-object v1, p0, Lk0/p;->d:La2/c0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۠ۨۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۧۦۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lh0/v0;

    check-cast p1, Ld1/c;

    invoke-virtual {p0, p1}, Lh0/v0;->g(Ld1/c;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۦۡۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->۟ۢۤۡ۟()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Not updating daily counts, app is not known. appId"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۦۢ۟(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Lq9/۟ۧۦۤۨ;->۟ۤۧۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/net/HttpURLConnection;

    invoke-virtual {p0, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۤ۠ۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lc6/۟ۧۧ۠ۤ;->ۣۥۣ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf5/r;

    iget-object v1, p0, Lf5/r;->e:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۥۨ()I
    .locals 2

    const v0, -0x8

    sget v1, Lx4/۟ۤۦۥ۟;->ۧۤۦ۠:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۤۤۢۤ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lu7/ۣ۟ۡ۟;->ۡۤۧۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/k1;

    invoke-interface {p0}, Lf0/k1;->d()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۣۤ۟()J
    .locals 2

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-wide v0, Lf0/i1;->j:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lp0/۟ۧۧۧ۟;->ۦۧ۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/f;

    iget v1, p0, Ld5/f;->d:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟ۡۨۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/a5;

    iget-object v1, p0, Lk6/a5;->l:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۡ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->۟ۧۥۢ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/lang/reflect/Constructor;

    invoke-static {p0}, Lt7/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
