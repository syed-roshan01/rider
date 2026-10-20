.class public final Lp9/p0;
.super Lw8/c;


# instance fields
.field public a:Lp9/q0;

.field public b:Lp9/g;

.field public c:Lp9/r0;

.field public d:Lm9/f1;

.field public e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic n:Lp9/q0;

.field public o:I


# direct methods
.method public constructor <init>(Lp9/q0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lp9/p0;->n:Lp9/q0;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp9/p0;->f:Ljava/lang/Object;

    iget p1, p0, Lp9/p0;->o:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp9/p0;->o:I

    iget-object p1, p0, Lp9/p0;->n:Lp9/q0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lp9/q0;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
