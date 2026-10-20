.class public final Landroidx/fragment/app/a1;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/b1;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/a1;->a:I

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/x0;
    .locals 1

    iget p1, p0, Landroidx/fragment/app/a1;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lr3/b;

    invoke-direct {p1}, Lr3/b;-><init>()V

    return-object p1

    :pswitch_0
    new-instance p1, Landroidx/fragment/app/b1;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroidx/fragment/app/b1;-><init>(Z)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
