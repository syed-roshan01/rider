.class public final Lv/n1;
.super Ljava/lang/Object;

# interfaces
.implements Lv/x0;
.implements Lv/k0;


# instance fields
.field public a:Lv/l2;

.field public b:Lv/r1;


# virtual methods
.method public final a(F)V
    .locals 4

    iget-object v0, p0, Lv/n1;->b:Lv/r1;

    iget-object v1, p0, Lv/n1;->a:Lv/l2;

    invoke-virtual {v1, p1}, Lv/l2;->d(F)J

    move-result-wide v2

    const/4 p1, 0x1

    invoke-virtual {v1, v0, v2, v3, p1}, Lv/l2;->a(Lv/r1;JI)J

    return-void
.end method

.method public final b(Lv/v0;Lv/i;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lu/s1;->b:Lu/s1;

    iget-object v1, p0, Lv/n1;->a:Lv/l2;

    iget-object v1, v1, Lv/l2;->a:Lv/f2;

    new-instance v2, Lv/m1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lv/m1;-><init>(Lv/n1;Lc9/e;Lu8/e;)V

    invoke-interface {v1, v0, v2, p2}, Lv/f2;->c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
