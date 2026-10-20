.class public final synthetic Lcom/google/firebase/firestore/local/h0;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/local/SQLiteSchema;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/local/SQLiteSchema;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/local/h0;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/h0;->b:Lcom/google/firebase/firestore/local/SQLiteSchema;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/local/h0;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/h0;->b:Lcom/google/firebase/firestore/local/SQLiteSchema;

    check-cast p1, Landroid/database/Cursor;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->j(Lcom/google/firebase/firestore/local/SQLiteSchema;Landroid/database/Cursor;)V

    return-void

    :pswitch_0
    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->n(Lcom/google/firebase/firestore/local/SQLiteSchema;Landroid/database/Cursor;)V

    return-void

    :pswitch_1
    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->m(Lcom/google/firebase/firestore/local/SQLiteSchema;Landroid/database/Cursor;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
