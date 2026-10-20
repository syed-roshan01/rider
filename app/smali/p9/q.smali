.class public final Lp9/q;
.super Lw8/c;


# instance fields
.field public a:Lp9/r;

.field public synthetic b:Ljava/lang/Object;

.field public c:I

.field public final synthetic d:Lp9/r;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp9/r;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lp9/q;->d:Lp9/r;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp9/q;->b:Ljava/lang/Object;

    iget p1, p0, Lp9/q;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp9/q;->c:I

    iget-object p1, p0, Lp9/q;->d:Lp9/r;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lp9/r;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
