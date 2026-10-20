.class public final Ly/x0;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:Ly/g;

.field public final c:Ly/i;

.field public final d:Ly/a0;

.field public final e:Ljava/util/List;

.field public final f:[Lr1/x0;

.field public final g:[Ly/y0;


# direct methods
.method public constructor <init>(ILy/g;Ly/i;FLy/a0;Ljava/util/List;[Lr1/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly/x0;->a:I

    iput-object p2, p0, Ly/x0;->b:Ly/g;

    iput-object p3, p0, Ly/x0;->c:Ly/i;

    iput-object p5, p0, Ly/x0;->d:Ly/a0;

    iput-object p6, p0, Ly/x0;->e:Ljava/util/List;

    iput-object p7, p0, Ly/x0;->f:[Lr1/x0;

    invoke-interface {p6}, Ljava/util/List;->size()I

    move-result p1

    new-array p2, p1, [Ly/y0;

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p1, :cond_0

    iget-object p4, p0, Ly/x0;->e:Ljava/util/List;

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lr1/p;

    invoke-static {p4}, Landroidx/compose/foundation/layout/a;->g(Lr1/p;)Ly/y0;

    move-result-object p4

    aput-object p4, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    iput-object p2, p0, Ly/x0;->g:[Ly/y0;

    return-void
.end method


# virtual methods
.method public final a(Lr1/x0;)I
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Ly/x0;->a:I

    if-ne v1, v0, :cond_0

    iget p1, p1, Lr1/x0;->a:I

    goto :goto_0

    :cond_0
    iget p1, p1, Lr1/x0;->b:I

    :goto_0
    return p1
.end method
