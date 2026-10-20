.class public final La0/m0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lv0/l;


# direct methods
.method public synthetic constructor <init>(Lv0/l;I)V
    .locals 0

    iput p2, p0, La0/m0;->a:I

    iput-object p1, p0, La0/m0;->b:Lv0/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, La0/m0;->a:I

    iget-object v1, p0, La0/m0;->b:Lv0/l;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/Map;

    new-instance v0, La0/o0;

    invoke-direct {v0, v1, p1}, La0/o0;-><init>(Lv0/l;Ljava/util/Map;)V

    return-object v0

    :pswitch_0
    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lv0/l;->a(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
