.class public final Lb5/l;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lb5/l;

.field public static final c:Lb5/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lb5/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb5/l;-><init>(I)V

    sput-object v0, Lb5/l;->b:Lb5/l;

    new-instance v0, Lb5/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb5/l;-><init>(I)V

    sput-object v0, Lb5/l;->c:Lb5/l;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb5/l;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "it"

    iget v1, p0, Lb5/l;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lq8/f;

    packed-switch v1, :pswitch_data_1

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lq8/f;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/CharSequence;

    goto :goto_0

    :pswitch_0
    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lq8/f;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/CharSequence;

    :goto_0
    return-object p1

    :pswitch_1
    check-cast p1, Lq8/f;

    packed-switch v1, :pswitch_data_2

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lq8/f;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/CharSequence;

    goto :goto_1

    :pswitch_2
    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lq8/f;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/CharSequence;

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
