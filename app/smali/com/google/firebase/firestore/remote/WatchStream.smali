.class public Lcom/google/firebase/firestore/remote/WatchStream;
.super Lcom/google/firebase/firestore/remote/AbstractStream;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/remote/WatchStream$Callback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/firestore/remote/AbstractStream<",
        "Lo7/g0;",
        "Lo7/h0;",
        "Lcom/google/firebase/firestore/remote/WatchStream$Callback;",
        ">;"
    }
.end annotation


# static fields
.field public static final EMPTY_RESUME_TOKEN:Lcom/google/protobuf/n;


# instance fields
.field private final serializer:Lcom/google/firebase/firestore/remote/RemoteSerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/protobuf/n;->b:Lcom/google/protobuf/m;

    sput-object v0, Lcom/google/firebase/firestore/remote/WatchStream;->EMPTY_RESUME_TOKEN:Lcom/google/protobuf/n;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;Lcom/google/firebase/firestore/util/AsyncQueue;Lcom/google/firebase/firestore/remote/RemoteSerializer;Lcom/google/firebase/firestore/remote/WatchStream$Callback;)V
    .locals 10

    sget-object v0, Lo7/d0;->e:Le8/p1;

    if-nez v0, :cond_1

    const-class v1, Lo7/d0;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lo7/d0;->e:Le8/p1;

    if-nez v0, :cond_0

    invoke-static {}, Le8/p1;->b()Le8/m1;

    move-result-object v0

    sget-object v2, Le8/o1;->c:Le8/o1;

    iput-object v2, v0, Le8/m1;->c:Le8/o1;

    const-string v2, "google.firestore.v1.Firestore"

    const-string v3, "Listen"

    invoke-static {v2, v3}, Le8/p1;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Le8/m1;->d:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, v0, Le8/m1;->e:Z

    invoke-static {}, Lo7/g0;->j()Lo7/g0;

    move-result-object v2

    sget-object v3, Ll8/c;->a:Lcom/google/protobuf/z;

    new-instance v3, Ll8/b;

    invoke-direct {v3, v2}, Ll8/b;-><init>(Lcom/google/protobuf/l0;)V

    iput-object v3, v0, Le8/m1;->a:Le8/n1;

    invoke-static {}, Lo7/h0;->g()Lo7/h0;

    move-result-object v2

    new-instance v3, Ll8/b;

    invoke-direct {v3, v2}, Ll8/b;-><init>(Lcom/google/protobuf/l0;)V

    iput-object v3, v0, Le8/m1;->b:Le8/n1;

    invoke-virtual {v0}, Le8/m1;->a()Le8/p1;

    move-result-object v0

    sput-object v0, Lo7/d0;->e:Le8/p1;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    :cond_1
    move-object v4, v0

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :goto_2
    sget-object v6, Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;->LISTEN_STREAM_CONNECTION_BACKOFF:Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;

    sget-object v7, Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;->LISTEN_STREAM_IDLE:Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;

    sget-object v8, Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;->HEALTH_CHECK_TIMEOUT:Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v9, p4

    invoke-direct/range {v2 .. v9}, Lcom/google/firebase/firestore/remote/AbstractStream;-><init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;Le8/p1;Lcom/google/firebase/firestore/util/AsyncQueue;Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;Lcom/google/firebase/firestore/remote/Stream$StreamCallback;)V

    iput-object p3, p0, Lcom/google/firebase/firestore/remote/WatchStream;->serializer:Lcom/google/firebase/firestore/remote/RemoteSerializer;

    return-void
.end method


# virtual methods
.method public bridge synthetic inhibitBackoff()V
    .locals 0

    invoke-super {p0}, Lcom/google/firebase/firestore/remote/AbstractStream;->inhibitBackoff()V

    return-void
.end method

.method public bridge synthetic isOpen()Z
    .locals 1

    invoke-super {p0}, Lcom/google/firebase/firestore/remote/AbstractStream;->isOpen()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isStarted()Z
    .locals 1

    invoke-super {p0}, Lcom/google/firebase/firestore/remote/AbstractStream;->isStarted()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lo7/h0;

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/remote/WatchStream;->onNext(Lo7/h0;)V

    return-void
.end method

.method public onNext(Lo7/h0;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/AbstractStream;->backoff:Lcom/google/firebase/firestore/util/ExponentialBackoff;

    .line 2
    invoke-virtual {v0}, Lcom/google/firebase/firestore/util/ExponentialBackoff;->reset()V

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/WatchStream;->serializer:Lcom/google/firebase/firestore/remote/RemoteSerializer;

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/remote/RemoteSerializer;->decodeWatchChange(Lo7/h0;)Lcom/google/firebase/firestore/remote/WatchChange;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/WatchStream;->serializer:Lcom/google/firebase/firestore/remote/RemoteSerializer;

    .line 4
    invoke-virtual {v1, p1}, Lcom/google/firebase/firestore/remote/RemoteSerializer;->decodeVersionFromListenResponse(Lo7/h0;)Lcom/google/firebase/firestore/model/SnapshotVersion;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/AbstractStream;->listener:Lcom/google/firebase/firestore/remote/Stream$StreamCallback;

    .line 5
    check-cast v1, Lcom/google/firebase/firestore/remote/WatchStream$Callback;

    invoke-interface {v1, p1, v0}, Lcom/google/firebase/firestore/remote/WatchStream$Callback;->onWatchChange(Lcom/google/firebase/firestore/model/SnapshotVersion;Lcom/google/firebase/firestore/remote/WatchChange;)V

    return-void
.end method

.method public bridge synthetic start()V
    .locals 0

    invoke-super {p0}, Lcom/google/firebase/firestore/remote/AbstractStream;->start()V

    return-void
.end method

.method public bridge synthetic stop()V
    .locals 0

    invoke-super {p0}, Lcom/google/firebase/firestore/remote/AbstractStream;->stop()V

    return-void
.end method

.method public unwatchTarget(I)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/firebase/firestore/remote/WatchStream;->isOpen()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unwatching targets requires an open stream"

    invoke-static {v0, v2, v1}, Lcom/google/firebase/firestore/util/Assert;->hardAssert(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lo7/g0;->k()Lo7/e0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/WatchStream;->serializer:Lcom/google/firebase/firestore/remote/RemoteSerializer;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/remote/RemoteSerializer;->databaseName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo7/e0;->e(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lo7/e0;->f(I)V

    invoke-virtual {v0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p1

    check-cast p1, Lo7/g0;

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/remote/AbstractStream;->writeRequest(Ljava/lang/Object;)V

    return-void
.end method

.method public watchQuery(Lcom/google/firebase/firestore/local/TargetData;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/firebase/firestore/remote/WatchStream;->isOpen()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Watching queries requires an open stream"

    invoke-static {v0, v2, v1}, Lcom/google/firebase/firestore/util/Assert;->hardAssert(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lo7/g0;->k()Lo7/e0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/WatchStream;->serializer:Lcom/google/firebase/firestore/remote/RemoteSerializer;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/remote/RemoteSerializer;->databaseName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo7/e0;->e(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/WatchStream;->serializer:Lcom/google/firebase/firestore/remote/RemoteSerializer;

    invoke-virtual {v1, p1}, Lcom/google/firebase/firestore/remote/RemoteSerializer;->encodeTarget(Lcom/google/firebase/firestore/local/TargetData;)Lo7/a2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo7/e0;->d(Lo7/a2;)V

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/WatchStream;->serializer:Lcom/google/firebase/firestore/remote/RemoteSerializer;

    invoke-virtual {v1, p1}, Lcom/google/firebase/firestore/remote/RemoteSerializer;->encodeListenRequestLabels(Lcom/google/firebase/firestore/local/TargetData;)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lo7/e0;->c(Ljava/util/Map;)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/g0;->build()Lcom/google/protobuf/l0;

    move-result-object p1

    check-cast p1, Lo7/g0;

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/remote/AbstractStream;->writeRequest(Ljava/lang/Object;)V

    return-void
.end method
