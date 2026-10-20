.class public final Lq5/i;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lm5/f;

.field public final c:Lr5/d;

.field public final d:Lq5/l;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Ls5/c;

.field public final g:Lt5/a;

.field public final h:Lt5/a;

.field public final i:Lr5/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lm5/f;Lr5/d;Lq5/l;Ljava/util/concurrent/Executor;Ls5/c;Lt5/a;Lt5/a;Lr5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/i;->a:Landroid/content/Context;

    iput-object p2, p0, Lq5/i;->b:Lm5/f;

    iput-object p3, p0, Lq5/i;->c:Lr5/d;

    iput-object p4, p0, Lq5/i;->d:Lq5/l;

    iput-object p5, p0, Lq5/i;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lq5/i;->f:Ls5/c;

    iput-object p7, p0, Lq5/i;->g:Lt5/a;

    iput-object p8, p0, Lq5/i;->h:Lt5/a;

    iput-object p9, p0, Lq5/i;->i:Lr5/c;

    return-void
.end method


# virtual methods
.method public final a(Ll5/j;I)V
    .locals 47

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    iget-object v0, v8, Ll5/j;->a:Ljava/lang/String;

    iget-object v1, v7, Lq5/i;->b:Lm5/f;

    invoke-virtual {v1, v0}, Lm5/f;->a(Ljava/lang/String;)Lm5/h;

    move-result-object v1

    const-wide/16 v5, 0x0

    :goto_0
    new-instance v0, Lq5/f;

    const/4 v4, 0x0

    invoke-direct {v0, v7, v8, v4}, Lq5/f;-><init>(Lq5/i;Ll5/j;I)V

    iget-object v9, v7, Lq5/i;->f:Ls5/c;

    check-cast v9, Lr5/m;

    invoke-virtual {v9, v0}, Lr5/m;->g(Ls5/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v10, v7, Lq5/i;->g:Lt5/a;

    if-eqz v0, :cond_25

    new-instance v0, Lq5/f;

    const/4 v11, 0x1

    invoke-direct {v0, v7, v8, v11}, Lq5/f;-><init>(Lq5/i;Ll5/j;I)V

    invoke-virtual {v9, v0}, Lr5/m;->g(Ls5/b;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/Iterable;

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    const-wide/16 v14, -0x1

    iget-object v2, v8, Ll5/j;->b:[B

    if-nez v1, :cond_1

    const-string v4, "Uploader"

    const-string v10, "Unknown backend for %s, deleting event batch for it..."

    invoke-static {v4, v10, v8}, Ly3/e;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v4, Lm5/a;

    invoke-direct {v4, v0, v14, v15}, Lm5/a;-><init>(IJ)V

    move-object/from16 v31, v1

    move-wide/from16 v34, v5

    move-object/from16 v33, v9

    :goto_1
    const/4 v1, 0x2

    goto/16 :goto_11

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v0, v17

    check-cast v0, Lr5/b;

    iget-object v0, v0, Lr5/b;->c:Ll5/i;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x3

    goto :goto_2

    :cond_2
    if-eqz v2, :cond_3

    move v0, v11

    goto :goto_3

    :cond_3
    move v0, v4

    :goto_3
    const-string v14, "proto"

    if-eqz v0, :cond_4

    iget-object v0, v7, Lq5/i;->i:Lr5/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lb/b;

    const/4 v13, 0x6

    invoke-direct {v15, v0, v13}, Lb/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v15}, Lr5/m;->g(Ls5/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/a;

    new-instance v13, Ll/r;

    invoke-direct {v13, v11}, Ll/r;-><init>(I)V

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    iput-object v15, v13, Ll/r;->g:Ljava/lang/Object;

    check-cast v10, Lt5/c;

    invoke-virtual {v10}, Lt5/c;->a()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    iput-object v10, v13, Ll/r;->e:Ljava/lang/Object;

    iget-object v10, v7, Lq5/i;->h:Lt5/a;

    check-cast v10, Lt5/c;

    invoke-virtual {v10}, Lt5/c;->a()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    iput-object v10, v13, Ll/r;->f:Ljava/lang/Object;

    const-string v10, "GDT_CLIENT_METRICS"

    iput-object v10, v13, Ll/r;->b:Ljava/lang/Object;

    new-instance v10, Ll5/m;

    new-instance v15, Li5/c;

    invoke-direct {v15, v14}, Li5/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, Ll5/p;->a:Lcom/google/firebase/encoders/proto/ProtobufEncoder;

    invoke-virtual {v11, v0}, Lcom/google/firebase/encoders/proto/ProtobufEncoder;->encode(Ljava/lang/Object;)[B

    move-result-object v0

    invoke-direct {v10, v15, v0}, Ll5/m;-><init>(Li5/c;[B)V

    invoke-virtual {v13, v10}, Ll/r;->i(Ll5/m;)V

    invoke-virtual {v13}, Ll/r;->c()Ll5/i;

    move-result-object v0

    move-object v10, v1

    check-cast v10, Lj5/d;

    invoke-virtual {v10, v0}, Lj5/d;->a(Ll5/i;)Ll5/i;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    move-object v0, v1

    check-cast v0, Lj5/d;

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll5/i;

    iget-object v13, v11, Ll5/i;->a:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_5

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v10, v13, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_5
    invoke-virtual {v10, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    invoke-interface {v13, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const-string v15, "CctTransportBackend"

    if-eqz v11, :cond_14

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v13, v19

    check-cast v13, Ljava/util/List;

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll5/i;

    sget-object v30, Lk5/x;->a:Lk5/x;

    iget-object v4, v0, Lj5/d;->f:Lt5/a;

    check-cast v4, Lt5/c;

    invoke-virtual {v4}, Lt5/c;->a()J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v31, v1

    iget-object v1, v0, Lj5/d;->e:Lt5/a;

    check-cast v1, Lt5/c;

    invoke-virtual {v1}, Lt5/c;->a()J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v32, v10

    sget-object v10, Lk5/q;->a:Lk5/q;

    const-string v8, "sdk-version"

    invoke-virtual {v13, v8}, Ll5/i;->b(Ljava/lang/String;)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v34

    const-string v8, "model"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v35

    const-string v8, "hardware"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    const-string v8, "device"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v37

    const-string v8, "product"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    const-string v8, "os-uild"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v39

    const-string v8, "manufacturer"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v40

    const-string v8, "fingerprint"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v41

    const-string v8, "country"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v43

    const-string v8, "locale"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    const-string v8, "mcc_mnc"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v44

    const-string v8, "application_build"

    invoke-virtual {v13, v8}, Ll5/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v45

    new-instance v8, Lk5/i;

    move-object/from16 v33, v8

    invoke-direct/range {v33 .. v45}, Lk5/i;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v13, Lk5/k;

    invoke-direct {v13, v10, v8}, Lk5/k;-><init>(Lk5/q;Lk5/a;)V

    :try_start_0
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v27, v8

    const/16 v28, 0x0

    goto :goto_6

    :catch_0
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    move-object/from16 v28, v8

    const/16 v27, 0x0

    :goto_6
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const-string v7, "Missing required properties:"

    const-string v20, ""

    if-eqz v11, :cond_10

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll5/i;

    move-object/from16 v21, v10

    iget-object v10, v11, Ll5/i;->c:Ll5/m;

    move-object/from16 v33, v9

    iget-object v9, v10, Ll5/m;->a:Li5/c;

    move-wide/from16 v34, v5

    new-instance v5, Li5/c;

    invoke-direct {v5, v14}, Li5/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Li5/c;->equals(Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, v10, Ll5/m;->b:[B

    if-eqz v5, :cond_7

    new-instance v5, Ll/l3;

    const/4 v9, 0x1

    invoke-direct {v5, v9}, Ll/l3;-><init>(I)V

    iput-object v6, v5, Ll/l3;->d:Ljava/lang/Object;

    goto :goto_8

    :cond_7
    new-instance v5, Li5/c;

    const-string v10, "json"

    invoke-direct {v5, v10}, Li5/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Li5/c;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    new-instance v5, Ljava/lang/String;

    const-string v9, "UTF-8"

    invoke-static {v9}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v9

    invoke-direct {v5, v6, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v6, Ll/l3;

    const/4 v9, 0x1

    invoke-direct {v6, v9}, Ll/l3;-><init>(I)V

    iput-object v5, v6, Ll/l3;->e:Ljava/lang/Object;

    move-object v5, v6

    :goto_8
    iget-wide v9, v11, Ll5/i;->d:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v5, Ll/l3;->a:Ljava/lang/Object;

    iget-wide v9, v11, Ll5/i;->e:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v5, Ll/l3;->c:Ljava/lang/Object;

    iget-object v6, v11, Ll5/i;->f:Ljava/util/Map;

    const-string v9, "tz-offset"

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_8

    const-wide/16 v9, 0x0

    goto :goto_9

    :cond_8
    invoke-static {v6}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    :goto_9
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v5, Ll/l3;->f:Ljava/lang/Object;

    const-string v6, "net-type"

    invoke-virtual {v11, v6}, Ll5/i;->b(Ljava/lang/String;)I

    move-result v6

    sget-object v9, Lk5/v;->a:Landroid/util/SparseArray;

    invoke-virtual {v9, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lk5/v;

    const-string v9, "mobile-subtype"

    invoke-virtual {v11, v9}, Ll5/i;->b(Ljava/lang/String;)I

    move-result v9

    sget-object v10, Lk5/u;->a:Landroid/util/SparseArray;

    invoke-virtual {v10, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lk5/u;

    new-instance v10, Lk5/o;

    invoke-direct {v10, v6, v9}, Lk5/o;-><init>(Lk5/v;Lk5/u;)V

    iput-object v10, v5, Ll/l3;->g:Ljava/lang/Object;

    iget-object v6, v11, Ll5/i;->b:Ljava/lang/Integer;

    if-eqz v6, :cond_9

    iput-object v6, v5, Ll/l3;->b:Ljava/lang/Object;

    :cond_9
    iget-object v6, v5, Ll/l3;->a:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Long;

    if-nez v6, :cond_a

    const-string v20, " eventTimeMs"

    :cond_a
    move-object/from16 v6, v20

    iget-object v9, v5, Ll/l3;->c:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Long;

    if-nez v9, :cond_b

    const-string v9, " eventUptimeMs"

    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_b
    iget-object v9, v5, Ll/l3;->f:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Long;

    if-nez v9, :cond_c

    const-string v9, " timezoneOffsetSeconds"

    invoke-static {v6, v9}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_c
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_e

    new-instance v6, Lk5/l;

    iget-object v7, v5, Ll/l3;->a:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v37

    iget-object v7, v5, Ll/l3;->b:Ljava/lang/Object;

    move-object/from16 v39, v7

    check-cast v39, Ljava/lang/Integer;

    iget-object v7, v5, Ll/l3;->c:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v40

    iget-object v7, v5, Ll/l3;->d:Ljava/lang/Object;

    move-object/from16 v42, v7

    check-cast v42, [B

    iget-object v7, v5, Ll/l3;->e:Ljava/lang/Object;

    move-object/from16 v43, v7

    check-cast v43, Ljava/lang/String;

    iget-object v7, v5, Ll/l3;->f:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v44

    iget-object v5, v5, Ll/l3;->g:Ljava/lang/Object;

    move-object/from16 v46, v5

    check-cast v46, Lk5/w;

    move-object/from16 v36, v6

    invoke-direct/range {v36 .. v46}, Lk5/l;-><init>(JLjava/lang/Integer;J[BLjava/lang/String;JLk5/w;)V

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    :goto_a
    move-object/from16 v7, p0

    move-object/from16 v10, v21

    move-object/from16 v9, v33

    move-wide/from16 v5, v34

    goto/16 :goto_7

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    const-string v5, "TRuntime."

    invoke-virtual {v5, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x5

    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_d

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "Received event of unsupported encoding %s. Skipping..."

    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_a

    :cond_10
    move-wide/from16 v34, v5

    move-object/from16 v33, v9

    if-nez v4, :cond_11

    const-string v20, " requestTimeMs"

    :cond_11
    move-object/from16 v5, v20

    if-nez v1, :cond_12

    const-string v6, " requestUptimeMs"

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_12
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_13

    new-instance v5, Lk5/m;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v22

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v24

    move-object/from16 v21, v5

    move-object/from16 v26, v13

    move-object/from16 v29, v8

    invoke-direct/range {v21 .. v30}, Lk5/m;-><init>(JJLk5/r;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lk5/x;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v1, v31

    move-object/from16 v10, v32

    move-object/from16 v9, v33

    move-wide/from16 v5, v34

    const/4 v4, 0x0

    goto/16 :goto_5

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    move-object/from16 v31, v1

    move-wide/from16 v34, v5

    move-object/from16 v33, v9

    new-instance v1, Lk5/j;

    invoke-direct {v1, v3}, Lk5/j;-><init>(Ljava/util/ArrayList;)V

    iget-object v3, v0, Lj5/d;->d:Ljava/net/URL;

    if-eqz v2, :cond_17

    :try_start_1
    invoke-static {v2}, Lj5/a;->a([B)Lj5/a;

    move-result-object v4

    iget-object v5, v4, Lj5/a;->b:Ljava/lang/String;

    if-eqz v5, :cond_15

    goto :goto_b

    :cond_15
    const/4 v5, 0x0

    :goto_b
    iget-object v4, v4, Lj5/a;->a:Ljava/lang/String;

    if-eqz v4, :cond_16

    invoke-static {v4}, Lj5/d;->b(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_16
    const/4 v4, 0x3

    goto :goto_d

    :catch_1
    new-instance v0, Lm5/a;

    const/4 v4, 0x3

    const-wide/16 v5, -0x1

    invoke-direct {v0, v4, v5, v6}, Lm5/a;-><init>(IJ)V

    :goto_c
    move-object v4, v0

    goto/16 :goto_1

    :cond_17
    const/4 v4, 0x3

    const/4 v5, 0x0

    :goto_d
    :try_start_2
    new-instance v6, Lj5/b;

    invoke-direct {v6, v3, v1, v5}, Lj5/b;-><init>(Ljava/net/URL;Lk5/p;Ljava/lang/String;)V

    new-instance v1, Lb/b;

    invoke-direct {v1, v0, v4}, Lb/b;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x5

    :cond_18
    invoke-virtual {v1, v6}, Lb/b;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lj5/c;

    iget-object v5, v4, Lj5/c;->b:Ljava/net/URL;

    if-eqz v5, :cond_19

    const-string v7, "Following redirect to: %s"

    invoke-static {v15, v7, v5}, Ly3/e;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v5, Lj5/b;

    iget-object v7, v6, Lj5/b;->b:Lk5/p;

    iget-object v6, v6, Lj5/b;->c:Ljava/lang/String;

    iget-object v4, v4, Lj5/c;->b:Ljava/net/URL;

    invoke-direct {v5, v4, v7, v6}, Lj5/b;-><init>(Ljava/net/URL;Lk5/p;Ljava/lang/String;)V

    move-object v6, v5

    goto :goto_e

    :cond_19
    const/4 v6, 0x0

    :goto_e
    if-eqz v6, :cond_1a

    add-int/lit8 v0, v0, -0x1

    const/4 v4, 0x1

    if-ge v0, v4, :cond_18

    :cond_1a
    check-cast v3, Lj5/c;

    iget v0, v3, Lj5/c;->a:I

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1b

    iget-wide v0, v3, Lj5/c;->c:J

    new-instance v3, Lm5/a;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v0, v1}, Lm5/a;-><init>(IJ)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v4, v3

    goto/16 :goto_1

    :catch_2
    move-exception v0

    goto :goto_10

    :cond_1b
    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_1e

    const/16 v1, 0x194

    if-ne v0, v1, :cond_1c

    goto :goto_f

    :cond_1c
    const/16 v1, 0x190

    if-ne v0, v1, :cond_1d

    :try_start_3
    new-instance v0, Lm5/a;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    const/4 v1, 0x4

    const-wide/16 v3, -0x1

    :try_start_4
    invoke-direct {v0, v1, v3, v4}, Lm5/a;-><init>(IJ)V

    goto :goto_c

    :catch_3
    move-exception v0

    const-wide/16 v3, -0x1

    goto :goto_10

    :cond_1d
    const-wide/16 v3, -0x1

    new-instance v0, Lm5/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v3, v4}, Lm5/a;-><init>(IJ)V

    goto :goto_c

    :cond_1e
    :goto_f
    new-instance v0, Lm5/a;

    const/4 v1, 0x2

    const-wide/16 v3, -0x1

    invoke-direct {v0, v1, v3, v4}, Lm5/a;-><init>(IJ)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_c

    :goto_10
    const-string v1, "Could not make request to the backend"

    invoke-static {v15, v1, v0}, Ly3/e;->d0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    new-instance v0, Lm5/a;

    const/4 v1, 0x2

    const-wide/16 v3, -0x1

    invoke-direct {v0, v1, v3, v4}, Lm5/a;-><init>(IJ)V

    move-object v4, v0

    :goto_11
    iget v0, v4, Lm5/a;->a:I

    if-ne v0, v1, :cond_1f

    new-instance v0, Lq5/g;

    move-object v1, v0

    move-object/from16 v2, p0

    move-object v3, v12

    move-object/from16 v4, p1

    move-wide/from16 v5, v34

    invoke-direct/range {v1 .. v6}, Lq5/g;-><init>(Lq5/i;Ljava/lang/Iterable;Ll5/j;J)V

    move-object/from16 v9, v33

    invoke-virtual {v9, v0}, Lr5/m;->g(Ls5/b;)Ljava/lang/Object;

    const/4 v1, 0x1

    add-int/lit8 v0, p2, 0x1

    move-object/from16 v3, p0

    iget-object v2, v3, Lq5/i;->d:Lq5/l;

    check-cast v2, Lq5/c;

    move-object/from16 v5, p1

    invoke-virtual {v2, v5, v0, v1}, Lq5/c;->a(Ll5/j;IZ)V

    return-void

    :cond_1f
    move-object/from16 v3, p0

    move-object/from16 v5, p1

    move-object/from16 v9, v33

    const/4 v1, 0x1

    new-instance v6, Lv3/a;

    invoke-direct {v6, v1, v3, v12}, Lv3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v6}, Lr5/m;->g(Ls5/b;)Ljava/lang/Object;

    if-ne v0, v1, :cond_20

    iget-wide v0, v4, Lm5/a;->b:J

    move-wide/from16 v6, v34

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    if-eqz v2, :cond_24

    new-instance v2, Lb/b;

    const/4 v4, 0x5

    invoke-direct {v2, v3, v4}, Lb/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v2}, Lr5/m;->g(Ls5/b;)Ljava/lang/Object;

    goto :goto_13

    :cond_20
    move-wide/from16 v6, v34

    const/4 v1, 0x4

    if-ne v0, v1, :cond_23

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr5/b;

    iget-object v2, v2, Lr5/b;->c:Ll5/i;

    iget-object v2, v2, Ll5/i;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_12

    :cond_21
    const/4 v4, 0x1

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/2addr v8, v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_12

    :cond_22
    new-instance v1, Lv3/a;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v3, v0}, Lv3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v1}, Lr5/m;->g(Ls5/b;)Ljava/lang/Object;

    :cond_23
    move-wide v0, v6

    :cond_24
    :goto_13
    move-object v7, v3

    move-object v8, v5

    move-wide v5, v0

    move-object/from16 v1, v31

    goto/16 :goto_0

    :cond_25
    move-object v3, v7

    move-wide v6, v5

    move-object v5, v8

    invoke-virtual {v9}, Lr5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    new-instance v2, Lb0/l0;

    const/16 v0, 0x10

    invoke-direct {v2, v0}, Lb0/l0;-><init>(I)V

    iget-object v0, v9, Lr5/m;->c:Lt5/a;

    move-object v4, v0

    check-cast v4, Lt5/c;

    invoke-virtual {v4}, Lt5/c;->a()J

    move-result-wide v11

    :goto_14
    :try_start_5
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_5 .. :try_end_5} :catch_4

    move-object/from16 p2, v1

    goto :goto_15

    :catch_4
    move-exception v0

    move-object v8, v0

    invoke-virtual {v4}, Lt5/c;->a()J

    move-result-wide v13

    iget-object v0, v9, Lr5/m;->d:Lr5/a;

    iget v0, v0, Lr5/a;->c:I

    move-object/from16 p2, v1

    int-to-long v0, v0

    add-long/2addr v0, v11

    cmp-long v0, v13, v0

    if-ltz v0, :cond_26

    invoke-virtual {v2, v8}, Lb0/l0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_15
    :try_start_6
    check-cast v10, Lt5/c;

    invoke-virtual {v10}, Lt5/c;->a()J

    move-result-wide v0

    add-long/2addr v0, v6

    iget-object v2, v3, Lq5/i;->c:Lr5/d;

    check-cast v2, Lr5/m;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lr5/f;

    invoke-direct {v4, v0, v1, v5}, Lr5/f;-><init>(JLl5/j;)V

    invoke-virtual {v2, v4}, Lr5/m;->e(Lr5/k;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual/range {p2 .. p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual/range {p2 .. p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :cond_26
    const-wide/16 v0, 0x32

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    move-object/from16 v1, p2

    goto :goto_14
.end method
