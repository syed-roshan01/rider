.class public final Lr1/b0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/k0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr1/k0;

.field public final synthetic c:Lr1/f0;

.field public final synthetic d:I

.field public final synthetic e:Lr1/k0;


# direct methods
.method public synthetic constructor <init>(Lr1/k0;Lr1/f0;ILr1/k0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p5, p0, Lr1/b0;->a:I

    iput-object p2, p0, Lr1/b0;->c:Lr1/f0;

    iput p3, p0, Lr1/b0;->d:I

    iput-object p4, p0, Lr1/b0;->e:Lr1/k0;

    iput-object p1, p0, Lr1/b0;->b:Lr1/k0;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget v0, p0, Lr1/b0;->a:I

    iget-object v1, p0, Lr1/b0;->b:Lr1/k0;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1}, Lr1/k0;->a()I

    move-result v0

    return v0

    :pswitch_0
    invoke-interface {v1}, Lr1/k0;->a()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()I
    .locals 2

    iget v0, p0, Lr1/b0;->a:I

    iget-object v1, p0, Lr1/b0;->b:Lr1/k0;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1}, Lr1/k0;->b()I

    move-result v0

    return v0

    :pswitch_0
    invoke-interface {v1}, Lr1/k0;->b()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ljava/util/Map;
    .locals 2

    iget v0, p0, Lr1/b0;->a:I

    iget-object v1, p0, Lr1/b0;->b:Lr1/k0;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-interface {v1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()V
    .locals 4

    iget v0, p0, Lr1/b0;->a:I

    iget-object v1, p0, Lr1/b0;->e:Lr1/k0;

    iget v2, p0, Lr1/b0;->d:I

    iget-object v3, p0, Lr1/b0;->c:Lr1/f0;

    packed-switch v0, :pswitch_data_0

    iput v2, v3, Lr1/f0;->d:I

    invoke-interface {v1}, Lr1/k0;->e()V

    iget v0, v3, Lr1/f0;->d:I

    invoke-virtual {v3, v0}, Lr1/f0;->d(I)V

    return-void

    :pswitch_0
    iput v2, v3, Lr1/f0;->e:I

    invoke-interface {v1}, Lr1/k0;->e()V

    iget-object v0, v3, Lr1/f0;->s:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Lh1/b;

    const/4 v2, 0x3

    invoke-direct {v1, v3, v2}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    const-string v2, "<this>"

    invoke-static {v0, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lr8/n;->B0(Ljava/lang/Iterable;Lc9/c;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
