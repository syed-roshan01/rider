.class public final Lo1/n;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ld9/u;


# direct methods
.method public synthetic constructor <init>(ILd9/u;)V
    .locals 0

    iput p1, p0, Lo1/n;->a:I

    iput-object p2, p0, Lo1/n;->b:Ld9/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo1/o;)Ljava/lang/Boolean;
    .locals 3

    iget v0, p0, Lo1/n;->a:I

    iget-object v1, p0, Lo1/n;->b:Ld9/u;

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p1, Lo1/o;->v:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lo1/o;->w:Z

    if-eqz v0, :cond_0

    iput-object p1, v1, Ld9/u;->a:Ljava/lang/Object;

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_0
    iget-object v0, v1, Ld9/u;->a:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-boolean v2, p1, Lo1/o;->w:Z

    if-eqz v2, :cond_1

    iput-object p1, v1, Ld9/u;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lo1/o;->v:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lo1/o;->w:Z

    if-eqz v0, :cond_2

    iput-object p1, v1, Ld9/u;->a:Ljava/lang/Object;

    :cond_2
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lo1/n;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lo1/o;

    invoke-virtual {p0, p1}, Lo1/n;->a(Lo1/o;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lo1/o;

    sget-object v0, Lt1/t1;->a:Lt1/t1;

    iget-boolean v1, p1, Lo1/o;->w:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lo1/n;->b:Ld9/u;

    iput-object p1, v1, Ld9/u;->a:Ljava/lang/Object;

    iget-boolean p1, p1, Lo1/o;->v:Z

    if-eqz p1, :cond_0

    sget-object v0, Lt1/t1;->b:Lt1/t1;

    :cond_0
    return-object v0

    :pswitch_1
    check-cast p1, Lo1/o;

    invoke-virtual {p0, p1}, Lo1/n;->a(Lo1/o;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
