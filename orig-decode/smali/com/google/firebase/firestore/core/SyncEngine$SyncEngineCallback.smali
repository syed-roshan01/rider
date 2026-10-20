.class interface abstract Lcom/google/firebase/firestore/core/SyncEngine$SyncEngineCallback;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/core/SyncEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "SyncEngineCallback"
.end annotation


# virtual methods
.method public abstract handleOnlineStateChange(Lcom/google/firebase/firestore/core/OnlineState;)V
.end method

.method public abstract onError(Lcom/google/firebase/firestore/core/Query;Le8/c2;)V
.end method

.method public abstract onViewSnapshots(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/core/ViewSnapshot;",
            ">;)V"
        }
    .end annotation
.end method
