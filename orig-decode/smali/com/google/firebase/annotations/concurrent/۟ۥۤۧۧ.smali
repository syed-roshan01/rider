.class public Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۨ۠۠۠:I = -0x19d


# direct methods
.method public static ۟۟۟ۤ(Ljava/lang/Object;)Lt/t;
    .locals 2

    invoke-static {}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۣ۟۠ۥۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lt/d;

    iget-object v1, p0, Lt/d;->i:Lt/t;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۡۤ(Ljava/lang/Object;)Lk6/l4;
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۣۣۤۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/o4;

    iget-object v1, p0, Lk6/o4;->e:Lk6/l4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢۢ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/measurement/internal/ۥۦۤ;->۟۠۟ۤ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/g;

    iget-object v1, p0, Ld5/g;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۧۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lg/۟۠ۡۨۨ;->ۣۣ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/pm/ApplicationInfo;

    iget-object v1, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۡۤ۟(Ljava/lang/Object;)Landroid/view/Window;
    .locals 1

    invoke-static {}, Lz/۟ۥۣۣ۠;->۟ۢۧۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۡۧ(Ljava/lang/Object;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    invoke-static {}, Lx0/ۣ۠۟۠;->ۣ۟ۡۥۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/m;

    invoke-virtual {p0}, Lk6/m;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۦۣ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۡۧۥ۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

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

    move-result-object v0

    array-length v3, v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-lt v1, v3, :cond_3

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1

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
    aget-byte v5, v0, v1

    rem-int v6, v1, v4

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2
.end method

.method public static ۟ۢۡ۠۠(Ljava/lang/Object;)Lp9/q0;
    .locals 2

    invoke-static {}, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۣۣۧۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->x0:Lp9/q0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟۠ۧ(Ljava/lang/Object;)Landroid/os/Handler;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->۟۟ۨۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/n;

    invoke-virtual {p0}, Lk6/n;->d()Landroid/os/Handler;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۡۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lw4/ۥۤ۟۠;->۟ۧۡ۠۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/l0;

    iget v1, p0, Lk0/l0;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۢۢۥ()Landroidx/compose/foundation/layout/FillElement;
    .locals 1

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟ۦ۠ۤۨ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۢۨ(Ljava/lang/Object;)Lr1/x0;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->ۣ۟ۧۦۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/w4;

    iget-object v1, p0, Lk0/w4;->r:Lr1/x0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۡۢ(Ljava/lang/Object;)La2/e;
    .locals 2

    invoke-static {}, Le2/۟۟ۥۦ;->ۥۦۡۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La2/z;

    iget-object v1, p0, La2/z;->a:La2/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۢۧۡ(Ljava/lang/Object;)Lm0/j0;
    .locals 2

    invoke-static {}, Lm7/ۧۢ۟;->ۤۧ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/x1;

    iget-object v1, p0, Lf0/x1;->b:Lm0/j0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۡۤۤ([SIII)Ljava/lang/String;
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

.method public static ۢۤۡۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lg0/۟ۥۢۥۢ;->ۥۧ۟ۦ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣۤۦ()Lk6/i;
    .locals 1

    invoke-static {}, Lc4/۟ۢۨۥۡ;->ۦۣ۟ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk6/i;->d:Lk6/i;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۧۤۡ(Ljava/lang/Object;)La2/c0;
    .locals 2

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۦۤۢ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/e5;

    iget-object v1, p0, Lk0/e5;->n:La2/c0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦ۟۟ۨ()I
    .locals 2

    const v0, -0xbe

    sget v1, Ly/۟ۤۥۨ;->۟ۢۡۧۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۦۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣ۟ۥۡۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/y;

    iget v1, p0, Ld5/y;->f:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۤۦۢ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lr7/۟۟ۡ۟ۢ;->۟ۤۨۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lr1/p;

    invoke-static {p0}, Lk0/u4;->c(Lr1/p;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۢۡۡ(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->ۣۣ۟ۡۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/z4;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    check-cast p4, Ljava/lang/String;

    check-cast p5, Ljava/lang/Runnable;

    invoke-virtual/range {p0 .. p5}, Lk6/z4;->p(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
