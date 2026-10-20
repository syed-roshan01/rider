.class public final Lk9/h;
.super Ljava/lang/Object;

# interfaces
.implements Lk9/i;


# instance fields
.field public final synthetic a:I

.field public final b:Lc9/c;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lk9/i;Lc9/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lk9/h;->a:I

    iput-object p1, p0, Lk9/h;->c:Ljava/lang/Object;

    iput-object p2, p0, Lk9/h;->b:Lc9/c;

    return-void
.end method

.method public constructor <init>(Lu1/z0;Lc9/c;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lk9/h;->a:I

    iput-object p1, p0, Lk9/h;->c:Ljava/lang/Object;

    iput-object p2, p0, Lk9/h;->b:Lc9/c;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget v0, p0, Lk9/h;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lk9/o;

    invoke-direct {v0, p0}, Lk9/o;-><init>(Lk9/h;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lk9/g;

    invoke-direct {v0, p0}, Lk9/g;-><init>(Lk9/h;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
