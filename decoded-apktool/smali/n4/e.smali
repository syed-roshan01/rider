.class public final Ln4/e;
.super Lw8/c;


# instance fields
.field public a:Ln4/i;

.field public b:Li4/c;

.field public c:Ls4/j;

.field public d:Ljava/lang/Object;

.field public e:Ls4/n;

.field public f:Li4/e;

.field public n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ln4/i;

.field public q:I


# direct methods
.method public constructor <init>(Ln4/i;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ln4/e;->p:Ln4/i;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Ln4/e;->o:Ljava/lang/Object;

    iget p1, p0, Ln4/e;->q:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln4/e;->q:I

    iget-object v0, p0, Ln4/e;->p:Ln4/i;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Ln4/i;->c(Li4/c;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
