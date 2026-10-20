.class public Lcom/google/firebase/components/ۥۦ۠ۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۦۦۥ۟:I = -0x35f


# direct methods
.method public static ۟۟ۢۥۧ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lp4/ۣ۟۟ۢۥ;->۟۠ۢۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La2/c0;

    invoke-virtual {p0}, La2/c0;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۢ۠()Lu0/b;
    .locals 1

    invoke-static {}, Lp8/۟۟ۢ۟ۢ;->۟ۤۡ۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ld5/n;->e:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۥۣۣ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۡۦۡۤ([SIII)Ljava/lang/String;
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

.method public static ۟ۡۦۨۥ(Ljava/lang/Object;II)I
    .locals 1

    invoke-static {}, Lv9/۠ۡۨۨ;->ۣۤۢۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/ArrayList;

    invoke-static {p0, p1, p2}, Ld7/t;->w(Ljava/util/ArrayList;II)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۢۦۧ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lq0/ۥۣۡۧ;->۟۠ۨۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/o3;

    iget-wide v2, p0, Lk0/o3;->c:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۡۧۧ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 1

    invoke-static {}, Lla/۟ۢۥۧۥ;->ۣ۟ۢۤۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۤۤ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۠ۧۨ(Ljava/lang/Object;JJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lt7/۟ۡ۠ۨ۟;->ۣۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p5, Lc9/f;

    check-cast p6, Lc9/e;

    check-cast p7, Lc9/e;

    check-cast p8, Lm0/m;

    invoke-static/range {p0 .. p9}, Lk0/k4;->b(Ly0/o;JJLc9/f;Lc9/e;Lc9/e;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۨ۠ۧ()I
    .locals 2

    const v0, 0x273

    sget v1, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۢۡۥۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۦۣۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ly9/ۨ۠;->ۥۣۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk/f;

    check-cast p1, Lk6/r5;

    check-cast p2, Lk6/i;

    invoke-virtual {p0, p1, p2}, Lk/f;->N(Lk6/r5;Lk6/i;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۡۤۧ()La/a;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->۟ۢۡۤۡ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lb0/k0;->F:La/a;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/net/Uri$Builder;
    .locals 1

    invoke-static {}, Lt1/ۧۦۤۧ;->ۣۡ۠ۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/net/Uri$Builder;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۧۧۨ(Ljava/lang/Object;)Lm0/l3;
    .locals 2

    invoke-static {}, Lb/۠ۨۦۥ;->۟۟۠۠ۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/v1;

    iget-object v1, p0, Lf0/v1;->f:Lm0/l3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
