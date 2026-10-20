.class public final Lg2/d;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lg2/d;

.field public static final c:Lg2/d;

.field public static final d:Lg2/d;

.field public static final e:Lg2/d;

.field public static final f:Lg2/d;

.field public static final n:Lg2/d;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lg2/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg2/d;-><init>(I)V

    sput-object v0, Lg2/d;->b:Lg2/d;

    new-instance v0, Lg2/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg2/d;-><init>(I)V

    sput-object v0, Lg2/d;->c:Lg2/d;

    new-instance v0, Lg2/d;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lg2/d;-><init>(I)V

    sput-object v0, Lg2/d;->d:Lg2/d;

    new-instance v0, Lg2/d;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lg2/d;-><init>(I)V

    sput-object v0, Lg2/d;->e:Lg2/d;

    new-instance v0, Lg2/d;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lg2/d;-><init>(I)V

    sput-object v0, Lg2/d;->f:Lg2/d;

    new-instance v0, Lg2/d;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lg2/d;-><init>(I)V

    sput-object v0, Lg2/d;->n:Lg2/d;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg2/d;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lg2/d;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lg2/n;

    iget p1, p1, Lg2/n;->a:I

    return-object v0

    :pswitch_0
    check-cast p1, Ljava/util/List;

    return-object v0

    :pswitch_1
    check-cast p1, Lg2/n;

    iget p1, p1, Lg2/n;->a:I

    return-object v0

    :pswitch_2
    check-cast p1, Ljava/util/List;

    return-object v0

    :pswitch_3
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    new-instance v0, Lg2/a0;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, La2/w;->a:Lv0/p;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    :cond_0
    move-object v1, v5

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_0

    iget-object v2, v2, Lv0/p;->b:Lc9/c;

    invoke-interface {v2, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La2/e;

    :goto_0
    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    sget v2, La2/b0;->c:I

    sget-object v2, La2/w;->m:Lv0/p;

    invoke-static {p1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    move-object p1, v5

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_2

    iget-object v2, v2, Lv0/p;->b:Lc9/c;

    invoke-interface {v2, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La2/b0;

    :goto_1
    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v2, p1, La2/b0;->a:J

    invoke-direct {v0, v1, v2, v3, v5}, Lg2/a0;-><init>(La2/e;JLa2/b0;)V

    return-object v0

    :pswitch_4
    check-cast p1, Le1/a0;

    iget-object p1, p1, Le1/a0;->a:[F

    return-object v0

    :pswitch_5
    check-cast p1, Le1/a0;

    iget-object p1, p1, Le1/a0;->a:[F

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
