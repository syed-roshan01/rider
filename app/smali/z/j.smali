.class public final Lz/j;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public b:La0/u;

.field public final c:Ljava/util/LinkedHashSet;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lz/j;->a:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lz/j;->c:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz/j;->d:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz/j;->e:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz/j;->f:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz/j;->g:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(IIILjava/util/ArrayList;Lz/s;ZZZ)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    iget-object v6, v0, Lz/j;->b:La0/u;

    iget-object v7, v5, Lz/s;->a:Lz/m;

    iget-object v7, v7, Lz/m;->d:La0/u;

    iput-object v7, v0, Lz/j;->b:La0/u;

    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    if-ge v10, v8, :cond_1

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lz/x;

    iget-object v12, v11, Lz/x;->b:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    move v13, v9

    :goto_1
    if-ge v13, v12, :cond_0

    iget-object v14, v11, Lz/x;->b:Ljava/util/List;

    invoke-interface {v14, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lr1/x0;

    invoke-interface {v14}, Lr1/m0;->a()Ljava/lang/Object;

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    iget-object v8, v0, Lz/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->clear()V

    sget-object v1, La0/d;->b:La0/d;

    iput-object v1, v0, Lz/j;->b:La0/u;

    return-void

    :cond_2
    invoke-static/range {p4 .. p4}, Lr8/p;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lz/x;

    if-eqz v10, :cond_3

    iget v10, v10, Lz/x;->a:I

    :cond_3
    if-eqz p6, :cond_4

    move v10, v3

    goto :goto_2

    :cond_4
    move v10, v2

    :goto_2
    if-eqz p6, :cond_5

    invoke-static {v9, v1}, Li1/b;->c(II)J

    goto :goto_3

    :cond_5
    invoke-static {v1, v9}, Li1/b;->c(II)J

    :goto_3
    if-nez p7, :cond_7

    if-nez p8, :cond_6

    goto :goto_4

    :cond_6
    move v12, v9

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v12, 0x1

    :goto_5
    iget-object v13, v0, Lz/j;->c:Ljava/util/LinkedHashSet;

    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v14

    check-cast v14, Ljava/util/Collection;

    invoke-virtual {v13, v14}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    move-result v14

    move v15, v9

    :goto_6
    if-ge v15, v14, :cond_9

    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v11, v16

    check-cast v11, Lz/x;

    iget-object v9, v11, Lz/x;->j:Ljava/lang/Object;

    invoke-virtual {v13, v9}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    iget-object v9, v11, Lz/x;->b:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v1

    move/from16 p6, v14

    const/4 v14, 0x0

    :goto_7
    if-ge v14, v1, :cond_8

    invoke-interface {v9, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lr1/x0;

    invoke-interface/range {v17 .. v17}, Lr1/m0;->a()Ljava/lang/Object;

    add-int/lit8 v14, v14, 0x1

    goto :goto_7

    :cond_8
    iget-object v1, v11, Lz/x;->j:Ljava/lang/Object;

    invoke-interface {v8, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v15, v15, 0x1

    move/from16 v14, p6

    const/4 v9, 0x0

    goto :goto_6

    :cond_9
    iget-object v1, v0, Lz/j;->e:Ljava/util/ArrayList;

    iget-object v9, v0, Lz/j;->d:Ljava/util/ArrayList;

    const/4 v11, 0x0

    if-eqz v12, :cond_f

    if-eqz v6, :cond_f

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x1

    if-le v14, v15, :cond_a

    new-instance v14, Lz/i;

    const/4 v15, 0x2

    invoke-direct {v14, v6, v15}, Lz/i;-><init>(La0/u;I)V

    invoke-static {v9, v14}, Lr8/m;->z0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_a
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v14

    const-wide v17, 0xffffffffL

    const/16 v15, 0x20

    if-lez v14, :cond_c

    const/4 v14, 0x0

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/x;

    iget v2, v1, Lz/x;->o:I

    rsub-int/lit8 v9, v2, 0x0

    iget-object v2, v1, Lz/x;->j:Ljava/lang/Object;

    invoke-static {v2, v8}, Lr8/v;->B0(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz/h;

    invoke-virtual {v1, v14}, Lz/x;->a(I)J

    move-result-wide v3

    iget-boolean v1, v1, Lz/x;->c:Z

    if-eqz v1, :cond_b

    sget v1, Lm2/i;->c:I

    shr-long/2addr v3, v15

    long-to-int v1, v3

    invoke-static {v1, v9}, Li1/b;->c(II)J

    goto :goto_8

    :cond_b
    sget v1, Lm2/i;->c:I

    and-long v3, v3, v17

    long-to-int v1, v3

    invoke-static {v9, v1}, Li1/b;->c(II)J

    :goto_8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v11

    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v11, 0x1

    if-le v14, v11, :cond_d

    new-instance v11, Lz/i;

    const/4 v14, 0x0

    invoke-direct {v11, v6, v14}, Lz/i;-><init>(La0/u;I)V

    invoke-static {v1, v11}, Lr8/m;->z0(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_9

    :cond_d
    const/4 v14, 0x0

    :goto_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_f

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/x;

    iget v2, v1, Lz/x;->o:I

    iget-object v2, v1, Lz/x;->j:Ljava/lang/Object;

    invoke-static {v2, v8}, Lr8/v;->B0(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz/h;

    invoke-virtual {v1, v14}, Lz/x;->a(I)J

    move-result-wide v3

    iget-boolean v1, v1, Lz/x;->c:Z

    if-eqz v1, :cond_e

    sget v1, Lm2/i;->c:I

    shr-long/2addr v3, v15

    long-to-int v1, v3

    invoke-static {v1, v10}, Li1/b;->c(II)J

    goto :goto_a

    :cond_e
    sget v1, Lm2/i;->c:I

    and-long v3, v3, v17

    long-to-int v1, v3

    invoke-static {v10, v1}, Li1/b;->c(II)J

    :goto_a
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    throw v1

    :cond_f
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    iget-object v14, v0, Lz/j;->g:Ljava/util/ArrayList;

    iget-object v15, v0, Lz/j;->f:Ljava/util/ArrayList;

    if-eqz v11, :cond_11

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v7, v11}, La0/u;->b(Ljava/lang/Object;)I

    move-result v14

    const/4 v15, -0x1

    if-ne v14, v15, :cond_10

    invoke-interface {v8, v11}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_10
    invoke-virtual {v5, v14}, Lz/s;->a(I)Lz/x;

    move-result-object v1

    const/4 v5, 0x1

    iput-boolean v5, v1, Lz/x;->q:Z

    invoke-static {v11, v8}, Lr8/v;->B0(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    throw v1

    :cond_11
    const/4 v5, 0x1

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-le v6, v5, :cond_12

    new-instance v5, Lz/i;

    const/4 v6, 0x3

    invoke-direct {v5, v7, v6}, Lz/i;-><init>(La0/u;I)V

    invoke-static {v15, v5}, Lr8/m;->z0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_12
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_c
    if-ge v6, v5, :cond_15

    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lz/x;

    move/from16 p5, v5

    iget v5, v11, Lz/x;->o:I

    add-int/2addr v8, v5

    if-eqz p7, :cond_13

    invoke-static/range {p4 .. p4}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz/x;

    iget v5, v5, Lz/x;->m:I

    sub-int/2addr v5, v8

    goto :goto_d

    :cond_13
    rsub-int/lit8 v5, v8, 0x0

    :goto_d
    invoke-virtual {v11, v5, v2, v3}, Lz/x;->c(III)V

    if-nez v12, :cond_14

    add-int/lit8 v6, v6, 0x1

    move/from16 v5, p5

    goto :goto_c

    :cond_14
    invoke-virtual {v0, v11}, Lz/j;->b(Lz/x;)V

    const/4 v1, 0x0

    throw v1

    :cond_15
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x1

    if-le v5, v6, :cond_16

    new-instance v5, Lz/i;

    invoke-direct {v5, v7, v6}, Lz/i;-><init>(La0/u;I)V

    invoke-static {v14, v5}, Lr8/m;->z0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_16
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_e
    if-ge v6, v5, :cond_19

    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lz/x;

    if-eqz p7, :cond_17

    invoke-static/range {p4 .. p4}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lz/x;

    move/from16 p1, v5

    iget v5, v11, Lz/x;->m:I

    iget v11, v11, Lz/x;->o:I

    add-int/2addr v5, v11

    add-int/2addr v5, v7

    goto :goto_f

    :cond_17
    move/from16 p1, v5

    add-int v5, v10, v7

    :goto_f
    iget v11, v8, Lz/x;->o:I

    add-int/2addr v7, v11

    invoke-virtual {v8, v5, v2, v3}, Lz/x;->c(III)V

    if-nez v12, :cond_18

    add-int/lit8 v6, v6, 0x1

    move/from16 v5, p1

    goto :goto_e

    :cond_18
    invoke-virtual {v0, v8}, Lz/j;->b(Lz/x;)V

    const/4 v1, 0x0

    throw v1

    :cond_19
    const-string v2, "<this>"

    invoke-static {v15, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v15}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    const/4 v2, 0x0

    invoke-virtual {v4, v2, v15}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v13}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method public final b(Lz/x;)V
    .locals 1

    iget-object v0, p0, Lz/j;->a:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Lz/x;->j:Ljava/lang/Object;

    invoke-static {p1, v0}, Lr8/v;->B0(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1
.end method
