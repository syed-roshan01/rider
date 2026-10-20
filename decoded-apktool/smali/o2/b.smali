.class public final Lo2/b;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lo2/b;

.field public static final c:Lo2/b;

.field public static final d:Lo2/b;

.field public static final e:Lo2/b;

.field public static final f:Lo2/b;

.field public static final n:Lo2/b;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lo2/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo2/b;-><init>(I)V

    sput-object v0, Lo2/b;->b:Lo2/b;

    new-instance v0, Lo2/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo2/b;-><init>(I)V

    sput-object v0, Lo2/b;->c:Lo2/b;

    new-instance v0, Lo2/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lo2/b;-><init>(I)V

    sput-object v0, Lo2/b;->d:Lo2/b;

    new-instance v0, Lo2/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lo2/b;-><init>(I)V

    sput-object v0, Lo2/b;->e:Lo2/b;

    new-instance v0, Lo2/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lo2/b;-><init>(I)V

    sput-object v0, Lo2/b;->f:Lo2/b;

    new-instance v0, Lo2/b;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lo2/b;-><init>(I)V

    sput-object v0, Lo2/b;->n:Lo2/b;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lo2/b;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lo2/b;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lo2/r;

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lo2/r;->l()V

    :cond_0
    return-object v0

    :pswitch_0
    check-cast p1, Lr1/w0;

    return-object v0

    :pswitch_1
    check-cast p1, Ly1/v;

    packed-switch v1, :pswitch_data_1

    sget-object v1, Ly1/t;->a:[Lj9/f;

    sget-object v1, Ly1/r;->q:Ly1/u;

    check-cast p1, Ly1/j;

    invoke-virtual {p1, v1, v0}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_2
    sget-object v1, Ly1/t;->a:[Lj9/f;

    sget-object v1, Ly1/r;->r:Ly1/u;

    check-cast p1, Ly1/j;

    invoke-virtual {p1, v1, v0}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :pswitch_3
    check-cast p1, Lr1/w0;

    return-object v0

    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    return-object v0

    :pswitch_5
    check-cast p1, Ly1/v;

    packed-switch v1, :pswitch_data_2

    sget-object v1, Ly1/t;->a:[Lj9/f;

    sget-object v1, Ly1/r;->q:Ly1/u;

    check-cast p1, Ly1/j;

    invoke-virtual {p1, v1, v0}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    sget-object v1, Ly1/t;->a:[Lj9/f;

    sget-object v1, Ly1/r;->r:Ly1/u;

    check-cast p1, Ly1/j;

    invoke-virtual {p1, v1, v0}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_6
    .end packed-switch
.end method
