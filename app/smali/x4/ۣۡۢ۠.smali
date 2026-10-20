.class public Lx4/ۣۡۢ۠;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۤۤۧۤ:I = 0xcb


# direct methods
.method public static ۟۠ۤۥ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣۨۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lq8/i;

    invoke-virtual {p0}, Lq8/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۧ۟۟(III)I
    .locals 1

    invoke-static {}, Le9/ۧۧۡ;->ۨۦ۟ۥ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {p0, p1, p2}, Ly3/e;->n0(III)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۧۡ۠(Ljava/lang/Object;Ljava/lang/Object;)Lj4/l;
    .locals 1

    invoke-static {}, Lk2/۟ۢۦۤۤ;->۟ۦۣۤ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Lm0/m;

    invoke-static {p0, p1}, Ly3/e;->B0(Ljava/lang/String;Lm0/m;)Lj4/l;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۨۢۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟۠ۨۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Li/ۢۥۣ۟;->ۢۢۡۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/u7;

    invoke-virtual {p0}, Lk6/u7;->n0()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۧۥ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۦ۟۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/n0;

    iget-object v1, p0, Ld5/n0;->c:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۨ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ll6/ۣۧۧۧ;->۟ۤۢۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/d;

    iget-wide v2, p0, Lf0/d;->b:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧۧۧ([SIII)Ljava/lang/String;
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

.method public static ۟ۧۡ۟ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lu/ۤ;->ۣ۟ۢۡۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/r1;

    iget-object v1, p0, Ld5/r1;->c:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۨۨ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۠ۧۨۨ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->ۣۣۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzaw()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۟۠ۥ()I
    .locals 2

    const v0, -0x314

    sget v1, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟۠ۦۢۥ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۡۤۡۢ(Ljava/lang/Object;)Lk6/x7;
    .locals 2

    invoke-static {}, Ldagger/hilt/components/ۡۧ۟;->۟ۥۢۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/u6;

    iget-object v1, p0, Lk6/u6;->b:Lk6/x7;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۥ۠۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lv6/۟ۦۣۧۦ;->۟۟۠۟ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lp9/o0;

    invoke-interface {p0}, Lp9/o0;->getValue()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۨۨ۟(Ljava/lang/Object;ILjava/lang/Object;IIZ)Z
    .locals 1

    invoke-static {}, Lh5/ۧ۟ۨۧ;->ۥۥ۟ۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-static/range {p0 .. p5}, Ll9/i;->Z0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦ۟ۧۡ(Ljava/lang/Object;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    invoke-static {}, Lp3/۟ۢ۟۟ۥ;->ۣ۠ۧۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/b4;

    invoke-virtual/range {p0 .. p0}, Lk6/b4;->z()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۡۧۢ()Ly/f;
    .locals 2

    invoke-static {}, Lz8/ۣۤۡۧ;->۟ۧۤۤۨ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Ly/k;->b()Ly/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
