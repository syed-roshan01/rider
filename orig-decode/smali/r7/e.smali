.class public final Lr7/e;
.super Ljava/lang/Object;

# interfaces
.implements Lr7/q;
.implements Le8/y1;
.implements Lg8/v5;
.implements Lg8/m3;


# static fields
.field public static b:Lr7/e;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lr7/e;->a:I

    .line 5
    invoke-direct {p0, v0}, Lr7/e;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lr7/e;->a:I

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lr7/e;->a:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 p1, 0xb

    iput p1, p0, Lr7/e;->a:I

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lr7/e;-><init>(II)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/q;)V
    .locals 1

    const/16 p1, 0xd

    iput p1, p0, Lr7/e;->a:I

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lr7/e;-><init>(II)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/util/Map;)Lz7/b;
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7a

    sget-object v2, Lb8/a;->b:Lb8/a;

    sget-object v3, Ly7/a;->a:Ly7/a;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lb8/a;->valueOf(Ljava/lang/String;)Lb8/a;

    move-result-object v2

    :cond_0
    sget-object v3, Ly7/a;->c:Ly7/a;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x4

    if-eqz v4, :cond_1

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_0
    sget-object v4, Lc8/b;->a:[I

    sget-object v4, Ly7/a;->n:Ly7/a;

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_2

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v8

    goto :goto_1

    :cond_2
    move v4, v7

    :goto_1
    sget-object v6, Ly7/a;->f:Ly7/a;

    invoke-interface {v1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v8

    goto :goto_2

    :cond_3
    move v6, v7

    :goto_2
    sget-object v9, Ly7/a;->b:Ly7/a;

    invoke-interface {v1, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    sget-object v11, Lc8/b;->b:Ljava/nio/charset/Charset;

    if-eqz v10, :cond_4

    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v9

    goto :goto_3

    :cond_4
    move-object v9, v11

    :goto_3
    sget-object v12, Lb8/b;->e:Lb8/b;

    const/16 v14, 0x8

    const/4 v15, 0x2

    const/4 v13, -0x1

    const v17, 0x7fffffff

    if-eqz v6, :cond_d

    invoke-virtual {v9, v11}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/4 v9, 0x0

    :cond_5
    new-instance v6, Ll4/e;

    invoke-direct {v6, v0, v9, v4, v2}, Ll4/e;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;ZLb8/a;)V

    invoke-static {v8}, Ll4/e;->g(I)Lb8/c;

    move-result-object v0

    invoke-static {v15}, Ll4/e;->g(I)Lb8/c;

    move-result-object v4

    const/4 v9, 0x3

    invoke-static {v9}, Ll4/e;->g(I)Lb8/c;

    move-result-object v10

    filled-new-array {v0, v4, v10}, [Lb8/c;

    move-result-object v0

    new-array v4, v9, [Ll/z2;

    aget-object v10, v0, v7

    invoke-virtual {v6, v10}, Ll4/e;->e(Lb8/c;)Ll/z2;

    move-result-object v10

    aput-object v10, v4, v7

    aget-object v10, v0, v8

    invoke-virtual {v6, v10}, Ll4/e;->e(Lb8/c;)Ll/z2;

    move-result-object v10

    aput-object v10, v4, v8

    aget-object v10, v0, v15

    invoke-virtual {v6, v10}, Ll4/e;->e(Lb8/c;)Ll/z2;

    move-result-object v10

    aput-object v10, v4, v15

    move v10, v7

    move v11, v13

    move/from16 v12, v17

    :goto_4
    if-ge v10, v9, :cond_7

    aget-object v9, v4, v10

    iget-object v15, v9, Ll/z2;->c:Ljava/lang/Object;

    check-cast v15, Lb8/c;

    invoke-virtual {v9, v15}, Ll/z2;->A(Lb8/c;)I

    move-result v9

    aget-object v15, v0, v10

    iget-object v8, v6, Ll4/e;->d:Ljava/lang/Object;

    check-cast v8, Lb8/a;

    invoke-static {v9, v15, v8}, Lc8/b;->c(ILb8/c;Lb8/a;)Z

    move-result v8

    if-eqz v8, :cond_6

    if-ge v9, v12, :cond_6

    move v12, v9

    move v11, v10

    :cond_6
    add-int/lit8 v10, v10, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x3

    const/4 v15, 0x2

    goto :goto_4

    :cond_7
    if-ltz v11, :cond_c

    aget-object v0, v4, v11

    new-instance v4, Lz7/a;

    invoke-direct {v4}, Lz7/a;-><init>()V

    iget-object v6, v0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc8/e;

    iget-object v9, v8, Lc8/e;->a:Lb8/b;

    iget v10, v9, Lb8/b;->b:I

    invoke-virtual {v4, v10, v5}, Lz7/a;->b(II)V

    iget v10, v8, Lc8/e;->d:I

    iget-object v11, v8, Lc8/e;->e:Ll/z2;

    if-lez v10, :cond_9

    invoke-virtual {v8}, Lc8/e;->a()I

    move-result v12

    iget-object v15, v11, Ll/z2;->c:Ljava/lang/Object;

    check-cast v15, Lb8/c;

    invoke-virtual {v9, v15}, Lb8/b;->a(Lb8/c;)I

    move-result v15

    invoke-virtual {v4, v12, v15}, Lz7/a;->b(II)V

    :cond_9
    sget-object v12, Lb8/b;->f:Lb8/b;

    iget v15, v8, Lc8/e;->c:I

    if-ne v9, v12, :cond_a

    iget-object v8, v11, Ll/z2;->d:Ljava/lang/Object;

    check-cast v8, Ll4/e;

    iget-object v8, v8, Ll4/e;->c:Ljava/lang/Object;

    check-cast v8, Lz7/d;

    iget-object v8, v8, Lz7/d;->a:[Ljava/nio/charset/CharsetEncoder;

    aget-object v8, v8, v15

    invoke-virtual {v8}, Ljava/nio/charset/CharsetEncoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v8

    sget-object v9, Lz7/c;->d:Ljava/util/HashMap;

    invoke-virtual {v8}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lz7/c;

    iget-object v8, v8, Lz7/c;->a:[I

    aget v8, v8, v7

    invoke-virtual {v4, v8, v14}, Lz7/a;->b(II)V

    goto :goto_5

    :cond_a
    if-lez v10, :cond_8

    iget-object v12, v11, Ll/z2;->d:Ljava/lang/Object;

    check-cast v12, Ll4/e;

    iget-object v12, v12, Ll4/e;->b:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget v8, v8, Lc8/e;->b:I

    add-int/2addr v10, v8

    invoke-virtual {v12, v8, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    iget-object v10, v11, Ll/z2;->d:Ljava/lang/Object;

    check-cast v10, Ll4/e;

    iget-object v10, v10, Ll4/e;->c:Ljava/lang/Object;

    check-cast v10, Lz7/d;

    iget-object v10, v10, Lz7/d;->a:[Ljava/nio/charset/CharsetEncoder;

    aget-object v10, v10, v15

    invoke-virtual {v10}, Ljava/nio/charset/CharsetEncoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v10

    invoke-static {v8, v9, v4, v10}, Lc8/b;->a(Ljava/lang/String;Lb8/b;Lz7/a;Ljava/nio/charset/Charset;)V

    goto :goto_5

    :cond_b
    iget-object v0, v0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Lb8/c;

    goto/16 :goto_f

    :cond_c
    new-instance v0, Ly5/n;

    const-string v1, "Data too big for any version"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    sget-object v6, Lz7/e;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v6, v9}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-static/range {p0 .. p0}, Lc8/b;->b(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_e

    sget-object v6, Lb8/b;->n:Lb8/b;

    goto :goto_8

    :cond_e
    move v6, v7

    move v8, v6

    move v11, v8

    :goto_6
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v11, v15, :cond_11

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v14, 0x30

    if-lt v15, v14, :cond_f

    const/16 v14, 0x39

    if-gt v15, v14, :cond_f

    const/4 v8, 0x1

    goto :goto_7

    :cond_f
    const/16 v6, 0x60

    if-ge v15, v6, :cond_10

    sget-object v6, Lc8/b;->a:[I

    aget v6, v6, v15

    if-eq v6, v13, :cond_10

    const/4 v6, 0x1

    :goto_7
    add-int/lit8 v11, v11, 0x1

    const/16 v14, 0x8

    goto :goto_6

    :cond_10
    move-object v6, v12

    goto :goto_8

    :cond_11
    if-eqz v6, :cond_12

    sget-object v6, Lb8/b;->d:Lb8/b;

    goto :goto_8

    :cond_12
    if-eqz v8, :cond_10

    sget-object v6, Lb8/b;->c:Lb8/b;

    :goto_8
    new-instance v8, Lz7/a;

    invoke-direct {v8}, Lz7/a;-><init>()V

    if-ne v6, v12, :cond_13

    if-eqz v10, :cond_13

    sget-object v10, Lz7/c;->d:Ljava/util/HashMap;

    invoke-virtual {v9}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lz7/c;

    if-eqz v10, :cond_13

    const/4 v11, 0x7

    invoke-virtual {v8, v11, v5}, Lz7/a;->b(II)V

    iget-object v10, v10, Lz7/c;->a:[I

    aget v10, v10, v7

    const/16 v11, 0x8

    invoke-virtual {v8, v10, v11}, Lz7/a;->b(II)V

    :cond_13
    if-eqz v4, :cond_14

    const/4 v4, 0x5

    invoke-virtual {v8, v4, v5}, Lz7/a;->b(II)V

    :cond_14
    iget v4, v6, Lb8/b;->b:I

    invoke-virtual {v8, v4, v5}, Lz7/a;->b(II)V

    new-instance v4, Lz7/a;

    invoke-direct {v4}, Lz7/a;-><init>()V

    invoke-static {v0, v6, v4, v9}, Lc8/b;->a(Ljava/lang/String;Lb8/b;Lz7/a;Ljava/nio/charset/Charset;)V

    sget-object v9, Ly7/a;->d:Ly7/a;

    invoke-interface {v1, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_16

    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-static {v9}, Lb8/c;->b(I)Lb8/c;

    move-result-object v9

    iget v10, v8, Lz7/a;->b:I

    invoke-virtual {v6, v9}, Lb8/b;->a(Lb8/c;)I

    move-result v11

    add-int/2addr v11, v10

    iget v10, v4, Lz7/a;->b:I

    add-int/2addr v11, v10

    invoke-static {v11, v9, v2}, Lc8/b;->c(ILb8/c;Lb8/a;)Z

    move-result v10

    if-eqz v10, :cond_15

    move-object v15, v9

    goto :goto_b

    :cond_15
    new-instance v0, Ly5/n;

    const-string v1, "Data too big for requested version"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    const/4 v9, 0x1

    invoke-static {v9}, Lb8/c;->b(I)Lb8/c;

    move-result-object v10

    iget v9, v8, Lz7/a;->b:I

    invoke-virtual {v6, v10}, Lb8/b;->a(Lb8/c;)I

    move-result v10

    add-int/2addr v10, v9

    iget v9, v4, Lz7/a;->b:I

    add-int/2addr v10, v9

    const/4 v9, 0x1

    :goto_9
    const-string v11, "Data too big"

    const/16 v14, 0x28

    if-gt v9, v14, :cond_79

    invoke-static {v9}, Lb8/c;->b(I)Lb8/c;

    move-result-object v15

    invoke-static {v10, v15, v2}, Lc8/b;->c(ILb8/c;Lb8/a;)Z

    move-result v20

    if-eqz v20, :cond_78

    iget v9, v8, Lz7/a;->b:I

    invoke-virtual {v6, v15}, Lb8/b;->a(Lb8/c;)I

    move-result v10

    add-int/2addr v10, v9

    iget v9, v4, Lz7/a;->b:I

    add-int/2addr v10, v9

    const/4 v9, 0x1

    :goto_a
    if-gt v9, v14, :cond_77

    invoke-static {v9}, Lb8/c;->b(I)Lb8/c;

    move-result-object v15

    invoke-static {v10, v15, v2}, Lc8/b;->c(ILb8/c;Lb8/a;)Z

    move-result v20

    if-eqz v20, :cond_76

    :goto_b
    new-instance v9, Lz7/a;

    invoke-direct {v9}, Lz7/a;-><init>()V

    iget v10, v8, Lz7/a;->b:I

    invoke-virtual {v9, v10}, Lz7/a;->c(I)V

    move v11, v7

    :goto_c
    if-ge v11, v10, :cond_17

    invoke-virtual {v8, v11}, Lz7/a;->d(I)Z

    move-result v14

    invoke-virtual {v9, v14}, Lz7/a;->a(Z)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_c

    :cond_17
    if-ne v6, v12, :cond_18

    invoke-virtual {v4}, Lz7/a;->e()I

    move-result v0

    goto :goto_d

    :cond_18
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_d
    invoke-virtual {v6, v15}, Lb8/b;->a(Lb8/c;)I

    move-result v6

    const/4 v8, 0x1

    shl-int v10, v8, v6

    if-ge v0, v10, :cond_75

    invoke-virtual {v9, v0, v6}, Lz7/a;->b(II)V

    iget v0, v4, Lz7/a;->b:I

    iget v6, v9, Lz7/a;->b:I

    add-int/2addr v6, v0

    invoke-virtual {v9, v6}, Lz7/a;->c(I)V

    move v6, v7

    :goto_e
    if-ge v6, v0, :cond_19

    invoke-virtual {v4, v6}, Lz7/a;->d(I)Z

    move-result v8

    invoke-virtual {v9, v8}, Lz7/a;->a(Z)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_e

    :cond_19
    move-object v4, v9

    move-object v0, v15

    :goto_f
    iget-object v6, v0, Lb8/c;->b:[La4/c0;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget-object v6, v6, v8

    iget v8, v6, La4/c0;->a:I

    iget-object v9, v6, La4/c0;->b:Ljava/lang/Object;

    check-cast v9, [Lb3/s;

    array-length v10, v9

    move v11, v7

    move v12, v11

    :goto_10
    if-ge v11, v10, :cond_1a

    aget-object v14, v9, v11

    iget v14, v14, Lb3/s;->a:I

    add-int/2addr v12, v14

    add-int/lit8 v11, v11, 0x1

    goto :goto_10

    :cond_1a
    mul-int/2addr v12, v8

    iget v8, v0, Lb8/c;->c:I

    sub-int v9, v8, v12

    mul-int/lit8 v10, v9, 0x8

    iget v11, v4, Lz7/a;->b:I

    if-gt v11, v10, :cond_74

    move v11, v7

    :goto_11
    if-ge v11, v5, :cond_1b

    iget v12, v4, Lz7/a;->b:I

    if-ge v12, v10, :cond_1b

    invoke-virtual {v4, v7}, Lz7/a;->a(Z)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_11

    :cond_1b
    iget v11, v4, Lz7/a;->b:I

    const/4 v15, 0x7

    and-int/2addr v11, v15

    if-lez v11, :cond_1c

    :goto_12
    const/16 v12, 0x8

    if-ge v11, v12, :cond_1c

    invoke-virtual {v4, v7}, Lz7/a;->a(Z)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_12

    :cond_1c
    invoke-virtual {v4}, Lz7/a;->e()I

    move-result v11

    sub-int v11, v9, v11

    move v12, v7

    :goto_13
    if-ge v12, v11, :cond_1e

    and-int/lit8 v15, v12, 0x1

    if-nez v15, :cond_1d

    const/16 v14, 0xec

    :goto_14
    const/16 v15, 0x8

    goto :goto_15

    :cond_1d
    const/16 v14, 0x11

    goto :goto_14

    :goto_15
    invoke-virtual {v4, v14, v15}, Lz7/a;->b(II)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_13

    :cond_1e
    iget v11, v4, Lz7/a;->b:I

    if-ne v11, v10, :cond_73

    iget-object v6, v6, La4/c0;->b:Ljava/lang/Object;

    check-cast v6, [Lb3/s;

    array-length v10, v6

    move v11, v7

    move v12, v11

    :goto_16
    if-ge v11, v10, :cond_1f

    aget-object v15, v6, v11

    iget v15, v15, Lb3/s;->a:I

    add-int/2addr v12, v15

    add-int/lit8 v11, v11, 0x1

    goto :goto_16

    :cond_1f
    invoke-virtual {v4}, Lz7/a;->e()I

    move-result v6

    if-ne v6, v9, :cond_72

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v12}, Ljava/util/ArrayList;-><init>(I)V

    move v10, v7

    move v11, v10

    move v13, v11

    move v15, v13

    :goto_17
    if-ge v10, v12, :cond_45

    const/4 v14, 0x1

    new-array v5, v14, [I

    new-array v7, v14, [I

    if-ge v10, v12, :cond_44

    rem-int v14, v8, v12

    move/from16 v21, v3

    sub-int v3, v12, v14

    div-int v22, v8, v12

    add-int/lit8 v23, v22, 0x1

    div-int v24, v9, v12

    add-int/lit8 v25, v24, 0x1

    move-object/from16 v26, v2

    sub-int v2, v22, v24

    sub-int v1, v23, v25

    if-ne v2, v1, :cond_43

    move-object/from16 v22, v0

    add-int v0, v3, v14

    if-ne v12, v0, :cond_42

    add-int v0, v24, v2

    mul-int/2addr v0, v3

    add-int v23, v25, v1

    mul-int v23, v23, v14

    add-int v0, v23, v0

    if-ne v8, v0, :cond_41

    if-ge v10, v3, :cond_20

    const/4 v0, 0x0

    aput v24, v5, v0

    aput v2, v7, v0

    goto :goto_18

    :cond_20
    const/4 v0, 0x0

    aput v25, v5, v0

    aput v1, v7, v0

    :goto_18
    aget v1, v5, v0

    new-array v0, v1, [B

    mul-int/lit8 v2, v11, 0x8

    const/4 v3, 0x0

    :goto_19
    if-ge v3, v1, :cond_23

    move/from16 v24, v8

    move/from16 v23, v12

    const/16 v8, 0x8

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_1a
    if-ge v14, v8, :cond_22

    invoke-virtual {v4, v2}, Lz7/a;->d(I)Z

    move-result v8

    if-eqz v8, :cond_21

    rsub-int/lit8 v8, v14, 0x7

    const/16 v19, 0x1

    shl-int v8, v19, v8

    or-int/2addr v8, v12

    move v12, v8

    :cond_21
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v14, v14, 0x1

    const/16 v8, 0x8

    goto :goto_1a

    :cond_22
    int-to-byte v8, v12

    aput-byte v8, v0, v3

    add-int/lit8 v3, v3, 0x1

    move/from16 v12, v23

    move/from16 v8, v24

    goto :goto_19

    :cond_23
    move/from16 v24, v8

    move/from16 v23, v12

    const/4 v2, 0x0

    aget v3, v7, v2

    add-int v2, v1, v3

    new-array v7, v2, [I

    const/4 v8, 0x0

    :goto_1b
    if-ge v8, v1, :cond_24

    aget-byte v12, v0, v8

    and-int/lit16 v12, v12, 0xff

    aput v12, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1b

    :cond_24
    sget-object v8, La8/a;->g:La8/a;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, La8/b;

    move-object/from16 v27, v4

    const/16 v25, 0x1

    filled-new-array/range {v25 .. v25}, [I

    move-result-object v4

    invoke-direct {v14, v8, v4}, La8/b;-><init>(La8/a;[I)V

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v3, :cond_40

    sub-int/2addr v2, v3

    if-lez v2, :cond_3f

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v4

    const-string v14, "GenericGFPolys do not have same GenericGF field"

    if-lt v3, v4, :cond_2d

    move/from16 v4, v25

    invoke-static {v12, v4}, La7/a;->k(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v25

    check-cast v25, La8/b;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_1c
    if-gt v4, v3, :cond_2d

    add-int/lit8 v28, v4, -0x1

    move/from16 v29, v9

    iget v9, v8, La8/a;->f:I

    add-int v28, v28, v9

    iget-object v9, v8, La8/a;->a:[I

    aget v9, v9, v28

    move/from16 v28, v10

    const/4 v10, 0x1

    filled-new-array {v10, v9}, [I

    move-result-object v9

    const/4 v10, 0x0

    aget v30, v9, v10

    if-nez v30, :cond_27

    move/from16 v30, v11

    const/4 v10, 0x1

    const/4 v11, 0x2

    :goto_1d
    if-ge v10, v11, :cond_25

    aget v18, v9, v10

    if-nez v18, :cond_25

    add-int/lit8 v10, v10, 0x1

    goto :goto_1d

    :cond_25
    if-ne v10, v11, :cond_26

    const/4 v11, 0x0

    filled-new-array {v11}, [I

    move-result-object v9

    move-object/from16 v31, v5

    move/from16 v32, v13

    goto :goto_1e

    :cond_26
    const/4 v11, 0x0

    move-object/from16 v31, v5

    rsub-int/lit8 v5, v10, 0x2

    move/from16 v32, v13

    new-array v13, v5, [I

    invoke-static {v9, v10, v13, v11, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v9, v13

    goto :goto_1e

    :cond_27
    move-object/from16 v31, v5

    move/from16 v30, v11

    move/from16 v32, v13

    const/4 v11, 0x0

    :goto_1e
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v5, v25

    iget-object v10, v5, La8/b;->a:La8/a;

    invoke-virtual {v10, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2c

    invoke-virtual {v5}, La8/b;->c()Z

    move-result v13

    if-nez v13, :cond_28

    aget v13, v9, v11

    if-nez v13, :cond_29

    :cond_28
    move-object/from16 v25, v6

    move/from16 v33, v15

    goto :goto_21

    :cond_29
    iget-object v5, v5, La8/b;->b:[I

    array-length v11, v5

    array-length v13, v9

    add-int v25, v11, v13

    move/from16 v33, v15

    const/16 v19, 0x1

    add-int/lit8 v15, v25, -0x1

    new-array v15, v15, [I

    move-object/from16 v25, v6

    const/4 v6, 0x0

    :goto_1f
    if-ge v6, v11, :cond_2b

    move/from16 v34, v11

    aget v11, v5, v6

    move-object/from16 v35, v5

    const/4 v5, 0x0

    :goto_20
    if-ge v5, v13, :cond_2a

    add-int v36, v6, v5

    aget v37, v15, v36

    move/from16 v38, v13

    aget v13, v9, v5

    invoke-virtual {v10, v11, v13}, La8/a;->a(II)I

    move-result v13

    xor-int v13, v37, v13

    aput v13, v15, v36

    add-int/lit8 v5, v5, 0x1

    move/from16 v13, v38

    goto :goto_20

    :cond_2a
    move/from16 v38, v13

    add-int/lit8 v6, v6, 0x1

    move/from16 v11, v34

    move-object/from16 v5, v35

    goto :goto_1f

    :cond_2b
    new-instance v5, La8/b;

    invoke-direct {v5, v10, v15}, La8/b;-><init>(La8/a;[I)V

    goto :goto_22

    :goto_21
    iget-object v5, v10, La8/a;->c:La8/b;

    :goto_22
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v6, v25

    move/from16 v10, v28

    move/from16 v9, v29

    move/from16 v11, v30

    move/from16 v13, v32

    move/from16 v15, v33

    move-object/from16 v25, v5

    move-object/from16 v5, v31

    goto/16 :goto_1c

    :cond_2c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2d
    move-object/from16 v31, v5

    move-object/from16 v25, v6

    move/from16 v29, v9

    move/from16 v28, v10

    move/from16 v30, v11

    move/from16 v32, v13

    move/from16 v33, v15

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La8/b;

    new-array v5, v2, [I

    const/4 v6, 0x0

    invoke-static {v7, v6, v5, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz v2, :cond_3e

    const/4 v9, 0x1

    if-le v2, v9, :cond_30

    aget v9, v5, v6

    if-nez v9, :cond_30

    const/4 v6, 0x1

    :goto_23
    if-ge v6, v2, :cond_2e

    aget v9, v5, v6

    if-nez v9, :cond_2e

    add-int/lit8 v6, v6, 0x1

    goto :goto_23

    :cond_2e
    if-ne v6, v2, :cond_2f

    const/4 v9, 0x0

    filled-new-array {v9}, [I

    move-result-object v5

    goto :goto_24

    :cond_2f
    const/4 v9, 0x0

    sub-int v10, v2, v6

    new-array v11, v10, [I

    invoke-static {v5, v6, v11, v9, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v5, v11

    :cond_30
    :goto_24
    if-ltz v3, :cond_3d

    array-length v6, v5

    add-int v9, v6, v3

    new-array v9, v9, [I

    const/4 v10, 0x0

    :goto_25
    if-ge v10, v6, :cond_31

    aget v11, v5, v10

    const/4 v12, 0x1

    invoke-virtual {v8, v11, v12}, La8/a;->a(II)I

    move-result v11

    aput v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_25

    :cond_31
    new-instance v5, La8/b;

    invoke-direct {v5, v8, v9}, La8/b;-><init>(La8/a;[I)V

    iget-object v6, v4, La8/b;->a:La8/a;

    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3c

    invoke-virtual {v4}, La8/b;->c()Z

    move-result v6

    if-nez v6, :cond_3b

    invoke-virtual {v4}, La8/b;->b()I

    move-result v6

    iget-object v9, v4, La8/b;->b:[I

    array-length v10, v9

    const/4 v11, 0x1

    sub-int/2addr v10, v11

    sub-int/2addr v10, v6

    aget v6, v9, v10

    if-eqz v6, :cond_3a

    iget-object v10, v8, La8/a;->b:[I

    aget v6, v10, v6

    iget v10, v8, La8/a;->d:I

    sub-int/2addr v10, v6

    sub-int/2addr v10, v11

    iget-object v6, v8, La8/a;->a:[I

    aget v6, v6, v10

    iget-object v10, v8, La8/a;->c:La8/b;

    move-object v11, v10

    :goto_26
    invoke-virtual {v5}, La8/b;->b()I

    move-result v12

    invoke-virtual {v4}, La8/b;->b()I

    move-result v13

    if-lt v12, v13, :cond_37

    invoke-virtual {v5}, La8/b;->c()Z

    move-result v12

    if-nez v12, :cond_37

    invoke-virtual {v5}, La8/b;->b()I

    move-result v12

    invoke-virtual {v4}, La8/b;->b()I

    move-result v13

    sub-int/2addr v12, v13

    invoke-virtual {v5}, La8/b;->b()I

    move-result v13

    iget-object v14, v5, La8/b;->b:[I

    array-length v15, v14

    const/16 v19, 0x1

    add-int/lit8 v15, v15, -0x1

    sub-int/2addr v15, v13

    aget v13, v14, v15

    invoke-virtual {v8, v13, v6}, La8/a;->a(II)I

    move-result v13

    if-ltz v12, :cond_36

    iget-object v14, v4, La8/b;->a:La8/a;

    if-nez v13, :cond_32

    iget-object v14, v14, La8/a;->c:La8/b;

    move-object/from16 v34, v4

    move/from16 v35, v6

    move-object/from16 v36, v10

    goto :goto_28

    :cond_32
    array-length v15, v9

    move-object/from16 v34, v4

    add-int v4, v15, v12

    new-array v4, v4, [I

    move/from16 v35, v6

    const/4 v6, 0x0

    :goto_27
    if-ge v6, v15, :cond_33

    move-object/from16 v36, v10

    aget v10, v9, v6

    invoke-virtual {v14, v10, v13}, La8/a;->a(II)I

    move-result v10

    aput v10, v4, v6

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v10, v36

    goto :goto_27

    :cond_33
    move-object/from16 v36, v10

    new-instance v6, La8/b;

    invoke-direct {v6, v14, v4}, La8/b;-><init>(La8/a;[I)V

    move-object v14, v6

    :goto_28
    if-ltz v12, :cond_35

    if-nez v13, :cond_34

    move-object/from16 v6, v36

    goto :goto_29

    :cond_34
    add-int/lit8 v12, v12, 0x1

    new-array v4, v12, [I

    const/4 v6, 0x0

    aput v13, v4, v6

    new-instance v6, La8/b;

    invoke-direct {v6, v8, v4}, La8/b;-><init>(La8/a;[I)V

    :goto_29
    invoke-virtual {v11, v6}, La8/b;->a(La8/b;)La8/b;

    move-result-object v11

    invoke-virtual {v5, v14}, La8/b;->a(La8/b;)La8/b;

    move-result-object v5

    move-object/from16 v4, v34

    move/from16 v6, v35

    move-object/from16 v10, v36

    goto :goto_26

    :cond_35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_36
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_37
    filled-new-array {v11, v5}, [La8/b;

    move-result-object v4

    const/4 v5, 0x1

    aget-object v4, v4, v5

    iget-object v4, v4, La8/b;->b:[I

    array-length v5, v4

    sub-int v5, v3, v5

    const/4 v6, 0x0

    :goto_2a
    if-ge v6, v5, :cond_38

    add-int v8, v2, v6

    const/4 v9, 0x0

    aput v9, v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_2a

    :cond_38
    const/4 v9, 0x0

    add-int/2addr v2, v5

    array-length v5, v4

    invoke-static {v4, v9, v7, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v2, v3, [B

    const/4 v4, 0x0

    :goto_2b
    if-ge v4, v3, :cond_39

    add-int v5, v1, v4

    aget v5, v7, v5

    int-to-byte v5, v5

    aput-byte v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2b

    :cond_39
    new-instance v4, Lc8/a;

    invoke-direct {v4, v0, v2}, Lc8/a;-><init>([B[B)V

    move-object/from16 v0, v25

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v7, v33

    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    move-result v15

    move/from16 v1, v32

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v13

    const/4 v1, 0x0

    aget v2, v31, v1

    add-int v11, v30, v2

    add-int/lit8 v10, v28, 0x1

    move-object/from16 v1, p1

    move-object v6, v0

    move/from16 v3, v21

    move-object/from16 v0, v22

    move/from16 v12, v23

    move/from16 v8, v24

    move-object/from16 v2, v26

    move-object/from16 v4, v27

    move/from16 v9, v29

    const/4 v5, 0x4

    const/4 v7, 0x0

    goto/16 :goto_17

    :cond_3a
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_3b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Divide by 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_3e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_3f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No data bytes provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_40
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No error correction bytes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_41
    new-instance v0, Ly5/n;

    const-string v1, "Total bytes mismatch"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_42
    new-instance v0, Ly5/n;

    const-string v1, "RS blocks mismatch"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_43
    new-instance v0, Ly5/n;

    const-string v1, "EC bytes mismatch"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_44
    new-instance v0, Ly5/n;

    const-string v1, "Block ID too large"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_45
    move-object/from16 v22, v0

    move-object/from16 v26, v2

    move/from16 v21, v3

    move-object v0, v6

    move/from16 v24, v8

    move v8, v9

    move v1, v13

    move v7, v15

    if-ne v8, v11, :cond_71

    new-instance v2, Lz7/a;

    invoke-direct {v2}, Lz7/a;-><init>()V

    const/4 v3, 0x0

    :goto_2c
    if-ge v3, v7, :cond_48

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_46
    :goto_2d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_47

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc8/a;

    iget-object v5, v5, Lc8/a;->a:[B

    array-length v6, v5

    if-ge v3, v6, :cond_46

    aget-byte v5, v5, v3

    const/16 v6, 0x8

    invoke-virtual {v2, v5, v6}, Lz7/a;->b(II)V

    goto :goto_2d

    :cond_47
    add-int/lit8 v3, v3, 0x1

    goto :goto_2c

    :cond_48
    const/4 v3, 0x0

    :goto_2e
    if-ge v3, v1, :cond_4b

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_49
    :goto_2f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc8/a;

    iget-object v5, v5, Lc8/a;->b:[B

    array-length v6, v5

    if-ge v3, v6, :cond_49

    aget-byte v5, v5, v3

    const/16 v6, 0x8

    invoke-virtual {v2, v5, v6}, Lz7/a;->b(II)V

    goto :goto_2f

    :cond_4a
    add-int/lit8 v3, v3, 0x1

    goto :goto_2e

    :cond_4b
    invoke-virtual {v2}, Lz7/a;->e()I

    move-result v0

    move/from16 v1, v24

    if-ne v1, v0, :cond_70

    move-object/from16 v15, v22

    iget v0, v15, Lb8/c;->a:I

    const/4 v1, 0x4

    mul-int/2addr v0, v1

    const/16 v1, 0x11

    add-int/2addr v0, v1

    new-instance v1, Lk3/b;

    const/4 v3, 0x2

    invoke-direct {v1, v0, v0, v3}, Lk3/b;-><init>(III)V

    sget-object v0, Ly7/a;->e:Ly7/a;

    move-object/from16 v3, p1

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4c

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v5, 0x8

    if-ltz v0, :cond_4d

    if-ge v0, v5, :cond_4d

    :goto_30
    const/4 v7, -0x1

    goto :goto_31

    :cond_4c
    const/16 v5, 0x8

    :cond_4d
    const/4 v0, -0x1

    goto :goto_30

    :goto_31
    if-ne v0, v7, :cond_67

    move v13, v7

    move/from16 v3, v17

    const/4 v0, 0x0

    :goto_32
    if-ge v0, v5, :cond_66

    move-object/from16 v4, v26

    invoke-static {v2, v4, v15, v0, v1}, Lc8/c;->a(Lz7/a;Lb8/a;Lb8/c;ILk3/b;)V

    const/4 v6, 0x1

    invoke-static {v1, v6}, Ld7/t;->C(Lk3/b;Z)I

    move-result v7

    const/4 v6, 0x0

    invoke-static {v1, v6}, Ld7/t;->C(Lk3/b;Z)I

    move-result v8

    add-int/2addr v8, v7

    iget-object v7, v1, Lk3/b;->d:Ljava/lang/Object;

    check-cast v7, [[B

    iget v9, v1, Lk3/b;->b:I

    iget v10, v1, Lk3/b;->c:I

    move v11, v6

    move v12, v11

    :goto_33
    const/4 v14, 0x1

    add-int/lit8 v5, v10, -0x1

    if-ge v11, v5, :cond_50

    aget-object v5, v7, v11

    move/from16 v16, v12

    move v12, v6

    :goto_34
    add-int/lit8 v6, v9, -0x1

    if-ge v12, v6, :cond_4f

    aget-byte v6, v5, v12

    add-int/lit8 v14, v12, 0x1

    move/from16 v17, v9

    aget-byte v9, v5, v14

    if-ne v6, v9, :cond_4e

    add-int/lit8 v9, v11, 0x1

    aget-object v9, v7, v9

    aget-byte v12, v9, v12

    if-ne v6, v12, :cond_4e

    aget-byte v9, v9, v14

    if-ne v6, v9, :cond_4e

    add-int/lit8 v16, v16, 0x1

    :cond_4e
    move v12, v14

    move/from16 v9, v17

    const/4 v14, 0x1

    goto :goto_34

    :cond_4f
    move/from16 v17, v9

    add-int/lit8 v11, v11, 0x1

    move/from16 v12, v16

    const/4 v6, 0x0

    goto :goto_33

    :cond_50
    mul-int/lit8 v12, v12, 0x3

    add-int/2addr v12, v8

    iget-object v5, v1, Lk3/b;->d:Ljava/lang/Object;

    check-cast v5, [[B

    iget v6, v1, Lk3/b;->b:I

    iget v7, v1, Lk3/b;->c:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_35
    if-ge v8, v7, :cond_61

    move v10, v9

    const/4 v9, 0x0

    :goto_36
    if-ge v9, v6, :cond_60

    aget-object v11, v5, v8

    add-int/lit8 v14, v9, 0x6

    move/from16 v16, v6

    if-ge v14, v6, :cond_57

    aget-byte v6, v11, v9

    move/from16 p0, v13

    const/4 v13, 0x1

    if-ne v6, v13, :cond_58

    add-int/lit8 v6, v9, 0x1

    aget-byte v6, v11, v6

    if-nez v6, :cond_58

    add-int/lit8 v6, v9, 0x2

    aget-byte v6, v11, v6

    if-ne v6, v13, :cond_58

    add-int/lit8 v6, v9, 0x3

    aget-byte v6, v11, v6

    if-ne v6, v13, :cond_58

    add-int/lit8 v6, v9, 0x4

    aget-byte v6, v11, v6

    if-ne v6, v13, :cond_58

    add-int/lit8 v6, v9, 0x5

    aget-byte v6, v11, v6

    if-nez v6, :cond_58

    aget-byte v6, v11, v14

    if-ne v6, v13, :cond_58

    add-int/lit8 v6, v9, -0x4

    if-ltz v6, :cond_53

    array-length v14, v11

    if-ge v14, v9, :cond_51

    goto :goto_38

    :cond_51
    :goto_37
    if-ge v6, v9, :cond_56

    aget-byte v14, v11, v6

    if-ne v14, v13, :cond_52

    goto :goto_38

    :cond_52
    add-int/lit8 v6, v6, 0x1

    const/4 v13, 0x1

    goto :goto_37

    :cond_53
    :goto_38
    add-int/lit8 v6, v9, 0x7

    add-int/lit8 v13, v9, 0xb

    if-ltz v6, :cond_58

    array-length v14, v11

    if-ge v14, v13, :cond_54

    goto :goto_3a

    :cond_54
    :goto_39
    if-ge v6, v13, :cond_56

    aget-byte v14, v11, v6

    move-object/from16 p1, v11

    const/4 v11, 0x1

    if-ne v14, v11, :cond_55

    goto :goto_3a

    :cond_55
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v11, p1

    goto :goto_39

    :cond_56
    add-int/lit8 v10, v10, 0x1

    goto :goto_3a

    :cond_57
    move/from16 p0, v13

    :cond_58
    :goto_3a
    add-int/lit8 v6, v8, 0x6

    if-ge v6, v7, :cond_5f

    aget-object v11, v5, v8

    aget-byte v11, v11, v9

    const/4 v13, 0x1

    if-ne v11, v13, :cond_5f

    add-int/lit8 v11, v8, 0x1

    aget-object v11, v5, v11

    aget-byte v11, v11, v9

    if-nez v11, :cond_5f

    add-int/lit8 v11, v8, 0x2

    aget-object v11, v5, v11

    aget-byte v11, v11, v9

    if-ne v11, v13, :cond_5f

    add-int/lit8 v11, v8, 0x3

    aget-object v11, v5, v11

    aget-byte v11, v11, v9

    if-ne v11, v13, :cond_5f

    add-int/lit8 v11, v8, 0x4

    aget-object v11, v5, v11

    aget-byte v11, v11, v9

    if-ne v11, v13, :cond_5f

    add-int/lit8 v11, v8, 0x5

    aget-object v11, v5, v11

    aget-byte v11, v11, v9

    if-nez v11, :cond_5f

    aget-object v6, v5, v6

    aget-byte v6, v6, v9

    if-ne v6, v13, :cond_5f

    add-int/lit8 v6, v8, -0x4

    if-ltz v6, :cond_5b

    array-length v11, v5

    if-ge v11, v8, :cond_59

    goto :goto_3c

    :cond_59
    :goto_3b
    if-ge v6, v8, :cond_5e

    aget-object v11, v5, v6

    aget-byte v11, v11, v9

    const/4 v13, 0x1

    if-ne v11, v13, :cond_5a

    goto :goto_3c

    :cond_5a
    add-int/lit8 v6, v6, 0x1

    goto :goto_3b

    :cond_5b
    :goto_3c
    add-int/lit8 v6, v8, 0x7

    add-int/lit8 v11, v8, 0xb

    if-ltz v6, :cond_5f

    array-length v13, v5

    if-ge v13, v11, :cond_5c

    goto :goto_3e

    :cond_5c
    :goto_3d
    if-ge v6, v11, :cond_5e

    aget-object v13, v5, v6

    aget-byte v13, v13, v9

    const/4 v14, 0x1

    if-ne v13, v14, :cond_5d

    goto :goto_3e

    :cond_5d
    add-int/lit8 v6, v6, 0x1

    goto :goto_3d

    :cond_5e
    add-int/lit8 v10, v10, 0x1

    :cond_5f
    :goto_3e
    add-int/lit8 v9, v9, 0x1

    move/from16 v13, p0

    move/from16 v6, v16

    goto/16 :goto_36

    :cond_60
    move/from16 v16, v6

    move/from16 p0, v13

    add-int/lit8 v8, v8, 0x1

    move v9, v10

    goto/16 :goto_35

    :cond_61
    move/from16 p0, v13

    mul-int/lit8 v9, v9, 0x28

    add-int/2addr v9, v12

    iget-object v5, v1, Lk3/b;->d:Ljava/lang/Object;

    check-cast v5, [[B

    iget v6, v1, Lk3/b;->b:I

    iget v7, v1, Lk3/b;->c:I

    const/4 v8, 0x0

    const/4 v10, 0x0

    :goto_3f
    if-ge v8, v7, :cond_64

    aget-object v11, v5, v8

    move v12, v10

    const/4 v10, 0x0

    :goto_40
    if-ge v10, v6, :cond_63

    aget-byte v13, v11, v10

    const/4 v14, 0x1

    if-ne v13, v14, :cond_62

    add-int/lit8 v12, v12, 0x1

    :cond_62
    add-int/lit8 v10, v10, 0x1

    goto :goto_40

    :cond_63
    add-int/lit8 v8, v8, 0x1

    move v10, v12

    goto :goto_3f

    :cond_64
    iget v5, v1, Lk3/b;->c:I

    iget v6, v1, Lk3/b;->b:I

    mul-int/2addr v5, v6

    mul-int/lit8 v10, v10, 0x2

    sub-int/2addr v10, v5

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v6

    mul-int/lit8 v6, v6, 0xa

    div-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0xa

    add-int/2addr v6, v9

    if-ge v6, v3, :cond_65

    move v13, v0

    move v3, v6

    goto :goto_41

    :cond_65
    move/from16 v13, p0

    :goto_41
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v26, v4

    const/16 v5, 0x8

    goto/16 :goto_32

    :cond_66
    move/from16 p0, v13

    move-object/from16 v4, v26

    move/from16 v0, p0

    goto :goto_42

    :cond_67
    move-object/from16 v4, v26

    :goto_42
    invoke-static {v2, v4, v15, v0, v1}, Lc8/c;->a(Lz7/a;Lb8/a;Lb8/c;ILk3/b;)V

    iget v0, v1, Lk3/b;->b:I

    iget v2, v1, Lk3/b;->c:I

    const/4 v5, 0x2

    mul-int/lit8 v3, v21, 0x2

    add-int v4, v0, v3

    add-int/2addr v3, v2

    const/16 v6, 0x200

    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    div-int v4, v7, v4

    div-int v3, v6, v3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    mul-int v4, v0, v3

    sub-int v4, v7, v4

    div-int/2addr v4, v5

    mul-int v8, v2, v3

    sub-int v8, v6, v8

    div-int/2addr v8, v5

    new-instance v5, Lz7/b;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const/4 v9, 0x1

    if-lt v7, v9, :cond_6f

    if-lt v6, v9, :cond_6f

    iput v7, v5, Lz7/b;->a:I

    iput v6, v5, Lz7/b;->b:I

    add-int/lit8 v7, v7, 0x1f

    div-int/lit8 v7, v7, 0x20

    iput v7, v5, Lz7/b;->c:I

    mul-int/2addr v7, v6

    new-array v6, v7, [I

    iput-object v6, v5, Lz7/b;->d:[I

    const/4 v6, 0x0

    :goto_43
    if-ge v6, v2, :cond_6e

    move v9, v4

    const/4 v7, 0x0

    :goto_44
    if-ge v7, v0, :cond_6d

    invoke-virtual {v1, v7, v6}, Lk3/b;->a(II)B

    move-result v10

    const/4 v11, 0x1

    if-ne v10, v11, :cond_69

    if-ltz v8, :cond_6c

    if-ltz v9, :cond_6c

    if-lt v3, v11, :cond_6b

    if-lt v3, v11, :cond_6b

    add-int v10, v9, v3

    add-int v11, v8, v3

    iget v12, v5, Lz7/b;->b:I

    if-gt v11, v12, :cond_6a

    iget v12, v5, Lz7/b;->a:I

    if-gt v10, v12, :cond_6a

    move v12, v8

    :goto_45
    if-ge v12, v11, :cond_69

    iget v13, v5, Lz7/b;->c:I

    mul-int/2addr v13, v12

    move v14, v9

    :goto_46
    if-ge v14, v10, :cond_68

    div-int/lit8 v15, v14, 0x20

    add-int/2addr v15, v13

    move/from16 v16, v0

    iget-object v0, v5, Lz7/b;->d:[I

    aget v17, v0, v15

    and-int/lit8 v18, v14, 0x1f

    const/16 v19, 0x1

    shl-int v18, v19, v18

    or-int v17, v17, v18

    aput v17, v0, v15

    add-int/lit8 v14, v14, 0x1

    move/from16 v0, v16

    goto :goto_46

    :cond_68
    move/from16 v16, v0

    add-int/lit8 v12, v12, 0x1

    goto :goto_45

    :cond_69
    move/from16 v16, v0

    goto :goto_47

    :cond_6a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The region must fit inside the matrix"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Height and width must be at least 1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Left and top must be nonnegative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_47
    add-int/lit8 v7, v7, 0x1

    add-int/2addr v9, v3

    move/from16 v0, v16

    goto :goto_44

    :cond_6d
    move/from16 v16, v0

    add-int/lit8 v6, v6, 0x1

    add-int/2addr v8, v3

    goto :goto_43

    :cond_6e
    return-object v5

    :cond_6f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Both dimensions must be greater than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_70
    new-instance v0, Ly5/n;

    const-string v3, "Interleaving error: "

    const-string v4, " and "

    invoke-static {v3, v1, v4}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v2}, Lz7/a;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " differ."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_71
    new-instance v0, Ly5/n;

    const-string v1, "Data bytes does not match offset"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_72
    new-instance v0, Ly5/n;

    const-string v1, "Number of bits and data bytes does not match"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_73
    new-instance v0, Ly5/n;

    const-string v1, "Bits size does not equal capacity"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_74
    move-object/from16 v27, v4

    new-instance v0, Ly5/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "data bits cannot fit in the QR Code"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v4, Lz7/a;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " > "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_75
    new-instance v1, Ly5/n;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " is bigger than "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v13, 0x1

    sub-int/2addr v10, v13

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_76
    move/from16 v21, v3

    move/from16 v16, v7

    move v7, v13

    const/4 v13, 0x1

    const/4 v15, 0x7

    move-object v3, v1

    move v1, v5

    const/4 v5, 0x2

    add-int/lit8 v9, v9, 0x1

    move v5, v1

    move-object v1, v3

    move v13, v7

    move/from16 v7, v16

    move/from16 v3, v21

    goto/16 :goto_a

    :cond_77
    new-instance v0, Ly5/n;

    invoke-direct {v0, v11}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_78
    move/from16 v21, v3

    move/from16 v16, v7

    move v7, v13

    const/4 v13, 0x1

    const/4 v15, 0x7

    move-object v3, v1

    move v1, v5

    const/4 v5, 0x2

    add-int/lit8 v9, v9, 0x1

    move v5, v1

    move-object v1, v3

    move v13, v7

    move/from16 v7, v16

    move/from16 v3, v21

    goto/16 :goto_9

    :cond_79
    new-instance v0, Ly5/n;

    invoke-direct {v0, v11}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Found empty contents"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d()Lg8/i1;
    .locals 6

    new-instance v0, Lg8/i1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    iput-object v1, v0, Lg8/i1;->a:Ljava/util/Random;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    iput-wide v3, v0, Lg8/i1;->b:J

    const-wide v3, 0x3ff999999999999aL    # 1.6

    iput-wide v3, v0, Lg8/i1;->c:D

    const-wide v3, 0x3fc999999999999aL    # 0.2

    iput-wide v3, v0, Lg8/i1;->d:D

    iput-wide v1, v0, Lg8/i1;->e:J

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x1bb

    return v0
.end method

.method public final b()Ljava/util/concurrent/ExecutorService;
    .locals 7

    const-string v0, "grpc-default-executor-%d"

    const-string v1, "grpc-okhttp-%d"

    iget v2, p0, Lr7/e;->a:I

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    invoke-static {v1}, Lg8/s1;->e(Ljava/lang/String;)Lu6/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    goto :goto_0

    :pswitch_0
    invoke-static {v0}, Lg8/s1;->e(Ljava/lang/String;)Lu6/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "grpc-timer-%d"

    invoke-static {v0}, Lg8/s1;->e(Ljava/lang/String;)Lu6/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "setRemoveOnCancelPolicy"

    new-array v4, v1, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v3, v1, v6

    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_2
    throw v0

    :catch_2
    :goto_3
    invoke-static {v0}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0

    :pswitch_2
    packed-switch v2, :pswitch_data_2

    invoke-static {v1}, Lg8/s1;->e(Ljava/lang/String;)Lu6/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    goto :goto_4

    :pswitch_3
    invoke-static {v0}, Lg8/s1;->e(Ljava/lang/String;)Lu6/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    :goto_4
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x15
        :pswitch_3
    .end packed-switch
.end method

.method public final e()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lr7/e;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lr7/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lr7/p;-><init>(Z)V

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    return-object v0

    :pswitch_2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-object v0

    :pswitch_3
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    return-object v0

    :pswitch_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lr7/e;->a:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_0
    const-string v0, "grpc-default-executor"

    return-object v0

    :sswitch_1
    const-string v0, "service config is unused"

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method
