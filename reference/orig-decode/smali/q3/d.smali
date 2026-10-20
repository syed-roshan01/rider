.class public final Lq3/d;
.super Lq3/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lq3/a;->b:Lq3/a;

    invoke-direct {p0, v0}, Lq3/d;-><init>(Lq3/c;)V

    return-void
.end method

.method public constructor <init>(Lq3/c;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lq3/c;-><init>()V

    iget-object v0, p0, Lq3/c;->a:Ljava/util/LinkedHashMap;

    .line 3
    iget-object p1, p1, Lq3/c;->a:Ljava/util/LinkedHashMap;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final a(Lq3/b;)Ljava/lang/Object;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq3/c;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lq3/b;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lq3/c;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
