.class public Lf0/ۣۦۦ۠;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۤۡۡ۟:I = -0x322


# direct methods
.method public static ۟۠۠۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)La2/c0;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->۟۠ۦۤ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La2/c0;

    check-cast p1, Lm2/l;

    invoke-static {p0, p1}, Lo1/s;->g0(La2/c0;Lm2/l;)La2/c0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ۠ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Ln/ۣۣۢۢ;->ۨۡ۠۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/j6;

    iget-object v1, p0, Lk6/j6;->d:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۡۨۡ(Ljava/lang/Object;Ljava/lang/Object;D)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۣ۟۠ۥۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/os/BaseBundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢ۟ۥۢ(Ljava/lang/Object;)Lf0/k1;
    .locals 2

    invoke-static {}, Lm7/ۡۢۦۢ;->ۣ۟ۡۡۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/h1;

    iget-object v1, p0, Lf0/h1;->e:Lf0/k1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۤ۟۠(Ljava/lang/Object;)Ljava/util/Map;
    .locals 2

    invoke-static {}, Ld/۟ۤ۠ۡۨ;->ۦۢۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/a8;

    iget-object v1, p0, Lk6/a8;->f:Ljava/util/Map;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۡۤ([SIII)Ljava/lang/String;
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

.method public static ۟ۥۢۧ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۥۥۣۢ()I
    .locals 2

    const v0, -0x199

    sget v1, Ld1/ۣۧۡۡ;->ۧ۠ۦۣ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۧۥۤۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lk4/۟۠ۦ۟ۤ;->۟۠ۧۥ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "en"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۠ۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Ld4/۟۠۠۟ۢ;->ۦۢ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/k1;

    check-cast p1, Ly/v;

    check-cast p2, Lm0/m;

    invoke-virtual {p0, p1, p2, p3}, Ld5/k1;->a(Ly/v;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۡۢۨ(ILjava/lang/Object;)Lk6/s5;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->۟ۧۥۢ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lk6/s5;->c(ILjava/lang/String;)Lk6/s5;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۢ۟ۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۢۨ۠(Ljava/lang/Object;)Lk6/w4;
    .locals 2

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۦ۟۟ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/y5;

    iget-object v1, p0, Lk6/y5;->q:Lk6/w4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۤۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;JJJJLjava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lv0/۟ۤۧ۠ۧ;->۟ۤ۠ۤۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Lc9/e;

    check-cast p2, Lc9/e;

    check-cast p4, Le1/l0;

    check-cast p13, Lc9/e;

    check-cast p14, Lm0/m;

    invoke-static/range {p0 .. p16}, Lk0/k3;->a(Ly0/o;Lc9/e;Lc9/e;ZLe1/l0;JJJJLc9/e;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤ۠ۦۡ()Li1/f;
    .locals 2

    invoke-static {}, Ld8/ۣۡۡ۠;->۟۠ۧۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lo7/d0;->H()Li1/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Landroidx/compose/ui/draw/ۧۤۡۧ;->ۣۨ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Le1/l0;

    check-cast p2, Lk0/g0;

    check-cast p3, Lk0/h0;

    check-cast p4, Lu/w;

    check-cast p5, Lc9/f;

    check-cast p6, Lm0/m;

    invoke-static/range {p0 .. p8}, Lf6/a;->a(Ly0/o;Le1/l0;Lk0/g0;Lk0/h0;Lu/w;Lc9/f;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۦۧۤ()[B
    .locals 1

    invoke-static {}, La/ۥۦۥۡ;->ۡۡۤ۟()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Ly3/e;->f:[B

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۦۦ۠(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۣ۟ۧۦ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->P0:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۨۡ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۠ۥۧۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/o3;

    iget v1, p0, Lk0/o3;->p:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۢۧۦ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->ۢ۠ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/l;

    iget-wide v2, p0, Lk6/l;->d:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۨ۠ۦۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۣۣۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/b;

    iget v1, p0, Lk0/b;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۤۦۢ(I)I
    .locals 1

    invoke-static {}, Lw4/۟ۤ۠۟ۨ;->۟ۦۤۢۡ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {p0}, Lcom/google/protobuf/h2;->D(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۥۤ(Ljava/lang/Object;)[B
    .locals 2

    invoke-static {}, Lp3/۟ۢ۟۟ۥ;->ۣ۠ۧۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/m6;

    iget-object v1, p0, Lk6/m6;->d:[B

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
