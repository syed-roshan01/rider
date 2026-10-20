.class public final Lu0/e;
.super Lr0/d;

# interfaces
.implements Lm0/r1;


# static fields
.field public static final d:Lu0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lu0/e;

    sget-object v1, Lr0/r;->e:Lr0/r;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr0/d;-><init>(Lr0/r;I)V

    sput-object v0, Lu0/e;->d:Lu0/e;

    return-void
.end method


# virtual methods
.method public final a()Lr0/f;
    .locals 1

    new-instance v0, Lu0/d;

    invoke-direct {v0, p0}, Lr0/f;-><init>(Lr0/d;)V

    iput-object p0, v0, Lu0/d;->n:Lu0/e;

    return-object v0
.end method

.method public final builder()Lp0/e;
    .locals 1

    new-instance v0, Lu0/d;

    invoke-direct {v0, p0}, Lr0/f;-><init>(Lr0/d;)V

    iput-object p0, v0, Lu0/d;->n:Lu0/e;

    return-object v0
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lm0/z;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lm0/z;

    invoke-super {p0, p1}, Lr0/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lm0/l3;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lm0/l3;

    invoke-super {p0, p1}, Lr8/e;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lm0/z;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lm0/z;

    invoke-super {p0, p1}, Lr0/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/l3;

    return-object p1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lm0/z;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Lm0/z;

    check-cast p2, Lm0/l3;

    invoke-super {p0, p1, p2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/l3;

    return-object p1
.end method
