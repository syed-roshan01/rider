.class public final Lp9/j0;
.super Lw8/c;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lh0/i0;

.field public c:I


# direct methods
.method public constructor <init>(Lh0/i0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lp9/j0;->b:Lh0/i0;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp9/j0;->a:Ljava/lang/Object;

    iget p1, p0, Lp9/j0;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp9/j0;->c:I

    iget-object p1, p0, Lp9/j0;->b:Lh0/i0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lh0/i0;->b(ILu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
