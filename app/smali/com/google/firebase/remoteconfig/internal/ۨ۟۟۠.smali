.class public Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۦۧۨۤ:I = -0x3b8


# direct methods
.method public static ۟۠ۡۧۧ(Ljava/lang/Object;)Lq8/g;
    .locals 1

    invoke-static {}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۨ۠ۡۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۦ۠(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lc3/۟ۥ۠ۡۧ;->۟ۥ۠ۨۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/os/BaseBundle;

    invoke-virtual {p0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۥۣۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣۧۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/a5;

    iget-object v1, p0, Lk6/a5;->H:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۤ۟(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Ly9/ۨ۠;->ۥۣۢۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/a1;

    iget-object v1, p0, Ld5/a1;->e:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Le2/۟۟ۥۦ;->ۥۦۡۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/a5;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lk6/a5;->j(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۤۦۡ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۤۥۤۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf5/s;

    iget-object v1, p0, Lf5/s;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۨۧ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lea/۟ۦۢۦۤ;->ۣۨۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/data/model/AppConfig;

    invoke-virtual {p0}, Lcom/auto/accept/data/model/AppConfig;->getForceUpdateVersion()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧ۠ۡ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ldagger/hilt/components/ۡۧ۟;->۟ۥۢۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠۟ۤۢ(Ljava/lang/Object;)Lm0/l3;
    .locals 2

    invoke-static {}, Lw/ۥۣۡۡ;->ۣ۟۟ۥ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/v0;

    iget-object v1, p0, Ld5/v0;->n:Lm0/l3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۦۣۧ()I
    .locals 2

    const v0, 0x2a6

    sget v1, Lcom/google/firebase/measurement/ۧۤۦۧ;->۟ۧۤۡۨ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۢۥۣۡ([SIII)Ljava/lang/String;
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

.method public static ۢۧۥۦ(Ljava/lang/Object;)Li1/f;
    .locals 2

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/p1;

    iget-object v1, p0, Ld5/p1;->e:Li1/f;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۧۧ۠(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Le1/۟ۡۡۤۡ;->۟ۦۣۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lf6/a;->X(Landroid/content/Context;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۨۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟ۧۤ(Ljava/lang/Object;Ljava/lang/Object;IJ)V
    .locals 1

    invoke-static {}, Laa/۟ۦۣۢۨ;->۟۠ۡ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/y5;

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2, p3, p4}, Lk6/y5;->w(Landroid/os/Bundle;IJ)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦ۟ۥۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lh4/۟ۧۢۡۦ;->ۨ۟ۤۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/u;

    iget v1, p0, Lk0/u;->p:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۡ۟ۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Li9/ۨۨ۟;->ۦۧۢۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/d1;

    iget-object v1, p0, Lk0/d1;->b:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۣ۠ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ll3/ۥۣۤ۟;->ۡۥۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/z7;

    iget-object v1, p0, Lk6/z7;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۤۦۤ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, La6/۟ۤۨۨ۟;->ۥۣۤۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/b4;

    iget-boolean v1, p0, Lk0/b4;->c:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۦۤۡ(Ljava/lang/String;)Ljava/lang/String;
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

    move-result-object v3

    array-length v4, v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_2
    if-lt v0, v4, :cond_2

    :goto_3
    array-length v0, v3

    if-lt v1, v0, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

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
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_3
.end method
