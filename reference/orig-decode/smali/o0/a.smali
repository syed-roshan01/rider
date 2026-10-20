.class public final Lo0/a;
.super Ljava/lang/Object;


# instance fields
.field public a:[Ljava/lang/Object;

.field public b:[Ljava/lang/Object;

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Lo0/a;->a:[Ljava/lang/Object;

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lo0/a;->b:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 7

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lo0/a;->c:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lo0/a;->a:[Ljava/lang/Object;

    const/4 v3, 0x0

    :goto_0
    if-gt v3, v1, :cond_9

    add-int v4, v3, v1

    ushr-int/lit8 v4, v4, 0x1

    aget-object v5, v2, v4

    invoke-static {v5}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v6

    if-ge v6, v0, :cond_0

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_0
    if-le v6, v0, :cond_1

    add-int/lit8 v1, v4, -0x1

    goto :goto_0

    :cond_1
    if-ne p1, v5, :cond_2

    return v4

    :cond_2
    iget-object v1, p0, Lo0/a;->a:[Ljava/lang/Object;

    iget v2, p0, Lo0/a;->c:I

    add-int/lit8 v3, v4, -0x1

    :goto_1
    const/4 v5, -0x1

    if-ge v5, v3, :cond_5

    aget-object v5, v1, v3

    if-ne v5, p1, :cond_3

    goto :goto_4

    :cond_3
    invoke-static {v5}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v5

    if-eq v5, v0, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_5
    :goto_2
    add-int/lit8 v4, v4, 0x1

    move v3, v4

    :goto_3
    if-ge v3, v2, :cond_8

    aget-object v4, v1, v3

    if-ne v4, p1, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v4

    if-eq v4, v0, :cond_7

    add-int/lit8 v3, v3, 0x1

    neg-int v3, v3

    goto :goto_4

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    add-int/lit8 v2, v2, 0x1

    neg-int v3, v2

    :goto_4
    return v3

    :cond_9
    add-int/lit8 v3, v3, 0x1

    neg-int p1, v3

    return p1
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lo0/a;->a(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lo0/a;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final c(Ljava/lang/Object;Lo0/d;)V
    .locals 10

    iget-object v0, p0, Lo0/a;->a:[Ljava/lang/Object;

    iget-object v1, p0, Lo0/a;->b:[Ljava/lang/Object;

    iget v2, p0, Lo0/a;->c:I

    invoke-virtual {p0, p1}, Lo0/a;->a(Ljava/lang/Object;)I

    move-result v3

    if-ltz v3, :cond_0

    aput-object p2, v1, v3

    goto :goto_3

    :cond_0
    const/4 v4, 0x1

    add-int/2addr v3, v4

    neg-int v3, v3

    array-length v5, v0

    const/4 v6, 0x0

    if-ne v2, v5, :cond_1

    move v5, v4

    goto :goto_0

    :cond_1
    move v5, v6

    :goto_0
    if-eqz v5, :cond_2

    mul-int/lit8 v7, v2, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    goto :goto_1

    :cond_2
    move-object v7, v0

    :goto_1
    add-int/lit8 v8, v3, 0x1

    invoke-static {v8, v3, v2, v0, v7}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    const/4 v9, 0x6

    if-eqz v5, :cond_3

    invoke-static {v0, v7, v6, v3, v9}, Lb9/b;->L([Ljava/lang/Object;[Ljava/lang/Object;III)V

    :cond_3
    aput-object p1, v7, v3

    iput-object v7, p0, Lo0/a;->a:[Ljava/lang/Object;

    if-eqz v5, :cond_4

    mul-int/lit8 p1, v2, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    goto :goto_2

    :cond_4
    move-object p1, v1

    :goto_2
    invoke-static {v8, v3, v2, v1, p1}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    if-eqz v5, :cond_5

    invoke-static {v1, p1, v6, v3, v9}, Lb9/b;->L([Ljava/lang/Object;[Ljava/lang/Object;III)V

    :cond_5
    aput-object p2, p1, v3

    iput-object p1, p0, Lo0/a;->b:[Ljava/lang/Object;

    iget p1, p0, Lo0/a;->c:I

    add-int/2addr p1, v4

    iput p1, p0, Lo0/a;->c:I

    :goto_3
    return-void
.end method
