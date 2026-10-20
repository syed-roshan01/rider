.class Lcom/google/firebase/firestore/remote/FirestoreChannel$2;
.super Le8/i0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/firestore/remote/FirestoreChannel;->runBidiStreamingRpc(Le8/p1;Lcom/google/firebase/firestore/remote/IncomingStreamObserver;)Le8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le8/i0;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/firebase/firestore/remote/FirestoreChannel;

.field final synthetic val$call:[Le8/k;

.field final synthetic val$clientCall:Lcom/google/android/gms/tasks/Task;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;[Le8/k;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$2;->this$0:Lcom/google/firebase/firestore/remote/FirestoreChannel;

    iput-object p2, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$2;->val$call:[Le8/k;

    iput-object p3, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$2;->val$clientCall:Lcom/google/android/gms/tasks/Task;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public delegate()Le8/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le8/k;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$2;->val$call:[Le8/k;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v2, "ClientCall used before onOpen() callback"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lcom/google/firebase/firestore/util/Assert;->hardAssert(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$2;->val$call:[Le8/k;

    aget-object v0, v0, v1

    return-object v0
.end method

.method public halfClose()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$2;->val$call:[Le8/k;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$2;->val$clientCall:Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$2;->this$0:Lcom/google/firebase/firestore/remote/FirestoreChannel;

    invoke-static {v1}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->access$000(Lcom/google/firebase/firestore/remote/FirestoreChannel;)Lcom/google/firebase/firestore/util/AsyncQueue;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/firestore/util/AsyncQueue;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lb0/l0;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lb0/l0;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    :cond_0
    invoke-super {p0}, Le8/i0;->halfClose()V

    :goto_0
    return-void
.end method
