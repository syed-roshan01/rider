.class public final Lk0/s;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 3

    iput p2, p0, Lk0/s;->a:I

    iput-object p1, p0, Lk0/s;->b:Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, La8/ۡۦۨۡ;->ۣ۠۠ۦ()I

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
    const-string v0, "gOmScKANdmaclFr3lR"

    invoke-static {v0}, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->ۢۦۥ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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
    .locals 5

    invoke-static {p0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۦۣۢۡ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۧۥۥۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ly1/v;

    new-instance v1, Ly1/f;

    check-cast v0, Lc9/a;

    invoke-static {v0}, Le2/۟۟ۥۦ;->ۨۧۧۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۡۧۦۡ(Ljava/lang/Object;)F

    move-result v0

    new-instance v2, Li9/d;

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v2, v3, v4}, Li9/d;-><init>(FF)V

    invoke-direct {v1, v0, v2}, Ly1/f;-><init>(FLi9/d;)V

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۨ۟ۦ()[Lj9/f;

    invoke-static {}, Lcom/google/firebase/measurement/ۢۥۤۦ;->۟۟ۡ۠۟()Ly1/u;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۨ۟ۦ()[Lj9/f;

    move-result-object v2

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-static {v0, p1, v1}, Ldagger/hilt/ۣ۟ۧۤ۠;->۟۠ۦ۠ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-static {p1}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۡۧۦۡ(Ljava/lang/Object;)F

    invoke-static {v0}, Ln7/۟ۤ۠۟ۥ;->۠ۧۤۥ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
