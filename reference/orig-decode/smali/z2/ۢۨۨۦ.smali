.class public Lz2/ۢۨۨۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۡ۟ۦ:I = -0x2e7


# direct methods
.method public static ۟۠ۢۡۨ([SIII)Ljava/lang/String;
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

.method public static ۟۠ۥۥۥ()J
    .locals 2

    invoke-static {}, Ldagger/hilt/components/ۡۧ۟;->۟ۥۢۧۦ()I

    move-result v0

    if-lez v0, :cond_0

    sget-wide v0, Le5/a;->i:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠ۡۨ()Lk0/f4;
    .locals 1

    invoke-static {}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣ۟ۥۡۦ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lk0/f4;->b:Lk0/f4;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۥۡۦۣ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, La7/۠ۢۧ;->ۣۤ۟ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/x3;

    iget-object v1, p0, Lk6/x3;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۟۟ۧ(Ljava/lang/Object;)Lk0/m4;
    .locals 2

    invoke-static {}, Lf4/ۦۣ۟ۦ;->۟ۡۤۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/k1;

    iget-object v1, p0, Lk0/k1;->e:Lk0/m4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧۦ()Li1/f;
    .locals 1

    invoke-static {}, La/ۥۡۢۨ;->۟ۨۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lf6/a;->j:Li1/f;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۨ۟(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lc4/۟ۦۧۦۤ;->ۡ۟۟ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/r4;

    iget-boolean v1, p0, Lk0/r4;->x:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۤۧ(Ljava/lang/Object;)Lc9/c;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->۟ۤۥ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/r1;

    iget-object v1, p0, Lf0/r1;->o:Lc9/c;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢۨ()Lcom/google/android/gms/internal/measurement/zzew$zzf$zza;
    .locals 1

    invoke-static {}, Lu1/ۢۥ۠ۤ;->ۦۡۧۥ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzew$zzf$zza;->zzb:Lcom/google/android/gms/internal/measurement/zzew$zzf$zza;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۨۢۥ(Ljava/lang/Object;)Lm2/l;
    .locals 2

    invoke-static {}, Lc4/۟ۦۧۦۤ;->ۡ۟۟ۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/j1;

    iget-object v1, p0, Lf0/j1;->k:Lm2/l;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢۦۨ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/iid/ۥۣۣۡ;->ۣ۟۟۟ۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/b4;

    invoke-virtual {p0}, Lk6/b4;->x()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤ۠ۥ۟(F)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ls7/ۧۤۦۤ;->۟۟ۦۣ۟()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۥۡ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۦۡۢۡ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۣ۟۠ۥۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->o:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۥۨۥ()I
    .locals 2

    const v0, 0x1b5

    sget v1, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۥۤ۠۠:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۧۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Le8/۟۠ۦ۟ۢ;->۟ۥۧۤۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/i7;

    iget-object v1, p0, Lk6/i7;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۥۧۨ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, La6/۟ۤۨۨ۟;->ۥۣۤۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/y5;

    invoke-virtual {p0}, Lk6/y5;->O()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method
