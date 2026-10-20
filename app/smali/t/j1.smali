.class public final Lt/j1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Ld9/u;

.field public final synthetic b:F

.field public final synthetic c:Lt/j;

.field public final synthetic d:Lt/o;

.field public final synthetic e:Lc9/c;


# direct methods
.method public constructor <init>(Ld9/u;FLt/j;Lt/o;Lc9/c;)V
    .locals 0

    iput-object p1, p0, Lt/j1;->a:Ld9/u;

    iput p2, p0, Lt/j1;->b:F

    iput-object p3, p0, Lt/j1;->c:Lt/j;

    iput-object p4, p0, Lt/j1;->d:Lt/o;

    iput-object p5, p0, Lt/j1;->e:Lc9/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    iget-object p1, p0, Lt/j1;->a:Ld9/u;

    iget-object p1, p1, Ld9/u;->a:Ljava/lang/Object;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Lt/m;

    iget v3, p0, Lt/j1;->b:F

    iget-object v4, p0, Lt/j1;->c:Lt/j;

    iget-object v5, p0, Lt/j1;->d:Lt/o;

    iget-object v6, p0, Lt/j1;->e:Lc9/c;

    invoke-static/range {v0 .. v6}, Lt/e;->n(Lt/m;JFLt/j;Lt/o;Lc9/c;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
