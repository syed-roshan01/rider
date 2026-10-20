.class public final Ln4/f;
.super Lw8/c;


# instance fields
.field public a:Ln4/i;

.field public b:Ln4/l;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ln4/i;

.field public e:I


# direct methods
.method public constructor <init>(Ln4/i;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ln4/f;->d:Ln4/i;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln4/f;->c:Ljava/lang/Object;

    iget p1, p0, Ln4/f;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln4/f;->e:I

    iget-object p1, p0, Ln4/f;->d:Ln4/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ln4/i;->d(Ln4/l;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
