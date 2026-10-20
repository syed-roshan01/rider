.class public final Ll2/n;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ll2/o;


# direct methods
.method public synthetic constructor <init>(Ll2/o;I)V
    .locals 0

    iput p2, p0, Ll2/n;->a:I

    iput-object p1, p0, Ll2/n;->b:Ll2/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll2/n;->a:I

    iget-object v1, p0, Ll2/n;->b:Ll2/o;

    packed-switch v0, :pswitch_data_0

    return-object v1

    :pswitch_0
    invoke-interface {v1}, Ll2/o;->c()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
