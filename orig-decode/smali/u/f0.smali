.class public final Lu/f0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lu/g0;


# direct methods
.method public synthetic constructor <init>(Lu/g0;I)V
    .locals 0

    iput p2, p0, Lu/f0;->a:I

    iput-object p1, p0, Lu/f0;->b:Lu/g0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lu/f0;->b:Lu/g0;

    iget v1, p0, Lu/f0;->a:I

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    iget-object v0, v0, Lu/g0;->z:Lc9/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :pswitch_0
    iget-object v0, v0, Lu/g0;->x:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_0
    return-object v0

    :pswitch_1
    packed-switch v1, :pswitch_data_2

    iget-object v0, v0, Lu/g0;->z:Lc9/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :pswitch_2
    iget-object v0, v0, Lu/g0;->x:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

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
