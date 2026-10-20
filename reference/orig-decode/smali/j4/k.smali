.class public final Lj4/k;
.super Lw8/c;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lu1/o3;


# direct methods
.method public constructor <init>(Lu1/o3;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lj4/k;->c:Lu1/o3;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lj4/k;->a:Ljava/lang/Object;

    iget p1, p0, Lj4/k;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj4/k;->b:I

    iget-object p1, p0, Lj4/k;->c:Lu1/o3;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lu1/o3;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
