.class public final Lu/f;
.super Lw8/c;


# instance fields
.field public a:Lu/j;

.field public b:J

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lu/j;

.field public e:I


# direct methods
.method public constructor <init>(Lu/j;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu/f;->d:Lu/j;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lu/f;->c:Ljava/lang/Object;

    iget p1, p0, Lu/f;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu/f;->e:I

    const/4 p1, 0x0

    iget-object v0, p0, Lu/f;->d:Lu/j;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2, p1, p0}, Lu/j;->d(JLv/k2;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
