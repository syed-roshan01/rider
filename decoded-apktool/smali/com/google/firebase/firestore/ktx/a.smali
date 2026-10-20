.class public final synthetic Lcom/google/firebase/firestore/ktx/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/EventListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lo9/r;


# direct methods
.method public synthetic constructor <init>(Lo9/r;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/ktx/a;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/ktx/a;->b:Lo9/r;

    return-void
.end method


# virtual methods
.method public final onEvent(Ljava/lang/Object;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/ktx/a;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/ktx/a;->b:Lo9/r;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/google/firebase/firestore/QuerySnapshot;

    invoke-static {v1, p1, p2}, Lcom/google/firebase/firestore/ktx/FirestoreKt$snapshots$2;->h(Lo9/r;Lcom/google/firebase/firestore/QuerySnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V

    return-void

    :pswitch_0
    check-cast p1, Lcom/google/firebase/firestore/DocumentSnapshot;

    invoke-static {v1, p1, p2}, Lcom/google/firebase/firestore/ktx/FirestoreKt$snapshots$1;->h(Lo9/r;Lcom/google/firebase/firestore/DocumentSnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
