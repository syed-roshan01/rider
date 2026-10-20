.class public abstract Lq9/i;
.super Lq9/g;


# instance fields
.field public final d:Lp9/f;


# direct methods
.method public constructor <init>(ILu8/j;Lo9/a;Lp9/f;)V
    .locals 0

    invoke-direct {p0, p2, p1, p3}, Lq9/g;-><init>(Lu8/j;ILo9/a;)V

    iput-object p4, p0, Lq9/i;->d:Lp9/f;

    return-void
.end method


# virtual methods
.method public final c(Lo9/r;Lu8/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lq9/x;

    invoke-direct {v0, p1}, Lq9/x;-><init>(Lo9/t;)V

    invoke-virtual {p0, v0, p2}, Lq9/i;->g(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    :goto_0
    return-object p1
.end method

.method public final collect(Lp9/g;Lu8/e;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lq9/g;->b:I

    const/4 v2, -0x3

    if-ne v1, v2, :cond_5

    invoke-interface {p2}, Lu8/e;->getContext()Lu8/j;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v3, Lm9/w;->c:Lm9/w;

    iget-object v4, p0, Lq9/g;->a:Lu8/j;

    invoke-interface {v4, v2, v3}, Lu8/j;->e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1, v4}, Lu8/j;->O(Lu8/j;)Lu8/j;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    invoke-static {v1, v4, v2}, Lz6/a;->C(Lu8/j;Lu8/j;Z)Lu8/j;

    move-result-object v2

    :goto_0
    invoke-static {v2, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, p1, p2}, Lq9/i;->g(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_6

    :goto_1
    move-object v0, p1

    goto :goto_4

    :cond_1
    sget-object v3, Lu8/f;->a:Lu8/f;

    invoke-interface {v2, v3}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v4

    invoke-interface {v1, v3}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v1

    invoke-static {v4, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Lu8/e;->getContext()Lu8/j;

    move-result-object v1

    instance-of v3, p1, Lq9/x;

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    instance-of v3, p1, Lq9/s;

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    new-instance v3, Ls/c0;

    invoke-direct {v3, p1, v1}, Ls/c0;-><init>(Lp9/g;Lu8/j;)V

    move-object p1, v3

    :goto_2
    new-instance v1, Lq9/h;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3}, Lq9/h;-><init>(Lq9/i;Lu8/e;)V

    invoke-static {v2}, Lr9/a;->s(Lu8/j;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, p1, v3, v1, p2}, Lz6/a;->v0(Lu8/j;Ljava/lang/Object;Ljava/lang/Object;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_4

    goto :goto_3

    :cond_4
    move-object p1, v0

    :goto_3
    if-ne p1, p2, :cond_6

    goto :goto_1

    :cond_5
    invoke-super {p0, p1, p2}, Lq9/g;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    return-object v0
.end method

.method public abstract g(Lp9/g;Lu8/e;)Ljava/lang/Object;
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lq9/i;->d:Lp9/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lq9/g;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
