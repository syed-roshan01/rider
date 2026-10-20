.class public Lf/ۣ۟ۤۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۤۧۢ:I = -0x1fb


# direct methods
.method public static ۟۟ۨۦۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/reporting/ۦۦۦۥ;->ۧۡۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/l1;

    iget-object v1, p0, Lk0/l1;->b:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۨۧۨ()[Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/layout/۟ۢ۠ۨ۠;->ۧۡۥۦ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lk6/t5;->h:[Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۥۨۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld9/s;

    iget v1, p0, Ld9/s;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢۡ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Le9/ۧۧۡ;->ۨۦ۟ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/app/Application;

    check-cast p1, Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {p0, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤۤ۠ۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۡۨۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۨۤۨ(FF)J
    .locals 2

    invoke-static {}, Lq9/۟ۧۦۤۨ;->۟ۤۧۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0, p1}, Li1/b;->b(FF)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۢۦ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۠۟ۤۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ld5/ۣۦۢۢ;->ۤ۠ۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/c3;

    iget v1, p0, Lk0/c3;->n:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۤۧ۠([SIII)Ljava/lang/String;
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

.method public static ۣ۟ۢۦ(Ljava/lang/Object;)Lk6/f6;
    .locals 2

    invoke-static {}, Ls0/ۢۨۦ۟;->ۣۡۨۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/h7;

    iget-object v1, p0, Lk6/h7;->c:Lk6/f6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۡۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۥ۠۟ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZIILjava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->ۤۡۥۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ly0/o;

    check-cast p2, La2/c0;

    check-cast p3, Lc9/c;

    check-cast p8, Lm0/m;

    invoke-static/range {p0 .. p10}, Lm9/e0;->b(Ljava/lang/String;Ly0/o;La2/c0;Lc9/c;IZIILm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥ۠ۤۦ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۡۦۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lm0/q;

    invoke-virtual {p0}, Lm0/q;->E()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۦۤۢ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/auto/accept/data/model/UserProfile;

    invoke-virtual/range {p0 .. p0}, Lcom/auto/accept/data/model/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۣۧ()Ld5/h0;
    .locals 1

    invoke-static {}, Lr5/ۣۢ۟ۦ;->۠ۥۢۡ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Ld5/h0;->b:Ld5/h0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;
    .locals 2

    invoke-static {}, Ll6/ۥۦۣ۟;->ۤۤ۠۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/h5;

    iget-object v1, p0, Lk6/h5;->a:Lk6/p7;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۤۥ۠()I
    .locals 2

    const v0, 0x31c

    sget v1, Ls8/ۣۡۡ۠;->ۣ۟ۧۧ۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۨۥۧۧ(Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Landroidx/startup/ۨۤ۟ۡ;->۟ۥۣۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lm0/q2;

    invoke-virtual {p0, p1, p2}, Lm0/q2;->s(II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۨۨۢ(Ljava/lang/Object;)Lk6/p4;
    .locals 2

    invoke-static {}, Lv0/۟ۤۧ۠ۧ;->۟ۤ۠ۤۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/l4;

    iget-object v1, p0, Lk6/l4;->e:Lk6/p4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۨۤۥ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۥۦۥۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/d;

    iget-object v1, p0, Lk0/d;->a:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
