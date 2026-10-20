.class public final Lb0/b;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Ly0/o;

.field public final synthetic b:Lb0/h0;

.field public final synthetic c:Ly/t0;

.field public final synthetic d:Z

.field public final synthetic e:Lv/h1;

.field public final synthetic f:Lw/h;

.field public final synthetic n:Z

.field public final synthetic o:I

.field public final synthetic p:F

.field public final synthetic q:Lb0/j;

.field public final synthetic r:Ln1/a;

.field public final synthetic s:Lc9/c;

.field public final synthetic t:Ly0/b;

.field public final synthetic u:Ly0/c;

.field public final synthetic v:Lc9/g;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I


# direct methods
.method public constructor <init>(Ly0/o;Lb0/h0;Ly/t0;ZLv/h1;Lw/h;ZIFLb0/j;Ln1/a;Lc9/c;Ly0/b;Ly0/c;Lc9/g;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Lb0/b;->a:Ly0/o;

    move-object v1, p2

    iput-object v1, v0, Lb0/b;->b:Lb0/h0;

    move-object v1, p3

    iput-object v1, v0, Lb0/b;->c:Ly/t0;

    move v1, p4

    iput-boolean v1, v0, Lb0/b;->d:Z

    move-object v1, p5

    iput-object v1, v0, Lb0/b;->e:Lv/h1;

    move-object v1, p6

    iput-object v1, v0, Lb0/b;->f:Lw/h;

    move v1, p7

    iput-boolean v1, v0, Lb0/b;->n:Z

    move v1, p8

    iput v1, v0, Lb0/b;->o:I

    move v1, p9

    iput v1, v0, Lb0/b;->p:F

    move-object v1, p10

    iput-object v1, v0, Lb0/b;->q:Lb0/j;

    move-object v1, p11

    iput-object v1, v0, Lb0/b;->r:Ln1/a;

    move-object v1, p12

    iput-object v1, v0, Lb0/b;->s:Lc9/c;

    move-object v1, p13

    iput-object v1, v0, Lb0/b;->t:Ly0/b;

    move-object/from16 v1, p14

    iput-object v1, v0, Lb0/b;->u:Ly0/c;

    move-object/from16 v1, p15

    iput-object v1, v0, Lb0/b;->v:Lc9/g;

    move/from16 v1, p16

    iput v1, v0, Lb0/b;->w:I

    move/from16 v1, p17

    iput v1, v0, Lb0/b;->x:I

    move/from16 v1, p18

    iput v1, v0, Lb0/b;->y:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v16, p1

    check-cast v16, Lm0/m;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    iget-object v1, v0, Lb0/b;->a:Ly0/o;

    iget-object v2, v0, Lb0/b;->b:Lb0/h0;

    iget-object v3, v0, Lb0/b;->c:Ly/t0;

    iget-boolean v4, v0, Lb0/b;->d:Z

    iget-object v5, v0, Lb0/b;->e:Lv/h1;

    iget-object v6, v0, Lb0/b;->f:Lw/h;

    iget-boolean v7, v0, Lb0/b;->n:Z

    iget v8, v0, Lb0/b;->o:I

    iget v9, v0, Lb0/b;->p:F

    iget-object v10, v0, Lb0/b;->q:Lb0/j;

    iget-object v11, v0, Lb0/b;->r:Ln1/a;

    iget-object v12, v0, Lb0/b;->s:Lc9/c;

    iget-object v13, v0, Lb0/b;->t:Ly0/b;

    iget-object v14, v0, Lb0/b;->u:Ly0/c;

    iget-object v15, v0, Lb0/b;->v:Lc9/g;

    move-object/from16 p1, v1

    iget v1, v0, Lb0/b;->w:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v17

    iget v1, v0, Lb0/b;->x:I

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v18

    iget v1, v0, Lb0/b;->y:I

    move/from16 v19, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v19}, Ld7/t;->g(Ly0/o;Lb0/h0;Ly/t0;ZLv/h1;Lw/h;ZIFLb0/j;Ln1/a;Lc9/c;Ly0/b;Ly0/c;Lc9/g;Lm0/m;III)V

    sget-object v1, Lq8/l;->a:Lq8/l;

    return-object v1
.end method
