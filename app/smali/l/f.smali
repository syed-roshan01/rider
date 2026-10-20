.class public final Ll/f;
.super Lk/q;


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Ll/k;


# direct methods
.method public constructor <init>(Ll/k;Landroid/content/Context;Lk/l;Ll/j;)V
    .locals 7

    const/4 v6, 0x1

    const/4 v0, 0x1

    iput v0, p0, Ll/f;->m:I

    iput-object p1, p0, Ll/f;->n:Ll/k;

    const v1, 0x7f030021

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p2

    move-object v4, p4

    move-object v5, p3

    .line 1
    invoke-direct/range {v0 .. v6}, Lk/q;-><init>(IILandroid/content/Context;Landroid/view/View;Lk/l;Z)V

    const p2, 0x800005

    iput p2, p0, Lk/q;->g:I

    .line 2
    iget-object p1, p1, Ll/k;->C:Lk/f;

    iput-object p1, p0, Lk/q;->i:Lk/r;

    iget-object p2, p0, Lk/q;->j:Lk/n;

    if-eqz p2, :cond_0

    .line 3
    invoke-interface {p2, p1}, Lk/s;->h(Lk/r;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Ll/k;Landroid/content/Context;Lk/w;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Ll/f;->m:I

    iput-object p1, p0, Ll/f;->n:Ll/k;

    const/4 v7, 0x0

    const v2, 0x7f030021

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p2

    move-object v5, p4

    move-object v6, p3

    .line 4
    invoke-direct/range {v1 .. v7}, Lk/q;-><init>(IILandroid/content/Context;Landroid/view/View;Lk/l;Z)V

    .line 5
    iget-object p2, p3, Lk/w;->w:Lk/m;

    .line 6
    invoke-virtual {p2}, Lk/m;->d()Z

    move-result p2

    if-nez p2, :cond_1

    .line 7
    iget-object p2, p1, Ll/k;->o:Ll/j;

    if-nez p2, :cond_0

    .line 8
    iget-object p2, p1, Ll/k;->n:Landroidx/appcompat/widget/ActionMenuView;

    :cond_0
    iput-object p2, p0, Lk/q;->f:Landroid/view/View;

    .line 9
    :cond_1
    iget-object p1, p1, Ll/k;->C:Lk/f;

    iput-object p1, p0, Lk/q;->i:Lk/r;

    iget-object p2, p0, Lk/q;->j:Lk/n;

    if-eqz p2, :cond_2

    .line 10
    invoke-interface {p2, p1}, Lk/s;->h(Lk/r;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    iget v0, p0, Ll/f;->m:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/f;->n:Ll/k;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, Ll/k;->c:Lk/l;

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lk/l;->c(Z)V

    :cond_0
    iput-object v1, v2, Ll/k;->y:Ll/f;

    invoke-super {p0}, Lk/q;->c()V

    return-void

    :pswitch_0
    iput-object v1, v2, Ll/k;->z:Ll/f;

    invoke-super {p0}, Lk/q;->c()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
