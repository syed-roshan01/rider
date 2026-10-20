.class public final synthetic Lcom/google/firebase/firestore/local/v;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/firebase/firestore/local/v;->a:I

    iput-object p2, p0, Lcom/google/firebase/firestore/local/v;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/firestore/local/v;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lcom/google/firebase/firestore/local/v;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/v;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/firestore/local/v;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/firebase/firestore/local/SQLiteTargetCache;

    check-cast v1, Lcom/google/firebase/firestore/util/Consumer;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteTargetCache;->c(Lcom/google/firebase/firestore/local/SQLiteTargetCache;Lcom/google/firebase/firestore/util/Consumer;Landroid/database/Cursor;)V

    return-void

    :pswitch_0
    check-cast v2, [Z

    check-cast v1, Landroid/database/sqlite/SQLiteStatement;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->e([ZLandroid/database/sqlite/SQLiteStatement;Landroid/database/Cursor;)V

    return-void

    :pswitch_1
    check-cast v2, Lcom/google/firebase/firestore/local/MemoryIndexManager$MemoryCollectionParentIndex;

    check-cast v1, Landroid/database/sqlite/SQLiteStatement;

    check-cast p1, Lcom/google/firebase/firestore/model/ResourcePath;

    invoke-static {v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->f(Lcom/google/firebase/firestore/local/MemoryIndexManager$MemoryCollectionParentIndex;Landroid/database/sqlite/SQLiteStatement;Lcom/google/firebase/firestore/model/ResourcePath;)V

    return-void

    :pswitch_2
    check-cast v2, Lcom/google/firebase/firestore/local/SQLiteSchema;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->p(Lcom/google/firebase/firestore/local/SQLiteSchema;Ljava/lang/String;Landroid/database/Cursor;)V

    return-void

    :pswitch_3
    check-cast v2, Lcom/google/firebase/firestore/local/SQLiteIndexManager;

    check-cast v1, Ljava/util/Map;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v2, v1, p1}, Lcom/google/firebase/firestore/local/SQLiteIndexManager;->b(Lcom/google/firebase/firestore/local/SQLiteIndexManager;Ljava/util/Map;Landroid/database/Cursor;)V

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
