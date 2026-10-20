.class public Lia/۟۠ۡۦ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۥۥۧۡ:I = 0x7f


# direct methods
.method public static ۟۟ۢۡ(Ljava/lang/Object;II)Z
    .locals 1

    invoke-static {}, Ls3/۟ۧ۟ۡۢ;->۟۠ۤۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/media/ToneGenerator;

    invoke-virtual {p0, p1, p2}, Landroid/media/ToneGenerator;->startTone(II)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۨۨۧ(Ljava/lang/Object;)Lg2/a0;
    .locals 1

    invoke-static {}, Lx7/۟۟ۦۨۡ;->ۨۨۦۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lh0/v0;

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۧۡ(Ljava/lang/Object;)Lx/m;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->ۨۨۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/v3;

    iget-object v1, p0, Lk0/v3;->p:Lx/m;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۨۤۥ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lc4/۟ۢۨۥۡ;->ۦۣ۟ۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/a5;

    iget-boolean v1, p0, Lk6/a5;->p:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۡۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement/ۧۦ۠ۧ;->ۣ۟ۤۢۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/v3;

    iget v1, p0, Lk0/v3;->r:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۥۧۢ(Ljava/lang/Object;)Lr1/x0;
    .locals 2

    invoke-static {}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/c3;

    iget-object v1, p0, Lk0/c3;->a:Lr1/x0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۢۧ()Lk6/q5;
    .locals 1

    invoke-static {}, Lt8/ۦۣ۠;->۟ۤۥ۠ۢ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lk6/q5;->b:Lk6/q5;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟۠۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۣ۟ۢۧ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Lt1/ۧۦۤۧ;->ۣۡ۠ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/k;

    iget-object v1, p0, Ld5/k;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۦ۠(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۢۥۤ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->g0:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥ۟ۦ([SIII)Ljava/lang/String;
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

.method public static ۡۤۢ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۢۡ۟ۢ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lx7/۟۟ۦۨۡ;->ۨۨۦۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/q1;

    iget-object v1, p0, Lk0/q1;->d:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢۢ۟(Ljava/lang/Object;)Le8/c2;
    .locals 2

    invoke-static {}, Lw2/ۧۦۧ;->ۣۡ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lh8/n;

    iget-object v1, p0, Lh8/n;->v:Le8/c2;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦ۟۠()I
    .locals 2

    const v0, 0x20f

    sget v1, Lm1/ۣۡ۠ۧ;->ۥۦۨۤ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۦۥ۠ۢ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Lq7/۟ۢۢ۟ۧ;->۟ۡۦۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/net/URLConnection;

    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۧۤۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->ۣۣۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "dev_options_guide"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۦ۠ۨ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Le0/ۦۣ۟۠;->۟ۧۦۡۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/Intent;

    invoke-static {p0}, Lk6/u7;->R(Landroid/content/Intent;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۡۦۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->ۣ۟ۢۥۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/p1;

    iget-boolean v1, p0, Lk0/p1;->e:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
