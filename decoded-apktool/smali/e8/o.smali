.class public final Le8/o;
.super Ljava/lang/Object;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Le8/h;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Le8/o;->a:I

    const-string v0, "callOptions"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Le8/o;->b:Ljava/lang/Object;

    iput p2, p0, Le8/o;->c:I

    iput-boolean p3, p0, Le8/o;->d:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Le8/o;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget-object v1, p0, Le8/o;->b:Ljava/lang/Object;

    check-cast v1, Le8/h;

    const-string v2, "callOptions"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, Le8/o;->c:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "previousAttempts"

    invoke-virtual {v0, v1, v2}, Lq6/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "isTransparentRetry"

    iget-boolean v2, p0, Le8/o;->d:Z

    invoke-virtual {v0, v1, v2}, Lq6/g;->c(Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
