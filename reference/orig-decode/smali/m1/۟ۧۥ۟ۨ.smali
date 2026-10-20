.class public Lm1/۟ۧۥ۟ۨ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۤۢۤۧ:I = -0x2d0


# direct methods
.method public static ۣ۟ۦ۟۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟ۨ۟۟(Ljava/lang/Object;)Landroid/content/pm/ServiceInfo;
    .locals 2

    invoke-static {}, Lu3/ۣۡۡۢ;->ۡ۟ۢۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/pm/ResolveInfo;

    iget-object v1, p0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۟ۧۡ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Landroidx/lifecycle/ۧۥۡۨ;->۟۟ۤۡ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/r3;

    iget v1, p0, Lk0/r3;->c:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡۤۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lh/۟ۡۥۡۧ;->ۣۡۥ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/y6;

    iget v1, p0, Lk6/y6;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟۠ۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Ly/۟ۤۥۨ;->ۡ۟ۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf5/l;

    iget-object v1, p0, Lf5/l;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۢۧۥ()Lcom/google/android/gms/internal/measurement/zzew$zzf$zza;
    .locals 1

    invoke-static {}, Lea/۟ۦۢۦۤ;->ۣۨۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzew$zzf$zza;->zze:Lcom/google/android/gms/internal/measurement/zzew$zzf$zza;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۤ۠۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lu8/ۨۡ۠;->ۨۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/p7;

    check-cast p1, Lk6/x7;

    invoke-virtual {p0, p1}, Lk6/p7;->E(Lk6/x7;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۥۤ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/core/app/ۣۥۢۧ;->ۢۥۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۢۨۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/ktxtesting/ۤۢۤۡ;->ۥۣۦ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lr1/x0;

    iget v1, p0, Lr1/x0;->b:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۡۨۧ([SIII)Ljava/lang/String;
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

.method public static ۢۢ۠۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lc3/۟ۥ۠ۡۧ;->۟ۥ۠ۨۢ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "("

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۦ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lr9/۟ۢۢۤۨ;->ۣ۟ۤۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/a3;

    check-cast p1, Ly0/o;

    check-cast p2, Lc9/f;

    check-cast p3, Lm0/m;

    invoke-static/range {p0 .. p5}, Lm9/e0;->i(Lk0/a3;Ly0/o;Lc9/f;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣۣ۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, La/ۥۡۢۨ;->۟ۨۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/zip/GZIPInputStream;

    invoke-virtual {p0}, Ljava/util/zip/GZIPInputStream;->close()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۠ۧۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->۠ۧۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzad;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzad;->zzb()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۠۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lk6/j;
    .locals 1

    invoke-static {}, Lw4/ۥۧۡۥ;->ۧۢۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/h5;

    check-cast p1, Lk6/x7;

    invoke-virtual {p0, p1}, Lk6/h5;->d(Lk6/x7;)Lk6/j;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۡۤ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟۠ۢۦۧ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpa;->zzd()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۢۧۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۧۢۢۦ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ld4/۟۠۠۟ۢ;->ۦۢ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/m4;

    iget-wide v2, p0, Lk0/m4;->h:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۧۢۨۢ(Ljava/lang/Object;)Le1/l0;
    .locals 2

    invoke-static {}, Ly/۟ۤۥۨ;->ۡ۟ۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/k;

    iget-object v1, p0, Lk0/k;->d:Le1/l0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۥۣۣ()I
    .locals 2

    const v0, -0x4c

    sget v1, Lca/ۨۤۢۥ;->ۥۥۧۢ:I

    xor-int/2addr v0, v1

    return v0
.end method
