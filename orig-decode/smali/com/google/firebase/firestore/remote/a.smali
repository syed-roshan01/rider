.class public final synthetic Lcom/google/firebase/firestore/remote/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/remote/AbstractStream;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/remote/AbstractStream;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/remote/a;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/a;->b:Lcom/google/firebase/firestore/remote/AbstractStream;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/remote/a;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/a;->b:Lcom/google/firebase/firestore/remote/AbstractStream;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1}, Lcom/google/firebase/firestore/remote/AbstractStream;->a(Lcom/google/firebase/firestore/remote/AbstractStream;)V

    return-void

    :pswitch_0
    invoke-static {v1}, Lcom/google/firebase/firestore/remote/AbstractStream;->b(Lcom/google/firebase/firestore/remote/AbstractStream;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
