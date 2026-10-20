.class public final Lp9/b0;
.super Lw8/c;


# instance fields
.field public a:Lp9/c0;

.field public b:Lp9/g;

.field public c:Lp9/e0;

.field public d:Lm9/f1;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lp9/c0;

.field public n:I


# direct methods
.method public constructor <init>(Lp9/c0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lp9/b0;->f:Lp9/c0;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp9/b0;->e:Ljava/lang/Object;

    iget p1, p0, Lp9/b0;->n:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp9/b0;->n:I

    iget-object p1, p0, Lp9/b0;->f:Lp9/c0;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lp9/c0;->k(Lp9/c0;Lp9/g;Lu8/e;)Lv8/a;

    move-result-object p1

    return-object p1
.end method
