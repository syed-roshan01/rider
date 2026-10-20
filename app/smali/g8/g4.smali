.class public final Lg8/g4;
.super Lz6/a;


# instance fields
.field public final synthetic s:I

.field public final t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le8/c2;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lg8/g4;->s:I

    iput-object p1, p0, Lg8/g4;->t:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le8/v0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lg8/g4;->s:I

    const-string v0, "result"

    .line 2
    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/g4;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final Y(Lg8/j4;)Le8/v0;
    .locals 1

    iget p1, p0, Lg8/g4;->s:I

    iget-object v0, p0, Lg8/g4;->t:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v0, Le8/c2;

    invoke-static {v0}, Le8/v0;->a(Le8/c2;)Le8/v0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v0, Le8/v0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lg8/g4;->s:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Lq6/g;

    const-class v1, Lg8/g4;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lq6/g;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lg8/g4;->t:Ljava/lang/Object;

    check-cast v1, Le8/v0;

    const-string v2, "result"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
