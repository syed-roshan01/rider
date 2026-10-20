.class public final Lg8/b1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lg8/d1;


# direct methods
.method public synthetic constructor <init>(Lg8/d1;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lg8/b1;->a:I

    iput-object p1, p0, Lg8/b1;->c:Lg8/d1;

    iput-boolean p2, p0, Lg8/b1;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lg8/b1;->a:I

    iget-boolean v1, p0, Lg8/b1;->b:Z

    iget-object v2, p0, Lg8/b1;->c:Lg8/d1;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0, v1}, Lg8/z5;->c(Z)V

    return-void

    :pswitch_0
    iget-object v0, v2, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0, v1}, Lg8/h0;->q(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
