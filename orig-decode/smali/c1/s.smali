.class public final Lc1/s;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc1/p;

.field public final synthetic c:Lc1/p;

.field public final synthetic d:I

.field public final synthetic e:Lc9/c;


# direct methods
.method public synthetic constructor <init>(Lc1/p;Lc1/p;ILc9/c;I)V
    .locals 0

    iput p5, p0, Lc1/s;->a:I

    iput-object p1, p0, Lc1/s;->b:Lc1/p;

    iput-object p2, p0, Lc1/s;->c:Lc1/p;

    iput p3, p0, Lc1/s;->d:I

    iput-object p4, p0, Lc1/s;->e:Lc9/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr1/e;)Ljava/lang/Boolean;
    .locals 6

    iget v0, p0, Lc1/s;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Lc1/s;->e:Lc9/c;

    iget v3, p0, Lc1/s;->d:I

    iget-object v4, p0, Lc1/s;->c:Lc1/p;

    iget-object v5, p0, Lc1/s;->b:Lc1/p;

    packed-switch v0, :pswitch_data_0

    invoke-static {v5, v4, v3, v2}, Landroidx/compose/ui/focus/a;->H(Lc1/p;Lc1/p;ILc9/c;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {p1}, Lr1/e;->a()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    move-object v1, v0

    :cond_1
    return-object v1

    :pswitch_0
    invoke-static {v5, v4, v3, v2}, Landroidx/compose/ui/focus/a;->G(Lc1/p;Lc1/p;ILc9/c;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {p1}, Lr1/e;->a()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    move-object v1, v0

    :cond_3
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc1/s;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr1/e;

    invoke-virtual {p0, p1}, Lc1/s;->a(Lr1/e;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lr1/e;

    invoke-virtual {p0, p1}, Lc1/s;->a(Lr1/e;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
