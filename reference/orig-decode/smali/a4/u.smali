.class public final La4/u;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/u;->a:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    iget-object v0, p0, La4/u;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->L:La4/a0;

    if-eqz v0, :cond_a

    check-cast v0, La4/e;

    iget-object v1, v0, La4/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    iget-object v4, v0, La4/e;->g:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    xor-int/2addr v5, v3

    iget-object v6, v0, La4/e;->h:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    xor-int/2addr v7, v3

    iget-object v8, v0, La4/e;->f:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    xor-int/2addr v9, v3

    if-nez v2, :cond_0

    if-nez v5, :cond_0

    if-nez v9, :cond_0

    if-nez v7, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v12, 0x0

    if-nez v11, :cond_9

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    const/4 v1, 0x0

    if-eqz v5, :cond_2

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v11, v0, La4/e;->j:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    new-instance v4, La4/d;

    invoke-direct {v4, v0, v10, v1}, La4/d;-><init>(La4/e;Ljava/util/ArrayList;I)V

    if-nez v2, :cond_1

    invoke-virtual {v4}, La4/d;->run()V

    goto :goto_0

    :cond_1
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    throw v12

    :cond_2
    :goto_0
    if-eqz v7, :cond_4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v10, v0, La4/e;->k:Ljava/util/ArrayList;

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    new-instance v6, La4/d;

    invoke-direct {v6, v0, v4, v3}, La4/d;-><init>(La4/e;Ljava/util/ArrayList;I)V

    if-nez v2, :cond_3

    invoke-virtual {v6}, La4/d;->run()V

    goto :goto_1

    :cond_3
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    throw v12

    :cond_4
    :goto_1
    if-eqz v9, :cond_a

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v4, v0, La4/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    new-instance v4, La4/d;

    const/4 v6, 0x2

    invoke-direct {v4, v0, v3, v6}, La4/d;-><init>(La4/e;Ljava/util/ArrayList;I)V

    if-nez v2, :cond_6

    if-nez v5, :cond_6

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v4}, La4/d;->run()V

    goto :goto_4

    :cond_6
    :goto_2
    const-wide/16 v8, 0x0

    if-eqz v5, :cond_7

    iget-wide v4, v0, La4/a0;->c:J

    goto :goto_3

    :cond_7
    move-wide v4, v8

    :goto_3
    if-eqz v7, :cond_8

    iget-wide v8, v0, La4/a0;->d:J

    :cond_8
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->max(JJ)J

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    throw v12

    :cond_9
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    throw v12

    :cond_a
    :goto_4
    return-void
.end method
