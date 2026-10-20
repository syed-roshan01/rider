.class public final synthetic Lcom/google/firebase/firestore/local/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/local/LocalStore;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/local/LocalStore;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/local/e;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/e;->b:Lcom/google/firebase/firestore/local/LocalStore;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/local/e;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/e;->b:Lcom/google/firebase/firestore/local/LocalStore;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1}, Lcom/google/firebase/firestore/local/LocalStore;->a(Lcom/google/firebase/firestore/local/LocalStore;)V

    return-void

    :pswitch_0
    invoke-static {v1}, Lcom/google/firebase/firestore/local/LocalStore;->c(Lcom/google/firebase/firestore/local/LocalStore;)V

    return-void

    :pswitch_1
    invoke-static {v1}, Lcom/google/firebase/firestore/local/LocalStore;->d(Lcom/google/firebase/firestore/local/LocalStore;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
