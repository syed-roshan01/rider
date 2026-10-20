.class public final Lm9/w;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final b:Lm9/w;

.field public static final c:Lm9/w;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lm9/w;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/w;-><init>(I)V

    sput-object v0, Lm9/w;->b:Lm9/w;

    new-instance v0, Lm9/w;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lm9/w;-><init>(I)V

    sput-object v0, Lm9/w;->c:Lm9/w;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lm9/w;->a:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lm9/w;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lu8/h;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lu8/j;

    check-cast p2, Lu8/h;

    invoke-interface {p1, p2}, Lu8/j;->O(Lu8/j;)Lu8/j;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
