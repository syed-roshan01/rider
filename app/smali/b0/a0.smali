.class public final Lb0/a0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lb0/h0;

.field public final b:Lm0/l1;

.field public final c:Lm0/k1;

.field public d:Z

.field public e:Ljava/lang/Object;

.field public final f:La0/y;


# direct methods
.method public constructor <init>(IFLb0/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lb0/a0;->a:Lb0/h0;

    invoke-static {p1}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object p3

    iput-object p3, p0, Lb0/a0;->b:Lm0/l1;

    invoke-static {p2}, Lm9/e0;->H(F)Lm0/k1;

    move-result-object p2

    iput-object p2, p0, Lb0/a0;->c:Lm0/k1;

    new-instance p2, La0/y;

    invoke-direct {p2, p1}, La0/y;-><init>(I)V

    iput-object p2, p0, Lb0/a0;->f:La0/y;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    return v0
.end method

.method public final b()F
    .locals 1

    iget-object v0, p0, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v0}, Lm0/s2;->d()F

    move-result v0

    return v0
.end method
