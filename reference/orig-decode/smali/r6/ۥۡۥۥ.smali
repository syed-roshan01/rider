.class public Lr6/ۥۡۥۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۥ۟۠ۤ:I = 0x308


# direct methods
.method public static ۟۠ۡۧۤ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۣۡۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ll2/p;

    iget v1, p0, Ll2/p;->a:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۤۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lc7/۟ۦۣۢۦ;->۟ۦۨۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/b3;

    iget v1, p0, Lk0/b3;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfc$zza;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/ۦۢۨ;->۟۠ۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/t4;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lk6/t4;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfc$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟۠ۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lv0/ۣ۟۟ۤۧ;->ۡۡۥۤ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Shizuku app is not installed. Required for Ola & Uber."

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۟ۡۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lh6/ۧۧۤ۟;->ۣ۟ۡ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Error deleting over the limit events. appId"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۢۦ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lp4/ۣ۟۟ۢۥ;->۟۠ۢۧۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lg5/a;

    iget-object v1, p0, Lg5/a;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۤۥ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۥۦۥۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/s1;

    iget-object v1, p0, Lf0/s1;->a:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۦۣ(Ljava/lang/Object;I)Lcom/google/android/gms/internal/measurement/zzfc$zzc;
    .locals 1

    invoke-static {}, Lh/۟ۡۥۡۧ;->ۣۡۥ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd$zza;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfc$zzd$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfc$zzc;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۦۧ()Lk6/x3;
    .locals 1

    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣۤ۟ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk6/x;->J0:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۨۥۣ(Ljava/lang/Object;)Lk6/k4;
    .locals 2

    invoke-static {}, Lt2/۟ۦۢۡۧ;->ۣۣۥۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/p7;

    iget-object v1, p0, Lk6/p7;->d:Lk6/k4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۟ۧۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->۠ۧۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/f;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lk6/x3;

    invoke-virtual {p0, p1, p2}, Lk6/f;->u(Ljava/lang/String;Lk6/x3;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۨۨۧ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۢۡ۠ۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf5/f0;

    iget-boolean v1, p0, Lf5/f0;->b:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠۟۟ۤ([SIII)Ljava/lang/String;
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

.method public static ۡ۟ۥۢ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۢ۟۟۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lf0/ۣۤ۠۟;->۟ۦۥۣۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/p7;

    invoke-virtual/range {p0 .. p0}, Lk6/p7;->u()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۢۤۥ()I
    .locals 2

    const v0, 0x30b

    sget v1, Ll6/ۣۧۧۧ;->۟ۦۣۧۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۥ۟ۢ(ZLjava/lang/Object;Ljava/lang/Object;ZJJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->ۣۤ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p1, Lc9/a;

    check-cast p2, Ly0/o;

    check-cast p8, Lx/m;

    check-cast p9, Lc9/f;

    check-cast p10, Lm0/m;

    invoke-static/range {p0 .. p12}, Lk0/c4;->a(ZLc9/a;Ly0/o;ZJJLx/m;Lc9/f;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤ۟ۡۢ(D)Z
    .locals 1

    invoke-static {}, Lv7/ۤۦۧ۟;->ۣ۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۦ۟۟()Lk6/x3;
    .locals 1

    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۥۦۥ۟()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk6/x;->O:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۥ۟ۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۧۡۧ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->۠ۦۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzdd;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zze:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
