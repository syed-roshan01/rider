.class public final synthetic Lcom/google/firebase/firestore/local/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/local/LocalStore;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/local/LocalStore;Ljava/util/List;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/firebase/firestore/local/f;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/f;->b:Lcom/google/firebase/firestore/local/LocalStore;

    iput-object p2, p0, Lcom/google/firebase/firestore/local/f;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/local/f;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/f;->c:Ljava/util/List;

    iget-object v2, p0, Lcom/google/firebase/firestore/local/f;->b:Lcom/google/firebase/firestore/local/LocalStore;

    packed-switch v0, :pswitch_data_0

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/local/LocalStore;->n(Lcom/google/firebase/firestore/local/LocalStore;Ljava/util/List;)V

    return-void

    :pswitch_0
    invoke-static {v2, v1}, Lcom/google/firebase/firestore/local/LocalStore;->r(Lcom/google/firebase/firestore/local/LocalStore;Ljava/util/List;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
