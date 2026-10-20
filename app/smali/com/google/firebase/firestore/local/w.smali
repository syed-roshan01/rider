.class public final synthetic Lcom/google/firebase/firestore/local/w;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/firebase/firestore/local/w;->a:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/google/firebase/firestore/local/w;->a:I

    check-cast p1, Landroid/database/Cursor;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/google/firebase/firestore/local/SQLitePersistence;->b(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lcom/google/firebase/firestore/local/SQLitePersistence;->a(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->d(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1}, Lcom/google/firebase/firestore/local/SQLiteMutationQueue;->i(Landroid/database/Cursor;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Lcom/google/firebase/firestore/local/SQLiteLruReferenceDelegate;->b(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
