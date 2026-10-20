.class public Ld9/ۨۧۧۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۟۟ۥۨۢ:I = 0x347


# direct methods
.method public static ۟۟۠ۤ۟()Lu0/b;
    .locals 1

    invoke-static {}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤۡ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Ld5/s;->d:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lv8/۟ۧۢ۟ۢ;->ۨۥۦۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Lc9/c;

    check-cast p2, Lm0/m;

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/a;->b(Ly0/o;Lc9/c;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۡۢ۠(Ljava/lang/Object;)Lc9/f;
    .locals 2

    invoke-static {}, Lj2/ۥ۠ۨۢ;->ۣۢۡۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/i4;

    iget-object v1, p0, Lk0/i4;->n:Lc9/f;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟۠ۤ(Ljava/lang/Object;I)C
    .locals 1

    invoke-static {}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۥۤ(Ljava/lang/Object;J)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۡۢۤۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/a5;

    invoke-virtual {p0, p1, p2}, Lk6/a5;->m(J)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤۦ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤۤ۟ۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/m4;

    iget-wide v2, p0, Lk0/m4;->d:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦ۠۟(Ljava/lang/Object;)Lk0/m4;
    .locals 2

    invoke-static {}, Li/ۢۥۣ۟;->ۢۢۡۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/l1;

    iget-object v1, p0, Lk0/l1;->x:Lk0/m4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, La2/ۢۦۧۦ;->ۤۦۦۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzew$zzc;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzew$zzc;->zze()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۡۨ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lu4/ۧۦۦۧ;->۟ۤۦۢ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/i0;

    iget-wide v2, p0, Lk0/i0;->F:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟۟ۧ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟ۦ۠ۤۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/i0;

    iget-wide v2, p0, Lk0/i0;->o:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧ۟ۤ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۠ۢۨ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lq9/۟ۧۦۤۨ;->۟ۤۧۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/k2;

    iget-object v1, p0, Lk0/k2;->e:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 1

    invoke-static {}, Lq6/ۡۨۧۨ;->۟ۢۦۦۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/y5;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual/range {p0 .. p5}, Lk6/y5;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۡۡ۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lm7/ۥۨۥ۟;->۟ۡ۟ۤ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lm0/q2;

    invoke-virtual/range {p0 .. p0}, Lm0/q2;->i()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۡۢۤ()Z
    .locals 2

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣ۟۟ۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqk;->zza()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۦۧۨ(Ljava/lang/Object;)Lm2/b;
    .locals 2

    invoke-static {}, Lk2/۟ۢۦۤۤ;->۟ۦۣۤ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/t;

    iget-object v1, p0, Lf0/t;->y:Lm2/b;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۤۤۦ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lc1/ۢۥۥ۟;->۟ۢۨۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf5/m;

    iget-object v1, p0, Lf5/m;->d:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۢ۟ۧ()Ljava/util/concurrent/TimeUnit;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/layout/ۢۡۤۤ;->ۣ۟۟ۨ۟()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧ۟ۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/compose/ui/graphics/ۦۦۡۦ;->ۣ۟ۥۧۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-virtual {p0}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->s()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۧۤۨۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۨۡ۠(Ljava/lang/Object;)Lb1/a;
    .locals 2

    invoke-static {}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->ۣ۟ۢۥۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lb1/d;

    iget-object v1, p0, Lb1/d;->a:Lb1/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۢۥۢ()Ly0/l;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟ۦ۟ۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Ly0/l;->b:Ly0/l;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۤۨ([SIII)Ljava/lang/String;
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

.method public static ۨۦ()I
    .locals 2

    const v0, 0x3c1

    sget v1, Lb8/ۣ۟ۨۢۥ;->۠ۥ۠۠:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۨۧۧۤ()F
    .locals 1

    invoke-static {}, Lx2/۟ۢۥ;->ۢۤۥۨ()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Ll0/k;->a:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۨۤۦ(Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lu/ۤ;->ۣ۟ۢۡۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    invoke-static {p0, p1, p2}, Ly3/e;->c1(Landroid/os/Parcel;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method
