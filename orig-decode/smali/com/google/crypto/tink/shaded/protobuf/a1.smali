.class public final Lcom/google/crypto/tink/shaded/protobuf/a1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/j1;


# static fields
.field public static final o:[I

.field public static final p:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lcom/google/crypto/tink/shaded/protobuf/b;

.field public final f:Z

.field public final g:Z

.field public final h:[I

.field public final i:I

.field public final j:I

.field public final k:Lcom/google/crypto/tink/shaded/protobuf/c1;

.field public final l:Lcom/google/crypto/tink/shaded/protobuf/n0;

.field public final m:Lcom/google/crypto/tink/shaded/protobuf/p1;

.field public final n:Lcom/google/crypto/tink/shaded/protobuf/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/a1;->o:[I

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/w1;->m()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILcom/google/crypto/tink/shaded/protobuf/b;Z[IIILcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/n0;Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    iput-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->b:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->c:I

    iput p4, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->d:I

    instance-of p1, p5, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iput-boolean p1, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->f:Z

    iput-boolean p6, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->g:Z

    iput-object p7, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->h:[I

    iput p8, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->i:I

    iput p9, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->j:I

    iput-object p10, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->k:Lcom/google/crypto/tink/shaded/protobuf/c1;

    iput-object p11, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->l:Lcom/google/crypto/tink/shaded/protobuf/n0;

    iput-object p12, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->m:Lcom/google/crypto/tink/shaded/protobuf/p1;

    iput-object p5, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->e:Lcom/google/crypto/tink/shaded/protobuf/b;

    iput-object p14, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->n:Lcom/google/crypto/tink/shaded/protobuf/t0;

    return-void
.end method

.method public static C(Lcom/google/crypto/tink/shaded/protobuf/v0;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/n0;Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/t0;)Lcom/google/crypto/tink/shaded/protobuf/a1;
    .locals 7

    instance-of v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i1;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i1;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->D(Lcom/google/crypto/tink/shaded/protobuf/i1;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/n0;Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/t0;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static D(Lcom/google/crypto/tink/shaded/protobuf/i1;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/n0;Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/t0;)Lcom/google/crypto/tink/shaded/protobuf/a1;
    .locals 32

    invoke-virtual/range {p0 .. p0}, Lcom/google/crypto/tink/shaded/protobuf/i1;->d()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    move v10, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/crypto/tink/shaded/protobuf/i1;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const v6, 0xd800

    if-lt v5, v6, :cond_1

    const/4 v5, 0x1

    :goto_1
    add-int/lit8 v7, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_2

    move v5, v7

    goto :goto_1

    :cond_1
    const/4 v7, 0x1

    :cond_2
    add-int/lit8 v5, v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_4

    and-int/lit16 v7, v7, 0x1fff

    const/16 v9, 0xd

    :goto_2
    add-int/lit8 v11, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_3

    and-int/lit16 v5, v5, 0x1fff

    shl-int/2addr v5, v9

    or-int/2addr v7, v5

    add-int/lit8 v9, v9, 0xd

    move v5, v11

    goto :goto_2

    :cond_3
    shl-int/2addr v5, v9

    or-int/2addr v7, v5

    move v5, v11

    :cond_4
    if-nez v7, :cond_5

    sget-object v7, Lcom/google/crypto/tink/shaded/protobuf/a1;->o:[I

    move v9, v2

    move v11, v9

    move v13, v11

    move v14, v13

    move v15, v14

    move-object v12, v7

    move v7, v15

    goto/16 :goto_b

    :cond_5
    add-int/lit8 v7, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_7

    and-int/lit16 v5, v5, 0x1fff

    const/16 v9, 0xd

    :goto_3
    add-int/lit8 v11, v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_6

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v9

    or-int/2addr v5, v7

    add-int/lit8 v9, v9, 0xd

    move v7, v11

    goto :goto_3

    :cond_6
    shl-int/2addr v7, v9

    or-int/2addr v5, v7

    move v7, v11

    :cond_7
    add-int/lit8 v9, v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_9

    and-int/lit16 v7, v7, 0x1fff

    const/16 v11, 0xd

    :goto_4
    add-int/lit8 v12, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v6, :cond_8

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v11

    or-int/2addr v7, v9

    add-int/lit8 v11, v11, 0xd

    move v9, v12

    goto :goto_4

    :cond_8
    shl-int/2addr v9, v11

    or-int/2addr v7, v9

    move v9, v12

    :cond_9
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v6, :cond_b

    and-int/lit16 v9, v9, 0x1fff

    const/16 v12, 0xd

    :goto_5
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_a

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_5

    :cond_a
    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    move v11, v13

    :cond_b
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_d

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_6
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_c

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_6

    :cond_c
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_d
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_f

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_7
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_e

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_7

    :cond_e
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_f
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_11

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_8
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_10

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_8

    :cond_10
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_11
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_13

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_9
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_12

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_9

    :cond_12
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_13
    add-int/lit8 v16, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_15

    and-int/lit16 v15, v15, 0x1fff

    move/from16 v2, v16

    const/16 v16, 0xd

    :goto_a
    add-int/lit8 v18, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lt v2, v6, :cond_14

    and-int/lit16 v2, v2, 0x1fff

    shl-int v2, v2, v16

    or-int/2addr v15, v2

    add-int/lit8 v16, v16, 0xd

    move/from16 v2, v18

    goto :goto_a

    :cond_14
    shl-int v2, v2, v16

    or-int/2addr v15, v2

    move/from16 v16, v18

    :cond_15
    add-int v2, v15, v13

    add-int/2addr v2, v14

    new-array v2, v2, [I

    mul-int/lit8 v14, v5, 0x2

    add-int/2addr v14, v7

    move v7, v9

    move v9, v12

    move-object v12, v2

    move v2, v5

    move/from16 v5, v16

    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/google/crypto/tink/shaded/protobuf/i1;->b()[Ljava/lang/Object;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lcom/google/crypto/tink/shaded/protobuf/i1;->a()Lcom/google/crypto/tink/shaded/protobuf/b;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    mul-int/lit8 v3, v9, 0x3

    new-array v3, v3, [I

    mul-int/2addr v9, v1

    new-array v9, v9, [Ljava/lang/Object;

    add-int/2addr v13, v15

    move/from16 v22, v13

    move/from16 v21, v15

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_c
    if-ge v5, v4, :cond_33

    add-int/lit8 v23, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_17

    and-int/lit16 v5, v5, 0x1fff

    move/from16 v1, v23

    const/16 v23, 0xd

    :goto_d
    add-int/lit8 v25, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-lt v1, v6, :cond_16

    and-int/lit16 v1, v1, 0x1fff

    shl-int v1, v1, v23

    or-int/2addr v5, v1

    add-int/lit8 v23, v23, 0xd

    move/from16 v1, v25

    goto :goto_d

    :cond_16
    shl-int v1, v1, v23

    or-int/2addr v5, v1

    move/from16 v1, v25

    goto :goto_e

    :cond_17
    move/from16 v1, v23

    :goto_e
    add-int/lit8 v23, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-lt v1, v6, :cond_19

    and-int/lit16 v1, v1, 0x1fff

    move/from16 v6, v23

    const/16 v23, 0xd

    :goto_f
    add-int/lit8 v26, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    move/from16 v27, v4

    const v4, 0xd800

    if-lt v6, v4, :cond_18

    and-int/lit16 v4, v6, 0x1fff

    shl-int v4, v4, v23

    or-int/2addr v1, v4

    add-int/lit8 v23, v23, 0xd

    move/from16 v6, v26

    move/from16 v4, v27

    goto :goto_f

    :cond_18
    shl-int v4, v6, v23

    or-int/2addr v1, v4

    move/from16 v4, v26

    goto :goto_10

    :cond_19
    move/from16 v27, v4

    move/from16 v4, v23

    :goto_10
    and-int/lit16 v6, v1, 0xff

    move/from16 v23, v13

    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_1a

    add-int/lit8 v13, v19, 0x1

    aput v20, v12, v19

    move/from16 v19, v13

    :cond_1a
    sget-object v13, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    move/from16 v29, v15

    const/16 v15, 0x33

    if-lt v6, v15, :cond_22

    add-int/lit8 v15, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move/from16 v26, v15

    const v15, 0xd800

    if-lt v4, v15, :cond_1c

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v15, v26

    const/16 v26, 0xd

    :goto_11
    add-int/lit8 v30, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    move/from16 v31, v11

    const v11, 0xd800

    if-lt v15, v11, :cond_1b

    and-int/lit16 v11, v15, 0x1fff

    shl-int v11, v11, v26

    or-int/2addr v4, v11

    add-int/lit8 v26, v26, 0xd

    move/from16 v15, v30

    move/from16 v11, v31

    goto :goto_11

    :cond_1b
    shl-int v11, v15, v26

    or-int/2addr v4, v11

    move/from16 v15, v30

    goto :goto_12

    :cond_1c
    move/from16 v31, v11

    move/from16 v15, v26

    :goto_12
    add-int/lit8 v11, v6, -0x33

    move/from16 v26, v15

    const/16 v15, 0x9

    if-eq v11, v15, :cond_1f

    const/16 v15, 0x11

    if-ne v11, v15, :cond_1d

    goto :goto_13

    :cond_1d
    const/16 v15, 0xc

    if-ne v11, v15, :cond_1e

    if-nez v10, :cond_1e

    div-int/lit8 v11, v20, 0x3

    const/4 v15, 0x2

    mul-int/2addr v11, v15

    const/4 v15, 0x1

    add-int/2addr v11, v15

    add-int/lit8 v15, v14, 0x1

    aget-object v14, v16, v14

    aput-object v14, v9, v11

    move v14, v15

    :cond_1e
    const/4 v15, 0x2

    goto :goto_14

    :cond_1f
    :goto_13
    div-int/lit8 v11, v20, 0x3

    const/4 v15, 0x2

    mul-int/2addr v11, v15

    const/16 v18, 0x1

    add-int/lit8 v11, v11, 0x1

    add-int/lit8 v24, v14, 0x1

    aget-object v14, v16, v14

    aput-object v14, v9, v11

    move/from16 v14, v24

    :goto_14
    mul-int/2addr v4, v15

    aget-object v11, v16, v4

    instance-of v15, v11, Ljava/lang/reflect/Field;

    if-eqz v15, :cond_20

    check-cast v11, Ljava/lang/reflect/Field;

    :goto_15
    move/from16 v28, v14

    goto :goto_16

    :cond_20
    check-cast v11, Ljava/lang/String;

    invoke-static {v8, v11}, Lcom/google/crypto/tink/shaded/protobuf/a1;->Q(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v11

    aput-object v11, v16, v4

    goto :goto_15

    :goto_16
    invoke-virtual {v13, v11}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v14

    long-to-int v11, v14

    add-int/lit8 v4, v4, 0x1

    aget-object v14, v16, v4

    instance-of v15, v14, Ljava/lang/reflect/Field;

    if-eqz v15, :cond_21

    check-cast v14, Ljava/lang/reflect/Field;

    goto :goto_17

    :cond_21
    check-cast v14, Ljava/lang/String;

    invoke-static {v8, v14}, Lcom/google/crypto/tink/shaded/protobuf/a1;->Q(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14

    aput-object v14, v16, v4

    :goto_17
    invoke-virtual {v13, v14}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v4, v13

    move v13, v4

    move/from16 v14, v28

    const/4 v4, 0x0

    const/16 v18, 0x1

    move/from16 v28, v26

    move/from16 v26, v7

    goto/16 :goto_23

    :cond_22
    move/from16 v31, v11

    add-int/lit8 v11, v14, 0x1

    aget-object v15, v16, v14

    check-cast v15, Ljava/lang/String;

    invoke-static {v8, v15}, Lcom/google/crypto/tink/shaded/protobuf/a1;->Q(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v15

    move/from16 v26, v7

    const/16 v7, 0x9

    if-eq v6, v7, :cond_23

    const/16 v7, 0x11

    if-ne v6, v7, :cond_24

    :cond_23
    const/16 v18, 0x1

    const/16 v24, 0x2

    goto/16 :goto_1c

    :cond_24
    const/16 v7, 0x1b

    if-eq v6, v7, :cond_25

    const/16 v7, 0x31

    if-ne v6, v7, :cond_26

    :cond_25
    const/16 v18, 0x1

    const/16 v24, 0x2

    goto :goto_1b

    :cond_26
    const/16 v7, 0xc

    if-eq v6, v7, :cond_2a

    const/16 v7, 0x1e

    if-eq v6, v7, :cond_2a

    const/16 v7, 0x2c

    if-ne v6, v7, :cond_27

    goto :goto_19

    :cond_27
    const/16 v7, 0x32

    if-ne v6, v7, :cond_28

    add-int/lit8 v7, v21, 0x1

    aput v20, v12, v21

    div-int/lit8 v21, v20, 0x3

    const/16 v24, 0x2

    mul-int/lit8 v21, v21, 0x2

    add-int/lit8 v28, v14, 0x2

    aget-object v11, v16, v11

    aput-object v11, v9, v21

    and-int/lit16 v11, v1, 0x800

    if-eqz v11, :cond_29

    add-int/lit8 v21, v21, 0x1

    add-int/lit8 v11, v14, 0x3

    aget-object v14, v16, v28

    aput-object v14, v9, v21

    move/from16 v21, v7

    :cond_28
    :goto_18
    const/16 v18, 0x1

    goto :goto_1d

    :cond_29
    move/from16 v21, v7

    move/from16 v11, v28

    goto :goto_18

    :cond_2a
    :goto_19
    if-nez v10, :cond_2b

    div-int/lit8 v7, v20, 0x3

    const/16 v24, 0x2

    mul-int/lit8 v7, v7, 0x2

    const/16 v18, 0x1

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v14, v14, 0x2

    aget-object v11, v16, v11

    aput-object v11, v9, v7

    :goto_1a
    move v11, v14

    goto :goto_1d

    :cond_2b
    const/16 v18, 0x1

    const/16 v24, 0x2

    goto :goto_1d

    :goto_1b
    div-int/lit8 v7, v20, 0x3

    mul-int/lit8 v7, v7, 0x2

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v14, v14, 0x2

    aget-object v11, v16, v11

    aput-object v11, v9, v7

    goto :goto_1a

    :goto_1c
    div-int/lit8 v7, v20, 0x3

    mul-int/lit8 v7, v7, 0x2

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v14

    aput-object v14, v9, v7

    :goto_1d
    invoke-virtual {v13, v15}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v14

    long-to-int v7, v14

    and-int/lit16 v14, v1, 0x1000

    const/16 v15, 0x1000

    if-ne v14, v15, :cond_2f

    const/16 v14, 0x11

    if-gt v6, v14, :cond_2f

    add-int/lit8 v14, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v15, 0xd800

    if-lt v4, v15, :cond_2d

    and-int/lit16 v4, v4, 0x1fff

    const/16 v25, 0xd

    :goto_1e
    add-int/lit8 v28, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v15, :cond_2c

    and-int/lit16 v14, v14, 0x1fff

    shl-int v14, v14, v25

    or-int/2addr v4, v14

    add-int/lit8 v25, v25, 0xd

    move/from16 v14, v28

    goto :goto_1e

    :cond_2c
    shl-int v14, v14, v25

    or-int/2addr v4, v14

    :goto_1f
    const/4 v14, 0x2

    goto :goto_20

    :cond_2d
    move/from16 v28, v14

    goto :goto_1f

    :goto_20
    mul-int/lit8 v24, v2, 0x2

    div-int/lit8 v25, v4, 0x20

    add-int v25, v25, v24

    aget-object v14, v16, v25

    instance-of v15, v14, Ljava/lang/reflect/Field;

    if-eqz v15, :cond_2e

    check-cast v14, Ljava/lang/reflect/Field;

    goto :goto_21

    :cond_2e
    check-cast v14, Ljava/lang/String;

    invoke-static {v8, v14}, Lcom/google/crypto/tink/shaded/protobuf/a1;->Q(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14

    aput-object v14, v16, v25

    :goto_21
    invoke-virtual {v13, v14}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v13, v13

    rem-int/lit8 v4, v4, 0x20

    goto :goto_22

    :cond_2f
    const v13, 0xfffff

    move/from16 v28, v4

    const/4 v4, 0x0

    :goto_22
    const/16 v14, 0x12

    if-lt v6, v14, :cond_30

    const/16 v14, 0x31

    if-gt v6, v14, :cond_30

    add-int/lit8 v14, v22, 0x1

    aput v7, v12, v22

    move/from16 v22, v14

    :cond_30
    move v14, v11

    move v11, v7

    :goto_23
    add-int/lit8 v7, v20, 0x1

    aput v5, v3, v20

    add-int/lit8 v5, v20, 0x2

    and-int/lit16 v15, v1, 0x200

    if-eqz v15, :cond_31

    const/high16 v15, 0x20000000

    goto :goto_24

    :cond_31
    const/4 v15, 0x0

    :goto_24
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_32

    const/high16 v1, 0x10000000

    goto :goto_25

    :cond_32
    const/4 v1, 0x0

    :goto_25
    or-int/2addr v1, v15

    shl-int/lit8 v6, v6, 0x14

    or-int/2addr v1, v6

    or-int/2addr v1, v11

    aput v1, v3, v7

    add-int/lit8 v20, v20, 0x3

    shl-int/lit8 v1, v4, 0x14

    or-int/2addr v1, v13

    aput v1, v3, v5

    move/from16 v13, v23

    move/from16 v7, v26

    move/from16 v4, v27

    move/from16 v5, v28

    move/from16 v15, v29

    move/from16 v11, v31

    const/4 v1, 0x2

    const v6, 0xd800

    goto/16 :goto_c

    :cond_33
    move/from16 v26, v7

    move/from16 v31, v11

    move/from16 v23, v13

    move/from16 v29, v15

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/a1;

    invoke-virtual/range {p0 .. p0}, Lcom/google/crypto/tink/shaded/protobuf/i1;->a()Lcom/google/crypto/tink/shaded/protobuf/b;

    move-result-object v1

    move-object v4, v0

    move-object v5, v3

    move-object v6, v9

    move/from16 v8, v31

    move-object v9, v1

    move-object v11, v12

    move/from16 v12, v29

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    move-object/from16 v16, p3

    move-object/from16 v17, p4

    move-object/from16 v18, p5

    invoke-direct/range {v4 .. v18}, Lcom/google/crypto/tink/shaded/protobuf/a1;-><init>([I[Ljava/lang/Object;IILcom/google/crypto/tink/shaded/protobuf/b;Z[IIILcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/n0;Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/t0;)V

    return-object v0
.end method

.method public static E(I)J
    .locals 2

    const v0, 0xfffff

    and-int/2addr p0, v0

    int-to-long v0, p0

    return-wide v0
.end method

.method public static F(Ljava/lang/Object;J)I
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static G(Ljava/lang/Object;J)J
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static Q(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Field "

    const-string v3, " for "

    invoke-static {v2, p1, v3}, La7/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static W(I)I
    .locals 1

    const/high16 v0, 0xff00000

    and-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x14

    return p0
.end method

.method public static Z(ILjava/lang/Object;Lk6/w4;)V
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p0, p1}, Lk6/w4;->Q(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-virtual {p2, p0, p1}, Lk6/w4;->l(ILcom/google/crypto/tink/shaded/protobuf/l;)V

    :goto_0
    return-void
.end method

.method public static l(Ljava/lang/Object;)V
    .locals 3

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->t(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mutating immutable message: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static t(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->o()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static v(Ljava/lang/Object;J)Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final A(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    invoke-virtual {p1, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->t(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/j1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final B(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result p2

    const p3, 0xfffff

    and-int/2addr p2, p3

    int-to-long p2, p2

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    invoke-virtual {v1, p1, p2, p3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->t(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/j1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final H(Ljava/lang/Object;IJ)V
    .locals 3

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->o(I)Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    invoke-virtual {v0, p1, p3, p4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->n:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/t0;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t0;->e()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/t0;->d(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {v0, p1, p3, p4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_0
    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/t0;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final I(Ljava/lang/Object;[BIIIIIIIJILcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v9, p6

    move/from16 v2, p7

    move-wide/from16 v6, p10

    move/from16 v10, p12

    move-object/from16 v8, p13

    add-int/lit8 v3, v10, 0x2

    iget-object v11, v0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget v3, v11, v3

    const v11, 0xfffff

    and-int/2addr v3, v11

    int-to-long v11, v3

    const/4 v3, 0x2

    const/4 v13, 0x5

    const/4 v14, 0x1

    sget-object v15, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    packed-switch p9, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    const/4 v3, 0x3

    if-ne v2, v3, :cond_4

    invoke-virtual {v0, v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->B(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v11

    and-int/lit8 v2, p5, -0x8

    or-int/lit8 v7, v2, 0x4

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v3

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v8, p13

    invoke-static/range {v2 .. v8}, Lh6/g;->r0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIIILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    invoke-virtual {v0, v1, v9, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/a1;->V(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_1
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    iget-wide v3, v8, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-static {v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/o;->c(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v15, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4

    :pswitch_2
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    iget v3, v8, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/o;->b(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v15, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4

    :pswitch_3
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    iget v3, v8, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->n(I)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v15, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4

    :pswitch_4
    if-ne v2, v3, :cond_4

    invoke-static {v4, v5, v8}, Lh6/g;->h([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    iget-object v3, v8, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    invoke-virtual {v15, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4

    :pswitch_5
    if-ne v2, v3, :cond_4

    invoke-virtual {v0, v1, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->B(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v0, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v3

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p13

    invoke-static/range {v2 .. v7}, Lh6/g;->s0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    invoke-virtual {v0, v1, v9, v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/a1;->V(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_6
    if-ne v2, v3, :cond_4

    invoke-static {v4, v5, v8}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    iget v3, v8, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-nez v3, :cond_0

    const-string v3, ""

    invoke-virtual {v15, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :cond_0
    const/high16 v5, 0x20000000

    and-int v5, p8, v5

    if-eqz v5, :cond_2

    add-int v5, v2, v3

    invoke-static {v4, v2, v5}, Lcom/google/crypto/tink/shaded/protobuf/z1;->e([BII)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->b()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object v1

    throw v1

    :cond_2
    :goto_0
    new-instance v5, Ljava/lang/String;

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v5, v4, v2, v3, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v15, v1, v6, v7, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v2, v3

    :goto_1
    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4

    :pswitch_7
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    iget-wide v3, v8, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    const-wide/16 v16, 0x0

    cmp-long v3, v3, v16

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    const/4 v14, 0x0

    :goto_2
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v15, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4

    :pswitch_8
    if-ne v2, v13, :cond_4

    invoke-static {v5, v4}, Lh6/g;->l(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v15, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v5, 0x4

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4

    :pswitch_9
    if-ne v2, v14, :cond_4

    invoke-static {v5, v4}, Lh6/g;->n(I[B)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v15, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v5, 0x8

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4

    :pswitch_a
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    iget v3, v8, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v15, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4

    :pswitch_b
    if-nez v2, :cond_4

    invoke-static {v4, v5, v8}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    iget-wide v3, v8, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v15, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4

    :pswitch_c
    if-ne v2, v13, :cond_4

    invoke-static {v5, v4}, Lh6/g;->p(I[B)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v15, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v5, 0x4

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4

    :pswitch_d
    if-ne v2, v14, :cond_4

    invoke-static {v5, v4}, Lh6/g;->j(I[B)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v15, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v5, 0x8

    invoke-virtual {v15, v1, v11, v12, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4

    :cond_4
    :goto_3
    move v2, v5

    :goto_4
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final J(Ljava/lang/Object;[BIIILcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 31

    move-object/from16 v14, p0

    move-object/from16 v15, p1

    move-object/from16 v13, p2

    move/from16 v11, p4

    move/from16 v12, p5

    move-object/from16 v10, p6

    invoke-static/range {p1 .. p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->l(Ljava/lang/Object;)V

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    move/from16 v0, p3

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0xfffff

    :goto_0
    if-ge v0, v11, :cond_18

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v13, v0

    if-gez v0, :cond_0

    invoke-static {v0, v13, v3, v10}, Lh6/g;->K(I[BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v3, v10, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    goto :goto_1

    :cond_0
    move/from16 v29, v3

    move v3, v0

    move/from16 v0, v29

    :goto_1
    ushr-int/lit8 v6, v3, 0x3

    and-int/lit8 v9, v3, 0x7

    iget v7, v14, Lcom/google/crypto/tink/shaded/protobuf/a1;->d:I

    move/from16 v19, v0

    iget v0, v14, Lcom/google/crypto/tink/shaded/protobuf/a1;->c:I

    move/from16 v20, v3

    const/4 v3, 0x3

    if-le v6, v1, :cond_2

    div-int/2addr v2, v3

    if-lt v6, v0, :cond_1

    if-gt v6, v7, :cond_1

    invoke-virtual {v14, v6, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->T(II)I

    move-result v0

    goto :goto_2

    :cond_1
    const/4 v0, -0x1

    :goto_2
    move v2, v0

    const/4 v1, -0x1

    const/4 v7, 0x0

    goto :goto_4

    :cond_2
    if-lt v6, v0, :cond_3

    if-gt v6, v7, :cond_3

    const/4 v7, 0x0

    invoke-virtual {v14, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->T(II)I

    move-result v0

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    const/4 v0, -0x1

    :goto_3
    move v2, v0

    const/4 v1, -0x1

    :goto_4
    if-ne v2, v1, :cond_4

    move/from16 v24, v5

    move/from16 v17, v6

    move/from16 v21, v7

    move/from16 v28, v21

    move-object/from16 v27, v8

    move v6, v12

    move/from16 v2, v19

    move/from16 v7, v20

    move/from16 v20, v1

    move/from16 v19, v4

    goto/16 :goto_11

    :cond_4
    add-int/lit8 v0, v2, 0x1

    iget-object v1, v14, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget v0, v1, v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v3

    const v16, 0xfffff

    and-int v7, v0, v16

    int-to-long v11, v7

    const/16 v7, 0x11

    move/from16 v22, v0

    if-gt v3, v7, :cond_c

    add-int/lit8 v7, v2, 0x2

    aget v1, v1, v7

    ushr-int/lit8 v7, v1, 0x14

    const/4 v0, 0x1

    shl-int v7, v0, v7

    move-wide/from16 v24, v11

    const v11, 0xfffff

    and-int/2addr v1, v11

    if-eq v1, v5, :cond_6

    if-eq v5, v11, :cond_5

    int-to-long v11, v5

    invoke-virtual {v8, v15, v11, v12, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_5
    int-to-long v4, v1

    invoke-virtual {v8, v15, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    move v12, v1

    move v11, v4

    goto :goto_5

    :cond_6
    move v11, v4

    move v12, v5

    :goto_5
    const/4 v1, 0x5

    packed-switch v3, :pswitch_data_0

    move/from16 v17, v6

    move/from16 v6, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    goto/16 :goto_c

    :pswitch_0
    const/4 v0, 0x3

    if-ne v9, v0, :cond_7

    invoke-virtual {v14, v2, v15}, Lcom/google/crypto/tink/shaded/protobuf/a1;->A(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    shl-int/lit8 v0, v6, 0x3

    or-int/lit8 v5, v0, 0x4

    invoke-virtual {v14, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v1

    move/from16 v4, v19

    move-object v0, v9

    const/16 v17, -0x1

    move v3, v2

    move-object/from16 v2, p2

    move/from16 v19, v12

    move/from16 v18, v20

    move v12, v3

    move v3, v4

    move/from16 v4, p4

    move/from16 v20, v17

    move/from16 v17, v6

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lh6/g;->r0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIIILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    invoke-virtual {v14, v12, v15, v9}, Lcom/google/crypto/tink/shaded/protobuf/a1;->U(ILjava/lang/Object;Ljava/lang/Object;)V

    :goto_6
    or-int v4, v11, v7

    move/from16 v11, p4

    :goto_7
    move v2, v12

    move/from16 v1, v17

    move/from16 v3, v18

    move/from16 v5, v19

    :goto_8
    move/from16 v12, p5

    goto/16 :goto_0

    :cond_7
    move/from16 v17, v6

    move/from16 v4, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    :cond_8
    move v6, v4

    goto/16 :goto_c

    :pswitch_1
    move/from16 v17, v6

    move/from16 v4, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    if-nez v9, :cond_8

    invoke-static {v13, v4, v10}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v6

    iget-wide v0, v10, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->c(J)J

    move-result-wide v4

    move-object v0, v8

    move-object/from16 v1, p1

    move-wide/from16 v2, v24

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    :goto_9
    or-int v4, v11, v7

    move/from16 v11, p4

    move v0, v6

    goto :goto_7

    :pswitch_2
    move/from16 v17, v6

    move/from16 v4, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    if-nez v9, :cond_8

    invoke-static {v13, v4, v10}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, v10, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->b(I)I

    move-result v1

    move-wide/from16 v2, v24

    invoke-virtual {v8, v15, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_6

    :pswitch_3
    move/from16 v17, v6

    move/from16 v4, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    move-wide/from16 v2, v24

    if-nez v9, :cond_8

    invoke-static {v13, v4, v10}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, v10, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-virtual {v14, v12}, Lcom/google/crypto/tink/shaded/protobuf/a1;->n(I)V

    invoke-virtual {v8, v15, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_6

    :pswitch_4
    move/from16 v17, v6

    move/from16 v4, v19

    move/from16 v18, v20

    const/4 v0, 0x2

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    move-wide/from16 v2, v24

    if-ne v9, v0, :cond_8

    invoke-static {v13, v4, v10}, Lh6/g;->h([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget-object v1, v10, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    invoke-virtual {v8, v15, v2, v3, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_5
    move/from16 v17, v6

    move/from16 v4, v19

    move/from16 v18, v20

    const/4 v0, 0x2

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    if-ne v9, v0, :cond_8

    invoke-virtual {v14, v12, v15}, Lcom/google/crypto/tink/shaded/protobuf/a1;->A(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v14, v12}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v1

    move-object v0, v6

    move-object/from16 v2, p2

    move v3, v4

    move/from16 v4, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lh6/g;->s0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    invoke-virtual {v14, v12, v15, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->U(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_6
    move/from16 v17, v6

    move/from16 v4, v19

    move/from16 v18, v20

    const/4 v0, 0x2

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    move-wide/from16 v2, v24

    if-ne v9, v0, :cond_8

    const/high16 v0, 0x20000000

    and-int v0, v22, v0

    if-nez v0, :cond_9

    invoke-static {v13, v4, v10}, Lh6/g;->F([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    goto :goto_a

    :cond_9
    invoke-static {v13, v4, v10}, Lh6/g;->I([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    :goto_a
    iget-object v1, v10, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    invoke-virtual {v8, v15, v2, v3, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_7
    move/from16 v17, v6

    move/from16 v4, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    move-wide/from16 v2, v24

    if-nez v9, :cond_8

    invoke-static {v13, v4, v10}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    iget-wide v4, v10, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    const-wide/16 v22, 0x0

    cmp-long v4, v4, v22

    if-eqz v4, :cond_a

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    invoke-static {v15, v2, v3, v0}, Lcom/google/crypto/tink/shaded/protobuf/w1;->n(Ljava/lang/Object;JZ)V

    or-int v4, v11, v7

    move/from16 v11, p4

    move v0, v1

    goto/16 :goto_7

    :pswitch_8
    move/from16 v17, v6

    move/from16 v4, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    move-wide/from16 v2, v24

    if-ne v9, v1, :cond_8

    invoke-static {v4, v13}, Lh6/g;->l(I[B)I

    move-result v0

    invoke-virtual {v8, v15, v2, v3, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v0, v4, 0x4

    goto/16 :goto_6

    :pswitch_9
    move/from16 v17, v6

    move/from16 v4, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    move-wide/from16 v2, v24

    if-ne v9, v0, :cond_8

    invoke-static {v4, v13}, Lh6/g;->n(I[B)J

    move-result-wide v5

    move-object v0, v8

    move-object/from16 v1, p1

    move v9, v4

    move-wide v4, v5

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v0, v9, 0x8

    goto/16 :goto_6

    :pswitch_a
    move/from16 v17, v6

    move/from16 v6, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    move-wide/from16 v2, v24

    if-nez v9, :cond_b

    invoke-static {v13, v6, v10}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, v10, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-virtual {v8, v15, v2, v3, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_6

    :pswitch_b
    move/from16 v17, v6

    move/from16 v6, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    move-wide/from16 v2, v24

    if-nez v9, :cond_b

    invoke-static {v13, v6, v10}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v6

    iget-wide v4, v10, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    move-object v0, v8

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto/16 :goto_9

    :pswitch_c
    move/from16 v17, v6

    move/from16 v6, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    move-wide/from16 v2, v24

    if-ne v9, v1, :cond_b

    invoke-static {v6, v13}, Lh6/g;->p(I[B)F

    move-result v0

    invoke-static {v15, v2, v3, v0}, Lcom/google/crypto/tink/shaded/protobuf/w1;->s(Ljava/lang/Object;JF)V

    add-int/lit8 v0, v6, 0x4

    goto/16 :goto_6

    :pswitch_d
    move/from16 v17, v6

    move/from16 v6, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move/from16 v19, v12

    move v12, v2

    move-wide/from16 v2, v24

    if-ne v9, v0, :cond_b

    invoke-static {v6, v13}, Lh6/g;->j(I[B)D

    move-result-wide v0

    invoke-static {v15, v2, v3, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->r(Ljava/lang/Object;JD)V

    add-int/lit8 v0, v6, 0x8

    goto/16 :goto_6

    :cond_b
    :goto_c
    move v2, v6

    move-object/from16 v27, v8

    move/from16 v28, v12

    move/from16 v7, v18

    move/from16 v24, v19

    const/16 v21, 0x0

    move/from16 v6, p5

    move/from16 v19, v11

    goto/16 :goto_11

    :cond_c
    move/from16 v17, v6

    move/from16 v6, v19

    move/from16 v18, v20

    const/16 v20, -0x1

    move-wide/from16 v29, v11

    move v12, v2

    move-wide/from16 v1, v29

    const/16 v0, 0x1b

    if-ne v3, v0, :cond_10

    const/4 v0, 0x2

    if-ne v9, v0, :cond_f

    invoke-virtual {v8, v15, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/c;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/c;->g()Z

    move-result v3

    if-nez v3, :cond_e

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_d

    const/16 v3, 0xa

    goto :goto_d

    :cond_d
    mul-int/lit8 v3, v3, 0x2

    :goto_d
    invoke-interface {v0, v3}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    invoke-virtual {v8, v15, v1, v2, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_e
    move-object v7, v0

    invoke-virtual {v14, v12}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v0

    move/from16 v1, v18

    move-object/from16 v2, p2

    move v3, v6

    move/from16 v19, v4

    move/from16 v4, p4

    move/from16 v24, v5

    move-object v5, v7

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lh6/g;->t(Lcom/google/crypto/tink/shaded/protobuf/j1;I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    move/from16 v11, p4

    move v2, v12

    move/from16 v1, v17

    move/from16 v3, v18

    move/from16 v4, v19

    move/from16 v5, v24

    goto/16 :goto_8

    :cond_f
    move/from16 v19, v4

    move/from16 v24, v5

    move v14, v6

    move-object/from16 v27, v8

    move/from16 v28, v12

    const/16 v21, 0x0

    goto/16 :goto_10

    :cond_10
    move/from16 v19, v4

    move/from16 v24, v5

    const/16 v0, 0x31

    if-gt v3, v0, :cond_12

    move/from16 v0, v22

    int-to-long v4, v0

    move-object/from16 v0, p0

    move-wide/from16 v25, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v11, v3

    move v3, v6

    move-wide/from16 v22, v4

    move/from16 v4, p4

    move/from16 v5, v18

    move v7, v6

    move v6, v9

    move v9, v7

    const/16 v21, 0x0

    move v7, v12

    move-object/from16 v27, v8

    move v14, v9

    move-wide/from16 v8, v22

    move v10, v11

    move/from16 v28, v12

    move-wide/from16 v11, v25

    move-object/from16 v13, p6

    invoke-virtual/range {v0 .. v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->L(Ljava/lang/Object;[BIIIIIJIJLcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    if-eq v0, v14, :cond_11

    move-object/from16 v14, p0

    move-object/from16 v13, p2

    move/from16 v11, p4

    move/from16 v12, p5

    move-object/from16 v10, p6

    move/from16 v1, v17

    move/from16 v3, v18

    :goto_e
    move/from16 v4, v19

    move/from16 v5, v24

    move-object/from16 v8, v27

    move/from16 v2, v28

    goto/16 :goto_0

    :cond_11
    move/from16 v6, p5

    move v2, v0

    :goto_f
    move/from16 v7, v18

    goto/16 :goto_11

    :cond_12
    move-wide/from16 v25, v1

    move v11, v3

    move v14, v6

    move-object/from16 v27, v8

    move/from16 v28, v12

    move/from16 v0, v22

    const/16 v21, 0x0

    const/16 v1, 0x32

    if-ne v11, v1, :cond_14

    const/4 v1, 0x2

    if-eq v9, v1, :cond_13

    :goto_10
    move/from16 v6, p5

    move v2, v14

    goto :goto_f

    :cond_13
    move-object/from16 v14, p0

    move-wide/from16 v7, v25

    move/from16 v13, v28

    invoke-virtual {v14, v15, v13, v7, v8}, Lcom/google/crypto/tink/shaded/protobuf/a1;->H(Ljava/lang/Object;IJ)V

    const/4 v12, 0x0

    throw v12

    :cond_14
    const/4 v12, 0x0

    move/from16 v16, v0

    move v10, v14

    move-wide/from16 v7, v25

    move/from16 v13, v28

    move-object/from16 v14, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v10

    move/from16 v4, p4

    move/from16 v5, v18

    move/from16 v6, v17

    move-wide/from16 v22, v7

    move v7, v9

    move/from16 v8, v16

    move v9, v11

    move v14, v10

    move-wide/from16 v10, v22

    move v12, v13

    move/from16 v16, v13

    move-object/from16 v13, p6

    invoke-virtual/range {v0 .. v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->I(Ljava/lang/Object;[BIIIIIIIJILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    if-eq v0, v14, :cond_15

    move-object/from16 v14, p0

    move-object/from16 v13, p2

    move/from16 v11, p4

    move/from16 v12, p5

    move-object/from16 v10, p6

    move/from16 v2, v16

    move/from16 v1, v17

    move/from16 v3, v18

    move/from16 v4, v19

    move/from16 v5, v24

    move-object/from16 v8, v27

    goto/16 :goto_0

    :cond_15
    move/from16 v6, p5

    move v2, v0

    move/from16 v28, v16

    goto :goto_f

    :goto_11
    if-ne v7, v6, :cond_16

    if-eqz v6, :cond_16

    move v0, v2

    move v3, v7

    move/from16 v4, v19

    move/from16 v5, v24

    :goto_12
    const v1, 0xfffff

    goto :goto_13

    :cond_16
    move-object v0, v15

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/o1;->f:Lcom/google/crypto/tink/shaded/protobuf/o1;

    if-ne v1, v3, :cond_17

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o1;->c()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v1

    iput-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    :cond_17
    move-object v4, v1

    move v0, v7

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lh6/g;->J(I[BIILcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    move-object/from16 v14, p0

    move-object/from16 v13, p2

    move/from16 v11, p4

    move-object/from16 v10, p6

    move v12, v6

    move v3, v7

    move/from16 v1, v17

    goto/16 :goto_e

    :cond_18
    move/from16 v19, v4

    move/from16 v24, v5

    move-object/from16 v27, v8

    move v6, v12

    goto :goto_12

    :goto_13
    if-eq v5, v1, :cond_19

    int-to-long v1, v5

    move-object/from16 v5, v27

    invoke-virtual {v5, v15, v1, v2, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_19
    move-object/from16 v1, p0

    iget v2, v1, Lcom/google/crypto/tink/shaded/protobuf/a1;->i:I

    :goto_14
    iget v4, v1, Lcom/google/crypto/tink/shaded/protobuf/a1;->j:I

    if-ge v2, v4, :cond_1a

    iget-object v4, v1, Lcom/google/crypto/tink/shaded/protobuf/a1;->h:[I

    aget v4, v4, v2

    const/4 v5, 0x0

    invoke-virtual {v1, v15, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->m(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    :cond_1a
    if-nez v6, :cond_1c

    move/from16 v2, p4

    if-ne v0, v2, :cond_1b

    goto :goto_15

    :cond_1b
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->f()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object v0

    throw v0

    :cond_1c
    move/from16 v2, p4

    if-gt v0, v2, :cond_1d

    if-ne v3, v6, :cond_1d

    :goto_15
    return v0

    :cond_1d
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->f()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final K(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e;)V
    .locals 30

    move-object/from16 v14, p0

    move-object/from16 v15, p1

    move-object/from16 v13, p2

    move/from16 v11, p4

    move-object/from16 v12, p5

    invoke-static/range {p1 .. p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->l(Ljava/lang/Object;)V

    sget-object v10, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    const/4 v9, 0x0

    move/from16 v0, p3

    move v2, v9

    move v5, v2

    const/4 v1, -0x1

    const v6, 0xfffff

    :goto_0
    if-ge v0, v11, :cond_17

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v13, v0

    if-gez v0, :cond_0

    invoke-static {v0, v13, v3, v12}, Lh6/g;->K(I[BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v3, v12, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    move v4, v0

    move/from16 v16, v3

    goto :goto_1

    :cond_0
    move/from16 v16, v0

    move v4, v3

    :goto_1
    ushr-int/lit8 v3, v16, 0x3

    and-int/lit8 v0, v16, 0x7

    iget v8, v14, Lcom/google/crypto/tink/shaded/protobuf/a1;->d:I

    iget v7, v14, Lcom/google/crypto/tink/shaded/protobuf/a1;->c:I

    if-le v3, v1, :cond_2

    div-int/lit8 v2, v2, 0x3

    if-lt v3, v7, :cond_1

    if-gt v3, v8, :cond_1

    invoke-virtual {v14, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->T(II)I

    move-result v1

    goto :goto_2

    :cond_1
    const/4 v1, -0x1

    :goto_2
    move v8, v1

    const/4 v7, -0x1

    goto :goto_3

    :cond_2
    if-lt v3, v7, :cond_1

    if-gt v3, v8, :cond_1

    invoke-virtual {v14, v3, v9}, Lcom/google/crypto/tink/shaded/protobuf/a1;->T(II)I

    move-result v1

    goto :goto_2

    :goto_3
    if-ne v8, v7, :cond_3

    move/from16 v19, v3

    move v2, v4

    move/from16 v26, v5

    move/from16 v17, v7

    move/from16 v18, v9

    move/from16 v27, v18

    move-object/from16 v28, v10

    goto/16 :goto_12

    :cond_3
    add-int/lit8 v1, v8, 0x1

    iget-object v2, v14, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget v1, v2, v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v11

    const v17, 0xfffff

    and-int v7, v1, v17

    move/from16 v19, v3

    move/from16 p3, v4

    int-to-long v3, v7

    const/16 v7, 0x11

    if-gt v11, v7, :cond_c

    add-int/lit8 v7, v8, 0x2

    aget v2, v2, v7

    ushr-int/lit8 v7, v2, 0x14

    const/4 v9, 0x1

    shl-int v7, v9, v7

    const v9, 0xfffff

    and-int/2addr v2, v9

    move/from16 v17, v7

    if-eq v2, v6, :cond_6

    if-eq v6, v9, :cond_4

    int-to-long v6, v6

    invoke-virtual {v10, v15, v6, v7, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_4
    if-eq v2, v9, :cond_5

    int-to-long v5, v2

    invoke-virtual {v10, v15, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    :cond_5
    move v7, v2

    :goto_4
    move v6, v5

    goto :goto_5

    :cond_6
    move v7, v6

    goto :goto_4

    :goto_5
    const/4 v2, 0x5

    packed-switch v11, :pswitch_data_0

    :cond_7
    move/from16 v11, p3

    goto/16 :goto_c

    :pswitch_0
    if-nez v0, :cond_7

    move/from16 v5, p3

    invoke-static {v13, v5, v12}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v11

    iget-wide v0, v12, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->c(J)J

    move-result-wide v21

    move-object v0, v10

    move-object/from16 v1, p1

    move-wide v2, v3

    move-wide/from16 v4, v21

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    :goto_6
    or-int v5, v6, v17

    move v6, v7

    move v2, v8

    move v0, v11

    :goto_7
    move/from16 v1, v19

    const/4 v9, 0x0

    move/from16 v11, p4

    goto/16 :goto_0

    :pswitch_1
    move/from16 v5, p3

    if-nez v0, :cond_8

    invoke-static {v13, v5, v12}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, v12, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->b(I)I

    move-result v1

    invoke-virtual {v10, v15, v3, v4, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_8
    or-int v5, v6, v17

    move/from16 v11, p4

    move v6, v7

    move v2, v8

    move/from16 v1, v19

    const/4 v9, 0x0

    goto/16 :goto_0

    :cond_8
    move v11, v5

    goto/16 :goto_c

    :pswitch_2
    move/from16 v5, p3

    if-nez v0, :cond_8

    invoke-static {v13, v5, v12}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, v12, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-virtual {v10, v15, v3, v4, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_8

    :pswitch_3
    move/from16 v5, p3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_8

    invoke-static {v13, v5, v12}, Lh6/g;->h([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget-object v1, v12, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    invoke-virtual {v10, v15, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_8

    :pswitch_4
    move/from16 v5, p3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_8

    invoke-virtual {v14, v8, v15}, Lcom/google/crypto/tink/shaded/protobuf/a1;->A(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v14, v8}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v1

    move-object v0, v11

    move-object/from16 v2, p2

    move v3, v5

    move/from16 v4, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Lh6/g;->s0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    invoke-virtual {v14, v8, v15, v11}, Lcom/google/crypto/tink/shaded/protobuf/a1;->U(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :pswitch_5
    move/from16 v5, p3

    const/4 v2, 0x2

    if-ne v0, v2, :cond_8

    const/high16 v0, 0x20000000

    and-int/2addr v0, v1

    if-nez v0, :cond_9

    invoke-static {v13, v5, v12}, Lh6/g;->F([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    goto :goto_9

    :cond_9
    invoke-static {v13, v5, v12}, Lh6/g;->I([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    :goto_9
    iget-object v1, v12, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    invoke-virtual {v10, v15, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_8

    :pswitch_6
    move/from16 v5, p3

    if-nez v0, :cond_8

    invoke-static {v13, v5, v12}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget-wide v1, v12, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    const-wide/16 v23, 0x0

    cmp-long v1, v1, v23

    if-eqz v1, :cond_a

    const/4 v1, 0x1

    goto :goto_a

    :cond_a
    const/4 v1, 0x0

    :goto_a
    invoke-static {v15, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->n(Ljava/lang/Object;JZ)V

    goto :goto_8

    :pswitch_7
    move/from16 v5, p3

    if-ne v0, v2, :cond_8

    invoke-static {v5, v13}, Lh6/g;->l(I[B)I

    move-result v0

    invoke-virtual {v10, v15, v3, v4, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v0, v5, 0x4

    goto/16 :goto_8

    :pswitch_8
    move/from16 v5, p3

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    invoke-static {v5, v13}, Lh6/g;->n(I[B)J

    move-result-wide v21

    move-object v0, v10

    move-object/from16 v1, p1

    move-wide v2, v3

    move v11, v5

    move-wide/from16 v4, v21

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    :goto_b
    add-int/lit8 v0, v11, 0x8

    goto/16 :goto_8

    :pswitch_9
    move/from16 v11, p3

    if-nez v0, :cond_b

    invoke-static {v13, v11, v12}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, v12, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-virtual {v10, v15, v3, v4, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_8

    :pswitch_a
    move/from16 v11, p3

    if-nez v0, :cond_b

    invoke-static {v13, v11, v12}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v11

    iget-wide v1, v12, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    move-object v0, v10

    move-wide/from16 v21, v1

    move-object/from16 v1, p1

    move-wide v2, v3

    move-wide/from16 v4, v21

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto/16 :goto_6

    :pswitch_b
    move/from16 v11, p3

    if-ne v0, v2, :cond_b

    invoke-static {v11, v13}, Lh6/g;->p(I[B)F

    move-result v0

    invoke-static {v15, v3, v4, v0}, Lcom/google/crypto/tink/shaded/protobuf/w1;->s(Ljava/lang/Object;JF)V

    add-int/lit8 v0, v11, 0x4

    goto/16 :goto_8

    :pswitch_c
    move/from16 v11, p3

    const/4 v1, 0x1

    if-ne v0, v1, :cond_b

    invoke-static {v11, v13}, Lh6/g;->j(I[B)D

    move-result-wide v0

    invoke-static {v15, v3, v4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->r(Ljava/lang/Object;JD)V

    goto :goto_b

    :cond_b
    :goto_c
    move/from16 v26, v6

    move v6, v7

    move/from16 v27, v8

    move-object/from16 v28, v10

    move v2, v11

    const/16 v17, -0x1

    const/16 v18, 0x0

    goto/16 :goto_12

    :cond_c
    move/from16 v7, p3

    const v9, 0xfffff

    const/16 v2, 0x1b

    if-ne v11, v2, :cond_10

    const/4 v2, 0x2

    if-ne v0, v2, :cond_f

    invoke-virtual {v10, v15, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/c;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/c;->g()Z

    move-result v1

    if-nez v1, :cond_e

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_d

    const/16 v1, 0xa

    goto :goto_d

    :cond_d
    mul-int/lit8 v1, v1, 0x2

    :goto_d
    invoke-interface {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    invoke-virtual {v10, v15, v3, v4, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_e
    move-object v11, v0

    invoke-virtual {v14, v8}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v0

    move/from16 v1, v16

    move-object/from16 v2, p2

    move v3, v7

    move/from16 v4, p4

    move v7, v5

    move-object v5, v11

    move v11, v6

    move-object/from16 v6, p5

    invoke-static/range {v0 .. v6}, Lh6/g;->t(Lcom/google/crypto/tink/shaded/protobuf/j1;I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    move v5, v7

    move v2, v8

    move v6, v11

    goto/16 :goto_7

    :cond_f
    move v11, v6

    move/from16 v26, v5

    move v14, v7

    move/from16 v27, v8

    move-object/from16 v28, v10

    move/from16 v25, v11

    const/16 v17, -0x1

    const/16 v18, 0x0

    goto/16 :goto_11

    :cond_10
    move/from16 v29, v6

    move v6, v5

    move/from16 v5, v29

    const/16 v2, 0x31

    if-gt v11, v2, :cond_12

    int-to-long v1, v1

    move/from16 p3, v0

    move-object/from16 v0, p0

    move-wide/from16 v21, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v23, v3

    move v3, v7

    move/from16 v4, p4

    move/from16 v25, v5

    move/from16 v5, v16

    move/from16 v26, v6

    move/from16 v6, p3

    move v14, v7

    const/16 v17, -0x1

    move v7, v8

    move/from16 v27, v8

    const/16 v18, 0x0

    move-wide/from16 v8, v21

    move-object/from16 v28, v10

    move v10, v11

    move-wide/from16 v11, v23

    move-object/from16 v13, p5

    invoke-virtual/range {v0 .. v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->L(Ljava/lang/Object;[BIIIIIJIJLcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    if-eq v0, v14, :cond_11

    move-object/from16 v14, p0

    move-object/from16 v13, p2

    move/from16 v11, p4

    move-object/from16 v12, p5

    move/from16 v9, v18

    move/from16 v1, v19

    move/from16 v6, v25

    :goto_e
    move/from16 v5, v26

    move/from16 v2, v27

    :goto_f
    move-object/from16 v10, v28

    goto/16 :goto_0

    :cond_11
    move v2, v0

    :goto_10
    move/from16 v6, v25

    goto/16 :goto_12

    :cond_12
    move/from16 p3, v0

    move-wide/from16 v23, v3

    move/from16 v25, v5

    move/from16 v26, v6

    move v14, v7

    move/from16 v27, v8

    move-object/from16 v28, v10

    const/16 v17, -0x1

    const/16 v18, 0x0

    const/16 v0, 0x32

    if-ne v11, v0, :cond_14

    move/from16 v7, p3

    const/4 v0, 0x2

    if-eq v7, v0, :cond_13

    :goto_11
    move v2, v14

    goto :goto_10

    :cond_13
    move-object/from16 v14, p0

    move-wide/from16 v9, v23

    move/from16 v13, v27

    invoke-virtual {v14, v15, v13, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->H(Ljava/lang/Object;IJ)V

    const/4 v0, 0x0

    throw v0

    :cond_14
    move/from16 v7, p3

    move v12, v14

    move-wide/from16 v9, v23

    move/from16 v13, v27

    move-object/from16 v14, p0

    move-object/from16 v0, p0

    move v8, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v12

    move/from16 v4, p4

    move/from16 v5, v16

    move/from16 v6, v19

    move-wide/from16 v20, v9

    move v9, v11

    move-wide/from16 v10, v20

    move v14, v12

    move v12, v13

    move/from16 v20, v13

    move-object/from16 v13, p5

    invoke-virtual/range {v0 .. v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->I(Ljava/lang/Object;[BIIIIIIIJILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    if-eq v0, v14, :cond_15

    move-object/from16 v14, p0

    move-object/from16 v13, p2

    move/from16 v11, p4

    move-object/from16 v12, p5

    move/from16 v9, v18

    move/from16 v1, v19

    move/from16 v2, v20

    move/from16 v6, v25

    move/from16 v5, v26

    goto :goto_f

    :cond_15
    move v2, v0

    move/from16 v27, v20

    goto :goto_10

    :goto_12
    move-object v0, v15

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/o1;->f:Lcom/google/crypto/tink/shaded/protobuf/o1;

    if-ne v1, v3, :cond_16

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o1;->c()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v1

    iput-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    :cond_16
    move-object v4, v1

    move/from16 v0, v16

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Lh6/g;->J(I[BIILcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    move-object/from16 v14, p0

    move-object/from16 v13, p2

    move/from16 v11, p4

    move-object/from16 v12, p5

    move/from16 v9, v18

    move/from16 v1, v19

    goto/16 :goto_e

    :cond_17
    move/from16 v26, v5

    move v7, v6

    move-object/from16 v28, v10

    const v1, 0xfffff

    if-eq v7, v1, :cond_18

    int-to-long v1, v7

    move/from16 v5, v26

    move-object/from16 v3, v28

    invoke-virtual {v3, v15, v1, v2, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_18
    move/from16 v1, p4

    if-ne v0, v1, :cond_19

    return-void

    :cond_19
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->f()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final L(Ljava/lang/Object;[BIIIIIJIJLcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 13

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move/from16 v3, p3

    move/from16 v4, p6

    move/from16 v7, p7

    move-wide/from16 v5, p11

    move-object/from16 v8, p13

    sget-object v9, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    invoke-virtual {v9, p1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/crypto/tink/shaded/protobuf/e0;

    check-cast v10, Lcom/google/crypto/tink/shaded/protobuf/c;

    invoke-virtual {v10}, Lcom/google/crypto/tink/shaded/protobuf/c;->g()Z

    move-result v11

    const/4 v12, 0x2

    if-nez v11, :cond_1

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_0

    const/16 v11, 0xa

    goto :goto_0

    :cond_0
    mul-int/2addr v11, v12

    :goto_0
    invoke-interface {v10, v11}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(I)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v10

    invoke-virtual {v9, p1, v5, v6, v10}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    const/4 v5, 0x5

    packed-switch p10, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    const/4 v1, 0x3

    if-ne v4, v1, :cond_d

    invoke-virtual {p0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v1

    move-object/from16 p6, v1

    move/from16 p7, p5

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p11, v10

    move-object/from16 p12, p13

    invoke-static/range {p6 .. p12}, Lh6/g;->r(Lcom/google/crypto/tink/shaded/protobuf/j1;I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_1
    if-ne v4, v12, :cond_2

    invoke-static {p2, v3, v10, v8}, Lh6/g;->A([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :cond_2
    if-nez v4, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->E(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_2
    if-ne v4, v12, :cond_3

    invoke-static {p2, v3, v10, v8}, Lh6/g;->z([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :cond_3
    if-nez v4, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->D(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_3
    if-ne v4, v12, :cond_4

    invoke-static {p2, v3, v10, v8}, Lh6/g;->B([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto :goto_1

    :cond_4
    if-nez v4, :cond_d

    move/from16 v1, p5

    move-object v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object v5, v10

    move-object/from16 v6, p13

    invoke-static/range {v1 .. v6}, Lh6/g;->M(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    :goto_1
    invoke-virtual {p0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->n(I)V

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/k1;->a:Ljava/lang/Class;

    goto/16 :goto_3

    :pswitch_4
    if-ne v4, v12, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->i(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_5
    if-ne v4, v12, :cond_d

    invoke-virtual {p0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v1

    move-object/from16 p6, v1

    move/from16 p7, p5

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p11, v10

    move-object/from16 p12, p13

    invoke-static/range {p6 .. p12}, Lh6/g;->t(Lcom/google/crypto/tink/shaded/protobuf/j1;I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_6
    if-ne v4, v12, :cond_d

    const-wide/32 v4, 0x20000000

    and-long v4, p8, v4

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-nez v1, :cond_5

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->G(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :cond_5
    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->H(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_7
    if-ne v4, v12, :cond_6

    invoke-static {p2, v3, v10, v8}, Lh6/g;->u([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :cond_6
    if-nez v4, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->g(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_8
    if-ne v4, v12, :cond_7

    invoke-static {p2, v3, v10, v8}, Lh6/g;->w([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :cond_7
    if-ne v4, v5, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->m(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_9
    if-ne v4, v12, :cond_8

    invoke-static {p2, v3, v10, v8}, Lh6/g;->x([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :cond_8
    if-ne v4, v1, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->o(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :pswitch_a
    if-ne v4, v12, :cond_9

    invoke-static {p2, v3, v10, v8}, Lh6/g;->B([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto/16 :goto_3

    :cond_9
    if-nez v4, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->M(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto :goto_3

    :pswitch_b
    if-ne v4, v12, :cond_a

    invoke-static {p2, v3, v10, v8}, Lh6/g;->C([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto :goto_3

    :cond_a
    if-nez v4, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->O(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto :goto_3

    :pswitch_c
    if-ne v4, v12, :cond_b

    invoke-static {p2, v3, v10, v8}, Lh6/g;->y([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto :goto_3

    :cond_b
    if-ne v4, v5, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->q(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto :goto_3

    :pswitch_d
    if-ne v4, v12, :cond_c

    invoke-static {p2, v3, v10, v8}, Lh6/g;->v([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto :goto_3

    :cond_c
    if-ne v4, v1, :cond_d

    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v10

    move-object/from16 p10, p13

    invoke-static/range {p5 .. p10}, Lh6/g;->k(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    goto :goto_3

    :cond_d
    :goto_2
    move v1, v3

    :goto_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final M(Ljava/lang/Object;JLg2/m;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->l:Lcom/google/crypto/tink/shaded/protobuf/n0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    iget p2, p4, Lg2/m;->b:I

    and-int/lit8 p3, p2, 0x7

    const/4 v0, 0x3

    if-ne p3, v0, :cond_3

    :cond_0
    invoke-interface {p5}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p4, p3, p5, p6}, Lg2/m;->f(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    invoke-interface {p5, p3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->b(Ljava/lang/Object;)V

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p3, p4, Lg2/m;->e:Ljava/lang/Object;

    check-cast p3, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p3}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p3

    if-nez p3, :cond_2

    iget p3, p4, Lg2/m;->d:I

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    iget-object p3, p4, Lg2/m;->e:Ljava/lang/Object;

    check-cast p3, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p3}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p3

    if-eq p3, p2, :cond_0

    iput p3, p4, Lg2/m;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1
.end method

.method public final N(Ljava/lang/Object;ILg2/m;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V
    .locals 2

    const v0, 0xfffff

    and-int/2addr p2, v0

    int-to-long v0, p2

    iget-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->l:Lcom/google/crypto/tink/shaded/protobuf/n0;

    invoke-virtual {p2, p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    iget p2, p3, Lg2/m;->b:I

    and-int/lit8 v0, p2, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    :cond_0
    invoke-interface {p4}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3, v0, p4, p5}, Lg2/m;->h(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    invoke-interface {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->b(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p3, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p3, Lg2/m;->d:I

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p3, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    if-eq v0, p2, :cond_0

    iput v0, p3, Lg2/m;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1
.end method

.method public final O(Ljava/lang/Object;ILg2/m;)V
    .locals 2

    const/high16 v0, 0x20000000

    and-int/2addr v0, p2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const v1, 0xfffff

    if-eqz v0, :cond_1

    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-virtual {p3}, Lg2/m;->O()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->f:Z

    if-eqz v0, :cond_2

    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-virtual {p3}, Lg2/m;->M()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :cond_2
    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-virtual {p3}, Lg2/m;->l()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final P(Ljava/lang/Object;ILg2/m;)V
    .locals 5

    const/high16 v0, 0x20000000

    and-int/2addr v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const v3, 0xfffff

    iget-object v4, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->l:Lcom/google/crypto/tink/shaded/protobuf/n0;

    if-eqz v0, :cond_1

    and-int/2addr p2, v3

    int-to-long v0, p2

    invoke-virtual {v4, p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    iget p2, p3, Lg2/m;->a:I

    packed-switch p2, :pswitch_data_0

    invoke-virtual {p3, p1, v2}, Lg2/m;->N(Ljava/util/List;Z)V

    goto :goto_1

    :pswitch_0
    invoke-virtual {p3, p1, v2}, Lg2/m;->N(Ljava/util/List;Z)V

    goto :goto_1

    :cond_1
    and-int/2addr p2, v3

    int-to-long v2, p2

    invoke-virtual {v4, p1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    iget p2, p3, Lg2/m;->a:I

    packed-switch p2, :pswitch_data_1

    invoke-virtual {p3, p1, v1}, Lg2/m;->N(Ljava/util/List;Z)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {p3, p1, v1}, Lg2/m;->N(Ljava/util/List;Z)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
    .end packed-switch
.end method

.method public final R(ILjava/lang/Object;)V
    .locals 4

    add-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget p1, v0, p1

    const v0, 0xfffff

    and-int/2addr v0, p1

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    ushr-int/lit8 p1, p1, 0x14

    const/4 v2, 0x1

    shl-int p1, v2, p1

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v2, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v2

    or-int/2addr p1, v2

    invoke-static {v0, v1, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    return-void
.end method

.method public final S(Ljava/lang/Object;II)V
    .locals 2

    add-int/lit8 p3, p3, 0x2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget p3, v0, p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {v0, v1, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    return-void
.end method

.method public final T(II)I
    .locals 5

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    array-length v1, v0

    div-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-gt p2, v1, :cond_2

    add-int v2, v1, p2

    ushr-int/lit8 v2, v2, 0x1

    mul-int/lit8 v3, v2, 0x3

    aget v4, v0, v3

    if-ne p1, v4, :cond_0

    return v3

    :cond_0
    if-ge p1, v4, :cond_1

    add-int/lit8 v2, v2, -0x1

    move v1, v2

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move p2, v2

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final U(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    invoke-virtual {v2, p2, v0, v1, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    return-void
.end method

.method public final V(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    invoke-virtual {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v0, v1, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    return-void
.end method

.method public final X(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget p1, v0, p1

    return p1
.end method

.method public final Y(Ljava/lang/Object;Lk6/w4;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    array-length v4, v3

    const v5, 0xfffff

    move v8, v5

    const/4 v7, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v7, v4, :cond_5

    invoke-virtual {v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v10

    aget v11, v3, v7

    invoke-static {v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v12

    const/16 v13, 0x11

    const/4 v14, 0x1

    sget-object v15, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    if-gt v12, v13, :cond_1

    add-int/lit8 v13, v7, 0x2

    aget v13, v3, v13

    and-int v6, v13, v5

    if-eq v6, v8, :cond_0

    int-to-long v8, v6

    invoke-virtual {v15, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v9

    move v8, v6

    :cond_0
    ushr-int/lit8 v6, v13, 0x14

    shl-int v6, v14, v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    and-int/2addr v10, v5

    move/from16 v16, v6

    int-to-long v5, v10

    packed-switch v12, :pswitch_data_0

    :cond_2
    :goto_2
    const/4 v12, 0x0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-virtual {v2, v11, v6, v5}, Lk6/w4;->y(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_1
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->O(IJ)V

    goto :goto_2

    :pswitch_2
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->M(II)V

    goto :goto_2

    :pswitch_3
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->K(IJ)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->I(II)V

    goto :goto_2

    :pswitch_5
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->q(II)V

    goto :goto_2

    :pswitch_6
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->S(II)V

    goto :goto_2

    :pswitch_7
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-virtual {v2, v11, v5}, Lk6/w4;->l(ILcom/google/crypto/tink/shaded/protobuf/l;)V

    goto :goto_2

    :pswitch_8
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-virtual {v2, v11, v6, v5}, Lk6/w4;->G(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v11, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->Z(ILjava/lang/Object;Lk6/w4;)V

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    sget-object v10, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v10, v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->j(IZ)V

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->s(II)V

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->u(IJ)V

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->B(II)V

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->U(IJ)V

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->D(IJ)V

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    sget-object v10, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v10, v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->w(IF)V

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {v0, v1, v11, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    sget-object v10, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v10, v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->o(ID)V

    goto/16 :goto_2

    :pswitch_12
    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_3

    goto/16 :goto_2

    :cond_3
    invoke-virtual {v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->o(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/a1;->n:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v1, 0x0

    throw v1

    :pswitch_13
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-static {v10, v5, v2, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->K(ILjava/util/List;Lk6/w4;Lcom/google/crypto/tink/shaded/protobuf/j1;)V

    goto/16 :goto_2

    :pswitch_14
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->R(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_15
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->Q(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_16
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->P(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_17
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->O(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_18
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->G(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_19
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->T(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_1a
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->D(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_1b
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->H(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_1c
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->I(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_1d
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->L(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_1e
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->U(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_1f
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->M(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_20
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->J(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_21
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v14}, Lcom/google/crypto/tink/shaded/protobuf/k1;->F(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_2

    :pswitch_22
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v11, 0x0

    invoke-static {v10, v5, v2, v11}, Lcom/google/crypto/tink/shaded/protobuf/k1;->R(ILjava/util/List;Lk6/w4;Z)V

    :goto_3
    move v12, v11

    goto/16 :goto_4

    :pswitch_23
    const/4 v11, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/google/crypto/tink/shaded/protobuf/k1;->Q(ILjava/util/List;Lk6/w4;Z)V

    goto :goto_3

    :pswitch_24
    const/4 v11, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/google/crypto/tink/shaded/protobuf/k1;->P(ILjava/util/List;Lk6/w4;Z)V

    goto :goto_3

    :pswitch_25
    const/4 v11, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/google/crypto/tink/shaded/protobuf/k1;->O(ILjava/util/List;Lk6/w4;Z)V

    goto :goto_3

    :pswitch_26
    const/4 v11, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/google/crypto/tink/shaded/protobuf/k1;->G(ILjava/util/List;Lk6/w4;Z)V

    goto :goto_3

    :pswitch_27
    const/4 v11, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/google/crypto/tink/shaded/protobuf/k1;->T(ILjava/util/List;Lk6/w4;Z)V

    goto :goto_3

    :pswitch_28
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->E(ILjava/util/List;Lk6/w4;)V

    goto/16 :goto_2

    :pswitch_29
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-static {v10, v5, v2, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->N(ILjava/util/List;Lk6/w4;Lcom/google/crypto/tink/shaded/protobuf/j1;)V

    goto/16 :goto_2

    :pswitch_2a
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->S(ILjava/util/List;Lk6/w4;)V

    goto/16 :goto_2

    :pswitch_2b
    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v10, v5, v2, v12}, Lcom/google/crypto/tink/shaded/protobuf/k1;->D(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_4

    :pswitch_2c
    const/4 v12, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lcom/google/crypto/tink/shaded/protobuf/k1;->H(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_4

    :pswitch_2d
    const/4 v12, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lcom/google/crypto/tink/shaded/protobuf/k1;->I(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_4

    :pswitch_2e
    const/4 v12, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lcom/google/crypto/tink/shaded/protobuf/k1;->L(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_4

    :pswitch_2f
    const/4 v12, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lcom/google/crypto/tink/shaded/protobuf/k1;->U(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_4

    :pswitch_30
    const/4 v12, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lcom/google/crypto/tink/shaded/protobuf/k1;->M(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_4

    :pswitch_31
    const/4 v12, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lcom/google/crypto/tink/shaded/protobuf/k1;->J(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_4

    :pswitch_32
    const/4 v12, 0x0

    aget v10, v3, v7

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v12}, Lcom/google/crypto/tink/shaded/protobuf/k1;->F(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_4

    :pswitch_33
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-virtual {v2, v11, v6, v5}, Lk6/w4;->y(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_34
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->O(IJ)V

    goto/16 :goto_4

    :pswitch_35
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->M(II)V

    goto/16 :goto_4

    :pswitch_36
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->K(IJ)V

    goto/16 :goto_4

    :pswitch_37
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->I(II)V

    goto/16 :goto_4

    :pswitch_38
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->q(II)V

    goto/16 :goto_4

    :pswitch_39
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->S(II)V

    goto/16 :goto_4

    :pswitch_3a
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-virtual {v2, v11, v5}, Lk6/w4;->l(ILcom/google/crypto/tink/shaded/protobuf/l;)V

    goto/16 :goto_4

    :pswitch_3b
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-virtual {v2, v11, v6, v5}, Lk6/w4;->G(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3c
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v11, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->Z(ILjava/lang/Object;Lk6/w4;)V

    goto/16 :goto_4

    :pswitch_3d
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    sget-object v10, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v10, v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/v1;->c(Ljava/lang/Object;J)Z

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->j(IZ)V

    goto :goto_4

    :pswitch_3e
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->s(II)V

    goto :goto_4

    :pswitch_3f
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->u(IJ)V

    goto :goto_4

    :pswitch_40
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->B(II)V

    goto :goto_4

    :pswitch_41
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->U(IJ)V

    goto :goto_4

    :pswitch_42
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    invoke-virtual {v15, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->D(IJ)V

    goto :goto_4

    :pswitch_43
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    sget-object v10, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v10, v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/v1;->f(Ljava/lang/Object;J)F

    move-result v5

    invoke-virtual {v2, v11, v5}, Lk6/w4;->w(IF)V

    goto :goto_4

    :pswitch_44
    const/4 v12, 0x0

    and-int v10, v9, v16

    if-eqz v10, :cond_4

    sget-object v10, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v10, v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/v1;->e(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-virtual {v2, v11, v5, v6}, Lk6/w4;->o(ID)V

    :cond_4
    :goto_4
    add-int/lit8 v7, v7, 0x3

    const v5, 0xfffff

    goto/16 :goto_0

    :cond_5
    iget-object v3, v0, Lcom/google/crypto/tink/shaded/protobuf/a1;->m:Lcom/google/crypto/tink/shaded/protobuf/p1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object v1, v1, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o1;->e(Lk6/w4;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->l(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    array-length v2, v1

    if-ge v0, v2, :cond_1

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    int-to-long v3, v3

    aget v1, v1, v0

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->z(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0, p2, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v2, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v3, v4, v2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->z(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0, p2, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v2, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v3, v4, v2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_1

    :pswitch_4
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/k1;->a:Ljava/lang/Class;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    iget-object v5, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->n:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/t0;->d(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_5
    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->l:Lcom/google/crypto/tink/shaded/protobuf/n0;

    invoke-virtual {v1, p1, v3, v4, p2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->b(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->y(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->u(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {v3, v4, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->u(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {v3, v4, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {v3, v4, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {v3, v4, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->y(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->c(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->n(Ljava/lang/Object;JZ)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {v3, v4, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_12
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->u(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto :goto_1

    :pswitch_13
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {v3, v4, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto :goto_1

    :pswitch_14
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->u(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto :goto_1

    :pswitch_15
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->u(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto :goto_1

    :pswitch_16
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->f(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->s(Ljava/lang/Object;JF)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto :goto_1

    :pswitch_17
    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v1, p2, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/v1;->e(Ljava/lang/Object;J)D

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->r(Ljava/lang/Object;JD)V

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->m:Lcom/google/crypto/tink/shaded/protobuf/p1;

    invoke-static {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->B(Lcom/google/crypto/tink/shaded/protobuf/p1;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 7

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->t(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/b0;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->h()V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->g()V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->p()V

    :cond_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    int-to-long v3, v3

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v2

    const/16 v5, 0x9

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-virtual {v6, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v5, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->n:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/t0;->f(Ljava/lang/Object;)V

    invoke-virtual {v6, p1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->l:Lcom/google/crypto/tink/shaded/protobuf/n0;

    invoke-virtual {v2, p1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/n0;->a(Ljava/lang/Object;J)V

    goto :goto_1

    :cond_2
    :pswitch_2
    invoke-virtual {p0, v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v2

    invoke-virtual {v6, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->m:Lcom/google/crypto/tink/shaded/protobuf/p1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/p1;->b(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 13

    const v0, 0xfffff

    const/4 v1, 0x0

    move v3, v0

    move v2, v1

    move v4, v2

    :goto_0
    iget v5, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->i:I

    const/4 v6, 0x1

    if-ge v2, v5, :cond_e

    iget-object v5, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->h:[I

    aget v5, v5, v2

    iget-object v7, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget v8, v7, v5

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v9

    add-int/lit8 v10, v5, 0x2

    aget v7, v7, v10

    and-int v10, v7, v0

    ushr-int/lit8 v7, v7, 0x14

    shl-int/2addr v6, v7

    if-eq v10, v3, :cond_1

    if-eq v10, v0, :cond_0

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    int-to-long v11, v10

    invoke-virtual {v3, p1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    :cond_0
    move v3, v10

    :cond_1
    const/high16 v7, 0x10000000

    and-int/2addr v7, v9

    if-eqz v7, :cond_4

    if-ne v3, v0, :cond_2

    invoke-virtual {p0, v5, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_1

    :cond_2
    and-int v7, v4, v6

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    return v1

    :cond_4
    :goto_2
    invoke-static {v9}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v7

    const/16 v10, 0x9

    if-eq v7, v10, :cond_b

    const/16 v10, 0x11

    if-eq v7, v10, :cond_b

    const/16 v6, 0x1b

    if-eq v7, v6, :cond_8

    const/16 v6, 0x3c

    if-eq v7, v6, :cond_7

    const/16 v6, 0x44

    if-eq v7, v6, :cond_7

    const/16 v6, 0x31

    if-eq v7, v6, :cond_8

    const/16 v6, 0x32

    if-eq v7, v6, :cond_5

    goto/16 :goto_5

    :cond_5
    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v8, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    iget-object v7, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->n:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v6, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    goto/16 :goto_5

    :cond_6
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->o(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_7
    invoke-virtual {p0, p1, v8, v5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v5

    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v8, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/j1;->c(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    return v1

    :cond_8
    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v8, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v5

    move v7, v1

    :goto_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_d

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v5, v8}, Lcom/google/crypto/tink/shaded/protobuf/j1;->c(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    return v1

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_b
    if-ne v3, v0, :cond_c

    invoke-virtual {p0, v5, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_4

    :cond_c
    and-int/2addr v6, v4

    if-eqz v6, :cond_d

    :goto_4
    invoke-virtual {p0, v5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v5

    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v8, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/j1;->c(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    return v1

    :cond_d
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_e
    return v6
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 10

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v4

    const v5, 0xfffff

    and-int v6, v4, v5

    int-to-long v6, v6

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    add-int/lit8 v4, v3, 0x2

    aget v4, v0, v4

    and-int/2addr v4, v5

    int-to-long v4, v4

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v8, p1, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v9

    invoke-virtual {v8, p2, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    if-ne v9, v4, :cond_1

    invoke-virtual {v8, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v8, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/k1;->C(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :pswitch_1
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/k1;->C(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto :goto_1

    :pswitch_2
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/k1;->C(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    :goto_1
    if-nez v4, :cond_0

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/k1;->C(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v4, v8, v4

    if-nez v4, :cond_1

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    if-ne v5, v4, :cond_1

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v4, v8, v4

    if-nez v4, :cond_1

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    if-ne v5, v4, :cond_1

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    if-ne v5, v4, :cond_1

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    if-ne v5, v4, :cond_1

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/k1;->C(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/k1;->C(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/k1;->C(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->c(Ljava/lang/Object;J)Z

    move-result v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->c(Ljava/lang/Object;J)Z

    move-result v4

    if-ne v5, v4, :cond_1

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    if-ne v5, v4, :cond_1

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v4, v8, v4

    if-nez v4, :cond_1

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    if-ne v5, v4, :cond_1

    goto :goto_2

    :pswitch_11
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v4, v8, v4

    if-nez v4, :cond_1

    goto :goto_2

    :pswitch_12
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v8

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v4, v8, v4

    if-nez v4, :cond_1

    goto :goto_2

    :pswitch_13
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->f(Ljava/lang/Object;J)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v5

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->f(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    if-ne v5, v4, :cond_1

    goto :goto_2

    :pswitch_14
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->k(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->e(Ljava/lang/Object;J)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v8

    invoke-virtual {v4, p2, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->e(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v4, v8, v4

    if-nez v4, :cond_1

    :cond_0
    :goto_2
    add-int/lit8 v3, v3, 0x3

    goto/16 :goto_0

    :cond_1
    :goto_3
    return v2

    :cond_2
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->m:Lcom/google/crypto/tink/shaded/protobuf/p1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object p2, p2, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o1;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->r(Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->q(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->k:Lcom/google/crypto/tink/shaded/protobuf/c1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->e:Lcom/google/crypto/tink/shaded/protobuf/b;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->r()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v0

    return-object v0
.end method

.method public final g(Ljava/lang/Object;)I
    .locals 11

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v4

    aget v5, v0, v2

    const v6, 0xfffff

    and-int/2addr v6, v4

    int-to-long v6, v6

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v4

    const/16 v8, 0x4d5

    const/16 v9, 0x4cf

    const/16 v10, 0x25

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    mul-int/lit8 v3, v3, 0x35

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    :goto_1
    add-int/2addr v4, v3

    move v3, v4

    goto/16 :goto_4

    :pswitch_1
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto :goto_1

    :pswitch_4
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    goto :goto_1

    :pswitch_5
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    goto :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_1

    :pswitch_8
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    mul-int/lit8 v3, v3, 0x35

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_1

    :pswitch_9
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    if-eqz v4, :cond_0

    :goto_2
    move v8, v9

    :cond_0
    add-int/2addr v8, v3

    move v3, v8

    goto/16 :goto_4

    :pswitch_b
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, p1, v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_12
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_13
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_14
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v10

    :cond_1
    :goto_3
    mul-int/lit8 v3, v3, 0x35

    add-int/2addr v3, v10

    goto/16 :goto_4

    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_17
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_1c
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_3

    :pswitch_1d
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_1e
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->c(Ljava/lang/Object;J)Z

    move-result v4

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :pswitch_1f
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_20
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_21
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_22
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_23
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_24
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->f(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto/16 :goto_1

    :pswitch_25
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->e(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :cond_2
    :goto_4
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_3
    mul-int/lit8 v3, v3, 0x35

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->m:Lcom/google/crypto/tink/shaded/protobuf/p1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->hashCode()I

    move-result p1

    add-int/2addr p1, v3

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e;)V
    .locals 8

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->K(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e;)V

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->J(Ljava/lang/Object;[BIIILcom/google/crypto/tink/shaded/protobuf/e;)I

    :goto_0
    return-void
.end method

.method public final i(Ljava/lang/Object;Lk6/w4;)V
    .locals 10

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->g:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v4

    aget v5, v0, v3

    invoke-static {v4}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v6

    const/4 v7, 0x1

    const v8, 0xfffff

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-virtual {p2, v5, v6, v4}, Lk6/w4;->y(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->O(IJ)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->M(II)V

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->K(IJ)V

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->I(II)V

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->q(II)V

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->S(II)V

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-virtual {p2, v5, v4}, Lk6/w4;->l(ILcom/google/crypto/tink/shaded/protobuf/l;)V

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-virtual {p2, v5, v6, v4}, Lk6/w4;->G(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->Z(ILjava/lang/Object;Lk6/w4;)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->j(IZ)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->s(II)V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->u(IJ)V

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->B(II)V

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->U(IJ)V

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->D(IJ)V

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->w(IF)V

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, p1, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->o(ID)V

    goto/16 :goto_1

    :pswitch_12
    and-int/2addr v4, v8

    int-to-long v4, v4

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v6, p1, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->o(I)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->n:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_13
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-static {v5, v4, p2, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->K(ILjava/util/List;Lk6/w4;Lcom/google/crypto/tink/shaded/protobuf/j1;)V

    goto/16 :goto_1

    :pswitch_14
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->R(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_15
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->Q(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_16
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->P(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_17
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->O(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_18
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->G(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_19
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->T(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_1a
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->D(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_1b
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->H(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_1c
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->I(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_1d
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->L(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_1e
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->U(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_1f
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->M(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_20
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->J(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_21
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v8, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v8, v9}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->F(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_22
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->R(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_23
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->Q(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_24
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->P(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_25
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->O(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_26
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->G(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_27
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->T(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_28
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->E(ILjava/util/List;Lk6/w4;)V

    goto/16 :goto_1

    :pswitch_29
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-static {v5, v4, p2, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->N(ILjava/util/List;Lk6/w4;Lcom/google/crypto/tink/shaded/protobuf/j1;)V

    goto/16 :goto_1

    :pswitch_2a
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->S(ILjava/util/List;Lk6/w4;)V

    goto/16 :goto_1

    :pswitch_2b
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->D(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_2c
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->H(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_2d
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->I(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_2e
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->L(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_2f
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->U(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_30
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->M(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_31
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->J(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_32
    aget v5, v0, v3

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->F(ILjava/util/List;Lk6/w4;Z)V

    goto/16 :goto_1

    :pswitch_33
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-virtual {p2, v5, v6, v4}, Lk6/w4;->y(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_34
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->O(IJ)V

    goto/16 :goto_1

    :pswitch_35
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->M(II)V

    goto/16 :goto_1

    :pswitch_36
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->K(IJ)V

    goto/16 :goto_1

    :pswitch_37
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->I(II)V

    goto/16 :goto_1

    :pswitch_38
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->q(II)V

    goto/16 :goto_1

    :pswitch_39
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->S(II)V

    goto/16 :goto_1

    :pswitch_3a
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-virtual {p2, v5, v4}, Lk6/w4;->l(ILcom/google/crypto/tink/shaded/protobuf/l;)V

    goto/16 :goto_1

    :pswitch_3b
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6

    invoke-virtual {p2, v5, v6, v4}, Lk6/w4;->G(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_3c
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->Z(ILjava/lang/Object;Lk6/w4;)V

    goto/16 :goto_1

    :pswitch_3d
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->c(Ljava/lang/Object;J)Z

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->j(IZ)V

    goto/16 :goto_1

    :pswitch_3e
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->s(II)V

    goto :goto_1

    :pswitch_3f
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->u(IJ)V

    goto :goto_1

    :pswitch_40
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->B(II)V

    goto :goto_1

    :pswitch_41
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->U(IJ)V

    goto :goto_1

    :pswitch_42
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->D(IJ)V

    goto :goto_1

    :pswitch_43
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->f(Ljava/lang/Object;J)F

    move-result v4

    invoke-virtual {p2, v5, v4}, Lk6/w4;->w(IF)V

    goto :goto_1

    :pswitch_44
    invoke-virtual {p0, v3, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    and-int/2addr v4, v8

    int-to-long v6, v4

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v4, p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/v1;->e(Ljava/lang/Object;J)D

    move-result-wide v6

    invoke-virtual {p2, v5, v6, v7}, Lk6/w4;->o(ID)V

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x3

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->m:Lcom/google/crypto/tink/shaded/protobuf/p1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o1;->e(Lk6/w4;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->Y(Ljava/lang/Object;Lk6/w4;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Lg2/m;Lcom/google/crypto/tink/shaded/protobuf/t;)V
    .locals 1

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->l(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->m:Lcom/google/crypto/tink/shaded/protobuf/p1;

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->w(Lcom/google/crypto/tink/shaded/protobuf/p1;Ljava/lang/Object;Lg2/m;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method public final k(ILjava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result p2

    invoke-virtual {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final m(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget p3, p3, p2

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    sget-object p3, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->n(I)V

    return-void
.end method

.method public final n(I)V
    .locals 1

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    return-void
.end method

.method public final o(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;
    .locals 3

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->b:[Ljava/lang/Object;

    aget-object v1, v0, p1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/j1;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/g1;->c:Lcom/google/crypto/tink/shaded/protobuf/g1;

    add-int/lit8 v2, p1, 0x1

    aget-object v2, v0, v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/g1;->a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v1

    aput-object v1, v0, p1

    return-object v1
.end method

.method public final q(Ljava/lang/Object;)I
    .locals 14

    const/4 v0, 0x0

    const v1, 0xfffff

    move v2, v0

    move v3, v2

    move v5, v3

    move v4, v1

    :goto_0
    iget-object v6, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    array-length v7, v6

    if-ge v2, v7, :cond_5

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v7

    aget v8, v6, v2

    invoke-static {v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v9

    const/16 v10, 0x11

    sget-object v11, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    if-gt v9, v10, :cond_0

    add-int/lit8 v10, v2, 0x2

    aget v6, v6, v10

    and-int v10, v6, v1

    ushr-int/lit8 v6, v6, 0x14

    const/4 v12, 0x1

    shl-int v6, v12, v6

    if-eq v10, v4, :cond_1

    int-to-long v4, v10

    invoke-virtual {v11, p1, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    move v4, v10

    goto :goto_1

    :cond_0
    move v6, v0

    :cond_1
    :goto_1
    and-int/2addr v7, v1

    int-to-long v12, v7

    packed-switch v9, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/crypto/tink/shaded/protobuf/b;

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/p;->y0(ILcom/google/crypto/tink/shaded/protobuf/b;Lcom/google/crypto/tink/shaded/protobuf/j1;)I

    move-result v6

    :goto_2
    add-int/2addr v3, v6

    goto/16 :goto_4

    :pswitch_1
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {p1, v12, v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/p;->F0(IJ)I

    move-result v6

    goto :goto_2

    :pswitch_2
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {p1, v12, v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->E0(II)I

    move-result v6

    goto :goto_2

    :pswitch_3
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->D0(I)I

    move-result v6

    goto :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->C0(I)I

    move-result v6

    goto :goto_2

    :pswitch_5
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {p1, v12, v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->u0(II)I

    move-result v6

    goto :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {p1, v12, v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->J0(II)I

    move-result v6

    goto :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->s0(ILcom/google/crypto/tink/shaded/protobuf/l;)I

    move-result v6

    goto :goto_2

    :pswitch_8
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v7

    invoke-static {v8, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->o(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)I

    move-result v6

    goto :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/google/crypto/tink/shaded/protobuf/l;

    if-eqz v7, :cond_2

    check-cast v6, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->s0(ILcom/google/crypto/tink/shaded/protobuf/l;)I

    move-result v6

    :goto_3
    add-int/2addr v6, v3

    move v3, v6

    goto/16 :goto_4

    :cond_2
    check-cast v6, Ljava/lang/String;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->G0(ILjava/lang/String;)I

    move-result v6

    goto :goto_3

    :pswitch_a
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->r0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->v0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->w0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {p1, v12, v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->z0(II)I

    move-result v6

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {p1, v12, v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/p;->L0(IJ)I

    move-result v6

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {p1, v12, v13}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/p;->B0(IJ)I

    move-result v6

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->x0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {p0, p1, v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->t0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_12
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->o(I)Ljava/lang/Object;

    move-result-object v7

    iget-object v8, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->n:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/t0;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_13
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->j(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/j1;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_14
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->t(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_15
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->r(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_16
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->i(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_17
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->g(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_18
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->e(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_19
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->w(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_1a
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->b(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_1b
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->g(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_1c
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->i(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_1d
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->l(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_1e
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->y(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_1f
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->n(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_20
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->g(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_21
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->i(Ljava/util/List;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v7

    invoke-static {v6, v7, v6, v3}, La7/a;->v(IIII)I

    move-result v3

    goto/16 :goto_4

    :pswitch_22
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->s(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_23
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->q(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_24
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->h(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_25
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->f(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_26
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->d(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_27
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->v(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_28
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->c(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_29
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/k1;->p(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/j1;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_2a
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->u(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_2b
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->a(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_2c
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->f(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_2d
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->h(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_2e
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->k(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_2f
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->x(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_30
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->m(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_31
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->f(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_32
    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->h(ILjava/util/List;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_33
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/crypto/tink/shaded/protobuf/b;

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/p;->y0(ILcom/google/crypto/tink/shaded/protobuf/b;Lcom/google/crypto/tink/shaded/protobuf/j1;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_34
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/p;->F0(IJ)I

    move-result v6

    goto/16 :goto_2

    :pswitch_35
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->E0(II)I

    move-result v6

    goto/16 :goto_2

    :pswitch_36
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->D0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_37
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->C0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_38
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->u0(II)I

    move-result v6

    goto/16 :goto_2

    :pswitch_39
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->J0(II)I

    move-result v6

    goto/16 :goto_2

    :pswitch_3a
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->s0(ILcom/google/crypto/tink/shaded/protobuf/l;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_3b
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v7

    invoke-static {v8, v7, v6}, Lcom/google/crypto/tink/shaded/protobuf/k1;->o(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)I

    move-result v6

    goto/16 :goto_2

    :pswitch_3c
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/google/crypto/tink/shaded/protobuf/l;

    if-eqz v7, :cond_3

    check-cast v6, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->s0(ILcom/google/crypto/tink/shaded/protobuf/l;)I

    move-result v6

    goto/16 :goto_3

    :cond_3
    check-cast v6, Ljava/lang/String;

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->G0(ILjava/lang/String;)I

    move-result v6

    goto/16 :goto_3

    :pswitch_3d
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->r0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_3e
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->v0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_3f
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->w0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_40
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {v8, v6}, Lcom/google/crypto/tink/shaded/protobuf/p;->z0(II)I

    move-result v6

    goto/16 :goto_2

    :pswitch_41
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/p;->L0(IJ)I

    move-result v6

    goto/16 :goto_2

    :pswitch_42
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-virtual {v11, p1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v8, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/p;->B0(IJ)I

    move-result v6

    goto/16 :goto_2

    :pswitch_43
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->x0(I)I

    move-result v6

    goto/16 :goto_2

    :pswitch_44
    and-int/2addr v6, v5

    if-eqz v6, :cond_4

    invoke-static {v8}, Lcom/google/crypto/tink/shaded/protobuf/p;->t0(I)I

    move-result v6

    goto/16 :goto_2

    :cond_4
    :goto_4
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->m:Lcom/google/crypto/tink/shaded/protobuf/p1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->b()I

    move-result p1

    add-int/2addr p1, v3

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)I
    .locals 8

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    array-length v3, v2

    if-ge v0, v3, :cond_4

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v3

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v4

    aget v5, v2, v0

    const v6, 0xfffff

    and-int/2addr v3, v6

    int-to-long v6, v3

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/w;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/w;->a()I

    move-result v3

    if-lt v4, v3, :cond_0

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/w;->c:Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/w;->a()I

    move-result v3

    if-gt v4, v3, :cond_0

    add-int/lit8 v3, v0, 0x2

    aget v2, v2, v3

    :cond_0
    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->l(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/b;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v3

    invoke-static {v5, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/p;->y0(ILcom/google/crypto/tink/shaded/protobuf/b;Lcom/google/crypto/tink/shaded/protobuf/j1;)I

    move-result v2

    :goto_1
    add-int/2addr v2, v1

    move v1, v2

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {v5, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/p;->F0(IJ)I

    move-result v2

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->E0(II)I

    move-result v2

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->D0(I)I

    move-result v2

    goto :goto_1

    :pswitch_4
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->C0(I)I

    move-result v2

    goto :goto_1

    :pswitch_5
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->u0(II)I

    move-result v2

    goto :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->J0(II)I

    move-result v2

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->l(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->s0(ILcom/google/crypto/tink/shaded/protobuf/l;)I

    move-result v2

    goto :goto_1

    :pswitch_8
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->l(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v3

    invoke-static {v5, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->o(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)I

    move-result v2

    goto :goto_1

    :pswitch_9
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->l(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/google/crypto/tink/shaded/protobuf/l;

    if-eqz v3, :cond_1

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->s0(ILcom/google/crypto/tink/shaded/protobuf/l;)I

    move-result v2

    goto/16 :goto_1

    :cond_1
    check-cast v2, Ljava/lang/String;

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->G0(ILjava/lang/String;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->r0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->v0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->w0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->F(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->z0(II)I

    move-result v2

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {v5, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/p;->L0(IJ)I

    move-result v2

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->G(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {v5, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/p;->B0(IJ)I

    move-result v2

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->x0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, p1, v5, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->t0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_12
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->l(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->o(I)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->n:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/t0;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_13
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v3

    invoke-static {v5, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/k1;->j(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/j1;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_14
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->t(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_15
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->r(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_16
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->i(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_17
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->g(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_18
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->e(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_19
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->w(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_1a
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->b(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_1b
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->g(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_1c
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->i(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_1d
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->l(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_1e
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->y(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_1f
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->n(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_20
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->g(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_21
    invoke-virtual {v2, p1, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->i(Ljava/util/List;)I

    move-result v2

    if-lez v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->I0(I)I

    move-result v3

    invoke-static {v2, v3, v2, v1}, La7/a;->v(IIII)I

    move-result v1

    goto/16 :goto_2

    :pswitch_22
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->s(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_23
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->q(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_24
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->h(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_25
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->f(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_26
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->d(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_27
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->v(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_28
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->c(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_29
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v3

    invoke-static {v5, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/k1;->p(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/j1;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_2a
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->u(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_2b
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->a(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_2c
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->f(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_2d
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->h(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_2e
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->k(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_2f
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->x(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_30
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->m(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_31
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->f(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_32
    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->v(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->h(ILjava/util/List;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_33
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->l(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/b;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v3

    invoke-static {v5, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/p;->y0(ILcom/google/crypto/tink/shaded/protobuf/b;Lcom/google/crypto/tink/shaded/protobuf/j1;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_34
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {v5, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/p;->F0(IJ)I

    move-result v2

    goto/16 :goto_1

    :pswitch_35
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->j(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->E0(II)I

    move-result v2

    goto/16 :goto_1

    :pswitch_36
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->D0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_37
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->C0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_38
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->j(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->u0(II)I

    move-result v2

    goto/16 :goto_1

    :pswitch_39
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->j(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->J0(II)I

    move-result v2

    goto/16 :goto_1

    :pswitch_3a
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->l(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->s0(ILcom/google/crypto/tink/shaded/protobuf/l;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_3b
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->l(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v3

    invoke-static {v5, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/k1;->o(ILcom/google/crypto/tink/shaded/protobuf/j1;Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_3c
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->l(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/google/crypto/tink/shaded/protobuf/l;

    if-eqz v3, :cond_2

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->s0(ILcom/google/crypto/tink/shaded/protobuf/l;)I

    move-result v2

    goto/16 :goto_1

    :cond_2
    check-cast v2, Ljava/lang/String;

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->G0(ILjava/lang/String;)I

    move-result v2

    goto/16 :goto_1

    :pswitch_3d
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->r0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_3e
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->v0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_3f
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->w0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_40
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->j(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {v5, v2}, Lcom/google/crypto/tink/shaded/protobuf/p;->z0(II)I

    move-result v2

    goto/16 :goto_1

    :pswitch_41
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {v5, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/p;->L0(IJ)I

    move-result v2

    goto/16 :goto_1

    :pswitch_42
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v6, v7}, Lcom/google/crypto/tink/shaded/protobuf/w1;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {v5, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/p;->B0(IJ)I

    move-result v2

    goto/16 :goto_1

    :pswitch_43
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->x0(I)I

    move-result v2

    goto/16 :goto_1

    :pswitch_44
    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/p;->t0(I)I

    move-result v2

    goto/16 :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->m:Lcom/google/crypto/tink/shaded/protobuf/p1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->b()I

    move-result p1

    add-int/2addr p1, v1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(ILjava/lang/Object;)Z
    .locals 7

    add-int/lit8 v0, p1, 0x2

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget v0, v1, v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_11

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result p1

    and-int v0, p1, v1

    int-to-long v0, v0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result p1

    const-wide/16 v2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    move v5, v6

    :cond_0
    return v5

    :pswitch_1
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    move v5, v6

    :cond_1
    return v5

    :pswitch_2
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    move v5, v6

    :cond_2
    return v5

    :pswitch_3
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    move v5, v6

    :cond_3
    return v5

    :pswitch_4
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    move v5, v6

    :cond_4
    return v5

    :pswitch_5
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    move v5, v6

    :cond_5
    return v5

    :pswitch_6
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    move v5, v6

    :cond_6
    return v5

    :pswitch_7
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/l;->b:Lcom/google/crypto/tink/shaded/protobuf/k;

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v2, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v6

    return p1

    :pswitch_8
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    move v5, v6

    :cond_7
    return v5

    :pswitch_9
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_8

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v6

    return p1

    :cond_8
    instance-of p2, p1, Lcom/google/crypto/tink/shaded/protobuf/l;

    if-eqz p2, :cond_9

    sget-object p2, Lcom/google/crypto/tink/shaded/protobuf/l;->b:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v6

    return p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->c(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_a

    move v5, v6

    :cond_a
    return v5

    :pswitch_c
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_b

    move v5, v6

    :cond_b
    return v5

    :pswitch_d
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_c

    move v5, v6

    :cond_c
    return v5

    :pswitch_e
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_d

    move v5, v6

    :cond_d
    return v5

    :pswitch_f
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->h(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    move v5, v6

    :cond_e
    return v5

    :pswitch_10
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->f(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_f

    move v5, v6

    :cond_f
    return v5

    :pswitch_11
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->e(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    move v5, v6

    :cond_10
    return v5

    :cond_11
    ushr-int/lit8 p1, v0, 0x14

    shl-int p1, v6, p1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {v0, p2, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result p2

    and-int/2addr p1, p2

    if-eqz p1, :cond_12

    move v5, v6

    :cond_12
    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u(Ljava/lang/Object;II)Z
    .locals 2

    add-int/lit8 p3, p3, 0x2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget p3, v0, p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    sget-object p3, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final w(Lcom/google/crypto/tink/shaded/protobuf/p1;Ljava/lang/Object;Lg2/m;Lcom/google/crypto/tink/shaded/protobuf/t;)V
    .locals 16

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v0, p3

    move-object/from16 v11, p4

    iget-object v12, v8, Lcom/google/crypto/tink/shaded/protobuf/a1;->h:[I

    iget v13, v8, Lcom/google/crypto/tink/shaded/protobuf/a1;->j:I

    iget v14, v8, Lcom/google/crypto/tink/shaded/protobuf/a1;->i:I

    const/4 v15, 0x0

    move-object v7, v15

    :goto_0
    :try_start_0
    invoke-virtual/range {p3 .. p3}, Lg2/m;->b()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget v2, v8, Lcom/google/crypto/tink/shaded/protobuf/a1;->c:I

    if-lt v1, v2, :cond_0

    iget v2, v8, Lcom/google/crypto/tink/shaded/protobuf/a1;->d:I

    if-gt v1, v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v8, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->T(II)I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    goto :goto_2

    :goto_1
    move-object v15, v7

    goto/16 :goto_8

    :cond_0
    const/4 v2, -0x1

    :goto_2
    if-gez v2, :cond_8

    const v2, 0x7fffffff

    if-ne v1, v2, :cond_3

    :goto_3
    if-ge v14, v13, :cond_1

    aget v0, v12, v14

    invoke-virtual {v8, v10, v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->m(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    :cond_1
    if-eqz v7, :cond_2

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, v10

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iput-object v7, v0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    :cond_2
    return-void

    :cond_3
    :try_start_2
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v7, :cond_4

    invoke-static/range {p2 .. p2}, Lcom/google/crypto/tink/shaded/protobuf/p1;->a(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v7

    goto :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :cond_4
    :goto_4
    invoke-static {v7, v0}, Lcom/google/crypto/tink/shaded/protobuf/p1;->c(Ljava/lang/Object;Lg2/m;)Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    :goto_5
    if-ge v14, v13, :cond_6

    aget v0, v12, v14

    invoke-virtual {v8, v10, v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->m(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_5

    :cond_6
    if-eqz v7, :cond_7

    move-object v0, v10

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iput-object v7, v0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    :cond_7
    return-void

    :cond_8
    :try_start_3
    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->W(I)I

    move-result v4
    :try_end_4
    .catch Lcom/google/crypto/tink/shaded/protobuf/g0; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const/4 v5, 0x2

    iget-object v6, v8, Lcom/google/crypto/tink/shaded/protobuf/a1;->l:Lcom/google/crypto/tink/shaded/protobuf/n0;

    packed-switch v4, :pswitch_data_0

    if-nez v7, :cond_9

    :try_start_5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p2 .. p2}, Lcom/google/crypto/tink/shaded/protobuf/p1;->a(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v7

    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v0}, Lcom/google/crypto/tink/shaded/protobuf/p1;->c(Ljava/lang/Object;Lg2/m;)Z

    move-result v1
    :try_end_5
    .catch Lcom/google/crypto/tink/shaded/protobuf/g0; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v1, :cond_f

    :goto_6
    if-ge v14, v13, :cond_a

    aget v0, v12, v14

    invoke-virtual {v8, v10, v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->m(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_6

    :cond_a
    if-eqz v7, :cond_b

    move-object v0, v10

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iput-object v7, v0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    :cond_b
    return-void

    :pswitch_0
    :try_start_6
    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->B(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/b;

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v11}, Lg2/m;->d(Lcom/google/crypto/tink/shaded/protobuf/b;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    invoke-virtual {v8, v10, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->V(Ljava/lang/Object;IILjava/lang/Object;)V

    :goto_7
    move-object v15, v7

    goto/16 :goto_9

    :pswitch_1
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->K()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto :goto_7

    :pswitch_2
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->I()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto :goto_7

    :pswitch_3
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->G()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto :goto_7

    :pswitch_4
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->E()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto :goto_7

    :pswitch_5
    invoke-virtual/range {p3 .. p3}, Lg2/m;->q()I

    move-result v4

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->n(I)V

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v10, v5, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto :goto_7

    :pswitch_6
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->P()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto :goto_7

    :pswitch_7
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->l()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_8
    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->B(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/b;

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v4

    invoke-virtual {v0, v5}, Lg2/m;->U(I)V

    invoke-virtual {v0, v3, v4, v11}, Lg2/m;->h(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    invoke-virtual {v8, v10, v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->V(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_9
    invoke-virtual {v8, v10, v3, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->O(Ljava/lang/Object;ILg2/m;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_a
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->j()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_b
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->t()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_c
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->v()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_d
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->z()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_e
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->R()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_f
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->B()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_10
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->x()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_11
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->o()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-static {v10, v3, v4, v5}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_12
    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->o(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v8, v10, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->x(Ljava/lang/Object;ILjava/lang/Object;)V

    throw v15
    :try_end_6
    .catch Lcom/google/crypto/tink/shaded/protobuf/g0; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :pswitch_13
    :try_start_7
    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v6
    :try_end_7
    .catch Lcom/google/crypto/tink/shaded/protobuf/g0; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v5, p3

    move-object v15, v7

    move-object/from16 v7, p4

    :try_start_8
    invoke-virtual/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->M(Ljava/lang/Object;JLg2/m;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    goto :goto_9

    :catchall_1
    move-exception v0

    :goto_8
    move-object v7, v15

    goto/16 :goto_d

    :catch_0
    move-object v7, v15

    goto/16 :goto_a

    :catchall_2
    move-exception v0

    move-object v15, v7

    goto/16 :goto_d

    :catch_1
    move-object v15, v7

    goto/16 :goto_a

    :pswitch_14
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->L(Ljava/util/List;)V

    goto :goto_9

    :pswitch_15
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->J(Ljava/util/List;)V

    goto :goto_9

    :pswitch_16
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->H(Ljava/util/List;)V

    goto :goto_9

    :pswitch_17
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->F(Ljava/util/List;)V

    goto :goto_9

    :pswitch_18
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual {v6, v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Lg2/m;->r(Ljava/util/List;)V

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->n(I)V

    invoke-static {v10, v1, v3, v15, v9}, Lcom/google/crypto/tink/shaded/protobuf/k1;->z(Ljava/lang/Object;ILjava/util/List;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p1;)Ljava/lang/Object;

    :goto_9
    move-object v7, v15

    goto/16 :goto_c

    :pswitch_19
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->Q(Ljava/util/List;)V

    goto :goto_9

    :pswitch_1a
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->k(Ljava/util/List;)V

    goto :goto_9

    :pswitch_1b
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->u(Ljava/util/List;)V

    goto :goto_9

    :pswitch_1c
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->w(Ljava/util/List;)V

    goto :goto_9

    :pswitch_1d
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->A(Ljava/util/List;)V

    goto :goto_9

    :pswitch_1e
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->S(Ljava/util/List;)V

    goto :goto_9

    :pswitch_1f
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->C(Ljava/util/List;)V

    goto :goto_9

    :pswitch_20
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->y(Ljava/util/List;)V

    goto :goto_9

    :pswitch_21
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->p(Ljava/util/List;)V

    goto :goto_9

    :pswitch_22
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->L(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_23
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->J(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_24
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->H(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_25
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->F(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_26
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual {v6, v10, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Lg2/m;->r(Ljava/util/List;)V

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->n(I)V

    invoke-static {v10, v1, v3, v15, v9}, Lcom/google/crypto/tink/shaded/protobuf/k1;->z(Ljava/lang/Object;ILjava/util/List;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/p1;)Ljava/lang/Object;

    goto/16 :goto_9

    :pswitch_27
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->Q(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_28
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->n(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_29
    move-object v15, v7

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v5

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p4

    invoke-virtual/range {v1 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->N(Ljava/lang/Object;ILg2/m;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    goto/16 :goto_9

    :pswitch_2a
    move-object v15, v7

    invoke-virtual {v8, v10, v3, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->P(Ljava/lang/Object;ILg2/m;)V

    goto/16 :goto_9

    :pswitch_2b
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->k(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_2c
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->u(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_2d
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->w(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_2e
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->A(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_2f
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->S(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_30
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->C(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_31
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->y(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_32
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v1

    invoke-virtual {v6, v10, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/n0;->c(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg2/m;->p(Ljava/util/List;)V

    goto/16 :goto_9

    :pswitch_33
    move-object v15, v7

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->A(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/b;

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v3

    invoke-virtual {v0, v1, v3, v11}, Lg2/m;->d(Lcom/google/crypto/tink/shaded/protobuf/b;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    invoke-virtual {v8, v2, v10, v1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->U(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_34
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->K()J

    move-result-wide v5

    invoke-static {v10, v3, v4, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/w1;->u(Ljava/lang/Object;JJ)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_35
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->I()I

    move-result v1

    invoke-static {v3, v4, v10, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_36
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->G()J

    move-result-wide v5

    invoke-static {v10, v3, v4, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/w1;->u(Ljava/lang/Object;JJ)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_37
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->E()I

    move-result v1

    invoke-static {v3, v4, v10, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_38
    move-object v15, v7

    invoke-virtual/range {p3 .. p3}, Lg2/m;->q()I

    move-result v1

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->n(I)V

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-static {v3, v4, v10, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_39
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->P()I

    move-result v1

    invoke-static {v3, v4, v10, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3a
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->l()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v1

    invoke-static {v10, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3b
    move-object v15, v7

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->A(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/b;

    invoke-virtual {v8, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object v3

    invoke-virtual {v0, v5}, Lg2/m;->U(I)V

    invoke-virtual {v0, v1, v3, v11}, Lg2/m;->h(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    invoke-virtual {v8, v2, v10, v1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->U(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3c
    move-object v15, v7

    invoke-virtual {v8, v10, v3, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->O(Ljava/lang/Object;ILg2/m;)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3d
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->j()Z

    move-result v1

    invoke-static {v10, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->n(Ljava/lang/Object;JZ)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3e
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->t()I

    move-result v1

    invoke-static {v3, v4, v10, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3f
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->v()J

    move-result-wide v5

    invoke-static {v10, v3, v4, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/w1;->u(Ljava/lang/Object;JJ)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_40
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->z()I

    move-result v1

    invoke-static {v3, v4, v10, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->t(JLjava/lang/Object;I)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_41
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->R()J

    move-result-wide v5

    invoke-static {v10, v3, v4, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/w1;->u(Ljava/lang/Object;JJ)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_42
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->B()J

    move-result-wide v5

    invoke-static {v10, v3, v4, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/w1;->u(Ljava/lang/Object;JJ)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_43
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->x()F

    move-result v1

    invoke-static {v10, v3, v4, v1}, Lcom/google/crypto/tink/shaded/protobuf/w1;->s(Ljava/lang/Object;JF)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_44
    move-object v15, v7

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->E(I)J

    move-result-wide v3

    invoke-virtual/range {p3 .. p3}, Lg2/m;->o()D

    move-result-wide v5

    invoke-static {v10, v3, v4, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/w1;->r(Ljava/lang/Object;JD)V

    invoke-virtual {v8, v2, v10}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V
    :try_end_8
    .catch Lcom/google/crypto/tink/shaded/protobuf/g0; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto/16 :goto_9

    :catch_2
    :goto_a
    :try_start_9
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v7, :cond_c

    invoke-static/range {p2 .. p2}, Lcom/google/crypto/tink/shaded/protobuf/p1;->a(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v1

    move-object v7, v1

    :cond_c
    invoke-static {v7, v0}, Lcom/google/crypto/tink/shaded/protobuf/p1;->c(Ljava/lang/Object;Lg2/m;)Z

    move-result v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-nez v1, :cond_f

    :goto_b
    if-ge v14, v13, :cond_d

    aget v0, v12, v14

    invoke-virtual {v8, v10, v0, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->m(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_b

    :cond_d
    if-eqz v7, :cond_e

    move-object v0, v10

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iput-object v7, v0, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    :cond_e
    return-void

    :cond_f
    :goto_c
    const/4 v15, 0x0

    goto/16 :goto_0

    :catchall_3
    move-exception v0

    goto/16 :goto_1

    :goto_d
    if-ge v14, v13, :cond_10

    aget v1, v12, v14

    invoke-virtual {v8, v10, v1, v7}, Lcom/google/crypto/tink/shaded/protobuf/a1;->m(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_d

    :cond_10
    if-eqz v7, :cond_11

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v1, v10

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/b0;

    iput-object v7, v1, Lcom/google/crypto/tink/shaded/protobuf/b0;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/o1;

    :cond_11
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 4

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr p2, v0

    int-to-long v0, p2

    sget-object p2, Lcom/google/crypto/tink/shaded/protobuf/w1;->c:Lcom/google/crypto/tink/shaded/protobuf/v1;

    invoke-virtual {p2, p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->n:Lcom/google/crypto/tink/shaded/protobuf/t0;

    if-eqz p2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/t0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/s0;->b:Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/s0;->c()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v3

    invoke-static {v3, p2}, Lcom/google/crypto/tink/shaded/protobuf/t0;->d(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-static {p1, v0, v1, v3}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lcom/google/crypto/tink/shaded/protobuf/s0;->b:Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/s0;->c()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/w1;->v(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-static {p3}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final y(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    invoke-virtual {p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    invoke-virtual {v2, p3, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object p3

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/a1;->t(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2, p2, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p3, v4, v3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->R(ILjava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->t(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p3, v4, p1}, Lcom/google/crypto/tink/shaded/protobuf/j1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p1, v4

    :cond_3
    invoke-interface {p3, p1, v3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Source subfield "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget p1, v1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final z(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a1;->a:[I

    aget v1, v0, p1

    invoke-virtual {p0, p3, v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->X(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v2, v3

    int-to-long v2, v2

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/a1;->p:Lsun/misc/Unsafe;

    invoke-virtual {v4, p3, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->p(I)Lcom/google/crypto/tink/shaded/protobuf/j1;

    move-result-object p3

    invoke-virtual {p0, p2, v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->u(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->t(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4, p2, v2, v3, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3, v0, v5}, Lcom/google/crypto/tink/shaded/protobuf/j1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p2, v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->S(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v4, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->t(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/j1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, p2, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p1, v0

    :cond_3
    invoke-interface {p3, p1, v5}, Lcom/google/crypto/tink/shaded/protobuf/j1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Source subfield "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget p1, v0, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
