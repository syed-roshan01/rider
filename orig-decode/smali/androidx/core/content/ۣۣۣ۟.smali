.class public Landroidx/core/content/ۣۣۣ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۦۤۤۥ:I = -0x142


# direct methods
.method public static ۟۟ۦ۠ۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lr2/۠ۨۦۢ;->۟ۦ۟ۢۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/c;

    iget v1, p0, Lf0/c;->d:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۧ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۧۨۤۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La5/c;

    invoke-virtual {p0, p1}, La5/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۨۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->ۣۧ۠ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v1, p0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۨ۠()Lv0/p;
    .locals 1

    invoke-static {}, Lt2/۟ۧۢ۟ۢ;->۟ۧۢۥۧ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lf0/a2;->g:Lv0/p;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۨۧۦ(Ljava/lang/Object;FFFFLjava/lang/Object;ZI)Ly0/o;
    .locals 1

    invoke-static {}, Lq7/۟ۢۢ۟ۧ;->۟ۡۦۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p5, Le1/l0;

    invoke-static/range {p0 .. p7}, Landroidx/compose/ui/graphics/a;->k(Ly0/o;FFFFLe1/l0;ZI)Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۡۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lh/ۥۦۡۧ;->ۥ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf2/j;

    iget v1, p0, Lf2/j;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۨۢۢ(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 2

    invoke-static {}, Lz7/۟۟ۨۢۢ;->۟۠ۤۡۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/o;

    iget-object v1, p0, Lk6/o;->c:Ljava/lang/Boolean;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۧۤ(Ljava/lang/Object;)Lf0/k1;
    .locals 2

    invoke-static {}, Lcom/google/firebase/inject/ۣۣ۟۠ۧ;->ۦۨۡ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/g0;

    iget-object v1, p0, Lf0/g0;->c:Lf0/k1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۨ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۤۥۣۤ(Ljava/lang/String;)Ljava/lang/String;
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

    move-result-object v3

    array-length v4, v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_2
    if-lt v0, v4, :cond_2

    :goto_3
    array-length v0, v3

    if-lt v1, v0, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

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
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_3
.end method

.method public static ۟ۦ۟ۦ۟(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 1

    invoke-static {}, Lr2/ۡۧۥۧ;->ۢۥۤۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/r7;

    check-cast p1, Ljava/lang/StringBuilder;

    check-cast p3, Ljava/util/List;

    invoke-virtual {p0, p1, p2, p3}, Lk6/r7;->N(Ljava/lang/StringBuilder;ILjava/util/List;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۥۣۥ(Ljava/lang/Object;)Lk6/r7;
    .locals 1

    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣۤ۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/k7;

    invoke-virtual {p0}, Lk6/k7;->m()Lk6/r7;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۥۥۢ(Ljava/lang/Object;)Lt/o1;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۣۨ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lt/u1;

    invoke-virtual {p0}, Lt/u1;->c()Lt/o1;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۡ()I
    .locals 2

    const v0, 0x25b

    sget v1, Lm7/ۧۢ۟;->ۣۣ۟ۨۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۣ۟ۤ()Le1/f0;
    .locals 1

    invoke-static {}, Ls3/۟ۧ۟ۡۢ;->۟۠ۤۨۢ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Le1/g0;->a:Le1/f0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣ۟ۢ([SIII)Ljava/lang/String;
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

.method public static ۥۣۤۡ(Ljava/lang/Object;FFJLjava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۢ۟ۤۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lg1/g;

    check-cast p5, Lg1/k;

    invoke-static/range {p0 .. p5}, Lk0/b2;->c(Lg1/g;FFJLg1/k;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۧۢۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ll6/ۣۧۧۧ;->۟ۤۢۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/b1;

    iget v1, p0, Ld5/b1;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۧۤۧ(Ljava/lang/Object;)Lg2/i0;
    .locals 2

    invoke-static {}, Lt8/ۦۣ۠;->۟ۤۥ۠ۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/h2;

    iget-object v1, p0, Lf0/h2;->d:Lg2/i0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
