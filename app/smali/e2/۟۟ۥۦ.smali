.class public Le2/۟۟ۥۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۢ۠ۨۥ:I = -0x2f5


# direct methods
.method public static ۟۟۟ۤۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ly/ۤۨۧ۟;->ۣۧۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La5/a0;

    iget v1, p0, La5/a0;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۨۨ(J)Lf1/d;
    .locals 1

    invoke-static {}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۤۥۤۦ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static/range {p0 .. p1}, Le1/r;->f(J)Lf1/d;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۡۦۣ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

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

    move-result-object v3

    const-string v0, "a"

    :cond_0
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_3
    if-lt v0, v4, :cond_4

    :goto_4
    array-length v0, v3

    if-lt v1, v0, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

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
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    const-string v0, "a"

    goto :goto_2

    :cond_4
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_4
.end method

.method public static ۣ۟ۡۨۢ()F
    .locals 1

    invoke-static {}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣۢۢ۠()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Ll0/g;->a:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۨۡ([SIII)Ljava/lang/String;
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

.method public static ۣ۟ۨۨۥ(Ljava/lang/Object;II)Lt/j0;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۢ۠ۦۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lt/z;

    invoke-static {p0, p1, p2}, Lt/e;->p(Lt/z;II)Lt/j0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۡۧۢ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۦۨۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/Queue;

    invoke-interface {p0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۧ۠(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lf1/ۥۦ۟ۥ;->ۤۤۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/os/Bundle;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2, p3}, Lk6/u7;->A(Landroid/os/Bundle;ILjava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۥ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lu/ۣۤۧ۠;->ۣۨۧۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/u7;

    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/String;

    check-cast p3, [Ljava/lang/String;

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lk6/u7;->Y(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lh4/ۣ۟ۢۢۡ;->ۨۢۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, La2/c0;

    check-cast p1, Lc9/e;

    check-cast p2, Lm0/m;

    invoke-static {p0, p1, p2, p3}, Lk0/c5;->a(La2/c0;Lc9/e;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠۟ۢۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lk7/۟ۤۥۡ;->ۥۢۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "service_running_setup_shizuku"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۡ۠ۤ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۨۨ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/g3;

    iget-wide v2, p0, Lk0/g3;->f:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۣۦ(Z)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟۠ۢۦۧ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0}, Lf6/a;->r(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡ۟ۦۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۡۦ۠(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lia/۟۠ۡۦ۟;->ۦ۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La5/c;

    iget-boolean v1, p0, La5/c;->e:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۦ۟()La4/q;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/layout/ۢۡۤۤ;->ۣ۟۟ۨ۟()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Ly3/k;->c:La4/q;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤ۟(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->ۦۤ۟ۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/i0;

    iget-wide v2, p0, Lk0/i0;->q:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۤۧ۠ۨ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟ۦ۠ۤۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۤۨۢۦ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement/ۢۥۤۦ;->ۥۣۦۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ll/t;

    iget-object v1, p0, Ll/t;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۦۡۥ()I
    .locals 2

    const v0, 0xf3

    sget v1, Ll6/ۣۧۧۧ;->۟ۦۣۧۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۧۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lv0/۟ۤۧ۠ۧ;->۟ۤ۠ۤۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/t7;

    check-cast p1, Landroid/os/Parcel;

    invoke-virtual {p0, p1, p2}, Lk6/t7;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۧۧۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->ۧۦۦۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lc9/a;

    invoke-interface {p0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۨۦۡ(II)Z
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۣۡۧۥ;->۟ۡۧ۟ۢ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {p0, p1}, Lh6/g;->T(II)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
