.class public final Lw0/o;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lw0/o;

.field public static final c:Lw0/o;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lw0/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw0/o;-><init>(I)V

    sput-object v0, Lw0/o;->b:Lw0/o;

    new-instance v0, Lw0/o;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lw0/o;-><init>(I)V

    sput-object v0, Lw0/o;->c:Lw0/o;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lw0/o;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lw0/o;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lw0/n;

    return-object v0

    :pswitch_0
    check-cast p1, Lw0/n;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
