.class public final Lb0/d0;
.super Lw8/c;


# instance fields
.field public a:Lb0/h0;

.field public b:Lt/n;

.field public c:I

.field public d:F

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lb0/h0;

.field public n:I


# direct methods
.method public constructor <init>(Lb0/h0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lb0/d0;->f:Lb0/h0;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lb0/d0;->e:Ljava/lang/Object;

    iget p1, p0, Lb0/d0;->n:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lb0/d0;->n:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lb0/d0;->f:Lb0/h0;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1, v0, p0}, Lb0/h0;->f(IFLt/n;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
