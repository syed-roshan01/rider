.class public final synthetic Lcom/google/firebase/firestore/local/n;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/local/n;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/n;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/local/n;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/n;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Ljava/util/Set;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteOverlayMigrationManager;->a(Ljava/util/Set;Landroid/database/Cursor;)V

    return-void

    :pswitch_0
    check-cast v1, [Ljava/lang/Boolean;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteOverlayMigrationManager;->b([Ljava/lang/Boolean;Landroid/database/Cursor;)V

    return-void

    :pswitch_1
    check-cast v1, Lcom/google/firebase/firestore/local/SQLiteTargetCache$DocumentKeysHolder;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteTargetCache;->a(Lcom/google/firebase/firestore/local/SQLiteTargetCache$DocumentKeysHolder;Landroid/database/Cursor;)V

    return-void

    :pswitch_2
    check-cast v1, Lcom/google/firebase/firestore/local/SQLiteTargetCache;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteTargetCache;->e(Lcom/google/firebase/firestore/local/SQLiteTargetCache;Landroid/database/Cursor;)V

    return-void

    :pswitch_3
    check-cast v1, Ljava/util/Map;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteIndexManager;->h(Ljava/util/Map;Landroid/database/Cursor;)V

    return-void

    :pswitch_4
    check-cast v1, Ljava/util/ArrayList;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteIndexManager;->c(Ljava/util/ArrayList;Landroid/database/Cursor;)V

    return-void

    :pswitch_5
    check-cast v1, [J

    check-cast p1, Ljava/lang/Long;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/MemoryLruReferenceDelegate;->a([JLjava/lang/Long;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
