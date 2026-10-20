.class public final synthetic Lcom/google/firebase/firestore/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/g;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/g;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/g;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/g;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/firebase/firestore/Transaction;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/Transaction;->a(Lcom/google/firebase/firestore/Transaction;Lcom/google/android/gms/tasks/Task;)Lcom/google/firebase/firestore/DocumentSnapshot;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v1, Lcom/google/firebase/firestore/Query;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/Query;->b(Lcom/google/firebase/firestore/Query;Lcom/google/android/gms/tasks/Task;)Lcom/google/firebase/firestore/QuerySnapshot;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast v1, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->a(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/android/gms/tasks/Task;)Lcom/google/firebase/firestore/Query;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
