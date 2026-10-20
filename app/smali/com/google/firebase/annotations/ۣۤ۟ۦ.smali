.class public Lcom/google/firebase/annotations/ۣۤ۟ۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۤۢۤۥ:I = -0xa9


# direct methods
.method public static ۟۟ۡۥۤ(Ljava/lang/Object;)Lr1/x0;
    .locals 2

    invoke-static {}, Lv5/ۧۥۢۡ;->ۥۢۡ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/z3;

    iget-object v1, p0, Lk0/z3;->a:Lr1/x0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)Lk9/f;
    .locals 1

    invoke-static {}, Li/ۣۢۦ۠;->۟۠ۡۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk9/i;

    check-cast p1, Lc9/c;

    invoke-static {p0, p1}, Lk9/k;->H0(Lk9/i;Lc9/c;)Lk9/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ۠ۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lk3/ۦ۠ۢۥ;->۟ۤۡۢ۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Enable Developer Options"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۡ۠(Ljava/lang/Object;)Lk6/y5;
    .locals 1

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/q3;

    invoke-virtual {p0}, Lk6/q3;->o()Lk6/y5;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢۦۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۤۦۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/Intent;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۨ()Lu0/b;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۡۦۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Ld5/s;->e:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۡۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟۠۠ۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/k;

    check-cast p1, Landroid/content/ContentValues;

    invoke-virtual {p0, p1}, Lk6/k;->E(Landroid/content/ContentValues;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۢ۠۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lo4/۟۟ۡۧۤ;->ۣۦۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤ۠ۧ()Lk6/p7;
    .locals 1

    invoke-static {}, Lx7/۟۟ۦۨۡ;->ۨۨۦۦ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lk6/p7;->H:Lk6/p7;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۥ۟ۦ(Ljava/lang/Object;)Lc9/c;
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣ۟۠ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lh0/v0;

    iget-object v1, p0, Lh0/v0;->c:Lc9/c;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡ۠ۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Li/ۣۢۦ۠;->۟۠ۡۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly3/a;

    iget v1, p0, Ly3/a;->b:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟ۧۧ([SIII)Ljava/lang/String;
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

.method public static ۠۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Landroidx/core/content/ۣۣۣ۟;->ۣۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۟ۦۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lp8/۟۟ۢ۟ۢ;->۟ۤۡ۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lm0/q2;

    iget v1, p0, Lm0/q2;->t:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۧۨ()I
    .locals 2

    const v0, -0x311

    sget v1, Lj3/۟ۧۧۦۤ;->ۣۣ۠۠:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۠۟ۦ(Ljava/lang/Object;ZLjava/lang/Object;)Lr1/j0;
    .locals 1

    invoke-static {}, Lw4/۟ۤ۠۟ۨ;->۟ۦۤۢۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly0/g;

    check-cast p2, Lm0/m;

    invoke-static {p0, p1, p2}, Ly/p;->c(Ly0/g;ZLm0/m;)Lr1/j0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۢ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lr5/۟ۤۨۥۡ;->ۥ۠ۥ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf5/x;

    invoke-virtual {p0, p1}, Lf5/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۡۥۨ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۥۤۡ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۥۦۦۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lq7/۟ۢۡ۟۟;->۟ۦۣۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, La5/b0;

    iget-object v1, p0, La5/b0;->c:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۨۤ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->ۣۣ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->C0:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۥۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lb7/ۣ۟۟ۦ۟;->ۣۣۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/h;

    iget v1, p0, Lf0/h;->q:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۧۧۡ(Ljava/lang/Object;)Lr1/x0;
    .locals 2

    invoke-static {}, Lr/۠ۡ۠;->۟ۡۨۥۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/u;

    iget-object v1, p0, Lk0/u;->c:Lr1/x0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
