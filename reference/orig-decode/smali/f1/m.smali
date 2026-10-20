.class public final synthetic Lf1/m;
.super Ljava/lang/Object;

# interfaces
.implements Lf1/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf1/q;


# direct methods
.method public synthetic constructor <init>(Lf1/q;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lf1/m;->a:I

    iput-object p1, p0, Lf1/m;->b:Lf1/q;

    return-void
.end method


# virtual methods
.method public final b(D)D
    .locals 9

    iget v0, p0, Lf1/m;->a:I

    iget-object v1, p0, Lf1/m;->b:Lf1/q;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lf1/q;->n:Lf1/i;

    iget v2, v1, Lf1/q;->e:F

    float-to-double v5, v2

    iget v1, v1, Lf1/q;->f:F

    float-to-double v7, v1

    move-wide v3, p1

    invoke-static/range {v3 .. v8}, Lz6/a;->p(DDD)D

    move-result-wide p1

    invoke-interface {v0, p1, p2}, Lf1/i;->b(D)D

    move-result-wide p1

    return-wide p1

    :pswitch_0
    iget-object v0, v1, Lf1/q;->k:Lf1/i;

    invoke-interface {v0, p1, p2}, Lf1/i;->b(D)D

    move-result-wide v2

    iget p1, v1, Lf1/q;->e:F

    float-to-double v4, p1

    iget p1, v1, Lf1/q;->f:F

    float-to-double v6, p1

    invoke-static/range {v2 .. v7}, Lz6/a;->p(DDD)D

    move-result-wide p1

    return-wide p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
