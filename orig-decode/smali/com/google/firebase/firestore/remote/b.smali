.class public final synthetic Lcom/google/firebase/firestore/remote/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/remote/b;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/remote/b;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/b;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/firebase/firestore/remote/OnlineStateTracker;

    invoke-static {v1}, Lcom/google/firebase/firestore/remote/OnlineStateTracker;->a(Lcom/google/firebase/firestore/remote/OnlineStateTracker;)V

    return-void

    :pswitch_0
    check-cast v1, Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;

    invoke-static {v1}, Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;->b(Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
