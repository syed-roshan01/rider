.class public Lcom/google/android/gms/internal/stats/ۣۣ۟ۡۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۢۡ:I = -0x23a


# direct methods
.method public static ۟ۡ۠ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)Lk6/s5;
    .locals 1

    invoke-static {}, Lw2/۟ۧۥۦۨ;->۟ۥۡۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/s5;

    check-cast p1, Lk6/s5;

    invoke-virtual {p0, p1}, Lk6/s5;->h(Lk6/s5;)Lk6/s5;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦ۠ۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۢۨ۠ۢ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۡۨۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۡۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lf0/ۣۦۦ۠;->۟ۥۥۣۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/x7;

    iget-boolean v1, p0, Lk6/x7;->F:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۧۥ۠(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۡۨۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/q4;

    check-cast p1, Lm0/m;

    invoke-virtual {p0, p1, p2}, Lk0/q4;->a(Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۢۡۡ()I
    .locals 2

    const v0, -0x3ad

    sget v1, Lca/ۨۤۢۥ;->ۥۥۧۢ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۧۡۨۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lv8/۟ۧۢ۟ۢ;->ۨۥۦۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lb3/s;

    iget v1, p0, Lb3/s;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠۟ۡۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ln/۟۠ۥۥۨ;->ۢۡۧ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lm0/q;

    invoke-virtual {p0}, Lm0/q;->c0()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۡ۠۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lr2/۠ۨۦۢ;->۟ۦ۟ۢۤ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "grant_overlay"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۤۤ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, Le8/۟۠ۦ۟ۢ;->۟ۥۧۤۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ll4/h;

    check-cast p1, Lja/x;

    invoke-virtual {p0, p1}, Ll4/h;->g(Lja/x;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۢۢ()J
    .locals 2

    invoke-static {}, La/ۨۥۥۤ;->۟ۥ۠ۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-wide v0, Le5/a;->l:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۧ۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۨۨۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La5/m;

    invoke-virtual {p0, p1}, La5/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۧ۟([SIII)Ljava/lang/String;
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

.method public static ۨۡۡۡ(Ljava/lang/String;)Ljava/lang/String;
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
