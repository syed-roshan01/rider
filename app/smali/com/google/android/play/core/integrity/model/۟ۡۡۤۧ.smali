.class public Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۨ۟:I = 0x43


# direct methods
.method public static ۟۟ۦۤۢ(Ljava/lang/Object;)Ly0/o;
    .locals 2

    invoke-static {}, Lw2/۟ۧۥۦۨ;->۟ۥۡۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/t;

    iget-object v1, p0, Lf0/t;->r:Ly0/o;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۧۡۦ(ILjava/lang/Object;)I
    .locals 1

    invoke-static {}, Lea/۟ۦۢۦۤ;->ۣۨۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Ld7/t;->T(ILjava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۨ۟۠([SIII)Ljava/lang/String;
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

.method public static ۣۣ۟ۡۤ()Landroid/os/Parcelable$Creator;
    .locals 1

    invoke-static {}, Ll8/ۢۦۥۢ;->۟ۢۡۢۢ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk6/v;->CREATOR:Landroid/os/Parcelable$Creator;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦۧۨ(Ljava/lang/Object;)Lm0/d;
    .locals 1

    invoke-static {}, Ld9/ۣ۟۠ۢۡ;->۟۟ۧ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lm0/q;

    invoke-virtual {p0}, Lm0/q;->B()Lm0/d;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۡ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lfa/ۣ۟ۥۤ;->ۦ۟ۡۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/firebase/messaging/RemoteMessage;

    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage;->getFrom()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۥ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟۟۟۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۥۥۢۥ(Ljava/lang/Object;)[Ljava/lang/StackTraceElement;
    .locals 1

    invoke-static {}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->۟ۢۥۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/lang/Throwable;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۨۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/startup/ۨۤ۟ۡ;->۟ۥۣۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/h5;

    check-cast p1, Lk6/x7;

    invoke-virtual {p0, p1}, Lk6/h5;->q(Lk6/x7;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۧۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Li6/۟۟ۦۨۧ;->۟ۡۦۥ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/e1;

    invoke-virtual {p0, p1}, Lf0/e1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥۡۨ(Ljava/lang/Object;I)I
    .locals 1

    invoke-static {}, Landroidx/compose/ui/layout/ۢۡۤۤ;->ۣ۟۟ۨ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lr1/p;

    invoke-interface {p0, p1}, Lr1/p;->g(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤ۟۟()Lf2/l;
    .locals 2

    invoke-static {}, Lg5/۟ۥۨۤ;->ۣ۟ۨۤ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lu1/x1;->n()Lf2/l;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦ۠۟۠(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->ۦۧ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lc9/a;

    check-cast p1, Ly0/o;

    check-cast p3, Lk0/b1;

    check-cast p4, Lx/m;

    check-cast p5, Lc9/e;

    check-cast p6, Lm0/m;

    invoke-static/range {p0 .. p8}, Lo7/d0;->b(Lc9/a;Ly0/o;ZLk0/b1;Lx/m;Lc9/e;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۡ۠ۨ()I
    .locals 2

    const v0, -0x8c

    sget v1, Li4/ۨ۟ۨ;->۟ۧ۠ۥ۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۨۢۢۤ(Ljava/lang/Object;)Li3/a0;
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement/ۢۥۤۦ;->ۥۣۦۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/l4;

    iget-object v1, p0, Lk6/l4;->x:Li3/a0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
