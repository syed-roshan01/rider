.class public final Ls/j;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/n0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lv0/i;Lv0/j;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Ls/j;->a:I

    iput-object p1, p0, Ls/j;->c:Ljava/lang/Object;

    iput-object p2, p0, Ls/j;->d:Ljava/lang/Object;

    iput-object p3, p0, Ls/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw0/u;Ljava/lang/Object;Ls/w;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ls/j;->a:I

    iput-object p1, p0, Ls/j;->c:Ljava/lang/Object;

    iput-object p2, p0, Ls/j;->b:Ljava/lang/Object;

    iput-object p3, p0, Ls/j;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget v0, p0, Ls/j;->a:I

    iget-object v1, p0, Ls/j;->b:Ljava/lang/Object;

    iget-object v2, p0, Ls/j;->d:Ljava/lang/Object;

    iget-object v3, p0, Ls/j;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lv0/i;

    check-cast v2, Lv0/j;

    iget-object v0, v2, Lv0/j;->a:Ljava/util/Map;

    iget-boolean v4, v3, Lv0/i;->b:Z

    if-eqz v4, :cond_1

    iget-object v4, v3, Lv0/i;->c:Lv0/n;

    invoke-virtual {v4}, Lv0/n;->b()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    iget-object v3, v3, Lv0/i;->a:Ljava/lang/Object;

    if-eqz v5, :cond_0

    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    iget-object v0, v2, Lv0/j;->b:Ljava/util/LinkedHashMap;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_0
    check-cast v3, Lw0/u;

    invoke-virtual {v3, v1}, Lw0/u;->remove(Ljava/lang/Object;)Z

    check-cast v2, Ls/w;

    iget-object v0, v2, Ls/w;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
