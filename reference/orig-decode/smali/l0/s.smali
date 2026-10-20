.class public abstract Ll0/s;
.super Ljava/lang/Object;


# static fields
.field public static final A:J

.field public static final B:J

.field public static final C:J

.field public static final D:Lf2/l;

.field public static final E:Lf2/m;

.field public static final F:J

.field public static final G:J

.field public static final H:J

.field public static final I:Lf2/l;

.field public static final J:Lf2/m;

.field public static final K:J

.field public static final L:J

.field public static final M:J

.field public static final N:Lf2/l;

.field public static final O:Lf2/m;

.field public static final P:J

.field public static final Q:J

.field public static final R:J

.field public static final S:Lf2/l;

.field public static final T:Lf2/m;

.field public static final U:J

.field public static final V:J

.field public static final W:J

.field public static final X:Lf2/l;

.field public static final Y:Lf2/m;

.field public static final Z:J

.field public static final a:Lf2/m;

.field public static final a0:J

.field public static final b:J

.field public static final b0:J

.field public static final c:J

.field public static final c0:Lf2/l;

.field public static final d:J

.field public static final d0:Lf2/m;

.field public static final e:Lf2/l;

.field public static final e0:J

.field public static final f:Lf2/m;

.field public static final f0:J

.field public static final g:J

.field public static final g0:J

.field public static final h:J

.field public static final h0:Lf2/l;

.field public static final i:J

.field public static final i0:Lf2/m;

.field public static final j:Lf2/l;

.field public static final j0:J

.field public static final k:Lf2/m;

.field public static final k0:J

.field public static final l:J

.field public static final l0:J

.field public static final m:J

.field public static final m0:Lf2/l;

.field public static final n:J

.field public static final n0:Lf2/m;

.field public static final o:Lf2/l;

.field public static final o0:J

.field public static final p:Lf2/m;

.field public static final p0:J

.field public static final q:J

.field public static final q0:J

.field public static final r:J

.field public static final r0:Lf2/l;

.field public static final s:J

.field public static final s0:Lf2/m;

.field public static final t:Lf2/l;

.field public static final t0:J

.field public static final u:Lf2/m;

.field public static final u0:J

.field public static final v:J

.field public static final v0:J

.field public static final w:J

.field public static final w0:Lf2/l;

.field public static final x:J

.field public static final y:Lf2/l;

.field public static final z:Lf2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    sget-object v0, Ll0/t;->a:Lf2/l;

    sget-object v0, Lf2/e;->b:Lf2/m;

    sput-object v0, Ll0/s;->a:Lf2/m;

    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    invoke-static {v1, v2}, Lo1/s;->M(D)J

    move-result-wide v3

    sput-wide v3, Ll0/s;->b:J

    const/16 v3, 0x10

    invoke-static {v3}, Lo1/s;->N(I)J

    move-result-wide v4

    sput-wide v4, Ll0/s;->c:J

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    invoke-static {v4, v5}, Lo1/s;->M(D)J

    move-result-wide v6

    sput-wide v6, Ll0/s;->d:J

    sget-object v6, Ll0/t;->b:Lf2/l;

    sput-object v6, Ll0/s;->e:Lf2/l;

    sput-object v0, Ll0/s;->f:Lf2/m;

    const-wide/high16 v7, 0x4034000000000000L    # 20.0

    invoke-static {v7, v8}, Lo1/s;->M(D)J

    move-result-wide v9

    sput-wide v9, Ll0/s;->g:J

    const/16 v9, 0xe

    invoke-static {v9}, Lo1/s;->N(I)J

    move-result-wide v10

    sput-wide v10, Ll0/s;->h:J

    const-wide v10, 0x3fc999999999999aL    # 0.2

    invoke-static {v10, v11}, Lo1/s;->M(D)J

    move-result-wide v12

    sput-wide v12, Ll0/s;->i:J

    sput-object v6, Ll0/s;->j:Lf2/l;

    sput-object v0, Ll0/s;->k:Lf2/m;

    const-wide/high16 v12, 0x4030000000000000L    # 16.0

    invoke-static {v12, v13}, Lo1/s;->M(D)J

    move-result-wide v14

    sput-wide v14, Ll0/s;->l:J

    const/16 v14, 0xc

    invoke-static {v14}, Lo1/s;->N(I)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->m:J

    const-wide v15, 0x3fd999999999999aL    # 0.4

    invoke-static/range {v15 .. v16}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->n:J

    sput-object v6, Ll0/s;->o:Lf2/l;

    sput-object v0, Ll0/s;->p:Lf2/m;

    const-wide/high16 v15, 0x4050000000000000L    # 64.0

    invoke-static/range {v15 .. v16}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->q:J

    const/16 v15, 0x39

    invoke-static {v15}, Lo1/s;->N(I)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->r:J

    invoke-static {v10, v11}, Lo1/s;->M(D)J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Lo1/s;->V(J)Z

    move-result v17

    xor-int/lit8 v17, v17, 0x1

    if-eqz v17, :cond_0

    const-wide v17, 0xff00000000L

    and-long v10, v15, v17

    invoke-static/range {v15 .. v16}, Lm2/n;->c(J)F

    move-result v15

    neg-float v15, v15

    invoke-static {v15, v10, v11}, Lo1/s;->c0(FJ)J

    move-result-wide v10

    sput-wide v10, Ll0/s;->s:J

    sput-object v6, Ll0/s;->t:Lf2/l;

    sput-object v0, Ll0/s;->u:Lf2/m;

    const-wide/high16 v10, 0x404a000000000000L    # 52.0

    invoke-static {v10, v11}, Lo1/s;->M(D)J

    move-result-wide v10

    sput-wide v10, Ll0/s;->v:J

    const/16 v10, 0x2d

    invoke-static {v10}, Lo1/s;->N(I)J

    move-result-wide v10

    sput-wide v10, Ll0/s;->w:J

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->x:J

    sput-object v6, Ll0/s;->y:Lf2/l;

    sput-object v0, Ll0/s;->z:Lf2/m;

    const-wide/high16 v15, 0x4046000000000000L    # 44.0

    invoke-static/range {v15 .. v16}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->A:J

    const/16 v15, 0x24

    invoke-static {v15}, Lo1/s;->N(I)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->B:J

    invoke-static {v10, v11}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->C:J

    sput-object v6, Ll0/s;->D:Lf2/l;

    sput-object v0, Ll0/s;->E:Lf2/m;

    const-wide/high16 v15, 0x4044000000000000L    # 40.0

    invoke-static/range {v15 .. v16}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->F:J

    const/16 v15, 0x20

    invoke-static {v15}, Lo1/s;->N(I)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->G:J

    invoke-static {v10, v11}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->H:J

    sput-object v6, Ll0/s;->I:Lf2/l;

    sput-object v0, Ll0/s;->J:Lf2/m;

    const-wide/high16 v15, 0x4042000000000000L    # 36.0

    invoke-static/range {v15 .. v16}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->K:J

    const/16 v15, 0x1c

    invoke-static {v15}, Lo1/s;->N(I)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->L:J

    invoke-static {v10, v11}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->M:J

    sput-object v6, Ll0/s;->N:Lf2/l;

    sput-object v0, Ll0/s;->O:Lf2/m;

    const-wide/high16 v15, 0x4040000000000000L    # 32.0

    invoke-static/range {v15 .. v16}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->P:J

    const/16 v15, 0x18

    invoke-static {v15}, Lo1/s;->N(I)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->Q:J

    invoke-static {v10, v11}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->R:J

    sput-object v6, Ll0/s;->S:Lf2/l;

    sput-object v0, Ll0/s;->T:Lf2/m;

    invoke-static {v7, v8}, Lo1/s;->M(D)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->U:J

    invoke-static {v9}, Lo1/s;->N(I)J

    move-result-wide v15

    sput-wide v15, Ll0/s;->V:J

    const-wide v15, 0x3fb999999999999aL    # 0.1

    invoke-static/range {v15 .. v16}, Lo1/s;->M(D)J

    move-result-wide v17

    sput-wide v17, Ll0/s;->W:J

    sget-object v17, Ll0/t;->a:Lf2/l;

    sput-object v17, Ll0/s;->X:Lf2/l;

    sput-object v0, Ll0/s;->Y:Lf2/m;

    invoke-static {v12, v13}, Lo1/s;->M(D)J

    move-result-wide v19

    sput-wide v19, Ll0/s;->Z:J

    invoke-static {v14}, Lo1/s;->N(I)J

    move-result-wide v19

    sput-wide v19, Ll0/s;->a0:J

    invoke-static {v4, v5}, Lo1/s;->M(D)J

    move-result-wide v19

    sput-wide v19, Ll0/s;->b0:J

    sput-object v17, Ll0/s;->c0:Lf2/l;

    sput-object v0, Ll0/s;->d0:Lf2/m;

    invoke-static {v12, v13}, Lo1/s;->M(D)J

    move-result-wide v12

    sput-wide v12, Ll0/s;->e0:J

    const/16 v12, 0xb

    invoke-static {v12}, Lo1/s;->N(I)J

    move-result-wide v12

    sput-wide v12, Ll0/s;->f0:J

    invoke-static {v4, v5}, Lo1/s;->M(D)J

    move-result-wide v4

    sput-wide v4, Ll0/s;->g0:J

    sput-object v17, Ll0/s;->h0:Lf2/l;

    sput-object v0, Ll0/s;->i0:Lf2/m;

    const-wide/high16 v4, 0x403c000000000000L    # 28.0

    invoke-static {v4, v5}, Lo1/s;->M(D)J

    move-result-wide v4

    sput-wide v4, Ll0/s;->j0:J

    const/16 v4, 0x16

    invoke-static {v4}, Lo1/s;->N(I)J

    move-result-wide v4

    sput-wide v4, Ll0/s;->k0:J

    invoke-static {v10, v11}, Lo1/s;->M(D)J

    move-result-wide v4

    sput-wide v4, Ll0/s;->l0:J

    sput-object v6, Ll0/s;->m0:Lf2/l;

    sput-object v0, Ll0/s;->n0:Lf2/m;

    invoke-static {v1, v2}, Lo1/s;->M(D)J

    move-result-wide v1

    sput-wide v1, Ll0/s;->o0:J

    invoke-static {v3}, Lo1/s;->N(I)J

    move-result-wide v1

    sput-wide v1, Ll0/s;->p0:J

    const-wide v1, 0x3fc999999999999aL    # 0.2

    invoke-static {v1, v2}, Lo1/s;->M(D)J

    move-result-wide v1

    sput-wide v1, Ll0/s;->q0:J

    sput-object v17, Ll0/s;->r0:Lf2/l;

    sput-object v0, Ll0/s;->s0:Lf2/m;

    invoke-static {v7, v8}, Lo1/s;->M(D)J

    move-result-wide v0

    sput-wide v0, Ll0/s;->t0:J

    invoke-static {v9}, Lo1/s;->N(I)J

    move-result-wide v0

    sput-wide v0, Ll0/s;->u0:J

    invoke-static/range {v15 .. v16}, Lo1/s;->M(D)J

    move-result-wide v0

    sput-wide v0, Ll0/s;->v0:J

    sput-object v17, Ll0/s;->w0:Lf2/l;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot perform operation for Unspecified type."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
