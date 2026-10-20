.class public final Lh0/z;
.super Lw8/c;


# instance fields
.field public a:Lo1/h0;

.field public b:Lf0/k1;

.field public c:Lo1/u;

.field public synthetic d:Ljava/lang/Object;

.field public e:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh0/z;->d:Ljava/lang/Object;

    iget p1, p0, Lh0/z;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/z;->e:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p0}, Ld9/i;->k(Lo1/h0;Lf0/k1;Lo1/k;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
