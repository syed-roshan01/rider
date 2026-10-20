.class public final Lx9/r;
.super Ljava/lang/Object;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/ArrayList;

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lx9/r;->b:Ljava/lang/String;

    iput-object v0, p0, Lx9/r;->c:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, p0, Lx9/r;->e:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lx9/r;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a()Lx9/s;
    .locals 14

    iget-object v1, p0, Lx9/r;->a:Ljava/lang/String;

    if-eqz v1, :cond_6

    iget-object v0, p0, Lx9/r;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v0, v2, v2, v2, v3}, Lq8/k;->n(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lx9/r;->c:Ljava/lang/String;

    invoke-static {v0, v2, v2, v2, v3}, Lq8/k;->n(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lx9/r;->d:Ljava/lang/String;

    if-eqz v6, :cond_5

    invoke-virtual {p0}, Lx9/r;->b()I

    move-result v7

    iget-object v0, p0, Lx9/r;->f:Ljava/util/ArrayList;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v0}, Lf9/a;->y0(Ljava/lang/Iterable;)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-static {v9, v2, v2, v2, v3}, Lq8/k;->n(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx9/r;->g:Ljava/util/ArrayList;

    const/4 v9, 0x0

    if-eqz v0, :cond_2

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v0}, Lf9/a;->y0(Ljava/lang/Iterable;)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_1

    const/4 v12, 0x1

    const/4 v13, 0x3

    invoke-static {v11, v2, v2, v12, v13}, Lq8/k;->n(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v11

    goto :goto_2

    :cond_1
    move-object v11, v9

    :goto_2
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object v10, v9

    :cond_3
    iget-object v0, p0, Lx9/r;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-static {v0, v2, v2, v2, v3}, Lq8/k;->n(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    :cond_4
    invoke-virtual {p0}, Lx9/r;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lx9/s;

    move-object v0, v12

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move v5, v7

    move-object v6, v8

    move-object v7, v10

    move-object v8, v9

    move-object v9, v11

    invoke-direct/range {v0 .. v9}, Lx9/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-object v12

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "host == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scheme == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()I
    .locals 3

    iget v0, p0, Lx9/r;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx9/r;->a:Ljava/lang/String;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    const-string v2, "http"

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v0, 0x50

    goto :goto_0

    :cond_1
    const-string v2, "https"

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x1bb

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0
.end method

.method public final c(Lx9/s;Ljava/lang/String;)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    sget-object v2, Ly9/b;->a:[B

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v11, 0x0

    invoke-static {v11, v2, v10}, Ly9/b;->l(IILjava/lang/String;)I

    move-result v2

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v2, v3, v10}, Ly9/b;->m(IILjava/lang/String;)I

    move-result v12

    sub-int v3, v12, v2

    const/4 v13, -0x1

    const/16 v14, 0x5b

    const/4 v4, 0x2

    const/16 v15, 0x3a

    if-ge v3, v4, :cond_1

    :cond_0
    :goto_0
    move v3, v13

    goto :goto_3

    :cond_1
    invoke-virtual {v10, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x61

    invoke-static {v3, v5}, Ld7/a;->o(II)I

    move-result v6

    const/16 v7, 0x41

    if-ltz v6, :cond_2

    const/16 v6, 0x7a

    invoke-static {v3, v6}, Ld7/a;->o(II)I

    move-result v6

    if-lez v6, :cond_3

    :cond_2
    invoke-static {v3, v7}, Ld7/a;->o(II)I

    move-result v6

    if-ltz v6, :cond_0

    const/16 v6, 0x5a

    invoke-static {v3, v6}, Ld7/a;->o(II)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v3, v2, 0x1

    :goto_1
    if-ge v3, v12, :cond_0

    invoke-virtual {v10, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-gt v5, v6, :cond_4

    const/16 v8, 0x7b

    if-ge v6, v8, :cond_4

    goto :goto_2

    :cond_4
    if-gt v7, v6, :cond_5

    if-ge v6, v14, :cond_5

    goto :goto_2

    :cond_5
    const/16 v8, 0x30

    if-gt v8, v6, :cond_6

    if-ge v6, v15, :cond_6

    goto :goto_2

    :cond_6
    const/16 v8, 0x2b

    if-ne v6, v8, :cond_7

    goto :goto_2

    :cond_7
    const/16 v8, 0x2d

    if-ne v6, v8, :cond_8

    goto :goto_2

    :cond_8
    const/16 v8, 0x2e

    if-ne v6, v8, :cond_9

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_9
    if-ne v6, v15, :cond_0

    :goto_3
    const-string v9, "http"

    const-string v8, "https"

    const/4 v7, 0x1

    const-string v6, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    if-eq v3, v13, :cond_c

    const-string v5, "https:"

    invoke-static {v2, v10, v5, v7}, Ll9/i;->g1(ILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_a

    iput-object v8, v0, Lx9/r;->a:Ljava/lang/String;

    add-int/lit8 v2, v2, 0x6

    goto :goto_4

    :cond_a
    const-string v5, "http:"

    invoke-static {v2, v10, v5, v7}, Ll9/i;->g1(ILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_b

    iput-object v9, v0, Lx9/r;->a:Ljava/lang/String;

    add-int/lit8 v2, v2, 0x5

    goto :goto_4

    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Expected URL scheme \'http\' or \'https\' but was \'"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v11, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x27

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    if-eqz v1, :cond_33

    iget-object v3, v1, Lx9/s;->a:Ljava/lang/String;

    iput-object v3, v0, Lx9/r;->a:Ljava/lang/String;

    :goto_4
    move v3, v2

    move v5, v11

    :goto_5
    const/16 v11, 0x2f

    const/16 v14, 0x5c

    if-ge v3, v12, :cond_e

    invoke-virtual {v10, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-eq v7, v14, :cond_d

    if-ne v7, v11, :cond_e

    :cond_d
    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v3, v3, 0x1

    const/4 v7, 0x1

    const/16 v14, 0x5b

    goto :goto_5

    :cond_e
    iget-object v7, v0, Lx9/r;->f:Ljava/util/ArrayList;

    const/16 v3, 0x3f

    move-object/from16 v19, v9

    const/16 v9, 0x23

    if-ge v5, v4, :cond_13

    if-eqz v1, :cond_13

    iget-object v4, v0, Lx9/r;->a:Ljava/lang/String;

    iget-object v15, v1, Lx9/s;->a:Ljava/lang/String;

    invoke-static {v15, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto :goto_7

    :cond_f
    invoke-virtual/range {p1 .. p1}, Lx9/s;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lx9/r;->b:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lx9/s;->a()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lx9/r;->c:Ljava/lang/String;

    iget-object v4, v1, Lx9/s;->d:Ljava/lang/String;

    iput-object v4, v0, Lx9/r;->d:Ljava/lang/String;

    iget v4, v1, Lx9/s;->e:I

    iput v4, v0, Lx9/r;->e:I

    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {p1 .. p1}, Lx9/s;->c()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eq v2, v12, :cond_10

    invoke-virtual {v10, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v9, :cond_12

    :cond_10
    invoke-virtual/range {p1 .. p1}, Lx9/s;->d()Ljava/lang/String;

    move-result-object v19

    if-eqz v19, :cond_11

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-string v22, " \"\'<>#"

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x1

    const/16 v26, 0x0

    const/16 v27, 0xd3

    invoke-static/range {v19 .. v27}, Lq8/k;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lq8/k;->o(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_6

    :cond_11
    const/4 v1, 0x0

    :goto_6
    iput-object v1, v0, Lx9/r;->g:Ljava/util/ArrayList;

    :cond_12
    move-object/from16 v18, v7

    const/4 v13, 0x1

    const/4 v14, 0x0

    goto/16 :goto_12

    :cond_13
    :goto_7
    add-int/2addr v2, v5

    move v15, v2

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_8
    const-string v1, "@/\\?#"

    invoke-static {v10, v15, v12, v1}, Ly9/b;->e(Ljava/lang/String;IILjava/lang/String;)I

    move-result v5

    if-eq v5, v12, :cond_14

    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    goto :goto_9

    :cond_14
    move v1, v13

    :goto_9
    if-eq v1, v13, :cond_19

    if-eq v1, v9, :cond_19

    if-eq v1, v11, :cond_19

    if-eq v1, v14, :cond_19

    if-eq v1, v3, :cond_19

    const/16 v2, 0x40

    if-eq v1, v2, :cond_15

    goto :goto_8

    :cond_15
    const-string v4, "%40"

    if-nez v21, :cond_18

    const/16 v1, 0x3a

    invoke-static {v10, v1, v15, v5}, Ly9/b;->d(Ljava/lang/String;CII)I

    move-result v2

    const-string v23, " \"\':;<=>@[]^`{}|/\\?#"

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0xf0

    move-object/from16 v1, p2

    move/from16 p1, v2

    move v2, v15

    move v15, v3

    move/from16 v3, p1

    move-object v14, v4

    move-object/from16 v4, v23

    move v11, v5

    move/from16 v5, v24

    move-object/from16 v29, v6

    move/from16 v6, v25

    move-object/from16 v18, v7

    const/4 v13, 0x1

    move/from16 v7, v26

    move-object/from16 v30, v8

    move/from16 v8, v27

    move-object/from16 v31, v19

    move/from16 v9, v28

    invoke-static/range {v1 .. v9}, Lq8/k;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    if-eqz v22, :cond_16

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lx9/r;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_16
    iput-object v1, v0, Lx9/r;->b:Ljava/lang/String;

    move/from16 v1, p1

    if-eq v1, v11, :cond_17

    add-int/lit8 v2, v1, 0x1

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xf0

    move-object/from16 v1, p2

    move v3, v11

    invoke-static/range {v1 .. v9}, Lq8/k;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lx9/r;->c:Ljava/lang/String;

    move v7, v13

    goto :goto_a

    :cond_17
    move/from16 v7, v21

    :goto_a
    move/from16 v21, v7

    move/from16 v22, v13

    move v14, v15

    goto :goto_b

    :cond_18
    move v9, v3

    move-object v14, v4

    move v11, v5

    move-object/from16 v29, v6

    move-object/from16 v18, v7

    move-object/from16 v30, v8

    move-object/from16 v31, v19

    const/4 v13, 0x1

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v0, Lx9/r;->c:Ljava/lang/String;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    const/16 v19, 0xf0

    move-object/from16 v1, p2

    move v2, v15

    move v3, v11

    move-object v15, v8

    move v8, v14

    move v14, v9

    move/from16 v9, v19

    invoke-static/range {v1 .. v9}, Lq8/k;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lx9/r;->c:Ljava/lang/String;

    :goto_b
    add-int/lit8 v15, v11, 0x1

    move v3, v14

    move-object/from16 v7, v18

    move-object/from16 v6, v29

    move-object/from16 v8, v30

    move-object/from16 v19, v31

    const/16 v9, 0x23

    const/16 v11, 0x2f

    const/4 v13, -0x1

    const/16 v14, 0x5c

    goto/16 :goto_8

    :cond_19
    move v14, v3

    move v11, v5

    move-object/from16 v29, v6

    move-object/from16 v18, v7

    move-object/from16 v30, v8

    move-object/from16 v31, v19

    const/4 v13, 0x1

    move v5, v15

    :goto_c
    if-ge v5, v11, :cond_1e

    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x5b

    if-ne v1, v2, :cond_1c

    :cond_1a
    add-int/2addr v5, v13

    if-ge v5, v11, :cond_1b

    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x5d

    if-ne v1, v3, :cond_1a

    :cond_1b
    const/16 v3, 0x3a

    goto :goto_d

    :cond_1c
    const/16 v3, 0x3a

    if-ne v1, v3, :cond_1d

    move v9, v5

    goto :goto_e

    :cond_1d
    :goto_d
    add-int/2addr v5, v13

    goto :goto_c

    :cond_1e
    move v9, v11

    :goto_e
    add-int/lit8 v8, v9, 0x1

    const/4 v1, 0x4

    const/16 v7, 0x22

    if-ge v8, v11, :cond_21

    const/4 v2, 0x0

    invoke-static {v10, v15, v9, v2, v1}, Lq8/k;->n(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh6/g;->x0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lx9/r;->d:Ljava/lang/String;

    :try_start_0
    const-string v4, ""
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xf8

    move-object/from16 v1, p2

    move v2, v8

    move v3, v11

    move v14, v7

    move/from16 v7, v17

    move v14, v8

    move/from16 v8, v19

    move/from16 v32, v9

    move/from16 v9, v20

    :try_start_1
    invoke-static/range {v1 .. v9}, Lq8/k;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    if-gt v13, v1, :cond_1f

    const/high16 v2, 0x10000

    if-ge v1, v2, :cond_1f

    goto :goto_f

    :catch_0
    move v14, v8

    move/from16 v32, v9

    :catch_1
    :cond_1f
    const/4 v1, -0x1

    :goto_f
    iput v1, v0, Lx9/r;->e:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_20

    move-object/from16 v3, v29

    move/from16 v5, v32

    const/4 v14, 0x0

    goto :goto_11

    :cond_20
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid URL port: \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v14, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v29

    invoke-static {v2, v3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_21
    move v5, v9

    move-object/from16 v3, v29

    const/4 v2, -0x1

    const/4 v14, 0x0

    invoke-static {v10, v15, v5, v14, v1}, Lq8/k;->n(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh6/g;->x0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lx9/r;->d:Ljava/lang/String;

    iget-object v1, v0, Lx9/r;->a:Ljava/lang/String;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    move-object/from16 v4, v31

    invoke-static {v1, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_22

    const/16 v1, 0x50

    goto :goto_10

    :cond_22
    move-object/from16 v4, v30

    invoke-static {v1, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    const/16 v1, 0x1bb

    goto :goto_10

    :cond_23
    move v1, v2

    :goto_10
    iput v1, v0, Lx9/r;->e:I

    :goto_11
    iget-object v1, v0, Lx9/r;->d:Ljava/lang/String;

    if-eqz v1, :cond_32

    move v2, v11

    :goto_12
    const-string v1, "?#"

    invoke-static {v10, v2, v12, v1}, Ly9/b;->e(Ljava/lang/String;IILjava/lang/String;)I

    move-result v11

    if-ne v2, v11, :cond_24

    goto/16 :goto_1a

    :cond_24
    invoke-virtual {v10, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const-string v15, ""

    const/16 v3, 0x2f

    if-eq v1, v3, :cond_25

    const/16 v3, 0x5c

    if-ne v1, v3, :cond_26

    :cond_25
    move-object/from16 v9, v18

    goto :goto_13

    :cond_26
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v13

    move-object/from16 v9, v18

    invoke-virtual {v9, v1, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    :goto_13
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    :goto_14
    if-ge v2, v11, :cond_2f

    const-string v1, "/\\"

    invoke-static {v10, v2, v11, v1}, Ly9/b;->e(Ljava/lang/String;IILjava/lang/String;)I

    move-result v8

    if-ge v8, v11, :cond_27

    move/from16 v16, v13

    goto :goto_15

    :cond_27
    move/from16 v16, v14

    :goto_15
    const/4 v5, 0x1

    const-string v4, " \"<>^`{}|/\\?#"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v17, 0x0

    const/16 v18, 0xf0

    move-object/from16 v1, p2

    move v3, v8

    move/from16 v19, v8

    move/from16 v8, v17

    move-object v14, v9

    move/from16 v9, v18

    invoke-static/range {v1 .. v9}, Lq8/k;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    const-string v2, "."

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2d

    const-string v2, "%2e"

    invoke-static {v1, v2}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_28

    goto :goto_18

    :cond_28
    const-string v2, ".."

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2b

    const-string v2, "%2e."

    invoke-static {v1, v2}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2b

    const-string v2, ".%2e"

    invoke-static {v1, v2}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2b

    const-string v2, "%2e%2e"

    invoke-static {v1, v2}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_29

    goto :goto_17

    :cond_29
    invoke-static {v14, v13}, La7/a;->k(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2a

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v13

    invoke-virtual {v14, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_16

    :cond_2a
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_16
    if-eqz v16, :cond_2d

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_2b
    :goto_17
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v13

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2c

    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v13

    if-eqz v1, :cond_2c

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v13

    invoke-virtual {v14, v1, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_18

    :cond_2c
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2d
    :goto_18
    if-eqz v16, :cond_2e

    add-int/lit8 v2, v19, 0x1

    move-object v9, v14

    :goto_19
    const/4 v14, 0x0

    goto/16 :goto_14

    :cond_2e
    move-object v9, v14

    move/from16 v2, v19

    goto :goto_19

    :cond_2f
    :goto_1a
    if-ge v11, v12, :cond_30

    invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x3f

    if-ne v1, v2, :cond_30

    const/16 v14, 0x23

    invoke-static {v10, v14, v11, v12}, Ly9/b;->d(Ljava/lang/String;CII)I

    move-result v15

    add-int/lit8 v2, v11, 0x1

    const-string v4, " \"\'<>#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/16 v9, 0xd0

    move-object/from16 v1, p2

    move v3, v15

    invoke-static/range {v1 .. v9}, Lq8/k;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lq8/k;->o(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lx9/r;->g:Ljava/util/ArrayList;

    move v11, v15

    goto :goto_1b

    :cond_30
    const/16 v14, 0x23

    :goto_1b
    if-ge v11, v12, :cond_31

    invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v14, :cond_31

    add-int/lit8 v2, v11, 0x1

    const-string v4, ""

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/16 v9, 0xb0

    move-object/from16 v1, p2

    move v3, v12

    invoke-static/range {v1 .. v9}, Lq8/k;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lx9/r;->h:Ljava/lang/String;

    :cond_31
    return-void

    :cond_32
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid URL host: \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v15, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_33
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x6

    if-le v1, v2, :cond_34

    invoke-static {v2, v10}, Ll9/j;->p1(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "..."

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1c

    :cond_34
    move-object v1, v10

    :goto_1c
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    invoke-static {v3, v1}, Ll/q;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lx9/r;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "//"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    iget-object v1, p0, Lx9/r;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x3a

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lx9/r;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lx9/r;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx9/r;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx9/r;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lx9/r;->d:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-static {v1, v2}, Ll9/i;->G0(Ljava/lang/CharSequence;C)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx9/r;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lx9/r;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    :goto_2
    iget v1, p0, Lx9/r;->e:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_6

    iget-object v1, p0, Lx9/r;->a:Ljava/lang/String;

    if-eqz v1, :cond_a

    :cond_6
    invoke-virtual {p0}, Lx9/r;->b()I

    move-result v1

    iget-object v4, p0, Lx9/r;->a:Ljava/lang/String;

    if-eqz v4, :cond_9

    const-string v5, "http"

    invoke-static {v4, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v3, 0x50

    goto :goto_3

    :cond_7
    const-string v5, "https"

    invoke-static {v4, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v3, 0x1bb

    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_a
    iget-object v1, p0, Lx9/r;->f:Ljava/util/ArrayList;

    const-string v2, "<this>"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v2, :cond_b

    const/16 v4, 0x2f

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_b
    iget-object v1, p0, Lx9/r;->g:Ljava/util/ArrayList;

    if-eqz v1, :cond_c

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx9/r;->g:Ljava/util/ArrayList;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-static {v1, v0}, Lq8/k;->p(Ljava/util/List;Ljava/lang/StringBuilder;)V

    :cond_c
    iget-object v1, p0, Lx9/r;->h:Ljava/lang/String;

    if-eqz v1, :cond_d

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx9/r;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
