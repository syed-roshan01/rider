.class public final Lt/p0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lo0/i;

.field public final b:Lm0/n1;

.field public c:J

.field public final d:Lm0/n1;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/i;

    const/16 v1, 0x10

    new-array v1, v1, [Lt/k0;

    invoke-direct {v0, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lt/p0;->a:Lo0/i;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    invoke-static {v0, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Lt/p0;->b:Lm0/n1;

    const-wide/high16 v2, -0x8000000000000000L

    iput-wide v2, p0, Lt/p0;->c:J

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Lt/p0;->d:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 4

    check-cast p1, Lm0/q;

    const v0, -0x12f4f699

    invoke-virtual {p1, v0}, Lm0/q;->a0(I)Lm0/q;

    const v0, -0x1d58f75c

    invoke-virtual {p1, v0}, Lm0/q;->Z(I)V

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm0/l;->a:Lk0/y0;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    sget-object v0, Lm0/o3;->a:Lm0/o3;

    invoke-static {v2, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    check-cast v0, Lm0/g1;

    iget-object v3, p0, Lt/p0;->d:Lm0/n1;

    invoke-virtual {v3}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lt/p0;->b:Lm0/n1;

    invoke-virtual {v3}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    new-instance v3, Lt/n0;

    invoke-direct {v3, v0, p0, v2}, Lt/n0;-><init>(Lm0/g1;Lt/p0;Lu8/e;)V

    invoke-static {p0, v3, p1}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    :cond_2
    invoke-virtual {p1}, Lm0/q;->x()Lm0/x1;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lt/o0;

    invoke-direct {v0, p0, p2, v1}, Lt/o0;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lm0/x1;->d:Lc9/e;

    :cond_3
    return-void
.end method
