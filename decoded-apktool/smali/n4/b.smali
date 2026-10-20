.class public final Ln4/b;
.super Lw8/c;


# instance fields
.field public a:Ln4/i;

.field public b:Lm4/n;

.field public c:Li4/c;

.field public d:Ls4/j;

.field public e:Ljava/lang/Object;

.field public f:Ls4/n;

.field public n:Li4/e;

.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ln4/i;

.field public r:I


# direct methods
.method public constructor <init>(Ln4/i;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ln4/b;->q:Ln4/i;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Ln4/b;->p:Ljava/lang/Object;

    iget p1, p0, Ln4/b;->r:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln4/b;->r:I

    iget-object v0, p0, Ln4/b;->q:Ln4/i;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p0

    invoke-static/range {v0 .. v7}, Ln4/i;->a(Ln4/i;Lm4/n;Li4/c;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
