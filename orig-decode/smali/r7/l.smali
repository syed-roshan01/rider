.class public final Lr7/l;
.super Lr7/n;


# instance fields
.field public final synthetic e:I


# direct methods
.method public constructor <init>(Lr7/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lr7/l;->e:I

    .line 1
    iget-object p1, p1, Lr7/m;->b:Lr7/p;

    invoke-direct {p0, p1}, Lr7/n;-><init>(Lr7/p;)V

    return-void
.end method

.method public constructor <init>(Lr7/m;I)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, Lr7/l;->e:I

    .line 2
    iget-object p1, p1, Lr7/m;->b:Lr7/p;

    invoke-direct {p0, p1}, Lr7/n;-><init>(Lr7/p;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lr7/l;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lr7/n;->a()Lr7/o;

    move-result-object v0

    iget-object v0, v0, Lr7/o;->f:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lr7/n;->a()Lr7/o;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
