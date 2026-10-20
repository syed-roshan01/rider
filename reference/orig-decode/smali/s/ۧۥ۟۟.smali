.class public Ls/ۧۥ۟۟;
.super Ljava/lang/Object;


# static fields
.field public static ۟۟ۨۢۧ:I = -0x2e7


# direct methods
.method public static ۟۟ۤ۟ۨ(Ljava/lang/Object;FLjava/lang/Object;I)J
    .locals 2

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟ۦ۠ۤۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ly0/l;

    check-cast p2, Lm0/q;

    invoke-static {p0, p1, p2, p3}, Ll/q;->d(Ly0/l;FLm0/q;I)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۨۦ()F
    .locals 1

    invoke-static {}, Lg5/ۣۡۦۣ;->۟ۢۤ۟ۡ()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Lk0/c4;->e:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۟ۤۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->ۣۣ۟ۡۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/w4;

    invoke-virtual {p0}, Lk6/w4;->i()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۟ۨۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lr1/۟ۤۤۡ۠;->ۨۡ۠ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/auto/accept/data/model/SupportedApp;

    invoke-virtual {p0}, Lcom/auto/accept/data/model/SupportedApp;->getIconRes()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠ۨۤ()I
    .locals 1

    invoke-static {}, Lf6/ۣۣۣۣ۟;->۟ۡۧ۟ۢ()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Ll0/m;->b:I

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۡۢۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۢ۠ۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "distance_filter"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۠ۧۢ()I
    .locals 1

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۣۧ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Ll0/r;->f:I

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۡۨ۠()I
    .locals 2

    const v0, 0x34c

    sget v1, Lp8/ۡۤ;->ۡ۟ۤۥ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟ۧۨۧ([SIII)Ljava/lang/String;
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

.method public static ۟ۤ۠ۢۧ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Li6/۟۟ۦۨۧ;->۟ۡۦۥ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lc9/a;

    check-cast p1, Ly0/o;

    check-cast p3, Le1/l0;

    check-cast p4, Lk0/y;

    check-cast p5, Lk0/d0;

    check-cast p6, Lu/w;

    check-cast p7, Ly/t0;

    check-cast p8, Lx/m;

    check-cast p9, Lc9/f;

    check-cast p10, Lm0/m;

    invoke-static/range {p0 .. p12}, Lm9/e0;->j(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۣۧۥ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۤۦۧ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/a5;

    iget-wide v2, p0, Lk6/a5;->h:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۦۤ(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 1

    invoke-static {}, Lg/۟ۧ۠ۤ;->ۢۢۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۥ۟ۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۧۤۡۤ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Le9/ۧۧۡ;->ۨۦ۟ۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->n:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۡ۠ۤ(Ljava/lang/Object;)Le0/a;
    .locals 2

    invoke-static {}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->ۥۨ۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/q2;

    iget-object v1, p0, Lk0/q2;->c:Le0/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤۦۨ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lc1/ۢۥۥ۟;->۟ۢۨۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/h2;

    iget-object v1, p0, Lk0/h2;->d:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۨۦۦ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۦۣۧ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lw4/۟ۤ۠۟ۨ;->۟ۦۤۢۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ll2/a;

    iget v1, p0, Ll2/a;->a:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۢۢۨ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۨۨۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/i0;

    iget-wide v2, p0, Ld5/i0;->p:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۨۧۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Le1/۟ۡۡۤۡ;->۟ۦۣۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/IntentFilter;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method
