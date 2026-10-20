.class public final Lu1/p;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/translation/ViewTranslationCallback;


# virtual methods
.method public final onClearTranslation(Landroid/view/View;)Z
    .locals 3

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lu1/w;

    iget-object p1, p1, Lu1/w;->t:Lu1/p0;

    const/4 v0, 0x1

    iput v0, p1, Lu1/p0;->W:I

    invoke-virtual {p1}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu1/s2;

    iget-object v1, v1, Lu1/s2;->a:Ly1/o;

    iget-object v1, v1, Ly1/o;->d:Ly1/j;

    sget-object v2, Ly1/r;->w:Ly1/u;

    invoke-static {v1, v2}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v2, Ly1/i;->k:Ly1/u;

    iget-object v1, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    :cond_1
    check-cast v1, Ly1/a;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ly1/a;->b:Lq8/a;

    check-cast v1, Lc9/a;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final onHideTranslation(Landroid/view/View;)Z
    .locals 4

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lu1/w;

    iget-object p1, p1, Lu1/w;->t:Lu1/p0;

    const/4 v0, 0x1

    iput v0, p1, Lu1/p0;->W:I

    invoke-virtual {p1}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu1/s2;

    iget-object v1, v1, Lu1/s2;->a:Ly1/o;

    iget-object v1, v1, Ly1/o;->d:Ly1/j;

    sget-object v2, Ly1/r;->w:Ly1/u;

    invoke-static {v1, v2}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Ly1/i;->j:Ly1/u;

    iget-object v1, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    :cond_1
    check-cast v1, Ly1/a;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ly1/a;->b:Lq8/a;

    check-cast v1, Lc9/c;

    if-eqz v1, :cond_0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final onShowTranslation(Landroid/view/View;)Z
    .locals 3

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lu1/w;

    iget-object p1, p1, Lu1/w;->t:Lu1/p0;

    const/4 v0, 0x2

    iput v0, p1, Lu1/p0;->W:I

    invoke-virtual {p1}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/s2;

    iget-object v0, v0, Lu1/s2;->a:Ly1/o;

    iget-object v0, v0, Ly1/o;->d:Ly1/j;

    sget-object v1, Ly1/r;->w:Ly1/u;

    invoke-static {v0, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ly1/i;->j:Ly1/u;

    iget-object v0, v0, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :cond_1
    check-cast v0, Ly1/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ly1/a;->b:Lq8/a;

    check-cast v0, Lc9/c;

    if-eqz v0, :cond_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
