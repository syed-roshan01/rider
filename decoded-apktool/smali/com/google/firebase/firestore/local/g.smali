.class public final synthetic Lcom/google/firebase/firestore/local/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/local/LocalStore;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/local/LocalStore;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/firebase/firestore/local/g;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/g;->b:Lcom/google/firebase/firestore/local/LocalStore;

    iput-object p2, p0, Lcom/google/firebase/firestore/local/g;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/local/g;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/g;->b:Lcom/google/firebase/firestore/local/LocalStore;

    iget-object v2, p0, Lcom/google/firebase/firestore/local/g;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/protobuf/n;

    invoke-static {v1, v2}, Lcom/google/firebase/firestore/local/LocalStore;->g(Lcom/google/firebase/firestore/local/LocalStore;Lcom/google/protobuf/n;)V

    return-void

    :pswitch_0
    check-cast v2, Lcom/google/firebase/firestore/bundle/BundleMetadata;

    invoke-static {v1, v2}, Lcom/google/firebase/firestore/local/LocalStore;->b(Lcom/google/firebase/firestore/local/LocalStore;Lcom/google/firebase/firestore/bundle/BundleMetadata;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
