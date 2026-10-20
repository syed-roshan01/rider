.class public final Lk0/t2;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:I

.field public final b:Lk0/x2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lk0/x2;I)V
    .locals 2

    iput p2, p0, Lk0/t2;->a:I

    iput-object p1, p0, Lk0/t2;->b:Lk0/x2;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lz8/ۣۤۡۧ;->۟ۧۤۤۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "Sy1Kz1FLjPwZDCQOKqLOd64U43y9P"

    invoke-static {v0}, Lx7/۟ۤۡ۟ۦ;->۟ۤۦۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {p0}, Lb1/۟ۥۥ۟ۢ;->۟ۦۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۣ۟ۥۡ(Ljava/lang/Object;)Lk0/x2;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lk0/z0;

    invoke-static {p1}, Landroidx/activity/ۣۧۧۢ;->ۥۧۧۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Ly1/v;

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۨ۟ۦ()[Lj9/f;

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->۠ۦ۠ۦ()Ly1/u;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۨ۟ۦ()[Lj9/f;

    move-result-object v2

    const/4 v3, 0x3

    aget-object v2, v2, v3

    new-instance v2, Ly1/e;

    invoke-direct {v2}, Ly1/e;-><init>()V

    invoke-static {v0, p1, v2}, Ldagger/hilt/ۣ۟ۧۤ۠;->۟۠ۦ۠ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lk0/s2;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk0/s2;-><init>(Lk0/x2;I)V

    invoke-static {}, Lr7/۟۟ۡ۟ۢ;->ۧۡۥۨ()Ly1/u;

    move-result-object v1

    new-instance v2, Ly1/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    check-cast p1, Ly1/j;

    invoke-static {p1, v1, v2}, Lz8/ۣۤۡۧ;->۟ۤۤ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
