.class public final Lb0/u;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lb0/u;

.field public static final c:Lb0/u;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lb0/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb0/u;-><init>(I)V

    sput-object v0, Lb0/u;->b:Lb0/u;

    new-instance v0, Lb0/u;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb0/u;-><init>(I)V

    sput-object v0, Lb0/u;->c:Lb0/u;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb0/u;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lb0/u;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/List;

    new-instance v0, Lb0/k0;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v2, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v3, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    new-instance v4, Lb0/j0;

    invoke-direct {v4, v1, p1}, Lb0/j0;-><init>(ILjava/util/List;)V

    invoke-direct {v0, v2, v3, v4}, Lb0/k0;-><init>(IFLc9/a;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lr1/w0;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
