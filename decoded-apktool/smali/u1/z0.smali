.class public final Lu1/z0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lu1/z0;->a:I

    iput-object p1, p0, Lu1/z0;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 30

    move-object/from16 v1, p0

    iget v0, v1, Lu1/z0;->a:I

    iget-object v2, v1, Lu1/z0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lka/f;

    iget-object v0, v2, Lka/f;->b:Ljava/lang/ClassLoader;

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v3

    const-string v4, "getResources(...)"

    invoke-static {v3, v4}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v3

    const-string v5, "list(this)"

    invoke-static {v3, v5}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    iget-object v8, v2, Lka/f;->c:Lja/m;

    if-eqz v7, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/net/URL;

    invoke-static {v7}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v10

    const-string v11, "file"

    invoke-static {v10, v11}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1

    const/4 v9, 0x0

    goto :goto_1

    :cond_1
    sget-object v9, Lja/x;->b:Ljava/lang/String;

    new-instance v9, Ljava/io/File;

    invoke-virtual {v7}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v7

    invoke-direct {v9, v7}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    invoke-static {v9}, Lfa/l;->j(Ljava/io/File;)Lja/x;

    move-result-object v7

    new-instance v9, Lq8/f;

    invoke-direct {v9, v8, v7}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    if-eqz v9, :cond_0

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-string v2, "META-INF/MANIFEST.MF"

    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v0

    invoke-static {v0, v4}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0, v5}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/net/URL;

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const-string v5, "jar:file:"

    invoke-static {v3, v5, v4}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_4

    :goto_3
    const/4 v7, 0x0

    const/4 v9, 0x0

    goto/16 :goto_c

    :cond_4
    const-string v4, "!"

    const/4 v5, 0x6

    invoke-static {v3, v4, v5}, Ll9/i;->T0(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_5

    goto :goto_3

    :cond_5
    sget-object v5, Lja/x;->b:Ljava/lang/String;

    new-instance v5, Ljava/io/File;

    const/4 v7, 0x4

    invoke-virtual {v3, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v3, v4}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    invoke-static {v5}, Lfa/l;->j(Ljava/io/File;)Lja/x;

    move-result-object v3

    const-string v4, "not a zip: size="

    const-string v5, "fileSystem"

    invoke-static {v8, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Lja/m;->j(Lja/x;)Lja/s;

    move-result-object v5

    :try_start_0
    invoke-virtual {v5}, Lja/s;->b()J

    move-result-wide v10

    const/16 v7, 0x16

    int-to-long v12, v7

    sub-long/2addr v10, v12

    const-wide/16 v12, 0x0

    cmp-long v7, v10, v12

    if-ltz v7, :cond_11

    const-wide/32 v14, 0x10000

    sub-long v14, v10, v14

    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    :goto_4
    invoke-virtual {v5, v10, v11}, Lja/s;->e(J)Lja/k;

    move-result-object v4

    invoke-static {v4}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    invoke-virtual {v4}, Lja/a0;->y()I

    move-result v7

    const v9, 0x6054b50

    if-ne v7, v9, :cond_f

    invoke-virtual {v4}, Lja/a0;->b()S

    move-result v7

    const v9, 0xffff

    and-int/2addr v7, v9

    invoke-virtual {v4}, Lja/a0;->b()S

    move-result v14

    and-int/2addr v14, v9

    invoke-virtual {v4}, Lja/a0;->b()S

    move-result v15

    and-int/2addr v15, v9

    int-to-long v12, v15

    invoke-virtual {v4}, Lja/a0;->b()S

    move-result v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    and-int/2addr v15, v9

    move-wide/from16 v22, v10

    int-to-long v9, v15

    cmp-long v9, v12, v9

    const-string v10, "unsupported zip: spanned"

    if-nez v9, :cond_e

    if-nez v7, :cond_e

    if-nez v14, :cond_e

    const-wide/16 v14, 0x4

    :try_start_2
    invoke-virtual {v4, v14, v15}, Lja/a0;->l(J)V

    invoke-virtual {v4}, Lja/a0;->y()I

    move-result v7

    int-to-long v14, v7

    const-wide v16, 0xffffffffL

    and-long v19, v14, v16

    invoke-virtual {v4}, Lja/a0;->b()S

    move-result v7

    const v9, 0xffff

    and-int/2addr v7, v9

    new-instance v9, Lka/d;

    move-object/from16 v16, v9

    move-wide/from16 v17, v12

    move/from16 v21, v7

    invoke-direct/range {v16 .. v21}, Lka/d;-><init>(JJI)V

    int-to-long v11, v7

    invoke-virtual {v4, v11, v12}, Lja/a0;->e(J)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    :try_start_3
    invoke-virtual {v4}, Lja/a0;->close()V

    const/16 v4, 0x14

    int-to-long v11, v4

    sub-long v11, v22, v11

    const-wide/16 v16, 0x0

    cmp-long v4, v11, v16

    if-lez v4, :cond_a

    invoke-virtual {v5, v11, v12}, Lja/s;->e(J)Lja/k;

    move-result-object v4

    invoke-static {v4}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-virtual {v4}, Lja/a0;->y()I

    move-result v11

    const v12, 0x7064b50

    if-ne v11, v12, :cond_6

    invoke-virtual {v4}, Lja/a0;->y()I

    move-result v9

    invoke-virtual {v4}, Lja/a0;->J()J

    move-result-wide v11

    invoke-virtual {v4}, Lja/a0;->y()I

    move-result v13

    const/4 v14, 0x1

    if-ne v13, v14, :cond_9

    if-nez v9, :cond_9

    invoke-virtual {v5, v11, v12}, Lja/s;->e(J)Lja/k;

    move-result-object v9

    invoke-static {v9}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v9}, Lja/a0;->y()I

    move-result v11

    const v12, 0x6064b50

    if-ne v11, v12, :cond_8

    const-wide/16 v11, 0xc

    invoke-virtual {v9, v11, v12}, Lja/a0;->l(J)V

    invoke-virtual {v9}, Lja/a0;->y()I

    move-result v11

    invoke-virtual {v9}, Lja/a0;->y()I

    move-result v12

    invoke-virtual {v9}, Lja/a0;->J()J

    move-result-wide v25

    invoke-virtual {v9}, Lja/a0;->J()J

    move-result-wide v13

    cmp-long v13, v25, v13

    if-nez v13, :cond_7

    if-nez v11, :cond_7

    if-nez v12, :cond_7

    const-wide/16 v10, 0x8

    invoke-virtual {v9, v10, v11}, Lja/a0;->l(J)V

    invoke-virtual {v9}, Lja/a0;->J()J

    move-result-wide v27

    new-instance v10, Lka/d;

    move-object/from16 v24, v10

    move/from16 v29, v7

    invoke-direct/range {v24 .. v29}, Lka/d;-><init>(JJI)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    const/4 v7, 0x0

    :try_start_6
    invoke-static {v9, v7}, Lh6/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object v9, v10

    :cond_6
    const/4 v7, 0x0

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_8

    :cond_7
    :try_start_7
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    move-object v2, v0

    goto :goto_6

    :cond_8
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bad zip: expected "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12}, Lr9/a;->f(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " but was "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Lr9/a;->f(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_5

    :goto_6
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    move-object v3, v0

    :try_start_9
    invoke-static {v9, v2}, Lh6/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    :cond_9
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_7
    :try_start_a
    invoke-static {v4, v7}, Lh6/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_9

    :catchall_3
    move-exception v0

    move-object v2, v0

    goto/16 :goto_f

    :goto_8
    :try_start_b
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception v0

    move-object v3, v0

    :try_start_c
    invoke-static {v4, v2}, Lh6/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    :cond_a
    :goto_9
    iget-wide v10, v9, Lka/d;->b:J

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5, v10, v11}, Lja/s;->e(J)Lja/k;

    move-result-object v7

    invoke-static {v7}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v7
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    iget-wide v12, v9, Lka/d;->a:J

    :goto_a
    cmp-long v9, v16, v12

    if-gez v9, :cond_d

    invoke-static {v7}, Lr9/a;->h(Lja/a0;)Lka/g;

    move-result-object v9

    iget-wide v14, v9, Lka/g;->g:J

    cmp-long v14, v14, v10

    if-gez v14, :cond_c

    sget-object v14, Lka/f;->e:Lja/x;

    iget-object v14, v9, Lka/g;->a:Lja/x;

    invoke-static {v14}, Lfa/l;->b(Lja/x;)Z

    move-result v14

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :catchall_5
    move-exception v0

    move-object v2, v0

    goto :goto_d

    :cond_b
    :goto_b
    const-wide/16 v14, 0x1

    add-long v16, v16, v14

    goto :goto_a

    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v2, "bad zip: local file header offset >= central directory offset"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :cond_d
    const/4 v9, 0x0

    :try_start_e
    invoke-static {v7, v9}, Lh6/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v4}, Lr9/a;->d(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;

    move-result-object v4

    new-instance v7, Lja/j0;

    invoke-direct {v7, v3, v8, v4}, Lja/j0;-><init>(Lja/x;Lja/m;Ljava/util/LinkedHashMap;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    invoke-static {v5, v9}, Lh6/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    new-instance v3, Lq8/f;

    sget-object v4, Lka/f;->e:Lja/x;

    invoke-direct {v3, v7, v4}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v7, v3

    :goto_c
    if-eqz v7, :cond_3

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :goto_d
    :try_start_f
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    :catchall_6
    move-exception v0

    move-object v3, v0

    :try_start_10
    invoke-static {v7, v2}, Lh6/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    :catchall_7
    move-exception v0

    goto :goto_e

    :cond_e
    :try_start_11
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :cond_f
    move-wide/from16 v22, v10

    move-wide/from16 v16, v12

    const/4 v9, 0x0

    :try_start_12
    invoke-virtual {v4}, Lja/a0;->close()V

    const-wide/16 v10, -0x1

    add-long v10, v22, v10

    cmp-long v4, v10, v14

    if-ltz v4, :cond_10

    move-wide/from16 v12, v16

    goto/16 :goto_4

    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v2, "not a zip: end of central directory signature not found"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_e
    invoke-virtual {v4}, Lja/a0;->close()V

    throw v0

    :cond_11
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Lja/s;->b()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    :goto_f
    :try_start_13
    throw v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    :catchall_8
    move-exception v0

    move-object v3, v0

    invoke-static {v5, v2}, Lh6/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    :cond_12
    invoke-static {v2, v6}, Lr8/p;->P0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v2, Lba/k;

    iget-object v0, v2, Lba/k;->e:Lx9/o;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lx9/o;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0}, Lf9/a;->y0(Ljava/lang/Iterable;)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/Certificate;

    const-string v4, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {v3, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_13
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v2, v1, Lu1/z0;->a:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    iget-object v7, v1, Lu1/z0;->b:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    .line 12
    invoke-virtual/range {p0 .. p0}, Lu1/z0;->a()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 13
    :pswitch_0
    invoke-virtual/range {p0 .. p0}, Lu1/z0;->a()Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_1
    return-object v7

    .line 14
    :pswitch_2
    new-instance v0, Lh/b;

    check-cast v7, Lh5/a;

    invoke-direct {v0, v7, v5}, Lh/b;-><init>(Ljava/lang/Object;I)V

    return-object v0

    .line 15
    :pswitch_3
    invoke-virtual/range {p0 .. p0}, Lu1/z0;->invoke()V

    return-object v0

    :pswitch_4
    check-cast v7, Lm0/d1;

    check-cast v7, Lm0/s2;

    .line 16
    invoke-virtual {v7}, Lm0/s2;->d()F

    move-result v0

    .line 17
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    .line 18
    :pswitch_5
    invoke-virtual/range {p0 .. p0}, Lu1/z0;->invoke()V

    return-object v0

    :pswitch_6
    check-cast v7, Lk4/e;

    .line 19
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 20
    new-instance v2, Lk4/b;

    .line 21
    iget-object v8, v7, Lk4/e;->a:Lk4/o;

    .line 22
    invoke-virtual {v8}, Lk4/o;->b()Lja/i;

    move-result-object v9

    .line 23
    invoke-direct {v2, v9}, Lja/o;-><init>(Lja/g0;)V

    .line 24
    invoke-static {v2}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v9

    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 25
    new-instance v10, Lja/y;

    invoke-direct {v10, v9}, Lja/y;-><init>(Lja/i;)V

    invoke-static {v10}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v10

    .line 26
    new-instance v11, Lja/f;

    invoke-direct {v11, v10, v4}, Lja/f;-><init>(Lja/i;I)V

    .line 27
    invoke-static {v11, v3, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget-object v10, v2, Lk4/b;->b:Ljava/lang/Exception;

    if-nez v10, :cond_2c

    iput-boolean v6, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 28
    sget-object v10, Lk4/l;->a:Landroid/graphics/Paint;

    iget-object v10, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 29
    sget-object v11, Lk4/m;->a:Ljava/util/LinkedHashSet;

    .line 30
    iget-object v11, v7, Lk4/e;->d:Lk4/k;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    const/16 v12, 0x10e

    const/16 v13, 0x5a

    if-eqz v11, :cond_5

    if-eq v11, v4, :cond_1

    if-ne v11, v5, :cond_0

    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, Landroidx/fragment/app/a0;

    .line 32
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 33
    throw v0

    :cond_1
    if-eqz v10, :cond_5

    .line 34
    sget-object v11, Lk4/m;->a:Ljava/util/LinkedHashSet;

    invoke-interface {v11, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 35
    :goto_0
    new-instance v10, Ll3/g;

    new-instance v11, Lk4/j;

    .line 36
    new-instance v14, Lja/y;

    invoke-direct {v14, v9}, Lja/y;-><init>(Lja/i;)V

    invoke-static {v14}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v14

    .line 37
    new-instance v15, Lja/f;

    invoke-direct {v15, v14, v4}, Lja/f;-><init>(Lja/i;I)V

    .line 38
    invoke-direct {v11, v15}, Lk4/j;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v10, v11}, Ll3/g;-><init>(Lk4/j;)V

    .line 39
    new-instance v11, Lk4/i;

    const-string v14, "Orientation"

    .line 40
    invoke-virtual {v10, v14}, Ll3/g;->c(Ljava/lang/String;)Ll3/c;

    move-result-object v15

    if-nez v15, :cond_2

    :catch_0
    move v3, v4

    goto :goto_1

    :cond_2
    :try_start_0
    iget-object v3, v10, Ll3/g;->f:Ljava/nio/ByteOrder;

    .line 41
    invoke-virtual {v15, v3}, Ll3/c;->e(Ljava/nio/ByteOrder;)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    if-eq v3, v5, :cond_3

    const/4 v5, 0x7

    if-eq v3, v5, :cond_3

    const/4 v5, 0x4

    if-eq v3, v5, :cond_3

    const/4 v5, 0x5

    if-eq v3, v5, :cond_3

    move v3, v6

    goto :goto_2

    :cond_3
    move v3, v4

    .line 42
    :goto_2
    invoke-virtual {v10, v14}, Ll3/g;->c(Ljava/lang/String;)Ll3/c;

    move-result-object v5

    if-nez v5, :cond_4

    :catch_1
    move v5, v4

    goto :goto_3

    :cond_4
    :try_start_1
    iget-object v10, v10, Ll3/g;->f:Ljava/nio/ByteOrder;

    .line 43
    invoke-virtual {v5, v10}, Ll3/c;->e(Ljava/nio/ByteOrder;)I

    move-result v5
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    packed-switch v5, :pswitch_data_1

    move v5, v6

    goto :goto_4

    :pswitch_7
    move v5, v13

    goto :goto_4

    :pswitch_8
    move v5, v12

    goto :goto_4

    :pswitch_9
    const/16 v5, 0xb4

    .line 44
    :goto_4
    invoke-direct {v11, v5, v3}, Lk4/i;-><init>(IZ)V

    goto :goto_5

    :cond_5
    sget-object v11, Lk4/i;->c:Lk4/i;

    :goto_5
    iget-object v3, v2, Lk4/b;->b:Ljava/lang/Exception;

    if-nez v3, :cond_2b

    iput-boolean v6, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 45
    iget-object v3, v7, Lk4/e;->b:Ls4/n;

    iget-object v5, v3, Ls4/n;->c:Landroid/graphics/ColorSpace;

    if-eqz v5, :cond_6

    iput-object v5, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    .line 46
    :cond_6
    iget-boolean v5, v3, Ls4/n;->h:Z

    iput-boolean v5, v0, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 47
    iget v5, v11, Lk4/i;->b:I

    iget-object v7, v3, Ls4/n;->b:Landroid/graphics/Bitmap$Config;

    iget-boolean v10, v11, Lk4/i;->a:Z

    if-nez v10, :cond_7

    if-lez v5, :cond_9

    :cond_7
    if-eqz v7, :cond_8

    .line 48
    sget-object v11, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v7, v11, :cond_9

    .line 49
    :cond_8
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 50
    :cond_9
    iget-boolean v11, v3, Ls4/n;->g:Z

    if-eqz v11, :cond_a

    sget-object v11, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-ne v7, v11, :cond_a

    iget-object v11, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const-string v14, "image/jpeg"

    invoke-static {v11, v14}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 51
    sget-object v7, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :cond_a
    iget-object v11, v0, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    .line 52
    sget-object v14, Landroid/graphics/Bitmap$Config;->RGBA_F16:Landroid/graphics/Bitmap$Config;

    if-ne v11, v14, :cond_b

    sget-object v11, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-eq v7, v11, :cond_b

    move-object v7, v14

    :cond_b
    iput-object v7, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 53
    invoke-virtual {v8}, Lk4/o;->a()Lo7/d0;

    move-result-object v7

    .line 54
    instance-of v8, v7, Lk4/q;

    iget-object v11, v3, Ls4/n;->a:Landroid/content/Context;

    iget-object v14, v3, Ls4/n;->d:Lt4/f;

    if-eqz v8, :cond_c

    .line 55
    sget-object v8, Lt4/f;->c:Lt4/f;

    invoke-static {v14, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 56
    check-cast v7, Lk4/q;

    .line 57
    iget v3, v7, Lk4/q;->x:I

    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 58
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    move v3, v4

    move v1, v5

    move v13, v10

    move-object/from16 v18, v11

    goto/16 :goto_10

    :cond_c
    iget v7, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v7, :cond_1d

    iget v8, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-gtz v8, :cond_d

    move v3, v4

    move v1, v5

    move v13, v10

    move-object/from16 v18, v11

    goto/16 :goto_f

    :cond_d
    if-eq v5, v13, :cond_f

    if-ne v5, v12, :cond_e

    goto :goto_6

    :cond_e
    move v15, v7

    goto :goto_7

    :cond_f
    :goto_6
    move v15, v8

    :goto_7
    if-eq v5, v13, :cond_11

    if-ne v5, v12, :cond_10

    goto :goto_8

    :cond_10
    move v7, v8

    .line 59
    :cond_11
    :goto_8
    sget-object v8, Lt4/f;->c:Lt4/f;

    invoke-static {v14, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    .line 60
    iget-object v12, v3, Ls4/n;->e:Lt4/e;

    if-eqz v16, :cond_12

    move v13, v15

    goto :goto_9

    .line 61
    :cond_12
    iget-object v13, v14, Lt4/f;->a:Lf6/a;

    .line 62
    invoke-static {v13, v12}, Lw4/e;->e(Lf6/a;Lt4/e;)I

    move-result v13

    .line 63
    :goto_9
    invoke-static {v14, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    move v8, v7

    goto :goto_a

    .line 64
    :cond_13
    iget-object v8, v14, Lt4/f;->b:Lf6/a;

    .line 65
    invoke-static {v8, v12}, Lw4/e;->e(Lf6/a;Lt4/e;)I

    move-result v8

    .line 66
    :goto_a
    div-int v14, v15, v13

    invoke-static {v14}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v14

    .line 67
    div-int v17, v7, v8

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v6

    .line 68
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eqz v4, :cond_15

    const/4 v1, 0x1

    if-ne v4, v1, :cond_14

    .line 69
    invoke-static {v14, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_b

    :cond_14
    new-instance v0, Landroidx/fragment/app/a0;

    .line 70
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 71
    throw v0

    :cond_15
    const/4 v1, 0x1

    .line 72
    invoke-static {v14, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    :goto_b
    if-ge v4, v1, :cond_16

    const/4 v4, 0x1

    :cond_16
    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    int-to-double v14, v15

    move v1, v5

    int-to-double v4, v4

    div-double/2addr v14, v4

    int-to-double v6, v7

    div-double/2addr v6, v4

    int-to-double v4, v13

    move v13, v10

    move-object/from16 v18, v11

    int-to-double v10, v8

    div-double/2addr v4, v14

    div-double/2addr v10, v6

    .line 73
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_18

    const/4 v7, 0x1

    if-ne v6, v7, :cond_17

    .line 74
    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    goto :goto_c

    :cond_17
    new-instance v0, Landroidx/fragment/app/a0;

    .line 75
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 76
    throw v0

    .line 77
    :cond_18
    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->max(DD)D

    move-result-wide v4

    .line 78
    :goto_c
    iget-boolean v3, v3, Ls4/n;->f:Z

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    if-eqz v3, :cond_19

    cmpl-double v3, v4, v6

    if-lez v3, :cond_19

    move-wide v4, v6

    :cond_19
    cmpg-double v3, v4, v6

    if-nez v3, :cond_1a

    const/4 v3, 0x1

    const/16 v17, 0x1

    goto :goto_d

    :cond_1a
    const/4 v3, 0x1

    const/16 v17, 0x0

    :goto_d
    xor-int/lit8 v8, v17, 0x1

    iput-boolean v8, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    if-eqz v8, :cond_1c

    cmpl-double v3, v4, v6

    const v6, 0x7fffffff

    if-lez v3, :cond_1b

    int-to-double v7, v6

    div-double/2addr v7, v4

    .line 79
    invoke-static {v7, v8}, Ld7/t;->o0(D)I

    move-result v3

    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    iput v6, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    goto :goto_e

    :cond_1b
    iput v6, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    int-to-double v6, v6

    mul-double/2addr v6, v4

    .line 80
    invoke-static {v6, v7}, Ld7/t;->o0(D)I

    move-result v3

    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    :cond_1c
    :goto_e
    const/4 v3, 0x1

    goto :goto_10

    :cond_1d
    move v1, v5

    move v13, v10

    move-object/from16 v18, v11

    move v3, v4

    :goto_f
    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v4, 0x0

    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 81
    :goto_10
    :try_start_2
    new-instance v4, Lja/f;

    invoke-direct {v4, v9, v3}, Lja/f;-><init>(Lja/i;I)V

    const/4 v3, 0x0

    .line 82
    invoke-static {v4, v3, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    invoke-static {v9, v3}, Lh6/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object v2, v2, Lk4/b;->b:Ljava/lang/Exception;

    if-nez v2, :cond_2a

    if-eqz v4, :cond_29

    .line 84
    invoke-virtual/range {v18 .. v18}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v4, v2}, Landroid/graphics/Bitmap;->setDensity(I)V

    if-nez v13, :cond_1e

    if-lez v1, :cond_26

    .line 85
    :cond_1e
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 86
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v3, v5

    .line 87
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v5

    if-eqz v13, :cond_1f

    const/high16 v5, -0x40800000    # -1.0f

    const/high16 v7, 0x3f800000    # 1.0f

    .line 88
    invoke-virtual {v2, v5, v7, v3, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    :cond_1f
    if-lez v1, :cond_20

    int-to-float v5, v1

    .line 89
    invoke-virtual {v2, v5, v3, v6}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 90
    :cond_20
    new-instance v3, Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    const/4 v7, 0x0

    invoke-direct {v3, v7, v7, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 91
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v5, v3, Landroid/graphics/RectF;->left:F

    cmpg-float v6, v5, v7

    if-nez v6, :cond_21

    iget v6, v3, Landroid/graphics/RectF;->top:F

    cmpg-float v6, v6, v7

    if-nez v6, :cond_21

    :goto_11
    const/16 v3, 0x5a

    goto :goto_12

    :cond_21
    neg-float v5, v5

    iget v3, v3, Landroid/graphics/RectF;->top:F

    neg-float v3, v3

    .line 92
    invoke-virtual {v2, v5, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_11

    :goto_12
    if-eq v1, v3, :cond_24

    const/16 v3, 0x10e

    if-ne v1, v3, :cond_22

    goto :goto_13

    .line 93
    :cond_22
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 94
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v5

    if-nez v5, :cond_23

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 95
    :cond_23
    invoke-static {v1, v3, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_14

    .line 96
    :cond_24
    :goto_13
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 97
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v5

    if-nez v5, :cond_25

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 98
    :cond_25
    invoke-static {v1, v3, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 99
    :goto_14
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 100
    sget-object v5, Lk4/l;->a:Landroid/graphics/Paint;

    invoke-virtual {v3, v4, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 101
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    move-object v4, v1

    .line 102
    :cond_26
    new-instance v1, Lk4/g;

    .line 103
    invoke-virtual/range {v18 .. v18}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 104
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v3, v2, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v4, 0x1

    if-gt v2, v4, :cond_28

    iget-boolean v0, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    if-eqz v0, :cond_27

    goto :goto_15

    :cond_27
    const/4 v4, 0x0

    .line 105
    :cond_28
    :goto_15
    invoke-direct {v1, v3, v4}, Lk4/g;-><init>(Landroid/graphics/drawable/BitmapDrawable;Z)V

    return-object v1

    .line 106
    :cond_29
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_2a
    throw v2

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 108
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-static {v9, v1}, Lh6/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    .line 109
    :cond_2b
    throw v3

    .line 110
    :cond_2c
    throw v10

    :pswitch_a
    check-cast v7, Lj4/l;

    .line 111
    iget-object v0, v7, Lj4/l;->z:Lm0/n1;

    .line 112
    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls4/j;

    return-object v0

    :pswitch_b
    check-cast v7, Landroidx/lifecycle/g1;

    const-string v0, "<this>"

    .line 113
    invoke-static {v7, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    new-instance v0, Landroidx/lifecycle/e1;

    new-instance v1, Landroidx/lifecycle/r0;

    .line 115
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 116
    invoke-direct {v0, v7, v1}, Landroidx/lifecycle/e1;-><init>(Landroidx/lifecycle/g1;Landroidx/lifecycle/b1;)V

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesVM"

    const-class v2, Landroidx/lifecycle/u0;

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/e1;->b(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/x0;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/u0;

    return-object v0

    :pswitch_c
    check-cast v7, Lo2/r;

    .line 117
    invoke-static {v7}, Lo2/r;->g(Lo2/r;)Lr1/s;

    move-result-object v0

    if-eqz v0, :cond_2d

    invoke-virtual {v7}, Lo2/r;->getPopupContentSize-bOM6tXw()Lm2/k;

    move-result-object v0

    if-eqz v0, :cond_2d

    goto :goto_16

    :cond_2d
    const/4 v4, 0x0

    :goto_16
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_d
    check-cast v7, Lk2/b;

    .line 118
    iget-object v0, v7, Lk2/b;->c:Lm0/n1;

    .line 119
    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/f;

    .line 120
    iget-wide v0, v0, Ld1/f;->a:J

    .line 121
    sget-wide v4, Ld1/f;->c:J

    cmp-long v0, v0, v4

    if-nez v0, :cond_2e

    goto :goto_17

    .line 122
    :cond_2e
    iget-object v0, v7, Lk2/b;->c:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld1/f;

    .line 123
    iget-wide v1, v1, Ld1/f;->a:J

    .line 124
    invoke-static {v1, v2}, Ld1/f;->e(J)Z

    move-result v1

    if-eqz v1, :cond_2f

    goto :goto_17

    .line 125
    :cond_2f
    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/f;

    .line 126
    iget-wide v0, v0, Ld1/f;->a:J

    .line 127
    iget-object v2, v7, Lk2/b;->a:Le1/j0;

    invoke-virtual {v2, v0, v1}, Le1/j0;->b(J)Landroid/graphics/Shader;

    move-result-object v3

    :goto_17
    return-object v3

    .line 128
    :pswitch_e
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    check-cast v7, Lg2/e0;

    .line 129
    iget-object v1, v7, Lg2/e0;->a:Landroid/view/View;

    const/4 v2, 0x0

    .line 130
    invoke-direct {v0, v1, v2}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    return-object v0

    :pswitch_f
    check-cast v7, Lg2/q;

    .line 131
    iget-object v0, v7, Lg2/q;->a:Landroid/view/View;

    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    return-object v0

    .line 133
    :pswitch_10
    new-instance v0, Lb2/g;

    check-cast v7, Lb2/v;

    .line 134
    iget-object v1, v7, Lb2/v;->d:Landroid/text/Layout;

    .line 135
    invoke-direct {v0, v1}, Lb2/g;-><init>(Landroid/text/Layout;)V

    return-object v0

    .line 136
    :pswitch_11
    new-instance v0, Lc2/a;

    check-cast v7, La2/a;

    .line 137
    iget-object v1, v7, La2/a;->a:Li2/d;

    .line 138
    iget-object v1, v1, Li2/d;->g:Li2/e;

    .line 139
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    move-result-object v1

    .line 140
    iget-object v2, v7, La2/a;->d:Lb2/v;

    iget-object v2, v2, Lb2/v;->d:Landroid/text/Layout;

    .line 141
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 142
    invoke-direct {v0, v1, v2}, Lc2/a;-><init>(Ljava/util/Locale;Ljava/lang/CharSequence;)V

    return-object v0

    .line 143
    :pswitch_12
    invoke-virtual/range {p0 .. p0}, Lu1/z0;->invoke()V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public final invoke()V
    .locals 5

    iget v0, p0, Lu1/z0;->a:I

    iget-object v1, p0, Lu1/z0;->b:Ljava/lang/Object;

    sparse-switch v0, :sswitch_data_0

    check-cast v1, Landroid/view/View;

    .line 1
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {v0, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 2
    sget-wide v2, Le5/a;->g:J

    .line 3
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 4
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 5
    new-instance v2, Lk/f;

    const/16 v3, 0xb

    invoke-direct {v2, v1, v3}, Lk/f;-><init>(Landroid/view/View;I)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    .line 6
    new-instance v1, Lb3/y1;

    invoke-direct {v1, v0}, Lb3/y1;-><init>(Landroid/view/Window;)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Lb3/x1;

    .line 8
    invoke-direct {v1, v0}, Lb3/v1;-><init>(Landroid/view/Window;)V

    :goto_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {v1, v0}, Ll2/l;->i(Z)V

    return-void

    :sswitch_0
    check-cast v1, Lcom/google/firebase/firestore/ListenerRegistration;

    .line 10
    invoke-interface {v1}, Lcom/google/firebase/firestore/ListenerRegistration;->remove()V

    return-void

    :sswitch_1
    check-cast v1, Lu1/a1;

    const/4 v0, 0x0

    .line 11
    iput-object v0, v1, Lu1/a1;->b:Landroid/view/ActionMode;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0xa -> :sswitch_0
    .end sparse-switch
.end method
