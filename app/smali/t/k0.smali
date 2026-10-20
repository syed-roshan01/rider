.class public final Lt/k0;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/l3;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public final c:Lt/x1;

.field public final d:Lm0/n1;

.field public e:Lt/l1;

.field public f:Z

.field public n:Z

.field public o:J

.field public final synthetic p:Lt/p0;


# direct methods
.method public constructor <init>(Lt/p0;Ljava/lang/Number;Ljava/lang/Number;Lt/x1;Lt/n;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/k0;->p:Lt/p0;

    iput-object p2, p0, Lt/k0;->a:Ljava/lang/Object;

    iput-object p3, p0, Lt/k0;->b:Ljava/lang/Object;

    iput-object p4, p0, Lt/k0;->c:Lt/x1;

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt/k0;->d:Lm0/n1;

    new-instance p1, Lt/l1;

    iget-object v3, p0, Lt/k0;->a:Ljava/lang/Object;

    iget-object v4, p0, Lt/k0;->b:Ljava/lang/Object;

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p5

    move-object v2, p4

    invoke-direct/range {v0 .. v5}, Lt/l1;-><init>(Lt/n;Lt/x1;Ljava/lang/Object;Ljava/lang/Object;Lt/t;)V

    iput-object p1, p0, Lt/k0;->e:Lt/l1;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt/k0;->d:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
