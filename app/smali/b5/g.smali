.class public final synthetic Lb5/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lb5/g;->a:I

    iput-object p1, p0, Lb5/g;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget v0, p0, Lb5/g;->a:I

    iget-object v1, p0, Lb5/g;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lc5/f;

    check-cast p1, Lla/f;

    sget-object v0, Lla/g;->a:Landroid/os/IBinder;

    iget-object p1, p1, Lla/f;->a:Ljava/lang/Object;

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_0
    check-cast v1, Lc9/c;

    invoke-static {v1, p1}, Lcom/auto/accept/service/RideAcceptorService;->e(Lc9/c;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
