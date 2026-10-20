.class public final synthetic Lcom/google/firebase/firestore/local/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Supplier;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/local/LocalStore;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/local/LocalStore;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lcom/google/firebase/firestore/local/d;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/d;->b:Lcom/google/firebase/firestore/local/LocalStore;

    iput-object p2, p0, Lcom/google/firebase/firestore/local/d;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/local/d;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lcom/google/firebase/firestore/local/d;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/d;->b:Lcom/google/firebase/firestore/local/LocalStore;

    iget-object v2, p0, Lcom/google/firebase/firestore/local/d;->d:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/firebase/firestore/local/d;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lcom/google/firebase/firestore/remote/RemoteEvent;

    check-cast v2, Lcom/google/firebase/firestore/model/SnapshotVersion;

    invoke-static {v1, v3, v2}, Lcom/google/firebase/firestore/local/LocalStore;->p(Lcom/google/firebase/firestore/local/LocalStore;Lcom/google/firebase/firestore/remote/RemoteEvent;Lcom/google/firebase/firestore/model/SnapshotVersion;)Lcom/google/firebase/database/collection/ImmutableSortedMap;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v3, Lcom/google/firebase/database/collection/ImmutableSortedMap;

    check-cast v2, Lcom/google/firebase/firestore/local/TargetData;

    invoke-static {v1, v3, v2}, Lcom/google/firebase/firestore/local/LocalStore;->h(Lcom/google/firebase/firestore/local/LocalStore;Lcom/google/firebase/database/collection/ImmutableSortedMap;Lcom/google/firebase/firestore/local/TargetData;)Lcom/google/firebase/database/collection/ImmutableSortedMap;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
