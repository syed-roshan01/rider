.class public final Lp5/e;
.super Ljava/lang/Object;

# interfaces
.implements Ln5/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lp8/a;


# direct methods
.method public synthetic constructor <init>(Lp8/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lp5/e;->a:I

    iput-object p1, p0, Lp5/e;->b:Lp8/a;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lp5/e;->a:I

    iget-object v1, p0, Lp5/e;->b:Lp8/a;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-interface {v1}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt5/a;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v2, Li5/d;->a:Li5/d;

    new-instance v3, Ll/z2;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Ll/z2;-><init>(I)V

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v5

    const-string v6, "Null flags"

    if-eqz v5, :cond_6

    iput-object v5, v3, Ll/z2;->d:Ljava/lang/Object;

    const-wide/16 v7, 0x7530

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v3, Ll/z2;->b:Ljava/lang/Object;

    const-wide/32 v7, 0x5265c00

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v3, Ll/z2;->c:Ljava/lang/Object;

    invoke-virtual {v3}, Ll/z2;->k()Lq5/b;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Li5/d;->c:Li5/d;

    new-instance v3, Ll/z2;

    invoke-direct {v3, v4}, Ll/z2;-><init>(I)V

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_5

    iput-object v5, v3, Ll/z2;->d:Ljava/lang/Object;

    const-wide/16 v9, 0x3e8

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v3, Ll/z2;->b:Ljava/lang/Object;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v3, Ll/z2;->c:Ljava/lang/Object;

    invoke-virtual {v3}, Ll/z2;->k()Lq5/b;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Li5/d;->b:Li5/d;

    new-instance v3, Ll/z2;

    invoke-direct {v3, v4}, Ll/z2;-><init>(I)V

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_4

    iput-object v4, v3, Ll/z2;->d:Ljava/lang/Object;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iput-object v4, v3, Ll/z2;->b:Ljava/lang/Object;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iput-object v4, v3, Ll/z2;->c:Ljava/lang/Object;

    sget-object v4, Lq5/d;->b:Lq5/d;

    filled-new-array {v4}, [Lq5/d;

    move-result-object v4

    new-instance v5, Ljava/util/HashSet;

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v5}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_3

    iput-object v4, v3, Ll/z2;->d:Ljava/lang/Object;

    invoke-virtual {v3}, Ll/z2;->k()Lq5/b;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    invoke-static {}, Li5/d;->values()[Li5/d;

    move-result-object v3

    array-length v3, v3

    if-lt v2, v3, :cond_1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Lq5/a;

    invoke-direct {v2, v0, v1}, Lq5/a;-><init>(Lt5/a;Ljava/util/Map;)V

    return-object v2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not all priorities have been configured"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "missing required property: clock"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
