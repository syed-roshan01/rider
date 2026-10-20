.class public Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۥۡ۟ۨ:I = 0xcc


# direct methods
.method public static ۟۟ۢۨۨ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk/f;

    check-cast p1, Lk6/r5;

    invoke-virtual {p0, p1, p2}, Lk/f;->M(Lk6/r5;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟۟۟ۢ()Lk0/l0;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->ۡۢۥۡ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk0/l0;->e:Lk0/l0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۡۢۦ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Ld9/ۨۧۧۦ;->ۨۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/n1;

    iget-object v1, p0, Lk0/n1;->t:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۥ۟(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lh1/۟۟ۨۦۦ;->ۣ۟ۢۡۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/f1;

    iget-wide v2, p0, Ld5/f1;->e:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۧ۟۠()[Lcom/google/android/gms/internal/measurement/zzew$zzf$zza;
    .locals 2

    invoke-static {}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۧ۟ۥۡ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzew$zzf$zza;->values()[Lcom/google/android/gms/internal/measurement/zzew$zzf$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;
    .locals 2

    invoke-static {}, Lw6/۟ۥۧۡۨ;->ۧۥۦۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/y6;

    iget-object v1, p0, Lk6/y6;->c:Lk6/z6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠ۦ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lc1/ۣۢۧۨ;->ۡۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Service is currently stopped. Turn on Service Switch above to start."

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۤ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۢ۠ۥۢ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۧ۠۠ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/a5;

    iget-wide v2, p0, Lk6/a5;->D:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۡ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Lf0/ۣۤ۠۟;->۟ۦۥۣۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->w0:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡۦۢ()Lm0/m3;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣۡۥۡ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lj0/y;->a:Lm0/m3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۨۥ()I
    .locals 2

    const v0, -0x69

    sget v1, Li6/۟۟ۦۨۧ;->۠ۦۡۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۦۣ۟ۤ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Le1/۟ۢ۟ۤۡ;->ۡۧۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/l1;

    iget-object v1, p0, Lk0/l1;->n:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۟ۧۥ(Ljava/lang/Object;)Lk6/s6;
    .locals 2

    invoke-static {}, Lg9/۠ۨۧۤ;->۟ۥ۟ۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/f5;

    iget-object v1, p0, Lk6/f5;->u:Lk6/s6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۦۤۨ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Ld8/ۣۡۡ۠;->۟۠ۧۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf5/m;

    iget-object v1, p0, Lf5/m;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۨۡۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ly9/ۧۨ۠ۢ;->۟ۦۡۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/a5;

    iget-object v1, p0, Lk6/a5;->c:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lh7/ۣ۟ۤ۠۠;->ۧ۠ۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ln/g;

    invoke-virtual {p0, p1}, Ln/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۣ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ly/۟ۤۥۨ;->ۡ۟ۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/u0;

    invoke-virtual {p0, p1}, Ld5/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧۡۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lr9/۟ۢۢۤۨ;->ۣ۟ۤۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf5/m;

    iget v1, p0, Lf5/m;->f:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤ۟ۦۡ(Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 2

    invoke-static {}, Lv0/۟ۤۧ۠ۧ;->۟ۤ۠ۤۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzdd;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤ۠ۡۦ(Ljava/lang/Object;)F
    .locals 1

    invoke-static {}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣ۟ۤۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-virtual {p0}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->g()F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۥۢ۠ۨ([SIII)Ljava/lang/String;
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

.method public static ۥۣۧۡ(Ljava/lang/Object;)Lm9/x1;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/input/key/ۣۢۥۢ;->ۢۧۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->i:Lm9/x1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۡۥۡ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟۟ۦۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/common/internal/f;

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۥ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;J)J
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/۟۟ۧ۟;->۟ۤۨۢۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/Intent;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۨۢۥۡ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۢ۠ۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/b;

    check-cast p1, Lm0/m;

    invoke-virtual {p0, p1, p2}, Lk0/b;->a(Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۧۡۢ()F
    .locals 1

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۣ۟ۤۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Lk0/b2;->c:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
