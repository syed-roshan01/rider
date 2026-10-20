.class public Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟۠ۨ۟:I = -0x2e0


# direct methods
.method public static ۟۠ۥ۠ۢ(Ljava/lang/Object;I)Landroid/view/View;
    .locals 1

    invoke-static {}, Landroidx/preference/۟ۤۥۦۧ;->ۣۡۡۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠ۡۡ(Ljava/lang/Object;J)V
    .locals 1

    invoke-static {}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->ۣ۟۟۠ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/a5;

    invoke-virtual {p0, p1, p2}, Lk6/a5;->F(J)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۢۨۥ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->ۦۤ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/q1;

    iget v1, p0, Ld5/q1;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۢۥۦ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseUser;
    .locals 1

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->ۨۤۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/firebase/auth/AuthResult;

    invoke-interface {p0}, Lcom/google/firebase/auth/AuthResult;->getUser()Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۢۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۤۧۦۨ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ld9/ۨۧۧۦ;->ۨۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzew$zzd;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzew$zzd;->zzj()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۤۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۤۥۤۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Li7/i1;

    check-cast p1, Li7/h1;

    invoke-static {p0, p1}, Li7/i1;->y(Li7/i1;Li7/h1;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۥۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lk6/o;
    .locals 1

    invoke-static {}, Lj2/ۥ۠ۨۢ;->ۣۢۡۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/p7;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lk6/o;

    check-cast p3, Lk6/s5;

    check-cast p4, Lk/f;

    invoke-virtual {p0, p1, p2, p3, p4}, Lk6/p7;->c(Ljava/lang/String;Lk6/o;Lk6/s5;Lk/f;)Lk6/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧۤۡ(Ljava/lang/Object;)Ly/t0;
    .locals 2

    invoke-static {}, Lu/ۤ;->ۣ۟ۢۡۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/v4;

    iget-object v1, p0, Lk0/v4;->t:Ly/t0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۧۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, La2/ۢۦۧۦ;->ۤۦۦۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lm0/q;

    invoke-virtual {p0}, Lm0/q;->w()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۧۤ۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lw5/ۢۤۢ۠;->ۣۢۧۨ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0}, Ld7/a;->j(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۤۤ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lf4/ۦۣ۟ۦ;->۟ۡۤۢۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/l2;

    iget-object v1, p0, Lk0/l2;->e:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۤۧۤ(Ljava/lang/Object;)Lu/i1;
    .locals 2

    invoke-static {}, Ldagger/hilt/components/ۡۧ۟;->۟ۥۢۧۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/w3;

    iget-object v1, p0, Lk0/w3;->d:Lu/i1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢ۠۟۟(Ljava/lang/Object;)Ly0/o;
    .locals 2

    invoke-static {}, Lt1/ۧۦۤۧ;->ۣۡ۠ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/b;

    iget-object v1, p0, Lf0/b;->b:Ly0/o;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۦۥ۟()Li1/f;
    .locals 1

    invoke-static {}, Ls0/ۢۨۦ۟;->ۣۡۨۧ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lh6/g;->i:Li1/f;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۦۨۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lw4/ۥۤ۟۠;->۟ۧۡ۠۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La5/a;

    invoke-virtual {p0, p1}, La5/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۟ۦ(Ljava/lang/Object;ILjava/lang/Object;I)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lc7/۟ۦۣۢۦ;->۟ۦۨۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2, p3}, Ll/q;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۡ۠۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lz7/۟۟ۨۢۢ;->۟۠ۤۡۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/p1;

    iget-object v1, p0, Ld5/p1;->c:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۡۨۢ()La2/c0;
    .locals 1

    invoke-static {}, Ls8/۟ۥۨۨ;->۟۠۟()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Ll0/u;->l:La2/c0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۤۨۡ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Laa/ۣۣ۟۟;->ۣ۟۟ۤۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lg1/k;

    iget v1, p0, Lg1/k;->a:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۦۣ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۦ۟ۥۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lu/w;

    iget v1, p0, Lu/w;->a:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣۤۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lt0/ۣ۟۠ۡۢ;->۟ۤۤۦۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/f2;

    iget v1, p0, Lf0/f2;->c:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۨۡۥ([SIII)Ljava/lang/String;
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

.method public static ۦۤ۟ۦ()I
    .locals 2

    const v0, -0xb

    sget v1, La7/۠ۢۧ;->۟۟ۧ۟ۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۧۤ۟()J
    .locals 2

    invoke-static {}, Lj3/۟ۧۧۦۤ;->ۡ۟ۥ۠()I

    move-result v0

    if-ltz v0, :cond_0

    sget-wide v0, Ll0/c;->v:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۤ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
