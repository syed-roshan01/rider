.class public final Lu9/b;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lu9/d;

.field public final synthetic c:Lu9/c;


# direct methods
.method public synthetic constructor <init>(Lu9/d;Lu9/c;I)V
    .locals 0

    iput p3, p0, Lu9/b;->a:I

    iput-object p1, p0, Lu9/b;->b:Lu9/d;

    iput-object p2, p0, Lu9/b;->c:Lu9/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget-object v1, p0, Lu9/b;->c:Lu9/c;

    iget-object v2, p0, Lu9/b;->b:Lu9/d;

    iget v3, p0, Lu9/b;->a:I

    packed-switch v3, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    packed-switch v3, :pswitch_data_1

    sget-object p1, Lu9/d;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v3, v1, Lu9/c;->b:Ljava/lang/Object;

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v1, Lu9/c;->b:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Lu9/d;->d(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_0
    iget-object p1, v1, Lu9/c;->b:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Lu9/d;->d(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    packed-switch v3, :pswitch_data_2

    sget-object p1, Lu9/d;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v3, v1, Lu9/c;->b:Ljava/lang/Object;

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v1, Lu9/c;->b:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Lu9/d;->d(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_2
    iget-object p1, v1, Lu9/c;->b:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Lu9/d;->d(Ljava/lang/Object;)V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
