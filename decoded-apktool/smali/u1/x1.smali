.class public abstract Lu1/x1;
.super Ljava/lang/Object;

# interfaces
.implements Lu1/x2;


# static fields
.field public static final b:[Ljava/lang/Class;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Ljava/io/Serializable;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-class v2, Landroid/os/Parcelable;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-class v2, Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-class v2, Landroid/util/SparseArray;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-class v2, Landroid/os/Binder;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-class v2, Landroid/util/Size;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-class v2, Landroid/util/SizeF;

    aput-object v2, v0, v1

    sput-object v0, Lu1/x1;->b:[Ljava/lang/Class;

    return-void
.end method

.method public static final l(Ljava/lang/Object;)Z
    .locals 5

    instance-of v0, p0, Lw0/s;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    check-cast p0, Lw0/s;

    invoke-interface {p0}, Lw0/s;->a()Lm0/z2;

    move-result-object v0

    sget-object v3, Lm0/h1;->a:Lm0/h1;

    if-eq v0, v3, :cond_1

    invoke-interface {p0}, Lw0/s;->a()Lm0/z2;

    move-result-object v0

    sget-object v3, Lm0/o3;->a:Lm0/o3;

    if-eq v0, v3, :cond_1

    invoke-interface {p0}, Lw0/s;->a()Lm0/z2;

    move-result-object v0

    sget-object v3, Lm0/h2;->a:Lm0/h2;

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    invoke-interface {p0}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lu1/x1;->l(Ljava/lang/Object;)Z

    move-result v1

    :goto_1
    return v1

    :cond_3
    instance-of v0, p0, Lq8/a;

    if-eqz v0, :cond_4

    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_4

    return v2

    :cond_4
    sget-object v0, Lu1/x1;->b:[Ljava/lang/Class;

    move v3, v2

    :goto_2
    const/4 v4, 0x7

    if-ge v3, v4, :cond_6

    aget-object v4, v0, v3

    invoke-virtual {v4, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    return v1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    return v2
.end method

.method public static final m([FI[FI)F
    .locals 3

    const/4 v0, 0x4

    mul-int/2addr p1, v0

    aget v1, p0, p1

    aget v2, p2, p3

    mul-float/2addr v1, v2

    add-int/lit8 v2, p1, 0x1

    aget v2, p0, v2

    add-int/2addr v0, p3

    aget v0, p2, v0

    mul-float/2addr v2, v0

    add-float/2addr v2, v1

    add-int/lit8 v0, p1, 0x2

    aget v0, p0, v0

    const/16 v1, 0x8

    add-int/2addr v1, p3

    aget v1, p2, v1

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    add-int/lit8 p1, p1, 0x3

    aget p0, p0, p1

    const/16 p1, 0xc

    add-int/2addr p1, p3

    aget p1, p2, p1

    mul-float/2addr p0, p1

    add-float/2addr p0, v0

    return p0
.end method

.method public static n()Lf2/l;
    .locals 1

    sget-object v0, Lf2/l;->f:Lf2/l;

    return-object v0
.end method

.method public static o()Lf2/l;
    .locals 1

    sget-object v0, Lf2/l;->n:Lf2/l;

    return-object v0
.end method

.method public static p()Lf2/l;
    .locals 1

    sget-object v0, Lf2/l;->e:Lf2/l;

    return-object v0
.end method

.method public static final q(Ly0/o;Ly0/o;)Ly0/o;
    .locals 1

    new-instance v0, Lu1/e2;

    invoke-direct {v0}, Lu1/e2;-><init>()V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    invoke-interface {p0, p1}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    iget-object p1, v0, Lu1/e2;->c:Lu1/d2;

    invoke-interface {p0, p1}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static r(I)Z
    .locals 1

    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result p0

    const/16 v0, 0x17

    if-eq p0, v0, :cond_1

    const/16 v0, 0x14

    if-eq p0, v0, :cond_1

    const/16 v0, 0x16

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1e

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1d

    if-eq p0, v0, :cond_1

    const/16 v0, 0x18

    if-eq p0, v0, :cond_1

    const/16 v0, 0x15

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final s([F[F)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, Lu1/x1;->m([FI[FI)F

    move-result v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v0, v4}, Lu1/x1;->m([FI[FI)F

    move-result v5

    const/4 v6, 0x2

    invoke-static {v1, v2, v0, v6}, Lu1/x1;->m([FI[FI)F

    move-result v7

    const/4 v8, 0x3

    invoke-static {v1, v2, v0, v8}, Lu1/x1;->m([FI[FI)F

    move-result v9

    invoke-static {v1, v4, v0, v2}, Lu1/x1;->m([FI[FI)F

    move-result v10

    invoke-static {v1, v4, v0, v4}, Lu1/x1;->m([FI[FI)F

    move-result v11

    invoke-static {v1, v4, v0, v6}, Lu1/x1;->m([FI[FI)F

    move-result v12

    invoke-static {v1, v4, v0, v8}, Lu1/x1;->m([FI[FI)F

    move-result v13

    invoke-static {v1, v6, v0, v2}, Lu1/x1;->m([FI[FI)F

    move-result v14

    invoke-static {v1, v6, v0, v4}, Lu1/x1;->m([FI[FI)F

    move-result v15

    invoke-static {v1, v6, v0, v6}, Lu1/x1;->m([FI[FI)F

    move-result v16

    invoke-static {v1, v6, v0, v8}, Lu1/x1;->m([FI[FI)F

    move-result v17

    invoke-static {v1, v8, v0, v2}, Lu1/x1;->m([FI[FI)F

    move-result v18

    invoke-static {v1, v8, v0, v4}, Lu1/x1;->m([FI[FI)F

    move-result v19

    invoke-static {v1, v8, v0, v6}, Lu1/x1;->m([FI[FI)F

    move-result v20

    invoke-static {v1, v8, v0, v8}, Lu1/x1;->m([FI[FI)F

    move-result v1

    aput v3, v0, v2

    aput v5, v0, v4

    aput v7, v0, v6

    aput v9, v0, v8

    const/4 v2, 0x4

    aput v10, v0, v2

    const/4 v2, 0x5

    aput v11, v0, v2

    const/4 v2, 0x6

    aput v12, v0, v2

    const/4 v2, 0x7

    aput v13, v0, v2

    const/16 v2, 0x8

    aput v14, v0, v2

    const/16 v2, 0x9

    aput v15, v0, v2

    const/16 v2, 0xa

    aput v16, v0, v2

    const/16 v2, 0xb

    aput v17, v0, v2

    const/16 v2, 0xc

    aput v18, v0, v2

    const/16 v2, 0xd

    aput v19, v0, v2

    const/16 v2, 0xe

    aput v20, v0, v2

    const/16 v2, 0xf

    aput v1, v0, v2

    return-void
.end method
