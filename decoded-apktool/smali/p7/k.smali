.class public final Lp7/k;
.super Lp7/a0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp7/k;->a:I

    return-void
.end method

.method public static f(Lv7/a;I)Lp7/p;
    .locals 2

    if-eqz p1, :cond_4

    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lv7/a;->g0()V

    sget-object p0, Lp7/r;->a:Lp7/r;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Lu/k1;->e(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Unexpected token: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Lp7/t;

    invoke-virtual {p0}, Lv7/a;->Q()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-direct {p1, p0}, Lp7/t;-><init>(Ljava/lang/Boolean;)V

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lp7/t;

    new-instance v0, Lr7/k;

    invoke-direct {v0, p0}, Lr7/k;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lp7/t;-><init>(Ljava/lang/Number;)V

    return-object p1

    :cond_3
    new-instance p1, Lp7/t;

    invoke-virtual {p0}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lp7/t;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_4
    const/4 p0, 0x0

    throw p0
.end method

.method public static g(Lp7/p;Lv7/b;)V
    .locals 2

    if-eqz p0, :cond_c

    instance-of v0, p0, Lp7/r;

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    instance-of v0, p0, Lp7/t;

    if-eqz v0, :cond_5

    if-eqz v0, :cond_4

    check-cast p0, Lp7/t;

    iget-object v0, p0, Lp7/t;->a:Ljava/io/Serializable;

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lp7/t;->e()Ljava/lang/Number;

    move-result-object p0

    invoke-virtual {p1, p0}, Lv7/b;->d0(Ljava/lang/Number;)V

    goto/16 :goto_4

    :cond_1
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lp7/t;->g()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p0

    :goto_0
    invoke-virtual {p1, p0}, Lv7/b;->f0(Z)V

    goto/16 :goto_4

    :cond_3
    invoke-virtual {p0}, Lp7/t;->g()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lv7/b;->e0(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a JSON Primitive: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    instance-of v0, p0, Lp7/o;

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lv7/b;->b()V

    if-eqz v0, :cond_7

    check-cast p0, Lp7/o;

    iget-object p0, p0, Lp7/o;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp7/p;

    invoke-static {v0, p1}, Lp7/k;->g(Lp7/p;Lv7/b;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lv7/b;->g()V

    goto/16 :goto_4

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a JSON Array: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    instance-of v0, p0, Lp7/s;

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Lv7/b;->e()V

    if-eqz v0, :cond_a

    check-cast p0, Lp7/s;

    iget-object p0, p0, Lp7/s;->a:Lr7/p;

    invoke-virtual {p0}, Lr7/p;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Lr7/m;

    invoke-virtual {p0}, Lr7/m;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    move-object v0, p0

    check-cast v0, Lr7/n;

    invoke-virtual {v0}, Lr7/n;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    move-object v0, p0

    check-cast v0, Lr7/l;

    invoke-virtual {v0}, Lr7/l;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lv7/b;->q(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp7/p;

    invoke-static {v0, p1}, Lp7/k;->g(Lp7/p;Lv7/b;)V

    goto :goto_2

    :cond_9
    invoke-virtual {p1}, Lv7/b;->p()V

    goto :goto_4

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a JSON Object: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Couldn\'t write "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_3
    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    :goto_4
    return-void
.end method


# virtual methods
.method public final b(Lv7/a;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p1

    const/4 v0, 0x2

    move-object/from16 v2, p0

    iget v3, v2, Lp7/k;->a:I

    const-string v4, "null"

    const-string v5, "Failed parsing \'"

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/16 v8, 0x9

    const/4 v9, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual/range {p1 .. p1}, Lv7/a;->Q()Z

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    return-object v0

    :pswitch_0
    :try_start_0
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual/range {p1 .. p1}, Lv7/a;->c0()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lp7/q;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :pswitch_1
    invoke-virtual/range {p0 .. p1}, Lp7/k;->e(Lv7/a;)Ljava/lang/Number;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual/range {p0 .. p1}, Lp7/k;->e(Lv7/a;)Ljava/lang/Number;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-virtual/range {p0 .. p1}, Lp7/k;->e(Lv7/a;)Ljava/lang/Number;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-virtual/range {p0 .. p1}, Lp7/k;->d(Lv7/a;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-virtual/range {p0 .. p1}, Lp7/k;->d(Lv7/a;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_6
    new-instance v3, Ljava/util/BitSet;

    invoke-direct {v3}, Ljava/util/BitSet;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lv7/a;->a()V

    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v4

    move v5, v6

    :goto_0
    if-eq v4, v0, :cond_5

    invoke-static {v4}, Lt/k;->e(I)I

    move-result v8

    const/4 v9, 0x5

    if-eq v8, v9, :cond_1

    const/4 v9, 0x6

    if-eq v8, v9, :cond_1

    const/4 v9, 0x7

    if-ne v8, v9, :cond_0

    invoke-virtual/range {p1 .. p1}, Lv7/a;->Q()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_0
    new-instance v0, Lp7/q;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Invalid bitset value type: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Lu/k1;->e(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; at path "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lv7/a;->c0()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    if-ne v4, v7, :cond_4

    :goto_1
    invoke-virtual {v3, v5}, Ljava/util/BitSet;->set(I)V

    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v4

    goto :goto_0

    :cond_4
    new-instance v0, Lp7/q;

    const-string v3, "Invalid bitset value "

    const-string v5, ", expected 0 or 1; at path "

    invoke-static {v3, v4, v5}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1, v7}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lv7/a;->g()V

    return-object v3

    :pswitch_7
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v3

    if-eqz v3, :cond_14

    add-int/lit8 v4, v3, -0x1

    if-eqz v4, :cond_7

    if-eq v4, v0, :cond_6

    move-object v4, v9

    goto :goto_3

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lv7/a;->b()V

    new-instance v4, Lp7/s;

    invoke-direct {v4}, Lp7/s;-><init>()V

    goto :goto_3

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lv7/a;->a()V

    new-instance v4, Lp7/o;

    invoke-direct {v4}, Lp7/o;-><init>()V

    :goto_3
    if-nez v4, :cond_8

    invoke-static {v1, v3}, Lp7/k;->f(Lv7/a;I)Lp7/p;

    move-result-object v0

    goto/16 :goto_a

    :cond_8
    new-instance v3, Ljava/util/ArrayDeque;

    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    :cond_9
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lv7/a;->M()Z

    move-result v5

    if-eqz v5, :cond_11

    instance-of v5, v4, Lp7/s;

    if-eqz v5, :cond_a

    invoke-virtual/range {p1 .. p1}, Lv7/a;->e0()Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :cond_a
    move-object v5, v9

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v8

    if-eqz v8, :cond_10

    add-int/lit8 v10, v8, -0x1

    if-eqz v10, :cond_c

    if-eq v10, v0, :cond_b

    move-object v10, v9

    goto :goto_6

    :cond_b
    invoke-virtual/range {p1 .. p1}, Lv7/a;->b()V

    new-instance v10, Lp7/s;

    invoke-direct {v10}, Lp7/s;-><init>()V

    goto :goto_6

    :cond_c
    invoke-virtual/range {p1 .. p1}, Lv7/a;->a()V

    new-instance v10, Lp7/o;

    invoke-direct {v10}, Lp7/o;-><init>()V

    :goto_6
    if-eqz v10, :cond_d

    move v11, v7

    goto :goto_7

    :cond_d
    move v11, v6

    :goto_7
    if-nez v10, :cond_e

    invoke-static {v1, v8}, Lp7/k;->f(Lv7/a;I)Lp7/p;

    move-result-object v10

    :cond_e
    instance-of v8, v4, Lp7/o;

    if-eqz v8, :cond_f

    move-object v5, v4

    check-cast v5, Lp7/o;

    iget-object v5, v5, Lp7/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_f
    move-object v8, v4

    check-cast v8, Lp7/s;

    iget-object v8, v8, Lp7/s;->a:Lr7/p;

    invoke-virtual {v8, v5, v10}, Lr7/p;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_8
    if-eqz v11, :cond_9

    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    move-object v4, v10

    goto :goto_4

    :cond_10
    throw v9

    :cond_11
    instance-of v5, v4, Lp7/o;

    if-eqz v5, :cond_12

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g()V

    goto :goto_9

    :cond_12
    invoke-virtual/range {p1 .. p1}, Lv7/a;->p()V

    :goto_9
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_13

    move-object v0, v4

    :goto_a
    return-object v0

    :cond_13
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp7/p;

    goto :goto_4

    :cond_14
    throw v9

    :pswitch_8
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_15

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_d

    :cond_15
    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/util/StringTokenizer;

    const-string v3, "_"

    invoke-direct {v1, v0, v3}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v0

    goto :goto_b

    :cond_16
    move-object v0, v9

    :goto_b
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v3

    goto :goto_c

    :cond_17
    move-object v3, v9

    :goto_c
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v9

    :cond_18
    if-nez v3, :cond_19

    if-nez v9, :cond_19

    new-instance v9, Ljava/util/Locale;

    invoke-direct {v9, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_d

    :cond_19
    if-nez v9, :cond_1a

    new-instance v9, Ljava/util/Locale;

    invoke-direct {v9, v0, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_d

    :cond_1a
    new-instance v1, Ljava/util/Locale;

    invoke-direct {v1, v0, v3, v9}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v9, v1

    :goto_d
    return-object v9

    :pswitch_9
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_1b

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto/16 :goto_f

    :cond_1b
    invoke-virtual/range {p1 .. p1}, Lv7/a;->b()V

    move v11, v6

    move v12, v11

    move v13, v12

    move v14, v13

    move v15, v14

    move/from16 v16, v15

    :cond_1c
    :goto_e
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    const/4 v3, 0x4

    if-eq v0, v3, :cond_22

    invoke-virtual/range {p1 .. p1}, Lv7/a;->e0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lv7/a;->c0()I

    move-result v3

    const-string v4, "year"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1d

    move v11, v3

    goto :goto_e

    :cond_1d
    const-string v4, "month"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1e

    move v12, v3

    goto :goto_e

    :cond_1e
    const-string v4, "dayOfMonth"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1f

    move v13, v3

    goto :goto_e

    :cond_1f
    const-string v4, "hourOfDay"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_20

    move v14, v3

    goto :goto_e

    :cond_20
    const-string v4, "minute"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_21

    move v15, v3

    goto :goto_e

    :cond_21
    const-string v4, "second"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    move/from16 v16, v3

    goto :goto_e

    :cond_22
    invoke-virtual/range {p1 .. p1}, Lv7/a;->p()V

    new-instance v9, Ljava/util/GregorianCalendar;

    move-object v10, v9

    invoke-direct/range {v10 .. v16}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    :goto_f
    return-object v9

    :pswitch_a
    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v3

    :try_start_1
    invoke-static {v3}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    move-object v4, v0

    new-instance v0, Lp7/q;

    const-string v6, "\' as Currency; at path "

    invoke-static {v5, v3, v6}, La7/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1, v7}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_b
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_23

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_10

    :cond_23
    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v3

    :try_start_2
    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v9
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_10
    return-object v9

    :catch_2
    move-exception v0

    move-object v4, v0

    new-instance v0, Lp7/q;

    const-string v6, "\' as UUID; at path "

    invoke-static {v5, v3, v6}, La7/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1, v7}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_c
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_24

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_11

    :cond_24
    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v9

    :goto_11
    return-object v9

    :pswitch_d
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_25

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_12

    :cond_25
    :try_start_3
    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_12

    :cond_26
    new-instance v9, Ljava/net/URI;

    invoke-direct {v9, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/net/URISyntaxException; {:try_start_3 .. :try_end_3} :catch_3

    :goto_12
    return-object v9

    :catch_3
    move-exception v0

    new-instance v1, Lp7/q;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :pswitch_e
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_27

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_13

    :cond_27
    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_28

    goto :goto_13

    :cond_28
    new-instance v9, Ljava/net/URL;

    invoke-direct {v9, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    :goto_13
    return-object v9

    :pswitch_f
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_29

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_14

    :cond_29
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    :goto_14
    return-object v9

    :pswitch_10
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_11
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_2a

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_15

    :cond_2a
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_15
    return-object v9

    :pswitch_12
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_2b

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_16

    :cond_2b
    new-instance v9, Lr7/k;

    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Lr7/k;-><init>(Ljava/lang/String;)V

    :goto_16
    return-object v9

    :pswitch_13
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_2c

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_17

    :cond_2c
    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v3

    :try_start_4
    new-instance v9, Ljava/math/BigInteger;

    invoke-direct {v9, v3}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    :goto_17
    return-object v9

    :catch_4
    move-exception v0

    new-instance v4, Lp7/q;

    const-string v6, "\' as BigInteger; at path "

    invoke-static {v5, v3, v6}, La7/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1, v7}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :pswitch_14
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_2d

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_18

    :cond_2d
    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v3

    :try_start_5
    new-instance v9, Ljava/math/BigDecimal;

    invoke-direct {v9, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    :goto_18
    return-object v9

    :catch_5
    move-exception v0

    new-instance v4, Lp7/q;

    const-string v6, "\' as BigDecimal; at path "

    invoke-static {v5, v3, v6}, La7/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1, v7}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :pswitch_15
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_2e

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_19

    :cond_2e
    const/16 v3, 0x8

    if-ne v0, v3, :cond_2f

    invoke-virtual/range {p1 .. p1}, Lv7/a;->Q()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v9

    goto :goto_19

    :cond_2f
    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v9

    :goto_19
    return-object v9

    :pswitch_16
    invoke-virtual/range {p1 .. p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v8, :cond_30

    invoke-virtual/range {p1 .. p1}, Lv7/a;->g0()V

    goto :goto_1a

    :cond_30
    invoke-virtual/range {p1 .. p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v7, :cond_31

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v9

    :goto_1a
    return-object v9

    :cond_31
    new-instance v3, Lp7/q;

    const-string v4, "Expecting character, got: "

    const-string v5, "; at "

    invoke-static {v4, v0, v5}, La7/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1, v7}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    :pswitch_17
    invoke-virtual/range {p0 .. p1}, Lp7/k;->e(Lv7/a;)Ljava/lang/Number;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-virtual/range {p0 .. p1}, Lp7/k;->e(Lv7/a;)Ljava/lang/Number;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-virtual/range {p0 .. p1}, Lp7/k;->e(Lv7/a;)Ljava/lang/Number;

    move-result-object v0

    return-object v0

    :pswitch_1a
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lv7/a;->a()V

    :goto_1b
    invoke-virtual/range {p1 .. p1}, Lv7/a;->M()Z

    move-result v3

    if-eqz v3, :cond_32

    :try_start_6
    invoke-virtual/range {p1 .. p1}, Lv7/a;->c0()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_1b

    :catch_6
    move-exception v0

    new-instance v1, Lp7/q;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_32
    invoke-virtual/range {p1 .. p1}, Lv7/a;->g()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-instance v3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-direct {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>(I)V

    :goto_1c
    if-ge v6, v1, :cond_33

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3, v6, v4}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1c

    :cond_33
    return-object v3

    :pswitch_1b
    invoke-virtual/range {p0 .. p1}, Lp7/k;->e(Lv7/a;)Ljava/lang/Number;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final c(Lv7/b;Ljava/lang/Object;)V
    .locals 5

    const-string v0, "null"

    iget v1, p0, Lp7/k;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    invoke-virtual {p1, p2}, Lv7/b;->f0(Z)V

    return-void

    :pswitch_0
    check-cast p2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    return-void

    :pswitch_1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lp7/k;->h(Lv7/b;Ljava/lang/Number;)V

    return-void

    :pswitch_2
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lp7/k;->h(Lv7/b;Ljava/lang/Number;)V

    return-void

    :pswitch_3
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lp7/k;->h(Lv7/b;Ljava/lang/Number;)V

    return-void

    :pswitch_4
    check-cast p2, Ljava/lang/Boolean;

    packed-switch v1, :pswitch_data_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lv7/b;->e0(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_5
    invoke-virtual {p1, p2}, Lv7/b;->c0(Ljava/lang/Boolean;)V

    :goto_1
    return-void

    :pswitch_6
    check-cast p2, Ljava/lang/Boolean;

    packed-switch v1, :pswitch_data_2

    if-nez p2, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Lv7/b;->e0(Ljava/lang/String;)V

    goto :goto_3

    :pswitch_7
    invoke-virtual {p1, p2}, Lv7/b;->c0(Ljava/lang/Boolean;)V

    :goto_3
    return-void

    :pswitch_8
    check-cast p2, Ljava/util/BitSet;

    invoke-virtual {p1}, Lv7/b;->b()V

    invoke-virtual {p2}, Ljava/util/BitSet;->length()I

    move-result v0

    :goto_4
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    int-to-long v3, v1

    invoke-virtual {p1, v3, v4}, Lv7/b;->T(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_2
    invoke-virtual {p1}, Lv7/b;->g()V

    return-void

    :pswitch_9
    check-cast p2, Lp7/p;

    invoke-static {p2, p1}, Lp7/k;->g(Lp7/p;Lv7/b;)V

    return-void

    :pswitch_a
    check-cast p2, Ljava/util/Locale;

    if-nez p2, :cond_3

    goto :goto_5

    :cond_3
    invoke-virtual {p2}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_5
    invoke-virtual {p1, v3}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_b
    check-cast p2, Ljava/util/Calendar;

    if-nez p2, :cond_4

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_6

    :cond_4
    invoke-virtual {p1}, Lv7/b;->e()V

    const-string v0, "year"

    invoke-virtual {p1, v0}, Lv7/b;->q(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    const-string v0, "month"

    invoke-virtual {p1, v0}, Lv7/b;->q(Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    const-string v0, "dayOfMonth"

    invoke-virtual {p1, v0}, Lv7/b;->q(Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    const-string v0, "hourOfDay"

    invoke-virtual {p1, v0}, Lv7/b;->q(Ljava/lang/String;)V

    const/16 v0, 0xb

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    const-string v0, "minute"

    invoke-virtual {p1, v0}, Lv7/b;->q(Ljava/lang/String;)V

    const/16 v0, 0xc

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    const-string v0, "second"

    invoke-virtual {p1, v0}, Lv7/b;->q(Ljava/lang/String;)V

    const/16 v0, 0xd

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    invoke-virtual {p1}, Lv7/b;->p()V

    :goto_6
    return-void

    :pswitch_c
    check-cast p2, Ljava/util/Currency;

    invoke-virtual {p2}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_d
    check-cast p2, Ljava/util/UUID;

    if-nez p2, :cond_5

    goto :goto_7

    :cond_5
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_7
    invoke-virtual {p1, v3}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_e
    check-cast p2, Ljava/net/InetAddress;

    if-nez p2, :cond_6

    goto :goto_8

    :cond_6
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    :goto_8
    invoke-virtual {p1, v3}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_f
    check-cast p2, Ljava/net/URI;

    if-nez p2, :cond_7

    goto :goto_9

    :cond_7
    invoke-virtual {p2}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    move-result-object v3

    :goto_9
    invoke-virtual {p1, v3}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_10
    check-cast p2, Ljava/net/URL;

    if-nez p2, :cond_8

    goto :goto_a

    :cond_8
    invoke-virtual {p2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    :goto_a
    invoke-virtual {p1, v3}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_11
    check-cast p2, Ljava/lang/StringBuffer;

    if-nez p2, :cond_9

    goto :goto_b

    :cond_9
    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_b
    invoke-virtual {p1, v3}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_12
    check-cast p2, Ljava/lang/Class;

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attempted to serialize java.lang.Class: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ". Forgot to register a type adapter?"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_13
    check-cast p2, Ljava/lang/StringBuilder;

    if-nez p2, :cond_a

    goto :goto_c

    :cond_a
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_c
    invoke-virtual {p1, v3}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_14
    check-cast p2, Lr7/k;

    invoke-virtual {p1, p2}, Lv7/b;->d0(Ljava/lang/Number;)V

    return-void

    :pswitch_15
    check-cast p2, Ljava/math/BigInteger;

    invoke-virtual {p1, p2}, Lv7/b;->d0(Ljava/lang/Number;)V

    return-void

    :pswitch_16
    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p1, p2}, Lv7/b;->d0(Ljava/lang/Number;)V

    return-void

    :pswitch_17
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_18
    check-cast p2, Ljava/lang/Character;

    if-nez p2, :cond_b

    goto :goto_d

    :cond_b
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_d
    invoke-virtual {p1, v3}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_19
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lp7/k;->h(Lv7/b;Ljava/lang/Number;)V

    return-void

    :pswitch_1a
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lp7/k;->h(Lv7/b;Ljava/lang/Number;)V

    return-void

    :pswitch_1b
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lp7/k;->h(Lv7/b;Ljava/lang/Number;)V

    return-void

    :pswitch_1c
    check-cast p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {p1}, Lv7/b;->b()V

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result v0

    :goto_e
    if-ge v2, v0, :cond_c

    invoke-virtual {p2, v2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v1

    int-to-long v3, v1

    invoke-virtual {p1, v3, v4}, Lv7/b;->T(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_c
    invoke-virtual {p1}, Lv7/b;->g()V

    return-void

    :pswitch_1d
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lp7/k;->h(Lv7/b;Ljava/lang/Number;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x16
        :pswitch_5
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x16
        :pswitch_7
    .end packed-switch
.end method

.method public final d(Lv7/a;)Ljava/lang/Boolean;
    .locals 3

    iget v0, p0, Lp7/k;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x9

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    :goto_0
    return-object v1

    :pswitch_0
    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_1

    :cond_1
    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lv7/a;->Q()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lv7/a;)Ljava/lang/Number;
    .locals 5

    iget v0, p0, Lp7/k;->a:I

    const/4 v1, 0x1

    const-string v2, "Lossy conversion from "

    const/4 v3, 0x0

    const/16 v4, 0x9

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v4, :cond_0

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lv7/a;->c0()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v3

    :catch_0
    move-exception p1

    new-instance v0, Lp7/q;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :sswitch_0
    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v4, :cond_1

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_1

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lv7/a;->c0()I

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    const v3, 0xffff

    if-gt v0, v3, :cond_2

    const/16 v3, -0x8000

    if-lt v0, v3, :cond_2

    int-to-short p1, v0

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    :goto_1
    return-object v3

    :cond_2
    new-instance v3, Lp7/q;

    const-string v4, " to short; at path "

    invoke-static {v2, v0, v4}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1, v1}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    :catch_1
    move-exception p1

    new-instance v0, Lp7/q;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :sswitch_1
    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v4, :cond_3

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_2

    :cond_3
    :try_start_2
    invoke-virtual {p1}, Lv7/a;->c0()I

    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    const/16 v3, 0xff

    if-gt v0, v3, :cond_4

    const/16 v3, -0x80

    if-lt v0, v3, :cond_4

    int-to-byte p1, v0

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    :goto_2
    return-object v3

    :cond_4
    new-instance v3, Lp7/q;

    const-string v4, " to byte; at path "

    invoke-static {v2, v0, v4}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1, v1}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    :catch_2
    move-exception p1

    new-instance v0, Lp7/q;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :sswitch_2
    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v4, :cond_5

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lv7/a;->T()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    :goto_3
    return-object v3

    :sswitch_3
    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v4, :cond_6

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lv7/a;->T()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    :goto_4
    return-object v3

    :sswitch_4
    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v4, :cond_7

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_5

    :cond_7
    :try_start_3
    invoke-virtual {p1}, Lv7/a;->d0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    :goto_5
    return-object v3

    :catch_3
    move-exception p1

    new-instance v0, Lp7/q;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :sswitch_5
    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v4, :cond_8

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_6

    :cond_8
    invoke-virtual {p1}, Lv7/a;->d0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_6
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_5
        0x2 -> :sswitch_4
        0x3 -> :sswitch_3
        0x4 -> :sswitch_2
        0x18 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public final h(Lv7/b;Ljava/lang/Number;)V
    .locals 2

    iget v0, p0, Lp7/k;->a:I

    sparse-switch v0, :sswitch_data_0

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    :goto_0
    return-void

    :sswitch_0
    if-nez p2, :cond_1

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Number;->shortValue()S

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    :goto_1
    return-void

    :sswitch_1
    if-nez p2, :cond_2

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Number;->byteValue()B

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    :goto_2
    return-void

    :sswitch_2
    if-nez p2, :cond_3

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lv7/b;->Q(D)V

    :goto_3
    return-void

    :sswitch_3
    if-nez p2, :cond_4

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_5

    :cond_4
    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    :goto_4
    invoke-virtual {p1, p2}, Lv7/b;->d0(Ljava/lang/Number;)V

    :goto_5
    return-void

    :sswitch_4
    if-nez p2, :cond_6

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lv7/b;->T(J)V

    :goto_6
    return-void

    :sswitch_5
    if-nez p2, :cond_7

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lv7/b;->e0(Ljava/lang/String;)V

    :goto_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_5
        0x2 -> :sswitch_4
        0x3 -> :sswitch_3
        0x4 -> :sswitch_2
        0x18 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method
