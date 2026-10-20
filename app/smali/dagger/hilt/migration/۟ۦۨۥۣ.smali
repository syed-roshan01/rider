.class public Ldagger/hilt/migration/۟ۦۨۥۣ;
.super Ljava/lang/Object;


# static fields
.field public static ۟۟ۧ۠ۥ:I = -0x3cc


# direct methods
.method public static ۟۟ۢ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lq0/۟ۧۤۧ;->ۦۦۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/p7;

    check-cast p1, Ljava/lang/String;

    check-cast p3, Ljava/lang/Throwable;

    check-cast p4, [B

    check-cast p5, Ljava/util/Map;

    invoke-virtual/range {p0 .. p5}, Lk6/p7;->i(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟۠ۧۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟۠ۨۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lh/ۥۦۡۧ;->ۥ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "*"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢۢۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->ۧۧۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Payment Verification Under Process..."

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۨۧ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lv6/۟ۦۣۧۦ;->۟۟۠۟ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/b0;

    iget-object v1, p0, Ld5/b0;->e:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۦۢ()Lu0/b;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣۢۢ۠()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Ld5/r;->d:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZFLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۦۨۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Lc9/e;

    check-cast p2, Lc9/f;

    check-cast p3, Lc9/e;

    check-cast p4, Lc9/e;

    check-cast p5, Lc9/e;

    check-cast p6, Lc9/e;

    check-cast p7, Lc9/e;

    check-cast p10, Lc9/c;

    check-cast p11, Lc9/e;

    check-cast p12, Lc9/e;

    check-cast p13, Ly/t0;

    check-cast p14, Lm0/m;

    invoke-static/range {p0 .. p16}, Lk0/s1;->b(Ly0/o;Lc9/e;Lc9/f;Lc9/e;Lc9/e;Lc9/e;Lc9/e;Lc9/e;ZFLc9/c;Lc9/e;Lc9/e;Ly/t0;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lb7/ۣ۟۟ۦ۟;->ۣۣۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/y4;

    iget-object v1, p0, Lk6/y4;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۢۥ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟۟ۢ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, [B

    invoke-static {p0}, Lk6/u7;->t([B)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۥ۠۟()F
    .locals 1

    invoke-static {}, Lw1/ۦۣۦۧ;->ۨۦۥۨ()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Ll0/q;->b:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۨۨۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ld/۟ۤ۠ۡۨ;->ۦۢۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La5/f0;

    invoke-virtual {p0, p1}, La5/f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۢ۟۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۡۦۥ۠(Ljava/lang/Object;JI)V
    .locals 1

    invoke-static {}, Lx2/۟ۢۥ;->ۢۤۥۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/io/ByteArrayOutputStream;

    invoke-static {p0, p1, p2, p3}, Lo1/s;->o0(Ljava/io/ByteArrayOutputStream;JI)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۧۡ()I
    .locals 2

    const v0, -0x1b6

    sget v1, Ll6/ۣۧۧۧ;->۟ۦۣۧۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۢۢۥ(Ljava/lang/Object;)Landroid/app/job/JobInfo;
    .locals 1

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟۠ۢۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/app/job/JobInfo$Builder;

    invoke-virtual {p0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۡ۠۠()Lu0/b;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->۟ۦۣۧۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Ld5/r;->a:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۨۨ۠()[Lk0/f1;
    .locals 2

    invoke-static {}, Ly9/ۨ۠;->ۥۣۢۡ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lk0/f1;->values()[Lk0/f1;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۦۧ([SIII)Ljava/lang/String;
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

.method public static ۨۧ۟ۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->۟۠ۦۧ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/h4;

    iget v1, p0, Lk0/h4;->o:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
