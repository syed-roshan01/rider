.class public final Lm0/d3;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm0/t1;


# direct methods
.method public synthetic constructor <init>(Lm0/t1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lm0/d3;->a:I

    iput-object p1, p0, Lm0/d3;->b:Lm0/t1;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 2

    sget-object p2, Lq8/l;->a:Lq8/l;

    iget v0, p0, Lm0/d3;->a:I

    iget-object v1, p0, Lm0/d3;->b:Lm0/t1;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1, p1}, Lm0/t1;->setValue(Ljava/lang/Object;)V

    return-object p2

    :pswitch_0
    invoke-virtual {v1, p1}, Lm0/t1;->setValue(Ljava/lang/Object;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
