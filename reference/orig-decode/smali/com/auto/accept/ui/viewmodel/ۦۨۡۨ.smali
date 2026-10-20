.class public Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;
.super Ljava/lang/Object;


# static fields
.field public static ۢۤۥۡ:I = -0x2ad


# direct methods
.method public static ۟۟ۧ۟ۤ(Ljava/lang/Object;)Lf0/c2;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۠ۨۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/o;

    iget-object v1, p0, Lf0/o;->b:Lf0/c2;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠ۨۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Le1/۟ۡۡۤۡ;->۟ۦۣۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "app_id=?"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦ۟ۥ(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1

    invoke-static {}, Lh7/۟۟ۧۨ۟;->۟ۡۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll9/h;->D0(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۧۥۤ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۢۥۦۢ()Z
    .locals 2

    invoke-static {}, Lv7/ۤۦۧ۟;->ۣ۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpf;->zza()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۥ۠()I
    .locals 2

    const v0, 0xf9

    sget v1, Lh7/۟۟ۧۨ۟;->۟ۤۢۡۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟ۥۥۨ(Ljava/lang/Object;)Lk6/v5;
    .locals 2

    invoke-static {}, Lcom/google/firebase/iid/ۥۣۣۡ;->ۣ۟۟۟ۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/y5;

    iget-object v1, p0, Lk6/y5;->d:Lk6/v5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۡۥۨ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lh5/ۢ۠۠۟;->۟ۦ۠ۡۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/io/File;

    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->createNewFile()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۦۦ(Ljava/lang/Object;)Landroidx/compose/ui/node/a;
    .locals 1

    invoke-static {}, Lia/۟۠ۡۦ۟;->ۦ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/compose/ui/node/a;

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠ۤۡ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Ll0/ۤ۠ۧ;->۟ۦ۟ۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/i;

    iget-object v1, p0, Ld5/i;->o:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۨۡۧ(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣ۟ۤۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfy;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfy;->zza()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧ۟(Ljava/lang/Object;)Lm0/l3;
    .locals 2

    invoke-static {}, Lc0/ۦۢۦۥ;->ۢۢۨ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/g1;

    iget-object v1, p0, Ld5/g1;->n:Lm0/l3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠۠ۥۧ(Ljava/lang/Object;)Ljava/io/Serializable;
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/connector/ۣ۟ۢۢ۟;->۟ۦۣۣۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/s1;

    iget-object v1, p0, Ld5/s1;->c:Ljava/io/Serializable;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۤۥۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۢۡۦۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/database/collection/ۨۤ۟ۧ;->۟ۢۡۨۡ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "Anti-Detection (Stealth Mode)"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۢ۟ۤ([SIII)Ljava/lang/String;
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

.method public static ۢۢۨ()Lk6/x3;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟ۦ۟ۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk6/x;->y0:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۨۤ(Ljava/lang/Object;B)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۨ۠ۡۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/protobuf/v;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/v;->r0(B)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۢۢ۟()J
    .locals 2

    invoke-static {}, Lz/ۨۤۥۨ;->ۡ۠ۨۡ()I

    move-result v0

    if-gez v0, :cond_0

    sget-wide v0, Ll0/c;->z:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣۦۨۤ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lh5/ۢ۠۠۟;->۟ۦ۠ۡۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/f5;

    invoke-virtual {p0}, Lk6/f5;->n()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۨۥۤ(Ljava/lang/Object;)Le1/l0;
    .locals 2

    invoke-static {}, Ls3/۟ۧ۟ۡۢ;->۟۠ۤۨۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/t3;

    iget-object v1, p0, Lk0/t3;->o:Le1/l0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۥ۟۠()Lf0/t0;
    .locals 1

    invoke-static {}, Lq7/۟ۢۡ۟۟;->۟ۦۣۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lf0/t0;->O:Lf0/t0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧۡۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ld3/ۡۨۢۦ;->۟ۢۧۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/x7;

    iget-object v1, p0, Lk6/x7;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۨۤ۠(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ld7/ۢۧۧۢ;->ۨ۠ۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lm0/q;

    invoke-virtual {p0}, Lm0/q;->G()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۦۤۡ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lu4/ۧۦۦۧ;->۟ۤۦۢ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/i2;

    iget-object v1, p0, Ld5/i2;->c:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
