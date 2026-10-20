.class public final synthetic Landroidx/activity/f;
.super Ljava/lang/Object;

# interfaces
.implements Lb4/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroidx/activity/f;->a:I

    iput-object p1, p0, Landroidx/activity/f;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 5

    iget v0, p0, Landroidx/activity/f;->a:I

    iget-object v1, p0, Landroidx/activity/f;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Landroidx/fragment/app/x0;

    invoke-virtual {v1}, Landroidx/fragment/app/x0;->L()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v1, Landroidx/fragment/app/g0;

    invoke-static {v1}, Landroidx/fragment/app/g0;->d(Landroidx/fragment/app/g0;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v1, Lv0/l;

    invoke-interface {v1}, Lv0/l;->b()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    instance-of v4, v2, Ljava/util/ArrayList;

    if-eqz v4, :cond_0

    check-cast v2, Ljava/util/ArrayList;

    goto :goto_1

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    check-cast v2, Ljava/util/Collection;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v2, v4

    :goto_1
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_1
    return-object v1

    :pswitch_2
    check-cast v1, Landroidx/activity/p;

    invoke-static {v1}, Landroidx/activity/p;->a(Landroidx/activity/p;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
