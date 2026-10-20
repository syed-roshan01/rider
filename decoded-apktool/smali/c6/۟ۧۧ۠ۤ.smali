.class public Lc6/۟ۧۧ۠ۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۧ۟ۧۥ:I = -0x328


# direct methods
.method public static ۟۟۟ۧۦ(Ljava/lang/Object;)Lr1/x0;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->ۡۢۥۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/t1;

    iget-object v1, p0, Lk0/t1;->o:Lr1/x0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۡۦۨ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۡۢۡۡ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۥۦۥ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/d4;

    iget v1, p0, Lk0/d4;->b:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۨۦ۟(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ld1/۟۟ۥۡۡ;->ۨۤۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/s0;

    iget v1, p0, Ld5/s0;->c:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۥۢۤ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lk4/۟۠ۦ۟ۤ;->۟۠ۧۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/c0;

    iget-boolean v1, p0, Ld5/c0;->d:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۥۦۢ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->۟ۡۧۡۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/b1;

    iget-wide v2, p0, Lk0/b1;->a:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۧۡۦ(JLjava/lang/Object;I)Lk0/g0;
    .locals 1

    invoke-static {}, Lc0/ۦ۠۟ۥ;->ۦۢ۠ۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p2, Lm0/m;

    invoke-static {p0, p1, p2, p3}, Lk0/t0;->d(JLm0/m;I)Lk0/g0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۧۥۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Li/ۢۥۣ۟;->ۢۢۡۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/auto/accept/data/model/AppConfig;

    invoke-virtual {p0}, Lcom/auto/accept/data/model/AppConfig;->getMaintenanceMessage()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡۧۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lb/۠ۨۦۥ;->۟۟۠۠ۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/z;

    invoke-virtual {p0}, Lf0/z;->invoke()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۦ۠ۦ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Lw4/۟ۤ۠۟ۨ;->۟ۦۤۢۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lz4/d;

    iget-object v1, p0, Lz4/d;->w:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۡ۟۠(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lm5/۟ۥۣۧۥ;->ۡۡۦۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfc$zzc$zza;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfc$zzc$zza;->zzc()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧۨۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lv0/ۣ۟۟ۤۧ;->ۡۡۥۤ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "Database error querying filters. appId"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥۧۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۣۣۧۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzew$zzd;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzew$zzd;->zzd()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۨۨۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۢۥۡ()Le0/e;
    .locals 1

    invoke-static {}, Lc7/۟ۦۣۢۦ;->۟ۦۨۢ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk0/p2;->a:Le0/e;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۦۡۡ([SIII)Ljava/lang/String;
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

.method public static ۣۥۣ۟()I
    .locals 2

    const v0, -0x10e

    sget v1, Lcom/google/android/gms/common/util/۟ۧۤ۟ۥ;->ۦۣۤۤ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۥۢۨۨ(Ljava/lang/Object;I)Lm0/s0;
    .locals 1

    invoke-static {}, Lg/۟ۧ۠ۤ;->ۢۢۥۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lm0/q2;

    invoke-virtual {p0, p1}, Lm0/q2;->H(I)Lm0/s0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣۢۦ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Ln9/ۤۧۧۤ;->ۢۦ۠۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->s:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۦۥۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lz2/ۢۨۨۦ;->ۦۥۨۥ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "(2)Read invalid user property value, ignoring it"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧ۠۠(Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 1

    invoke-static {}, Lw1/ۦۣۦۧ;->ۨۦۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Li3/a0;

    invoke-virtual {p0}, Li3/a0;->h()Landroid/os/Bundle;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 1

    invoke-static {}, Lc1/ۣۢۧۨ;->ۡۢۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ll/t;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Landroid/os/Bundle;

    invoke-virtual/range {p0 .. p5}, Ll/t;->e(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۨۨۧ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->ۢ۠۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lh0/v0;

    invoke-virtual {p0}, Lh0/v0;->f()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method
