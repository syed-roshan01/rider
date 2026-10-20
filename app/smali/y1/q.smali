.class public final Ly1/q;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final b:Ly1/q;

.field public static final c:Ly1/q;

.field public static final d:Ly1/q;

.field public static final e:Ly1/q;

.field public static final f:Ly1/q;

.field public static final n:Ly1/q;

.field public static final o:Ly1/q;

.field public static final p:Ly1/q;

.field public static final q:Ly1/q;

.field public static final r:Ly1/q;

.field public static final s:Ly1/q;

.field public static final t:Ly1/q;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ly1/q;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->b:Ly1/q;

    new-instance v0, Ly1/q;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->c:Ly1/q;

    new-instance v0, Ly1/q;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->d:Ly1/q;

    new-instance v0, Ly1/q;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->e:Ly1/q;

    new-instance v0, Ly1/q;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->f:Ly1/q;

    new-instance v0, Ly1/q;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->n:Ly1/q;

    new-instance v0, Ly1/q;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->o:Ly1/q;

    new-instance v0, Ly1/q;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->p:Ly1/q;

    new-instance v0, Ly1/q;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->q:Ly1/q;

    new-instance v0, Ly1/q;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->r:Ly1/q;

    new-instance v0, Ly1/q;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->s:Ly1/q;

    new-instance v0, Ly1/q;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ly1/q;-><init>(I)V

    sput-object v0, Ly1/q;->t:Ly1/q;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ly1/q;->a:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1

    iget v0, p0, Ly1/q;->a:I

    packed-switch v0, :pswitch_data_0

    if-eqz p1, :cond_0

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object p2, p1

    :cond_0
    return-object p2

    :pswitch_0
    if-eqz p1, :cond_1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object p2, p1

    :cond_1
    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lq8/l;)V
    .locals 1

    iget p1, p0, Ly1/q;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "merge function called on unmergeable property PaneTitle."

    iget v1, p0, Ly1/q;->a:I

    packed-switch v1, :pswitch_data_0

    if-nez p1, :cond_0

    move-object p1, p2

    :cond_0
    return-object p1

    :pswitch_0
    check-cast p1, Ly1/a;

    check-cast p2, Ly1/a;

    new-instance v0, Ly1/a;

    if-eqz p1, :cond_1

    iget-object v1, p1, Ly1/a;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    :cond_1
    iget-object v1, p2, Ly1/a;->a:Ljava/lang/String;

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p1, Ly1/a;->b:Lq8/a;

    if-nez p1, :cond_4

    :cond_3
    iget-object p1, p2, Ly1/a;->b:Lq8/a;

    :cond_4
    invoke-direct {v0, v1, p1}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Float;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Ly1/q;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    packed-switch v1, :pswitch_data_1

    return-object p1

    :pswitch_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_6
    check-cast p1, Ly1/g;

    check-cast p2, Ly1/g;

    iget p2, p2, Ly1/g;->a:I

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    packed-switch v1, :pswitch_data_2

    return-object p1

    :pswitch_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_9
    check-cast p1, Lq8/l;

    check-cast p2, Lq8/l;

    invoke-virtual {p0, p1}, Ly1/q;->b(Lq8/l;)V

    return-object p1

    :pswitch_a
    check-cast p1, Lq8/l;

    check-cast p2, Lq8/l;

    invoke-virtual {p0, p1}, Ly1/q;->b(Lq8/l;)V

    return-object p1

    :pswitch_b
    check-cast p1, Lq8/l;

    check-cast p2, Lq8/l;

    invoke-virtual {p0, p1}, Ly1/q;->b(Lq8/l;)V

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Ly1/q;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_7
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_5
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x4
        :pswitch_8
    .end packed-switch
.end method
