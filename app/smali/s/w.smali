.class public final Ls/w;
.super Ljava/lang/Object;

# interfaces
.implements Ls/r;


# instance fields
.field public final a:Lt/u1;

.field public b:Ly0/d;

.field public final c:Lm0/n1;

.field public final d:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lt/u1;Ly0/d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/w;->a:Lt/u1;

    iput-object p2, p0, Ls/w;->b:Ly0/d;

    new-instance p1, Lm2/k;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Lm2/k;-><init>(J)V

    sget-object p2, Lm0/o3;->a:Lm0/o3;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Ls/w;->c:Lm0/n1;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ls/w;->d:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls/w;->a:Lt/u1;

    invoke-virtual {v0}, Lt/u1;->c()Lt/o1;

    move-result-object v0

    invoke-interface {v0}, Lt/o1;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls/w;->a:Lt/u1;

    invoke-virtual {v0}, Lt/u1;->c()Lt/o1;

    move-result-object v0

    invoke-interface {v0}, Lt/o1;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
