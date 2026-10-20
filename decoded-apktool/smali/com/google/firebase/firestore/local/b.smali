.class public final synthetic Lcom/google/firebase/firestore/local/b;
.super Ljava/lang/Object;

# interfaces
.implements Lq6/m;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/local/LocalStore;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/local/LocalStore;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/local/b;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/b;->b:Lcom/google/firebase/firestore/local/LocalStore;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/local/b;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/b;->b:Lcom/google/firebase/firestore/local/LocalStore;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Lcom/google/firebase/firestore/local/LocalStore;->getLocalDocumentsForCurrentUser()Lcom/google/firebase/firestore/local/LocalDocumentsView;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {v1}, Lcom/google/firebase/firestore/local/LocalStore;->getIndexManagerForCurrentUser()Lcom/google/firebase/firestore/local/IndexManager;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
