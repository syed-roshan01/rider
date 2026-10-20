.class public Lz3/۟ۡ۠ۦۣ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۠ۦۣ:I = 0x37


# direct methods
.method public static ۟۟۠ۢۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->۠ۧۧۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly/d;

    check-cast p1, Lm2/b;

    check-cast p3, [I

    check-cast p4, Lm2/l;

    check-cast p5, [I

    invoke-virtual/range {p0 .. p5}, Ly/d;->b(Lm2/b;I[ILm2/l;[I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۡ۠۟(Ljava/lang/Object;)Lf0/d2;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۥۣۤۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/c2;

    invoke-virtual {p0}, Lf0/c2;->d()Lf0/d2;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦۥۣ(JJLjava/lang/Object;I)Lk0/y;
    .locals 1

    invoke-static {}, Ls0/ۧۧۨۥ;->ۦۦۤ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p4, Lm0/m;

    invoke-static/range {p0 .. p5}, Lk0/z;->a(JJLm0/m;I)Lk0/y;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۟ۡۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۡۤۡۦ()F
    .locals 1

    invoke-static {}, Lc3/۟ۥ۠ۡۧ;->۟ۥ۠ۨۢ()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Lk0/b2;->a:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۧۢۨ(FFF)F
    .locals 1

    invoke-static {}, Ln9/ۤۧۧۤ;->ۢۦ۠۠()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0, p1, p2}, Lz6/a;->q(FFF)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۤ۠()Lm0/p0;
    .locals 1

    invoke-static {}, Ld8/ۣۡۡ۠;->۟۠ۧۨۤ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lh0/c1;->a:Lm0/p0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۧۤ(Ljava/lang/Object;)Lk6/q6;
    .locals 2

    invoke-static {}, Lr2/ۡۧۥۧ;->ۢۥۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/p6;

    iget-object v1, p0, Lk6/p6;->j:Lk6/q6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۤ۠ۨ(Ljava/lang/Object;)Lo1/z;
    .locals 2

    invoke-static {}, Ls3/۟ۧ۟ۡۢ;->۟۠ۤۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/e1;

    iget-object v1, p0, Lf0/e1;->b:Lo1/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۣۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lv5/ۥۧ۟ۦ;->ۡ۠ۧۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/j2;

    iget v1, p0, Lk0/j2;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۤ۟۟()I
    .locals 2

    const v0, -0x3f9

    sget v1, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣۨ۠ۥ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۢ۠ۦ([SIII)Ljava/lang/String;
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

.method public static ۢۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;
    .locals 1

    invoke-static {}, Lh5/ۢ۠۠۟;->۟ۦ۠ۡۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۟ۤ(Ljava/lang/Object;)F
    .locals 1

    invoke-static {}, Le9/ۧۧۡ;->ۨۦ۟ۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lt1/c1;

    invoke-virtual/range {p0 .. p0}, Lt1/c1;->c()F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۨ()J
    .locals 2

    invoke-static {}, Lu4/۟ۡۢۦۣ;->ۣۣۧۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget-wide v0, La2/b0;->b:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۟ۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۥۣ۟(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->ۣۣ۟ۡۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/p4;

    iget-wide v2, p0, Lk0/p4;->b:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۥۡۤۢ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣۨۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/t4;

    iget-wide v2, p0, Lk0/t4;->a:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۦ۟ۦۢ(Ljava/lang/Object;)Lf0/c2;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/input/key/ۣۢۥۢ;->ۢۧۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/v;

    iget-object v1, p0, Lf0/v;->b:Lf0/c2;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۧۦ۠(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Ldagger/hilt/ۣ۟ۧۤ۠;->۟ۦ۟ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧۡۡ(Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 2

    invoke-static {}, Lt0/ۣ۟۠ۡۢ;->۟ۤۤۦۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lm0/q2;

    iget-object v1, p0, Lm0/q2;->e:Ljava/util/HashMap;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۧۨۡ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Le1/۟ۡۡۤۡ;->۟ۦۣۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/w1;

    iget v1, p0, Lk0/w1;->n:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۥۧۦ(Ljava/lang/Object;)Lk6/z4;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/ۡۡۨۦ;->ۣۢ۠ۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/p7;

    invoke-virtual {p0}, Lk6/p7;->zzl()Lk6/z4;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۨۥ(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Lp7/ۣۣۦۤ;->ۤۨۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzk()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
