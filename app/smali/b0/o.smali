.class public final Lb0/o;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Lb0/h0;

.field public final synthetic b:Ly0/o;

.field public final synthetic c:Ly/t0;

.field public final synthetic d:Lb0/j;

.field public final synthetic e:I

.field public final synthetic f:F

.field public final synthetic n:Ly0/c;

.field public final synthetic o:Lw/h;

.field public final synthetic p:Z

.field public final synthetic q:Z

.field public final synthetic r:Lc9/c;

.field public final synthetic s:Ln1/a;

.field public final synthetic t:Lc9/g;

.field public final synthetic u:I

.field public final synthetic v:I

.field public final synthetic w:I


# direct methods
.method public constructor <init>(Lb0/h0;Ly0/o;Ly/t0;Lb0/j;IFLy0/c;Lw/h;ZZLc9/c;Ln1/a;Lc9/g;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Lb0/o;->a:Lb0/h0;

    move-object v1, p2

    iput-object v1, v0, Lb0/o;->b:Ly0/o;

    move-object v1, p3

    iput-object v1, v0, Lb0/o;->c:Ly/t0;

    move-object v1, p4

    iput-object v1, v0, Lb0/o;->d:Lb0/j;

    move v1, p5

    iput v1, v0, Lb0/o;->e:I

    move v1, p6

    iput v1, v0, Lb0/o;->f:F

    move-object v1, p7

    iput-object v1, v0, Lb0/o;->n:Ly0/c;

    move-object v1, p8

    iput-object v1, v0, Lb0/o;->o:Lw/h;

    move v1, p9

    iput-boolean v1, v0, Lb0/o;->p:Z

    move v1, p10

    iput-boolean v1, v0, Lb0/o;->q:Z

    move-object v1, p11

    iput-object v1, v0, Lb0/o;->r:Lc9/c;

    move-object v1, p12

    iput-object v1, v0, Lb0/o;->s:Ln1/a;

    move-object v1, p13

    iput-object v1, v0, Lb0/o;->t:Lc9/g;

    move/from16 v1, p14

    iput v1, v0, Lb0/o;->u:I

    move/from16 v1, p15

    iput v1, v0, Lb0/o;->v:I

    move/from16 v1, p16

    iput v1, v0, Lb0/o;->w:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    check-cast v14, Lm0/m;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    iget-object v1, v0, Lb0/o;->a:Lb0/h0;

    iget-object v2, v0, Lb0/o;->b:Ly0/o;

    iget-object v3, v0, Lb0/o;->c:Ly/t0;

    iget-object v4, v0, Lb0/o;->d:Lb0/j;

    iget v5, v0, Lb0/o;->e:I

    iget v6, v0, Lb0/o;->f:F

    iget-object v7, v0, Lb0/o;->n:Ly0/c;

    iget-object v8, v0, Lb0/o;->o:Lw/h;

    iget-boolean v9, v0, Lb0/o;->p:Z

    iget-boolean v10, v0, Lb0/o;->q:Z

    iget-object v11, v0, Lb0/o;->r:Lc9/c;

    iget-object v12, v0, Lb0/o;->s:Ln1/a;

    iget-object v13, v0, Lb0/o;->t:Lc9/g;

    iget v15, v0, Lb0/o;->u:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, Lm0/s;->m(I)I

    move-result v15

    move-object/from16 p1, v1

    iget v1, v0, Lb0/o;->v:I

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v16

    iget v1, v0, Lb0/o;->w:I

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, Lm9/e0;->f(Lb0/h0;Ly0/o;Ly/t0;Lb0/j;IFLy0/c;Lw/h;ZZLc9/c;Ln1/a;Lc9/g;Lm0/m;III)V

    sget-object v1, Lq8/l;->a:Lq8/l;

    return-object v1
.end method
