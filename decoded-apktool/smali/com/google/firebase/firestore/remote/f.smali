.class public final synthetic Lcom/google/firebase/firestore/remote/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

.field public final synthetic c:Le8/c1;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/remote/GrpcCallProvider;Le8/c1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/firebase/firestore/remote/f;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/f;->b:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    iput-object p2, p0, Lcom/google/firebase/firestore/remote/f;->c:Le8/c1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/remote/f;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/f;->c:Le8/c1;

    iget-object v2, p0, Lcom/google/firebase/firestore/remote/f;->b:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    packed-switch v0, :pswitch_data_0

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->a(Lcom/google/firebase/firestore/remote/GrpcCallProvider;Le8/c1;)V

    return-void

    :pswitch_0
    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->b(Lcom/google/firebase/firestore/remote/GrpcCallProvider;Le8/c1;)V

    return-void

    :pswitch_1
    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->e(Lcom/google/firebase/firestore/remote/GrpcCallProvider;Le8/c1;)V

    return-void

    :pswitch_2
    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->f(Lcom/google/firebase/firestore/remote/GrpcCallProvider;Le8/c1;)V

    return-void

    :pswitch_3
    invoke-static {v2, v1}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->g(Lcom/google/firebase/firestore/remote/GrpcCallProvider;Le8/c1;)V

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
