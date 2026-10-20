.class public Landroidx/compose/ui/input/pointer/ۨۦۥۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۨۡۧ:I = 0x207


# direct methods
.method public static ۟۟۠ۡ۠(Ljava/lang/Object;)Ly/i1;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۠ۨۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/m2;

    iget-object v1, p0, Lk0/m2;->o:Ly/i1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۨۢ۟([SIII)Ljava/lang/String;
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

.method public static ۟۠ۢ۟ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lu7/ۣ۟ۡ۟;->ۡۤۧۧ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "hi"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦ۟ۡ(Ljava/lang/Object;)Lk6/f5;
    .locals 2

    invoke-static {}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->ۣ۟ۢۥۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/y7;

    iget-object v1, p0, Lk6/y7;->a:Lk6/f5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۡۧۥ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

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

    move-result-object v3

    const-string v0, "a"

    :cond_0
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_3
    if-lt v0, v4, :cond_4

    :goto_4
    array-length v0, v3

    if-lt v1, v0, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

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
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    const-string v0, "a"

    goto :goto_2

    :cond_4
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_4
.end method

.method public static ۟ۢۢۧۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟ۧۢۥ(Ljava/lang/Object;)La4/q;
    .locals 2

    invoke-static {}, Ld4/۟۠۠۟ۢ;->ۦۢ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La5/a;

    iget-object v1, p0, La5/a;->a:La4/q;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۤ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lr7/۟۟ۡ۟ۢ;->۟ۤۨۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/s;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۡۧۥ()I
    .locals 2

    const v0, -0x2da

    sget v1, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۣ۟ۥ۠:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۤۢۨ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lh8/۟ۤۨۨۦ;->ۧۡۤۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/c6;

    iget-object v1, p0, Lk6/c6;->d:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥۨ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Li9/ۨۨ۟;->ۦۧۢۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lo1/k;

    iget-object v1, p0, Lo1/k;->a:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۠ۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۢۧۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzfi$zzb;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzb;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠۟۟(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lw5/ۣۨۧ۠;->ۣۥۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/v1;

    check-cast p1, Lm0/m;

    invoke-virtual {p0, p1, p2}, Ld5/v1;->a(Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۡۢۥ(Ljava/lang/Object;)Lk0/y;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣۡۥۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/f0;

    iget-object v1, p0, Lk0/f0;->f:Lk0/y;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢۤۦ()Lq8/i;
    .locals 1

    invoke-static {}, Lu2/۟ۥۢۥۨ;->۟ۥۣۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, La5/g0;->a:Lq8/i;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۡۦۣ(Ljava/lang/Object;ILjava/lang/Object;I)Landroid/app/PendingIntent;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۣ۟ۤۤۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/Context;

    check-cast p2, Landroid/content/Intent;

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzcc;->zza(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/cct/ۨۡ۠ۦ;->ۢۥۦۧ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "event_id"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۨ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۦۨۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/g6;

    iget-object v1, p0, Lk6/g6;->f:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
