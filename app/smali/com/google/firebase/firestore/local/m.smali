.class public final synthetic Lcom/google/firebase/firestore/local/m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/util/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/local/LruGarbageCollector$RollingSequenceNumberBuffer;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/local/LruGarbageCollector$RollingSequenceNumberBuffer;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/local/m;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/local/m;->b:Lcom/google/firebase/firestore/local/LruGarbageCollector$RollingSequenceNumberBuffer;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/local/m;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/local/m;->b:Lcom/google/firebase/firestore/local/LruGarbageCollector$RollingSequenceNumberBuffer;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {v1, p1}, Lcom/google/firebase/firestore/local/LruGarbageCollector$RollingSequenceNumberBuffer;->addElement(Ljava/lang/Long;)V

    return-void

    :pswitch_0
    check-cast p1, Lcom/google/firebase/firestore/local/TargetData;

    invoke-static {v1, p1}, Lcom/google/firebase/firestore/local/LruGarbageCollector;->a(Lcom/google/firebase/firestore/local/LruGarbageCollector$RollingSequenceNumberBuffer;Lcom/google/firebase/firestore/local/TargetData;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
