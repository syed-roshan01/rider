.class public final synthetic Lcom/google/firebase/firestore/util/a;
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

    iput p2, p0, Lcom/google/firebase/firestore/util/a;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/util/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/util/a;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/util/a;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Ljava/lang/RuntimeException;

    invoke-static {v1}, Lcom/google/firebase/firestore/util/Util;->a(Ljava/lang/RuntimeException;)V

    return-void

    :pswitch_0
    check-cast v1, Lcom/google/firebase/firestore/util/AsyncQueue$DelayedTask;

    invoke-static {v1}, Lcom/google/firebase/firestore/util/AsyncQueue$DelayedTask;->a(Lcom/google/firebase/firestore/util/AsyncQueue$DelayedTask;)V

    return-void

    :pswitch_1
    check-cast v1, Ljava/lang/Throwable;

    invoke-static {v1}, Lcom/google/firebase/firestore/util/AsyncQueue;->f(Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
