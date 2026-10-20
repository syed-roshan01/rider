.class public final Lv/w0;
.super Lv/j;


# instance fields
.field public K:Lv/x0;

.field public L:Lv/h1;

.field public M:Lv/k0;

.field public final N:Lv/u0;

.field public final O:Lv/d0;


# direct methods
.method public constructor <init>(Lv/x0;Lv/q0;Lv/h1;ZLx/m;Lc9/a;Lc9/f;Lc9/f;Z)V
    .locals 10

    move-object v8, p0

    move-object v9, p3

    move-object v0, p0

    move-object v1, p2

    move v2, p4

    move-object v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move/from16 v7, p9

    invoke-direct/range {v0 .. v7}, Lv/j;-><init>(Lv/q0;ZLx/m;Lc9/a;Lc9/f;Lc9/f;Z)V

    move-object v0, p1

    iput-object v0, v8, Lv/w0;->K:Lv/x0;

    iput-object v9, v8, Lv/w0;->L:Lv/h1;

    sget-object v0, Lv/t0;->a:Lv/l0;

    iput-object v0, v8, Lv/w0;->M:Lv/k0;

    new-instance v0, Lv/u0;

    invoke-direct {v0, p0}, Lv/u0;-><init>(Lv/w0;)V

    iput-object v0, v8, Lv/w0;->N:Lv/u0;

    sget-object v0, Lv/h1;->a:Lv/h1;

    if-ne v9, v0, :cond_0

    sget-object v0, Lv/j0;->b:Lv/d0;

    goto :goto_0

    :cond_0
    sget-object v0, Lv/j0;->a:Lv/d0;

    :goto_0
    iput-object v0, v8, Lv/w0;->O:Lv/d0;

    return-void
.end method


# virtual methods
.method public final L0(Lv/x0;Lv/q0;Lv/h1;ZLx/m;Lc9/a;Lc9/f;Lc9/f;Z)V
    .locals 2

    iget-object v0, p0, Lv/w0;->K:Lv/x0;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-object p1, p0, Lv/w0;->K:Lv/x0;

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p2, p0, Lv/j;->w:Lc9/c;

    iget-object p2, p0, Lv/w0;->L:Lv/h1;

    if-eq p2, p3, :cond_1

    iput-object p3, p0, Lv/w0;->L:Lv/h1;

    move p1, v1

    :cond_1
    iget-boolean p2, p0, Lv/j;->x:Z

    if-eq p2, p4, :cond_2

    iput-boolean p4, p0, Lv/j;->x:Z

    if-nez p4, :cond_3

    invoke-virtual {p0}, Lv/j;->K0()V

    goto :goto_1

    :cond_2
    move v1, p1

    :cond_3
    :goto_1
    iget-object p1, p0, Lv/j;->y:Lx/m;

    invoke-static {p1, p5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lv/j;->K0()V

    iput-object p5, p0, Lv/j;->y:Lx/m;

    :cond_4
    iput-object p6, p0, Lv/j;->z:Lc9/a;

    iput-object p7, p0, Lv/j;->A:Lc9/f;

    iput-object p8, p0, Lv/j;->B:Lc9/f;

    iget-boolean p1, p0, Lv/j;->C:Z

    if-eq p1, p9, :cond_5

    iput-boolean p9, p0, Lv/j;->C:Z

    goto :goto_2

    :cond_5
    if-eqz v1, :cond_6

    :goto_2
    iget-object p1, p0, Lv/j;->H:Lo1/d0;

    check-cast p1, Lo1/j0;

    invoke-virtual {p1}, Lo1/j0;->I0()V

    :cond_6
    return-void
.end method
