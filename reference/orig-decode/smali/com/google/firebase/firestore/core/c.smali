.class public final synthetic Lcom/google/firebase/firestore/core/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/core/FirestoreClient;

.field public final synthetic c:Lcom/google/firebase/firestore/EventListener;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/firebase/firestore/EventListener;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/firebase/firestore/core/c;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/core/c;->b:Lcom/google/firebase/firestore/core/FirestoreClient;

    iput-object p2, p0, Lcom/google/firebase/firestore/core/c;->c:Lcom/google/firebase/firestore/EventListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/core/c;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/core/c;->c:Lcom/google/firebase/firestore/EventListener;

    iget-object v2, p0, Lcom/google/firebase/firestore/core/c;->b:Lcom/google/firebase/firestore/core/FirestoreClient;

    packed-switch v0, :pswitch_data_0

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->j(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/firebase/firestore/EventListener;)V

    return-void

    :pswitch_0
    invoke-static {v2, v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->o(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/firebase/firestore/EventListener;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
