.class public final Lm9/x;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lm9/x;

.field public static final c:Lm9/x;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lm9/x;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/x;-><init>(I)V

    sput-object v0, Lm9/x;->b:Lm9/x;

    new-instance v0, Lm9/x;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lm9/x;-><init>(I)V

    sput-object v0, Lm9/x;->c:Lm9/x;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lm9/x;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lm9/x;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu8/h;

    instance-of v0, p1, Lm9/x0;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lm9/x0;

    :cond_0
    return-object v1

    :pswitch_0
    check-cast p1, Lu8/h;

    instance-of v0, p1, Lm9/z;

    if-eqz v0, :cond_1

    move-object v1, p1

    check-cast v1, Lm9/z;

    :cond_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
