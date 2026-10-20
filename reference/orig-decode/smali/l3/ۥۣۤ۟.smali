.class public Ll3/ۥۣۤ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۧۥۤۢ:I = 0x39


# direct methods
.method public static ۟۟ۨ۠۟(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lw9/۟۠۠ۢ۟;->ۣ۟ۤۥۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/b0;

    iget-boolean v1, p0, Ld5/b0;->c:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠۟ۧ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lz/۟ۥۣۣ۠;->۟ۢۧۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/n0;

    iget-object v1, p0, Ld5/n0;->e:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦۦ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lr2/ۧۧۢۢ;->ۣ۟۟ۨۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/t0;

    iget-boolean v1, p0, Lf0/t0;->a:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢ۟ۧ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lm5/۟ۥۣۧۥ;->ۡۡۦۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/p7;

    iget-boolean v1, p0, Lk6/p7;->u:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->۟۠ۦۤ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ls4/j;

    iget-object v1, p0, Ls4/j;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۧۥ۠(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟ۥۣۡ(Ljava/lang/Object;)Le0/a;
    .locals 2

    invoke-static {}, Lp7/ۣۣۦۤ;->ۤۨۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/q2;

    iget-object v1, p0, Lk0/q2;->e:Le0/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۦۣ۠(F)F
    .locals 1

    invoke-static {}, Landroidx/lifecycle/ۧۥۡۨ;->۟۟ۤۡ۟()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣ۠ۤ([SIII)Ljava/lang/String;
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

.method public static ۟ۦۧۧۨ(Ljava/lang/Object;I)Lcom/google/android/gms/internal/measurement/zzew$zze;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/۟ۤۧۨ۟;->ۢۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzew$zze;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۦۦ()Lk6/x3;
    .locals 1

    invoke-static {}, Lz3/۟ۡ۠ۦۣ;->ۡۤ۟۟()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk6/x;->W:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦۣۤ(Ljava/lang/Object;Ljava/lang/Object;)Lg2/a0;
    .locals 1

    invoke-static {}, Lb3/۟ۧ۠ۡۥ;->۟ۦۤۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lg2/j;

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lg2/j;->a(Ljava/util/List;)Lg2/a0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lc1/ۣ۟۠ۧۤ;->ۢ۟ۧۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/z4;

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۥۨۤ()I
    .locals 2

    const v0, -0x1c5

    sget v1, Lg9/۠ۨۧۤ;->ۡۢ۟۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۡۦۢۨ(IIII)J
    .locals 2

    invoke-static {}, Lh5/ۧ۟ۨۧ;->ۥۥ۟ۢ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0, p1, p2, p3}, Lm2/a;->a(IIII)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۡ۟(Ljava/lang/Object;)Ljava/util/concurrent/BlockingQueue;
    .locals 2

    invoke-static {}, Lf0/ۣۦۦ۠;->۟ۥۥۣۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/c5;

    iget-object v1, p0, Lk6/c5;->b:Ljava/util/concurrent/BlockingQueue;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۤ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ls6/۟ۡ۟ۧۢ;->ۣ۟۠ۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "referrer API v2"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۤ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/core/app/ۣۥۢۧ;->ۢۥۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "last_bundle_start_timestamp"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
