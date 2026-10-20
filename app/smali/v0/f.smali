.class public final Lv0/f;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final b:Lv0/f;

.field public static final c:Lv0/f;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lv0/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv0/f;-><init>(I)V

    sput-object v0, Lv0/f;->b:Lv0/f;

    new-instance v0, Lv0/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lv0/f;-><init>(I)V

    sput-object v0, Lv0/f;->c:Lv0/f;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lv0/f;->a:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lv0/f;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lv0/d;

    return-object p2

    :pswitch_0
    check-cast p1, Lv0/d;

    check-cast p2, Lv0/j;

    iget-object p1, p2, Lv0/j;->a:Ljava/util/Map;

    invoke-static {p1}, Lr8/v;->I0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iget-object p2, p2, Lv0/j;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/i;

    iget-boolean v1, v0, Lv0/i;->b:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Lv0/i;->c:Lv0/n;

    invoke-virtual {v1}, Lv0/n;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    iget-object v0, v0, Lv0/i;->a:Ljava/lang/Object;

    if-eqz v2, :cond_1

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p1, 0x0

    :cond_3
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
