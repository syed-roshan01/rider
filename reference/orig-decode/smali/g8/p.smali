.class public final Lg8/p;
.super Lz6/a;


# instance fields
.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg8/p;->s:I

    .line 2
    invoke-direct {p0, v0}, Lg8/p;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg8/p;->s:I

    return-void
.end method


# virtual methods
.method public final Y(Lg8/j4;)Le8/v0;
    .locals 0

    iget p1, p0, Lg8/p;->s:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Le8/v0;->e:Le8/v0;

    return-object p1

    :pswitch_0
    sget-object p1, Le8/v0;->e:Le8/v0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lg8/p;->s:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "BUFFER_PICKER"

    return-object v0

    :pswitch_0
    new-instance v0, Lq6/g;

    const-class v1, Lg8/p;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lq6/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
