.class public final Lu1/s;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lu1/s;

.field public static final c:Lu1/s;

.field public static final d:Lu1/s;

.field public static final e:Lu1/s;

.field public static final f:Lu1/s;

.field public static final n:Lu1/s;

.field public static final o:Lu1/s;

.field public static final p:Lu1/s;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lu1/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu1/s;-><init>(I)V

    sput-object v0, Lu1/s;->b:Lu1/s;

    new-instance v0, Lu1/s;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lu1/s;-><init>(I)V

    sput-object v0, Lu1/s;->c:Lu1/s;

    new-instance v0, Lu1/s;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lu1/s;-><init>(I)V

    sput-object v0, Lu1/s;->d:Lu1/s;

    new-instance v0, Lu1/s;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lu1/s;-><init>(I)V

    sput-object v0, Lu1/s;->e:Lu1/s;

    new-instance v0, Lu1/s;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lu1/s;-><init>(I)V

    sput-object v0, Lu1/s;->f:Lu1/s;

    new-instance v0, Lu1/s;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lu1/s;-><init>(I)V

    sput-object v0, Lu1/s;->n:Lu1/s;

    new-instance v0, Lu1/s;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lu1/s;-><init>(I)V

    sput-object v0, Lu1/s;->o:Lu1/s;

    new-instance v0, Lu1/s;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lu1/s;-><init>(I)V

    sput-object v0, Lu1/s;->p:Lu1/s;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu1/s;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/node/a;)Ljava/lang/Boolean;
    .locals 3

    iget v0, p0, Lu1/s;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->n()Ly1/j;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-boolean v0, p1, Ly1/j;->b:Z

    if-ne v0, v2, :cond_0

    sget-object v0, Ly1/i;->h:Ly1/u;

    iget-object p1, p1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move v1, v2

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object p1, p1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lt1/x0;->d(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->n()Ly1/j;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-boolean p1, p1, Ly1/j;->b:Z

    if-ne p1, v2, :cond_1

    move v1, v2

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu1/s;->a:I

    packed-switch v1, :pswitch_data_0

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    return-object v0

    :pswitch_0
    check-cast p1, La1/a;

    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lu1/x1;->l(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lg2/v;

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Lu1/s;->a(Landroidx/compose/ui/node/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Lu1/s;->a(Landroidx/compose/ui/node/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Lu1/s;->a(Landroidx/compose/ui/node/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lq1/c;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_7
    check-cast p1, Landroid/content/res/Configuration;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
