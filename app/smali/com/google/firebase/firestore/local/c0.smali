.class public final synthetic Lcom/google/firebase/firestore/local/c0;
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

    iput-object p1, p0, Lcom/google/firebase/firestore/local/c0;->b:Ljava/lang/Object;

    iput p2, p0, Lcom/google/firebase/firestore/local/c0;->a:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/local/c0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;

    iget v1, p0, Lcom/google/firebase/firestore/local/c0;->a:I

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;->l(Lcom/google/firebase/firestore/local/SQLiteMutationQueue;ILandroid/database/Cursor;)Lcom/google/firebase/firestore/model/mutation/MutationBatch;

    move-result-object p1

    return-object p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/local/c0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/local/LocalStore;

    iget v1, p0, Lcom/google/firebase/firestore/local/c0;->a:I

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/local/LocalStore;->q(Lcom/google/firebase/firestore/local/LocalStore;I)Lcom/google/firebase/database/collection/ImmutableSortedMap;

    move-result-object v0

    return-object v0
.end method
