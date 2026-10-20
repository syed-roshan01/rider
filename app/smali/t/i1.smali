.class public final Lt/i1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Ld9/u;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lt/j;

.field public final synthetic d:Lt/t;

.field public final synthetic e:Lt/o;

.field public final synthetic f:F

.field public final synthetic n:Lc9/c;


# direct methods
.method public constructor <init>(Ld9/u;Ljava/lang/Object;Lt/j;Lt/t;Lt/o;FLc9/c;)V
    .locals 0

    iput-object p1, p0, Lt/i1;->a:Ld9/u;

    iput-object p2, p0, Lt/i1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lt/i1;->c:Lt/j;

    iput-object p4, p0, Lt/i1;->d:Lt/t;

    iput-object p5, p0, Lt/i1;->e:Lt/o;

    iput p6, p0, Lt/i1;->f:F

    iput-object p7, p0, Lt/i1;->n:Lc9/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    new-instance p1, Lt/m;

    iget-object v1, p0, Lt/i1;->b:Ljava/lang/Object;

    iget-object v0, p0, Lt/i1;->c:Lt/j;

    invoke-interface {v0}, Lt/j;->d()Lt/x1;

    move-result-object v2

    iget-object v3, p0, Lt/i1;->d:Lt/t;

    invoke-interface {v0}, Lt/j;->e()Ljava/lang/Object;

    move-result-object v6

    new-instance v9, Lt/h1;

    iget-object v0, p0, Lt/i1;->e:Lt/o;

    const/4 v4, 0x0

    invoke-direct {v9, v0, v4}, Lt/h1;-><init>(Lt/o;I)V

    move-object v0, p1

    move-wide v4, v10

    move-wide v7, v10

    invoke-direct/range {v0 .. v9}, Lt/m;-><init>(Ljava/lang/Object;Lt/x1;Lt/t;JLjava/lang/Object;JLt/h1;)V

    iget v3, p0, Lt/i1;->f:F

    iget-object v4, p0, Lt/i1;->c:Lt/j;

    iget-object v5, p0, Lt/i1;->e:Lt/o;

    iget-object v6, p0, Lt/i1;->n:Lc9/c;

    move-object v0, p1

    move-wide v1, v10

    invoke-static/range {v0 .. v6}, Lt/e;->n(Lt/m;JFLt/j;Lt/o;Lc9/c;)V

    iget-object v0, p0, Lt/i1;->a:Ld9/u;

    iput-object p1, v0, Ld9/u;->a:Ljava/lang/Object;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
