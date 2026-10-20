.class public final synthetic Lcom/google/firebase/firestore/remote/h;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/remote/OnlineStateTracker$OnlineStateCallback;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/h;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final handleOnlineStateChange(Lcom/google/firebase/firestore/core/OnlineState;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/h;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/remote/RemoteStore$RemoteStoreCallback;

    invoke-interface {v0, p1}, Lcom/google/firebase/firestore/remote/RemoteStore$RemoteStoreCallback;->handleOnlineStateChange(Lcom/google/firebase/firestore/core/OnlineState;)V

    return-void
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/h;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/remote/Datastore;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/remote/Datastore;->b(Lcom/google/firebase/firestore/remote/Datastore;Lcom/google/android/gms/tasks/Task;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
