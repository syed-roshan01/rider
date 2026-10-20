.class public final Lm5/e;
.super Ljava/lang/Object;

# interfaces
.implements Ln5/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lp8/a;

.field public final c:Lp8/a;

.field public final d:Lp8/a;


# direct methods
.method public synthetic constructor <init>(Lp8/a;Ll5/o;Ll5/o;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lm5/e;->a:I

    iput-object p1, p0, Lm5/e;->b:Lp8/a;

    iput-object p2, p0, Lm5/e;->c:Lp8/a;

    iput-object p3, p0, Lm5/e;->d:Lp8/a;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lm5/e;->a:I

    iget-object v1, p0, Lm5/e;->d:Lp8/a;

    iget-object v2, p0, Lm5/e;->c:Lp8/a;

    iget-object v3, p0, Lm5/e;->b:Lp8/a;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v3}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-interface {v2}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    new-instance v3, Lr5/p;

    invoke-direct {v3, v1, v0, v2}, Lr5/p;-><init>(ILandroid/content/Context;Ljava/lang/String;)V

    return-object v3

    :pswitch_0
    invoke-interface {v3}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-interface {v2}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt5/a;

    invoke-interface {v1}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt5/a;

    new-instance v3, Lm5/d;

    invoke-direct {v3, v0, v2, v1}, Lm5/d;-><init>(Landroid/content/Context;Lt5/a;Lt5/a;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
