.class public final Lt1/p0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/k0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lc9/c;

.field public final synthetic e:Lt1/q0;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lc9/c;Lt1/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt1/p0;->a:I

    iput p2, p0, Lt1/p0;->b:I

    iput-object p3, p0, Lt1/p0;->c:Ljava/util/Map;

    iput-object p4, p0, Lt1/p0;->d:Lc9/c;

    iput-object p5, p0, Lt1/p0;->e:Lt1/q0;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lt1/p0;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lt1/p0;->a:I

    return v0
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lt1/p0;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lt1/p0;->e:Lt1/q0;

    iget-object v0, v0, Lt1/q0;->o:Lr1/g0;

    iget-object v1, p0, Lt1/p0;->d:Lc9/c;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
