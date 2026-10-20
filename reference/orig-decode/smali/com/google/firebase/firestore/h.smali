.class public final synthetic Lcom/google/firebase/firestore/h;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/EventListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/h;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/h;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onEvent(Ljava/lang/Object;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/h;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/h;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Ljava/lang/Runnable;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v1, p1, p2}, Lcom/google/firebase/firestore/FirebaseFirestore;->b(Ljava/lang/Runnable;Ljava/lang/Void;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V

    return-void

    :pswitch_0
    check-cast v1, Lo9/r;

    check-cast p1, Lcom/google/firebase/firestore/QuerySnapshot;

    invoke-static {v1, p1, p2}, Lcom/google/firebase/firestore/FirestoreKt$snapshots$2;->h(Lo9/r;Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V

    return-void

    :pswitch_1
    check-cast v1, Lo9/r;

    check-cast p1, Lcom/google/firebase/firestore/DocumentSnapshot;

    invoke-static {v1, p1, p2}, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->h(Lo9/r;Lcom/google/firebase/firestore/DocumentSnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
