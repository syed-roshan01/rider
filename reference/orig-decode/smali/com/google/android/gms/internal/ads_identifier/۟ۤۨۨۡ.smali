.class public Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۤ۟ۦ:I = 0x18a


# direct methods
.method public static ۣ۟۟ۦ۟(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Li/ۣۢۦ۠;->۟۠ۡۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/r1;

    check-cast p1, Lm0/m;

    invoke-virtual {p0, p1, p2}, Ld5/r1;->a(Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۠۟ۧۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lb7/ۣ۟۟ۦ۟;->ۣۣۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "Error storing event aggregates. appId"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۥۥۣ()Li1/f;
    .locals 1

    invoke-static {}, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۣۣ۟ۥ۠()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lh6/g;->s:Li1/f;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IFLjava/lang/Object;Ljava/lang/Object;ZZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V
    .locals 1

    invoke-static {}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۧ۠ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lb0/h0;

    check-cast p1, Ly0/o;

    check-cast p2, Ly/t0;

    check-cast p3, Lb0/j;

    check-cast p6, Ly0/c;

    check-cast p7, Lw/h;

    check-cast p10, Lc9/c;

    check-cast p11, Ln1/a;

    check-cast p12, Lc9/g;

    check-cast p13, Lm0/m;

    invoke-static/range {p0 .. p16}, Lm9/e0;->f(Lb0/h0;Ly0/o;Ly/t0;Lb0/j;IFLy0/c;Lw/h;ZZLc9/c;Ln1/a;Lc9/g;Lm0/m;III)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۡ۠۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۡ۠ۢۧ()J
    .locals 2

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-wide v0, Ll0/c;->f:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۢۤ۠(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Li/ۢۥۣ۟;->ۢۢۡۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/p;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/p;->R0(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۢۥ۟(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/connector/ۣ۟ۢۢ۟;->۟ۦۣۣۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->y0:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۤۧ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۢۥ۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۤ۟()I
    .locals 2

    const v0, -0xf6

    sget v1, Lr1/۟ۤۤۡ۠;->ۦۥۢ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۥ۟ۡ()Li1/f;
    .locals 2

    invoke-static {}, Lc7/ۨۤۦۢ;->۟۟ۡۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {}, Lf6/a;->S()Li1/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lg8/ۣۣۣ۟;->ۨۢۢۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lm0/m;

    check-cast p2, Lc9/e;

    invoke-static {p0, p1, p2}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦ۟ۢۨ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lg3/۟ۥۣۣۥ;->۟ۤۡۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۡۦۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ll6/ۥۦۣ۟;->ۤۤ۠۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/c4;

    check-cast p1, Lk6/v;

    invoke-virtual {p0, p1}, Lk6/c4;->d(Lk6/v;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۡۦۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->۟۟ۨۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Scheduling upload, millis"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡۤ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Li4/ۨ۟ۨ;->۟ۦۣۡۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lc9/f;

    check-cast p1, Lm0/m;

    invoke-static {p0, p1, p2}, Ly3/e;->f(Lc9/f;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۢۢ۠(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lm0/۟ۤۡۤۤ;->ۣ۟ۦۢۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/s4;

    iget-object v1, p0, Lk0/s4;->d:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۣۡ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/draw/ۧۤۡۧ;->ۣۨ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf5/q;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lf5/q;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۡ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lq2/ۣ۟ۢۥ۠;->ۣ۟ۢ۟ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/Queue;

    invoke-interface {p0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۨۡ([SIII)Ljava/lang/String;
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

.method public static ۦ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ls0/ۢۨۦ۟;->ۣۡۨۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/u7;

    check-cast p1, Landroid/os/Bundle;

    check-cast p2, Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2}, Lk6/u7;->C(Landroid/os/Bundle;Landroid/os/Bundle;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۧ۟ۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->۟ۤۥۦۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/b2;

    iget-object v1, p0, Ld5/b2;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۢۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->ۥۨ۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/x;

    invoke-virtual {p0, p1}, Ld5/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
