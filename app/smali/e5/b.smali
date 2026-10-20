.class public abstract Le5/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lk0/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 74

    sget-wide v39, Le5/a;->a:J

    sget-wide v47, Le5/a;->j:J

    sget-wide v5, Le5/a;->b:J

    sget-wide v11, Le5/a;->d:J

    sget-wide v15, Le5/a;->e:J

    sget-wide v27, Le5/a;->g:J

    sget-wide v29, Le5/a;->k:J

    sget-wide v31, Le5/a;->h:J

    sget-wide v33, Le5/a;->l:J

    sget-wide v35, Le5/a;->i:J

    sget-wide v37, Le5/a;->m:J

    sget-wide v45, Le5/a;->n:J

    sget-object v0, Lk0/k0;->a:Lm0/m3;

    sget-wide v7, Ll0/b;->f:J

    sget-wide v9, Ll0/b;->c:J

    sget-wide v17, Ll0/b;->g:J

    sget-wide v19, Ll0/b;->t:J

    sget-wide v21, Ll0/b;->h:J

    sget-wide v23, Ll0/b;->u:J

    sget-wide v25, Ll0/b;->i:J

    sget-wide v41, Ll0/b;->d:J

    sget-wide v43, Ll0/b;->b:J

    sget-wide v49, Ll0/b;->a:J

    sget-wide v51, Ll0/b;->e:J

    sget-wide v53, Ll0/b;->j:J

    sget-wide v55, Ll0/b;->k:J

    sget-wide v57, Ll0/b;->l:J

    sget-wide v59, Ll0/b;->m:J

    sget-wide v63, Ll0/b;->n:J

    sget-wide v65, Ll0/b;->o:J

    sget-wide v67, Ll0/b;->p:J

    sget-wide v69, Ll0/b;->q:J

    sget-wide v71, Ll0/b;->r:J

    sget-wide v61, Ll0/b;->s:J

    new-instance v73, Lk0/i0;

    move-object/from16 v0, v73

    move-wide/from16 v1, v39

    move-wide/from16 v3, v47

    move-wide/from16 v13, v47

    invoke-direct/range {v0 .. v72}, Lk0/i0;-><init>(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)V

    sput-object v73, Le5/b;->a:Lk0/i0;

    return-void
.end method

.method public static final a(Lc9/e;Lm0/m;I)V
    .locals 8

    const-string v0, "content"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm0/q;

    const v0, 0x2371304a

    invoke-virtual {p1, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p2, 0xe

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v2, v0, 0xb

    if-ne v2, v1, :cond_3

    invoke-virtual {p1}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lm0/q;->U()V

    goto :goto_3

    :cond_3
    :goto_2
    sget-object v1, Lu1/y0;->f:Lm0/m3;

    invoke-virtual {p1, v1}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    const v2, 0x37be5c32

    invoke-virtual {p1, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v2, Lu1/z0;

    const/16 v3, 0xc

    invoke-direct {v2, v1, v3}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, p1}, Lm0/s;->d(Lc9/a;Lm0/m;)V

    :cond_4
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    sget-object v1, Le5/b;->a:Lk0/i0;

    const/4 v2, 0x0

    new-instance v3, Lk0/e5;

    invoke-direct {v3}, Lk0/e5;-><init>()V

    shl-int/lit8 v0, v0, 0x9

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v6, v0, 0x186

    const/4 v7, 0x2

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lk0/t0;->a(Lk0/i0;Lk0/q2;Lk0/e5;Lc9/e;Lm0/m;II)V

    :goto_3
    invoke-virtual {p1}, Lm0/q;->x()Lm0/x1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Lt/o0;

    const/16 v1, 0xa

    invoke-direct {v0, p0, p2, v1}, Lt/o0;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lm0/x1;->d:Lc9/e;

    :cond_5
    return-void
.end method
