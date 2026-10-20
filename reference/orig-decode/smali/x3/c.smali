.class public abstract Lx3/c;
.super Ljava/lang/Object;


# direct methods
.method public static final d([Ljava/lang/Object;Lv0/p;Lc9/a;Lm0/m;I)Ljava/lang/Object;
    .locals 9

    check-cast p3, Lm0/q;

    const v0, 0x1a56bfab

    invoke-virtual {p3, v0}, Lm0/q;->Z(I)V

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p1, Lv0/q;->a:Lv0/p;

    :cond_0
    iget p4, p3, Lm0/q;->P:I

    const/16 v0, 0x24

    invoke-static {v0}, Ld7/a;->n(I)V

    invoke-static {p4, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p4

    const-string v0, "toString(this, checkRadix(radix))"

    invoke-static {p4, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lv0/o;->a:Lm0/m3;

    invoke-virtual {p3, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lv0/l;

    const v0, -0x1d58f75c

    invoke-virtual {p3, v0}, Lm0/q;->Z(I)V

    invoke-virtual {p3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm0/l;->a:Lk0/y0;

    const/4 v7, 0x0

    if-ne v0, v1, :cond_3

    if-eqz v6, :cond_1

    invoke-interface {v6, p4}, Lv0/l;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p1, Lv0/p;->b:Lc9/c;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v7

    :goto_0
    if-nez v0, :cond_2

    invoke-interface {p2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    :cond_2
    move-object v4, v0

    new-instance v8, Lv0/d;

    move-object v0, v8

    move-object v1, p1

    move-object v2, v6

    move-object v3, p4

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lv0/d;-><init>(Lv0/p;Lv0/l;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-virtual {p3, v8}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_3
    const/4 v8, 0x0

    invoke-virtual {p3, v8}, Lm0/q;->t(Z)V

    move-object v1, v0

    check-cast v1, Lv0/d;

    iget-object v0, v1, Lv0/d;->e:[Ljava/lang/Object;

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v7, v1, Lv0/d;->d:Ljava/lang/Object;

    :cond_4
    if-nez v7, :cond_5

    invoke-interface {p2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v7

    :cond_5
    new-instance p2, Lv0/b;

    move-object v0, p2

    move-object v2, p1

    move-object v3, v6

    move-object v4, p4

    move-object v5, v7

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lv0/b;-><init>(Lv0/d;Lv0/p;Lv0/l;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-static {p2, p3}, Lm0/s;->d(Lc9/a;Lm0/m;)V

    invoke-virtual {p3, v8}, Lm0/q;->t(Z)V

    return-object v7
.end method


# virtual methods
.method public abstract a(Lu8/e;)Ljava/lang/Object;
.end method

.method public abstract b(Landroid/net/Uri;Landroid/view/InputEvent;Lu8/e;)Ljava/lang/Object;
.end method

.method public abstract c(Landroid/net/Uri;Lu8/e;)Ljava/lang/Object;
.end method
