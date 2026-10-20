.class public final Lp9/b;
.super Lw8/c;


# instance fields
.field public a:Lo9/r;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lp9/c;

.field public d:I


# direct methods
.method public constructor <init>(Lp9/c;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lp9/b;->c:Lp9/c;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp9/b;->b:Ljava/lang/Object;

    iget p1, p0, Lp9/b;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp9/b;->d:I

    iget-object p1, p0, Lp9/b;->c:Lp9/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lp9/c;->c(Lo9/r;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
