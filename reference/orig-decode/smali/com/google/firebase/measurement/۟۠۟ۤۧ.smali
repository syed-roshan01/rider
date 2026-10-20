.class public Lcom/google/firebase/measurement/۟۠۟ۤۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۤۡ۠:I = -0x389


# direct methods
.method public static ۟۟۠ۧۨ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lx4/۟ۤۦۥ۟;->ۣۢۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/p4;

    iget-wide v2, p0, Lk6/p4;->b:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢ۟()I
    .locals 2

    const v0, -0x141

    sget v1, Lj6/ۣۦۢ۠;->۟۠ۢۡۦ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۡ۟ۡۢ(Ljava/lang/Object;)Lf0/a1;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۣۨ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/o1;

    iget-object v1, p0, Lk0/o1;->r:Lf0/a1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۢۤ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۡۦۤۨ(Ljava/lang/Object;)Lm0/n1;
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۧۦۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lt/d;

    iget-object v1, p0, Lt/d;->d:Lm0/n1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۟۟ۨ(Ljava/lang/Object;)Lf2/e;
    .locals 2

    invoke-static {}, Lg0/۟ۥۢۥۢ;->ۥۧ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La2/x;

    iget-object v1, p0, La2/x;->f:Lf2/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۤۧ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lp0/۟ۧۧۧ۟;->ۦۧ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/q1;

    check-cast p1, Lm0/m;

    invoke-virtual {p0, p1, p2}, Ld5/q1;->a(Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤۤۡۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/connector/ۣ۟ۢۢ۟;->۟ۦۣۣۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/h;

    iget-object v1, p0, Lf0/h;->A:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡۤۦ([SIII)Ljava/lang/String;
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

.method public static ۟ۦ۟ۧۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/core/app/ۣۥۢۧ;->ۢۥۧ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/l1;

    iget v1, p0, Lk0/l1;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۡۡ()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1

    invoke-static {}, Lf4/ۡۥۣۢ;->ۣۧۧۢ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk6/c4;->b:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠۠ۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۧ۠ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/View;

    check-cast p1, Lb4/g;

    invoke-static {p0, p1}, Ly3/e;->C0(Landroid/view/View;Lb4/g;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۡۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۥۣۤۨ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "Storing trigger URI outside of the max retention time span. appId, now, timestamp"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۟ۥۧ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/firebase/firestore/ListenerRegistration;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->ۧۥۣ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/firebase/firestore/DocumentReference;

    check-cast p1, Lcom/google/firebase/firestore/EventListener;

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/DocumentReference;->addSnapshotListener(Lcom/google/firebase/firestore/EventListener;)Lcom/google/firebase/firestore/ListenerRegistration;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۥۧۢ(Ljava/lang/Object;)Lk0/y;
    .locals 2

    invoke-static {}, Li5/ۢۤۡ;->ۣ۟۟ۦۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/i0;

    iget-object v1, p0, Lk0/i0;->L:Lk0/y;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZFLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lv6/۟ۦۨۦۣ;->ۦۧۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Lc9/e;

    check-cast p2, Lc9/e;

    check-cast p3, Lc9/f;

    check-cast p4, Lc9/e;

    check-cast p5, Lc9/e;

    check-cast p6, Lc9/e;

    check-cast p7, Lc9/e;

    check-cast p10, Lc9/e;

    check-cast p11, Lc9/e;

    check-cast p12, Ly/t0;

    check-cast p13, Lm0/m;

    invoke-static/range {p0 .. p15}, Lk0/t0;->b(Ly0/o;Lc9/e;Lc9/e;Lc9/f;Lc9/e;Lc9/e;Lc9/e;Lc9/e;ZFLc9/e;Lc9/e;Ly/t0;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۧۡ(Ljava/lang/Object;)Lc9/a;
    .locals 2

    invoke-static {}, Lc1/ۣۢۧۨ;->ۡۢۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/y;

    iget-object v1, p0, Ld5/y;->e:Lc9/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۧۡۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/util/۟ۧۤ۟ۥ;->ۧۡۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La4/q;

    check-cast p1, Ljava/io/InputStream;

    invoke-static {p0, p1}, La4/q;->d(La4/q;Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣ۟ۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۦۣ۠۠(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/profileinstaller/۟۟۟ۧۦ;->۟ۦۡۦ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Ll9/i;->R0(Ljava/lang/CharSequence;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
