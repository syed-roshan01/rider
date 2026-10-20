.class public final synthetic Lcom/google/firebase/firestore/core/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/core/FirestoreClient;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/core/FirestoreClient;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/core/b;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/core/b;->b:Lcom/google/firebase/firestore/core/FirestoreClient;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/core/b;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/core/b;->b:Lcom/google/firebase/firestore/core/FirestoreClient;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->t(Lcom/google/firebase/firestore/core/FirestoreClient;)V

    return-void

    :pswitch_0
    invoke-static {v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->v(Lcom/google/firebase/firestore/core/FirestoreClient;)V

    return-void

    :pswitch_1
    invoke-static {v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->c(Lcom/google/firebase/firestore/core/FirestoreClient;)V

    return-void

    :pswitch_2
    invoke-static {v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->k(Lcom/google/firebase/firestore/core/FirestoreClient;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
