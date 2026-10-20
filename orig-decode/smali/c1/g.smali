.class public final Lc1/g;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lc1/g;

.field public static final c:Lc1/g;

.field public static final d:Lc1/g;

.field public static final e:Lc1/g;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lc1/g;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lc1/g;-><init>(I)V

    sput-object v0, Lc1/g;->b:Lc1/g;

    new-instance v0, Lc1/g;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lc1/g;-><init>(I)V

    sput-object v0, Lc1/g;->c:Lc1/g;

    new-instance v0, Lc1/g;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lc1/g;-><init>(I)V

    sput-object v0, Lc1/g;->d:Lc1/g;

    new-instance v0, Lc1/g;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lc1/g;-><init>(I)V

    sput-object v0, Lc1/g;->e:Lc1/g;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc1/g;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lc1/k;
    .locals 1

    iget v0, p0, Lc1/g;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lc1/k;->b:Lc1/k;

    return-object v0

    :pswitch_0
    sget-object v0, Lc1/k;->b:Lc1/k;

    return-object v0

    :pswitch_1
    sget-object v0, Lc1/k;->b:Lc1/k;

    return-object v0

    :pswitch_2
    sget-object v0, Lc1/k;->b:Lc1/k;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc1/g;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc1/p;

    packed-switch v0, :pswitch_data_1

    invoke-static {p1}, Landroidx/compose/ui/focus/a;->C(Lc1/p;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :pswitch_0
    invoke-static {p1}, Landroidx/compose/ui/focus/a;->C(Lc1/p;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_1
    check-cast p1, Lc1/p;

    packed-switch v0, :pswitch_data_2

    invoke-static {p1}, Landroidx/compose/ui/focus/a;->C(Lc1/p;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :pswitch_2
    invoke-static {p1}, Landroidx/compose/ui/focus/a;->C(Lc1/p;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_3
    check-cast p1, Lc1/b;

    iget p1, p1, Lc1/b;->a:I

    invoke-virtual {p0}, Lc1/g;->a()Lc1/k;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lc1/b;

    iget p1, p1, Lc1/b;->a:I

    invoke-virtual {p0}, Lc1/g;->a()Lc1/k;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lc1/b;

    iget p1, p1, Lc1/b;->a:I

    invoke-virtual {p0}, Lc1/g;->a()Lc1/k;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lc1/b;

    iget p1, p1, Lc1/b;->a:I

    invoke-virtual {p0}, Lc1/g;->a()Lc1/k;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x4
        :pswitch_2
    .end packed-switch
.end method
