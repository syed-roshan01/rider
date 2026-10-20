.class public final synthetic Lcom/google/firebase/firestore/core/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/core/TransactionRunner;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/core/TransactionRunner;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/firebase/firestore/core/g;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/core/g;->b:Lcom/google/firebase/firestore/core/TransactionRunner;

    iput-object p2, p0, Lcom/google/firebase/firestore/core/g;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/core/g;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/core/g;->b:Lcom/google/firebase/firestore/core/TransactionRunner;

    iget-object v2, p0, Lcom/google/firebase/firestore/core/g;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/android/gms/tasks/Task;

    invoke-static {v1, v2, p1}, Lcom/google/firebase/firestore/core/TransactionRunner;->b(Lcom/google/firebase/firestore/core/TransactionRunner;Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)V

    return-void

    :pswitch_0
    check-cast v2, Lcom/google/firebase/firestore/core/Transaction;

    invoke-static {v1, v2, p1}, Lcom/google/firebase/firestore/core/TransactionRunner;->a(Lcom/google/firebase/firestore/core/TransactionRunner;Lcom/google/firebase/firestore/core/Transaction;Lcom/google/android/gms/tasks/Task;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
