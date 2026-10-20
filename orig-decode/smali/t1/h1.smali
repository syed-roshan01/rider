.class public final Lt1/h1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final a:Lt1/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt1/h1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lt1/h1;->a:Lt1/h1;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Landroidx/compose/ui/node/a;

    check-cast p2, Landroidx/compose/ui/node/a;

    iget v0, p2, Landroidx/compose/ui/node/a;->q:I

    iget v1, p1, Landroidx/compose/ui/node/a;->q:I

    invoke-static {v0, v1}, Ld7/a;->o(II)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p1, p2}, Ld7/a;->o(II)I

    move-result v0

    :goto_0
    return v0
.end method
