.class public final synthetic Lcom/google/firebase/firestore/local/a0;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/local/SQLiteMutationQueue;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/local/SQLiteMutationQueue;Ljava/util/ArrayList;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/firebase/firestore/local/a0;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/a0;->b:Lcom/google/firebase/firestore/local/SQLiteMutationQueue;

    iput-object p2, p0, Lcom/google/firebase/firestore/local/a0;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/local/a0;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/a0;->b:Lcom/google/firebase/firestore/local/SQLiteMutationQueue;

    iget-object v2, p0, Lcom/google/firebase/firestore/local/a0;->c:Ljava/util/List;

    check-cast p1, Landroid/database/Cursor;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1, v2, p1}, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;->c(Lcom/google/firebase/firestore/local/SQLiteMutationQueue;Ljava/util/List;Landroid/database/Cursor;)V

    return-void

    :pswitch_0
    invoke-static {v1, v2, p1}, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;->d(Lcom/google/firebase/firestore/local/SQLiteMutationQueue;Ljava/util/List;Landroid/database/Cursor;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
