.class public Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۟۠۠۟ۦ:I = 0x162


# direct methods
.method public static ۣ۟۟ۢ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟۠ۢۤۥ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lv9/۟۟ۤۥ;->ۣ۟۟ۧ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf5/z;

    iget-object v1, p0, Lf5/z;->a:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۥۣۧ(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, La/ۥۡۢۨ;->۟ۨۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfc$zza;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfc$zza;->zze()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۢۡ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lc3/۟ۥ۠ۡۧ;->۟ۥ۠ۨۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lz4/f;

    iget-wide v2, p0, Lz4/f;->d:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۢۤۢ(Ljava/lang/Object;Ljava/lang/Object;)Ly0/o;
    .locals 1

    invoke-static {}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Lc9/f;

    invoke-static {p0, p1}, Landroidx/compose/ui/layout/a;->g(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۠ۤۤ()I
    .locals 1

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Ll0/d;->c:I

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۣ۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lk1/ۨ۟ۧۡ;->۟ۤ۟ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/k1;

    invoke-interface {p0}, Lf0/k1;->e()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۦۦۢ(Ljava/lang/Object;)Lq/f;
    .locals 2

    invoke-static {}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۣ۟۠ۥۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/t4;

    iget-object v1, p0, Lk6/t4;->f:Lq/f;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۢۨ(Ljava/lang/Object;)Lk6/z4;
    .locals 1

    invoke-static {}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf4/y;

    invoke-virtual {p0}, Lf4/y;->zzl()Lk6/z4;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۨۦ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۤۥۤۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La5/s;

    iget-object v1, p0, La5/s;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۢ۠(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Le7/ۧ۠ۧ;->ۧ۟ۥ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/x7;

    invoke-static/range {p0 .. p0}, Lk6/p7;->I(Lk6/x7;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۥۥۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۥۣۧۡ([SIII)Ljava/lang/String;
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

.method public static ۦۨۧۥ()I
    .locals 2

    const v0, 0x1c4

    sget v1, Lg9/۠ۨۧۤ;->ۡۢ۟۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۧ۠ۢۤ(Ljava/lang/Object;)Lg2/o;
    .locals 2

    invoke-static {}, Le0/ۦۣ۟۠;->۟ۧۦۡۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/n;

    iget-object v1, p0, Lf0/n;->d:Lg2/o;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨ۠ۧۡ()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1

    invoke-static {}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۤۥۤۦ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨ۠ۨ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۣۨ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/e;

    iget-wide v2, p0, Lk0/e;->s:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۣۨ۠ۤ(Ljava/lang/Object;I)I
    .locals 1

    invoke-static {}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->۟ۢۥۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lg2/s;

    invoke-interface {p0, p1}, Lg2/s;->a(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
