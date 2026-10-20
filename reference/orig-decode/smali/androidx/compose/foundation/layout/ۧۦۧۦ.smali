.class public Landroidx/compose/foundation/layout/ۧۦۧۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۥۨ۠۠:I = -0x3b5


# direct methods
.method public static ۟۟ۦۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ld9/ۧۧۨۥ;->۠ۦۢۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/c1;

    invoke-virtual {p0, p1}, Lf0/c1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠۟ۨۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟ۡۨۡ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 1

    invoke-static {}, Lv9/۠ۡۨۨ;->ۣۤۢۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢ۠ۧ()I
    .locals 1

    invoke-static {}, Lfa/ۦۣۡۢ;->ۧۦۣ۟()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Ll0/g;->e:I

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟ۡۨۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦ۠۟۟()J
    .locals 2

    invoke-static {}, Lz/ۨۤۥۨ;->ۡ۠ۨۡ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-wide v0, Ll0/c;->G:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۟ۧۨ(Ljava/lang/Object;)Le1/l0;
    .locals 2

    invoke-static {}, Lf6/ۣۣۣۣ۟;->۟ۡۧ۟ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/f0;

    iget-object v1, p0, Lk0/f0;->e:Le1/l0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۧۥ([SIII)Ljava/lang/String;
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

.method public static ۟ۧ۠ۨ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۤۦۧ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/s1;

    iget-object v1, p0, Ld5/s1;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥۣۦ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۧۧۤۡ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lg3/۟ۥۣۣۥ;->۟ۤۡۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/z6;

    iget-boolean v1, p0, Lk6/z6;->a:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۥۣۧ(Ljava/lang/Object;)Ly0/n;
    .locals 2

    invoke-static {}, Lt1/ۧۦۤۧ;->ۣۡ۠ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ly0/n;

    iget-object v1, p0, Ly0/n;->f:Ly0/n;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۨ۟ۢ(Ljava/lang/Object;)Lk6/n4;
    .locals 2

    invoke-static {}, Lx8/ۢۨۥۨ;->۟۟ۢ۠ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/l4;

    iget-object v1, p0, Lk6/l4;->s:Lk6/n4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۧۥۧ(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzew$zze;
    .locals 2

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/c;

    iget-object v1, p0, Lk6/c;->g:Lcom/google/android/gms/internal/measurement/zzew$zze;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Lv9/۠ۡۨۨ;->ۣۤۢۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۤۤ(Ljava/lang/Object;IZ)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lp7/ۣۣۦۤ;->ۤۨۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lk6/u7;->y(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۢۢ()I
    .locals 2

    const v0, 0x1c4

    sget v1, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->۟۟ۢ۠۠:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۥ۠ۨۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۣۣۤۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۧۢۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ly6/۟ۤۥۥۥ;->۠۠ۤ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/h;

    iget v1, p0, Lk0/h;->d:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۡۤۢ(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    invoke-static {}, Lcom/google/firebase/iid/ۣۨۥۣ;->۠ۡۡۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/t;

    iget-object v1, p0, Lk6/t;->j:Ljava/lang/Long;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۥ۠۟(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lg2/۟۠ۡۡۦ;->ۨۡۤۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/r4;

    iget-boolean v1, p0, Lk0/r4;->d:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۥۢۡ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lu7/ۣ۟ۡ۟;->ۡۤۧۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/i0;

    iget-wide v2, p0, Lk0/i0;->h:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method
