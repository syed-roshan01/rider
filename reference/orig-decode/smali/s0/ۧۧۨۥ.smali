.class public Ls0/ۧۧۨۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۠ۢۧ:I = 0x3b5


# direct methods
.method public static ۣ۟۟ۨۤ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lx5/ۡۦۦۥ;->ۣ۟۠ۡۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/d0;

    iget v1, p0, Lk0/d0;->c:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠۠ۧ(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 1

    invoke-static {}, Lh4/۟ۧۢۡۦ;->ۨ۟ۤۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/r7;

    invoke-virtual {p0}, Lk6/r7;->W()Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۡ۠ۥ([SIII)Ljava/lang/String;
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

.method public static ۟۠ۥۨۧ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lh/ۥۦۡۧ;->ۥ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzbd()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۡۥ(Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)Lr1/k0;
    .locals 1

    invoke-static {}, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->۠ۨۤۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lr1/l0;

    check-cast p3, Ljava/util/Map;

    check-cast p4, Lc9/c;

    invoke-interface {p0, p1, p2, p3, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧ۠ۥ(Ljava/lang/Object;)Lk6/y5;
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->۟ۥۤۧۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/e5;

    iget-object v1, p0, Lk6/e5;->b:Lk6/y5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۧۤ۟(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lv6/۟ۦۨۦۣ;->ۦۧۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/p1;

    iget-object v1, p0, Lk0/p1;->o:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۧ۠ۧ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lf4/ۡۥۣۢ;->ۣۧۧۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/k1;

    iget-object v1, p0, Ld5/k1;->d:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۤ۠(Ljava/lang/Object;)F
    .locals 1

    invoke-static {}, Landroidx/fragment/app/ۣۣۣۨ;->ۣۣۣ۟ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ll2/o;

    invoke-interface {p0}, Ll2/o;->c()F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۤۧ۠(Ljava/lang/Object;)F
    .locals 1

    invoke-static {}, Ll6/ۥۦۣ۟;->ۤۤ۠۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly/j0;

    invoke-virtual {p0}, Ly/j0;->c()F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۤۤ(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lg2/ۢۥۥۡ;->ۣ۟ۤۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/f;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lk6/f;->p(Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۠۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 2

    invoke-static {}, Lx7/۟۟ۦۨۡ;->ۨۨۦۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/k;

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0, p1}, Lk6/k;->u(Lcom/google/android/gms/internal/measurement/zzfi$zzj;)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۡۢۧ()La2/c0;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/layout/ۢۡۤۤ;->ۣ۟۟ۨ۟()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Ll0/u;->o:La2/c0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۤۥۦ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۥۣۦ(Ljava/lang/Object;)Lk6/z6;
    .locals 2

    invoke-static {}, Lz3/۟ۢۢ۟ۢ;->۟۠ۨ۠۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/a7;

    iget-object v1, p0, Lk6/a7;->b:Lk6/z6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۢ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۤۤ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Ly0/o;
    .locals 1

    invoke-static {}, La2/۟ۡۥۦ۟;->۟ۤۨ۟۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Lc0/f;

    invoke-static {p0, p1}, Landroidx/compose/foundation/relocation/a;->a(Ly0/o;Lc0/f;)Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۧ۠ۢ()F
    .locals 1

    invoke-static {}, Landroidx/lifecycle/ۧۥۡۨ;->۟۟ۤۡ۟()I

    move-result v0

    if-lez v0, :cond_0

    sget v0, Ll0/j;->a:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۦ۠(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۢۥ۠ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzdd;

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzb:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۦۦۤ۠()I
    .locals 2

    const v0, -0x100

    sget v1, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۢۡۥۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۧۢۡۨ()Ly/u0;
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->۟ۤۥۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk0/i;->f:Ly/u0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
