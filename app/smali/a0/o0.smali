.class public final La0/o0;
.super Ljava/lang/Object;

# interfaces
.implements Lv0/l;
.implements Lv0/e;


# instance fields
.field public final a:Lv0/l;

.field public final b:Lm0/n1;

.field public final c:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Lv0/l;Ljava/util/Map;)V
    .locals 2

    new-instance v0, La0/m0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, La0/m0;-><init>(Lv0/l;I)V

    sget-object p1, Lv0/o;->a:Lm0/m3;

    new-instance p1, Lv0/n;

    invoke-direct {p1, p2, v0}, Lv0/n;-><init>(Ljava/util/Map;Lc9/c;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/o0;->a:Lv0/l;

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, La0/o0;->b:Lm0/n1;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, La0/o0;->c:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, La0/o0;->a:Lv0/l;

    invoke-interface {v0, p1}, Lv0/l;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final b()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, La0/o0;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, La0/o0;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Lv0/e;->d(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, La0/o0;->a:Lv0/l;

    invoke-interface {v0}, Lv0/l;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La0/o0;->a:Lv0/l;

    invoke-interface {v0, p1}, Lv0/l;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, La0/o0;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/e;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lv0/e;->d(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "null wrappedHolder"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Ljava/lang/String;Lv0/c;)Lv0/m;
    .locals 1

    iget-object v0, p0, La0/o0;->a:Lv0/l;

    invoke-interface {v0, p1, p2}, Lv0/l;->e(Ljava/lang/String;Lv0/c;)Lv0/m;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/lang/Object;Lc9/e;Lm0/m;I)V
    .locals 7

    check-cast p3, Lm0/q;

    const v0, -0x298e20f1

    invoke-virtual {p3, v0}, Lm0/q;->a0(I)Lm0/q;

    iget-object v0, p0, La0/o0;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/e;

    if-eqz v0, :cond_1

    and-int/lit8 v1, p4, 0x70

    or-int/lit16 v1, v1, 0x208

    invoke-interface {v0, p1, p2, p3, v1}, Lv0/e;->f(Ljava/lang/Object;Lc9/e;Lm0/m;I)V

    new-instance v0, Lu/s;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0, p1}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0, p3}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    invoke-virtual {p3}, Lm0/q;->x()Lm0/x1;

    move-result-object p3

    if-eqz p3, :cond_0

    new-instance v6, La0/g0;

    const/4 v2, 0x1

    move-object v0, v6

    move v1, p4

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, La0/g0;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v6, p3, Lm0/x1;->d:Lc9/e;

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "null wrappedHolder"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
