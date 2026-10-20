.class public final synthetic Lq5/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lq5/e;->a:I

    iput-object p3, p0, Lq5/e;->c:Ljava/lang/Object;

    iput-object p4, p0, Lq5/e;->d:Ljava/lang/Object;

    iput p1, p0, Lq5/e;->b:I

    iput-object p5, p0, Lq5/e;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v1, p0

    iget v0, v1, Lq5/e;->a:I

    iget v2, v1, Lq5/e;->b:I

    iget-object v3, v1, Lq5/e;->e:Ljava/lang/Object;

    iget-object v4, v1, Lq5/e;->d:Ljava/lang/Object;

    iget-object v5, v1, Lq5/e;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v5, Lcom/google/firebase/firestore/local/SQLiteDocumentOverlayCache;

    check-cast v4, [B

    check-cast v3, Ljava/util/Map;

    invoke-static {v5, v4, v2, v3}, Lcom/google/firebase/firestore/local/SQLiteDocumentOverlayCache;->d(Lcom/google/firebase/firestore/local/SQLiteDocumentOverlayCache;[BILjava/util/Map;)V

    return-void

    :pswitch_0
    check-cast v5, Lq5/i;

    check-cast v4, Ll5/j;

    check-cast v3, Ljava/lang/Runnable;

    iget-object v6, v5, Lq5/i;->d:Lq5/l;

    iget-object v0, v5, Lq5/i;->f:Ls5/c;

    :try_start_0
    iget-object v8, v5, Lq5/i;->c:Lr5/d;

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lb/b;

    const/4 v10, 0x4

    invoke-direct {v9, v8, v10}, Lb/b;-><init>(Ljava/lang/Object;I)V

    move-object v8, v0

    check-cast v8, Lr5/m;

    invoke-virtual {v8, v9}, Lr5/m;->g(Ls5/b;)Ljava/lang/Object;

    iget-object v8, v5, Lq5/i;->a:Landroid/content/Context;

    const-string v9, "connectivity"

    invoke-virtual {v8, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/net/ConnectivityManager;

    invoke-virtual {v8}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v5, v4, v2}, Lq5/i;->a(Ll5/j;I)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_0
    move-object v5, v0

    check-cast v5, Lr5/m;

    invoke-virtual {v5}, Lr5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    new-instance v9, Lb0/l0;

    const/16 v0, 0x10

    invoke-direct {v9, v0}, Lb0/l0;-><init>(I)V

    iget-object v0, v5, Lr5/m;->c:Lt5/a;

    move-object v10, v0

    check-cast v10, Lt5/c;

    invoke-virtual {v10}, Lt5/c;->a()J

    move-result-wide v11
    :try_end_0
    .catch Ls5/a; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    :try_start_1
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ls5/a; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v16, v8

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v13, v0

    :try_start_2
    invoke-virtual {v10}, Lt5/c;->a()J

    move-result-wide v14

    iget-object v0, v5, Lr5/m;->d:Lr5/a;

    iget v0, v0, Lr5/a;->c:I

    move-object/from16 v16, v8

    int-to-long v7, v0

    add-long/2addr v7, v11

    cmp-long v0, v14, v7

    if-ltz v0, :cond_1

    invoke-virtual {v9, v13}, Lb0/l0;->apply(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ls5/a; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    add-int/lit8 v0, v2, 0x1

    :try_start_3
    move-object v5, v6

    check-cast v5, Lq5/c;

    const/4 v7, 0x0

    invoke-virtual {v5, v4, v0, v7}, Lq5/c;->a(Ll5/j;IZ)V

    invoke-virtual/range {v16 .. v16}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual/range {v16 .. v16}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_4
    .catch Ls5/a; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual/range {v16 .. v16}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :cond_1
    const-wide/16 v7, 0x32

    invoke-static {v7, v8}, Landroid/os/SystemClock;->sleep(J)V
    :try_end_5
    .catch Ls5/a; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v8, v16

    goto :goto_0

    :catch_1
    add-int/lit8 v2, v2, 0x1

    :try_start_6
    check-cast v6, Lq5/c;

    const/4 v5, 0x0

    invoke-virtual {v6, v4, v2, v5}, Lq5/c;->a(Ll5/j;IZ)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_2

    :goto_3
    return-void

    :goto_4
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
