.class public final Lg8/b2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le8/c2;

.field public final synthetic c:Lg8/j2;


# direct methods
.method public synthetic constructor <init>(Lg8/j2;Le8/c2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lg8/b2;->a:I

    iput-object p1, p0, Lg8/b2;->c:Lg8/j2;

    iput-object p2, p0, Lg8/b2;->b:Le8/c2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget v0, p0, Lg8/b2;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lg8/b2;->c:Lg8/j2;

    iget-object v1, v1, Lg8/j2;->s:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/u3;

    iget-object v2, p0, Lg8/b2;->b:Le8/c2;

    invoke-interface {v1, v2}, Lg8/u3;->c(Le8/c2;)V

    goto :goto_0

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lg8/b2;->c:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->w:Le8/y;

    iget-object v0, v0, Le8/y;->a:Le8/x;

    sget-object v1, Le8/x;->e:Le8/x;

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lg8/b2;->c:Lg8/j2;

    iget-object v2, p0, Lg8/b2;->b:Le8/c2;

    iput-object v2, v0, Lg8/j2;->x:Le8/c2;

    iget-object v0, v0, Lg8/j2;->v:Lg8/u3;

    iget-object v2, p0, Lg8/b2;->c:Lg8/j2;

    iget-object v3, v2, Lg8/j2;->u:Lg8/o0;

    const/4 v4, 0x0

    iput-object v4, v2, Lg8/j2;->v:Lg8/u3;

    iget-object v2, p0, Lg8/b2;->c:Lg8/j2;

    iput-object v4, v2, Lg8/j2;->u:Lg8/o0;

    invoke-static {v2, v1}, Lg8/j2;->g(Lg8/j2;Le8/x;)V

    iget-object v1, p0, Lg8/b2;->c:Lg8/j2;

    iget-object v1, v1, Lg8/j2;->l:Lk3/b;

    invoke-virtual {v1}, Lk3/b;->b()V

    iget-object v1, p0, Lg8/b2;->c:Lg8/j2;

    iget-object v1, v1, Lg8/j2;->s:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lg8/b2;->c:Lg8/j2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lg8/a2;

    const/4 v5, 0x2

    invoke-direct {v2, v1, v5}, Lg8/a2;-><init>(Lg8/j2;I)V

    iget-object v1, v1, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v1, v2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    :cond_2
    iget-object v1, p0, Lg8/b2;->c:Lg8/j2;

    iget-object v2, v1, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v2}, Le8/h2;->d()V

    iget-object v2, v1, Lg8/j2;->p:Lv6/d;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lv6/d;->c()V

    iput-object v4, v1, Lg8/j2;->p:Lv6/d;

    iput-object v4, v1, Lg8/j2;->n:Lg8/i1;

    :cond_3
    iget-object v1, p0, Lg8/b2;->c:Lg8/j2;

    iget-object v1, v1, Lg8/j2;->q:Lv6/d;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lv6/d;->c()V

    iget-object v1, p0, Lg8/b2;->c:Lg8/j2;

    iget-object v1, v1, Lg8/j2;->r:Lg8/u3;

    iget-object v2, p0, Lg8/b2;->b:Le8/c2;

    invoke-interface {v1, v2}, Lg8/u3;->f(Le8/c2;)V

    iget-object v1, p0, Lg8/b2;->c:Lg8/j2;

    iput-object v4, v1, Lg8/j2;->q:Lv6/d;

    iput-object v4, v1, Lg8/j2;->r:Lg8/u3;

    :cond_4
    if-eqz v0, :cond_5

    iget-object v1, p0, Lg8/b2;->b:Le8/c2;

    invoke-interface {v0, v1}, Lg8/u3;->f(Le8/c2;)V

    :cond_5
    if-eqz v3, :cond_6

    iget-object v0, p0, Lg8/b2;->b:Le8/c2;

    invoke-interface {v3, v0}, Lg8/u3;->f(Le8/c2;)V

    :cond_6
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
