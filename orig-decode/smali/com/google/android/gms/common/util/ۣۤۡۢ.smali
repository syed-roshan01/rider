.class public Lcom/google/android/gms/common/util/ۣۤۡۢ;
.super Ljava/lang/Object;


# static fields
.field public static ۡۥۣۢ:I = -0x309


# direct methods
.method public static ۟۟ۡۢ۟()Lf0/n0;
    .locals 1

    invoke-static {}, Lw2/ۧۦۧ;->ۣۡ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lf0/n0;->a:Lf0/n0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۧ۟ۥ(Ljava/lang/Object;FF)V
    .locals 1

    invoke-static {}, Lq7/۟ۢۡ۟۟;->۟ۦۣۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/graphics/Path;

    invoke-virtual {p0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢۢۡ۟(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lr2/۠ۦۡۤ;->ۡۨۨۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {p0}, Lk6/b4;->v(Landroid/database/sqlite/SQLiteDatabase;)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lx4/ۣۡۢ۠;->ۡ۟۠ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/y5;

    check-cast p1, Lk6/s5;

    check-cast p2, Lk6/s5;

    invoke-static {p0, p1, p2}, Lk6/y5;->L(Lk6/y5;Lk6/s5;Lk6/s5;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤۢۨۥ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lp7/ۣۣۦۤ;->ۤۨۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Lm0/m;

    invoke-static {p0, p1, p2}, Lf0/f;->b(Ly0/o;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣۣ۟ۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->۟ۧۥۢ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/o;

    iget-object v1, p0, Lk0/o;->c:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟۠۟([SIII)Ljava/lang/String;
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

.method public static ۟ۧ۠ۡ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۣۡۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/a5;

    iget-object v1, p0, Lk6/a5;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧۢ۠(Ljava/lang/Object;)Lf0/a2;
    .locals 2

    invoke-static {}, Lh3/ۣ۠ۡۨ;->ۥۥ۟ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/y1;

    iget-object v1, p0, Lf0/y1;->a:Lf0/a2;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۡ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lx8/ۢۨۥۨ;->۟۟ۢ۠ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Failed to insert raw event (got -1). appId"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;IJJ)Lcom/auto/accept/data/model/TransactionData;
    .locals 1

    invoke-static {}, Ld4/۟۠۠۟ۢ;->ۦۢ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/auto/accept/data/model/TransactionData;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p4, Ljava/lang/String;

    check-cast p5, Ljava/lang/String;

    invoke-virtual/range {p0 .. p10}, Lcom/auto/accept/data/model/TransactionData;->copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IJJ)Lcom/auto/accept/data/model/TransactionData;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۠ۦۡ(Ljava/lang/Object;)Lk6/f;
    .locals 1

    invoke-static {}, Lq0/ۥۣۡۧ;->۟۠ۨۧۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/p7;

    invoke-virtual {p0}, Lk6/p7;->H()Lk6/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۡۦۣ(II)Z
    .locals 1

    invoke-static {}, Lu1/۟ۧۥۢ۠;->ۢۡۨۧ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0, p1}, Le1/g0;->f(II)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡ۟ۦ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۢۦ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lq2/ۣ۟ۢۥ۠;->ۣ۟ۢ۟ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/z3;

    iget-object v1, p0, Lk6/z3;->c:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۦۣۣ(Ljava/lang/Object;)Ly0/o;
    .locals 2

    invoke-static {}, Lt8/ۦۣ۠;->۟ۤۥ۠ۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/t;

    iget-object v1, p0, Lf0/t;->q:Ly0/o;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧ۟ۨۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۧۢۡۦ(Ljava/lang/Object;)Lm0/y1;
    .locals 2

    invoke-static {}, Lm5/ۣۢ۟ۧ;->۟ۧۥ۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lm0/x1;

    iget-object v1, p0, Lm0/x1;->b:Lm0/y1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۦۦۢ()I
    .locals 2

    const v0, 0x3aa

    sget v1, Ls2/۟ۧ۟ۧۤ;->۟ۤۥ۠ۦ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۨۦ۟۠(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Li/ۣۢۦ۠;->۟۠ۡۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/l1;

    iget-object v1, p0, Lk0/l1;->r:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
