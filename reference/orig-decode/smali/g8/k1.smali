.class public final Lg8/k1;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/k0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le8/c2;Lg8/i0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lg8/k1;->a:I

    .line 2
    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error must not be OK"

    invoke-static {v1, v0}, Ly3/e;->G(Ljava/lang/String;Z)V

    iput-object p1, p0, Lg8/k1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lg8/k1;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le8/n;Lg8/u3;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lg8/k1;->a:I

    iput-object p1, p0, Lg8/k1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lg8/k1;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Le8/q0;
    .locals 2

    iget v0, p0, Lg8/k1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg8/k1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/k0;

    invoke-interface {v0}, Le8/p0;->b()Le8/q0;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not a real transport"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;
    .locals 6

    iget v0, p0, Lg8/k1;->a:I

    iget-object v1, p0, Lg8/k1;->c:Ljava/lang/Object;

    iget-object v2, p0, Lg8/k1;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Le8/h;->k:Le8/h;

    const-string v0, "callOptions cannot be null"

    invoke-static {p3, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Le8/o;

    const/4 v3, 0x0

    invoke-direct {v0, p3, v3, v3}, Le8/o;-><init>(Le8/h;IZ)V

    check-cast v2, Le8/n;

    invoke-virtual {v2, v0, p2}, Le8/n;->a(Le8/o;Le8/l1;)Le8/p;

    move-result-object v0

    array-length v2, p4

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    aget-object v2, p4, v2

    sget-object v5, Lg8/s1;->o:Lg8/q1;

    if-ne v2, v5, :cond_0

    move v3, v4

    :cond_0
    const-string v2, "lb tracer already assigned"

    invoke-static {v2, v3}, Ly3/e;->N(Ljava/lang/String;Z)V

    array-length v2, p4

    sub-int/2addr v2, v4

    aput-object v0, p4, v2

    check-cast v1, Lg8/k0;

    invoke-interface {v1, p1, p2, p3, p4}, Lg8/k0;->d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance p1, Lg8/j1;

    check-cast v2, Le8/c2;

    check-cast v1, Lg8/i0;

    invoke-direct {p1, v2, v1, p4}, Lg8/j1;-><init>(Le8/c2;Lg8/i0;[Le8/p;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
