.class public La7/۠ۢۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۟۟ۧ۟ۡ:I = -0x8


# direct methods
.method public static ۣ۟۟۠ۢ(Ljava/lang/Object;)Lp9/q0;
    .locals 2

    invoke-static {}, Lh/ۢۢۨۨ;->ۡۦ۟ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->o0:Lp9/q0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۤۤۧ(JJJLjava/lang/Object;I)Lk0/q3;
    .locals 1

    invoke-static {}, Ld1/۟ۡۨۧۢ;->ۣ۟ۡۧۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p6, Lm0/m;

    invoke-static/range {p0 .. p7}, Lk0/t0;->f(JJJLm0/m;I)Lk0/q3;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۧۡۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->ۥۨ۠۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/os/BaseBundle;

    check-cast p1, Ljava/lang/String;

    check-cast p2, [I

    invoke-virtual {p0, p1, p2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣ۟ۡۨ(I)I
    .locals 1

    invoke-static {}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->۠۠ۤۤ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0}, Lm0/s;->m(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤ۟ۨ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lw4/ۥۤ۟۠;->۟ۧۡ۠۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/l;

    iget-object v1, p0, Lk0/l;->f:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۥ۟(Ljava/lang/Object;I)I
    .locals 1

    invoke-static {}, Lb7/ۣ۟۟ۦ۟;->ۣۣۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lr1/p;

    invoke-interface {p0, p1}, Lr1/p;->X(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۢۢ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۥۨۨۦ()F
    .locals 1

    invoke-static {}, Lh7/۟۟ۧۨ۟;->۟ۡۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget v0, Lk0/k3;->b:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۡۦ(Ljava/lang/Object;I)I
    .locals 1

    invoke-static {}, Lo8/۟ۢۧۢۤ;->۟ۧۢۢ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/database/Cursor;

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getType(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۦۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/x7;

    iget-object v1, p0, Lk6/x7;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۧۦۣ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ls8/ۣۡۡ۠;->ۨۡ۠۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/e2;

    iget-wide v2, p0, Ld5/e2;->b:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۡۨۦۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۠ۡۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ls0/ۧۧۨۥ;->ۦۦۤ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/v1;

    iget v1, p0, Lf0/v1;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۟ۤ()I
    .locals 2

    const v0, 0x16c

    sget v1, Lh/ۢۢۨۨ;->۟ۥۧ۠۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۥ۟ۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/android/gms/common/internal/ۣۧۧۡ;->ۢ۠ۨۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/i2;

    iget v1, p0, Ld5/i2;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣۡۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۥۡۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/List;

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣۧۢ([SIII)Ljava/lang/String;
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

.method public static ۣۣۨ۠()Ly0/o;
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/ktxtesting/ۤۢۤۡ;->ۥۣۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lk0/u4;->i:Ly0/o;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۤ()Lu9/d;
    .locals 2

    invoke-static {}, Lu/ۣۤۧ۠;->ۣۨۧۦ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lu9/e;->a()Lu9/d;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
