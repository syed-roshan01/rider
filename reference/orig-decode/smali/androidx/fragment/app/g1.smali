.class public final Landroidx/fragment/app/g1;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:Landroidx/fragment/app/d0;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Landroidx/lifecycle/q;

.field public i:Landroidx/lifecycle/q;


# direct methods
.method public constructor <init>(ILandroidx/fragment/app/d0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/g1;->a:I

    iput-object p2, p0, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/g1;->c:Z

    sget-object p1, Landroidx/lifecycle/q;->e:Landroidx/lifecycle/q;

    iput-object p1, p0, Landroidx/fragment/app/g1;->h:Landroidx/lifecycle/q;

    iput-object p1, p0, Landroidx/fragment/app/g1;->i:Landroidx/lifecycle/q;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/d0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroidx/fragment/app/g1;->a:I

    iput-object p1, p0, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/g1;->c:Z

    sget-object p1, Landroidx/lifecycle/q;->e:Landroidx/lifecycle/q;

    iput-object p1, p0, Landroidx/fragment/app/g1;->h:Landroidx/lifecycle/q;

    iput-object p1, p0, Landroidx/fragment/app/g1;->i:Landroidx/lifecycle/q;

    return-void
.end method
