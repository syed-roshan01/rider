.class public final Lz/s;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lz/m;

.field public final b:La0/w;

.field public final c:J

.field public final synthetic d:Z

.field public final synthetic e:La0/w;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Ly0/b;

.field public final synthetic i:Ly0/c;

.field public final synthetic j:Z

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:J

.field public final synthetic n:Lz/g0;


# direct methods
.method public constructor <init>(JZLz/m;La0/w;IILy0/b;Ly0/c;ZIIJLz/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lz/s;->d:Z

    iput-object p5, p0, Lz/s;->e:La0/w;

    iput p6, p0, Lz/s;->f:I

    iput p7, p0, Lz/s;->g:I

    iput-object p8, p0, Lz/s;->h:Ly0/b;

    iput-object p9, p0, Lz/s;->i:Ly0/c;

    iput-boolean p10, p0, Lz/s;->j:Z

    iput p11, p0, Lz/s;->k:I

    iput p12, p0, Lz/s;->l:I

    iput-wide p13, p0, Lz/s;->m:J

    iput-object p15, p0, Lz/s;->n:Lz/g0;

    iput-object p4, p0, Lz/s;->a:Lz/m;

    iput-object p5, p0, Lz/s;->b:La0/w;

    const p4, 0x7fffffff

    if-eqz p3, :cond_0

    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result p5

    goto :goto_0

    :cond_0
    move p5, p4

    :goto_0
    if-nez p3, :cond_1

    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result p4

    :cond_1
    const/4 p1, 0x5

    invoke-static {p5, p4, p1}, Lo1/s;->b(III)J

    move-result-wide p1

    iput-wide p1, p0, Lz/s;->c:J

    return-void
.end method


# virtual methods
.method public final a(I)Lz/x;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v2, p1

    iget-object v1, v0, Lz/s;->a:Lz/m;

    invoke-virtual {v1, v2}, Lz/m;->a(I)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v1, v2}, Lz/m;->d(I)Ljava/lang/Object;

    move-result-object v15

    iget-object v1, v0, Lz/s;->b:La0/w;

    check-cast v1, La0/x;

    iget-wide v3, v0, Lz/s;->c:J

    invoke-virtual {v1, v2, v3, v4}, La0/x;->a(IJ)Ljava/util/List;

    move-result-object v3

    iget v1, v0, Lz/s;->f:I

    add-int/lit8 v1, v1, -0x1

    if-ne v2, v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    move v11, v1

    goto :goto_1

    :cond_0
    iget v1, v0, Lz/s;->g:I

    goto :goto_0

    :goto_1
    new-instance v17, Lz/x;

    iget-boolean v4, v0, Lz/s;->d:Z

    iget-object v5, v0, Lz/s;->h:Ly0/b;

    iget-object v6, v0, Lz/s;->i:Ly0/c;

    iget-object v1, v0, Lz/s;->e:La0/w;

    check-cast v1, La0/x;

    iget-object v1, v1, La0/x;->b:Lr1/i1;

    invoke-interface {v1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v7

    iget-boolean v8, v0, Lz/s;->j:Z

    iget v9, v0, Lz/s;->k:I

    iget v10, v0, Lz/s;->l:I

    iget-wide v12, v0, Lz/s;->m:J

    iget-object v1, v0, Lz/s;->n:Lz/g0;

    iget-object v1, v1, Lz/g0;->p:Lz/j;

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    move/from16 v2, p1

    invoke-direct/range {v1 .. v16}, Lz/x;-><init>(ILjava/util/List;ZLy0/b;Ly0/c;Lm2/l;ZIIIJLjava/lang/Object;Ljava/lang/Object;Lz/j;)V

    return-object v17
.end method
