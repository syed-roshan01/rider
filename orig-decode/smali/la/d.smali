.class public final synthetic Lla/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(IILcom/auto/accept/service/RideAcceptorService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lla/d;->a:I

    iput p1, p0, Lla/d;->c:I

    iput p2, p0, Lla/d;->d:I

    iput-object p3, p0, Lla/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lla/f;III)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lla/d;->a:I

    iput-object p1, p0, Lla/d;->b:Ljava/lang/Object;

    iput p2, p0, Lla/d;->c:I

    iput p3, p0, Lla/d;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lla/d;->a:I

    iget v1, p0, Lla/d;->d:I

    iget-object v2, p0, Lla/d;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/auto/accept/service/RideAcceptorService;

    iget v0, p0, Lla/d;->c:I

    invoke-static {v0, v1, v2}, Lcom/auto/accept/service/RideAcceptorService;->c(IILcom/auto/accept/service/RideAcceptorService;)V

    return-void

    :pswitch_0
    check-cast v2, Lla/f;

    iget-object v0, v2, Lla/f;->a:Ljava/lang/Object;

    check-cast v0, Lc5/f;

    invoke-virtual {v0, v1}, Lc5/f;->a(I)V

    return-void

    :pswitch_1
    check-cast v2, Lla/f;

    iget-object v0, v2, Lla/f;->a:Ljava/lang/Object;

    check-cast v0, Lc5/f;

    invoke-virtual {v0, v1}, Lc5/f;->a(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
