.class public final Ln4/k;
.super Lw8/c;


# instance fields
.field public a:Ln4/l;

.field public b:Ln4/j;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ln4/l;

.field public e:I


# direct methods
.method public constructor <init>(Ln4/l;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ln4/k;->d:Ln4/l;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln4/k;->c:Ljava/lang/Object;

    iget p1, p0, Ln4/k;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln4/k;->e:I

    iget-object p1, p0, Ln4/k;->d:Ln4/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ln4/l;->b(Ls4/j;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
