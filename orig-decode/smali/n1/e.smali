.class public final Ln1/e;
.super Lw8/c;


# instance fields
.field public a:Ln1/g;

.field public b:J

.field public c:J

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ln1/g;

.field public f:I


# direct methods
.method public constructor <init>(Ln1/g;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ln1/e;->e:Ln1/g;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ln1/e;->d:Ljava/lang/Object;

    iget p1, p0, Ln1/e;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln1/e;->f:I

    iget-object v0, p0, Ln1/e;->e:Ln1/g;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ln1/g;->L(JJLu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
