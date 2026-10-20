.class public final Lh0/e;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ly0/o;Lc9/a;ZI)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/e;->a:I

    iput-object p1, p0, Lh0/e;->d:Ljava/lang/Object;

    iput-object p2, p0, Lh0/e;->e:Ljava/lang/Object;

    iput-boolean p3, p0, Lh0/e;->b:Z

    iput p4, p0, Lh0/e;->c:I

    const/4 p1, 0x2

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ZLl2/h;Lh0/v0;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/e;->a:I

    iput-boolean p1, p0, Lh0/e;->b:Z

    iput-object p2, p0, Lh0/e;->d:Ljava/lang/Object;

    iput-object p3, p0, Lh0/e;->e:Ljava/lang/Object;

    iput p4, p0, Lh0/e;->c:I

    const/4 p1, 0x2

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 4

    iget p2, p0, Lh0/e;->a:I

    iget-boolean v0, p0, Lh0/e;->b:Z

    iget v1, p0, Lh0/e;->c:I

    iget-object v2, p0, Lh0/e;->e:Ljava/lang/Object;

    iget-object v3, p0, Lh0/e;->d:Ljava/lang/Object;

    packed-switch p2, :pswitch_data_0

    check-cast v3, Ll2/h;

    check-cast v2, Lh0/v0;

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, v3, v2, p1, p2}, Ld7/t;->m(ZLl2/h;Lh0/v0;Lm0/m;I)V

    return-void

    :pswitch_0
    check-cast v3, Ly0/o;

    check-cast v2, Lc9/a;

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v3, v2, v0, p1, p2}, Ld7/t;->i(Ly0/o;Lc9/a;ZLm0/m;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lh0/e;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh0/e;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh0/e;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
