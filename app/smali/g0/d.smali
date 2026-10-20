.class public final Lg0/d;
.super Ljava/lang/Object;


# instance fields
.field public a:La2/e;

.field public b:La2/c0;

.field public c:Lf2/d;

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:Ljava/util/List;

.field public i:Lg0/b;

.field public j:J

.field public k:Lm2/b;

.field public l:La2/k;

.field public m:Lm2/l;

.field public n:La2/a0;

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(La2/e;La2/c0;Lf2/d;IZIILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/d;->a:La2/e;

    iput-object p2, p0, Lg0/d;->b:La2/c0;

    iput-object p3, p0, Lg0/d;->c:Lf2/d;

    iput p4, p0, Lg0/d;->d:I

    iput-boolean p5, p0, Lg0/d;->e:Z

    iput p6, p0, Lg0/d;->f:I

    iput p7, p0, Lg0/d;->g:I

    iput-object p8, p0, Lg0/d;->h:Ljava/util/List;

    sget-wide p1, Lg0/a;->a:J

    iput-wide p1, p0, Lg0/d;->j:J

    const/4 p1, -0x1

    iput p1, p0, Lg0/d;->o:I

    iput p1, p0, Lg0/d;->p:I

    return-void
.end method


# virtual methods
.method public final a(ILm2/l;)I
    .locals 3

    iget v0, p0, Lg0/d;->o:I

    iget v1, p0, Lg0/d;->p:I

    if-ne p1, v0, :cond_0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    const v0, 0x7fffffff

    const/4 v1, 0x0

    invoke-static {v1, p1, v1, v0}, Lo1/s;->a(IIII)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lg0/d;->b(JLm2/l;)La2/i;

    move-result-object p2

    iget p2, p2, La2/i;->e:F

    invoke-static {p2}, Ld9/i;->n(F)I

    move-result p2

    iput p1, p0, Lg0/d;->o:I

    iput p2, p0, Lg0/d;->p:I

    return p2
.end method

.method public final b(JLm2/l;)La2/i;
    .locals 6

    invoke-virtual {p0, p3}, Lg0/d;->d(Lm2/l;)La2/k;

    move-result-object v1

    new-instance p3, La2/i;

    iget-boolean v0, p0, Lg0/d;->e:Z

    iget v2, p0, Lg0/d;->d:I

    invoke-virtual {v1}, La2/k;->c()F

    move-result v3

    invoke-static {p1, p2, v0, v2, v3}, Lm9/e0;->w(JZIF)J

    move-result-wide v2

    iget-boolean p1, p0, Lg0/d;->e:Z

    iget p2, p0, Lg0/d;->d:I

    iget v0, p0, Lg0/d;->f:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-nez p1, :cond_0

    invoke-static {p2, v4}, Lh6/g;->T(II)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    if-ge v0, v5, :cond_1

    move v0, v5

    :cond_1
    move v5, v0

    :goto_0
    iget p1, p0, Lg0/d;->d:I

    invoke-static {p1, v4}, Lh6/g;->T(II)Z

    move-result p1

    move-object v0, p3

    move v4, v5

    move v5, p1

    invoke-direct/range {v0 .. v5}, La2/i;-><init>(La2/k;JIZ)V

    return-object p3
.end method

.method public final c(Lm2/b;)V
    .locals 5

    iget-object v0, p0, Lg0/d;->k:Lm2/b;

    if-eqz p1, :cond_0

    sget v1, Lg0/a;->b:I

    invoke-interface {p1}, Lm2/b;->c()F

    move-result v1

    invoke-interface {p1}, Lm2/b;->m()F

    move-result v2

    invoke-static {v1, v2}, Lg0/a;->a(FF)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    sget-wide v1, Lg0/a;->a:J

    :goto_0
    if-nez v0, :cond_1

    iput-object p1, p0, Lg0/d;->k:Lm2/b;

    iput-wide v1, p0, Lg0/d;->j:J

    return-void

    :cond_1
    if-eqz p1, :cond_2

    iget-wide v3, p0, Lg0/d;->j:J

    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iput-object p1, p0, Lg0/d;->k:Lm2/b;

    iput-wide v1, p0, Lg0/d;->j:J

    const/4 p1, 0x0

    iput-object p1, p0, Lg0/d;->l:La2/k;

    iput-object p1, p0, Lg0/d;->n:La2/a0;

    const/4 p1, -0x1

    iput p1, p0, Lg0/d;->p:I

    iput p1, p0, Lg0/d;->o:I

    :goto_1
    return-void
.end method

.method public final d(Lm2/l;)La2/k;
    .locals 8

    iget-object v0, p0, Lg0/d;->l:La2/k;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg0/d;->m:Lm2/l;

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, La2/k;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    iput-object p1, p0, Lg0/d;->m:Lm2/l;

    iget-object v3, p0, Lg0/d;->a:La2/e;

    iget-object v0, p0, Lg0/d;->b:La2/c0;

    invoke-static {v0, p1}, Lo1/s;->g0(La2/c0;Lm2/l;)La2/c0;

    move-result-object v4

    iget-object v6, p0, Lg0/d;->k:Lm2/b;

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v7, p0, Lg0/d;->c:Lf2/d;

    iget-object p1, p0, Lg0/d;->h:Ljava/util/List;

    if-nez p1, :cond_1

    sget-object p1, Lr8/r;->a:Lr8/r;

    :cond_1
    move-object v5, p1

    new-instance v0, La2/k;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, La2/k;-><init>(La2/e;La2/c0;Ljava/util/List;Lm2/b;Lf2/d;)V

    :cond_2
    iput-object v0, p0, Lg0/d;->l:La2/k;

    return-object v0
.end method

.method public final e(Lm2/l;JLa2/i;)La2/a0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    iget-object v2, v1, La2/i;->a:La2/k;

    invoke-virtual {v2}, La2/k;->c()F

    move-result v2

    iget v3, v1, La2/i;->d:F

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    new-instance v3, La2/a0;

    new-instance v14, La2/z;

    iget-object v5, v0, Lg0/d;->a:La2/e;

    iget-object v6, v0, Lg0/d;->b:La2/c0;

    iget-object v4, v0, Lg0/d;->h:Ljava/util/List;

    if-nez v4, :cond_0

    sget-object v4, Lr8/r;->a:Lr8/r;

    :cond_0
    move-object v7, v4

    iget v8, v0, Lg0/d;->f:I

    iget-boolean v9, v0, Lg0/d;->e:Z

    iget v10, v0, Lg0/d;->d:I

    iget-object v11, v0, Lg0/d;->k:Lm2/b;

    invoke-static {v11}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v13, v0, Lg0/d;->c:Lf2/d;

    move-object v4, v14

    move-object/from16 v12, p1

    move-object v0, v14

    move-wide/from16 v14, p2

    invoke-direct/range {v4 .. v15}, La2/z;-><init>(La2/e;La2/c0;Ljava/util/List;IZILm2/b;Lm2/l;Lf2/d;J)V

    invoke-static {v2}, Ld9/i;->n(F)I

    move-result v2

    iget v4, v1, La2/i;->e:F

    invoke-static {v4}, Ld9/i;->n(F)I

    move-result v4

    invoke-static {v2, v4}, Lo1/s;->e(II)J

    move-result-wide v4

    move-wide/from16 v6, p2

    invoke-static {v6, v7, v4, v5}, Lo1/s;->o(JJ)J

    move-result-wide v4

    invoke-direct {v3, v0, v1, v4, v5}, La2/a0;-><init>(La2/z;La2/i;J)V

    return-object v3
.end method
