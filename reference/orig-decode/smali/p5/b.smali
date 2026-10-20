.class public final synthetic Lp5/b;
.super Ljava/lang/Object;

# interfaces
.implements Ls5/b;
.implements Lr5/k;
.implements Lcom/google/firebase/firestore/util/Function;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lp5/b;->a:I

    iput-object p1, p0, Lp5/b;->d:Ljava/lang/Object;

    iput-object p2, p0, Lp5/b;->c:Ljava/lang/Object;

    iput-object p3, p0, Lp5/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lr5/m;Ljava/lang/Object;Ll5/j;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lp5/b;->a:I

    iput-object p1, p0, Lp5/b;->d:Ljava/lang/Object;

    iput-object p2, p0, Lp5/b;->b:Ljava/lang/Object;

    iput-object p3, p0, Lp5/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    sget-object v0, Lo5/c;->d:Lo5/c;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "PRAGMA page_size"

    const-string v5, "PRAGMA page_count"

    iget v6, v1, Lp5/b;->a:I

    const-string v7, "bytes"

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v14, 0x1

    iget-object v15, v1, Lp5/b;->b:Ljava/lang/Object;

    iget-object v13, v1, Lp5/b;->c:Ljava/lang/Object;

    iget-object v8, v1, Lp5/b;->d:Ljava/lang/Object;

    packed-switch v6, :pswitch_data_0

    check-cast v8, Lcom/google/firebase/firestore/FirebaseFirestore;

    check-cast v13, Ljava/util/concurrent/Executor;

    check-cast v15, Lcom/google/firebase/firestore/Transaction$Function;

    move-object/from16 v0, p1

    check-cast v0, Lcom/google/firebase/firestore/core/Transaction;

    invoke-static {v8, v13, v15, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->c(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/Transaction$Function;Lcom/google/firebase/firestore/core/Transaction;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v8, Lr5/m;

    check-cast v13, Ljava/util/Map;

    check-cast v15, Li3/a0;

    move-object/from16 v3, p1

    check-cast v3, Landroid/database/Cursor;

    sget-object v6, Lr5/m;->f:Li5/c;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    sget-object v16, Lo5/c;->b:Lo5/c;

    if-nez v7, :cond_0

    :goto_1
    move-object/from16 v7, v16

    goto :goto_2

    :cond_0
    if-ne v7, v14, :cond_1

    sget-object v16, Lo5/c;->c:Lo5/c;

    goto :goto_1

    :cond_1
    if-ne v7, v12, :cond_2

    move-object v7, v0

    goto :goto_2

    :cond_2
    if-ne v7, v11, :cond_3

    sget-object v16, Lo5/c;->e:Lo5/c;

    goto :goto_1

    :cond_3
    if-ne v7, v10, :cond_4

    sget-object v16, Lo5/c;->f:Lo5/c;

    goto :goto_1

    :cond_4
    if-ne v7, v9, :cond_5

    sget-object v16, Lo5/c;->n:Lo5/c;

    goto :goto_1

    :cond_5
    const/4 v9, 0x6

    if-ne v7, v9, :cond_6

    sget-object v16, Lo5/c;->o:Lo5/c;

    goto :goto_1

    :cond_6
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v9, "SQLiteEventStore"

    const-string v10, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"

    invoke-static {v9, v10, v7}, Ly3/e;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :goto_2
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    invoke-interface {v13, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_7

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v13, v6, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-interface {v13, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    new-instance v11, Lo5/d;

    invoke-direct {v11, v9, v10, v7}, Lo5/d;-><init>(JLo5/c;)V

    invoke-interface {v6, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    goto :goto_0

    :cond_8
    invoke-interface {v13}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    sget v6, Lo5/e;->c:I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    new-instance v7, Lo5/e;

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v7, v6, v3}, Lo5/e;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iget-object v3, v15, Li3/a0;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    iget-object v0, v8, Lr5/m;->b:Lt5/a;

    check-cast v0, Lt5/c;

    invoke-virtual {v0}, Lt5/c;->a()J

    move-result-wide v6

    invoke-virtual {v8}, Lr5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    :try_start_0
    new-array v0, v2, [Ljava/lang/String;

    const-string v2, "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"

    invoke-virtual {v3, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    new-instance v2, Lr5/j;

    invoke-direct {v2, v6, v7, v14}, Lr5/j;-><init>(JI)V

    invoke-static {v0, v2}, Lr5/m;->q(Landroid/database/Cursor;Lr5/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/g;

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    iput-object v0, v15, Li3/a0;->a:Ljava/lang/Object;

    invoke-virtual {v8}, Lr5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v2

    invoke-virtual {v8}, Lr5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v4

    mul-long/2addr v4, v2

    sget-object v0, Lr5/a;->f:Lr5/a;

    iget-wide v2, v0, Lr5/a;->a:J

    new-instance v0, Lo5/f;

    invoke-direct {v0, v4, v5, v2, v3}, Lo5/f;-><init>(JJ)V

    new-instance v2, Lo5/b;

    invoke-direct {v2, v0}, Lo5/b;-><init>(Lo5/f;)V

    iput-object v2, v15, Li3/a0;->c:Ljava/lang/Object;

    iget-object v0, v8, Lr5/m;->e:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v15, Li3/a0;->d:Ljava/lang/Object;

    new-instance v0, Lo5/a;

    iget-object v2, v15, Li3/a0;->a:Ljava/lang/Object;

    check-cast v2, Lo5/g;

    iget-object v3, v15, Li3/a0;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iget-object v4, v15, Li3/a0;->c:Ljava/lang/Object;

    check-cast v4, Lo5/b;

    iget-object v5, v15, Li3/a0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-direct {v0, v2, v3, v4, v5}, Lo5/a;-><init>(Lo5/g;Ljava/util/List;Lo5/b;Ljava/lang/String;)V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :pswitch_1
    check-cast v8, Lr5/m;

    check-cast v15, Ljava/util/List;

    check-cast v13, Ll5/j;

    move-object/from16 v0, p1

    check-cast v0, Landroid/database/Cursor;

    sget-object v3, Lr5/m;->f:Li5/c;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_4
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    const/4 v5, 0x7

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    if-eqz v5, :cond_a

    move v5, v14

    goto :goto_5

    :cond_a
    move v5, v2

    :goto_5
    new-instance v6, Ll/r;

    invoke-direct {v6, v14}, Ll/r;-><init>(I)V

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    iput-object v9, v6, Ll/r;->g:Ljava/lang/Object;

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_f

    iput-object v9, v6, Ll/r;->b:Ljava/lang/Object;

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    iput-object v9, v6, Ll/r;->e:Ljava/lang/Object;

    const/4 v9, 0x3

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    iput-object v10, v6, Ll/r;->f:Ljava/lang/Object;

    if-eqz v5, :cond_c

    new-instance v5, Ll5/m;

    const/4 v10, 0x4

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_b

    sget-object v10, Lr5/m;->f:Li5/c;

    :goto_6
    const/4 v11, 0x5

    goto :goto_7

    :cond_b
    new-instance v10, Li5/c;

    invoke-direct {v10, v11}, Li5/c;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_7
    invoke-interface {v0, v11}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v9

    invoke-direct {v5, v10, v9}, Ll5/m;-><init>(Li5/c;[B)V

    invoke-virtual {v6, v5}, Ll/r;->i(Ll5/m;)V

    :goto_8
    const/4 v5, 0x6

    goto :goto_a

    :cond_c
    const/4 v11, 0x5

    new-instance v5, Ll5/m;

    const/4 v9, 0x4

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_d

    sget-object v10, Lr5/m;->f:Li5/c;

    goto :goto_9

    :cond_d
    new-instance v9, Li5/c;

    invoke-direct {v9, v10}, Li5/c;-><init>(Ljava/lang/String;)V

    move-object v10, v9

    :goto_9
    invoke-virtual {v8}, Lr5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v17

    const-string v18, "event_payloads"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v19

    const-string v20, "event_id = ?"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-string v24, "sequence_num"

    invoke-virtual/range {v17 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    new-instance v11, Lb0/l0;

    const/16 v14, 0x15

    invoke-direct {v11, v14}, Lb0/l0;-><init>(I)V

    invoke-static {v9, v11}, Lr5/m;->q(Landroid/database/Cursor;Lr5/k;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [B

    invoke-direct {v5, v10, v9}, Ll5/m;-><init>(Li5/c;[B)V

    invoke-virtual {v6, v5}, Ll/r;->i(Ll5/m;)V

    goto :goto_8

    :goto_a
    invoke-interface {v0, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v9

    if-nez v9, :cond_e

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iput-object v9, v6, Ll/r;->c:Ljava/io/Serializable;

    :cond_e
    invoke-virtual {v6}, Ll/r;->c()Ll5/i;

    move-result-object v6

    new-instance v9, Lr5/b;

    invoke-direct {v9, v3, v4, v13, v6}, Lr5/b;-><init>(JLl5/j;Ll5/i;)V

    invoke-interface {v15, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v14, 0x1

    goto/16 :goto_4

    :cond_f
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "Null transportName"

    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    const/4 v0, 0x0

    return-object v0

    :pswitch_2
    check-cast v8, Lr5/m;

    check-cast v13, Ljava/lang/String;

    check-cast v15, Ljava/lang/String;

    move-object/from16 v0, p1

    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    sget-object v2, Lr5/m;->f:Li5/c;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v2

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    const/4 v2, 0x0

    invoke-virtual {v0, v15, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    new-instance v4, Lr5/h;

    invoke-direct {v4, v8, v12}, Lr5/h;-><init>(Lr5/m;I)V

    invoke-static {v3, v4}, Lr5/m;->q(Landroid/database/Cursor;Lr5/k;)Ljava/lang/Object;

    const-string v3, "DELETE FROM events WHERE num_attempts >= 16"

    invoke-virtual {v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    return-object v2

    :pswitch_3
    check-cast v8, Lr5/m;

    check-cast v15, Ll5/i;

    check-cast v13, Ll5/j;

    move-object/from16 v6, p1

    check-cast v6, Landroid/database/sqlite/SQLiteDatabase;

    sget-object v9, Lr5/m;->f:Li5/c;

    invoke-virtual {v8}, Lr5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v9

    invoke-virtual {v9, v5}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v5

    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v9

    invoke-virtual {v8}, Lr5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v4

    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v4

    mul-long/2addr v4, v9

    iget-object v9, v8, Lr5/m;->d:Lr5/a;

    iget-wide v10, v9, Lr5/a;->a:J

    cmp-long v4, v4, v10

    if-ltz v4, :cond_11

    iget-object v2, v15, Ll5/i;->a:Ljava/lang/String;

    new-instance v3, Lq5/h;

    const-wide/16 v4, 0x1

    invoke-direct {v3, v2, v4, v5, v0}, Lq5/h;-><init>(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v3}, Lr5/m;->e(Lr5/k;)Ljava/lang/Object;

    const-wide/16 v2, -0x1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto/16 :goto_10

    :cond_11
    invoke-static {v6, v13}, Lr5/m;->b(Landroid/database/sqlite/SQLiteDatabase;Ll5/j;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_b

    :cond_12
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v4, "backend_name"

    iget-object v5, v13, Ll5/j;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v13, Ll5/j;->c:Li5/d;

    invoke-static {v4}, Lu5/a;->a(Li5/d;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "priority"

    invoke-virtual {v0, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v4, "next_request_ms"

    invoke-virtual {v0, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v4, v13, Ll5/j;->b:[B

    if-eqz v4, :cond_13

    invoke-static {v4, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    const-string v5, "extras"

    invoke-virtual {v0, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_13
    const-string v4, "transport_contexts"

    const/4 v5, 0x0

    invoke-virtual {v6, v4, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v10

    move-wide v4, v10

    :goto_b
    iget-object v0, v15, Ll5/i;->c:Ll5/m;

    iget-object v0, v0, Ll5/m;->b:[B

    array-length v8, v0

    iget v9, v9, Lr5/a;->e:I

    if-gt v8, v9, :cond_14

    const/4 v8, 0x1

    goto :goto_c

    :cond_14
    move v8, v2

    :goto_c
    new-instance v10, Landroid/content/ContentValues;

    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    const-string v11, "context_id"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v10, v11, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v4, "transport_name"

    iget-object v5, v15, Ll5/i;->a:Ljava/lang/String;

    invoke-virtual {v10, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v4, v15, Ll5/i;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-string v5, "timestamp_ms"

    invoke-virtual {v10, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-wide v4, v15, Ll5/i;->e:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-string v5, "uptime_ms"

    invoke-virtual {v10, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v4, v15, Ll5/i;->c:Ll5/m;

    iget-object v4, v4, Ll5/m;->a:Li5/c;

    iget-object v4, v4, Li5/c;->a:Ljava/lang/String;

    const-string v5, "payload_encoding"

    invoke-virtual {v10, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "code"

    iget-object v5, v15, Ll5/i;->b:Ljava/lang/Integer;

    invoke-virtual {v10, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v4, "num_attempts"

    invoke-virtual {v10, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v3, "inline"

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v10, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    if-eqz v8, :cond_15

    move-object v2, v0

    goto :goto_d

    :cond_15
    new-array v2, v2, [B

    :goto_d
    const-string v3, "payload"

    invoke-virtual {v10, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v2, "events"

    const/4 v3, 0x0

    invoke-virtual {v6, v2, v3, v10}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4

    const-string v2, "event_id"

    if-nez v8, :cond_16

    array-length v3, v0

    int-to-double v10, v3

    int-to-double v12, v9

    div-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v3, v10

    const/4 v14, 0x1

    :goto_e
    if-gt v14, v3, :cond_16

    add-int/lit8 v8, v14, -0x1

    mul-int/2addr v8, v9

    mul-int v10, v14, v9

    array-length v11, v0

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    invoke-static {v0, v8, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v8

    new-instance v10, Landroid/content/ContentValues;

    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v10, v2, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v11, "sequence_num"

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v10, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v8, "event_payloads"

    const/4 v11, 0x0

    invoke-virtual {v6, v8, v11, v10}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    add-int/lit8 v14, v14, 0x1

    goto :goto_e

    :cond_16
    iget-object v0, v15, Ll5/i;->f:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v7, v2, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const-string v9, "name"

    invoke-virtual {v7, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v8, "value"

    invoke-virtual {v7, v8, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "event_metadata"

    const/4 v8, 0x0

    invoke-virtual {v6, v3, v8, v7}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_f

    :cond_17
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_10
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lp5/b;->d:Ljava/lang/Object;

    check-cast v0, Lp5/c;

    iget-object v1, p0, Lp5/b;->c:Ljava/lang/Object;

    check-cast v1, Ll5/j;

    iget-object v2, p0, Lp5/b;->b:Ljava/lang/Object;

    check-cast v2, Ll5/i;

    iget-object v3, v0, Lp5/c;->d:Lr5/d;

    check-cast v3, Lr5/m;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v1, Ll5/j;->c:Li5/d;

    iget-object v5, v2, Ll5/i;->a:Ljava/lang/String;

    iget-object v6, v1, Ll5/j;->a:Ljava/lang/String;

    filled-new-array {v4, v5, v6}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "TRuntime."

    const-string v6, "SQLiteEventStore"

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "Storing event with priority=%s, name=%s for destination %s"

    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v4, Lp5/b;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v2, v1, v5}, Lp5/b;-><init>(Lr5/m;Ljava/lang/Object;Ll5/j;I)V

    invoke-virtual {v3, v4}, Lr5/m;->e(Lr5/k;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    iget-object v0, v0, Lp5/c;->a:Lq5/l;

    check-cast v0, Lq5/c;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v2}, Lq5/c;->a(Ll5/j;IZ)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lp5/b;->d:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/remoteconfig/internal/rollouts/RolloutsStateSubscriptionsHandler;

    iget-object v1, p0, Lp5/b;->c:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/tasks/Task;

    iget-object v2, p0, Lp5/b;->b:Ljava/lang/Object;

    check-cast v2, Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsStateSubscriber;

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/ConfigContainer;

    invoke-static {v0, v1, v2, p1}, Lcom/google/firebase/remoteconfig/internal/rollouts/RolloutsStateSubscriptionsHandler;->c(Lcom/google/firebase/remoteconfig/internal/rollouts/RolloutsStateSubscriptionsHandler;Lcom/google/android/gms/tasks/Task;Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsStateSubscriber;Lcom/google/firebase/remoteconfig/internal/ConfigContainer;)V

    return-void
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lp5/b;->a:I

    iget-object v1, p0, Lp5/b;->b:Ljava/lang/Object;

    iget-object v2, p0, Lp5/b;->c:Ljava/lang/Object;

    iget-object v3, p0, Lp5/b;->d:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lcom/google/firebase/remoteconfig/internal/ConfigRealtimeHttpClient;

    check-cast v2, Lcom/google/android/gms/tasks/Task;

    check-cast v1, Lcom/google/android/gms/tasks/Task;

    invoke-static {v3, v2, v1, p1}, Lcom/google/firebase/remoteconfig/internal/ConfigRealtimeHttpClient;->b(Lcom/google/firebase/remoteconfig/internal/ConfigRealtimeHttpClient;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v3, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;

    check-cast v2, Lcom/google/android/gms/tasks/Task;

    check-cast v1, Lcom/google/android/gms/tasks/Task;

    invoke-static {v3, v2, v1, p1}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;->g(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method
