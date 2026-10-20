.class public final Lu1/k0;
.super Lw8/c;


# instance fields
.field public a:Lu1/p0;

.field public b:Lq/g;

.field public c:Lo9/b;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lu1/p0;

.field public f:I


# direct methods
.method public constructor <init>(Lu1/p0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu1/k0;->e:Lu1/p0;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lu1/k0;->d:Ljava/lang/Object;

    iget p1, p0, Lu1/k0;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu1/k0;->f:I

    iget-object p1, p0, Lu1/k0;->e:Lu1/p0;

    invoke-virtual {p1, p0}, Lu1/p0;->k(Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
