.class public final synthetic Lcom/google/firebase/firestore/local/u;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lcom/google/firebase/firestore/local/u;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/u;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/firebase/firestore/local/u;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/local/u;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lcom/google/firebase/firestore/local/u;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/u;->d:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/local/u;->c:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/firebase/firestore/local/u;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lcom/google/firebase/firestore/local/SQLiteTargetCache;

    check-cast v2, Landroid/util/SparseArray;

    check-cast v1, [I

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v3, v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteTargetCache;->d(Lcom/google/firebase/firestore/local/SQLiteTargetCache;Landroid/util/SparseArray;[ILandroid/database/Cursor;)V

    return-void

    :pswitch_0
    check-cast v3, Lcom/google/firebase/firestore/local/SQLiteTargetCache;

    check-cast v2, Lcom/google/firebase/firestore/core/Target;

    check-cast v1, Lcom/google/firebase/firestore/local/SQLiteTargetCache$TargetDataHolder;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v3, v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteTargetCache;->b(Lcom/google/firebase/firestore/local/SQLiteTargetCache;Lcom/google/firebase/firestore/core/Target;Lcom/google/firebase/firestore/local/SQLiteTargetCache$TargetDataHolder;Landroid/database/Cursor;)V

    return-void

    :pswitch_1
    check-cast v3, Lcom/google/firebase/firestore/local/SQLiteRemoteDocumentCache;

    check-cast v2, Lcom/google/firebase/firestore/util/BackgroundQueue;

    check-cast v1, Ljava/util/Map;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v3, v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteRemoteDocumentCache;->d(Lcom/google/firebase/firestore/local/SQLiteRemoteDocumentCache;Lcom/google/firebase/firestore/util/BackgroundQueue;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void

    :pswitch_2
    check-cast v3, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;

    check-cast v2, Ljava/util/Set;

    check-cast v1, Ljava/util/List;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v3, v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;->g(Lcom/google/firebase/firestore/local/SQLiteMutationQueue;Ljava/util/Set;Ljava/util/List;Landroid/database/Cursor;)V

    return-void

    :pswitch_3
    check-cast v3, Ljava/util/SortedSet;

    check-cast v2, Lcom/google/firebase/firestore/model/FieldIndex;

    check-cast v1, Lcom/google/firebase/firestore/model/DocumentKey;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v3, v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteIndexManager;->g(Ljava/util/SortedSet;Lcom/google/firebase/firestore/model/FieldIndex;Lcom/google/firebase/firestore/model/DocumentKey;Landroid/database/Cursor;)V

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
