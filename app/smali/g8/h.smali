.class public final Lg8/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ll/z2;


# direct methods
.method public synthetic constructor <init>(Ll/z2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/h;->a:I

    iput-object p1, p0, Lg8/h;->b:Ll/z2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lg8/h;->a:I

    iget-object v1, p0, Lg8/h;->b:Ll/z2;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Lg8/x3;

    invoke-virtual {v0}, Lg8/x3;->close()V

    return-void

    :pswitch_0
    iget-object v0, v1, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Lg8/x3;

    invoke-virtual {v0}, Lg8/x3;->f()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
