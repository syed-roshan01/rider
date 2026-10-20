.class public final Lm0/p;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/l0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lm0/p;->a:I

    iput-object p1, p0, Lm0/p;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Lm0/p;->a:I

    iget-object v1, p0, Lm0/p;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lw0/z;

    iget v0, v1, Lw0/z;->j:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v1, Lw0/z;->j:I

    return-void

    :pswitch_0
    check-cast v1, Lm0/q;

    iget v0, v1, Lm0/q;->z:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v1, Lm0/q;->z:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 2

    iget v0, p0, Lm0/p;->a:I

    iget-object v1, p0, Lm0/p;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lw0/z;

    iget v0, v1, Lw0/z;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v1, Lw0/z;->j:I

    return-void

    :pswitch_0
    check-cast v1, Lm0/q;

    iget v0, v1, Lm0/q;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v1, Lm0/q;->z:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
