.class public final synthetic Lq5/f;
.super Ljava/lang/Object;

# interfaces
.implements Ls5/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq5/i;

.field public final synthetic c:Ll5/j;


# direct methods
.method public synthetic constructor <init>(Lq5/i;Ll5/j;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lq5/f;->a:I

    iput-object p1, p0, Lq5/f;->b:Lq5/i;

    iput-object p2, p0, Lq5/f;->c:Ll5/j;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lq5/f;->a:I

    iget-object v1, p0, Lq5/f;->c:Ll5/j;

    iget-object v2, p0, Lq5/f;->b:Lq5/i;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, Lq5/i;->c:Lr5/d;

    check-cast v0, Lr5/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lr5/g;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lr5/g;-><init>(Lr5/m;Ll5/j;I)V

    invoke-virtual {v0, v2}, Lr5/m;->e(Lr5/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    return-object v0

    :pswitch_0
    iget-object v0, v2, Lq5/i;->c:Lr5/d;

    check-cast v0, Lr5/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lr5/g;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lr5/g;-><init>(Lr5/m;Ll5/j;I)V

    invoke-virtual {v0, v2}, Lr5/m;->e(Lr5/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
