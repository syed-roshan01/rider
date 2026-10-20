.class public final synthetic Lcom/google/firebase/firestore/local/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Function;
.implements Lcom/google/firebase/firestore/util/Supplier;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/firebase/firestore/local/p;->a:I

    iput-object p2, p0, Lcom/google/firebase/firestore/local/p;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/local/p;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/local/p;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/p;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/local/p;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/firebase/firestore/core/Query;

    check-cast v1, Ljava/util/Set;

    check-cast p1, Lcom/google/firebase/firestore/model/MutableDocument;

    invoke-static {v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteRemoteDocumentCache;->c(Lcom/google/firebase/firestore/core/Query;Ljava/util/Set;Lcom/google/firebase/firestore/model/MutableDocument;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v2, Lcom/google/firebase/firestore/local/SQLiteBundleCache;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteBundleCache;->b(Lcom/google/firebase/firestore/local/SQLiteBundleCache;Ljava/lang/String;Landroid/database/Cursor;)Lcom/google/firebase/firestore/bundle/NamedQuery;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/local/p;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/p;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/local/p;->b:Ljava/lang/Object;

    check-cast v2, Lcom/google/firebase/firestore/local/LocalStore;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/local/LocalStore;->m(Lcom/google/firebase/firestore/local/LocalStore;Ljava/lang/String;)Lcom/google/firebase/firestore/bundle/NamedQuery;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v1, Lcom/google/firebase/firestore/bundle/BundleMetadata;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/local/LocalStore;->k(Lcom/google/firebase/firestore/local/LocalStore;Lcom/google/firebase/firestore/bundle/BundleMetadata;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v1, Lcom/google/firebase/firestore/model/mutation/MutationBatchResult;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/local/LocalStore;->o(Lcom/google/firebase/firestore/local/LocalStore;Lcom/google/firebase/firestore/model/mutation/MutationBatchResult;)Lcom/google/firebase/database/collection/ImmutableSortedMap;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v1, Lcom/google/firebase/firestore/local/LruGarbageCollector;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/local/LocalStore;->e(Lcom/google/firebase/firestore/local/LocalStore;Lcom/google/firebase/firestore/local/LruGarbageCollector;)Lcom/google/firebase/firestore/local/LruGarbageCollector$Results;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
