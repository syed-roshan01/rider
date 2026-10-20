.class public final synthetic Lc0/i;
.super Ld9/h;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic p:Lc0/m;

.field public final synthetic q:Lr1/s;

.field public final synthetic r:Lc9/a;


# direct methods
.method public constructor <init>(Lc0/m;Lr1/s;Lc9/a;)V
    .locals 6

    iput-object p1, p0, Lc0/i;->p:Lc0/m;

    iput-object p2, p0, Lc0/i;->q:Lr1/s;

    iput-object p3, p0, Lc0/i;->r:Lc9/a;

    const/4 v1, 0x0

    const-class v2, Ld9/i;

    const-string v3, "localRect"

    const-string v4, "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ld9/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lc0/i;->r:Lc9/a;

    iget-object v1, p0, Lc0/i;->p:Lc0/m;

    iget-object v2, p0, Lc0/i;->q:Lr1/s;

    invoke-static {v1, v2, v0}, Lc0/m;->H0(Lc0/m;Lr1/s;Lc9/a;)Ld1/d;

    move-result-object v0

    return-object v0
.end method
