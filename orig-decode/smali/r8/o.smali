.class public final Lr8/o;
.super Ljava/lang/Object;

# interfaces
.implements Lk9/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lr8/o;->a:I

    iput-object p1, p0, Lr8/o;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget v0, p0, Lr8/o;->a:I

    iget-object v1, p0, Lr8/o;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Ljava/util/Iterator;

    return-object v1

    :pswitch_0
    check-cast v1, Lc9/e;

    const-string v0, "block"

    invoke-static {v1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v0, v1}, Ld7/t;->M(Ljava/lang/Object;Lu8/e;Lc9/e;)Lu8/e;

    move-result-object v1

    iput-object v1, v0, Lk9/j;->c:Lu8/e;

    return-object v0

    :pswitch_1
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
