.class public final La0/q;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lv0/e;

.field public final b:Lc9/a;

.field public final c:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lv0/e;Lz/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/q;->a:Lv0/e;

    iput-object p2, p0, La0/q;->b:Lc9/a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, La0/q;->c:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Ljava/lang/Object;)Lc9/e;
    .locals 5

    iget-object v0, p0, La0/q;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La0/p;

    const v2, 0x53af4291

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iget v4, v1, La0/p;->c:I

    if-ne v4, p1, :cond_0

    iget-object v4, v1, La0/p;->b:Ljava/lang/Object;

    invoke-static {v4, p3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object p1, v1, La0/p;->d:Lc9/e;

    if-nez p1, :cond_1

    new-instance p1, Lv/n0;

    iget-object p2, v1, La0/p;->e:La0/q;

    invoke-direct {p1, v3, p2, v1}, Lv/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Lu0/b;

    invoke-direct {p2, v2, p1, v3}, Lu0/b;-><init>(ILd9/j;Z)V

    iput-object p2, v1, La0/p;->d:Lc9/e;

    :goto_0
    move-object p1, p2

    goto :goto_1

    :cond_0
    new-instance v1, La0/p;

    invoke-direct {v1, p0, p1, p2, p3}, La0/p;-><init>(La0/q;ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v1, La0/p;->d:Lc9/e;

    if-nez p1, :cond_1

    new-instance p1, Lv/n0;

    invoke-direct {p1, v3, p0, v1}, Lv/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Lu0/b;

    invoke-direct {p2, v2, p1, v3}, Lu0/b;-><init>(ILd9/j;Z)V

    iput-object p2, v1, La0/p;->d:Lc9/e;

    goto :goto_0

    :cond_1
    :goto_1
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, La0/q;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La0/p;

    if-eqz v1, :cond_1

    iget-object v0, v1, La0/p;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v1, p0, La0/q;->b:Lc9/a;

    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La0/s;

    invoke-interface {v1, p1}, La0/s;->b(Ljava/lang/Object;)I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_2

    invoke-interface {v1, p1}, La0/s;->d(I)Ljava/lang/Object;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method
