.class public final synthetic Lcom/google/firebase/firestore/local/t;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/local/SQLiteIndexManager;

.field public final synthetic c:Lcom/google/firebase/firestore/model/Document;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/local/SQLiteIndexManager;Lcom/google/firebase/firestore/model/Document;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/firebase/firestore/local/t;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/t;->b:Lcom/google/firebase/firestore/local/SQLiteIndexManager;

    iput-object p2, p0, Lcom/google/firebase/firestore/local/t;->c:Lcom/google/firebase/firestore/model/Document;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/local/t;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/t;->b:Lcom/google/firebase/firestore/local/SQLiteIndexManager;

    iget-object v2, p0, Lcom/google/firebase/firestore/local/t;->c:Lcom/google/firebase/firestore/model/Document;

    check-cast p1, Lcom/google/firebase/firestore/index/IndexEntry;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1, v2, p1}, Lcom/google/firebase/firestore/local/SQLiteIndexManager;->a(Lcom/google/firebase/firestore/local/SQLiteIndexManager;Lcom/google/firebase/firestore/model/Document;Lcom/google/firebase/firestore/index/IndexEntry;)V

    return-void

    :pswitch_0
    invoke-static {v1, v2, p1}, Lcom/google/firebase/firestore/local/SQLiteIndexManager;->f(Lcom/google/firebase/firestore/local/SQLiteIndexManager;Lcom/google/firebase/firestore/model/Document;Lcom/google/firebase/firestore/index/IndexEntry;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
