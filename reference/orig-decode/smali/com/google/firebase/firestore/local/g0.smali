.class public final synthetic Lcom/google/firebase/firestore/local/g0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/local/SQLiteSchema;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/local/SQLiteSchema;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/local/g0;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/g0;->b:Lcom/google/firebase/firestore/local/SQLiteSchema;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/local/g0;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/g0;->b:Lcom/google/firebase/firestore/local/SQLiteSchema;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->g(Lcom/google/firebase/firestore/local/SQLiteSchema;)V

    return-void

    :pswitch_0
    invoke-static {v1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->r(Lcom/google/firebase/firestore/local/SQLiteSchema;)V

    return-void

    :pswitch_1
    invoke-static {v1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->k(Lcom/google/firebase/firestore/local/SQLiteSchema;)V

    return-void

    :pswitch_2
    invoke-static {v1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->a(Lcom/google/firebase/firestore/local/SQLiteSchema;)V

    return-void

    :pswitch_3
    invoke-static {v1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->l(Lcom/google/firebase/firestore/local/SQLiteSchema;)V

    return-void

    :pswitch_4
    invoke-static {v1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->c(Lcom/google/firebase/firestore/local/SQLiteSchema;)V

    return-void

    :pswitch_5
    invoke-static {v1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->i(Lcom/google/firebase/firestore/local/SQLiteSchema;)V

    return-void

    :pswitch_6
    invoke-static {v1}, Lcom/google/firebase/firestore/local/SQLiteSchema;->b(Lcom/google/firebase/firestore/local/SQLiteSchema;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
