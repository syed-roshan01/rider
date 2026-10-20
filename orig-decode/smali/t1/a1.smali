.class public final Lt1/a1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:Lt1/c1;

.field public final synthetic b:Ly0/n;

.field public final synthetic c:Lt1/z0;

.field public final synthetic d:J

.field public final synthetic e:Lt1/v;

.field public final synthetic f:Z

.field public final synthetic n:Z


# direct methods
.method public constructor <init>(Lt1/c1;Ly0/n;Lt1/z0;JLt1/v;ZZ)V
    .locals 0

    iput-object p1, p0, Lt1/a1;->a:Lt1/c1;

    iput-object p2, p0, Lt1/a1;->b:Ly0/n;

    iput-object p3, p0, Lt1/a1;->c:Lt1/z0;

    iput-wide p4, p0, Lt1/a1;->d:J

    iput-object p6, p0, Lt1/a1;->e:Lt1/v;

    iput-boolean p7, p0, Lt1/a1;->f:Z

    iput-boolean p8, p0, Lt1/a1;->n:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    iget-object v1, p0, Lt1/a1;->a:Lt1/c1;

    iget-object v0, p0, Lt1/a1;->c:Lt1/z0;

    check-cast v0, Lx9/v;

    iget v0, v0, Lx9/v;->a:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x8

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x10

    :goto_0
    iget-object v2, p0, Lt1/a1;->b:Ly0/n;

    invoke-static {v2, v0}, Lt1/g;->e(Lt1/n;I)Ly0/n;

    move-result-object v9

    iget-object v3, p0, Lt1/a1;->c:Lt1/z0;

    iget-wide v4, p0, Lt1/a1;->d:J

    iget-object v10, p0, Lt1/a1;->e:Lt1/v;

    iget-boolean v7, p0, Lt1/a1;->f:Z

    iget-boolean v11, p0, Lt1/a1;->n:Z

    if-nez v9, :cond_0

    move-object v0, v1

    move-object v1, v3

    move-wide v2, v4

    move-object v4, v10

    move v5, v7

    move v6, v11

    invoke-virtual/range {v0 .. v6}, Lt1/c1;->O0(Lt1/z0;JLt1/v;ZZ)V

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v12, Lt1/a1;

    move-object v0, v12

    move-object v2, v9

    move-object v6, v10

    move v8, v11

    invoke-direct/range {v0 .. v8}, Lt1/a1;-><init>(Lt1/c1;Ly0/n;Lt1/z0;JLt1/v;ZZ)V

    const/high16 v0, -0x40800000    # -1.0f

    invoke-virtual {v10, v9, v0, v11, v12}, Lt1/v;->i(Ly0/n;FZLc9/a;)V

    :goto_1
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
