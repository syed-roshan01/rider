.class public final Lk/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lk/n;


# direct methods
.method public synthetic constructor <init>(Lk/n;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lk/c;->a:I

    iput-object p1, p0, Lk/c;->b:Lk/n;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    iget v0, p0, Lk/c;->a:I

    iget-object v1, p0, Lk/c;->b:Lk/n;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lk/v;

    invoke-virtual {v1}, Lk/v;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v1, Lk/v;->p:Ll/u1;

    iget-boolean v2, v0, Ll/o1;->B:Z

    if-nez v2, :cond_2

    iget-object v2, v1, Lk/v;->u:Landroid/view/View;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/o1;->e()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lk/v;->dismiss()V

    :cond_2
    :goto_1
    return-void

    :pswitch_0
    check-cast v1, Lk/h;

    invoke-virtual {v1}, Lk/h;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v1, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_5

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk/g;

    iget-object v2, v2, Lk/g;->a:Ll/u1;

    iget-boolean v2, v2, Ll/o1;->B:Z

    if-nez v2, :cond_5

    iget-object v2, v1, Lk/h;->w:Landroid/view/View;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk/g;

    iget-object v1, v1, Lk/g;->a:Ll/u1;

    invoke-virtual {v1}, Ll/o1;->e()V

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {v1}, Lk/h;->dismiss()V

    :cond_5
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
