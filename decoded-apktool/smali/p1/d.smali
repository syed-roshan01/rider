.class public final Lp1/d;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lp1/c;

.field public final b:Lp1/c;

.field public c:J

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp1/c;

    invoke-direct {v0}, Lp1/c;-><init>()V

    iput-object v0, p0, Lp1/d;->a:Lp1/c;

    new-instance v0, Lp1/c;

    invoke-direct {v0}, Lp1/c;-><init>()V

    iput-object v0, p0, Lp1/d;->b:Lp1/c;

    sget-wide v0, Ld1/c;->b:J

    iput-wide v0, p0, Lp1/d;->c:J

    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 2

    iget-object v0, p0, Lp1/d;->a:Lp1/c;

    invoke-static {p3, p4}, Ld1/c;->d(J)F

    move-result v1

    invoke-virtual {v0, v1, p1, p2}, Lp1/c;->a(FJ)V

    iget-object v0, p0, Lp1/d;->b:Lp1/c;

    invoke-static {p3, p4}, Ld1/c;->e(J)F

    move-result p3

    invoke-virtual {v0, p3, p1, p2}, Lp1/c;->a(FJ)V

    return-void
.end method

.method public final b(J)J
    .locals 2

    invoke-static {p1, p2}, Lm2/p;->b(J)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-static {p1, p2}, Lm2/p;->c(J)F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget-object v0, p0, Lp1/d;->a:Lp1/c;

    invoke-static {p1, p2}, Lm2/p;->b(J)F

    move-result v1

    invoke-virtual {v0, v1}, Lp1/c;->b(F)F

    move-result v0

    iget-object v1, p0, Lp1/d;->b:Lp1/c;

    invoke-static {p1, p2}, Lm2/p;->c(J)F

    move-result p1

    invoke-virtual {v1, p1}, Lp1/c;->b(F)F

    move-result p1

    invoke-static {v0, p1}, Li1/b;->e(FF)J

    move-result-wide p1

    return-wide p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "maximumVelocity should be a positive value. You specified="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p2}, Lm2/p;->f(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lp1/d;->a:Lp1/c;

    iget-object v1, v0, Lp1/c;->d:[Lp1/a;

    invoke-static {v1}, Lb9/b;->Q([Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput v1, v0, Lp1/c;->e:I

    iget-object v0, p0, Lp1/d;->b:Lp1/c;

    iget-object v2, v0, Lp1/c;->d:[Lp1/a;

    invoke-static {v2}, Lb9/b;->Q([Ljava/lang/Object;)V

    iput v1, v0, Lp1/c;->e:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lp1/d;->d:J

    return-void
.end method
