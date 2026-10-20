.class public final Lu/u;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Le1/n;

.field public final synthetic c:J

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:J

.field public final synthetic n:J

.field public final synthetic o:Lg1/k;


# direct methods
.method public constructor <init>(ZLe1/n;JFFJJLg1/k;)V
    .locals 0

    iput-boolean p1, p0, Lu/u;->a:Z

    iput-object p2, p0, Lu/u;->b:Le1/n;

    iput-wide p3, p0, Lu/u;->c:J

    iput p5, p0, Lu/u;->d:F

    iput p6, p0, Lu/u;->e:F

    iput-wide p7, p0, Lu/u;->f:J

    iput-wide p9, p0, Lu/u;->n:J

    iput-object p11, p0, Lu/u;->o:Lg1/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    check-cast p1, Lg1/e;

    move-object v0, p1

    check-cast v0, Lt1/i0;

    invoke-virtual {v0}, Lt1/i0;->a()V

    iget-boolean p1, p0, Lu/u;->a:Z

    if-eqz p1, :cond_0

    iget-object v1, p0, Lu/u;->b:Le1/n;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    iget-wide v6, p0, Lu/u;->c:J

    const/4 v8, 0x0

    const/16 v9, 0xf6

    invoke-static/range {v0 .. v9}, Lg1/g;->r(Lg1/g;Le1/n;JJJLg1/k;I)V

    goto/16 :goto_0

    :cond_0
    iget-wide v1, p0, Lu/u;->c:J

    invoke-static {v1, v2}, Ld1/a;->b(J)F

    move-result p1

    iget v3, p0, Lu/u;->d:F

    cmpg-float p1, p1, v3

    if-gez p1, :cond_1

    iget v6, p0, Lu/u;->e:F

    iget-object p1, v0, Lt1/i0;->a:Lg1/c;

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ld1/f;->d(J)F

    move-result v1

    iget v2, p0, Lu/u;->e:F

    sub-float v7, v1, v2

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v3

    invoke-static {v3, v4}, Ld1/f;->b(J)F

    move-result v1

    sub-float v8, v1, v2

    const/4 v9, 0x0

    iget-object v1, p0, Lu/u;->b:Le1/n;

    iget-wide v10, p0, Lu/u;->c:J

    iget-object p1, p1, Lg1/c;->b:Lg1/b;

    invoke-virtual {p1}, Lg1/b;->b()J

    move-result-wide v12

    invoke-virtual {p1}, Lg1/b;->a()Le1/p;

    move-result-object v2

    invoke-interface {v2}, Le1/p;->j()V

    iget-object v2, p1, Lg1/b;->a:Lg1/d;

    iget-object v2, v2, Lg1/d;->a:Lg1/b;

    invoke-virtual {v2}, Lg1/b;->a()Le1/p;

    move-result-object v4

    move v5, v6

    invoke-interface/range {v4 .. v9}, Le1/p;->d(FFFFI)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xf6

    move-wide v6, v10

    invoke-static/range {v0 .. v9}, Lg1/g;->r(Lg1/g;Le1/n;JJJLg1/k;I)V

    invoke-virtual {p1}, Lg1/b;->a()Le1/p;

    move-result-object v0

    invoke-interface {v0}, Le1/p;->h()V

    invoke-virtual {p1, v12, v13}, Lg1/b;->c(J)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lu/u;->b:Le1/n;

    iget-wide v4, p0, Lu/u;->f:J

    iget-wide v6, p0, Lu/u;->n:J

    invoke-static {v3, v1, v2}, Landroidx/compose/foundation/a;->m(FJ)J

    move-result-wide v8

    iget-object v10, p0, Lu/u;->o:Lg1/k;

    const/16 v11, 0xd0

    move-object v1, p1

    move-wide v2, v4

    move-wide v4, v6

    move-wide v6, v8

    move-object v8, v10

    move v9, v11

    invoke-static/range {v0 .. v9}, Lg1/g;->r(Lg1/g;Le1/n;JJJLg1/k;I)V

    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
