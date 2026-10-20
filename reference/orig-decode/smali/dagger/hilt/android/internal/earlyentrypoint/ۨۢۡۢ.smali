.class public Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۦ۟ۨ:I = -0xc5


# direct methods
.method public static ۣۣ۟۟ۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lq6/ۣ۟ۢ۟ۤ;->۟۠ۧ۠ۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzal()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/database/Cursor;
    .locals 1

    invoke-static {}, Lq0/ۥۣۡۧ;->۟۠ۨۧۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/database/sqlite/SQLiteDatabase;

    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    check-cast p4, [Ljava/lang/String;

    check-cast p5, Ljava/lang/String;

    check-cast p6, Ljava/lang/String;

    check-cast p7, Ljava/lang/String;

    check-cast p8, Ljava/lang/String;

    invoke-virtual/range {p0 .. p8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۢ۟([SIII)Ljava/lang/String;
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

.method public static ۟ۡۥۧۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۡۥۨۧ(Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/Class;
    .locals 1

    invoke-static {}, Lf1/ۥۦ۟ۥ;->ۤۤۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p2, Ljava/lang/ClassLoader;

    invoke-static {p0, p1, p2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۦۥۨ(II)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->ۦ۠ۤ۟()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0, p1}, Lo7/d0;->m0(II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤ۠ۦ۠(IIIIIIIFJFLjava/lang/Object;)I
    .locals 1

    invoke-static {}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->۠۠ۤۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p11, Ly/t0;

    invoke-static/range {p0 .. p11}, Lk0/s1;->d(IIIIIIIFJFLy/t0;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۠ۤۤ(Ljava/lang/Object;ILjava/lang/Object;I)Landroid/app/PendingIntent;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۨۨۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/Context;

    check-cast p2, Landroid/content/Intent;

    invoke-static {p0, p1, p2, p3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۢ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lg2/ۢۥۥۡ;->ۣ۟ۤۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/e1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lf0/e1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧ۟()Ly7/a;
    .locals 1

    invoke-static {}, Ll0/ۤ۠ۧ;->۟ۦ۟ۧ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ly7/a;->c:Ly7/a;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۨ۟ۢ()Lt1/j;
    .locals 1

    invoke-static {}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۧۦۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lt1/k;->b:Lt1/j;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۤۦ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۨ۠ۡۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/p1;

    iget-object v1, p0, Ld5/p1;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥۢ۟()I
    .locals 2

    const v0, -0x182

    sget v1, Lu0/ۣ۟ۤ۟ۡ;->ۣ۠ۡۨ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۧۥۣ۟()La4/c0;
    .locals 1

    invoke-static {}, Ld4/۟۠۠۟ۢ;->ۦۢ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lf0/w0;->a:La4/c0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۥ۟(Ljava/lang/Object;)Lk6/g4;
    .locals 1

    invoke-static {}, Lh/۟ۡۥۡۧ;->ۣۡۥ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/v;

    invoke-static/range {p0 .. p0}, Lk6/g4;->b(Lk6/v;)Lk6/g4;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۦۤۨ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lv9/۠ۡۨۨ;->ۣۤۢۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/o3;

    iget-object v1, p0, Lk0/o3;->q:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۦۨ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lk4/۟۠ۦ۟ۤ;->۟۠ۧۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lf0/h0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۠ۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۨ۟ۨ(Ljava/lang/Object;)Ln/g;
    .locals 2

    invoke-static {}, Lfa/ۣ۟ۥۤ;->ۦ۟ۡۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lb4/e;

    iget-object v1, p0, Lb4/e;->a:Ln/g;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۢۡۢ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->۟ۤۦۨ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/a5;

    iget-wide v2, p0, Lk6/a5;->G:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۤۢۥۥ(Ljava/lang/Object;)Lg2/s;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۧۧۢ;->۟ۢۥۣ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/s;

    iget-object v1, p0, Lf0/s;->n:Lg2/s;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۢۥ۠(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lf/ۣ۟ۤۤ;->ۦۤۥ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/d;

    iget-wide v2, p0, Lk0/d;->e:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۥۧۦۦ(Ljava/lang/Object;)Lx/m;
    .locals 2

    invoke-static {}, Lz8/ۣۤۡۧ;->۟ۧۤۤۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/f0;

    iget-object v1, p0, Lk0/f0;->q:Lx/m;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
