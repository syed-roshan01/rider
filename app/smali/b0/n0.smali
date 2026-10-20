.class public final Lb0/n0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:Lc9/a;


# direct methods
.method public constructor <init>(IFLb0/j0;)V
    .locals 0

    iput p1, p0, Lb0/n0;->a:I

    iput p2, p0, Lb0/n0;->b:F

    iput-object p3, p0, Lb0/n0;->c:Lc9/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lb0/k0;

    iget-object v1, p0, Lb0/n0;->c:Lc9/a;

    iget v2, p0, Lb0/n0;->a:I

    iget v3, p0, Lb0/n0;->b:F

    invoke-direct {v0, v2, v3, v1}, Lb0/k0;-><init>(IFLc9/a;)V

    return-object v0
.end method
