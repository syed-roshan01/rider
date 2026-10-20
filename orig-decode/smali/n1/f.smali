.class public final Ln1/f;
.super Lw8/c;


# instance fields
.field public a:Ln1/g;

.field public b:J

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ln1/g;

.field public e:I


# direct methods
.method public constructor <init>(Ln1/g;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ln1/f;->d:Ln1/g;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Ln1/f;->c:Ljava/lang/Object;

    iget p1, p0, Ln1/f;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln1/f;->e:I

    iget-object p1, p0, Ln1/f;->d:Ln1/g;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Ln1/g;->B(JLu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
