.class public final synthetic Lcom/google/firebase/firestore/local/o;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Function;
.implements Lcom/google/firebase/firestore/util/Supplier;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/local/o;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/o;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/local/o;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/o;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/firebase/firestore/local/SQLiteDocumentOverlayCache;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteDocumentOverlayCache;->a(Lcom/google/firebase/firestore/local/SQLiteDocumentOverlayCache;Landroid/database/Cursor;)Lcom/google/firebase/firestore/model/mutation/Overlay;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v1, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;->a(Lcom/google/firebase/firestore/local/SQLiteMutationQueue;Landroid/database/Cursor;)Lcom/google/firebase/firestore/model/mutation/MutationBatch;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteBundleCache;->a(Ljava/lang/String;Landroid/database/Cursor;)Lcom/google/firebase/firestore/bundle/BundleMetadata;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/local/o;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/o;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/firebase/firestore/local/LocalStore;

    invoke-static {v1}, Lcom/google/firebase/firestore/local/LocalStore;->s(Lcom/google/firebase/firestore/local/LocalStore;)Ljava/util/Collection;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v1, Lcom/google/firebase/firestore/local/IndexBackfiller;

    invoke-static {v1}, Lcom/google/firebase/firestore/local/IndexBackfiller;->a(Lcom/google/firebase/firestore/local/IndexBackfiller;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
