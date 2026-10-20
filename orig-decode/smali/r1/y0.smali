.class public final Lr1/y0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lr1/y0;

.field public static final c:Lr1/y0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lr1/y0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr1/y0;-><init>(I)V

    sput-object v0, Lr1/y0;->b:Lr1/y0;

    new-instance v0, Lr1/y0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lr1/y0;-><init>(I)V

    sput-object v0, Lr1/y0;->c:Lr1/y0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lr1/y0;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lr1/y0;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lr1/w0;

    return-object v0

    :pswitch_0
    check-cast p1, Le1/w;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
