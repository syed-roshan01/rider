.class Lcom/google/firebase/firestore/remote/Datastore$1;
.super Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/firestore/remote/Datastore;->lookup(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener<",
        "Lo7/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/firebase/firestore/remote/Datastore;

.field final synthetic val$completionSource:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic val$keys:Ljava/util/List;

.field final synthetic val$responses:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/remote/Datastore;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->this$0:Lcom/google/firebase/firestore/remote/Datastore;

    iput-object p2, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$responses:Ljava/util/List;

    iput-object p3, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$keys:Ljava/util/List;

    iput-object p4, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$completionSource:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onClose(Le8/c2;)V
    .locals 2

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$completionSource:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/google/firebase/firestore/util/Util;->exceptionFromStatus(Le8/c2;)Lcom/google/firebase/firestore/FirebaseFirestoreException;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/FirebaseFirestoreException;->getCode()Lcom/google/firebase/firestore/FirebaseFirestoreException$Code;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/firestore/FirebaseFirestoreException$Code;->UNAUTHENTICATED:Lcom/google/firebase/firestore/FirebaseFirestoreException$Code;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->this$0:Lcom/google/firebase/firestore/remote/Datastore;

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/Datastore;->access$100(Lcom/google/firebase/firestore/remote/Datastore;)Lcom/google/firebase/firestore/remote/FirestoreChannel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->invalidateToken()V

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$completionSource:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    :goto_0
    return-void
.end method

.method public bridge synthetic onMessage(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lo7/i;

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/remote/Datastore$1;->onMessage(Lo7/i;)V

    return-void
.end method

.method public onMessage(Lo7/i;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$responses:Ljava/util/List;

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$responses:Ljava/util/List;

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$keys:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne p1, v0, :cond_2

    .line 4
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$responses:Ljava/util/List;

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo7/i;

    iget-object v2, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->this$0:Lcom/google/firebase/firestore/remote/Datastore;

    .line 6
    invoke-static {v2}, Lcom/google/firebase/firestore/remote/Datastore;->access$000(Lcom/google/firebase/firestore/remote/Datastore;)Lcom/google/firebase/firestore/remote/RemoteSerializer;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/firebase/firestore/remote/RemoteSerializer;->decodeMaybeDocument(Lo7/i;)Lcom/google/firebase/firestore/model/MutableDocument;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/google/firebase/firestore/model/MutableDocument;->getKey()Lcom/google/firebase/firestore/model/DocumentKey;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$keys:Ljava/util/List;

    .line 9
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/firestore/model/DocumentKey;

    .line 10
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/firestore/model/MutableDocument;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/google/firebase/firestore/remote/Datastore$1;->val$completionSource:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 11
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
