.class public final Lb0/v;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La0/w;

.field public final synthetic c:J

.field public final synthetic d:Lb0/t;

.field public final synthetic e:J

.field public final synthetic f:Lv/h1;

.field public final synthetic n:Ly0/b;

.field public final synthetic o:Ly0/c;

.field public final synthetic p:Z

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(La0/w;JLb0/t;JLv/h1;Ly0/b;Ly0/c;ZII)V
    .locals 0

    iput p12, p0, Lb0/v;->a:I

    iput-object p1, p0, Lb0/v;->b:La0/w;

    iput-wide p2, p0, Lb0/v;->c:J

    iput-object p4, p0, Lb0/v;->d:Lb0/t;

    iput-wide p5, p0, Lb0/v;->e:J

    iput-object p7, p0, Lb0/v;->f:Lv/h1;

    iput-object p8, p0, Lb0/v;->n:Ly0/b;

    iput-object p9, p0, Lb0/v;->o:Ly0/c;

    iput-boolean p10, p0, Lb0/v;->p:Z

    iput p11, p0, Lb0/v;->q:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Lb0/g;
    .locals 14

    iget v0, p0, Lb0/v;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v1, p0, Lb0/v;->b:La0/w;

    iget-wide v3, p0, Lb0/v;->c:J

    iget-object v5, p0, Lb0/v;->d:Lb0/t;

    iget-wide v6, p0, Lb0/v;->e:J

    iget-object v8, p0, Lb0/v;->f:Lv/h1;

    iget-object v9, p0, Lb0/v;->n:Ly0/b;

    iget-object v10, p0, Lb0/v;->o:Ly0/c;

    move-object v0, v1

    check-cast v0, La0/x;

    iget-object v0, v0, La0/x;->b:Lr1/i1;

    invoke-interface {v0}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v11

    iget-boolean v12, p0, Lb0/v;->p:Z

    iget v13, p0, Lb0/v;->q:I

    move v2, p1

    invoke-static/range {v1 .. v13}, Lo7/d0;->y(La0/w;IJLb0/t;JLv/h1;Ly0/b;Ly0/c;Lm2/l;ZI)Lb0/g;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb0/v;->b:La0/w;

    iget-wide v2, p0, Lb0/v;->c:J

    iget-object v4, p0, Lb0/v;->d:Lb0/t;

    iget-wide v5, p0, Lb0/v;->e:J

    iget-object v7, p0, Lb0/v;->f:Lv/h1;

    iget-object v8, p0, Lb0/v;->n:Ly0/b;

    iget-object v9, p0, Lb0/v;->o:Ly0/c;

    move-object v1, v0

    check-cast v1, La0/x;

    iget-object v1, v1, La0/x;->b:Lr1/i1;

    invoke-interface {v1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v10

    iget-boolean v11, p0, Lb0/v;->p:Z

    iget v12, p0, Lb0/v;->q:I

    move v1, p1

    invoke-static/range {v0 .. v12}, Lo7/d0;->y(La0/w;IJLb0/t;JLv/h1;Ly0/b;Ly0/c;Lm2/l;ZI)Lb0/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb0/v;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lb0/v;->a(I)Lb0/g;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lb0/v;->a(I)Lb0/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
