.class public final synthetic Lb/b;
.super Ljava/lang/Object;

# interfaces
.implements Ld/c;
.implements Ls5/b;
.implements Lr5/k;
.implements Lcom/google/firebase/inject/Deferred$DeferredHandler;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lb/b;->a:I

    iput-object p1, p0, Lb/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lb/b;->b:Ljava/lang/Object;

    check-cast v0, Lm0/l3;

    invoke-interface {v0}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc9/c;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    iget v0, v1, Lb/b;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v4, v1, Lb/b;->b:Ljava/lang/Object;

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast v4, Ljava/util/Map;

    move-object/from16 v0, p1

    check-cast v0, Landroid/database/Cursor;

    sget-object v6, Lr5/m;->f:Li5/c;

    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Set;

    if-nez v8, :cond_0

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v4, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance v6, Lr5/l;

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x2

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v6, v7, v9}, Lr5/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v5

    :pswitch_0
    check-cast v4, Lj5/d;

    move-object/from16 v0, p1

    check-cast v0, Lj5/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v0, Lj5/b;->a:Ljava/net/URL;

    const-string v7, "TRuntime."

    const-string v8, "CctTransportBackend"

    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x4

    invoke-static {v9, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_2

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v11, "Making request to: %s"

    invoke-static {v11, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v9, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v6, v0, Lj5/b;->a:Ljava/net/URL;

    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v6

    check-cast v6, Ljava/net/HttpURLConnection;

    const/16 v9, 0x7530

    invoke-virtual {v6, v9}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    iget v9, v4, Lj5/d;->g:I

    invoke-virtual {v6, v9}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v6, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    invoke-virtual {v6, v3}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const-string v2, "POST"

    invoke-virtual {v6, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v2, "3.1.8"

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "datatransport/%s android/"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "User-Agent"

    invoke-virtual {v6, v3, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "Content-Encoding"

    const-string v3, "gzip"

    invoke-virtual {v6, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "application/json"

    const-string v11, "Content-Type"

    invoke-virtual {v6, v11, v9}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "Accept-Encoding"

    invoke-virtual {v6, v9, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v9, v0, Lj5/b;->c:Ljava/lang/String;

    if-eqz v9, :cond_3

    const-string v12, "X-Goog-Api-Key"

    invoke-virtual {v6, v12, v9}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-wide/16 v12, 0x0

    :try_start_0
    invoke-virtual {v6}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v9
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lcom/google/firebase/encoders/EncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v14, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v14, v9}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    iget-object v4, v4, Lj5/d;->a:Lcom/google/firebase/encoders/DataEncoder;

    iget-object v0, v0, Lj5/b;->b:Lk5/p;

    new-instance v15, Ljava/io/BufferedWriter;

    new-instance v5, Ljava/io/OutputStreamWriter;

    invoke-direct {v5, v14}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v15, v5}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    invoke-interface {v4, v0, v15}, Lcom/google/firebase/encoders/DataEncoder;->encode(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    :try_start_3
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-eqz v9, :cond_4

    :try_start_4
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/net/ConnectException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lcom/google/firebase/encoders/EncodingException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto/16 :goto_d

    :catch_1
    move-exception v0

    goto/16 :goto_d

    :catch_2
    move-exception v0

    :goto_1
    const/4 v3, 0x0

    goto/16 :goto_f

    :catch_3
    move-exception v0

    goto :goto_1

    :cond_4
    :goto_2
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_5

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v7, "Status Code: %d"

    invoke-static {v7, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    const-string v4, "Content-Type: %s"

    invoke-virtual {v6, v11}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v8, v4, v5}, Ly3/e;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "Content-Encoding: %s"

    invoke-virtual {v6, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v8, v4, v5}, Ly3/e;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v4, 0x12e

    if-eq v0, v4, :cond_d

    const/16 v4, 0x12d

    if-eq v0, v4, :cond_d

    const/16 v4, 0x133

    if-ne v0, v4, :cond_6

    goto/16 :goto_9

    :cond_6
    const/16 v4, 0xc8

    if-eq v0, v4, :cond_7

    new-instance v2, Lj5/c;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3, v12, v13}, Lj5/c;-><init>(ILjava/net/URL;J)V

    goto/16 :goto_10

    :cond_7
    invoke-virtual {v6}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    :try_start_5
    invoke-virtual {v6, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    new-instance v2, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v2, v4}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    :cond_8
    move-object v2, v4

    :goto_3
    :try_start_6
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/InputStreamReader;

    invoke-direct {v5, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v3, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-static {v3}, Lk5/n;->a(Ljava/io/BufferedReader;)Lk5/n;

    move-result-object v3

    iget-wide v5, v3, Lk5/n;->a:J

    new-instance v3, Lj5/c;

    const/4 v7, 0x0

    invoke-direct {v3, v0, v7, v5, v6}, Lj5/c;-><init>(ILjava/net/URL;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v2, :cond_9

    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_7

    :cond_9
    :goto_4
    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    :cond_a
    :goto_5
    move-object v2, v3

    goto/16 :goto_10

    :catchall_1
    move-exception v0

    move-object v3, v0

    if-eqz v2, :cond_b

    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_9
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_b
    :goto_6
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_7
    if-eqz v4, :cond_c

    :try_start_a
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_c
    :goto_8
    throw v2

    :cond_d
    :goto_9
    const-string v2, "Location"

    invoke-virtual {v6, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lj5/c;

    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v0, v4, v12, v13}, Lj5/c;-><init>(ILjava/net/URL;J)V

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v2, v0

    goto :goto_b

    :catchall_5
    move-exception v0

    move-object v2, v0

    :try_start_b
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_a

    :catchall_6
    move-exception v0

    move-object v3, v0

    :try_start_c
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :goto_b
    if-eqz v9, :cond_e

    :try_start_d
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    goto :goto_c

    :catchall_7
    move-exception v0

    move-object v3, v0

    :try_start_e
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_e
    :goto_c
    throw v2
    :try_end_e
    .catch Ljava/net/ConnectException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_e .. :try_end_e} :catch_2
    .catch Lcom/google/firebase/encoders/EncodingException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    :goto_d
    const-string v2, "Couldn\'t encode request, returning with 400"

    invoke-static {v8, v2, v0}, Ly3/e;->d0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    new-instance v2, Lj5/c;

    const/16 v0, 0x190

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3, v12, v13}, Lj5/c;-><init>(ILjava/net/URL;J)V

    goto :goto_10

    :catch_4
    move-exception v0

    :goto_e
    move-object v3, v5

    goto :goto_f

    :catch_5
    move-exception v0

    goto :goto_e

    :goto_f
    const-string v2, "Couldn\'t open connection, returning with 500"

    invoke-static {v8, v2, v0}, Ly3/e;->d0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    new-instance v2, Lj5/c;

    const/16 v0, 0x1f4

    invoke-direct {v2, v0, v3, v12, v13}, Lj5/c;-><init>(ILjava/net/URL;J)V

    :goto_10
    return-object v2

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lb/b;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lb/b;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lq5/k;

    iget-object v0, v3, Lq5/k;->b:Lr5/d;

    check-cast v0, Lr5/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lb0/l0;

    const/16 v5, 0xd

    invoke-direct {v4, v5}, Lb0/l0;-><init>(I)V

    invoke-virtual {v0, v4}, Lr5/m;->e(Lr5/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll5/j;

    iget-object v5, v3, Lq5/k;->c:Lq5/l;

    check-cast v5, Lq5/c;

    const/4 v6, 0x1

    invoke-virtual {v5, v4, v6, v2}, Lq5/c;->a(Ll5/j;IZ)V

    goto :goto_0

    :cond_0
    return-object v1

    :pswitch_0
    check-cast v3, Lr5/c;

    check-cast v3, Lr5/m;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lo5/a;->e:I

    new-instance v0, Li3/a0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Li3/a0;-><init>(I)V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped"

    invoke-virtual {v3}, Lr5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    :try_start_0
    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v6, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    new-instance v5, Lp5/b;

    invoke-direct {v5, v3, v4, v0, v1}, Lp5/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v2, v5}, Lr5/m;->q(Landroid/database/Cursor;Lr5/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/a;

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :pswitch_1
    check-cast v3, Lq5/i;

    iget-object v0, v3, Lq5/i;->i:Lr5/c;

    check-cast v0, Lr5/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lr5/h;

    invoke-direct {v3, v0, v2}, Lr5/h;-><init>(Lr5/m;I)V

    invoke-virtual {v0, v3}, Lr5/m;->e(Lr5/k;)Ljava/lang/Object;

    return-object v1

    :pswitch_2
    check-cast v3, Lr5/d;

    check-cast v3, Lr5/m;

    iget-object v0, v3, Lr5/m;->b:Lt5/a;

    check-cast v0, Lt5/c;

    invoke-virtual {v0}, Lt5/c;->a()J

    move-result-wide v0

    iget-object v2, v3, Lr5/m;->d:Lr5/a;

    iget-wide v4, v2, Lr5/a;->d:J

    sub-long/2addr v0, v4

    new-instance v2, Lr5/f;

    invoke-direct {v2, v3, v0, v1}, Lr5/f;-><init>(Lr5/m;J)V

    invoke-virtual {v3, v2}, Lr5/m;->e(Lr5/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final handle(Lcom/google/firebase/inject/Provider;)V
    .locals 1

    iget-object v0, p0, Lb/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/auth/FirebaseAuthCredentialsProvider;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/auth/FirebaseAuthCredentialsProvider;->b(Lcom/google/firebase/firestore/auth/FirebaseAuthCredentialsProvider;Lcom/google/firebase/inject/Provider;)V

    return-void
.end method

.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 1
    iget-object v0, p0, Lb/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHandler$FetchResponse;

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/ConfigContainer;

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHandler;->b(Lcom/google/firebase/remoteconfig/internal/ConfigFetchHandler$FetchResponse;Lcom/google/firebase/remoteconfig/internal/ConfigContainer;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Lb/b;->a:I

    iget-object v1, p0, Lb/b;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/android/gms/tasks/Task;

    invoke-static {v1, p1}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;->h(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigInfo;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v1, Lcom/google/firebase/firestore/core/Transaction;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/core/Transaction;->b(Lcom/google/firebase/firestore/core/Transaction;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method
