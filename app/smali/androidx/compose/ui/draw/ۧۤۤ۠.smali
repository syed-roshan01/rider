.class public Landroidx/compose/ui/draw/ۧۤۤ۠;
.super Ljava/lang/Object;


# static fields
.field public static ۣۧ۟ۢ:I = -0x1e1


# direct methods
.method public static ۟۟۠ۢۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟۟ۤۥۡ(Ljava/lang/Object;JZ)I
    .locals 1

    invoke-static {}, Lu3/ۣۡۡۢ;->ۡ۟ۢۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/d2;

    invoke-virtual {p0, p1, p2, p3}, Lf0/d2;->b(JZ)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۤۡۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->ۣ۟۠۠ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La2/p;

    iget v1, p0, La2/p;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۡۧ۟()Z
    .locals 2

    invoke-static {}, Lg2/ۢۥۥۡ;->ۣ۟ۤۢۡ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznk;->zzb()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۡۧ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lg9/۠ۨۧۤ;->۟ۥ۟ۧۦ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Install Shizuku App (Play Store)"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟ۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۦۣۣۨ([SIII)Ljava/lang/String;
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

.method public static ۟ۦۥ۠ۦ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣۨۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->k:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۟ۥ۟(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/StringBuilder;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->ۣۣ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۦ۟()I
    .locals 2

    const v0, 0x303

    sget v1, Ln8/ۢۡۨۨ;->۠۟ۢۦ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۢۧۢۡ(Ljava/lang/Object;)Lh0/v0;
    .locals 2

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۤۦۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/x;

    iget-object v1, p0, Lf0/x;->o:Lh0/v0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۨۢۢ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Ln/ۣۣۢۢ;->ۨۡ۠۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/g1;

    iget-object v1, p0, Ld5/g1;->x:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJJFLjava/lang/Object;Ljava/lang/Object;III)V
    .locals 1

    invoke-static {}, Lh4/۟ۧۢۡۦ;->ۨ۟ۤۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lc9/a;

    check-cast p1, Lc9/e;

    check-cast p2, Ly0/o;

    check-cast p3, Lc9/e;

    check-cast p4, Lc9/e;

    check-cast p5, Lc9/e;

    check-cast p6, Lc9/e;

    check-cast p7, Le1/l0;

    check-cast p17, Lo2/o;

    check-cast p18, Lm0/m;

    invoke-static/range {p0 .. p21}, Lk0/n;->a(Lc9/a;Lc9/e;Ly0/o;Lc9/e;Lc9/e;Lc9/e;Lc9/e;Le1/l0;JJJJFLo2/o;Lm0/m;III)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;
    .locals 1

    invoke-static {}, Lz/ۨۤۥۨ;->ۡ۠ۨۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf4/y;

    invoke-virtual {p0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۢۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣۨۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfc$zzb;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfc$zzb;->zzb()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۨۡۧ(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/p0;
    .locals 1

    invoke-static {}, Lg5/۟ۥۨۤ;->ۣ۟ۨۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/l;->a(Landroid/content/Context;)Lcom/google/android/gms/common/internal/p0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
