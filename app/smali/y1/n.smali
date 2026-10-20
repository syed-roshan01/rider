.class public final Ly1/n;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Ly1/n;

.field public static final c:Ly1/n;

.field public static final d:Ly1/n;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ly1/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly1/n;-><init>(I)V

    sput-object v0, Ly1/n;->b:Ly1/n;

    new-instance v0, Ly1/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ly1/n;-><init>(I)V

    sput-object v0, Ly1/n;->c:Ly1/n;

    new-instance v0, Ly1/n;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ly1/n;-><init>(I)V

    sput-object v0, Ly1/n;->d:Ly1/n;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ly1/n;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/node/a;)Ljava/lang/Boolean;
    .locals 3

    iget v0, p0, Ly1/n;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lt1/x0;->d(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->n()Ly1/j;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Ly1/j;->b:Z

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->n()Ly1/j;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-boolean p1, p1, Ly1/j;->b:Z

    if-ne p1, v1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ly1/n;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Ly1/n;->a(Landroidx/compose/ui/node/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Ly1/n;->a(Landroidx/compose/ui/node/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Ly1/n;->a(Landroidx/compose/ui/node/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
