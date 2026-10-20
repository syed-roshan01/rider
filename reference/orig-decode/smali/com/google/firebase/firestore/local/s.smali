.class public final synthetic Lcom/google/firebase/firestore/local/s;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/firebase/firestore/local/s;->a:I

    iput-object p2, p0, Lcom/google/firebase/firestore/local/s;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/local/s;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/s;->b:Ljava/util/List;

    check-cast p1, Landroid/database/Cursor;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;->h(Ljava/util/List;Landroid/database/Cursor;)V

    return-void

    :pswitch_0
    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;->j(Ljava/util/List;Landroid/database/Cursor;)V

    return-void

    :pswitch_1
    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteIndexManager;->e(Ljava/util/List;Landroid/database/Cursor;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
