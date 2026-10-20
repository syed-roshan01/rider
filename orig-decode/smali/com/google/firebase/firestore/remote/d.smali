.class public final synthetic Lcom/google/firebase/firestore/remote/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/firebase/firestore/remote/d;->a:I

    iput-object p2, p0, Lcom/google/firebase/firestore/remote/d;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/remote/d;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/remote/d;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/d;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/remote/d;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    check-cast v1, Le8/p1;

    invoke-static {v2, v1, p1}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->c(Lcom/google/firebase/firestore/remote/GrpcCallProvider;Le8/p1;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v2, Lcom/google/firebase/firestore/remote/Datastore;

    check-cast v1, Ljava/util/HashMap;

    invoke-static {v2, v1, p1}, Lcom/google/firebase/firestore/remote/Datastore;->a(Lcom/google/firebase/firestore/remote/Datastore;Ljava/util/HashMap;Lcom/google/android/gms/tasks/Task;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
