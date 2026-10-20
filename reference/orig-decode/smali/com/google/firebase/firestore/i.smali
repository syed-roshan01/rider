.class public final synthetic Lcom/google/firebase/firestore/i;
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

    iput p1, p0, Lcom/google/firebase/firestore/i;->a:I

    iput-object p2, p0, Lcom/google/firebase/firestore/i;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/i;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/i;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/i;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/i;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/firebase/firestore/LoadBundleTask;

    check-cast v1, Lcom/google/firebase/firestore/OnProgressListener;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/LoadBundleTask;->a(Lcom/google/firebase/firestore/LoadBundleTask;Lcom/google/firebase/firestore/OnProgressListener;)V

    return-void

    :pswitch_0
    check-cast v2, Lcom/google/firebase/firestore/FirebaseFirestore;

    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void

    :pswitch_1
    check-cast v2, Lcom/google/firebase/firestore/LoadBundleTask$ManagedListener;

    check-cast v1, Lcom/google/firebase/firestore/LoadBundleTaskProgress;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/LoadBundleTask$ManagedListener;->a(Lcom/google/firebase/firestore/LoadBundleTask$ManagedListener;Lcom/google/firebase/firestore/LoadBundleTaskProgress;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
