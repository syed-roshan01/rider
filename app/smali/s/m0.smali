.class public final Ls/m0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JJLjava/lang/Object;I)V
    .locals 0

    iput p7, p0, Ls/m0;->a:I

    iput-object p1, p0, Ls/m0;->d:Ljava/lang/Object;

    iput-wide p2, p0, Ls/m0;->b:J

    iput-wide p4, p0, Ls/m0;->c:J

    iput-object p6, p0, Ls/m0;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Ls/m0;->a:I

    iget-object v2, p0, Ls/m0;->e:Ljava/lang/Object;

    iget-object v3, p0, Ls/m0;->d:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lg1/e;

    move-object v4, p1

    check-cast v4, Lt1/i0;

    invoke-virtual {v4}, Lt1/i0;->a()V

    move-object v5, v3

    check-cast v5, Le1/n;

    iget-wide v6, p0, Ls/m0;->b:J

    iget-wide v8, p0, Ls/m0;->c:J

    const/4 v10, 0x0

    move-object v11, v2

    check-cast v11, Lg1/h;

    const/16 v12, 0x68

    invoke-static/range {v4 .. v12}, Lg1/g;->Y(Lg1/g;Le1/n;JJFLg1/h;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lr1/w0;

    check-cast v3, Lr1/x0;

    sget v1, Lm2/i;->c:I

    iget-wide v4, p0, Ls/m0;->b:J

    const/16 v1, 0x20

    shr-long v6, v4, v1

    long-to-int v6, v6

    iget-wide v7, p0, Ls/m0;->c:J

    shr-long v9, v7, v1

    long-to-int v1, v9

    add-int/2addr v6, v1

    const-wide v9, 0xffffffffL

    and-long/2addr v4, v9

    long-to-int v1, v4

    and-long v4, v7, v9

    long-to-int v4, v4

    add-int/2addr v1, v4

    check-cast v2, Lc9/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-static {v3, v6, v1, p1, v2}, Lr1/w0;->j(Lr1/x0;IIFLc9/c;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
