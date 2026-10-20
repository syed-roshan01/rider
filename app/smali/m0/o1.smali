.class public final Lm0/o1;
.super Lw8/c;


# instance fields
.field public a:Lm0/p1;

.field public b:Lc9/c;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lm0/p1;

.field public e:I


# direct methods
.method public constructor <init>(Lm0/p1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lm0/o1;->d:Lm0/p1;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lm0/o1;->c:Ljava/lang/Object;

    iget p1, p0, Lm0/o1;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm0/o1;->e:I

    iget-object p1, p0, Lm0/o1;->d:Lm0/p1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lm0/p1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
