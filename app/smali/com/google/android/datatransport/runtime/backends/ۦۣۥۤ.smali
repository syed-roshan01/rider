.class public Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۧۤۡ:I = -0x22c


# direct methods
.method public static ۣ۟ۡۢۦ([SIII)Ljava/lang/String;
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

.method public static ۟ۡۨۡۧ()I
    .locals 2

    const v0, -0x364

    sget v1, Lq6/ۣ۟ۢ۟ۤ;->ۡ۠ۢۦ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۢۦۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۨ۠ۡۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/widget/Toast;

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۨۤۢ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lt0/ۣ۟۠ۡۢ;->۟ۤۤۦۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/d0;

    iget v1, p0, Lk0/d0;->e:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟ۢۡ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/auto/accept/data/model/ۣ۟ۥۤ۟;->ۤۥۧۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/n6;

    check-cast p2, Ljava/io/IOException;

    check-cast p3, [B

    check-cast p4, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3, p4}, Lk6/n6;->a(ILjava/io/IOException;[BLjava/util/Map;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۧ۠()Lu0/b;
    .locals 1

    invoke-static {}, Lg/۟۠ۡۨۨ;->ۣۣ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lc5/c;->d:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۢۦۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, La8/ۣۡۨ۠;->۟ۡۤۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/p1;

    iget v1, p0, Lk0/p1;->z:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۤۨۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lo2/۟ۤۨۡۥ;->ۦۦۦۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/v7;

    iget-object v1, p0, Lk6/v7;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۨۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۡ۠ۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lb1/۟ۥۥ۟ۢ;->ۦۤۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/e1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Ld5/e1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۥۦۦ()Lt1/p;
    .locals 1

    invoke-static {}, Lw9/۟۠۠ۢ۟;->ۣ۟ۤۥۥ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lx9/g;->c:Lt1/p;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۡ۟ۤ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Laa/۟ۦۣۢۨ;->۟۠ۡ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfc$zza;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfc$zza;->zzf()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۢۤۤ(Ljava/lang/Object;)Lp9/q0;
    .locals 2

    invoke-static {}, Ln9/ۤۧۧۤ;->ۢۦ۠۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->R:Lp9/q0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JFJJJJLjava/lang/Object;III)V
    .locals 1

    invoke-static {}, Le1/ۦۣۢۥ;->ۣۨۥۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lc9/e;

    check-cast p1, Ly0/o;

    check-cast p2, Lc9/e;

    check-cast p3, Lc9/e;

    check-cast p4, Lc9/e;

    check-cast p5, Le1/l0;

    check-cast p17, Lm0/m;

    invoke-static/range {p0 .. p20}, Lk0/i;->a(Lc9/e;Ly0/o;Lc9/e;Lc9/e;Lc9/e;Le1/l0;JFJJJJLm0/m;III)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۧۨۧۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۨۤۧۥ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۨۨ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/z4;

    invoke-virtual {p0}, Lk6/z4;->x()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۨۡ۠(Ljava/lang/Object;)Lb0/h0;
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement/ۢۥۤۦ;->ۥۣۦۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/s0;

    iget-object v1, p0, Ld5/s0;->b:Lb0/h0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
