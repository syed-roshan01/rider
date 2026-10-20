.class Lcom/google/firebase/firestore/remote/FirestoreChannel$3;
.super Le8/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/firestore/remote/FirestoreChannel;->lambda$runStreamingResponseRpc$1(Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/firebase/firestore/remote/FirestoreChannel;

.field final synthetic val$call:Le8/k;

.field final synthetic val$callback:Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;Le8/k;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$3;->this$0:Lcom/google/firebase/firestore/remote/FirestoreChannel;

    iput-object p2, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$3;->val$callback:Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;

    iput-object p3, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$3;->val$call:Le8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClose(Le8/c2;Le8/l1;)V
    .locals 0

    iget-object p2, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$3;->val$callback:Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;

    invoke-virtual {p2, p1}, Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;->onClose(Le8/c2;)V

    return-void
.end method

.method public onMessage(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$3;->val$callback:Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;->onMessage(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel$3;->val$call:Le8/k;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Le8/k;->request(I)V

    return-void
.end method
