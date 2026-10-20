.class public final synthetic Lcom/google/firebase/firestore/util/d;
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

    iput p1, p0, Lcom/google/firebase/firestore/util/d;->a:I

    iput-object p2, p0, Lcom/google/firebase/firestore/util/d;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/util/d;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/util/d;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/util/d;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/util/d;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/firebase/firestore/util/ExponentialBackoff;

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/util/ExponentialBackoff;->a(Lcom/google/firebase/firestore/util/ExponentialBackoff;Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    check-cast v2, Lcom/google/firebase/firestore/util/BackgroundQueue;

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/util/BackgroundQueue;->a(Lcom/google/firebase/firestore/util/BackgroundQueue;Ljava/lang/Runnable;)V

    return-void

    :pswitch_1
    check-cast v2, Lcom/google/firebase/firestore/util/AsyncQueue;

    check-cast v1, Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/util/AsyncQueue;->b(Lcom/google/firebase/firestore/util/AsyncQueue;Lcom/google/firebase/firestore/util/AsyncQueue$TimerId;)V

    return-void

    :pswitch_2
    check-cast v2, Lcom/google/firebase/firestore/util/ThrottledForwardingExecutor;

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/util/ThrottledForwardingExecutor;->a(Lcom/google/firebase/firestore/util/ThrottledForwardingExecutor;Ljava/lang/Runnable;)V

    return-void

    :pswitch_3
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    check-cast v1, Ljava/util/concurrent/Callable;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/util/AsyncQueue$SynchronizedShutdownAwareExecutor;->c(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/util/concurrent/Callable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
