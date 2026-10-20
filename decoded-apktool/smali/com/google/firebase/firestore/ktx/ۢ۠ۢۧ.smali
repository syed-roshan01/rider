.class public Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۡ۠ۤۧ:I = 0x1a2


# direct methods
.method public static ۟۟ۡۥۥ()Lu0/b;
    .locals 1

    invoke-static {}, Lcom/google/firebase/inject/ۣۣ۟۠ۧ;->ۦۨۡ۟()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lc5/c;->h:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۦۨۤ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟۠ۤۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۡۡۨۢ()J
    .locals 4

    invoke-static {}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤۡ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzne;->zzu()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥۦۣ()Lk0/l4;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۦۨۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk0/l4;->a:Lk0/l4;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۢۡۥ(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->ۧۥۣ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/os/BaseBundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠ۡۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lu3/ۣۡۡۢ;->ۡ۟ۢۢ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Waiting for Payment"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۟ۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/processedrootsentinel/۟ۥ۠۠۠;->۟ۥۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Li1/f;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p5, Ly0/o;

    check-cast p6, Lm0/m;

    invoke-static/range {p0 .. p8}, Ld5/o1;->m(Li1/f;Ljava/lang/String;Ljava/lang/String;JLy0/o;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۥۨۤ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Lm4/۟ۧۤ۠;->ۨ۟ۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->B:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢۥۧ()I
    .locals 2

    const v0, 0x37e

    sget v1, Ls8/ۣۡۡ۠;->ۣ۟ۧۧ۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۢۥۢۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->ۨۤۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ls0/b;

    iget-object v1, p0, Ls0/b;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۥۨ([SIII)Ljava/lang/String;
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

.method public static ۥ۟۠ۤ()J
    .locals 2

    invoke-static {}, Lq6/ۣ۟ۢ۟ۤ;->۟۠ۧ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-wide v0, Ld1/f;->c:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۡۥ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lq7/۟ۢۡ۟۟;->۟ۦۣۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/r0;

    iget v1, p0, Ld5/r0;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣۣ۟(Ljava/lang/Object;)Lk6/n6;
    .locals 2

    invoke-static {}, Lf4/ۡۤۡ;->ۡ۟ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/m6;

    iget-object v1, p0, Lk6/m6;->a:Lk6/n6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۥۡۨ(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    invoke-static {}, Lea/۟ۦۢۦۤ;->ۣۨۡۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/q;

    check-cast p3, Lk6/q6;

    invoke-virtual {p0, p1, p2, p3}, Lk6/q;->t(JLk6/q6;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۨ۠ۢ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۦۨۧۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/w3;

    invoke-interface {p0}, Lk6/w3;->zza()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ls0/ۢۨۦ۟;->ۣۡۨۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/u7;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lk6/u7;->m0(Ljava/lang/String;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣۥۥ()Lcom/google/android/gms/internal/measurement/zzfc$zzd$zza;
    .locals 2

    invoke-static {}, Lz1/۟ۦ۟۠۟;->۟۠ۦۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zze()Lcom/google/android/gms/internal/measurement/zzfc$zzd$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۢۨۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Le2/۟ۤۢۦ;->ۣ۟ۢۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/k5;

    iget-object v1, p0, Lk6/k5;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۥۣۥ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->ۣۨۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/e;

    iget-object v1, p0, Ld5/e;->e:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨ۟ۡۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->۟۠ۦۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/n1;

    iget-boolean v1, p0, Lk0/n1;->f:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۢۥۢ(Ljava/lang/Object;)Lf0/c2;
    .locals 2

    invoke-static {}, La8/ۣۡۨ۠;->۟ۡۤۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/w;

    iget-object v1, p0, Lf0/w;->d:Lf0/c2;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
