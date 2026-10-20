.class public final Ln8/c;
.super Lz6/a;


# instance fields
.field public final synthetic s:I

.field public final t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le8/c2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ln8/c;->s:I

    iput-object p1, p0, Ln8/c;->t:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz6/a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Ln8/c;->s:I

    iput-object p1, p0, Ln8/c;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final Y(Lg8/j4;)Le8/v0;
    .locals 4

    iget v0, p0, Ln8/c;->s:I

    iget-object v1, p0, Ln8/c;->t:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lz6/a;

    invoke-virtual {v1, p1}, Lz6/a;->Y(Lg8/j4;)Le8/v0;

    move-result-object p1

    iget-object v0, p1, Le8/v0;->a:Le8/x0;

    if-eqz v0, :cond_0

    new-instance v1, Ln8/m;

    invoke-virtual {v0}, Le8/x0;->c()Le8/c;

    move-result-object v2

    sget-object v3, Ln8/p;->k:Le8/b;

    iget-object v2, v2, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v2, v3}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/g;

    iget-object p1, p1, Le8/v0;->b:Le8/n;

    invoke-direct {v1, v2, p1}, Ln8/m;-><init>(Ln8/g;Le8/n;)V

    invoke-static {v0, v1}, Le8/v0;->b(Le8/x0;Ln8/m;)Le8/v0;

    move-result-object p1

    :cond_0
    return-object p1

    :pswitch_0
    check-cast v1, Le8/c2;

    invoke-static {v1}, Le8/v0;->a(Le8/c2;)Le8/v0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Ln8/c;->s:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Lq6/g;

    const-class v1, Ln8/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lq6/g;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ln8/c;->t:Ljava/lang/Object;

    check-cast v1, Le8/c2;

    const-string v2, "error"

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
