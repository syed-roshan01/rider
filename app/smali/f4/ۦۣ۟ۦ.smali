.class public Lf4/ۦۣ۟ۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۦۢ۠:I = -0x7a


# direct methods
.method public static ۟۟۠۠ۤ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 1

    invoke-static {}, Lx7/۟۟ۦۨۡ;->ۨۨۦۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf4/y;

    invoke-virtual {p0}, Lf4/y;->zza()Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۧۧۧ(Ljava/lang/Object;)Ljava/util/concurrent/Semaphore;
    .locals 2

    invoke-static {}, Ly6/۟ۢ۟ۥۤ;->ۢۥۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/z4;

    iget-object v1, p0, Lk6/z4;->j:Ljava/util/concurrent/Semaphore;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۧۤ۠([SIII)Ljava/lang/String;
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

.method public static ۟ۡ۠ۦۧ(J)J
    .locals 2

    invoke-static {}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۦۣۡۡ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0, p1}, Lz6/a;->n(J)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۤۢۤ()I
    .locals 2

    const v0, 0x3d

    sget v1, Ls7/۟ۢ۟ۤۧ;->۟ۦۤۥۥ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lg4/۠ۤۢۥ;->ۨۡۥۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lc9/h;

    check-cast p7, Ljava/lang/Integer;

    invoke-interface/range {p0 .. p7}, Lc9/h;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۧ۠ۤ(Ljava/lang/Object;JJJJ)Lk0/y;
    .locals 1

    invoke-static {}, Lz7/۠ۡ۟ۦ;->ۢ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/y;

    invoke-virtual/range {p0 .. p8}, Lk0/y;->a(JJJJ)Lk0/y;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۧ۟(I)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lw2/۟ۧۥۦۨ;->۟ۥۡۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۨۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Li6/ۡۤۦ;->ۤۨۨ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/v3;

    iget v1, p0, Lk0/v3;->q:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۣ۟ۧۦ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۢۢۢ(Ljava/lang/Object;)Lc9/c;
    .locals 2

    invoke-static {}, La/ۨۥۥۤ;->۟ۥ۠ۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/h;

    iget-object v1, p0, Lf0/h;->f:Lc9/c;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۟ۢ()Lu0/b;
    .locals 1

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lk0/r0;->a:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۨۧ()Ly/f;
    .locals 1

    invoke-static {}, Lz7/۠ۡ۟ۦ;->ۢ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ly/k;->e:Ly/f;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)I
    .locals 1

    invoke-static {}, Lga/۟ۢۧ۟ۦ;->۟۠ۢۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/ContentResolver;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۧۥ۠()J
    .locals 2

    invoke-static {}, Ln1/۟۠۟ۤۤ;->۟۠ۥۥۡ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-wide v0, Le5/a;->a:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۦۢۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۦۣۤۤ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->ۣ۟ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/t;

    iget-boolean v1, p0, Lf0/t;->v:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۧ(Ljava/lang/String;)Ljava/lang/String;
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
