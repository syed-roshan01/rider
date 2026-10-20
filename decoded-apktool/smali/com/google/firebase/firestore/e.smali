.class public final synthetic Lcom/google/firebase/firestore/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lcom/google/firebase/firestore/e;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/firebase/firestore/e;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/e;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lcom/google/firebase/firestore/e;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/e;->d:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/e;->c:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/firebase/firestore/e;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lcom/google/firebase/firestore/core/FirestoreClient;

    check-cast v2, Lcom/google/firebase/firestore/TransactionOptions;

    check-cast v1, Lcom/google/firebase/firestore/util/Function;

    invoke-static {v3, v2, v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->l(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/firebase/firestore/TransactionOptions;Lcom/google/firebase/firestore/util/Function;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v3, Lcom/google/firebase/firestore/FirebaseFirestore;

    check-cast v2, Lcom/google/firebase/firestore/Transaction$Function;

    check-cast v1, Lcom/google/firebase/firestore/core/Transaction;

    invoke-static {v3, v2, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->f(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/Transaction$Function;Lcom/google/firebase/firestore/core/Transaction;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
