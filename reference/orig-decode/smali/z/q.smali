.class public final Lz/q;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Ly0/o;

.field public final synthetic b:Lz/g0;

.field public final synthetic c:Ly/t0;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lv/y0;

.field public final synthetic n:Z

.field public final synthetic o:I

.field public final synthetic p:Ly0/b;

.field public final synthetic q:Ly/i;

.field public final synthetic r:Ly0/c;

.field public final synthetic s:Ly/g;

.field public final synthetic t:Lc9/c;

.field public final synthetic u:I

.field public final synthetic v:I

.field public final synthetic w:I


# direct methods
.method public constructor <init>(Ly0/o;Lz/g0;Ly/t0;ZZLv/y0;ZILy0/b;Ly/i;Ly0/c;Ly/g;Lc9/c;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Lz/q;->a:Ly0/o;

    move-object v1, p2

    iput-object v1, v0, Lz/q;->b:Lz/g0;

    move-object v1, p3

    iput-object v1, v0, Lz/q;->c:Ly/t0;

    move v1, p4

    iput-boolean v1, v0, Lz/q;->d:Z

    move v1, p5

    iput-boolean v1, v0, Lz/q;->e:Z

    move-object v1, p6

    iput-object v1, v0, Lz/q;->f:Lv/y0;

    move v1, p7

    iput-boolean v1, v0, Lz/q;->n:Z

    move v1, p8

    iput v1, v0, Lz/q;->o:I

    move-object v1, p9

    iput-object v1, v0, Lz/q;->p:Ly0/b;

    move-object v1, p10

    iput-object v1, v0, Lz/q;->q:Ly/i;

    move-object v1, p11

    iput-object v1, v0, Lz/q;->r:Ly0/c;

    move-object v1, p12

    iput-object v1, v0, Lz/q;->s:Ly/g;

    move-object v1, p13

    iput-object v1, v0, Lz/q;->t:Lc9/c;

    move/from16 v1, p14

    iput v1, v0, Lz/q;->u:I

    move/from16 v1, p15

    iput v1, v0, Lz/q;->v:I

    move/from16 v1, p16

    iput v1, v0, Lz/q;->w:I

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

    iget-object v1, v0, Lz/q;->a:Ly0/o;

    iget-object v2, v0, Lz/q;->b:Lz/g0;

    iget-object v3, v0, Lz/q;->c:Ly/t0;

    iget-boolean v4, v0, Lz/q;->d:Z

    iget-boolean v5, v0, Lz/q;->e:Z

    iget-object v6, v0, Lz/q;->f:Lv/y0;

    iget-boolean v7, v0, Lz/q;->n:Z

    iget v8, v0, Lz/q;->o:I

    iget-object v9, v0, Lz/q;->p:Ly0/b;

    iget-object v10, v0, Lz/q;->q:Ly/i;

    iget-object v11, v0, Lz/q;->r:Ly0/c;

    iget-object v12, v0, Lz/q;->s:Ly/g;

    iget-object v13, v0, Lz/q;->t:Lc9/c;

    iget v15, v0, Lz/q;->u:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, Lm0/s;->m(I)I

    move-result v15

    move-object/from16 p1, v1

    iget v1, v0, Lz/q;->v:I

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v16

    iget v1, v0, Lz/q;->w:I

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, Ld9/i;->e(Ly0/o;Lz/g0;Ly/t0;ZZLv/y0;ZILy0/b;Ly/i;Ly0/c;Ly/g;Lc9/c;Lm0/m;III)V

    sget-object v1, Lq8/l;->a:Lq8/l;

    return-object v1
.end method
