.class public final Lt/h1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lt/o;


# direct methods
.method public synthetic constructor <init>(Lt/o;I)V
    .locals 0

    iput p2, p0, Lt/h1;->a:I

    iput-object p1, p0, Lt/h1;->b:Lt/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget-object v1, p0, Lt/h1;->b:Lt/o;

    const/4 v2, 0x0

    iget v3, p0, Lt/h1;->a:I

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    iput-boolean v2, v1, Lt/o;->f:Z

    goto :goto_0

    :pswitch_0
    iput-boolean v2, v1, Lt/o;->f:Z

    :goto_0
    return-object v0

    :pswitch_1
    packed-switch v3, :pswitch_data_2

    iput-boolean v2, v1, Lt/o;->f:Z

    goto :goto_1

    :pswitch_2
    iput-boolean v2, v1, Lt/o;->f:Z

    :goto_1
    return-object v0

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
