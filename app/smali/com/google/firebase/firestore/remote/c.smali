.class public final synthetic Lcom/google/firebase/firestore/remote/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/firebase/firestore/remote/c;->a:I

    iput-object p2, p0, Lcom/google/firebase/firestore/remote/c;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/remote/c;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/remote/c;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/c;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/remote/c;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/firebase/firestore/remote/RemoteStore;

    check-cast v1, Lcom/google/firebase/firestore/remote/ConnectivityMonitor$NetworkStatus;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/RemoteStore;->b(Lcom/google/firebase/firestore/remote/RemoteStore;Lcom/google/firebase/firestore/remote/ConnectivityMonitor$NetworkStatus;)V

    return-void

    :pswitch_0
    check-cast v2, Lcom/google/firebase/firestore/remote/AndroidConnectivityMonitor;

    check-cast v1, Lcom/google/firebase/firestore/remote/AndroidConnectivityMonitor$NetworkReceiver;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/AndroidConnectivityMonitor;->a(Lcom/google/firebase/firestore/remote/AndroidConnectivityMonitor;Lcom/google/firebase/firestore/remote/AndroidConnectivityMonitor$NetworkReceiver;)V

    return-void

    :pswitch_1
    check-cast v2, Lcom/google/firebase/firestore/remote/AndroidConnectivityMonitor;

    check-cast v1, Lcom/google/firebase/firestore/remote/AndroidConnectivityMonitor$DefaultNetworkCallback;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/AndroidConnectivityMonitor;->b(Lcom/google/firebase/firestore/remote/AndroidConnectivityMonitor;Lcom/google/firebase/firestore/remote/AndroidConnectivityMonitor$DefaultNetworkCallback;)V

    return-void

    :pswitch_2
    check-cast v2, Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;

    check-cast v1, Le8/l1;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;->a(Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;Le8/l1;)V

    return-void

    :pswitch_3
    check-cast v2, Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;->c(Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;Ljava/lang/Object;)V

    return-void

    :pswitch_4
    check-cast v2, Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;

    check-cast v1, Le8/c2;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;->d(Lcom/google/firebase/firestore/remote/AbstractStream$StreamObserver;Le8/c2;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
