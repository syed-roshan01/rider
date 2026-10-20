.class public final synthetic Lcom/google/firebase/firestore/remote/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/tasks/Task;Le8/d;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/firestore/remote/e;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/firebase/firestore/remote/e;->d:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/remote/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lcom/google/firebase/firestore/remote/e;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/firebase/firestore/remote/e;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/remote/e;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 4

    iget v0, p0, Lcom/google/firebase/firestore/remote/e;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/e;->d:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/remote/e;->c:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/firebase/firestore/remote/e;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lcom/google/firebase/firestore/remote/FirestoreChannel;

    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v3, v2, v1, p1}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->a(Lcom/google/firebase/firestore/remote/FirestoreChannel;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_0
    check-cast v3, Lcom/google/firebase/firestore/remote/FirestoreChannel;

    check-cast v2, Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;

    invoke-static {v3, v2, v1, p1}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->c(Lcom/google/firebase/firestore/remote/FirestoreChannel;Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_1
    check-cast v3, Lcom/google/firebase/firestore/remote/FirestoreChannel;

    check-cast v2, [Le8/k;

    check-cast v1, Lcom/google/firebase/firestore/remote/IncomingStreamObserver;

    invoke-static {v3, v2, v1, p1}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->b(Lcom/google/firebase/firestore/remote/FirestoreChannel;[Le8/k;Lcom/google/firebase/firestore/remote/IncomingStreamObserver;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_2
    check-cast v3, Lcom/google/android/gms/tasks/Task;

    check-cast v1, Le8/d;

    check-cast v2, Lcom/google/android/gms/tasks/Task;

    invoke-static {v3, v1, v2, p1}, Lcom/google/firebase/firestore/remote/FirestoreCallCredentials;->a(Lcom/google/android/gms/tasks/Task;Le8/d;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
